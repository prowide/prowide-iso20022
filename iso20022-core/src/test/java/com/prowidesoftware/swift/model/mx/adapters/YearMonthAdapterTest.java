/*
 * Copyright 2006-2021 Prowide
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

import com.prowidesoftware.swift.model.mx.MxPacs00800102;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class YearMonthAdapterTest {

    private YearMonthAdapter adapter = new YearMonthAdapter();

    @Test
    public void testYearMonth() {
        YearMonth yearMonth = YearMonth.parse("2021-10");

        /*
        //TODO
        MxPacs00800102 mx1 = new MxPacs00800102();

        final String xml = mx1.message();
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>2021-10-19T12:13:14+00:00</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2021-10-19</Doc:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<Doc:CLSTm>12:13:14+00:00</Doc:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        LocalDate intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        LocalDate intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(ChronoField.YEAR), intrBkSttlmDt2.get(ChronoField.YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.MONTH_OF_YEAR), intrBkSttlmDt2.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.DAY_OF_YEAR), intrBkSttlmDt2.get(ChronoField.DAY_OF_YEAR));

        // assert time propagation
        OffsetTime clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        OffsetTime clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(ChronoField.HOUR_OF_DAY), clsTm2.get(ChronoField.HOUR_OF_DAY));
        assertEquals(clsTm1.get(ChronoField.MINUTE_OF_HOUR), clsTm2.get(ChronoField.MINUTE_OF_HOUR));
        assertEquals(clsTm1.get(ChronoField.SECOND_OF_MINUTE), clsTm2.get(ChronoField.SECOND_OF_MINUTE));
        assertEquals(clsTm1.get(ChronoField.NANO_OF_SECOND), clsTm2.get(ChronoField.NANO_OF_SECOND));
        assertEquals(clsTm1.getOffset(), clsTm2.getOffset());
        */

    }

}
