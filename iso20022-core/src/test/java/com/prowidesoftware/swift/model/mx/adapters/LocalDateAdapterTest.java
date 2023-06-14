package com.prowidesoftware.swift.model.mx.adapters;

import com.prowidesoftware.swift.model.mx.MxPacs00800108;
import com.prowidesoftware.swift.model.mx.MxPacs00900110;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateAdapterTest {

    @Test
    void testLocalDate() throws Exception {
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        LocalDate localDate = localDateAdapter.unmarshal("2021-09-19");
        assertEquals("2021-09-19", localDateAdapter.marshal(localDate));
    }

    @Test
    void testLocalDateDropOffset() throws Exception {
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        LocalDate localDate = localDateAdapter.unmarshal("2021-09-19-02:00");
        assertEquals("2021-09-19", localDateAdapter.marshal(localDate));
    }

    @Test
    void testLocalDateDropZone() throws Exception {
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        LocalDate localDate = localDateAdapter.unmarshal("2021-09-19Z");
        assertEquals("2021-09-19", localDateAdapter.marshal(localDate));
    }

    @Test
    void testLocalDateDropTime() throws Exception {
        LocalDateAdapter localDateAdapter = new LocalDateAdapter();
        LocalDate localDate = localDateAdapter.unmarshal("2021-09-19T23:34:65.233Z");
        assertEquals("2021-09-19", localDateAdapter.marshal(localDate));
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
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10\">\n" +
                "    <FICdtTrf>\n" +
                "        <GrpHdr>\n" +
                "            <MsgId>1939E8A71727EDDF</MsgId>\n" +
                "            <CreDtTm>2023-04-21T14:48:38-03:00</CreDtTm>\n" +
                "            <NbOfTxs>1</NbOfTxs>\n" +
                "            <SttlmInf>\n" +
                "                <SttlmMtd>INDA</SttlmMtd>\n" +
                "            </SttlmInf>\n" +
                "            <InstgAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ROYCFRPBTGT</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </InstgAgt>\n" +
                "            <InstdAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>TRGTXEPMCLM</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </InstdAgt>\n" +
                "        </GrpHdr>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <PmtId>\n" +
                "                <InstrId>PA23012418819</InstrId>\n" +
                "                <EndToEndId>PA23012418819</EndToEndId>\n" +
                "                <TxId>PA23012418819</TxId>\n" +
                "                <UETR>6e8b66f5-ce02-4635-9eaa-3c0ff96ee901</UETR>\n" +
                "            </PmtId>\n" +
                "            <IntrBkSttlmAmt Ccy=\"EUR\">13000.0</IntrBkSttlmAmt>\n" +
                "            <IntrBkSttlmDt>2023-01-24</IntrBkSttlmDt>\n" +
                "            <IntrmyAgt1>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>TRGTXEPMCLM</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </IntrmyAgt1>\n" +
                "            <IntrmyAgt1Acct>\n" +
                "                <Id>\n" +
                "                    <Othr>\n" +
                "                        <Id>RBCPB-A2A-ROYCFRPBTGT</Id>\n" +
                "                    </Othr>\n" +
                "                </Id>\n" +
                "            </IntrmyAgt1Acct>\n" +
                "            <Dbtr>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ROYCFRPBTGT</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </Dbtr>\n" +
                "            <CdtrAgt>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ROYCFRPBTGT</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </CdtrAgt>\n" +
                "            <CdtrAgtAcct>\n" +
                "                <Id>\n" +
                "                    <Othr>\n" +
                "                        <Id>MFREURROYCFRPBTGT</Id>\n" +
                "                    </Othr>\n" +
                "                </Id>\n" +
                "            </CdtrAgtAcct>\n" +
                "            <Cdtr>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>ROYCFRPBTGT</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </Cdtr>\n" +
                "            <CdtrAcct>\n" +
                "                <Id>\n" +
                "                    <Othr>\n" +
                "                        <Id>RFREURROYCFRPBTGT</Id>\n" +
                "                    </Othr>\n" +
                "                </Id>\n" +
                "            </CdtrAcct>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FICdtTrf>\n" +
                "</Document>\n" +
                "</RequestPayload>";

        final MxPacs00900110 mx = MxPacs00900110.parse(xmlOrigin);
        final String xml = mx.message();
        assertTrue(xml.contains("IntrBkSttlmDt>2023-01-24</"));

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateAdapter = new IsoDateAdapter(new LocalDateAdapter((DateTimeFormatter.ofPattern("yyyy/MM/dd"))));
        final String xmlCustomFormat = mx.message(conf);
        assertTrue(xmlCustomFormat.contains("IntrBkSttlmDt>2023/01/24</"));

        conf.adapters.dateAdapter = new IsoDateAdapter(new LocalDateAdapter((DateTimeFormatter.ofPattern("yyyyMMdd"))));
        final String xmlCustomFormat2 = mx.message(conf);
        assertTrue(xmlCustomFormat2.contains("IntrBkSttlmDt>20230124</"));
    }

    @Test
    public void testLocalDateIgnoreOffset() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n" +
                "    <FIToFICstmrCdtTrf>\n" +
                "        <CdtTrfTxInf>\n" +
                "            <IntrBkSttlmDt>2021-04-08+02:00</IntrBkSttlmDt>\n" +
                "        </CdtTrfTxInf>\n" +
                "    </FIToFICstmrCdtTrf>\n" +
                "</Document>";
        MxPacs00800108 mx = MxPacs00800108.parse(xml);
        assertNotNull(mx);
        LocalDate date = mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getIntrBkSttlmDt();
        assertNotNull(date);
        assertEquals(2021, date.getYear());
        assertEquals(Month.APRIL, date.getMonth());
        assertEquals(8, date.getDayOfMonth());
    }

}