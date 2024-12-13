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
import com.prowidesoftware.swift.model.SettlementInfo;
import com.prowidesoftware.swift.model.SettlementMethod;
import java.util.Optional;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.junit.jupiter.api.Test;

public class MxParseUtilsTest {

    String xml_pacs_008_001_01 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<Document xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://www.six-interbank-clearing.com/de/pacs.028.001.01.chsepa.02\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.028.001.01.chsepa.02 pacs.028.001.01.chsepa.02.xsd\">"
            + "  <FIToFIPmtStsReq>"
            + "    <GrpHdr>"
            + "      <MsgId>MSGID-pacs028-20190529-1</MsgId>"
            + "      <CreDtTm>2019-05-29T09:30:47Z</CreDtTm>"
            + "      <InstgAgt>"
            + "        <FinInstnId>"
            + "          <BICFI>FOOICHBBXXX</BICFI>"
            + "        </FinInstnId>"
            + "      </InstgAgt>"
            + "      <InstdAgt>"
            + "        <FinInstnId>"
            + "          <BICFI>FOOTDEFFXXX</BICFI>"
            + "        </FinInstnId>"
            + "      </InstdAgt>"
            + "    </GrpHdr>"
            + "    <OrgnlGrpInf>"
            + "      <OrgnlMsgId>MSGID-camt056-20190522-2-SEPA</OrgnlMsgId>"
            + "      <OrgnlMsgNmId>camt.056.001.01</OrgnlMsgNmId>"
            + "    </OrgnlGrpInf>"
            + "    <TxInf>"
            + "      <StsReqId>STSREQID-pacs028StatusReqId4713</StsReqId>"
            + "      <OrgnlInstrId>XCORW-xzng943XzmxvoRwIvu5287</OrgnlInstrId>"
            + "      <OrgnlEndToEndId>1234567891</OrgnlEndToEndId>"
            + "      <OrgnlTxId>79809477-7-9998</OrgnlTxId>"
            + "      <OrgnlTxRef>"
            + "        <SttlmInf>"
            + "          <SttlmMtd>INDA</SttlmMtd>"
            + "          <ClrSys>"
            + "            <Prtry>ABE</Prtry>"
            + "          </ClrSys>"
            + "        </SttlmInf>"
            + "        <PmtTpInf>"
            + "          <SvcLvl>"
            + "            <Cd>SEPA</Cd>"
            + "          </SvcLvl>"
            + "        </PmtTpInf>"
            + "        <Dbtr>"
            + "          <Nm>Horlogerie du Joux, Mueller et Cie.</Nm>"
            + "        </Dbtr>"
            + "        <DbtrAcct>"
            + "          <Id>"
            + "            <IBAN>CH5598064001234567890</IBAN>"
            + "          </Id>"
            + "        </DbtrAcct>"
            + "        <DbtrAgt>"
            + "          <FinInstnId>"
            + "            <BICFI>FOOICHBBXXX</BICFI>"
            + "          </FinInstnId>"
            + "        </DbtrAgt>"
            + "        <CdtrAgt>"
            + "          <FinInstnId>"
            + "            <BICFI>FOOYDEFFXXX</BICFI>"
            + "          </FinInstnId>"
            + "        </CdtrAgt>"
            + "        <Cdtr>"
            + "          <Nm>Uhrengrosshandel Buxtehude, Peter Maier und Co.</Nm>"
            + "        </Cdtr>"
            + "        <CdtrAcct>"
            + "          <Id>"
            + "            <IBAN>DE47100100001234567890</IBAN>"
            + "          </Id>"
            + "        </CdtrAcct>"
            + "      </OrgnlTxRef>"
            + "    </TxInf>"
            + "  </FIToFIPmtStsReq>"
            + "</Document>";

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
                + "<Message>"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
                + "<Fr> "
                + "	<FIId>"
                + "		<FinInstnId>"
                + "			<BICFI>FOOCUS3NXXX</BICFI>"
                + "			<ClrSysMmbId>"
                + "				<ClrSysId>"
                + "					<Prtry>T2S</Prtry>"
                + "				</ClrSysId>"
                + "				<MmbId>ADMNUSERLUXCSDT1</MmbId>"
                + "			</ClrSysMmbId>"
                + "			<Othr>"
                + "				<Id>FOOTXE2SXXX</Id>"
                + "				</Othr> "
                + "		</FinInstnId> "
                + "	</FIId> "
                + "</Fr> "
                + "<To> "
                + "	<FIId>"
                + "		<FinInstnId>"
                + "			<BICFI>ABICUS33</BICFI>"
                + "			<Othr>"
                + "				<Id>AARBDE5W100</Id>"
                + "			</Othr>"
                + "		</FinInstnId> "
                + "	</FIId> "
                + "</To> "
                + "<BizMsgIdr>2012111915360885</BizMsgIdr>"
                + "<MsgDefIdr>seev.031.002.03</MsgDefIdr> "
                + "<BizSvc>CSD</BizSvc> "
                + "<CreDt>2015-08-27T08:59:00Z</CreDt>"
                + "</AppHdr>"
                + "<Document></Document>"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.031.002.03", id.id());
        assertEquals("CSD", id.getBusinessService().orElse(null));
    }

    @Test
    public void testIdentifyMessage_LegacyBAH() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Message>"
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
                + "<Document></Document>"
                + "</Message>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("seev.037.002.02", id.id());
    }

    @Test
    void identifySettlementMethodCLRG() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RequestPayload>"
                + "    <SwIntRef:Request xmlns:SwIntRef=\"urn:swift:snl:ns.SwInt\">"
                + "        <SwIntRef:RequestControl/><SwIntRef:RequestHeader>"
                + "            <SwIntRef:Requestor>ou=xxx,o=irvtdefx,o=swift</SwIntRef:Requestor>"
                + "            <SwIntRef:Responder>cn=rtgs,o=xxxtxepm,o=swift</SwIntRef:Responder>"
                + "            <SwIntRef:Service>esmig.t2.iast!pu</SwIntRef:Service>"
                + "            <SwIntRef:RequestType>pacs.009.001.08</SwIntRef:RequestType>"
                + "        </SwIntRef:RequestHeader>"
                + "    </SwIntRef:Request>"
                + "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">"
                + "        <Fr>"
                + "            <FIId>"
                + "                <FinInstnId>"
                + "                    <BICFI>FOOGDEFXXXX</BICFI>"
                + "                    <ClrSysMmbId>"
                + "                        <MmbId>DEFOOGDEFXXXX</MmbId>"
                + "                    </ClrSysMmbId>"
                + "                </FinInstnId>"
                + "            </FIId>"
                + "        </Fr>"
                + "        <To>"
                + "            <FIId>"
                + "                <FinInstnId>"
                + "                    <BICFI>FOOVFRPPXXX</BICFI>"
                + "                </FinInstnId>"
                + "            </FIId>"
                + "        </To>"
                + "        <BizMsgIdr>VKS7695859976572</BizMsgIdr>"
                + "        <MsgDefIdr>pacs.009.001.08CORE</MsgDefIdr>"
                + "        <BizSvc>cbn.rtgs.01</BizSvc>"
                + "        <CreDt>2023-04-14T12:31:30.236Z</CreDt>"
                + "    </AppHdr>"
                + "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.08\">"
                + "        <FICdtTrf>"
                + "            <GrpHdr>"
                + "                <MsgId>NONREF</MsgId>"
                + "                <CreDtTm>2023-04-14T12:31:30+00:00</CreDtTm>"
                + "                <NbOfTxs>1</NbOfTxs>"
                + "                <SttlmInf>"
                + "                    <SttlmMtd>CLRG</SttlmMtd>"
                + "                    <ClrSys>"
                + "                        <Cd>TGT</Cd>"
                + "                    </ClrSys>"
                + "                </SttlmInf>"
                + "            </GrpHdr>"
                + "            <CdtTrfTxInf>"
                + "                <PmtId>"
                + "                    <InstrId>VKS7695859976572</InstrId>"
                + "                    <EndToEndId>YMBNK991G7GX51X</EndToEndId>"
                + "                    <UETR>33087b8e-2dfb-40b5-a432-769585867545</UETR>"
                + "                </PmtId>"
                + "                <PmtTpInf>"
                + "                    <SvcLvl>"
                + "                        <Cd>G004</Cd>"
                + "                    </SvcLvl>"
                + "                    <CtgyPurp>"
                + "                        <Cd>SUPP</Cd>"
                + "                    </CtgyPurp>"
                + "                </PmtTpInf>"
                + "                <IntrBkSttlmAmt Ccy=\"EUR\">1000.00</IntrBkSttlmAmt>"
                + "                <IntrBkSttlmDt>2023-04-14</IntrBkSttlmDt>"
                + "                <PrvsInstgAgt1>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOUFR21XXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </PrvsInstgAgt1>"
                + "                <InstgAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOGDEFXXXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </InstgAgt>"
                + "                <InstdAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVFRPPXXX</BICFI>"
                + "                    </FinInstnId>"
                + "                </InstdAgt>"
                + "                <Dbtr>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOWDK22XXX</BICFI>"
                + "                        <Nm>ARBEJDSMARKEDETS TILLAEGSPENSION</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>3400</PstCd>"
                + "                            <TwnNm>REGION HOVEDSTADEN</TwnNm>"
                + "                            <Ctry>DK</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </Dbtr>"
                + "                <DbtrAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOGBEBBXXX</BICFI>"
                + "                        <Nm>THE BANK OF NEW YORK MELLON SA/NV</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>1000</PstCd>"
                + "                            <TwnNm>BRUXELLES-CAPITALE</TwnNm>"
                + "                            <Ctry>BE</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </DbtrAgt>"
                + "                <CdtrAgt>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVGB2LLON</BICFI>"
                + "                        <Nm>SOCIETE GENERALE</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>E14 4SG</PstCd>"
                + "                            <TwnNm>GREATER LONDON</TwnNm>"
                + "                            <Ctry>GB</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </CdtrAgt>"
                + "                <Cdtr>"
                + "                    <FinInstnId>"
                + "                        <BICFI>FOOVNL2AXXX</BICFI>"
                + "                        <Nm>SOCIETE GENERALE</Nm>"
                + "                        <PstlAdr>"
                + "                            <PstCd>1096 HA</PstCd>"
                + "                            <TwnNm>NOORD-HOLLAND</TwnNm>"
                + "                            <Ctry>NL</Ctry>"
                + "                        </PstlAdr>"
                + "                    </FinInstnId>"
                + "                </Cdtr>"
                + "            </CdtTrfTxInf>"
                + "        </FICdtTrf>"
                + "    </Document>"
                + "</RequestPayload>";
        MxId id = MxParseUtils.identifyMessage(xml).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.009.001.08", id.id());
        assertEquals("cbn.rtgs.01", id.getBusinessService().orElse(null));
        Optional<SettlementInfo> settlementInfo = MxParseUtils.getSettlementInfo(xml);
        assertTrue(settlementInfo.isPresent());
        assertEquals(SettlementMethod.CLRG, settlementInfo.get().getSettlementMethod());
        assertEquals("TGT", settlementInfo.get().getClrSysCd());
    }

    @Test
    void identifySettlementMethodINDA() {
        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());
        assertFalse(id.getBusinessService().isPresent());
        Optional<SettlementInfo> settlementInfo = MxParseUtils.getSettlementInfo(xml_pacs_008_001_01);
        assertTrue(settlementInfo.isPresent());
        assertEquals(SettlementMethod.INDA, settlementInfo.get().getSettlementMethod());
        assertEquals("ABE", settlementInfo.get().getClrSysPrtry());
    }

    @Test
    void testFindFieldValueByTags() throws XMLStreamException {

        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());

        Optional<XMLStreamReader> msgId =
                MxParseUtils.findElementByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "GrpHdr", "MsgId");
        Optional<XMLStreamReader> BICFI = MxParseUtils.findElementByTags(
                xml_pacs_008_001_01, "FIToFIPmtStsReq", "GrpHdr", "InstgAgt", "FinInstnId", "BICFI");
        Optional<XMLStreamReader> sttlmMtd = MxParseUtils.findElementByTags(
                xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "OrgnlTxRef", "SttlmInf", "SttlmMtd");
        Optional<XMLStreamReader> prtry = MxParseUtils.findElementByTags(
                xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "OrgnlTxRef", "SttlmInf", "ClrSys", "Prtry");
        Optional<XMLStreamReader> IBAN = MxParseUtils.findElementByTags(
                xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "OrgnlTxRef", "CdtrAcct", "Id", "IBAN");
        Optional<XMLStreamReader> IBAN_invalid =
                MxParseUtils.findElementByTags(xml_pacs_008_001_01, "FIToFIPmtStsReq", "TxInf", "Id", "Foo", "IBAN");

        assertTrue(msgId.isPresent());
        assertEquals("MSGID-pacs028-20190529-1", msgId.get().getElementText());

        assertTrue(BICFI.isPresent());
        assertEquals("FOOICHBBXXX", BICFI.get().getElementText());

        assertTrue(sttlmMtd.isPresent());
        assertEquals("INDA", sttlmMtd.get().getElementText());

        assertTrue(prtry.isPresent());
        assertEquals("ABE", prtry.get().getElementText());

        assertTrue(IBAN.isPresent());
        assertEquals("DE47100100001234567890", IBAN.get().getElementText());

        assertFalse(IBAN_invalid.isPresent());
    }

    @Test
    void testFindFieldValueByAbsolutePathPacs() throws XMLStreamException {

        MxId id = MxParseUtils.identifyMessage(xml_pacs_008_001_01).orElse(null);
        assertNotNull(id);
        assertEquals("pacs.028.001.01", id.id());

        Optional<XMLStreamReader> msgId =
                MxParseUtils.findElementByAbsolutePath(xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/GrpHdr/MsgId");
        Optional<XMLStreamReader> BICFI = MxParseUtils.findElementByAbsolutePath(
                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/GrpHdr/InstgAgt/FinInstnId/BICFI");
        Optional<XMLStreamReader> sttlmMtd = MxParseUtils.findElementByAbsolutePath(
                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/SttlmInf/SttlmMtd");
        Optional<XMLStreamReader> prtry = MxParseUtils.findElementByAbsolutePath(
                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/SttlmInf/ClrSys/Prtry");
        Optional<XMLStreamReader> IBAN = MxParseUtils.findElementByAbsolutePath(
                xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/OrgnlTxRef/CdtrAcct/Id/IBAN");
        Optional<XMLStreamReader> IBAN_invalid =
                MxParseUtils.findElementByAbsolutePath(xml_pacs_008_001_01, "/Document/FIToFIPmtStsReq/TxInf/Id/Foo/IBAN");

        assertTrue(msgId.isPresent());
        assertEquals("MSGID-pacs028-20190529-1", msgId.get().getElementText());

        assertTrue(BICFI.isPresent());
        assertEquals("FOOICHBBXXX", BICFI.get().getElementText());

        assertTrue(sttlmMtd.isPresent());
        assertEquals("INDA", sttlmMtd.get().getElementText());

        assertTrue(prtry.isPresent());
        assertEquals("ABE", prtry.get().getElementText());

        assertTrue(IBAN.isPresent());
        assertEquals("DE47100100001234567890", IBAN.get().getElementText());

        assertFalse(IBAN_invalid.isPresent());
    }

    @Test
    void testFindFieldValueByAbsolutePathCamt() throws XMLStreamException {

        String xml_camt_053_001_12 = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<RequestPayload>\n" +
                "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.04\">\n" +
                "    <head:Fr>\n" +
                "        <head:FIId>\n" +
                "            <head:FinInstnId>\n" +
                "                <head:BICFI>FOOBAR22XXX</head:BICFI>\n" +
                "            </head:FinInstnId>\n" +
                "        </head:FIId>\n" +
                "    </head:Fr>\n" +
                "    <head:To>\n" +
                "        <head:FIId>\n" +
                "            <head:FinInstnId>\n" +
                "                <head:BICFI>ABNABRSPBHE</head:BICFI>\n" +
                "            </head:FinInstnId>\n" +
                "        </head:FIId>\n" +
                "    </head:To>\n" +
                "    <head:BizMsgIdr>asdfasdsdd</head:BizMsgIdr>\n" +
                "    <head:MsgDefIdr>camt.053.001.12</head:MsgDefIdr>\n" +
                "    <head:CreDt>2024-12-09T09:45:41-03:00</head:CreDt>\n" +
                "    <head:BizPrcgDt>2024-12-09T09:45:41-03:00</head:BizPrcgDt>\n" +
                "</head:AppHdr>\n" +
                "<camt:Document xmlns:camt=\"urn:iso:std:iso:20022:tech:xsd:camt.053.001.12\">\n" +
                "    <camt:BkToCstmrStmt>\n" +
                "        <camt:GrpHdr>\n" +
                "            <camt:MsgId>asdfasd</camt:MsgId>\n" +
                "            <camt:CreDtTm>2024-12-09T09:36:46-03:00</camt:CreDtTm>\n" +
                "            <camt:MsgPgntn>\n" +
                "                <camt:PgNb>1234</camt:PgNb>\n" +
                "                <camt:LastPgInd>false</camt:LastPgInd>\n" +
                "            </camt:MsgPgntn>\n" +
                "        </camt:GrpHdr>\n" +
                "        <camt:Stmt>\n" +
                "            <camt:Id>asdfasdf</camt:Id>\n" +
                "            <camt:ElctrncSeqNb>2233</camt:ElctrncSeqNb>\n" +
                "            <camt:LglSeqNb>2445</camt:LglSeqNb>\n" +
                "            <camt:Acct>\n" +
                "                <camt:Ccy>USD</camt:Ccy>\n" +
                "                <camt:Nm>asdff</camt:Nm>\n" +
                "                <camt:Prxy>\n" +
                "                    <camt:Tp>\n" +
                "                        <camt:Cd>TELE</camt:Cd>\n" +
                "                    </camt:Tp>\n" +
                "                    <camt:Id>23423</camt:Id>\n" +
                "                </camt:Prxy>\n" +
                "            </camt:Acct>\n" +
                "            <camt:Bal>\n" +
                "                <camt:Tp>\n" +
                "                    <camt:CdOrPrtry>\n" +
                "                        <camt:Cd>FWAV</camt:Cd>\n" +
                "                    </camt:CdOrPrtry>\n" +
                "                </camt:Tp>\n" +
                "                <camt:Amt Ccy=\"USD\">2323</camt:Amt>\n" +
                "                <camt:CdtDbtInd>CRDT</camt:CdtDbtInd>\n" +
                "                <camt:Dt>\n" +
                "                    <camt:Dt>2024-12-10</camt:Dt>\n" +
                "                </camt:Dt>\n" +
                "            </camt:Bal>\n" +
                "        </camt:Stmt>\n" +
                "    </camt:BkToCstmrStmt>\n" +
                "</camt:Document>\n" +
                "</RequestPayload>";

        MxId id = MxParseUtils.identifyMessage(xml_camt_053_001_12).orElse(null);
        assertNotNull(id);
        assertEquals("camt.053.001.12", id.id());

        Optional<XMLStreamReader> BICFI =
                MxParseUtils.findElementByAbsolutePath(xml_camt_053_001_12, "/AppHdr/Fr/FIId/FinInstnId/BICFI");
        Optional<XMLStreamReader> bizPrcgDt = MxParseUtils.findElementByAbsolutePath(xml_camt_053_001_12, "/AppHdr/BizPrcgDt");
        Optional<XMLStreamReader> pgNb =
                MxParseUtils.findElementByAbsolutePath(xml_camt_053_001_12, "/Document/BkToCstmrStmt/GrpHdr/MsgPgntn/PgNb");
        Optional<XMLStreamReader> lastPgInd = MxParseUtils.findElementByAbsolutePath(
                xml_camt_053_001_12, "/Document/BkToCstmrStmt/GrpHdr/MsgPgntn/LastPgInd");
        Optional<XMLStreamReader> IBAN_invalid =
                MxParseUtils.findElementByAbsolutePath(xml_camt_053_001_12, "/Document/FIToFIPmtStsReq/TxInf/Id/Foo/IBAN");

        assertTrue(BICFI.isPresent());
        assertEquals("FOOBAR22XXX", BICFI.get().getElementText());

        assertTrue(bizPrcgDt.isPresent());
        assertEquals("2024-12-09T09:45:41-03:00", bizPrcgDt.get().getElementText());

        assertTrue(pgNb.isPresent());
        assertEquals("1234", pgNb.get().getElementText());

        assertTrue(lastPgInd.isPresent());
        assertEquals("false", lastPgInd.get().getElementText());

        assertFalse(IBAN_invalid.isPresent());
    }
}
