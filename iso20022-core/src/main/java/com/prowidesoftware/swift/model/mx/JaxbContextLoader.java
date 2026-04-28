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

import java.util.concurrent.ExecutionException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * Singleton to parameterize the {@link JaxbContextCache} used when marshalling or unmarshalling MX messages.
 *
 * <p>This class is just a holder for the currently set cache. It is invoked in the static parse and write calls
 * of the MX message model classes.
 *
 * <p>By default the loader will use no cache at all, creating new contexts for each parse or write call. Jaxb
 * marshalling and unmarshalling is known to be a resource intensive task, so if you need to parse large burst
 * of messages it is highly recommended that you set a proper cache here.
 *
 * <p>A basic cache implementation is provided in the {@link JaxbContextCacheImpl} class. This implementation uses
 * a simple static Map with no eviction. It is aimed to provide something out-ot-the-box without adding additional
 * third party libraries. You can easily inject your own cache implementation based on Guava, Ecache, Caffeine or any
 * other cache implementation of choice. See some code references in the {@link JaxbContextCache} interface.
 *
 * @since 9.0
 */
public enum JaxbContextLoader {
    // singleton pattern with enum implementation
    INSTANCE;

    private JaxbContextCache cacheImpl;

    /**
     * Gets a context from the static cache. If the context for the specific message type is not present,
     * a new context is initialized with the given classes and stored in the cache.
     *
     * @param mx an MX message instance
     * @return the cached or created context for the specific message type
     */
    public JAXBContext get(AbstractMX mx) throws JAXBException, ExecutionException {
        return get(mx.getClass(), mx.getClasses());
    }

    /**
     * Gets a context from the static cache. If the context for the specific message type is not present,
     * a new context is initialized with the given classes or messageClass.
     *
     * @param messageClass class of the message to be read or written
     * @param classes      comprehensive list of classes for the context, null or empty to create a context with the messageClass
     * @return the cached or created context for the specific message type
     */
    public JAXBContext get(final Class messageClass, final Class<?>[] classes)
            throws JAXBException, ExecutionException {
        if (cacheImpl != null) {
            return cacheImpl.get(messageClass, classes);
        } else {
            if (classes != null && classes.length != 0) {
                return JAXBContext.newInstance(classes);
            } else {
                return JAXBContext.newInstance(messageClass);
            }
        }
    }

    /**
     * Currently set cache implementation
     *
     * @return current cache if none was set
     */
    public JaxbContextCache getCacheImpl() {
        return cacheImpl;
    }

    /**
     * Sets a new cache implementation
     *
     * @param cacheImpl cache implementation to set
     */
    public void setCacheImpl(JaxbContextCache cacheImpl) {
        this.cacheImpl = cacheImpl;
    }

    /**
     * Sets the current cache implementation to null, meaning for all subsequent calls new context will always be
     * created without any caching. This is the default loader state.
     */
    public void setNoCache() {
        this.cacheImpl = null;
    }
}
