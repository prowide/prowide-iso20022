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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.mx.dic.ApplicationHeaderImpl;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV01Impl;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV02Impl;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV03Impl;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV04Impl;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * The AppHdr serialization ({@link AppHdr#xml(MxWriteParams)} and {@code element(JAXBContext)}) takes its JAXB
 * context from the {@link JaxbContextLoader}, so a configured cache is used instead of a new context per call.
 */
class AppHdrJaxbContextCacheTest {

    private final RecordingCache cache = new RecordingCache();

    @BeforeEach
    void setup() {
        JaxbContextLoader.INSTANCE.setNoCache();
    }

    @AfterEach
    void dispose() {
        JaxbContextLoader.INSTANCE.setNoCache();
    }

    static Stream<Arguments> headers() {
        return Stream.of(
                Arguments.of((Supplier<AppHdr>) LegacyAppHdr::new, ApplicationHeaderImpl.class),
                Arguments.of((Supplier<AppHdr>) BusinessAppHdrV01::new, BusinessApplicationHeaderV01Impl.class),
                Arguments.of((Supplier<AppHdr>) BusinessAppHdrV02::new, BusinessApplicationHeaderV02Impl.class),
                Arguments.of((Supplier<AppHdr>) BusinessAppHdrV03::new, BusinessApplicationHeaderV03Impl.class),
                Arguments.of((Supplier<AppHdr>) BusinessAppHdrV04::new, BusinessApplicationHeaderV04Impl.class));
    }

    @ParameterizedTest
    @MethodSource("headers")
    void xmlUsesTheConfiguredCache(Supplier<AppHdr> header, Class<?> jaxbClass) {
        String uncached = header.get().xml();

        JaxbContextLoader.INSTANCE.setCacheImpl(cache);
        String first = header.get().xml();
        String second = header.get().xml();

        assertEquals(uncached, first, "the cached context must serialize the same XML");
        assertEquals(uncached, second);
        assertEquals(List.of(jaxbClass, jaxbClass), cache.requested);
        assertEquals(1, cache.delegate.size(), "the context must be created once and reused");
    }

    @ParameterizedTest
    @MethodSource("headers")
    void elementUsesTheConfiguredCache(Supplier<AppHdr> header, Class<?> jaxbClass) {
        JaxbContextLoader.INSTANCE.setCacheImpl(cache);

        assertNotNull(header.get().element());
        assertNotNull(header.get().element());

        assertEquals(List.of(jaxbClass, jaxbClass), cache.requested);
        assertEquals(1, cache.delegate.size(), "the context must be created once and reused");
    }

    /** Records the requested message classes and delegates to the default cache implementation. */
    private static final class RecordingCache implements JaxbContextCache {
        final JaxbContextCacheImpl delegate = new JaxbContextCacheImpl();
        final List<Class<?>> requested = new ArrayList<>();

        @Override
        public JAXBContext get(Class messageClass, Class<?>[] classes) throws JAXBException {
            requested.add(messageClass);
            return delegate.get(messageClass, classes);
        }
    }
}
