package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.MxAdmi00700101;
import com.prowidesoftware.swift.model.mx.dic.SupplementaryDataEnvelope1;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Issue39 {

    /*
     *  @XmlElement(name = "Envlp", required = true)
     *  protected SupplementaryDataEnvelope1 envlp;
     *   |
     *   |--->  @XmlAnyElement(lax = true)
     *          protected Object any;
     */
    @Test
    public void test() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body>\n" +
                "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
                "        <Fr>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>XXXXXXXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </Fr>\n" +
                "        <To>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>XXXXXXXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </To>\n" +
                "        <BizMsgIdr>XXXXXXX</BizMsgIdr>\n" +
                "        <MsgDefIdr>admi.007.001.01</MsgDefIdr>\n" +
                "        <CreDt>2022-01-11T15:02:09Z</CreDt>\n" +
                "    </AppHdr>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <MsgId>\n" +
                "                <MsgId>XXXXXXX</MsgId>\n" +
                "            </MsgId>\n" +
                "            <Rpt>\n" +
                "                <RltdRef>\n" +
                "                    <Ref>XXXXXX</Ref>\n" +
                "                </RltdRef>\n" +
                "                <ReqHdlg>\n" +
                "                    <StsCd>ACKT</StsCd>\n" +
                "                    <Desc>CR50</Desc>\n" +
                "                </ReqHdlg>\n" +
                "            </Rpt>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testWithPrefixes() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body>\n" +
                "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
                "        <Fr>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>XXXXXXXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </Fr>\n" +
                "        <To>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>XXXXXXXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </To>\n" +
                "        <BizMsgIdr>XXXXXXX</BizMsgIdr>\n" +
                "        <MsgDefIdr>admi.007.001.01</MsgDefIdr>\n" +
                "        <CreDt>2022-01-11T15:02:09Z</CreDt>\n" +
                "    </AppHdr>\n" +
                "    <Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <Doc:RctAck>\n" +
                "            <Doc:MsgId>\n" +
                "                <Doc:MsgId>XXXXXXX</Doc:MsgId>\n" +
                "            </Doc:MsgId>\n" +
                "            <Doc:Rpt>\n" +
                "                <Doc:RltdRef>\n" +
                "                    <Doc:Ref>XXXXXX</Doc:Ref>\n" +
                "                </Doc:RltdRef>\n" +
                "                <Doc:ReqHdlg>\n" +
                "                    <Doc:StsCd>ACKT</Doc:StsCd>\n" +
                "                    <Doc:Desc>CR50</Doc:Desc>\n" +
                "                </Doc:ReqHdlg>\n" +
                "            </Doc:Rpt>\n" +
                "            <Doc:SplmtryData>\n" +
                "                <Doc:Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Doc:Envlp>\n" +
                "            </Doc:SplmtryData>\n" +
                "        </Doc:RctAck>\n" +
                "    </Doc:Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testNoHeader() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <MsgId>\n" +
                "                <MsgId>XXXXXXX</MsgId>\n" +
                "            </MsgId>\n" +
                "            <Rpt>\n" +
                "                <RltdRef>\n" +
                "                    <Ref>XXXXXX</Ref>\n" +
                "                </RltdRef>\n" +
                "                <ReqHdlg>\n" +
                "                    <StsCd>ACKT</StsCd>\n" +
                "                    <Desc>CR50</Desc>\n" +
                "                </ReqHdlg>\n" +
                "            </Rpt>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testMinimal() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testMinimalWithParent() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body xmlns=\"mynapespace\">" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testMinimalWithSiblingNoNamespace() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body>\n" +
                "    <Foo>Bar</Foo>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testMinimalWithSiblingNamespace() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body>\n" +
                "    <Foo xmlns=\"mynamespace\">Bar</Foo>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }

    @Test
    public void testMinimalWithSiblingAppHdr() {
        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<Body>\n" +
                "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n" +
                "    </AppHdr>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:admi.007.001.01\">\n" +
                "        <RctAck>\n" +
                "            <SplmtryData>\n" +
                "                <Envlp>\n" +
                "                    <FromBOData>TOTO</FromBOData>\n" +
                "                </Envlp>\n" +
                "            </SplmtryData>\n" +
                "        </RctAck>\n" +
                "    </Document>\n" +
                "</Body>";
        MxAdmi00700101 mx = MxAdmi00700101.parse(xml);
        assertNotNull(mx);
        SupplementaryDataEnvelope1 supplementaryDataEnvelope1 = mx.getRctAck().getSplmtryData().get(0).getEnvlp();
        assertNotNull(supplementaryDataEnvelope1);

        Object any = supplementaryDataEnvelope1.getAny();
        assertNotNull(any);
        Element anyElement = (Element) any;
        assertNotNull(anyElement);
        assertEquals("FromBOData", anyElement.getLocalName());
        assertEquals("TOTO", anyElement.getTextContent());
    }
}