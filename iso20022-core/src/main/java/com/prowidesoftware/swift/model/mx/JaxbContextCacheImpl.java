/*
 * Copyright 2006-2023 Prowide
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

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Simple cache based on {@link ConcurrentHashMap} without eviction. This implementation is aimed to avoid additional
 * third party dependencies. For a more robust solution You can easily implement your own cache with Guava, Ecache,
 * Caffeine or any other cache library. See some code references in the {@link JaxbContextCache} interface.
 *
 * <p>The cache is per instance. Concurrent lookups of the same class create the context once, and a {@link #clear()}
 * concurrent with a lookup is safe.
 *
 * @since 9.0
 */
public class JaxbContextCacheImpl implements JaxbContextCache {

    private final ConcurrentHashMap<Class, JAXBContext> cachedMap = new ConcurrentHashMap<>();

    /**
     * Gets a context from the cache. If the context for the specific message type is not present,
     * a new context is initialized with the given classes or messageClass and stored in the cache.
     *
     * @param messageClass class of the message to be read or written
     * @param classes      comprehensive list of classes for the context, null or empty to create a context with the messageClass
     * @return the cached or created context for the specific message type
     */
    public JAXBContext get(final Class messageClass, final Class<?>[] classes) throws JAXBException {
        try {
            // atomic per key: concurrent misses wait for the single creation instead of each building a context
            return cachedMap.computeIfAbsent(messageClass, key -> {
                try {
                    return classes != null && classes.length != 0
                            ? JAXBContext.newInstance(classes)
                            : JAXBContext.newInstance(messageClass);
                } catch (JAXBException e) {
                    throw new ContextCreationException(e);
                }
            });
        } catch (ContextCreationException e) {
            throw e.cause;
        }
    }

    /** Tunnels the checked {@link JAXBException} out of the map computation */
    private static final class ContextCreationException extends RuntimeException {
        private final JAXBException cause;

        private ContextCreationException(JAXBException cause) {
            super(cause);
            this.cause = cause;
        }
    }

    /**
     * Drops all cached contexts
     */
    public void clear() {
        cachedMap.clear();
    }

    /**
     * Drops the cached context for the specific MX implementation class.
     *
     * @param clazz the MX class whose cached context should be removed
     * @return the removed context, if it was present, or null otherwise
     */
    public JAXBContext clear(Class clazz) {
        return cachedMap.remove(clazz);
    }

    /**
     * @return the number of cached contexts
     */
    public int size() {
        return cachedMap.size();
    }
}
