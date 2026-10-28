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

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

/**
 * @since 9.0
 */
public class JaxbContextCacheImplTest {

    @Test
    public void testCache() throws JAXBException {
        JaxbContextCacheImpl cache = new JaxbContextCacheImpl();

        assertEquals(0, cache.size());
        cache.clear();
        assertNull(cache.clear(MxSese02300201.class));

        JAXBContext context = cache.get(MxSese02300201.class, MxSese02300201._classes);
        assertNotNull(context);
        assertEquals(1, cache.size());

        JAXBContext context2 = cache.get(MxPain00100109.class, MxPain00100109._classes);
        assertNotNull(context2);
        assertEquals(2, cache.size());

        assertNotNull(cache.clear(MxSese02300201.class));
        assertEquals(1, cache.size());

        cache.clear();
        assertEquals(0, cache.size());
    }

    /** Concurrent misses for the same class must create the context once, not once per thread */
    @Test
    public void testConcurrentLookupsOfTheSameClassShareOneContext() throws Exception {
        JaxbContextCacheImpl cache = new JaxbContextCacheImpl();
        int threads = 8;
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        try {
            CountDownLatch start = new CountDownLatch(1);
            List<Future<JAXBContext>> results = new ArrayList<>();
            for (int i = 0; i < threads; i++) {
                results.add(pool.submit(() -> {
                    start.await();
                    return cache.get(MxPacs00800107.class, MxPacs00800107._classes);
                }));
            }
            start.countDown();
            Set<JAXBContext> distinct = Collections.newSetFromMap(new IdentityHashMap<>());
            for (Future<JAXBContext> result : results) {
                distinct.add(result.get(60, TimeUnit.SECONDS));
            }
            assertEquals(1, distinct.size(), "every thread must get the same context");
            assertEquals(1, cache.size());
        } finally {
            pool.shutdownNow();
        }
    }
}
