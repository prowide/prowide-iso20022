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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prowidesoftware.swift.utils.Lib;

/**
 * @since 9.0
 */
public class JaxbContextLoaderTest {

    @BeforeEach
    public void setup() {
        JaxbContextLoader.INSTANCE.setNoCache();
    }

    @AfterEach
    public void dispose() {
        JaxbContextLoader.INSTANCE.setNoCache();
    }

    @Test
    public void testNoCache() throws IOException {
        assertNull(JaxbContextLoader.INSTANCE.getCacheImpl());
        parseAndAssertSamples();
        assertNull(JaxbContextLoader.INSTANCE.getCacheImpl());
    }

    @Test
    public void testDefaultCacheImpl() throws IOException {
        JaxbContextLoader.INSTANCE.setCacheImpl(new JaxbContextCacheImpl());
        assertNotNull(JaxbContextLoader.INSTANCE.getCacheImpl());
        parseAndAssertSamples();
        // we assert three, because it shoudl contain three messages contexts plus the header context
        assertEquals(4, ((JaxbContextCacheImpl) JaxbContextLoader.INSTANCE.getCacheImpl()).size());
        JaxbContextLoader.INSTANCE.setNoCache();
        assertNull(JaxbContextLoader.INSTANCE.getCacheImpl());
    }

    @Test
    public void testGuavaCacheImpl() throws IOException {
        JaxbContextLoader.INSTANCE.setCacheImpl(new GuavaJaxbContextCache());
        assertNotNull(JaxbContextLoader.INSTANCE.getCacheImpl());
        parseAndAssertSamples();
        JaxbContextLoader.INSTANCE.setNoCache();
        assertNull(JaxbContextLoader.INSTANCE.getCacheImpl());
    }

    private void parseAndAssertSamples() throws IOException {
        MxCamt05300107 cant053 = MxCamt05300107.parse(Lib.readResource("camt.053.001.07.xml"));
        assertEquals("ASDFSDF", cant053.getAppHdr().reference());
        assertEquals("SDFSDF", cant053.getBkToCstmrStmt().getGrpHdr().getMsgId());

        MxPacs00800107 pacs008 = MxPacs00800107.parse(Lib.readResource("pacs.008.001.07.xml"));
        assertEquals("12312312312", pacs008.getAppHdr().reference());
        assertEquals("823823423", pacs008.getFIToFICstmrCdtTrf().getGrpHdr().getMsgId());

        MxPacs00900107 pacs009 = MxPacs00900107.parse(Lib.readResource("pacs.009.001.07.xml"));
        assertEquals("ASDFASDF22342", pacs009.getAppHdr().reference());
        assertEquals("SDFASDF2323", pacs009.getFICdtTrf().getGrpHdr().getMsgId());
    }

}
