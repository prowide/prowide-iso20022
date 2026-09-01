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

import com.prowidesoftware.swift.model.mx.MxPacs00800102;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.junit.jupiter.api.Test;

/**
 * End to end test of the fallback zone option for date time and time elements without offset, injected through the
 * read configuration.
 */
public class TypeAdaptersConfigurationFallbackZoneTest {

    private static final String XML_WITHOUT_OFFSET =
            "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\">"
                    + "<FIToFICstmrCdtTrf>"
                    + "<GrpHdr>"
                    + "<MsgId>TEST</MsgId>"
                    + "<CreDtTm>2021-10-19T12:13:14</CreDtTm>"
                    + "<NbOfTxs>1</NbOfTxs>"
                    + "<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                    + "</GrpHdr>"
                    + "<CdtTrfTxInf>"
                    + "<PmtId><EndToEndId>E2E</EndToEndId><TxId>TX</TxId></PmtId>"
                    + "<IntrBkSttlmAmt Ccy=\"EUR\">100</IntrBkSttlmAmt>"
                    + "<SttlmTmReq><CLSTm>12:13:14</CLSTm></SttlmTmReq>"
                    + "</CdtTrfTxInf>"
                    + "</FIToFICstmrCdtTrf>"
                    + "</Document>";

    private static final String XML_WITH_OFFSET = XML_WITHOUT_OFFSET.replace("12:13:14<", "12:13:14-03:00<");

    private static MxReadConfiguration confWithFallbackZone(ZoneId zone) {
        MxReadConfiguration conf = new MxReadConfiguration();
        conf.adapters = TypeAdaptersConfiguration.withFallbackZone(zone);
        return conf;
    }

    @Test
    public void testFallbackZoneAppliedOnParse() {
        MxPacs00800102 mx = MxPacs00800102.parse(XML_WITHOUT_OFFSET, confWithFallbackZone(ZoneId.of("Asia/Kolkata")));

        OffsetDateTime creDtTm = mx.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm();
        assertEquals(LocalDateTime.parse("2021-10-19T12:13:14"), creDtTm.toLocalDateTime());
        assertEquals(ZoneOffset.ofHoursMinutes(5, 30), creDtTm.getOffset());

        OffsetTime clsTm = mx.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        assertEquals(LocalTime.parse("12:13:14"), clsTm.toLocalTime());
        assertEquals(ZoneOffset.ofHoursMinutes(5, 30), clsTm.getOffset());

        // the resolved offset is then explicit in the serialization
        String xml = mx.message();
        assertTrue(xml.contains("2021-10-19T12:13:14+05:30"), xml);
        assertTrue(xml.contains(">12:13:14+05:30<"), xml);
    }

    @Test
    public void testFallbackZoneUtcIsIndependentOfSystemDefault() {
        MxPacs00800102 mx = MxPacs00800102.parse(XML_WITHOUT_OFFSET, confWithFallbackZone(ZoneOffset.UTC));
        assertEquals(
                OffsetDateTime.parse("2021-10-19T12:13:14Z"),
                mx.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                OffsetTime.parse("12:13:14Z"),
                mx.getFIToFICstmrCdtTrf()
                        .getCdtTrfTxInf()
                        .get(0)
                        .getSttlmTmReq()
                        .getCLSTm());
    }

    @Test
    public void testFallbackZoneDoesNotAffectValuesWithOffset() {
        MxPacs00800102 mx = MxPacs00800102.parse(XML_WITH_OFFSET, confWithFallbackZone(ZoneOffset.UTC));
        assertEquals(
                OffsetDateTime.parse("2021-10-19T12:13:14-03:00"),
                mx.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                OffsetTime.parse("12:13:14-03:00"),
                mx.getFIToFICstmrCdtTrf()
                        .getCdtTrfTxInf()
                        .get(0)
                        .getSttlmTmReq()
                        .getCLSTm());
    }

    @Test
    public void testDefaultConfigurationKeepsSystemDefaultZone() {
        MxPacs00800102 mx = MxPacs00800102.parse(XML_WITHOUT_OFFSET);
        LocalDateTime local = LocalDateTime.parse("2021-10-19T12:13:14");
        OffsetDateTime creDtTm = mx.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm();
        assertEquals(local, creDtTm.toLocalDateTime());
        assertEquals(ZoneId.systemDefault().getRules().getOffset(local), creDtTm.getOffset());
    }
}
