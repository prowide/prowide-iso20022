/*
 * Copyright 2006-2021 Prowide
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

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import jakarta.xml.bind.JAXBContext;
import java.util.concurrent.ExecutionException;

/**
 * A jaxb context cache with Guava to test cache implementation injection in {@link JaxbContextLoader}
 *
 * @since 9.0
 */
public class GuavaJaxbContextCache implements JaxbContextCache {

    private final Cache<Class<? extends AbstractMX>, JAXBContext> cache = CacheBuilder.newBuilder().maximumSize(100).build();

    public JAXBContext get(final Class messageClass, final Class<?>[] classes) throws ExecutionException {
        return cache.get(messageClass, () -> {
            if (classes != null && classes.length > 0) {
                return JAXBContext.newInstance(classes);
            } else {
                return JAXBContext.newInstance(messageClass);
            }
        });
    }

}
