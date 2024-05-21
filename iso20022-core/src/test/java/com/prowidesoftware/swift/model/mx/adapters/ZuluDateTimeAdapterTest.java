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
package com.prowidesoftware.swift.model.mx.adapters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.mx.MxPacs00800110;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.jupiter.api.Test;

public class ZuluDateTimeAdapterTest {

    private ZuluDateTimeAdapter adapter = new ZuluDateTimeAdapter();

    @Test
    public void testUnmarshallFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08.123Z");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(new BigDecimal("0.123"), cal.getFractionalSecond());
        assertEquals(0, cal.getTimezone());
    }

    @Test
    public void testUnmarshallNoFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08Z");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(null, cal.getFractionalSecond());
        assertEquals(0, cal.getTimezone());
    }

    @Test
    public void testUnmarshallNoOffset() throws Exception {
        XMLGregorianCalendar cal = adapter.unmarshal("2022-03-04T12:50:08");
        assertEquals(2022, cal.getYear());
        assertEquals(3, cal.getMonth());
        assertEquals(4, cal.getDay());
        assertEquals(12, cal.getHour());
        assertEquals(50, cal.getMinute());
        assertEquals(8, cal.getSecond());
        assertEquals(null, cal.getFractionalSecond());
    }

    @Test
    public void testMarshallFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, new BigDecimal("0.123"), -180);
        assertEquals("2022-03-04T12:50:08.123Z", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoFractionOfSeconds() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, null, -180);
        assertEquals("2022-03-04T12:50:08Z", adapter.marshal(cal));
    }

    @Test
    public void testMarshallNoOffset() throws Exception {
        XMLGregorianCalendar cal = DatatypeFactory.newInstance()
                .newXMLGregorianCalendar(BigInteger.valueOf(2022), 3, 4, 12, 50, 8, null, -0);
        assertEquals("2022-03-04T12:50:08Z", adapter.marshal(cal));
    }

    @Test
    public void test_marshall_message_with_BAH1_and_CreDt_Zulu() {

        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<RequestPayload>\n"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n"
                + "    <h:Fr>\n"
                + "        <h:FIId>\n"
                + "            <h:FinInstnId>\n"
                + "                <h:BICFI>FOOYVEC0XXX</h:BICFI>\n"
                + "            </h:FinInstnId>\n"
                + "        </h:FIId>\n"
                + "    </h:Fr>\n"
                + "    <h:To>\n"
                + "        <h:FIId>\n"
                + "            <h:FinInstnId>\n"
                + "                <h:BICFI>FOOZUSC0XXX</h:BICFI>\n"
                + "            </h:FinInstnId>\n"
                + "        </h:FIId>\n"
                + "    </h:To>\n"
                + "    <h:BizMsgIdr>STRUCTUREDADDR</h:BizMsgIdr>\n"
                + "    <h:MsgDefIdr>pacs.008.001.10</h:MsgDefIdr>\n"
                + "    <h:CreDt>2024-03-27T20:45:56Z</h:CreDt>\n"
                + "    <h:Prty>NORM</h:Prty>\n"
                + "</h:AppHdr>\n"
                + "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <Doc:FIToFICstmrCdtTrf>\n"
                + "        <Doc:GrpHdr>\n"
                + "            <Doc:MsgId>49A44C651620AE2C</Doc:MsgId>\n"
                + "            <Doc:CreDtTm>2024-03-29T20:45:56Z</Doc:CreDtTm>\n"
                + "            <Doc:NbOfTxs>1</Doc:NbOfTxs>\n"
                + "            <Doc:SttlmInf>\n"
                + "                <Doc:SttlmMtd>INDA</Doc:SttlmMtd>\n"
                + "            </Doc:SttlmInf>\n"
                + "            <Doc:InstgAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOYVEC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:InstgAgt>\n"
                + "            <Doc:InstdAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOZUSC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:InstdAgt>\n"
                + "        </Doc:GrpHdr>\n"
                + "        <Doc:CdtTrfTxInf>\n"
                + "            <Doc:PmtId>\n"
                + "                <Doc:InstrId>STRUCTUREDADDR</Doc:InstrId>\n"
                + "                <Doc:EndToEndId>STRUCTUREDADDR</Doc:EndToEndId>\n"
                + "                <Doc:TxId>STRUCTUREDADDR</Doc:TxId>\n"
                + "                <Doc:UETR>1420a5f5-a452-436b-ab36-b2d3379c40e5</Doc:UETR>\n"
                + "            </Doc:PmtId>\n"
                + "            <Doc:IntrBkSttlmAmt Ccy=\"VEF\">23453.00</Doc:IntrBkSttlmAmt>\n"
                + "            <Doc:IntrBkSttlmDt>2009-09-03</Doc:IntrBkSttlmDt>\n"
                + "            <Doc:ChrgBr>DEBT</Doc:ChrgBr>\n"
                + "            <Doc:Dbtr>\n"
                + "                <Doc:Nm>customer name</Doc:Nm>\n"
                + "                <Doc:PstlAdr>\n"
                + "                    <Doc:TwnNm>BSAS</Doc:TwnNm>\n"
                + "                    <Doc:Ctry>AR</Doc:Ctry>\n"
                + "                </Doc:PstlAdr>\n"
                + "                <Doc:Id>\n"
                + "                    <Doc:PrvtId>\n"
                + "                        <Doc:DtAndPlcOfBirth>\n"
                + "                            <Doc:BirthDt>1973-10-19</Doc:BirthDt>\n"
                + "                            <Doc:CityOfBirth>BUENOS AIRES</Doc:CityOfBirth>\n"
                + "                            <Doc:CtryOfBirth>AR</Doc:CtryOfBirth>\n"
                + "                        </Doc:DtAndPlcOfBirth>\n"
                + "                    </Doc:PrvtId>\n"
                + "                </Doc:Id>\n"
                + "            </Doc:Dbtr>\n"
                + "            <Doc:DbtrAcct>\n"
                + "                <Doc:Id>\n"
                + "                    <Doc:Othr>\n"
                + "                        <Doc:Id>1234567890</Doc:Id>\n"
                + "                    </Doc:Othr>\n"
                + "                </Doc:Id>\n"
                + "            </Doc:DbtrAcct>\n"
                + "            <Doc:DbtrAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOYVEC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:DbtrAgt>\n"
                + "            <Doc:CdtrAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOZUSC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:CdtrAgt>\n"
                + "            <Doc:Cdtr>\n"
                + "                <Doc:Nm>John Smith</Doc:Nm>\n"
                + "                <Doc:PstlAdr>\n"
                + "                    <Doc:AdrLine>Hoogstrat 6</Doc:AdrLine>\n"
                + "                    <Doc:AdrLine>BE/Brussels</Doc:AdrLine>\n"
                + "                </Doc:PstlAdr>\n"
                + "            </Doc:Cdtr>\n"
                + "            <Doc:InstrForNxtAgt>\n"
                + "                <Doc:InstrInf>/TIPO/422</Doc:InstrInf>\n"
                + "            </Doc:InstrForNxtAgt>\n"
                + "        </Doc:CdtTrfTxInf>\n"
                + "    </Doc:FIToFICstmrCdtTrf>\n"
                + "</Doc:Document>\n"
                + "</RequestPayload>";

        // Create a new instance of MxPacs00800110 with AppHdr CreDtTm ZuluDateTime
        MxPacs00800110 mxPacs00800110 = MxPacs00800110.parse(xml);

        // After CreDtTm is parsed, it should be 2024-03-27T20:45:56Z
        assertTrue(mxPacs00800110.message().contains("2024-03-27T20:45:56Z"));
    }

    @Test
    public void test_marshall_message_with_BAH1_and_CreDt_OffsetDateTime() {

        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<RequestPayload>\n"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\">\n"
                + "    <h:Fr>\n"
                + "        <h:FIId>\n"
                + "            <h:FinInstnId>\n"
                + "                <h:BICFI>FOOYVEC0XXX</h:BICFI>\n"
                + "            </h:FinInstnId>\n"
                + "        </h:FIId>\n"
                + "    </h:Fr>\n"
                + "    <h:To>\n"
                + "        <h:FIId>\n"
                + "            <h:FinInstnId>\n"
                + "                <h:BICFI>FOOZUSC0XXX</h:BICFI>\n"
                + "            </h:FinInstnId>\n"
                + "        </h:FIId>\n"
                + "    </h:To>\n"
                + "    <h:BizMsgIdr>STRUCTUREDADDR</h:BizMsgIdr>\n"
                + "    <h:MsgDefIdr>pacs.008.001.10</h:MsgDefIdr>\n"
                + "    <h:CreDt>2024-03-27T20:45:56-03:00</h:CreDt>\n"
                + "    <h:Prty>NORM</h:Prty>\n"
                + "</h:AppHdr>\n"
                + "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <Doc:FIToFICstmrCdtTrf>\n"
                + "        <Doc:GrpHdr>\n"
                + "            <Doc:MsgId>49A44C651620AE2C</Doc:MsgId>\n"
                + "            <Doc:CreDtTm>2024-03-29T20:45:56Z</Doc:CreDtTm>\n"
                + "            <Doc:NbOfTxs>1</Doc:NbOfTxs>\n"
                + "            <Doc:SttlmInf>\n"
                + "                <Doc:SttlmMtd>INDA</Doc:SttlmMtd>\n"
                + "            </Doc:SttlmInf>\n"
                + "            <Doc:InstgAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOYVEC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:InstgAgt>\n"
                + "            <Doc:InstdAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOZUSC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:InstdAgt>\n"
                + "        </Doc:GrpHdr>\n"
                + "        <Doc:CdtTrfTxInf>\n"
                + "            <Doc:PmtId>\n"
                + "                <Doc:InstrId>STRUCTUREDADDR</Doc:InstrId>\n"
                + "                <Doc:EndToEndId>STRUCTUREDADDR</Doc:EndToEndId>\n"
                + "                <Doc:TxId>STRUCTUREDADDR</Doc:TxId>\n"
                + "                <Doc:UETR>1420a5f5-a452-436b-ab36-b2d3379c40e5</Doc:UETR>\n"
                + "            </Doc:PmtId>\n"
                + "            <Doc:IntrBkSttlmAmt Ccy=\"VEF\">23453.00</Doc:IntrBkSttlmAmt>\n"
                + "            <Doc:IntrBkSttlmDt>2009-09-03</Doc:IntrBkSttlmDt>\n"
                + "            <Doc:ChrgBr>DEBT</Doc:ChrgBr>\n"
                + "            <Doc:Dbtr>\n"
                + "                <Doc:Nm>customer name</Doc:Nm>\n"
                + "                <Doc:PstlAdr>\n"
                + "                    <Doc:TwnNm>BSAS</Doc:TwnNm>\n"
                + "                    <Doc:Ctry>AR</Doc:Ctry>\n"
                + "                </Doc:PstlAdr>\n"
                + "                <Doc:Id>\n"
                + "                    <Doc:PrvtId>\n"
                + "                        <Doc:DtAndPlcOfBirth>\n"
                + "                            <Doc:BirthDt>1973-10-19</Doc:BirthDt>\n"
                + "                            <Doc:CityOfBirth>BUENOS AIRES</Doc:CityOfBirth>\n"
                + "                            <Doc:CtryOfBirth>AR</Doc:CtryOfBirth>\n"
                + "                        </Doc:DtAndPlcOfBirth>\n"
                + "                    </Doc:PrvtId>\n"
                + "                </Doc:Id>\n"
                + "            </Doc:Dbtr>\n"
                + "            <Doc:DbtrAcct>\n"
                + "                <Doc:Id>\n"
                + "                    <Doc:Othr>\n"
                + "                        <Doc:Id>1234567890</Doc:Id>\n"
                + "                    </Doc:Othr>\n"
                + "                </Doc:Id>\n"
                + "            </Doc:DbtrAcct>\n"
                + "            <Doc:DbtrAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOYVEC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:DbtrAgt>\n"
                + "            <Doc:CdtrAgt>\n"
                + "                <Doc:FinInstnId>\n"
                + "                    <Doc:BICFI>FOOZUSC0XXX</Doc:BICFI>\n"
                + "                </Doc:FinInstnId>\n"
                + "            </Doc:CdtrAgt>\n"
                + "            <Doc:Cdtr>\n"
                + "                <Doc:Nm>John Smith</Doc:Nm>\n"
                + "                <Doc:PstlAdr>\n"
                + "                    <Doc:AdrLine>Hoogstrat 6</Doc:AdrLine>\n"
                + "                    <Doc:AdrLine>BE/Brussels</Doc:AdrLine>\n"
                + "                </Doc:PstlAdr>\n"
                + "            </Doc:Cdtr>\n"
                + "            <Doc:InstrForNxtAgt>\n"
                + "                <Doc:InstrInf>/TIPO/422</Doc:InstrInf>\n"
                + "            </Doc:InstrForNxtAgt>\n"
                + "        </Doc:CdtTrfTxInf>\n"
                + "    </Doc:FIToFICstmrCdtTrf>\n"
                + "</Doc:Document>\n"
                + "</RequestPayload>";

        // Create a new instance of MxPacs00800110 with AppHdr CreDtTm ZuluDateTime
        MxPacs00800110 mxPacs00800110 = MxPacs00800110.parse(xml);

        // After CreDtTm is parsed, it should be 2024-03-27T20:45:56Z
        assertTrue(mxPacs00800110.message().contains("2024-03-27T20:45:56Z"));
    }
}
