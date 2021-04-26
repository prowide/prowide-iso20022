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
package com.prowidesoftware.swift.io.parser;

import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.io.parser.MxParser.MxStructureInfo;
import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.AppHdr;
import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import com.prowidesoftware.swift.model.mx.LegacyAppHdr;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV01;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.Diff;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for {@link MxParser} header parsing, message detection, analysis and strip API.
 *
 * @since 7.6
 */
public class MxParserTest {

    public static final String sampleBAH = "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
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

    public static void assertSampleBusinessApplicationHeader(final BusinessAppHdrV01 bah) {
        assertNotNull(bah);
        /*
         * From
         */
        assertNotNull(bah.getFr());
        assertNotNull(bah.getFr().getFIId());
        assertNotNull(bah.getFr().getFIId().getFinInstnId());
        assertEquals("FOOCUS3NXXX", bah.getFr().getFIId().getFinInstnId().getBICFI());
        assertEquals("T2S", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getClrSysId().getPrtry());
        assertEquals("ADMNUSERLUXCSDT1", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
        /*
         * To
         */
        assertNotNull(bah.getTo());
        assertNotNull(bah.getTo().getFIId());
        assertNotNull(bah.getTo().getFIId().getFinInstnId());
        assertEquals("ABICUS33", bah.getTo().getFIId().getFinInstnId().getBICFI());
        assertEquals("AARBDE5W100", bah.getTo().getFIId().getFinInstnId().getOthr().getId());
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

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    private AppHdr parseHeaderFromSample(final String sample) throws IOException {
        try (InputStream inputStream = getClass().getResourceAsStream("/" + sample)) {
            return new MxParser(inputStream).parseAppHdr();
        }
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

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_null() throws IOException {
        assertNull(parseHeaderFromSample("mx_sample_document.xml"));
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_sample_header() throws IOException {
        assertSampleApplicationHeader(parseHeaderFromSample("mx_sample_header.xml"));
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_sample_payload() throws IOException {
        assertSampleApplicationHeader(parseHeaderFromSample("mx_sample_payload.xml"));
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_sample_payload_mq() throws IOException {
        AppHdr bh = parseHeaderFromSample("app_to_mqsq.xml");
        assertNotNull(bh);
        LegacyAppHdr h = (LegacyAppHdr) bh;
        assertNotNull(h);
        assertEquals("SCRRQ01", h.getMsgRef());
        assertNotNull(h.getCrDate());
        assertEquals(2006, h.getCrDate().getYear());
        assertEquals(9, h.getCrDate().getMonth());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_sample_request_wrapper() throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/mx_sample_request_wrapper.xml");
        MxParser parser = new MxParser(inputStream);
        MxStructureInfo info = parser.analyzeMessage();
        assertTrue(info.containsWrapper());
        assertTrue(info.containsDocument());
        assertTrue(info.containsHeader());
        assertEquals("urn:swift:xsd:camt.003.001.04", info.getDocumentNamespace());
        assertEquals("Doc", info.getDocumentPrefix());
        assertEquals("urn:swift:xsd:$ahV10", info.getHeaderNamespace());
        assertEquals("Ah", info.getHeaderPrefix());
        AppHdr h = parser.parseAppHdr();
        assertSampleApplicationHeader(h);
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader_sample_bah() throws IOException {
        AppHdr hdr = parseHeaderFromSample("mx_sample_bah.xml");
        assertNotNull(hdr);
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) hdr;
        assertEquals("T2S", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getClrSysId().getPrtry());
        assertEquals("ADMNUSERLUXCSDT1", bah.getFr().getFIId().getFinInstnId().getClrSysMmbId().getMmbId());
        assertEquals("ABICUS33", bah.getTo().getFIId().getFinInstnId().getBICFI());
        assertEquals("2012111915360885", bah.getBizMsgIdr());
        assertEquals("seev.031.002.03", bah.getMsgDefIdr());
        assertEquals("CSD", bah.getBizSvc());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseBusinessApplicationHeader_sample() {
        final BusinessAppHdrV01 bh = (BusinessAppHdrV01) new MxParser(sampleBAH).parseAppHdr();
        assertSampleBusinessApplicationHeader(bh);
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testParseApplicationHeader() {
        final String xml = "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">" +
                "   <h:Fr>" +
                "      <h:FIId>" +
                "         <h:FinInstnId>" +
                "            <h:Nm>Not available</h:Nm>" +
                "         </h:FinInstnId>" +
                "      </h:FIId>" +
                "   </h:Fr>" +
                "   <h:To>" +
                "      <h:FIId>" +
                "         <h:FinInstnId>" +
                "            <h:Nm>Not available</h:Nm>" +
                "         </h:FinInstnId>" +
                "      </h:FIId>" +
                "   </h:To>" +
                "   <h:BizMsgIdr>AAAAAAAAAA222222</h:BizMsgIdr>" +
                "   <h:MsgDefIdr>seev.037.002.02</h:MsgDefIdr>" +
                "   <h:CreDt>2017-08-08T16:58:01Z</h:CreDt>" +
                "</h:AppHdr>";
        MxParser p = new MxParser(xml);
        BusinessApplicationHeaderV01 h = p.parseBusinessApplicationHeaderV01();
        assertNotNull(h);
        assertEquals("Not available", h.getFr().getFIId().getFinInstnId().getNm());
        assertEquals("Not available", h.getTo().getFIId().getFinInstnId().getNm());
        assertEquals("AAAAAAAAAA222222", h.getBizMsgIdr());
        assertEquals("seev.037.002.02", h.getMsgDefIdr());
        assertNotNull(h.getCreDt());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(new MxParser(xml).detectMessage());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage2() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Foo:Document xmlns:Foo=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        assertMxId(new MxParser(xml).detectMessage());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage3() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"></Doc:Document>";
        assertMxId(new MxParser(xml).detectMessage());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage4() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(new MxParser(xml).detectMessage());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage5() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        assertMxId(new MxParser(xml).detectMessage());
    }

    /*
     * bank to bank namespace
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testDetectMessage6() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\"></Doc:Document>";
        assertMxId(new MxParser(xml).detectMessage());
    }

    void assertMxId(MxId id) {
        assertNotNull(id, "detected id is null");
        assertEquals(MxBusinessProcess.camt, id.getBusinessProcess());
        assertEquals("003", id.getFunctionality());
        assertEquals("001", id.getVariant());
        assertEquals("04", id.getVersion());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertTrue(info.containsDocument());
        assertFalse(info.containsHeader());
        assertFalse(info.containsWrapper());
        assertEquals("urn:swift:xsd:camt.003.001.04", info.getDocumentNamespace());
        assertEquals("Doc", info.getDocumentPrefix());
        assertNull(info.getHeaderNamespace());
        assertNull(info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage2() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Document>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertTrue(info.containsDocument());
        assertFalse(info.containsHeader());
        assertFalse(info.containsWrapper());
        assertEquals("urn:swift:xsd:camt.003.001.04", info.getDocumentNamespace());
        assertNull(info.getDocumentPrefix());
        assertNull(info.getHeaderNamespace());
        assertNull(info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage3() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></AppHdr>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertFalse(info.containsDocument());
        assertTrue(info.containsHeader());
        assertFalse(info.containsWrapper());
        assertNull(info.getDocumentNamespace());
        assertNull(info.getDocumentPrefix());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", info.getHeaderNamespace());
        assertNull(info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage4() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertFalse(info.containsDocument());
        assertTrue(info.containsHeader());
        assertFalse(info.containsWrapper());
        assertNull(info.getDocumentNamespace());
        assertNull(info.getDocumentPrefix());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", info.getHeaderNamespace());
        assertEquals("h", info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage5() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>"
                + "</message>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertTrue(info.containsDocument());
        assertTrue(info.containsHeader());
        assertTrue(info.containsWrapper());
        assertEquals("urn:swift:xsd:camt.003.001.04", info.getDocumentNamespace());
        assertEquals("Doc", info.getDocumentPrefix());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", info.getHeaderNamespace());
        assertEquals("h", info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage6() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></foo>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNotNull(info.getException());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage7() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNotNull(info.getException());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testAnalizeMessage8() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                // missing prefix in element on purpose
                + "<AppHdr xmlns:h=\"urn:swift:xsd:$ahV10\"><From></From></AppHdr>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>"
                + "</message>";
        MxStructureInfo info = new MxParser(xml).analyzeMessage();
        assertNull(info.getException());
        assertTrue(info.containsDocument());
        assertTrue(info.containsHeader());
        assertTrue(info.containsWrapper());
        assertEquals("urn:swift:xsd:camt.003.001.04", info.getDocumentNamespace());
        assertEquals("Doc", info.getDocumentPrefix());
        // header namespace is null because it is bounded to a prefix "h" not used in the element
        assertNull(info.getHeaderNamespace());
        assertNull(info.getHeaderPrefix());
    }

    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testStrip() {
        final String h = "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>";
        final String d = "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        MxParser parser = new MxParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><message>" + h + d + "</message>");
        assertEquals(h, parser.stripHeader());
        assertEquals(d, parser.stripDocument());

        /*
         * no document
         */
        parser = new MxParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><message>" + h + "</message>");
        assertEquals(h, parser.stripHeader());
        assertNull(parser.stripDocument());

        /*
         * no header
         */
        parser = new MxParser("<?xml version=\"1.0\" encoding=\"UTF-8\"?><message>" + d + "</message>");
        assertNull(parser.stripHeader());
        Diff diff = DiffBuilder.compare(d).withTest(parser.stripDocument()).build();
        assertFalse(diff.hasDifferences());
    }

    /**
     * This test sample contains a non-standard envelope, and a document with a supplementary data containing an embedded MX.
     * It is used to validate the analyze and strip API properly detect the main MX information ignoring the embedded suplementary MX.
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testFullSample() {
        final String document = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:seev.036.002.07\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "<CorpActnMvmntConf>\n" +
                "		<MvmntPrlimryAdvcId>\n" +
                "			<Id>2016120815902666</Id>\n" +
                "		</MvmntPrlimryAdvcId>\n" +
                "		<CorpActnGnlInf>\n" +
                "			<CorpActnEvtId>12345678</CorpActnEvtId>\n" +
                "			<OffclCorpActnEvtId>US12345678</OffclCorpActnEvtId>\n" +
                "			<EvtTp><Cd>PDEF</Cd></EvtTp>\n" +
                "			<FinInstrmId>\n" +
                "				<OthrId>\n" +
                "					<Id>172311HA3</Id>\n" +
                "					<Tp><Cd>CUSP</Cd></Tp>\n" +
                "				</OthrId>\n" +
                "				<Desc>FOOOWSR05.000JD21BE</Desc>\n" +
                "			</FinInstrmId>\n" +
                "		</CorpActnGnlInf>\n" +
                "	<SplmtryData>\n" +
                "		<Envlp>\n" +
                "			<Document xmlns=\"urn:swift:xsd:supl.011.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "				<DTCCCACOSD1>\n" +
                "					<CorpActnGnlInf>\n" +
                "						<PlcAndNm>/Document/CorpActnMvmntConf/CorpActnGnlInf</PlcAndNm>\n" +
                "						<EvtGrp>REDM</EvtGrp>\n" +
                "						<RedId>1379145963</RedId>\n" +
                "					</CorpActnGnlInf>\n" +
                "					<CorpActnConfSctiesMvmntDtls>\n" +
                "						<PlcAndNm>foo</PlcAndNm>\n" +
                "						<CdtDbtInd>CRDT</CdtDbtInd>\n" +
                "						<PyoutTp>SECU</PyoutTp>\n" +
                "						<MtrtyDt>2017-12-01</MtrtyDt>\n" +
                "					</CorpActnConfSctiesMvmntDtls>\n" +
                "				</DTCCCACOSD1>\n" +
                "			</Document>\n" +
                "		</Envlp>\n" +
                "	</SplmtryData>\n" +
                "</CorpActnMvmntConf>\n" +
                "</Document>\n";

        final String xml = "<?xml version=\"1.0\"?>\n" +
                "<env:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:env=\"CDTS-SUBMIT\">\n" +
                "	<env:Body>\n" +
                "		<cdtPrefix>\n" +
                "			<cdtprVersion>01</cdtprVersion>\n" +
                "			<cdtprOperation>SUBMIT</cdtprOperation>\n" +
                "			<cdtprFunction>REDMS1O</cdtprFunction>\n" +
                "			<cdtprDirectionFlag>O</cdtprDirectionFlag>\n" +
                "		</cdtPrefix>\n" +
                "		<cdtDataDescription>\n" +
                "			<cdtddVersion>01</cdtddVersion>\n" +
                "			<cdtddFirmId>DTCCUS3NRED</cdtddFirmId>\n" +
                "		</cdtDataDescription>\n" +
                "		<cdtBusinessData>\n" +
                sampleBAH +
                document +
                "		</cdtBusinessData>\n" +
                "	</env:Body>\n" +
                "</env:Envelope>";

        MxParser p = new MxParser(xml);
        assertEquals(new MxId("seev.036.002.07"), p.detectMessage());
        MxStructureInfo info = p.analyzeMessage();
        assertTrue(info.containsDocument());
        assertTrue(info.containsHeader());
        assertTrue(info.containsWrapper());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:seev.036.002.07", info.getDocumentNamespace());
        assertNull(info.getDocumentPrefix());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", info.getHeaderNamespace());
        assertNull(info.getHeaderPrefix());
        assertNull(info.getException());

        Diff diff = DiffBuilder.compare(sampleBAH).withTest(p.stripHeader()).build();
        assertFalse(diff.hasDifferences());

        diff = DiffBuilder.compare(document).withTest(p.stripDocument()).build();
        assertFalse(diff.hasDifferences());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testXxeDisabledInDocumentParse() {
        String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" +
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.007.002.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
                "	<Doc:camt.007.002.02>" +
                "		<Doc:Assgnmt>" +
                "			<Doc:Id>&xxe;</Doc:Id>" +
                "		</Doc:Assgnmt>" +
                "	</Doc:camt.007.002.02>" +
                "</Doc:Document>";
        MxParser p = new MxParser(xml);
        String document = p.stripDocument();
        assertNotNull(document);
        assertTrue(document.contains("&xxe;"));
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testXxeDisabledInHeaderParse() {
        String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" +
                "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">" +
                "	<From>&xxe;</From>" +
                "</h:AppHdr>";
        MxParser p = new MxParser(xml);
        String header = p.stripHeader();
        assertNotNull(header);
        assertTrue(header.contains("&xxe;"));
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testXxeDisabledInAnalyzeMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" +
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        MxParser parser = new MxParser(xml);
        MxStructureInfo info = parser.analyzeMessage();
        assertNotNull(info.getException());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     * <p>This one is not affected by XXE because it only reads and returns the MxId and entity cannot be used in the
     * XML namespace.
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    @Test
    public void testXxeDisabledInDetectMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" +
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        MxParser parser = new MxParser(xml);
        MxId id = parser.detectMessage();
        assertMxId(id);
    }

}
