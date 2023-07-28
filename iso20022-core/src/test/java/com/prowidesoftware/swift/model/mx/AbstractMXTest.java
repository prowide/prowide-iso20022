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

import com.prowidesoftware.swift.model.MxId;
import org.junit.jupiter.api.Test;

/**
 * Test for the Mx parser API in the base {@link AbstractMX} class
 */
public class AbstractMXTest {

    @Test
    public void testMx() {
        final String xml =
                "		<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.02\" xmlns:xsi=\"{http://www.w3.org/2000/xmlns/}Doc\">\n"
                        + "			<Doc:FXTradInstr>\n"
                        + "				<Doc:TradInf>\n"
                        + "					<Doc:OrgtrRef>QCOUCN</Doc:OrgtrRef>\n"
                        + "					<Doc:CmonRef>ABCB334209XYZB33</Doc:CmonRef>\n"
                        + "					<Doc:OprTp>CANC</Doc:OprTp>\n"
                        + "				</Doc:TradInf>\n"
                        + "			</Doc:FXTradInstr>\n"
                        + "		</Doc:Document>";

        /*
         * class parser call
         */
        MxFxtr01400102 mx = MxFxtr01400102.parse(xml);
        assertNotNull(mx);
        assertNull(mx.getAppHdr());
        assertNotNull(mx.getFXTradInstr());
        assertEquals("QCOUCN", mx.getFXTradInstr().getTradInf().getOrgtrRef());

        /*
         * Mx parser call
         */
        MxFxtr01400102 mx2 = (MxFxtr01400102) AbstractMX.parse(xml, new MxId("fxtr", "014", "001", "02"));
        assertNotNull(mx2);
        assertNull(mx2.getAppHdr());
        assertNotNull(mx2.getFXTradInstr());
        assertEquals("QCOUCN", mx2.getFXTradInstr().getTradInf().getOrgtrRef());

        /*
         * Mx parser call (no id)
         */
        MxFxtr01400102 mx3 = (MxFxtr01400102) AbstractMX.parse(xml, null);
        assertNotNull(mx3);
        assertNull(mx3.getAppHdr());
        assertNotNull(mx3.getFXTradInstr());
        assertEquals("QCOUCN", mx3.getFXTradInstr().getTradInf().getOrgtrRef());
    }

    @Test
    public void testMxExtraNS() {
        String xml2 =
                "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.02\" xmlns:SwMsg=\"urn:swift:snl:ns.SwMsg\" xmlns:xsi=\"{http://www.w3.org/2000/xmlns/}Doc\">\n"
                        + "	<Doc:FXTradInstr>\n"
                        + "		<Doc:TradInf>\n"
                        + "			<Doc:OrgtrRef>QCOUCN</Doc:OrgtrRef>\n"
                        + "			<Doc:CmonRef>ABCB334209XYZB33</Doc:CmonRef>\n"
                        + "			<Doc:OprTp>CANC</Doc:OprTp>\n"
                        + "		</Doc:TradInf>\n"
                        + "	</Doc:FXTradInstr>\n"
                        + "</Doc:Document>";
        MxFxtr01400102 mx = (MxFxtr01400102) AbstractMX.parse(xml2, null);
        assertNotNull(mx);
        assertNull(mx.getAppHdr());
        assertNotNull(mx.getFXTradInstr());
        assertEquals("QCOUCN", mx.getFXTradInstr().getTradInf().getOrgtrRef());
    }

    @Test
    public void testParseXsys() {
        String xml =
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.011.001.02\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">\n"
                        + "        <Doc:xsys.011.001.02>\n"
                        + "          <Doc:DlvryNtfctn>\n"
                        + "            <Sw:SnFRef>swf00000-2020-07-28T15:11:11.123456Z</Sw:SnFRef>\n"
                        + "            <Sw:SnFRefType>InterAct</Sw:SnFRefType>\n"
                        + "            <Sw:AcceptStatus>Accepted</Sw:AcceptStatus>\n"
                        + "            <Sw:DeliveryTime>2020-07-28T15:11:08Z</Sw:DeliveryTime>\n"
                        + "            <Sw:AckSwiftTime>2020-07-28T15:11:08Z</Sw:AckSwiftTime>\n"
                        + "            <Sw:FileRequestHeader>\n"
                        + "                 <SwInt:Requestor>cn=gtxdev,o=rtbsgb2l,o=swift</SwInt:Requestor>\n"
                        + "                 <SwInt:Responder>cn=gtxdev,o=rtbsgb2l,o=swift</SwInt:Responder>\n"
                        + "                 <SwInt:Service>swift.finplus!pc</SwInt:Service>\n"
                        + "                 <SwInt:RequestType>seev.047.001.01</SwInt:RequestType>\n"
                        + "                 <SwInt:Priority>Normal</SwInt:Priority>\n"
                        + "                 <SwInt:RequestRef>FOO123456</SwInt:RequestRef>\n"
                        + "            </Sw:FileRequestHeader>\n"
                        + "            <Doc:Xtnsn>\n"
                        + "              <Doc:PlcAndNm>PlaceAndName</Doc:PlcAndNm>\n"
                        + "              <Doc:XtnsnEnvlp>XtnsnEnvlp</Doc:XtnsnEnvlp>\n"
                        + "            </Doc:Xtnsn>\n"
                        + "          </Doc:DlvryNtfctn>\n"
                        + "        </Doc:xsys.011.001.02>\n"
                        + "      </Doc:Document>";
        AbstractMX mx = AbstractMX.parse(xml);
        assertNotNull(mx);
    }

