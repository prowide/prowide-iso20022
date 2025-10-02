package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.adapters.OffsetDateTimeAdapter;
import java.time.OffsetDateTime;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class IssueJira2810Test {
    @Test
    public void testCreationDt() {
        String xml = "";
        MxPacs00900108 mx = new MxPacs00900108(xml);
        // default date time adapter contains the offset
        String strXML = mx.message();
        System.out.println(strXML);

        // custom serialization using a custom date time adapter
        // MxWriteConfiguration config = new MxWriteConfiguration();
        // config.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new CustomDateTimeAdapter());
    }

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
        // System.out.println("AMX:" + strXML);
        MxPacs00800108 mx = new MxPacs00800108(xml);
        // default date time adapter contains the offset
        String strXML1 = mx.message();
        System.out.println("MX:" + strXML1);

        // custom serialization using a custom date time adapter
        // MxWriteConfiguration config = new MxWriteConfiguration();
        // config.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new CustomDateTimeAdapter());
    }

    public class CustomDateTimeAdapter extends OffsetDateTimeAdapter {
        @Override
        public String marshal(OffsetDateTime offsetDateTime) throws Exception {
            return StringUtils.replace(super.marshal(offsetDateTime), "+00:00", "Z");
        }
    }
}
