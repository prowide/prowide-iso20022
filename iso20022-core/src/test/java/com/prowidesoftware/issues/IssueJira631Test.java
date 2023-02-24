package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.BusinessAppHdrV02;
import com.prowidesoftware.swift.model.mx.MxPacs00800108;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadParams;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@Execution(SAME_THREAD)
public class IssueJira631Test {

    @Test
    void testBusinessAppHeaderV02() throws IllegalAccessException, NoSuchFieldException {
        String currentCharset = Charset.defaultCharset().name();
        Field defaultCharset = Charset.class.getDeclaredField("defaultCharset");
        defaultCharset.setAccessible(true);
        defaultCharset.set(null,null);
        System.setProperty("file.encoding","Cp1141");

        String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n" +
                "    <Fr>\n" +
                "        <FIId>\n" +
                "            <FinInstnId>\n" +
                "                <BICFI>AAAAUSXXXXX</BICFI>\n" +
                "            </FinInstnId>\n" +
                "        </FIId>\n" +
                "    </Fr>\n" +
                "    <To>\n" +
                "        <FIId>\n" +
                "            <FinInstnId>\n" +
                "                <BICFI>BBBBUSXXXXX</BICFI>\n" +
                "            </FinInstnId>\n" +
                "        </FIId>\n" +
                "    </To>\n" +
                "    <BizMsgIdr>REF1</BizMsgIdr>\n" +
                "    <MsgDefIdr>pain.001.001.08</MsgDefIdr>\n" +
                "    <CreDt>2023-02-15T15:48:00+00:00</CreDt>\n" +
                "</AppHdr>";

        //System.out.println(xmlAsString);

        byte[] srcBytes;
        srcBytes = xmlAsString.getBytes(StandardCharsets.UTF_8);
        String  destStr = new String(srcBytes, Charset.defaultCharset());

        //System.out.println(destStr);
        MxReadParams params = new MxReadParams();
        params.charset = Charset.defaultCharset();
        BusinessAppHdrV02 parse = BusinessAppHdrV02.parse(xmlAsString, params);
        assertNotNull(parse);
        System.setProperty("file.encoding", currentCharset);
    }

    @Test
    void testMxPacsWithWindowsEncoding() throws IllegalAccessException, NoSuchFieldException {
        String currentCharset = Charset.defaultCharset().name();
        Field defaultCharset = Charset.class.getDeclaredField("defaultCharset");
        defaultCharset.setAccessible(true);
        defaultCharset.set(null,null);
        System.setProperty("file.encoding","windows-1252");

        String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n" +
                "    <FIToFICstmrCdtTrf>\n" +
                "        <GrpHdr>\n" +
                "            <MsgId>asdfsd</MsgId>\n" +
                "            <CreDtTm>2020-09-17T21:27:41</CreDtTm>\n" +
                "            <NbOfTxs>1</NbOfTxs>\n" +
                "            <SttlmInf>\n" +
                "                <SttlmMtd>INDA</SttlmMtd>\n" +
                "                <SttlmAcct>\n" +
                "                    <Id>\n" +
                "                        <Othr>\n" +
                "                            <Id>ACAABAJOESTAELCODIGO</Id>\n" +
                "                            <SchmeNm>\n" +
                "                                <!-- this code is valid for ISO 20022 and as external code set -->\n" +
                "                                <Cd>BBAN</Cd>\n" +
                "                            </SchmeNm>\n" +
                "                        </Othr>\n" +
                "                    </Id>\n" +
                "                </SttlmAcct>\n" +
                "            </SttlmInf>\n" +
                "        </GrpHdr>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <PmtId>\n" +
                "                <InstrId>sdfasdfsd</InstrId>\n" +
                "                <EndToEndId>asdfasdfasdfasdf</EndToEndId>\n" +
                "                <UETR>8579f4a4-a547-463e-ae63-e7c6620d59b4</UETR>\n" +
                "            </PmtId>\n" +
                "            <IntrBkSttlmAmt Ccy=\"USD\">11111</IntrBkSttlmAmt>\n" +
                "            <IntrBkSttlmDt>2023-04-10</IntrBkSttlmDt>\n" +
                "            <ChrgBr>DEBT</ChrgBr>\n" +
                "            <Dbtr>\n" +
                "                <Nm>asdfasdf</Nm>\n" +
                "            </Dbtr>\n" +
                "            <DbtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ITAUUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </DbtrAgt>\n" +
                "            <CdtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>AAAAUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </CdtrAgt>\n" +
                "            <Cdtr>\n" +
                "                <Nm>sdfasdfsd</Nm>\n" +
                "            </Cdtr>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FIToFICstmrCdtTrf>\n" +
                "</Document>";

        //System.out.println(xmlAsString);

        MxPacs00800108 parse = MxPacs00800108.parse(xmlAsString);
        assertNotNull(parse);

        MxWriteConfiguration mxWriteConfiguration = new MxWriteConfiguration();
        mxWriteConfiguration.charset = Charset.forName("Cp1141");
        String modelToStringMsg = parse.message(mxWriteConfiguration);
        System.out.println(modelToStringMsg);
        assertFalse(modelToStringMsg.contains("encoding="));

        MxReadConfiguration conf = new MxReadConfiguration();
        conf.charset = Charset.forName("Cp1141");
        MxPacs00800108 stringToModelMx = MxPacs00800108.parse(modelToStringMsg, conf);
        assertNotNull(stringToModelMx);

        System.setProperty("file.encoding", currentCharset);
    }