    @Test
    public void testUnrecognizedMessage() {
        String xml = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:DRAFT6camt.077.001.01\">\n" + "<BllgRpt>\n"
                + "    <MsgHdr>\n"
                + "        <MsgId>12345</MsgId>\n"
                + "        <CreDtTm>2022-05-24T10:29:05+08:00</CreDtTm>\n"
                + "        <ReqTp>\n"
                + "            <Prtry>\n"
                + "                <Id>Tax Invoice for RTGS Billing</Id>\n"
                + "            </Prtry>\n"
                + "        </ReqTp>\n"
                + "    </MsgHdr>\n"
                + "    <BllgRptOrErr>\n"
                + "        <BllgRpt>\n"
                + "            <RgltryData>\n"
                + "                <Invcr>\n"
                + "                    <Nm>The Monetary Authority of Foobar</Nm>\n"
                + "                    <PstlAdr>\n"
                + "                        <AdrLine>99 Foo Way, FOO Building 012345</AdrLine>\n"
                + "                    </PstlAdr>\n"
                + "                    <Id>\n"
                + "                        <OrgId>\n"
                + "                            <Othr>\n"
                + "                                <Id>M12343076J</Id>\n"
                + "                            </Othr>\n"
                + "                        </OrgId>\n"
                + "                    </Id>\n"
                + "                </Invcr>\n"
                + "                <Invcee>\n"
                + "                    <Nm>FOO BANK OF FOOBAR</Nm>\n"
                + "                    <PstlAdr>\n"
                + "                        <AdrLine>44 Street Unit 27-01/08 Foobar Hub 012345</AdrLine>\n"
                + "                    </PstlAdr>\n"
                + "                </Invcee>\n"
                + "                <InvcLglStmt>See further information on the RTGS Billing Detail screen</InvcLglStmt>\n"
                + "            </RgltryData>\n"
                + "            <InvcDt>2022-05-24</InvcDt>\n"
                + "            <BllgId>I22/123/0123</BllgId>\n"
                + "            <BllgPrd>\n"
                + "                <FrDt>2022-05-25</FrDt>\n"
                + "                <ToDt>2022-05-25</ToDt>\n"
                + "            </BllgPrd>\n"
                + "            <InvcTtls>\n"
                + "                <Tax>\n"
                + "                    <Rate>7</Rate>\n"
                + "                    <TaxblAmt Ccy=\"SGD\">0.30</TaxblAmt>\n"
                + "                    <Amt Ccy=\"SGD\">0.02</Amt>\n"
                + "                </Tax>\n"
                + "                <TtlInvcAmt Ccy=\"SGD\">0.32</TtlInvcAmt>\n"
                + "                <PmtDueDt>2022-05-24</PmtDueDt>\n"
                + "            </InvcTtls>\n"
                + "            <SvcCtgyTtls>\n"
                + "                <AcctId>\n"
                + "                    <CshAcctId>\n"
                + "                        <Othr>\n"
                + "                            <Id>12340100</Id>\n"
                + "                        </Othr>\n"
                + "                    </CshAcctId>\n"
                + "                </AcctId>\n"
                + "                <TtlInvcAmt Ccy=\"SGD\">0.32</TtlInvcAmt>\n"
                + "                <SvcCtgy>CHAR</SvcCtgy>\n"
                + "            </SvcCtgyTtls>\n"
                + "        </BllgRpt>\n"
                + "    </BllgRptOrErr>\n"
                + "</BllgRpt>\n"
                + "</Document>\n";
        AbstractMX mx = AbstractMX.parse(xml);
        assertNull(mx);
    }
}
