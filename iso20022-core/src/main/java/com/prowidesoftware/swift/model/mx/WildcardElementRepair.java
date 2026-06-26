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
 * {@code Element} adapter. A {@code String} left in such a field would be marshalled by JAXB as escaped
 * text instead of a child element, breaking the XML round-trip. This utility walks the deserialized object
 * graph and converts those encoded strings back into {@link org.w3c.dom.Element} instances.
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
     */
    static void repair(final Object root) {
        if (root == null) {
            return;
        }
        walk(root, Collections.newSetFromMap(new IdentityHashMap<>()));
    }

    private static void walk(final Object obj, final Set<Object> visited) {
        if (obj == null || !visited.add(obj)) {
            return;
        }
        for (Field field : instanceFields(obj.getClass())) {
            final Object value = readField(field, obj);
            if (value == null) {
                continue;
            }
            if (field.isAnnotationPresent(XmlAnyElement.class)) {
                repairWildcard(field, obj, value);
            } else {
                recurse(value, visited);
            }
        }
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

    private static void repairWildcard(final Field field, final Object owner, final Object value) {
        if (value instanceof String) {
            final Element element = ElementJsonAdapter.toElement((String) value);
            if (element != null) {
                writeField(field, owner, element);
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
                    }
                }
            }
        }
    }

    private static void recurse(final Object value, final Set<Object> visited) {
        if (value instanceof Collection) {
            for (Object item : (Collection<?>) value) {
                recurse(item, visited);
            }
        } else if (isModelObject(value)) {
            walk(value, visited);
        }
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

    private static void writeField(final Field field, final Object owner, final Object value) {
        try {
            field.set(owner, value);
        } catch (Exception e) {
            log.warning("Could not restore wildcard element on field " + field.getName() + ": " + e.getMessage());
        }
    }
}
