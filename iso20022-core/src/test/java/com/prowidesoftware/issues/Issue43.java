package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.AppHdr;
import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import com.prowidesoftware.swift.model.mx.MxPacs00800107;
import com.prowidesoftware.swift.model.mx.dic.SignatureEnvelope;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Issue43 {

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
                "        <Sgntr><XMLSgntrs xmlns=\"http://www.w3.org/2000/09/xmldsig#\">FOO</XMLSgntrs></Sgntr>" +
                "    </AppHdr>\n" +
                "    <Document xmlns='urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07'\n" +
                "              xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>\n" +
                "        <FIToFICstmrCdtTrf>\n" +
                "            <GrpHdr>\n" +
                "                <MsgId>823823423</MsgId>\n" +
                "                <CreDtTm>2018-04-27T21:00:45</CreDtTm>\n" +
                "                <NbOfTxs>1</NbOfTxs>\n" +
                "                <CtrlSum>10000</CtrlSum>\n" +
                "                <TtlIntrBkSttlmAmt Ccy='USD'>10000</TtlIntrBkSttlmAmt>\n" +
                "                <IntrBkSttlmDt>2018-08-28</IntrBkSttlmDt>\n" +
                "                <SttlmInf>\n" +
                "                    <SttlmMtd>INDA</SttlmMtd>\n" +
                "                </SttlmInf>\n" +
                "                <InstgAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>CITTGB2LPBG</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </InstgAgt>\n" +
                "                <InstdAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>ICBCUS4CXXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </InstdAgt>\n" +
                "            </GrpHdr>\n" +
                "            <CdtTrfTxInf>\n" +
                "                <PmtId>\n" +
                "                    <InstrId>23423423</InstrId>\n" +
                "                    <EndToEndId>223423423</EndToEndId>\n" +
                "                    <TxId>123452342</TxId>\n" +
                "                </PmtId>\n" +
                "                <IntrBkSttlmAmt Ccy='USD'>5000</IntrBkSttlmAmt>\n" +
                "                <IntrBkSttlmDt>2018-07-31</IntrBkSttlmDt>\n" +
                "                <InstdAmt Ccy='USD'>5000</InstdAmt>\n" +
                "                <ChrgBr>SHAR</ChrgBr>\n" +
                "                <Dbtr>\n" +
                "                    <Nm>JOHN DOE</Nm>\n" +
                "                    <PstlAdr>\n" +
                "                        <PstCd>1417</PstCd>\n" +
                "                        <TwnNm>Buenos Aires</TwnNm>\n" +
                "                        <Ctry>AR</Ctry>\n" +
                "                    </PstlAdr>\n" +
                "                </Dbtr>\n" +
                "                <DbtrAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>ITUSUSP1XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </DbtrAgt>\n" +
                "                <CdtrAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>USTBUS31XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </CdtrAgt>\n" +
                "                <Cdtr>\n" +
                "                    <Nm>Mike Smith</Nm>\n" +
                "                </Cdtr>\n" +
                "            </CdtTrfTxInf>\n" +
                "        </FIToFICstmrCdtTrf>\n" +
                "    </Document>\n" +
                "</Body>";
        MxPacs00800107 mx = MxPacs00800107.parse(xml);
        BusinessAppHdrV01 bah = (BusinessAppHdrV01) mx.getAppHdr();

        SignatureEnvelope signatureEnvelope = bah.getSgntr();
        assertNotNull(signatureEnvelope);

        // Any is proprietary so the parser cannot populate any model object with it
        assertNull(signatureEnvelope.getAny());
    }
}
