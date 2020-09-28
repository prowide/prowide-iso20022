/*
 * Copyright 2006-2020 Prowide
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

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import static org.junit.Assert.*;

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

}
