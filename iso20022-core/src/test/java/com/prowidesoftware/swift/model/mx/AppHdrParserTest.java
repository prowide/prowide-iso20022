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

import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class AppHdrParserTest {

    @Test
    public void testParseApplicationHeader_null() throws IOException {
        final String xml = Lib.readResource("mx_sample_document.xml");
        assertFalse(AppHdrParser.parse(xml).isPresent());
    }

    @Test
    public void testParseApplicationHeader_sample_header() throws IOException {
        final String xml = Lib.readResource("mx_sample_header.xml");
        AppHdr appHdr = AppHdrParser.parse(xml).orElse(null);
        assertSampleApplicationHeader(appHdr);
    }

    private void assertSampleApplicationHeader(final AppHdr bh) {
        assertNotNull(bh);
        LegacyAppHdr h = (LegacyAppHdr) bh;
        assertNotNull(h);
        assertEquals("DN", h.getFrom().getType());
        assertEquals("cn=funds,ou=abcdchzz,o=swift", h.getFrom().getId());
        assertEquals("DN", h.getTo().getType());
        assertEquals("cn=funds,ou=dcbadeff,o=swift", h.getTo().getId());
        assertEquals("11308917", h.getMsgRef());
        assertNotNull(h.getCrDate());
        assertNull(h.getDup());
        assertNull(h.getMsgName());
        assertNull(h.getSvcName());
    }

    @Test
    public void testParseApplicationHeader_sample_payload() throws IOException {
        final String xml = Lib.readResource("mx_sample_payload.xml");
        AppHdr appHdr = AppHdrParser.parse(xml).orElse(null);
        assertSampleApplicationHeader(appHdr);
    }

    @Test
    public void testParseApplicationHeader_sample_request_wrapper() throws IOException {
        final String xml = Lib.readResource("mx_sample_request_wrapper.xml");
        AppHdr appHdr = AppHdrParser.parse(xml).orElse(null);
        assertSampleApplicationHeader(appHdr);
    }

    @Test
    public void testParseApplicationHeader_sample_payload_mq() throws IOException {
        final String xml = Lib.readResource("app_to_mqsq.xml");
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertTrue(appHdr.isPresent());
        LegacyAppHdr h = (LegacyAppHdr) appHdr.get();
        assertNotNull(h);
        assertEquals("SCRRQ01", h.getMsgRef());
        assertNotNull(h.getCrDate());
        assertEquals(2006, h.getCrDate().getYear());
        assertEquals(9, h.getCrDate().getMonth());
    }

    @Test
    public void testParseApplicationHeader_sample_bah() throws IOException {
        final String xml = Lib.readResource("mx_sample_bah.xml");
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertTrue(appHdr.isPresent());
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) appHdr.get();
        assertEquals(
                "T2S",
                bah.getFr()
                        .getFIId()
                        .getFinInstnId()
                        .getClrSysMmbId()
                        .getClrSysId()
                        .getPrtry());
        assertEquals(
                "ADMNUSERLUXCSDT1",
                bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
        assertEquals("ABICUS33", bah.getTo().getFIId().getFinInstnId().getBICFI());
        assertEquals("2012111915360885", bah.getBizMsgIdr());
        assertEquals("seev.031.002.03", bah.getMsgDefIdr());
        assertEquals("CSD", bah.getBizSvc());
    }

    @Test
    public void testParseBusinessApplicationHeader_sample() {
        final String xml =
                "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
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
                        + "</AppHdr>";
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertTrue(appHdr.isPresent());
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) appHdr.get();

        assertNotNull(bah);
        /*
         * From
         */
        assertNotNull(bah.getFr());
        assertNotNull(bah.getFr().getFIId());
        assertNotNull(bah.getFr().getFIId().getFinInstnId());
        assertEquals("FOOCUS3NXXX", bah.getFr().getFIId().getFinInstnId().getBICFI());
        assertEquals(
                "T2S",
                bah.getFr()
                        .getFIId()
                        .getFinInstnId()
                        .getClrSysMmbId()
                        .getClrSysId()
                        .getPrtry());
        assertEquals(
                "ADMNUSERLUXCSDT1",
                bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
        /*
         * To
         */
        assertNotNull(bah.getTo());
        assertNotNull(bah.getTo().getFIId());
        assertNotNull(bah.getTo().getFIId().getFinInstnId());
        assertEquals("ABICUS33", bah.getTo().getFIId().getFinInstnId().getBICFI());
        assertEquals(
                "AARBDE5W100", bah.getTo().getFIId().getFinInstnId().getOthr().getId());
        /*
         * Reference, date, etc
         */
        assertEquals("2012111915360885", bah.getBizMsgIdr());
        assertEquals("seev.031.002.03", bah.getMsgDefIdr());
        assertEquals("CSD", bah.getBizSvc());
        assertNotNull(bah.getCreDt());
        assertEquals(2015, bah.getCreDt().getYear());
        assertEquals(8, bah.getCreDt().getMonth());
    }

    @Test
    public void testParseApplicationHeader() {
        final String xml = "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">" + "   <h:Fr>"
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
                + "</h:AppHdr>";
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertTrue(appHdr.isPresent());
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) appHdr.get();
        assertNotNull(bah);
        assertEquals("Not available", bah.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", bah.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", bah.getBizMsgIdr());
        assertEquals("seev.037.002.02", bah.getMsgDefIdr());
        assertNotNull(bah.getCreDt());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @Test
    public void testXxeDisabledInHeaderParse_01() {
        String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">"
                + "	<From>&xxe;</From>"
                + "</h:AppHdr>";
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertFalse(appHdr.isPresent());
    }

    @Test
    public void testXxeDisabledInHeaderParse_02() {
        String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">"
                + "   <h:Fr>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>Not available</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:Fr>"
                + "   <h:To>"
                + "      <h:FIId>"
                + "         <h:FinInstnId>"
                + "            <h:Nm>foo</h:Nm>"
                + "         </h:FinInstnId>"
                + "      </h:FIId>"
                + "   </h:To>"
                + "   <h:BizMsgIdr>AAAAAAAAAA222222</h:BizMsgIdr>"
                + "   <h:MsgDefIdr>&xxe;</h:MsgDefIdr>"
                + "   <h:CreDt>2017-08-08T16:58:01Z</h:CreDt>"
                + "</h:AppHdr>";
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertFalse(appHdr.isPresent());
    }

    @Test
    public void testNoNamespaceDefaultToBAH() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<AppHdr>\n"
                + "   <BizMsgIdr>0001645041</BizMsgIdr>\n"
                + "   <CreDt>2018-09-05T09:50:33Z</CreDt>\n"
                + "</AppHdr>";
        Optional<AppHdr> appHdr = AppHdrParser.parse(xml);
        assertTrue(appHdr.isPresent());
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) appHdr.get();
        assertEquals("0001645041", bah.getBizMsgIdr());
    }
}
