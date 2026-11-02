package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.MxNode;
import org.junit.jupiter.api.Test;

/**
 * The tree built straight from the JAXB model must canonicalize exactly as the tree parsed from the serialized
 * XML, since the checksums computed from it must not change.
 */
class MxNodeBuilderTest {

    private static final String PACS008 = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">"
            + "<FIToFICstmrCdtTrf>"
            + "<GrpHdr><MsgId>M &amp; 1</MsgId><CreDtTm>2024-01-01T10:00:00</CreDtTm><NbOfTxs>1</NbOfTxs></GrpHdr>"
            + "<CdtTrfTxInf><PmtId><EndToEndId>E1</EndToEndId></PmtId>"
            + "<IntrBkSttlmAmt Ccy=\"USD\">1000.50</IntrBkSttlmAmt>"
            + "</CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";

    private static final String WITH_HEADER = "<RequestPayload>"
            + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">"
            + "<Fr><FIId><FinInstnId><BICFI>AAAAUS33XXX</BICFI></FinInstnId></FIId></Fr>"
            + "<To><FIId><FinInstnId><BICFI>BBBBUS33XXX</BICFI></FinInstnId></FIId></To>"
            + "<BizMsgIdr>B1</BizMsgIdr><MsgDefIdr>pacs.008.001.08</MsgDefIdr><CreDt>2024-01-01T10:00:00Z</CreDt>"
            + "</AppHdr>" + PACS008 + "</RequestPayload>";

    private static final String SUPL_NS = "urn:iso:std:iso:20022:tech:xsd:supl.011.001.11";
    private static final String XSI_NS = "http://www.w3.org/2001/XMLSchema-instance";

    private static String camt056(String envelopeContent) {
        return "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.056.001.08\">"
                + "<FIToFIPmtCxlReq><Assgnmt><Id>ID-1</Id><CreDtTm>2024-01-01T10:00:00</CreDtTm></Assgnmt>"
                + "<SplmtryData><Envlp>" + envelopeContent + "</Envlp></SplmtryData>"
                + "</FIToFIPmtCxlReq></Document>";
    }

    private static final String FOREIGN_DEFAULT_NS = camt056(
            "<Document xmlns=\"" + SUPL_NS + "\" xmlns:xsi=\"" + XSI_NS + "\"><Ext><Txt>foo</Txt></Ext></Document>");

    private static final String FOREIGN_PREFIXED = camt056("<s:Document xmlns:s=\"" + SUPL_NS + "\" xmlns:xsi=\""
            + XSI_NS + "\"><s:Ext xsi:type=\"s:Txt\"><s:Txt xml:lang=\"en\">foo &amp; bar</s:Txt><Plain>x</Plain>"
            + "</s:Ext></s:Document>");

    private static void assertSameCanonicalForm(String xml) {
        AbstractMX mx = AbstractMX.parse(xml);
        assertNotNull(mx);

        MxNode document = MxNodeBuilder.documentNode(mx);
        assertNotNull(document);
        assertEquals(MxNode.parse(mx.document()).toCanonicalString(), document.toCanonicalString());

        MxNode message = MxNodeBuilder.messageNode(mx);
        assertNotNull(message);
        assertEquals(MxNode.parse(mx.message()).toCanonicalString(), message.toCanonicalString());

        // the canonical form of the whole message, composed from the header and the Document trees
        assertEquals(MxNode.parse(mx.message()).toCanonicalString(), MxNodeBuilder.messageCanonicalString(mx));
    }

    @Test
    void documentWithoutHeader() {
        assertSameCanonicalForm(PACS008);
    }

    @Test
    void messageWithHeader() {
        AbstractMX mx = AbstractMX.parse(WITH_HEADER);
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr(), "fixture must carry a header");
        assertSameCanonicalForm(WITH_HEADER);
    }

    @Test
    void wildcardContentWithDefaultNamespace() {
        assertSameCanonicalForm(FOREIGN_DEFAULT_NS);
    }

    @Test
    void wildcardContentWithPrefixesAndNamespacedAttributes() {
        assertSameCanonicalForm(FOREIGN_PREFIXED);
    }

    /**
     * A parser normalizes line ends in text (CR and CRLF become LF) and whitespace in attribute values (to spaces),
     * while the model keeps the characters as they are, so the direct tree must apply the same normalization.
     */
    @Test
    void textWithCarriageReturnsAndAttributeWithLineBreaks() {
        String xml = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">"
                + "<FIToFICstmrCdtTrf>"
                + "<GrpHdr><MsgId>a&#13;b&#13;&#10;c</MsgId><CreDtTm>2024-01-01T10:00:00</CreDtTm><NbOfTxs>1</NbOfTxs></GrpHdr>"
                + "<CdtTrfTxInf><PmtId><EndToEndId>E1</EndToEndId></PmtId>"
                + "<IntrBkSttlmAmt Ccy=\"U&#10;S&#9;D\">1000.50</IntrBkSttlmAmt>"
                + "</CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";
        assertSameCanonicalForm(xml);
    }

    @Test
    void canonicalFormCarriesTheExpectedContent() {
        AbstractMX mx = AbstractMX.parse(PACS008);
        String canonical = MxNodeBuilder.documentNode(mx).toCanonicalString();
        // the date time is rendered by the adapters with the JVM offset, so it is not asserted literally
        assertTrue(
                canonical.startsWith(
                        "<Document><FIToFICstmrCdtTrf><GrpHdr><MsgId>M & 1</MsgId><CreDtTm>2024-01-01T10:00:00"),
                canonical);
        assertTrue(
                canonical.endsWith(
                        "<NbOfTxs>1</NbOfTxs></GrpHdr><CdtTrfTxInf><PmtId><EndToEndId>E1</EndToEndId></PmtId>"
                                + "<IntrBkSttlmAmt Ccy=\"USD\">1000.50</IntrBkSttlmAmt></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>"),
                canonical);
    }
}
