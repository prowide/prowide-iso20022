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

import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class MxParseUtilsTest {

    @Test
    public void testIdentifyMessage_01() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_02() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Foo:Document xmlns:Foo=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_03() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_04() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_05() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    @Test
    public void testIdentifyMessage_06() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\"></Doc:Document>";
        assertMxId(MxParseUtils.identifyMessage(xml).orElse(null));
    }

    void assertMxId(MxId id) {
        assertNotNull(id, "detected id is null");
        assertEquals(MxBusinessProcess.camt, id.getBusinessProcess());
        assertEquals("003", id.getFunctionality());
        assertEquals("001", id.getVariant());
        assertEquals("04", id.getVersion());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     * <p>This one is not affected by XXE because it only reads and returns the MxId and entity cannot be used in the
     * XML namespace.
     */
    @Test
    public void testXxeDisabledInDetectMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        Optional<MxId> id = MxParseUtils.identifyMessage(xml);
        assertTrue(id.isPresent());
    }

    @Test
    public void testIdentifyMessage_FromBAH() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Message>\n"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                + "<Fr> \n"
                + "	<FIId>\n"
                + "		<FinInstnId>\n"
                + "			<BICFI>FOOCUS3NXXX</BICFI>\n"
                + "			<ClrSysMmbId>\n"
                + "				<ClrSysId>\n"
                + "					<Prtry>T2S</Prtry>\n"
                + "				</ClrSysId>\n"
                + "				<MmbId>ADMNUSERLUXCSDT1</MmbId>\n"
                + "			</ClrSysMmbId>\n"
                + "			<Othr>\n"
                + "				<Id>FOOTXE2SXXX</Id>\n"
                + "				</Othr> \n"
                + "		</FinInstnId> \n"
                + "	</FIId> \n"
                + "</Fr> \n"
                + "<To> \n"
                + "	<FIId>\n"
                + "		<FinInstnId>\n"
                + "			<BICFI>ABICUS33</BICFI>\n"
                + "			<Othr>\n"
                + "				<Id>AARBDE5W100</Id>\n"
                + "			</Othr>\n"
                + "		</FinInstnId> \n"
                + "	</FIId> \n"
                + "</To> \n"
                + "<BizMsgIdr>2012111915360885</BizMsgIdr>\n"
                + "<MsgDefIdr>seev.031.002.03</MsgDefIdr> \n"
                + "<BizSvc>CSD</BizSvc> \n"
                + "<CreDt>2015-08-27T08:59:00Z</CreDt>\n"
                + "</AppHdr>\n"
                + "<Document></Document>\n"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.031.002.03", id.id());
    }

    @Test
    public void testIdentifyMessage_LegacyBAH() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Message>\n"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">" + "   <h:Fr>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>Not available</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:Fr>"
                + "   <h:To>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>Not available</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:To>"
                + "   <h:BizMsgIdr>AAAAAAAAAA222222</h:BizMsgIdr>"
                + "   <h:MsgDefIdr>seev.037.002.02</h:MsgDefIdr>"
                + "   <h:CreDt>2017-08-08T16:58:01Z</h:CreDt>"
                + "</h:AppHdr>"
                + "<Document></Document>\n"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.037.002.02", id.id());
    }
}
