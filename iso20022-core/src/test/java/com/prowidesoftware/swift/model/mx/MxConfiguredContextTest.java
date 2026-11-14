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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.utils.Lib;
import org.junit.jupiter.api.Test;

/**
 * A JAXB context given in the read or write configuration applies to the Document. The AppHdr classes are not part
 * of a Document context, so the header must be parsed and written with its own context instead of failing and
 * being silently left out of the result.
 */
class MxConfiguredContextTest {

    @Test
    void writeWithDocumentContextKeepsTheHeader() throws Exception {
        MxCamt00300105 mx = new MxCamt00300105();
        mx.setAppHdr(new BusinessAppHdrV02());
        MxWriteConfiguration conf = new MxWriteConfiguration(JaxbContextLoader.INSTANCE.get(mx));

        String xml = mx.message(conf);

        assertNotNull(xml);
        assertTrue(xml.contains("<head:AppHdr"), xml);
        assertEquals(mx.message(), xml);
    }

    @Test
    void parseWithDocumentContextKeepsTheHeader() throws Exception {
        String xml = Lib.readResource("pacs.008.001.07.xml");
        MxReadConfiguration conf = new MxReadConfiguration();
        conf.context = JaxbContextLoader.INSTANCE.get(new MxPacs00800107());

        MxPacs00800107 mx = MxPacs00800107.parse(xml, conf);

        assertNotNull(mx);
        assertNotNull(mx.getAppHdr(), "the header must be parsed with its own context");
        assertEquals("12312312312", mx.getAppHdr().reference());
        assertEquals("823823423", mx.getFIToFICstmrCdtTrf().getGrpHdr().getMsgId());
    }
}
