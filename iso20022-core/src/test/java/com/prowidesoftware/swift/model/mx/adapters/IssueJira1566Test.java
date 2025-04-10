package com.prowidesoftware.swift.model.mx.adapters;

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.mx.MxPacs00800108;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class IssueJira1566Test {

    @Test
    public void testNano() {
        String json = "{\n" + "  \"fiToFICstmrCdtTrf\": {\n"
                + "    \"grpHdr\": {\n"
                + "      \"msgId\": \"TETS\",\n"
                + "      \"creDtTm\": {\n"
                + "        \"dateTime\": {\n"
                + "          \"date\": {\n"
                + "            \"year\": 2023,\n"
                + "            \"month\": 8,\n"
                + "            \"day\": 10\n"
                + "          },\n"
                + "          \"time\": {\n"
                + "            \"hour\": 23,\n"
                + "            \"minute\": 35,\n"
                + "            \"second\": 53,\n"
                + "            \"nano\": 2312\n"
                + "          }\n"
                + "        },\n"
                + "        \"offset\": {\n"
                + "          \"totalSeconds\": -10800\n"
                + "        }\n"
                + "      }\n"
                + "    }\n"
                + "  }\n"
                + "}";

        MxPacs00800108 mx = MxPacs00800108.fromJson(json);

        mx.message();
        assertEquals(
                "2023-08-10T23:35:53.000002312-03:00",
                mx.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().toString());

        // Set Zulu Time .000Z, marshaller will create +00:00 offset
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2021-09-19T12:13:14.000Z");
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime);
        assertTrue(mx.message().contains("2021-09-19T12:13:14+00:00"));
        assertFalse(mx.message().contains("2021-09-19T12:13:14.000Z"));
        assertFalse(mx.message().contains("2021-09-19T12:13:14.Z"));

        // Set nano with Zeros
        offsetDateTime = OffsetDateTime.parse(
                "2021-09-19T12:13:14.00000+00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSXXX"));
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime);
        assertTrue(mx.message().contains("2021-09-19T12:13:14+00:00"));

        // Set nano with Zeros and Z
        offsetDateTime = OffsetDateTime.parse("2021-09-19T12:13:14.000000000Z");
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime);
        assertFalse(mx.message().contains("2021-09-19T12:13:14.Z"));

        // Set nano with Zeros and Offset
        offsetDateTime = OffsetDateTime.parse("2021-09-19T12:13:14.000000000-03:00");
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime);
        assertTrue(mx.message().contains("2021-09-19T12:13:14-03:00"));
    }
}
