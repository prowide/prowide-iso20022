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
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.utils.Lib;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;
import org.xmlunit.xpath.JAXPXPathEngine;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

import static javax.xml.XMLConstants.DEFAULT_NS_PREFIX;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.xmlunit.matchers.HasXPathMatcher.hasXPath;

/**
 * Test cases for specific conditions of the {@link XmlEventWriter}
 * <p>
 * The test cases use the message serialization API calls though, but the intention is always to cover a specific
 * condition of the event writer.
 */
public class XmlEventWriterTest {
    public static final String LINE_SEPARATOR = System.lineSeparator();
    private JAXPXPathEngine engine = new JAXPXPathEngine();

    @Test
    public void test_whiteSpaceInAttribute() throws IOException {
        String xml = Lib.readResource("seev.031.002.09.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
        String xmlResult = mx.message();
        // original issue
        assertFalse(xmlResult.contains("<Doc:Amt Ccy=\"USD\" >0.000000</Doc:Amt>"));
        // expected result
        assertTrue(xmlResult.contains("<Doc:Amt Ccy=\"USD\">0.000000</Doc:Amt>"));
    }

    @Test
    public void test_missingNewLine() throws IOException {
        String xml = Lib.readResource("seev.031.002.09.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
        String xmlResult = mx.message();
        // Original issue
        assertFalse(xmlResult.contains("<Doc:Dt>" + LINE_SEPARATOR +
                "                        <Doc:Dt>2021-11-11</Doc:Dt></Doc:Dt>"));
        // Excpected result
        assertTrue(xmlResult.contains(" <Doc:Dt>" + LINE_SEPARATOR +
                "                        <Doc:Dt>2021-11-11</Doc:Dt>" + LINE_SEPARATOR +
                "                    </Doc:Dt>"));
    }

    private void assertMessage(MxSeev03100209 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().from());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().to());
        assertEquals("1111111111111111", mx.getAppHdr().reference());
        assertNotNull(mx.getCorpActnNtfctn());
        assertEquals(CorporateActionNotificationType1Code.REPL, mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
        assertEquals("111111111", mx.getCorpActnNtfctn().getCorpActnGnlInf().getCorpActnEvtId());
        assertEquals(SafekeepingAccountIdentification1Code.GENR, mx.getCorpActnNtfctn().getAcctDtls().getForAllAccts().getIdCd());
    }

    @Test
    public void testHeaderWithSignature() throws IOException {
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.02";
        String xml = Lib.readResource("header-with-signature.xml");
        assertNotNull(xml);
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        //System.out.println(h.xml());
        String xmlResult = h.xml();
        //System.out.println(xmlResult);
        assertTrue(xmlResult.contains("        <SignatureEnvelope>" + LINE_SEPARATOR +
                "            <Regy>A</Regy>" + LINE_SEPARATOR +
                "            <Regy>B</Regy>" + LINE_SEPARATOR +
                "            <Regy>C</Regy>" + LINE_SEPARATOR +
                "        </SignatureEnvelope>" + LINE_SEPARATOR));

        testXpath(xmlResult, nameSpace, "/:AppHdr/:Sgntr/:SignatureEnvelope/:Regy[1]", "A");
        testXpath(xmlResult, nameSpace, "/:AppHdr/:Sgntr/:SignatureEnvelope/:Regy[2]", "B");
        testXpath(xmlResult, nameSpace, "/:AppHdr/:Sgntr/:SignatureEnvelope/:Regy[3]", "C");
    }

    @Test
    public void testPacs008WithRepetitiveCharges() {
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08";
        MxPacs00800108 mx = new MxPacs00800108();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV08());
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransaction39());
        CreditTransferTransaction39 tx = mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        Charges7 ch1 = new Charges7().setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("1.00")));
        Charges7 ch2 = new Charges7().setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("2.00")));
        Charges7 ch3 = new Charges7().setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("3.00")));
        Charges7 ch4 = new Charges7().setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("4.00")));

        tx.addChrgsInf(ch1);
        tx.addChrgsInf(ch2);
        tx.addChrgsInf(ch3);
        tx.addChrgsInf(ch4);

        String xmlResult = mx.message();
        //System.out.println(xmlResult);

        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:ChrgsInf/:Amt", "1.00");
        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:ChrgsInf[2]/:Amt", "2.00");
        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:ChrgsInf[3]/:Amt", "3.00");
        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:ChrgsInf[4]/:Amt", "4.00");
    }

    @Test
    public void testPacs008WithRepetitiveCreditorLines() {
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08";
        MxPacs00800108 mx = new MxPacs00800108();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV08());
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransaction39());
        CreditTransferTransaction39 tx = mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        tx.setCdtr(new PartyIdentification135());
        tx.getCdtr().setPstlAdr(new PostalAddress24());
        tx.getCdtr().getPstlAdr().addAdrLine("line 1");
        tx.getCdtr().getPstlAdr().addAdrLine("line 2");
        tx.getCdtr().getPstlAdr().addAdrLine("line 3");

        String xmlResult = mx.message();
        //System.out.println(xmlResult);

        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[1]", "line 1");
        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[2]", "line 2");
        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[3]", "line 3");
    }


    @Test
    public void testEmptyElementPropagation() {
        String indent = "   ";
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08";
        MxPacs00800108 mx = new MxPacs00800108();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV08());
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransaction39());
        CreditTransferTransaction39 tx = mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        tx.setCdtr(new PartyIdentification135());
        tx.getCdtr().setPstlAdr(new PostalAddress24());
        tx.getCdtr().getPstlAdr().addAdrLine(indent);

        String xmlResult = mx.message();
        //System.out.println(xmlResult);

        testXpath(xmlResult, nameSpace, "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine", indent);
    }

    @Test
    public void testXmlPadding() {
        MxCamt00300106 mx = new MxCamt00300106();
        mx.setGetAcct(new GetAccountV06());
        mx.getGetAcct().setAcctQryDef(new AccountQuery2());
        mx.getGetAcct().getAcctQryDef().setAcctCrit(new AccountCriteria2Choice());
        mx.getGetAcct().getAcctQryDef().getAcctCrit().setQryNm("FOO");
        String xml = mx.message();
        //System.out.println(xml);
        assertTrue(xml.contains("     <Doc:QryNm>"));
    }

    @Test
    public void testNoBlankLines() {
        MxPain00100108 mx = new MxPain00100108();

        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV08());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader48());
        mx.getCstmrCdtTrfInitn().getGrpHdr().setCtrlSum(new BigDecimal(100));
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("asdfasd");
        mx.getCstmrCdtTrfInitn().addPmtInf(new PaymentInstruction22());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setDbtr(new PartyIdentification43().setNm("foo"));
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setChrgBr(ChargeBearerType1Code.CRED);

        //System.out.println(mx.message());
        Arrays.stream(mx.message().split("\\r?\\n")).forEach(line -> assertTrue(StringUtils.isNotBlank(line)));
    }

    private void testXpath(String xml, String nameSpace, String path, String expected) {
        HashMap<String, String> nameSpaceContext = new HashMap(1) {{
            put(DEFAULT_NS_PREFIX, nameSpace);
        }};
        // Verifies that the xml path exists
        assertThat(Input.fromString(xml), hasXPath(path).withNamespaceContext(nameSpaceContext));

        engine.setNamespaceContext(nameSpaceContext);
        String eval = engine.evaluate(path, Input.fromString(xml).build());
        // Verifies that the value contained in the path
        assertEquals(expected, eval);
    }

}
