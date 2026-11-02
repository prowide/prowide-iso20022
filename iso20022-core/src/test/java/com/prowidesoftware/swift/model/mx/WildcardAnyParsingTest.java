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

import static org.assertj.core.api.Assertions.assertThat;

import com.prowidesoftware.swift.model.MxNode;
import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import java.io.StringReader;
import java.util.function.Consumer;
import javax.xml.parsers.DocumentBuilderFactory;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Diff;

/**
 * Regression coverage for the AnyTagParsing issues (#39, #41, #43, PWUS-18): xsd:any wildcard content
 * (SplmtryData/Envlp payloads and signature envelopes) must be captured as org.w3c.dom.Element on parse,
 * preserved on XML round-trip, and serialized/restored through JSON instead of being dropped.
 */
class WildcardAnyParsingTest {

    /** Foreign-namespace SplmtryData/Envlp payload must be captured as a DOM Element (PWUS-18). */
    @Test
    void capturesForeignNamespaceSupplementaryData() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        Element any = (Element) envelope(mx).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");
        assertThat(any.getNamespaceURI()).isEqualTo("foo");
        assertThat(any.getElementsByTagNameNS("foo", "RsdntSts").getLength()).isEqualTo(1);
    }

    /** No-namespace wildcard content must be captured too (#39). */
    @Test
    void capturesNoNamespaceSupplementaryData() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_no_prefix.xml"));

        Element any = (Element) envelope(mx).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");
    }

    /** Namespaced signature envelope in the header must be captured (#43). */
    @Test
    void capturesSignatureEnvelope() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        BusinessAppHdrV01 h = (BusinessAppHdrV01) mx.getAppHdr();
        Element sgntr = (Element) h.getSgntr().getAny();
        assertThat(sgntr).isNotNull();
        assertThat(sgntr.getLocalName()).isEqualTo("Signature");
        assertThat(sgntr.getNamespaceURI()).isEqualTo("http://www.w3.org/2000/09/xmldsig#");
    }

    /** XML -> model -> XML round-trip preserves the wildcard payload. */
    @Test
    void xmlRoundTripPreservesWildcard() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        String xml = mx.message();
        assertThat(xml).contains("InstrForCdtrAcct").contains("RsdntSts").contains("foo");
    }

    /** toJson emits the wildcard content (not {}), and fromJson restores it as a DOM Element. */
    @Test
    void jsonRoundTripPreservesWildcard() throws IOException {
        MxPacs00200108 mx =
                MxPacs00200108.parse(Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml"));

        String json = mx.toJson();
        assertThat(json).contains("InstrForCdtrAcct");
        assertThat(json).doesNotContain("\"any\": {}");

        MxPacs00200108 restored = MxPacs00200108.fromJson(json);
        Element any = (Element) envelope(restored).getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("InstrForCdtrAcct");

        // the restored Element must re-marshal back to XML (a String would be escaped, not an element)
        assertThat(restored.message()).contains("InstrForCdtrAcct").contains("RsdntSts");
    }

    /**
     * PWUS-18 exact reproduction: a camt.056.001.08 whose root-level SplmtryData/Envlp carries a custom
     * namespaced XML payload. Previously the JSON rendered {@code "envelope": {}}; now the content is
     * captured on parse, emitted in JSON, and restored by fromJson.
     */
    @Test
    void camt056SupplementaryDataEnvelopeRoundTrips() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.056.001.08\">"
                + "  <FIToFIPmtCxlReq>"
                + "    <Assgnmt>"
                + "      <Id>ID-1</Id>"
                + "      <Assgnr><Agt><FinInstnId><BICFI>AAAAUS00</BICFI></FinInstnId></Agt></Assgnr>"
                + "      <Assgne><Agt><FinInstnId><BICFI>BBBBUS00</BICFI></FinInstnId></Agt></Assgne>"
                + "      <CreDtTm>2024-01-01T10:00:00</CreDtTm>"
                + "    </Assgnmt>"
                + "    <SplmtryData>"
                + "      <PlcAndNm>TxSupplementary</PlcAndNm>"
                + "      <Envlp>"
                + "        <TEST:TestData xmlns:TEST=\"foocorp:test:smm\">"
                + "          <TEST:tag>Hello World!</TEST:tag>"
                + "        </TEST:TestData>"
                + "      </Envlp>"
                + "    </SplmtryData>"
                + "  </FIToFIPmtCxlReq>"
                + "</Document>";

        MxCamt05600108 mx = MxCamt05600108.parse(xml);
        assertThat(mx).isNotNull();

        SupplementaryDataEnvelope1 envlp =
                mx.getFIToFIPmtCxlReq().getSplmtryData().get(0).getEnvlp();
        Element any = (Element) envlp.getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("TestData");
        assertThat(any.getNamespaceURI()).isEqualTo("foocorp:test:smm");
        assertThat(any.getTextContent().trim()).isEqualTo("Hello World!");

        // JSON must contain the payload, not the empty "envelope": {} of the original bug
        String json = mx.toJson();
        assertThat(json).contains("TestData").contains("Hello World!");
        assertThat(json).doesNotContain("\"envelope\": {}");

        // and fromJson restores it back to a DOM Element
        MxCamt05600108 restored = MxCamt05600108.fromJson(json);
        Element restoredAny = (Element)
                restored.getFIToFIPmtCxlReq().getSplmtryData().get(0).getEnvlp().getAny();
        assertThat(restoredAny).isNotNull();
        assertThat(restoredAny.getLocalName()).isEqualTo("TestData");
    }

    /**
     * Edge case: a foreign prefix is declared on a main-namespace ancestor ({@code SplmtryData}) and consumed
     * by a wildcard descendant ({@code TEST:TestData}) that does not redeclare it. The filter must keep the
     * foreign declaration in scope downstream (it only drops the main namespace), so the descendant is captured.
     */
    @Test
    void wildcardDescendantUsesForeignPrefixFromMainNamespaceAncestor() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.056.001.08\">"
                + "  <FIToFIPmtCxlReq>"
                + "    <Assgnmt>"
                + "      <Id>ID-1</Id>"
                + "      <CreDtTm>2024-01-01T10:00:00</CreDtTm>"
                + "    </Assgnmt>"
                + "    <SplmtryData xmlns:TEST=\"foocorp:test:smm\">"
                + "      <PlcAndNm>TxSupplementary</PlcAndNm>"
                + "      <Envlp>"
                + "        <TEST:TestData><TEST:tag>Hello World!</TEST:tag></TEST:TestData>"
                + "      </Envlp>"
                + "    </SplmtryData>"
                + "  </FIToFIPmtCxlReq>"
                + "</Document>";

        MxCamt05600108 mx = MxCamt05600108.parse(xml);
        assertThat(mx).isNotNull();

        SupplementaryDataEnvelope1 envlp =
                mx.getFIToFIPmtCxlReq().getSplmtryData().get(0).getEnvlp();
        Element any = (Element) envlp.getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("TestData");
        assertThat(any.getNamespaceURI()).isEqualTo("foocorp:test:smm");
        assertThat(any.getTextContent().trim()).isEqualTo("Hello World!");
    }

    /**
     * Different wildcard location: camt.998 proprietary message carries its payload in
     * {@code CshMgmtPrtryMsg/PrtryData/Data} (a {@link SupplementaryDataEnvelope1}). Here the envelope wraps a
     * nested foreign-namespace {@code Document}; it must be captured on parse and survive the JSON round-trip.
     */
    @Test
    void camt998ProprietaryDataEnvelopeRoundTrips() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.998.001.03\">"
                + "  <CshMgmtPrtryMsg>"
                + "    <MsgHdr><MsgId>0987654321</MsgId></MsgHdr>"
                + "    <PrtryData>"
                + "      <Tp>cma.textMessage.001.01</Tp>"
                + "      <Data>"
                + "        <Document xmlns=\"urn:cma:xsd:cma.textMessage.001.01\">"
                + "          <TxtMsg><Txt>Text message to Participant</Txt></TxtMsg>"
                + "        </Document>"
                + "      </Data>"
                + "    </PrtryData>"
                + "  </CshMgmtPrtryMsg>"
                + "</Document>";

        MxCamt99800103 mx = MxCamt99800103.parse(xml);
        assertThat(mx).isNotNull();
        assertThat(mx.getCshMgmtPrtryMsg().getMsgHdr().getMsgId()).isEqualTo("0987654321");

        SupplementaryDataEnvelope1 envlp =
                mx.getCshMgmtPrtryMsg().getPrtryData().getData();
        Element any = (Element) envlp.getAny();
        assertThat(any).isNotNull();
        assertThat(any.getLocalName()).isEqualTo("Document");
        assertThat(any.getNamespaceURI()).isEqualTo("urn:cma:xsd:cma.textMessage.001.01");
        assertThat(any.getElementsByTagNameNS("urn:cma:xsd:cma.textMessage.001.01", "Txt")
                        .getLength())
                .isEqualTo(1);

        String json = mx.toJson();
        assertThat(json).contains("Text message to Participant");
        assertThat(json).doesNotContain("\"data\": {}");

        MxCamt99800103 restored = MxCamt99800103.fromJson(json);
        Element restoredAny =
                (Element) restored.getCshMgmtPrtryMsg().getPrtryData().getData().getAny();
        assertThat(restoredAny).isNotNull();
        assertThat(restoredAny.getLocalName()).isEqualTo("Document");
    }

    /*
     * PW-3591 round-trip matrix: wildcard (foreign) content must be serialized as valid XML with the same meaning
     * under every document prefix configuration. The written XML is compared with a plain namespace-aware DOM
     * parse, because the Prowide parser removes the main namespace and would hide an element written in the
     * wrong namespace.
     */

    private static final String SUPL = "urn:iso:std:iso:20022:tech:xsd:supl.011.001.11";
    private static final String XSI = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String CAMT056 = "urn:iso:std:iso:20022:tech:xsd:camt.056.001.08";

    /** The customer's shape: a supl Document declaring its own default namespace plus xsi */
    @Test
    void foreignDefaultNamespaceWithExtraDeclaration() {
        assertEnvelopeRoundTrips("<Document xmlns=\"" + SUPL + "\" xmlns:xsi=\"" + XSI + "\">"
                + "<Ext><PlcAndNm>/Document/FIToFIPmtCxlReq</PlcAndNm><Txt>foo</Txt></Ext></Document>");
    }

    @Test
    void foreignPrefixedNamespace() {
        assertEnvelopeRoundTrips("<s:Document xmlns:s=\"" + SUPL + "\"><s:Ext><s:Txt>foo</s:Txt></s:Ext></s:Document>");
    }

    @Test
    void foreignContentRebindingTheDocumentPrefix() {
        assertEnvelopeRoundTrips("<doc:Foo xmlns:doc=\"urn:foo\"><doc:Bar>x</doc:Bar></doc:Foo>");
        assertEnvelopeRoundTrips("<camt:Foo xmlns:camt=\"urn:foo\"><camt:Bar>x</camt:Bar></camt:Foo>");
    }

    @Test
    void foreignContentUndeclaringTheDefaultNamespace() {
        assertEnvelopeRoundTrips("<Foo xmlns=\"urn:foo\"><Bar xmlns=\"\">x</Bar></Foo>");
    }

    @Test
    void foreignContentWithNamespacedAttributes() {
        assertEnvelopeRoundTrips("<Document xmlns=\"" + SUPL + "\" xmlns:xsi=\"" + XSI + "\" xmlns:t=\"urn:T\""
                + " xsi:schemaLocation=\"" + SUPL + " supl.xsd\">"
                + "<Ext xsi:type=\"t:Custom\"><Txt>foo</Txt></Ext></Document>");
    }

    @Test
    void foreignContentWithAttributeUsingTheDocumentPrefix() {
        assertEnvelopeRoundTrips(
                "<Document xmlns=\"" + SUPL + "\" xmlns:camt=\"foocorp:test:smm\""
                        + " xmlns:doc=\"foocorp:test:other\"><Ext camt:a=\"1\" doc:b=\"2\" c=\"3\"><Txt>foo</Txt></Ext></Document>");
    }

    @Test
    void foreignContentWithXmlLang() {
        assertEnvelopeRoundTrips(
                "<Document xmlns=\"" + SUPL + "\"><Ext><Txt xml:lang=\"en\">foo</Txt></Ext></Document>");
    }

    /** A main-namespace element nested in foreign content keeps the main namespace */
    @Test
    void mainNamespaceElementInsideForeignContent() {
        assertEnvelopeRoundTrips("<Foo xmlns=\"urn:foo\"><Bar xmlns=\"" + CAMT056 + "\">x</Bar></Foo>");
        assertEnvelopeRoundTrips("<f:Foo xmlns:f=\"urn:foo\"><c:Bar xmlns:c=\"" + CAMT056 + "\">x</c:Bar></f:Foo>");
    }

    @Test
    void noNamespaceElementInsideForeignContent() {
        // the input document is prefixed so that the unprefixed Bar is really in no namespace; when the message is
        // written without document prefix the main namespace is the default one and Bar needs xmlns=""
        assertPrefixedEnvelopeRoundTrips("<f:Foo xmlns:f=\"urn:foo\"><Bar>x</Bar></f:Foo>");
        assertPrefixedEnvelopeRoundTrips("<f:Foo xmlns:f=\"urn:foo\"><Bar><f:Baz>x</f:Baz><Q>y</Q></Bar></f:Foo>");
    }

    @Test
    void nestedForeignContent() {
        assertEnvelopeRoundTrips("<Foo xmlns=\"urn:foo\"><Bar xmlns=\"\"><Baz xmlns=\"urn:baz\"><Q/></Baz><R/></Bar>"
                + "<q:A xmlns:q=\"urn:q\"><B xmlns=\"urn:b\"><q:C/></B></q:A></Foo>");
    }

    @Test
    void appHdrSignatureRoundTripsInEveryHeaderVersion() {
        for (String version : new String[] {"01", "02", "03", "04"}) {
            String header = "urn:iso:std:iso:20022:tech:xsd:head.001.001." + version;
            String signature = "<ds:Signature xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\""
                    + " xmlns:xsi=\"" + XSI + "\" xsi:schemaLocation=\"urn:x x.xsd\">"
                    + "<ds:KeyInfo xmlns:head=\"foocorp:test:smm\"><head:Ref>1</head:Ref><ds:KeyName>k</ds:KeyName>"
                    + "</ds:KeyInfo><Obj xmlns=\"urn:obj\"><Txt xml:lang=\"en\">o</Txt></Obj></ds:Signature>";
            String xml = "<RequestPayload>"
                    + "<AppHdr xmlns=\"" + header + "\">"
                    + "<Fr><FIId><FinInstnId><BICFI>AAAAUS33</BICFI></FinInstnId></FIId></Fr>"
                    + "<To><FIId><FinInstnId><BICFI>BBBBUS33</BICFI></FinInstnId></FIId></To>"
                    + "<BizMsgIdr>REF-1</BizMsgIdr><MsgDefIdr>camt.056.001.08</MsgDefIdr>"
                    + "<CreDt>2024-01-01T10:00:00Z</CreDt>"
                    + "<Sgntr>" + signature + "</Sgntr>"
                    + "</AppHdr>"
                    + "<Document xmlns=\"" + CAMT056 + "\">"
                    + "<FIToFIPmtCxlReq><Assgnmt><Id>ID-1</Id><CreDtTm>2024-01-01T10:00:00</CreDtTm></Assgnmt>"
                    + "</FIToFIPmtCxlReq></Document>"
                    + "</RequestPayload>";
            Element expected = firstChildElement(elementNS(parseDom(xml), header, "Sgntr"));
            forEachPrefixConfiguration(conf -> {
                MxCamt05600108 mx = MxCamt05600108.parse(xml);
                assertThat(mx).as("head.001.001." + version).isNotNull();
                assertThat(mx.getAppHdr()).as("head.001.001." + version).isNotNull();
                String written = mx.message(conf);
                assertThat(MxNode.parse(written)).as(written).isNotNull();
                Element actual = firstChildElement(elementNS(parseDom(written), header, "Sgntr"));
                assertSimilar(expected, actual, written);
            });
        }
    }

    /**
     * Serializes a camt.056 carrying the envelope content under the three prefix configurations and checks that the
     * written envelope content is the same XML as the input, ignoring prefixes and whitespace
     */
    private static void assertEnvelopeRoundTrips(String envelopeContent) {
        assertEnvelopeRoundTripsForDocument("<Document xmlns=\"" + CAMT056 + "\">"
                + "<FIToFIPmtCxlReq><Assgnmt><Id>ID-1</Id><CreDtTm>2024-01-01T10:00:00</CreDtTm></Assgnmt>"
                + "<SplmtryData><Envlp>" + envelopeContent + "</Envlp></SplmtryData></FIToFIPmtCxlReq></Document>");
    }

    /**
     * Same as {@link #assertEnvelopeRoundTrips(String)} but the input document is prefixed, so unprefixed elements in
     * the envelope content are in no namespace instead of the main one
     */
    private static void assertPrefixedEnvelopeRoundTrips(String envelopeContent) {
        assertEnvelopeRoundTripsForDocument("<c:Document xmlns:c=\"" + CAMT056 + "\">"
                + "<c:FIToFIPmtCxlReq><c:Assgnmt><c:Id>ID-1</c:Id><c:CreDtTm>2024-01-01T10:00:00</c:CreDtTm></c:Assgnmt>"
                + "<c:SplmtryData><c:Envlp>" + envelopeContent + "</c:Envlp></c:SplmtryData></c:FIToFIPmtCxlReq>"
                + "</c:Document>");
    }

    private static void assertEnvelopeRoundTripsForDocument(String xml) {
        Element expected = firstChildElement(elementNS(parseDom(xml), CAMT056, "Envlp"));
        forEachPrefixConfiguration(conf -> {
            MxCamt05600108 mx = MxCamt05600108.parse(xml);
            assertThat(mx).isNotNull();
            String written = mx.message(conf);
            assertThat(MxNode.parse(written)).as(written).isNotNull();
            Element actual = firstChildElement(elementNS(parseDom(written), CAMT056, "Envlp"));
            assertSimilar(expected, actual, written);
            // and the written message is still parseable by the model with the wildcard content in place
            MxCamt05600108 reparsed = MxCamt05600108.parse(written);
            assertThat(reparsed).as(written).isNotNull();
            assertThat(reparsed.getFIToFIPmtCxlReq()
                            .getSplmtryData()
                            .get(0)
                            .getEnvlp()
                            .getAny())
                    .as(written)
                    .isNotNull();
        });
    }

    private static void forEachPrefixConfiguration(Consumer<MxWriteConfiguration> test) {
        MxWriteConfiguration doc = new MxWriteConfiguration();
        MxWriteConfiguration category = new MxWriteConfiguration();
        category.useCategoryAsDocumentPrefix = true;
        MxWriteConfiguration none = new MxWriteConfiguration();
        none.documentPrefix = null;
        none.headerPrefix = null;
        for (MxWriteConfiguration conf : new MxWriteConfiguration[] {doc, category, none}) {
            test.accept(conf);
        }
    }

    private static void assertSimilar(Element expected, Element actual, String written) {
        Diff diff = DiffBuilder.compare(Input.fromNode(expected))
                .withTest(Input.fromNode(actual))
                .ignoreWhitespace()
                .checkForSimilar()
                .build();
        assertThat(diff.hasDifferences()).as(diff.toString() + "\n" + written).isFalse();
    }

    private static Document parseDom(String xml) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            return factory.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
        } catch (Exception e) {
            throw new AssertionError("not well-formed: " + xml, e);
        }
    }

    private static Element elementNS(Document doc, String namespace, String localName) {
        Element e = (Element) doc.getElementsByTagNameNS(namespace, localName).item(0);
        assertThat(e).as(localName).isNotNull();
        return e;
    }

    private static Element firstChildElement(Element parent) {
        for (Node n = parent.getFirstChild(); n != null; n = n.getNextSibling()) {
            if (n instanceof Element) {
                return (Element) n;
            }
        }
        throw new AssertionError("no child element in " + parent.getLocalName());
    }

    private static SupplementaryDataEnvelope1 envelope(MxPacs00200108 mx) {
        return mx.getFIToFIPmtStsRpt()
                .getTxInfAndSts()
                .get(0)
                .getSplmtryData()
                .get(0)
                .getEnvlp();
    }
}