    @Test //Single thread
    void testMxPacsWithUTF8Encoding() throws IllegalAccessException, NoSuchFieldException {
        String currentCharset = Charset.defaultCharset().name();
        Field defaultCharset = Charset.class.getDeclaredField("defaultCharset");
        defaultCharset.setAccessible(true);
        defaultCharset.set(null,null);
        System.setProperty("file.encoding","UTF-8");

        String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n" +
                "    <FIToFICstmrCdtTrf>\n" +
                "        <GrpHdr>\n" +
                "            <MsgId>asdfsd</MsgId>\n" +
                "            <CreDtTm>2020-09-17T21:27:41</CreDtTm>\n" +
                "            <NbOfTxs>1</NbOfTxs>\n" +
                "            <SttlmInf>\n" +
                "                <SttlmMtd>INDA</SttlmMtd>\n" +
                "                <SttlmAcct>\n" +
                "                    <Id>\n" +
                "                        <Othr>\n" +
                "                            <Id>ACAABAJOESTAELCODIGO</Id>\n" +
                "                            <SchmeNm>\n" +
                "                                <!-- this code is valid for ISO 20022 and as external code set -->\n" +
                "                                <Cd>BBAN</Cd>\n" +
                "                            </SchmeNm>\n" +
                "                        </Othr>\n" +
                "                    </Id>\n" +
                "                </SttlmAcct>\n" +
                "            </SttlmInf>\n" +
                "        </GrpHdr>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <PmtId>\n" +
                "                <InstrId>sdfasdfsd</InstrId>\n" +
                "                <EndToEndId>asdfasdfasdfasdf</EndToEndId>\n" +
                "                <UETR>8579f4a4-a547-463e-ae63-e7c6620d59b4</UETR>\n" +
                "            </PmtId>\n" +
                "            <IntrBkSttlmAmt Ccy=\"USD\">11111</IntrBkSttlmAmt>\n" +
                "            <IntrBkSttlmDt>2023-04-10</IntrBkSttlmDt>\n" +
                "            <ChrgBr>DEBT</ChrgBr>\n" +
                "            <Dbtr>\n" +
                "                <Nm>asdfasdf</Nm>\n" +
                "            </Dbtr>\n" +
                "            <DbtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ITAUUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </DbtrAgt>\n" +
                "            <CdtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>AAAAUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </CdtrAgt>\n" +
                "            <Cdtr>\n" +
                "                <Nm>sdfasdfsd</Nm>\n" +
                "            </Cdtr>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FIToFICstmrCdtTrf>\n" +
                "</Document>";

        //System.out.println(xmlAsString);

        MxPacs00800108 parse = MxPacs00800108.parse(xmlAsString);
        assertNotNull(parse);

        MxWriteConfiguration mxWriteConfiguration = new MxWriteConfiguration();
        mxWriteConfiguration.charset = Charset.forName("Cp1141");
        String modelToStringMsg = parse.message(mxWriteConfiguration);
        System.out.println(modelToStringMsg);
        assertFalse(modelToStringMsg.contains("encoding="));

        MxPacs00800108 stringToModelMx = MxPacs00800108.parse(modelToStringMsg);
        assertNotNull(stringToModelMx);

        System.setProperty("file.encoding", currentCharset);
    }

