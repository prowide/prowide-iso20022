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

import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.jupiter.api.Test;

/**
 * Tests JSON serialization/deserialization for Calendar fields in MxSwiftMessage:
 * the new 1-based-month format with {@code schemaVersion} marker (consistent with
 * {@link AbstractSwiftMessage#JSON_SCHEMA_VERSION}) and the legacy 0-based format
 * produced by previous library versions.
 */
class MxSwiftMessageCalendarJsonTest {

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

    private static final String MX_BODY = "<Document xmlns=\\\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\\\">"
            + "<FIToFICstmrCdtTrf><GrpHdr><MsgId>MSGID-0001</MsgId>"
            + "<CreDtTm>2001-12-17T09:30:47Z</CreDtTm><NbOfTxs>1</NbOfTxs>"
            + "<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf></GrpHdr>"
            + "<CdtTrfTxInf></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";

    @Test
    void toJson_serializesMonthAsOneBased() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar april = new GregorianCalendar(2026, Calendar.APRIL, 10, 6, 6, 7);
        mx.setCreationDate(april);
        mx.setLastModified(april);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        JsonObject creationDate = root.getAsJsonObject("creationDate");
        assertEquals(4, creationDate.get("month").getAsInt(), "April should be month 4 (1-based)");
        assertEquals(2026, creationDate.get("year").getAsInt());
        assertEquals(10, creationDate.get("dayOfMonth").getAsInt());

