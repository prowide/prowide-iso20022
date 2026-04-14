/*
 * Copyright 2006-2026 Prowide
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
package com.prowidesoftware.swift.model;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

/**
 * Tests that Calendar fields in MxSwiftMessage are serialized with 1-based months in JSON.
 */
public class MxSwiftMessageCalendarJsonTest {

    private static final String MX_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<message>"
            + "<AppHdr xmlns=\"urn:swift:xsd:$ahV10\">"
            + "<From><Type>DN</Type><Id>cn=funds,o=abcdchzzwww,o=swift</Id></From>"
            + "<To><Type>DN</Type><Id>cn=funds,o=dcbadeff,o=swift</Id></To>"
            + "<MsgRef>11308917</MsgRef>"
            + "<CrDate>2013-12-23T15:50:00</CrDate>"
            + "</AppHdr>"
            + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\">"
            + "<FIToFICstmrCdtTrf>"
            + "<GrpHdr>"
            + "<MsgId>MSGID-0001</MsgId>"
            + "<CreDtTm>2001-12-17T09:30:47Z</CreDtTm>"
            + "<NbOfTxs>1</NbOfTxs>"
            + "<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
            + "<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
            + "</GrpHdr>"
            + "<CdtTrfTxInf></CdtTrfTxInf>"
            + "</FIToFICstmrCdtTrf>"
            + "</Document>"
            + "</message>";

    @Test
    void mxToJson_serializesMonthAsOneBased() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar april = new GregorianCalendar(2026, Calendar.APRIL, 10, 6, 6, 7);
        mx.setCreationDate(april);
        mx.setLastModified(april);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        JsonObject creationDate = root.getAsJsonObject("creationDate");
        assertThat(creationDate.get("month").getAsInt())
                .as("April should be month 4 (1-based)")
                .isEqualTo(4);
        assertThat(creationDate.get("year").getAsInt()).isEqualTo(2026);
        assertThat(creationDate.get("dayOfMonth").getAsInt()).isEqualTo(10);

        JsonObject lastModified = root.getAsJsonObject("lastModified");
        assertThat(lastModified.get("month").getAsInt())
                .as("April should be month 4 (1-based)")
                .isEqualTo(4);
    }

    @Test
    void mxToJson_january_serializesAsOne() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar january = new GregorianCalendar(2026, Calendar.JANUARY, 5, 0, 0, 0);
        mx.setCreationDate(january);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        assertThat(root.getAsJsonObject("creationDate").get("month").getAsInt())
                .as("January should be month 1 (1-based)")
                .isEqualTo(1);
    }

    @Test
    void mxToJson_december_serializesAsTwelve() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar december = new GregorianCalendar(2026, Calendar.DECEMBER, 25, 0, 0, 0);
        mx.setCreationDate(december);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        assertThat(root.getAsJsonObject("creationDate").get("month").getAsInt())
                .as("December should be month 12 (1-based)")
                .isEqualTo(12);
    }

    @Test
    void mxFromJson_deserializesOneBasedMonth() {
        String json = "{"
                + "  \"businessProcess\": \"pacs\","
                + "  \"functionality\": \"008\","
                + "  \"variant\": \"001\","
                + "  \"version\": \"02\","
                + "  \"message\": \"<Document xmlns=\\\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\\\"><FIToFICstmrCdtTrf><GrpHdr><MsgId>MSGID-0001</MsgId><CreDtTm>2001-12-17T09:30:47Z</CreDtTm><NbOfTxs>1</NbOfTxs><SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf></GrpHdr><CdtTrfTxInf></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>\","
                + "  \"identifier\": \"pacs.008.001.02\","
                + "  \"creationDate\": {"
                + "    \"year\": 2026,"
                + "    \"month\": 4,"
                + "    \"dayOfMonth\": 10,"
                + "    \"hourOfDay\": 6,"
                + "    \"minute\": 6,"
                + "    \"second\": 7"
                + "  },"
                + "  \"lastModified\": {"
                + "    \"year\": 2025,"
                + "    \"month\": 11,"
                + "    \"dayOfMonth\": 20,"
                + "    \"hourOfDay\": 14,"
                + "    \"minute\": 30,"
                + "    \"second\": 0"
                + "  }"
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertThat(mx.getCreationDate().get(Calendar.MONTH)).isEqualTo(Calendar.APRIL);
        assertThat(mx.getCreationDate().get(Calendar.YEAR)).isEqualTo(2026);
        assertThat(mx.getCreationDate().get(Calendar.DAY_OF_MONTH)).isEqualTo(10);

        assertThat(mx.getLastModified().get(Calendar.MONTH)).isEqualTo(Calendar.NOVEMBER);
        assertThat(mx.getLastModified().get(Calendar.YEAR)).isEqualTo(2025);
        assertThat(mx.getLastModified().get(Calendar.DAY_OF_MONTH)).isEqualTo(20);
    }

    @Test
    void mxRoundtrip_preservesDate() {
        MxSwiftMessage original = new MxSwiftMessage(MX_XML);
        Calendar august = new GregorianCalendar(2025, Calendar.AUGUST, 15, 14, 30, 45);
        Calendar march = new GregorianCalendar(2025, Calendar.MARCH, 1, 9, 0, 0);
        original.setCreationDate(august);
        original.setLastModified(march);

        String json = original.toJson();
        MxSwiftMessage restored = MxSwiftMessage.fromJson(json);

        assertThat(restored.getCreationDate().get(Calendar.YEAR)).isEqualTo(2025);
        assertThat(restored.getCreationDate().get(Calendar.MONTH)).isEqualTo(Calendar.AUGUST);
        assertThat(restored.getCreationDate().get(Calendar.DAY_OF_MONTH)).isEqualTo(15);
        assertThat(restored.getCreationDate().get(Calendar.HOUR_OF_DAY)).isEqualTo(14);
        assertThat(restored.getCreationDate().get(Calendar.MINUTE)).isEqualTo(30);
        assertThat(restored.getCreationDate().get(Calendar.SECOND)).isEqualTo(45);

        assertThat(restored.getLastModified().get(Calendar.YEAR)).isEqualTo(2025);
        assertThat(restored.getLastModified().get(Calendar.MONTH)).isEqualTo(Calendar.MARCH);
        assertThat(restored.getLastModified().get(Calendar.DAY_OF_MONTH)).isEqualTo(1);
        assertThat(restored.getLastModified().get(Calendar.HOUR_OF_DAY)).isEqualTo(9);
    }

    @Test
    void mxFromJson_missingCalendarFields_deserializesGracefully() {
        String json = "{"
                + "  \"businessProcess\": \"pacs\","
                + "  \"functionality\": \"008\","
                + "  \"variant\": \"001\","
                + "  \"version\": \"02\","
                + "  \"message\": \"<Document xmlns=\\\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\\\"><FIToFICstmrCdtTrf><GrpHdr><MsgId>MSGID-0001</MsgId><CreDtTm>2001-12-17T09:30:47Z</CreDtTm><NbOfTxs>1</NbOfTxs><SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf></GrpHdr><CdtTrfTxInf></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>\","
                + "  \"identifier\": \"pacs.008.001.02\""
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertThat(mx).isNotNull();
        assertThat(mx.getBusinessProcess()).isEqualTo(MxBusinessProcess.pacs);
        assertThat(mx.getIdentifier()).isEqualTo("pacs.008.001.02");
    }
}
