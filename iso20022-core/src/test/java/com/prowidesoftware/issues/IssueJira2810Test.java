package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.OffsetDateTimeAdapter;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IssueJira2810Test {
    @Test
    public void testXMLCreationDt() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                + "<AppHdr xmlns=\"urn:swift:xsd:$ahV10\">"
                + "<From>"
                + "	<Type>DN</Type>"
                + " <Id>cn=funds,o=abcdchzzwww,o=swift</Id>"
                + "</From>"
                + "<To>"
                + "	<Type>DN</Type>"
                + "	<Id>cn=funds,o=dcbadeff,o=swift</Id>"
                + "</To>"
                + "	<MsgRef>11308917</MsgRef>"
                + "	<CrDate>2013-12-23T15:50:00</CrDate>"
                + "</AppHdr>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\">"
                + "<FIToFICstmrCdtTrf>"
                + "	<GrpHdr>"
                + "		<MsgId>MSGID-0001</MsgId>"
                + "		<CreDtTm>2025-09-16T12:31:42.780-03:00</CreDtTm>"
                + "		<NbOfTxs>1</NbOfTxs>"
                + "		<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
                + "		<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                + "		<InstgAgt><FinInstnId><BIC>KBBECH20DSZ</BIC></FinInstnId></InstgAgt>"
                + "		<InstdAgt><FinInstnId><BIC>DRESDEF0VNZ</BIC></FinInstnId></InstdAgt>"
                + "	</GrpHdr>"
                + "	<CdtTrfTxInf>"
                + " </CdtTrfTxInf>"
                + "</FIToFICstmrCdtTrf>"
                + "</Document>"
                + "</message>";
        // AbstractMX amx = AbstractMX.parse(xml);
        // String strXML = amx.message();
        MxPacs00800108 mx = new MxPacs00800108(xml);
        // custom serialization using a custom date time adapter
        MxWriteConfiguration config = new MxWriteConfiguration();
        DateTimeFormatter dateTimeFormatterBuilder = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
                .optionalStart()
                .appendFraction(ChronoField.NANO_OF_SECOND, 3, 3, true)
                .optionalEnd()
                .optionalStart()
                .appendPattern("XXX")
                .optionalEnd()
                .toFormatter();
        config.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new OffsetDateTimeAdapter(dateTimeFormatterBuilder));
        String strXML1 = mx.message(config);
        // Modified value after Fix
        Assertions.assertTrue(strXML1.contains("<pacs:CreDtTm>2025-09-16T12:31:42.780-03:00</pacs:CreDtTm>"));
    }
}
