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

import static javax.xml.XMLConstants.DEFAULT_NS_PREFIX;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.xmlunit.matchers.HasXPathMatcher.hasXPath;

import com.prowidesoftware.swift.model.MxNode;
import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLStreamException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;
import org.xmlunit.xpath.JAXPXPathEngine;

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
        assertFalse(xmlResult.contains("<seev:Amt Ccy=\"USD\" >0.000000</seev:Amt>"));
        // expected result
        assertTrue(xmlResult.contains("<seev:Amt Ccy=\"USD\">0.000000</seev:Amt>"));
    }

    @Test
    public void test_missingNewLine() throws IOException {
        String xml = Lib.readResource("seev.031.002.09.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
        String xmlResult = mx.message();
        // Original issue
        assertFalse(xmlResult.contains(
                "<seev:Dt>" + LINE_SEPARATOR + "                        <seev:Dt>2021-11-11</seev:Dt></seev:Dt>"));
        // Excpected result
        assertTrue(xmlResult.contains(
                " <seev:Dt>" + LINE_SEPARATOR + "                        <seev:Dt>2021-11-11</seev:Dt>" + LINE_SEPARATOR
                        + "                    </seev:Dt>"));
    }

    private void assertMessage(MxSeev03100209 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().from());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().to());
        assertEquals("1111111111111111", mx.getAppHdr().reference());
        assertNotNull(mx.getCorpActnNtfctn());
        assertEquals(
                CorporateActionNotificationType1Code.REPL,
                mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
        assertEquals("111111111", mx.getCorpActnNtfctn().getCorpActnGnlInf().getCorpActnEvtId());
        assertEquals(
                SafekeepingAccountIdentification1Code.GENR,
                mx.getCorpActnNtfctn().getAcctDtls().getForAllAccts().getIdCd());
    }

    @Test
    public void testHeaderWithSignature() throws IOException {
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.02";
        String xml = Lib.readResource("header-with-signature.xml");
        assertNotNull(xml);
        BusinessAppHdrV02 h = BusinessAppHdrV02.parse(xml);
        assertNotNull(h);
        // System.out.println(h.xml());
        String xmlResult = h.xml();
        // System.out.println(xmlResult);
        assertTrue(xmlResult.contains("        <SignatureEnvelope>" + LINE_SEPARATOR + "            <Regy>A</Regy>"
                + LINE_SEPARATOR + "            <Regy>B</Regy>"
                + LINE_SEPARATOR + "            <Regy>C</Regy>"
                + LINE_SEPARATOR + "        </SignatureEnvelope>"
                + LINE_SEPARATOR));

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
        CreditTransferTransaction39 tx =
                mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        Charges7 ch1 = new Charges7()
                .setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("1.00")));
        Charges7 ch2 = new Charges7()
                .setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("2.00")));
        Charges7 ch3 = new Charges7()
                .setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("3.00")));
        Charges7 ch4 = new Charges7()
                .setAmt(new ActiveOrHistoricCurrencyAndAmount().setCcy("USD").setValue(new BigDecimal("4.00")));

        tx.addChrgsInf(ch1);
        tx.addChrgsInf(ch2);
        tx.addChrgsInf(ch3);
        tx.addChrgsInf(ch4);

        String xmlResult = mx.message();
        // System.out.println(xmlResult);

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
        CreditTransferTransaction39 tx =
                mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        tx.setCdtr(new PartyIdentification135());
        tx.getCdtr().setPstlAdr(new PostalAddress24());
        tx.getCdtr().getPstlAdr().addAdrLine("line 1");
        tx.getCdtr().getPstlAdr().addAdrLine("line 2");
        tx.getCdtr().getPstlAdr().addAdrLine("line 3");

        String xmlResult = mx.message();
        // System.out.println(xmlResult);

        testXpath(
                xmlResult,
                nameSpace,
                "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[1]",
                "line 1");
        testXpath(
                xmlResult,
                nameSpace,
                "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[2]",
                "line 2");
        testXpath(
                xmlResult,
                nameSpace,
                "/:Document/:FIToFICstmrCdtTrf/:CdtTrfTxInf/:Cdtr/:PstlAdr/:AdrLine[3]",
                "line 3");
    }

    @Test
    public void testEmptyElementPropagation() {
        String indent = "   ";
        String nameSpace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08";
        MxPacs00800108 mx = new MxPacs00800108();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV08());
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransaction39());
        CreditTransferTransaction39 tx =
                mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0);

        tx.setCdtr(new PartyIdentification135());
        tx.getCdtr().setPstlAdr(new PostalAddress24());
        tx.getCdtr().getPstlAdr().addAdrLine(indent);

        String xmlResult = mx.message();
        // System.out.println(xmlResult);

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
        // System.out.println(xml);
        assertTrue(xml.contains("     <camt:QryNm>"));
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

        // System.out.println(mx.message());
        Arrays.stream(mx.message().split("\\r?\\n")).forEach(line -> assertTrue(StringUtils.isNotBlank(line)));
    }

    /*
     * PW-3591: event level tests of the foreign content mode. The events mimic what JAXB sends: model elements
     * without namespace, and DOM (xs:any) content with its own prefixes and declarations.
     */

    private static final XMLEventFactory EVENTS = XMLEventFactory.newInstance();
    private static final String XSI = "http://www.w3.org/2001/XMLSchema-instance";

    @Test
    public void test_foreignContentIsWrittenAsReceived() throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XmlEventWriter writer = new XmlEventWriter(sw, "p", false, "Document", null, "");
        writer.add(EVENTS.createStartElement("", "", "Document"));
        writer.add(EVENTS.createNamespace("ns2", "urn:a"));
        writer.add(EVENTS.createStartElement("", "", "Envlp"));
        // foreign content: default namespace plus two declarations, one reusing the document prefix
        writer.add(EVENTS.createStartElement("", "urn:b", "X"));
        writer.add(EVENTS.createNamespace("xsi", XSI));
        writer.add(EVENTS.createNamespace("p", "urn:c"));
        writer.add(EVENTS.createNamespace("urn:b"));
        writer.add(EVENTS.createAttribute("xsi", XSI, "type", "p:T"));
        writer.add(EVENTS.createStartElement("p", "urn:c", "Y"));
        writer.add(EVENTS.createCharacters("foo"));
        writer.add(EVENTS.createEndElement("p", "urn:c", "Y"));
        writer.add(EVENTS.createStartElement("", "", "Z"));
        writer.add(EVENTS.createNamespace(""));
        writer.add(EVENTS.createEndElement("", "", "Z"));
        writer.add(EVENTS.createEndElement("", "urn:b", "X"));
        writer.add(EVENTS.createEndElement("", "", "Envlp"));
        writer.add(EVENTS.createEndElement("", "", "Document"));

        String xml = sw.toString();
        assertTrue(xml.startsWith("<p:Document xmlns:p=\"urn:a\">"), xml);
        assertTrue(xml.contains("<p:Envlp>"), xml);
        assertTrue(
                xml.contains("<X xmlns:xsi=\"" + XSI + "\" xmlns:p=\"urn:c\" xmlns=\"urn:b\" xsi:type=\"p:T\">"), xml);
        assertTrue(xml.contains("<p:Y>foo</p:Y>"), xml);
        assertTrue(xml.contains("<Z xmlns=\"\"></Z>"), xml);
        assertTrue(xml.contains("</X>"), xml);
        assertTrue(xml.endsWith("</p:Envlp>" + LINE_SEPARATOR + "</p:Document>"), xml);
        assertNotNull(MxNode.parse(xml));
    }

    @Test
    public void test_mainNamespaceElementInsideForeignContentIsDeclaredLocally() throws XMLStreamException {
        for (String prefix : new String[] {"p", null}) {
            StringWriter sw = new StringWriter();
            XmlEventWriter writer = new XmlEventWriter(sw, prefix, false, "Document", null, "");
            writer.add(EVENTS.createStartElement("", "", "Document"));
            writer.add(EVENTS.createNamespace("ns2", "urn:a"));
            writer.add(EVENTS.createStartElement("", "urn:b", "X"));
            writer.add(EVENTS.createNamespace("urn:b"));
            // JAXB bound the main namespace at the root, so it sends the element without a declaration
            writer.add(EVENTS.createStartElement("ns2", "urn:a", "Y"));
            writer.add(EVENTS.createStartElement("ns2", "urn:a", "W"));
            writer.add(EVENTS.createEndElement("ns2", "urn:a", "W"));
            writer.add(EVENTS.createEndElement("ns2", "urn:a", "Y"));
            writer.add(EVENTS.createEndElement("", "urn:b", "X"));
            writer.add(EVENTS.createEndElement("", "", "Document"));

            String xml = sw.toString();
            assertTrue(xml.contains("<ns2:Y xmlns:ns2=\"urn:a\">"), xml);
            assertTrue(xml.contains("<ns2:W></ns2:W>"), xml);
            assertTrue(xml.contains("</ns2:Y>"), xml);
            assertNotNull(MxNode.parse(xml));
        }
    }

    @Test
    public void test_noNamespaceElementInsideForeignContentUndeclaresTheMainDefaultNamespace()
            throws XMLStreamException {
        // JAXB never binds the default namespace, so it sends a no-namespace element without xmlns="": the writer
        // must add it when the main namespace is written as the default namespace (no document prefix)
        for (String prefix : new String[] {"p", null}) {
            StringWriter sw = new StringWriter();
            XmlEventWriter writer = new XmlEventWriter(sw, prefix, false, "Document", null, "");
            writer.add(EVENTS.createStartElement("", "", "Document"));
            writer.add(EVENTS.createNamespace("ns2", "urn:a"));
            writer.add(EVENTS.createStartElement("f", "urn:b", "X"));
            writer.add(EVENTS.createNamespace("f", "urn:b"));
            writer.add(EVENTS.createStartElement("", "", "Y"));
            writer.add(EVENTS.createStartElement("", "", "W"));
            writer.add(EVENTS.createEndElement("", "", "W"));
            writer.add(EVENTS.createEndElement("", "", "Y"));
            writer.add(EVENTS.createEndElement("f", "urn:b", "X"));
            writer.add(EVENTS.createEndElement("", "", "Document"));

            String xml = sw.toString();
            if (prefix == null) {
                assertTrue(xml.contains("<Document xmlns=\"urn:a\">"), xml);
                assertTrue(xml.contains("<Y xmlns=\"\">"), xml);
            } else {
                assertTrue(xml.contains("<p:Document xmlns:p=\"urn:a\">"), xml);
                assertTrue(xml.contains("<Y>"), xml);
            }
            // the child inherits the undeclaration, nothing to repeat
            assertTrue(xml.contains("<W></W>"), xml);
            assertNotNull(MxNode.parse(xml));
        }
    }

    @Test
    public void test_namespacedAttributeInsideForeignContentIsDeclaredLocally() throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XmlEventWriter writer = new XmlEventWriter(sw, "p", false, "Document", null, "");
        writer.add(EVENTS.createStartElement("", "", "Document"));
        writer.add(EVENTS.createNamespace("ns2", "urn:a"));
        writer.add(EVENTS.createStartElement("f", "urn:f", "X"));
        writer.add(EVENTS.createNamespace("f", "urn:f"));
        writer.add(EVENTS.createAttribute("ns2", "urn:a", "ref", "1"));
        writer.add(EVENTS.createAttribute("xml", "http://www.w3.org/XML/1998/namespace", "lang", "en"));
        writer.add(EVENTS.createEndElement("f", "urn:f", "X"));
        writer.add(EVENTS.createEndElement("", "", "Document"));

        String xml = sw.toString();
        assertTrue(xml.contains("<f:X xmlns:f=\"urn:f\" ns2:ref=\"1\" xml:lang=\"en\" xmlns:ns2=\"urn:a\">"), xml);
        assertNotNull(MxNode.parse(xml));
    }

    @Test
    public void test_xsysNamespacesAreNotForeignContent() throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XmlEventWriter writer = new XmlEventWriter(sw, "p", false, "Document", null, "");
        writer.setPreferredPrefixes(Collections.singletonMap("urn:swift:snl:ns.Sw", "Sw"));
        writer.add(EVENTS.createStartElement("", "", "Document"));
        writer.add(EVENTS.createNamespace("ns2", "urn:a"));
        writer.add(EVENTS.createNamespace("ns3", "urn:swift:snl:ns.Sw"));
        writer.add(EVENTS.createStartElement("ns3", "urn:swift:snl:ns.Sw", "X"));
        // a model element without namespace nested in an xsys element keeps the document prefix
        writer.add(EVENTS.createStartElement("", "", "Y"));
        writer.add(EVENTS.createEndElement("", "", "Y"));
        writer.add(EVENTS.createEndElement("ns3", "urn:swift:snl:ns.Sw", "X"));
        writer.add(EVENTS.createEndElement("", "", "Document"));

        assertEquals(
                "<p:Document xmlns:p=\"urn:a\" xmlns:Sw=\"urn:swift:snl:ns.Sw\">" + LINE_SEPARATOR + "<Sw:X>"
                        + LINE_SEPARATOR + "<p:Y></p:Y>" + LINE_SEPARATOR + "</Sw:X>" + LINE_SEPARATOR
                        + "</p:Document>",
                sw.toString());
    }

    @Test
    public void test_namespacedAttributeOutsideForeignContent() throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XmlEventWriter writer = new XmlEventWriter(sw, "p", false, "Document", null, "");
        writer.add(EVENTS.createStartElement("", "", "Document"));
        writer.add(EVENTS.createNamespace("ns2", "urn:a"));
        writer.add(EVENTS.createStartElement("", "", "X"));
        writer.add(EVENTS.createAttribute("xsi", XSI, "type", "T"));
        writer.add(EVENTS.createAttribute("", "", "Ccy", "USD"));
        writer.add(EVENTS.createEndElement("", "", "X"));
        writer.add(EVENTS.createEndElement("", "", "Document"));

        String xml = sw.toString();
        assertTrue(xml.contains("<p:X xsi:type=\"T\" Ccy=\"USD\">"), xml);
        assertFalse(xml.contains("{" + XSI + "}"), xml);
    }

    @Test
    public void test_rootNamespaceFromItsQName() throws XMLStreamException {
        StringWriter sw = new StringWriter();
        XmlEventWriter writer = new XmlEventWriter(sw, "p", false, "AppHdr", null, "");
        // the AppHdr classes marshal the root with its namespace in the QName
        writer.add(EVENTS.createStartElement("", "urn:a", "AppHdr"));
        writer.add(EVENTS.createNamespace("ns2", "urn:a"));
        writer.add(EVENTS.createStartElement("", "", "Fr"));
        writer.add(EVENTS.createEndElement("", "", "Fr"));
        // urn:x is foreign, urn:a inside it is still the main namespace
        writer.add(EVENTS.createStartElement("x", "urn:x", "Sgntr"));
        writer.add(EVENTS.createNamespace("x", "urn:x"));
        writer.add(EVENTS.createStartElement("ns2", "urn:a", "Y"));
        writer.add(EVENTS.createEndElement("ns2", "urn:a", "Y"));
        writer.add(EVENTS.createEndElement("x", "urn:x", "Sgntr"));
        writer.add(EVENTS.createEndElement("", "urn:a", "AppHdr"));

        String xml = sw.toString();
        assertTrue(xml.startsWith("<p:AppHdr xmlns:p=\"urn:a\">"), xml);
        assertTrue(xml.contains("<p:Fr></p:Fr>"), xml);
        assertTrue(xml.contains("<x:Sgntr xmlns:x=\"urn:x\">"), xml);
        assertTrue(xml.contains("<ns2:Y xmlns:ns2=\"urn:a\"></ns2:Y>"), xml);
        assertTrue(xml.contains("</x:Sgntr>"), xml);
        assertNotNull(MxNode.parse(xml));
    }

    private void testXpath(String xml, String nameSpace, String path, String expected) {
        HashMap<String, String> nameSpaceContext = new HashMap(1) {
            {
                put(DEFAULT_NS_PREFIX, nameSpace);
            }
        };
        // Verifies that the xml path exists
        assertThat(Input.fromString(xml), hasXPath(path).withNamespaceContext(nameSpaceContext));

        engine.setNamespaceContext(nameSpaceContext);
        String eval = engine.evaluate(path, Input.fromString(xml).build());
        // Verifies that the value contained in the path
        assertEquals(expected, eval);
    }
}
