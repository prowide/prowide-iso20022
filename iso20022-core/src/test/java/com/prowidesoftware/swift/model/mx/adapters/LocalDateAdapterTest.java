package com.prowidesoftware.swift.model.mx.adapters;

import com.prowidesoftware.swift.model.mx.MxAcmt03400104;
import com.prowidesoftware.swift.model.mx.MxPacs00900110;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LocalDateAdapterTest {

    @Test
    void testLocalDate() throws Exception {
        ZoneId zoneId = ZoneOffset.systemDefault();
        OffsetDateTime dateTime = LocalDateTime.parse("2021-09-19T12:13:14")
                .atZone(zoneId)
                .withEarlierOffsetAtOverlap()
                .withFixedOffsetZone()
                .withEarlierOffsetAtOverlap()
                .toOffsetDateTime();

        String offset = dateTime.getOffset().getId();

        testDateTimeImpl("2021-09-19", "2021-09-19");

    }


    @Test
    public void testLocalDate_CustomPattern() {
        String xmlOrigin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<RequestPayload>\n" +
                "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n" +
                "    <h:Fr>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>ROYCFRPBTGT</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:Fr>\n" +
                "    <h:To>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>TRGTXEPMCLM</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:To>\n" +
                "    <h:BizMsgIdr>PA23012418819</h:BizMsgIdr>\n" +
                "    <h:MsgDefIdr>pacs.009.001.10</h:MsgDefIdr>\n" +
                "    <h:CreDt>2023-04-21T14:48:38-03:00</h:CreDt>\n" +
                "    <h:PssblDplct>false</h:PssblDplct>\n" +
                "    <h:Prty>NORM</h:Prty>\n" +
                "</h:AppHdr>\n" +
                "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10\">\n" +
                "    <Doc:FICdtTrf>\n" +
                "        <Doc:GrpHdr>\n" +
                "            <Doc:MsgId>1939E8A71727EDDF</Doc:MsgId>\n" +
                "            <Doc:CreDtTm>2023-04-21T14:48:38-03:00</Doc:CreDtTm>\n" +
                "            <Doc:NbOfTxs>1</Doc:NbOfTxs>\n" +
                "            <Doc:SttlmInf>\n" +
                "                <Doc:SttlmMtd>INDA</Doc:SttlmMtd>\n" +
                "            </Doc:SttlmInf>\n" +
                "            <Doc:InstgAgt>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>ROYCFRPBTGT</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:InstgAgt>\n" +
                "            <Doc:InstdAgt>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>TRGTXEPMCLM</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:InstdAgt>\n" +
                "        </Doc:GrpHdr>\n" +
                "        <Doc:CdtTrfTxInf>\n" +
                "            <Doc:PmtId>\n" +
                "                <Doc:InstrId>PA23012418819</Doc:InstrId>\n" +
                "                <Doc:EndToEndId>PA23012418819</Doc:EndToEndId>\n" +
                "                <Doc:TxId>PA23012418819</Doc:TxId>\n" +
                "                <Doc:UETR>6e8b66f5-ce02-4635-9eaa-3c0ff96ee901</Doc:UETR>\n" +
                "            </Doc:PmtId>\n" +
                "            <Doc:IntrBkSttlmAmt Ccy=\"EUR\">13000.0</Doc:IntrBkSttlmAmt>\n" +
                "            <Doc:IntrBkSttlmDt>2023-01-24</Doc:IntrBkSttlmDt>\n" +
                "            <Doc:IntrmyAgt1>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>TRGTXEPMCLM</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:IntrmyAgt1>\n" +
                "            <Doc:IntrmyAgt1Acct>\n" +
                "                <Doc:Id>\n" +
                "                    <Doc:Othr>\n" +
                "                        <Doc:Id>RBCPB-A2A-ROYCFRPBTGT</Doc:Id>\n" +
                "                    </Doc:Othr>\n" +
                "                </Doc:Id>\n" +
                "            </Doc:IntrmyAgt1Acct>\n" +
                "            <Doc:Dbtr>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>ROYCFRPBTGT</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:Dbtr>\n" +
                "            <Doc:CdtrAgt>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>ROYCFRPBTGT</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:CdtrAgt>\n" +
                "            <Doc:CdtrAgtAcct>\n" +
                "                <Doc:Id>\n" +
                "                    <Doc:Othr>\n" +
                "                        <Doc:Id>MFREURROYCFRPBTGT</Doc:Id>\n" +
                "                    </Doc:Othr>\n" +
                "                </Doc:Id>\n" +
                "            </Doc:CdtrAgtAcct>\n" +
                "            <Doc:Cdtr>\n" +
                "                <Doc:FinInstnId>\n" +
                "                    <Doc:BICFI>ROYCFRPBTGT</Doc:BICFI>\n" +
                "                </Doc:FinInstnId>\n" +
                "            </Doc:Cdtr>\n" +
                "            <Doc:CdtrAcct>\n" +
                "                <Doc:Id>\n" +
                "                    <Doc:Othr>\n" +
                "                        <Doc:Id>RFREURROYCFRPBTGT</Doc:Id>\n" +
                "                    </Doc:Othr>\n" +
                "                </Doc:Id>\n" +
                "            </Doc:CdtrAcct>\n" +
                "        </Doc:CdtTrfTxInf>\n" +
                "    </Doc:FICdtTrf>\n" +
                "</Doc:Document>\n" +
                "</RequestPayload>";

        final MxPacs00900110 mx = MxPacs00900110.parse(xmlOrigin);
        final String xml = mx.message();
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2023-01-24</Doc:IntrBkSttlmDt>"));

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateAdapter = new IsoDateAdapter(new LocalDateAdapter((DateTimeFormatter.ofPattern("yyyy/MM/dd"))));
        final String xmlCustomFormat = mx.message(conf);
        assertTrue(xmlCustomFormat.contains("<Doc:IntrBkSttlmDt>2023/01/24</Doc:IntrBkSttlmDt>"));

        conf.adapters.dateAdapter = new IsoDateAdapter(new LocalDateAdapter((DateTimeFormatter.ofPattern("yyyyMMdd"))));
        final String xmlCustomFormat2 = mx.message(conf);
        assertTrue(xmlCustomFormat2.contains("<Doc:IntrBkSttlmDt>20230124</Doc:IntrBkSttlmDt>"));

    }

    private void testDateTimeImpl(String value, String valueResult) throws Exception {
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        LocalDate localDate = localDateAdapter.unmarshal(value);
        String valueDateResult = localDateAdapter.marshal(localDate);
        assertEquals(valueResult, valueDateResult);
    }

}