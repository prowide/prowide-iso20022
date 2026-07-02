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

import java.util.Calendar;
import org.junit.jupiter.api.Test;

/**
 * Tests JSON deserialization for Calendar fields in {@link MxSwiftMessage#fromJson(String)}: the new
 * 1-based-month format identified by a {@code schemaVersion} marker, and the legacy 0-based format
 * produced by previous library versions. This branch's {@code toJson()} does not yet emit the marker
 * or the 1-based format itself (that requires a pw-swift-core update not yet pinned here); these tests
 * only cover the reader-side compatibility.
 */
class MxSwiftMessageCalendarJsonTest {

    private static final String MX_BODY = "<Document xmlns=\\\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\\\">"
            + "<FIToFICstmrCdtTrf><GrpHdr><MsgId>MSGID-0001</MsgId>"
            + "<CreDtTm>2001-12-17T09:30:47Z</CreDtTm><NbOfTxs>1</NbOfTxs>"
            + "<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf></GrpHdr>"
            + "<CdtTrfTxInf></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";

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