        JsonObject lastModified = root.getAsJsonObject("lastModified");
        assertEquals(4, lastModified.get("month").getAsInt(), "April should be month 4 (1-based)");
    }

    @Test
    void toJson_january_serializesAsOne() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar january = new GregorianCalendar(2026, Calendar.JANUARY, 5, 0, 0, 0);
        mx.setCreationDate(january);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        assertEquals(
                1, root.getAsJsonObject("creationDate").get("month").getAsInt(), "January should be month 1 (1-based)");
    }

    @Test
    void toJson_december_serializesAsTwelve() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar december = new GregorianCalendar(2026, Calendar.DECEMBER, 25, 0, 0, 0);
        mx.setCreationDate(december);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        assertEquals(
                12,
                root.getAsJsonObject("creationDate").get("month").getAsInt(),
                "December should be month 12 (1-based)");
    }

    @Test
    void toJson_includesSchemaVersionMarker() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        assertTrue(root.has("schemaVersion"), "toJson output must include the schemaVersion marker");
        assertEquals(
                AbstractSwiftMessage.JSON_SCHEMA_VERSION,
                root.get("schemaVersion").getAsInt(),
                "schemaVersion must match AbstractSwiftMessage.JSON_SCHEMA_VERSION");
    }

    @Test
    void toJson_valueDateAndTradeDate_areOneBased() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);
        Calendar march = new GregorianCalendar(2026, Calendar.MARCH, 20, 9, 15, 0);
        Calendar november = new GregorianCalendar(2026, Calendar.NOVEMBER, 5, 16, 45, 30);
        mx.setValueDate(march);
        mx.setTradeDate(november);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        JsonObject valueDate = root.getAsJsonObject("valueDate");
        assertEquals(3, valueDate.get("month").getAsInt(), "March should be month 3 (1-based)");
        assertEquals(2026, valueDate.get("year").getAsInt());
        assertEquals(20, valueDate.get("dayOfMonth").getAsInt());

        JsonObject tradeDate = root.getAsJsonObject("tradeDate");
        assertEquals(11, tradeDate.get("month").getAsInt(), "November should be month 11 (1-based)");
        assertEquals(2026, tradeDate.get("year").getAsInt());
        assertEquals(5, tradeDate.get("dayOfMonth").getAsInt());
    }

    @Test
    void toJson_statusTrailMonth_isOneBased() {
        MxSwiftMessage mx = new MxSwiftMessage(MX_XML);

        Calendar september = new GregorianCalendar(2026, Calendar.SEPTEMBER, 15, 10, 30, 0);
        SwiftMessageStatusInfo status = new SwiftMessageStatusInfo("comments", september, "user", "LOADED");
        mx.addStatus(status);

        String json = mx.toJson();
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        JsonObject statusDate =
                root.getAsJsonArray("statusTrail").get(0).getAsJsonObject().getAsJsonObject("creationDate");
        assertEquals(9, statusDate.get("month").getAsInt(), "September should be month 9 (1-based)");
    }

    @Test
    void fromJson_legacyPayloadWithoutMarker_deserializesZeroBasedMonth() {
        // Legacy format: month is 0-based (January=0, December=11), no schemaVersion marker.
        // Month 7 in legacy JSON corresponds to Calendar.AUGUST (which is also 7 in 0-based).
        String json = "{\n"
                + "  \"businessProcess\": \"pacs\",\n"
                + "  \"functionality\": \"008\",\n"
                + "  \"variant\": \"001\",\n"
                + "  \"version\": \"02\",\n"
                + "  \"message\": \"" + MX_BODY + "\",\n"
                + "  \"identifier\": \"pacs.008.001.02\",\n"
                + "  \"creationDate\": {\n"
                + "    \"year\": 2025,\n"
                + "    \"month\": 7,\n"
                + "    \"dayOfMonth\": 15,\n"
                + "    \"hourOfDay\": 14,\n"
                + "    \"minute\": 30,\n"
                + "    \"second\": 0\n"
                + "  }\n"
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertEquals(2025, mx.getCreationDate().get(Calendar.YEAR));
        assertEquals(Calendar.AUGUST, mx.getCreationDate().get(Calendar.MONTH));
        assertEquals(15, mx.getCreationDate().get(Calendar.DAY_OF_MONTH));
    }

    @Test
    void fromJson_payloadWithMarker_deserializesOneBasedMonth() {
        // New format: month is 1-based (January=1, December=12), schemaVersion marker present.
        // Month 8 in new JSON corresponds to Calendar.AUGUST (which is 7 in 0-based).
        String json = "{\n"
                + "  \"schemaVersion\": 4,\n"
                + "  \"businessProcess\": \"pacs\",\n"
                + "  \"functionality\": \"008\",\n"
                + "  \"variant\": \"001\",\n"
                + "  \"version\": \"02\",\n"
                + "  \"message\": \"" + MX_BODY + "\",\n"
                + "  \"identifier\": \"pacs.008.001.02\",\n"
                + "  \"creationDate\": {\n"
                + "    \"year\": 2025,\n"
                + "    \"month\": 8,\n"
                + "    \"dayOfMonth\": 15,\n"
                + "    \"hourOfDay\": 14,\n"
                + "    \"minute\": 30,\n"
                + "    \"second\": 0\n"
                + "  }\n"
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertEquals(2025, mx.getCreationDate().get(Calendar.YEAR));
        assertEquals(Calendar.AUGUST, mx.getCreationDate().get(Calendar.MONTH));
        assertEquals(15, mx.getCreationDate().get(Calendar.DAY_OF_MONTH));
    }

    @Test
    void fromJson_legacyPayloadWithJanuary_deserializesAsJanuary() {
        // In legacy format, January is encoded as month 0 (Calendar.JANUARY).
        // This is the most sensitive case: under the new adapter, month 0 would be lenient-rolled
        // to December of the previous year. The marker-based discrimination must prevent that.
        String json = "{\n"
                + "  \"businessProcess\": \"pacs\",\n"
                + "  \"functionality\": \"008\",\n"
                + "  \"variant\": \"001\",\n"
                + "  \"version\": \"02\",\n"
                + "  \"message\": \"" + MX_BODY + "\",\n"
                + "  \"identifier\": \"pacs.008.001.02\",\n"
                + "  \"creationDate\": {\n"
                + "    \"year\": 2024,\n"
                + "    \"month\": 0,\n"
                + "    \"dayOfMonth\": 20\n"
                + "  }\n"
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertEquals(2024, mx.getCreationDate().get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, mx.getCreationDate().get(Calendar.MONTH));
        assertEquals(20, mx.getCreationDate().get(Calendar.DAY_OF_MONTH));
    }

    @Test
    void roundtrip_preservesDate() {
        MxSwiftMessage original = new MxSwiftMessage(MX_XML);
        Calendar august = new GregorianCalendar(2025, Calendar.AUGUST, 15, 14, 30, 45);
        Calendar march = new GregorianCalendar(2025, Calendar.MARCH, 1, 9, 0, 0);
        original.setCreationDate(august);
        original.setLastModified(march);

        String json = original.toJson();
        MxSwiftMessage restored = MxSwiftMessage.fromJson(json);

        assertEquals(2025, restored.getCreationDate().get(Calendar.YEAR));
        assertEquals(Calendar.AUGUST, restored.getCreationDate().get(Calendar.MONTH));
        assertEquals(15, restored.getCreationDate().get(Calendar.DAY_OF_MONTH));
        assertEquals(14, restored.getCreationDate().get(Calendar.HOUR_OF_DAY));
        assertEquals(30, restored.getCreationDate().get(Calendar.MINUTE));
        assertEquals(45, restored.getCreationDate().get(Calendar.SECOND));

        assertEquals(2025, restored.getLastModified().get(Calendar.YEAR));
        assertEquals(Calendar.MARCH, restored.getLastModified().get(Calendar.MONTH));
        assertEquals(1, restored.getLastModified().get(Calendar.DAY_OF_MONTH));
        assertEquals(9, restored.getLastModified().get(Calendar.HOUR_OF_DAY));
    }

    @Test
    void roundtrip_statusTrail_preservesNestedCalendar() {
        MxSwiftMessage original = new MxSwiftMessage(MX_XML);
        Calendar september = new GregorianCalendar(2026, Calendar.SEPTEMBER, 15, 10, 30, 0);
        original.addStatus(new SwiftMessageStatusInfo("comments", september, "user", "LOADED"));

        String json = original.toJson();
        MxSwiftMessage restored = MxSwiftMessage.fromJson(json);

        assertNotNull(restored.getStatusTrail());
        assertEquals(1, restored.getStatusTrail().size());
        Calendar restoredDate = restored.getStatusTrail().get(0).getCreationDate();
        assertEquals(2026, restoredDate.get(Calendar.YEAR));
        assertEquals(Calendar.SEPTEMBER, restoredDate.get(Calendar.MONTH));
        assertEquals(15, restoredDate.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    void fromJson_missingCalendarFields_deserializesGracefully() {
        String json = "{\n"
                + "  \"schemaVersion\": 4,\n"
                + "  \"businessProcess\": \"pacs\",\n"
                + "  \"functionality\": \"008\",\n"
                + "  \"variant\": \"001\",\n"
                + "  \"version\": \"02\",\n"
                + "  \"message\": \"" + MX_BODY + "\",\n"
                + "  \"identifier\": \"pacs.008.001.02\"\n"
                + "}";

        MxSwiftMessage mx = MxSwiftMessage.fromJson(json);

        assertNotNull(mx);
        assertEquals(MxBusinessProcess.pacs, mx.getBusinessProcess());
        assertEquals("pacs.008.001.02", mx.getIdentifier());
    }
}