    @Test //Single thread
    void testMxPacsWithIBMEncoding() throws IllegalAccessException, NoSuchFieldException {
        String currentCharset = Charset.defaultCharset().name();
        Field defaultCharset = Charset.class.getDeclaredField("defaultCharset");
        defaultCharset.setAccessible(true);
        defaultCharset.set(null,null);
        System.setProperty("file.encoding","Cp1141");

        String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n" +
                "    <FIToFICstmrCdtTrf>\n" +
                "        <GrpHdr>\n" +
                "            <MsgId>asdfsd</MsgId>\n" +
                "            <CreDtTm>2020-09-17T21:27:41</CreDtTm>\n" +
                "            <NbOfTxs>1</NbOfTxs>\n" +
                "            <SttlmInf>\n" +
                "                <SttlmMtd>INDA</SttlmMtd>\n" +
                "                <SttlmAcct>\n" +
                "                    <Id>\n" +
                "                        <Othr>\n" +
                "                            <Id>ACAABAJOESTAELCODIGO</Id>\n" +
                "                            <SchmeNm>\n" +
                "                                <!-- this code is valid for ISO 20022 and as external code set -->\n" +
                "                                <Cd>BBAN</Cd>\n" +
                "                            </SchmeNm>\n" +
                "                        </Othr>\n" +
                "                    </Id>\n" +
                "                </SttlmAcct>\n" +
                "            </SttlmInf>\n" +
                "        </GrpHdr>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <PmtId>\n" +
                "                <InstrId>sdfasdfsd</InstrId>\n" +
                "                <EndToEndId>asdfasdfasdfasdf</EndToEndId>\n" +
                "                <UETR>8579f4a4-a547-463e-ae63-e7c6620d59b4</UETR>\n" +
                "            </PmtId>\n" +
                "            <IntrBkSttlmAmt Ccy=\"USD\">11111</IntrBkSttlmAmt>\n" +
                "            <IntrBkSttlmDt>2023-04-10</IntrBkSttlmDt>\n" +
                "            <ChrgBr>DEBT</ChrgBr>\n" +
                "            <Dbtr>\n" +
                "                <Nm>asdfasdf</Nm>\n" +
                "            </Dbtr>\n" +
                "            <DbtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ITAUUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </DbtrAgt>\n" +
                "            <CdtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>AAAAUSXXXXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </CdtrAgt>\n" +
                "            <Cdtr>\n" +
                "                <Nm>sdfasdfsd</Nm>\n" +
                "            </Cdtr>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FIToFICstmrCdtTrf>\n" +
                "</Document>";

        //System.out.println(xmlAsString);

        MxPacs00800108 parse = MxPacs00800108.parse(xmlAsString);
        assertNotNull(parse);

        String modelToStringMsg = parse.message();
        System.out.println("Model message with defaultCharset, Cp1141");
        System.out.println(modelToStringMsg);
        assertFalse(modelToStringMsg.contains("encoding="));

        MxPacs00800108 stringToModelMx = MxPacs00800108.parse(modelToStringMsg);
        assertNotNull(stringToModelMx);

        System.setProperty("file.encoding", currentCharset);
        System.out.println("Charset reset from Cp1141 to " + currentCharset);
    }

}
