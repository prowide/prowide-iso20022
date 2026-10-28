/*
 * Copyright 2006-2026 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.adapters.ElementJsonAdapter;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.annotation.XmlAnyElement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/**
 * Restores {@code @XmlAnyElement} wildcard content after JSON deserialization.
 *
 * <p>Wildcard fields declared as {@code Object} (for example {@code SupplementaryDataEnvelope1.any}) are
 * deserialized by Gson's built-in object adapter as the raw XML {@link String} produced by
 * {@link ElementJsonAdapter}, because the declared field type gives Gson no reason to route them to the
 * {@code Element} adapter. JAXB cannot marshal a {@code String} left in such a field, so the whole message
 * would fail to serialize. This utility walks the deserialized object graph and converts those encoded
 * strings back into {@link org.w3c.dom.Element} instances.
 *
 * <p>The same strings reach a message built from Prowide JSON by any reader other than
 * {@code AbstractMX.fromJson}, for example an application JSON mapper or a deep copy. The serialization
 * entry points therefore repair the message and retry once when marshalling fails, see
 * {@link #retryRepaired(Object, Marshalling)}.
 *
 * <p>Fields typed as {@code List<Element>} (for example {@code SwAny.any}) are deserialized correctly by
 * Gson on their own; this utility still repairs any string items defensively.
 *
 * @since 10.3.9
 */
final class WildcardElementRepair {

    private static final Logger log = Logger.getLogger(WildcardElementRepair.class.getName());
    private static final String MODEL_PACKAGE = "com.prowidesoftware.swift.model.mx";

    // Per-class cache of the instance fields to visit (flattened across the hierarchy, made accessible
    // once). Avoids repeated getDeclaredFields()/setAccessible() reflection on every deserialization.
    private static final Map<Class<?>, Field[]> FIELD_CACHE = new ConcurrentHashMap<>();

    private WildcardElementRepair() {}

    /**
     * Walks the given object graph restoring {@code @XmlAnyElement} string values into DOM elements.
     *
     * @param root the deserialized message (or any model object); null is ignored
     * @return true if at least one wildcard value was restored
     */
    static boolean repair(final Object root) {
        if (root == null) {
            return false;
        }
        return walk(root, Collections.newSetFromMap(new IdentityHashMap<>()));
    }

    /**
     * Runs a marshalling and, if it fails, repairs the wildcard content of the given root and runs it once more.
     *
     * <p>The repair only runs on the failure path, so a message whose wildcard content is already a DOM element
     * pays no extra cost. When nothing is repaired, or the repair itself fails (for example a wildcard holding a
     * String that is not XML), the original exception is thrown with the repair failure attached as suppressed. The
     * root is modified in place, as {@code AbstractMX.fromJson} would have left it.
     *
     * @param root        the object being marshalled, a message or a header
     * @param marshalling the marshalling to run, it must start from a fresh output on each call
     * @param <T>         marshalling result type
     * @return the marshalling result
     * @throws JAXBException if the marshalling fails and nothing could be repaired, or if the retry fails
     */
    static <T> T retryRepaired(final Object root, final Marshalling<T> marshalling) throws JAXBException {
        try {
            return marshalling.marshal();
        } catch (JAXBException e) {
            final boolean repaired;
            try {
                repaired = repair(root);
            } catch (RuntimeException repairFailure) {
                e.addSuppressed(repairFailure);
                throw e;
            }
            if (!repaired) {
                throw e;
            }
            log.fine("Wildcard content given as String was restored to DOM elements, retrying marshalling of "
                    + root.getClass().getName());
            return marshalling.marshal();
        }
    }

    /**
     * A marshalling that can be run again from scratch.
     *
     * @param <T> marshalling result type
     */
    @FunctionalInterface
    interface Marshalling<T> {
        T marshal() throws JAXBException;
    }

    private static boolean walk(final Object obj, final Set<Object> visited) {
        if (obj == null || !visited.add(obj)) {
            return false;
        }
        boolean repaired = false;
        for (Field field : instanceFields(obj.getClass())) {
            final Object value = readField(field, obj);
            if (value == null) {
                continue;
            }
            if (field.isAnnotationPresent(XmlAnyElement.class)) {
                repaired |= repairWildcard(field, obj, value);
            } else {
                repaired |= recurse(value, visited);
            }
        }
        return repaired;
    }

    /**
     * Returns (and caches) the non-static instance fields of the given class flattened across its
     * hierarchy, with {@link Field#setAccessible(boolean)} already applied.
     */
    private static Field[] instanceFields(final Class<?> type) {
        return FIELD_CACHE.computeIfAbsent(type, t -> {
            final List<Field> fields = new ArrayList<>();
            for (Class<?> c = t; c != null && c != Object.class; c = c.getSuperclass()) {
                for (Field field : c.getDeclaredFields()) {
                    if (Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
                        continue;
                    }
                    try {
                        field.setAccessible(true);
                    } catch (Exception e) {
                        if (log.isLoggable(Level.FINEST)) {
                            log.log(Level.FINEST, "Cannot access field " + field.getName(), e);
                        }
                        continue;
                    }
                    fields.add(field);
                }
            }
            return fields.toArray(new Field[0]);
        });
    }

    private static boolean repairWildcard(final Field field, final Object owner, final Object value) {
        boolean repaired = false;
        if (value instanceof String) {
            final Element element = ElementJsonAdapter.toElement((String) value);
            if (element != null) {
                repaired = writeField(field, owner, element);
            }
        } else if (value instanceof List) {
            @SuppressWarnings("unchecked")
            final ListIterator<Object> it = ((List<Object>) value).listIterator();
            while (it.hasNext()) {
                final Object item = it.next();
                if (item instanceof String) {
                    final Element element = ElementJsonAdapter.toElement((String) item);
                    if (element != null) {
                        it.set(element);
                        repaired = true;
                    }
                }
            }
        }
        return repaired;
    }

    private static boolean recurse(final Object value, final Set<Object> visited) {
        boolean repaired = false;
        if (value instanceof Collection) {
            for (Object item : (Collection<?>) value) {
                repaired |= recurse(item, visited);
            }
        } else if (isModelObject(value)) {
            repaired = walk(value, visited);
        }
        return repaired;
    }

    private static boolean isModelObject(final Object value) {
        final Class<?> type = value.getClass();
        if (type.isPrimitive() || type.isEnum() || type.isArray()) {
            return false;
        }
        final Package pkg = type.getPackage();
        return pkg != null && pkg.getName().startsWith(MODEL_PACKAGE);
    }

    private static Object readField(final Field field, final Object owner) {
        try {
            return field.get(owner);
        } catch (Exception e) {
            if (log.isLoggable(Level.FINEST)) {
                log.log(Level.FINEST, "Could not read field " + field.getName(), e);
            }
            return null;
        }
    }

    private static boolean writeField(final Field field, final Object owner, final Object value) {
        try {
            field.set(owner, value);
            return true;
        } catch (Exception e) {
            log.warning("Could not restore wildcard element on field " + field.getName() + ": " + e.getMessage());
            return false;
        }
    }
}
