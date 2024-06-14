package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.MxAdmi00700101;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * https://github.com/prowide/prowide-iso20022/issues/39
 */
public class Issue39 {

    private String xmlWithSplmtryData = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
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
                                 // this is Any (lax)
            "                    <FromBOData>TOTO</FromBOData>\n" +
            "                </Envlp>\n" +
            "            </SplmtryData>\n" +
            "        </RctAck>\n" +
            "    </Document>\n" +
            "</Body>";

    private String xmlWithoutSplmtryData = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
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
            "        </RctAck>\n" +
            "    </Document>\n" +
            "</Body>";

    @Test
    public void testParseWithSplmtryData() {
        MxAdmi00700101 mx = MxAdmi00700101.parse(xmlWithSplmtryData);
        assertNotNull(mx);
    }

    @Test
    public void testParseWithoutSplmtryData() {
        MxAdmi00700101 mx = MxAdmi00700101.parse(xmlWithoutSplmtryData);
        assertNotNull(mx);
    }

}
