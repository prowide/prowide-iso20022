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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.dic.CreditTransferTransactionInformation11;
import com.prowidesoftware.swift.model.mx.dic.FIToFICustomerCreditTransferV02;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader33;
import com.prowidesoftware.swift.model.mx.dic.SettlementTimeRequest2;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import org.junit.jupiter.api.Test;

public class MxWriteAdaptersTest {
    private final ZoneOffset systemOffset = ZoneOffset.ofHours(-3);

    @Test
    public void testDocumentDateTime_DefaultAdapters_noFractionalSecond() {
        MxPacs00800102 mx1 = getMxPacs00800102WithDateTimeValuesFilled();

        final String xml1 = mx1.message();

        // System.out.println(xml1);
        assertTrue(xml1.contains("<pacs:CreDtTm>2021-10-19T12:13:14" + systemOffset + "</pacs:CreDtTm>"));
        assertTrue(xml1.contains("<pacs:IntrBkSttlmDt>2021-10-19</pacs:IntrBkSttlmDt>"));
        assertTrue(xml1.contains("<pacs:CLSTm>12:13:14" + systemOffset + "</pacs:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml1);
        // System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        LocalDate intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        LocalDate intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(ChronoField.YEAR), intrBkSttlmDt2.get(ChronoField.YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.MONTH_OF_YEAR), intrBkSttlmDt2.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.DAY_OF_WEEK), intrBkSttlmDt2.get(ChronoField.DAY_OF_WEEK));

        // assert time propagation
        OffsetTime clsTm1 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        OffsetTime clsTm2 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(ChronoField.HOUR_OF_DAY), clsTm2.get(ChronoField.HOUR_OF_DAY));
        assertEquals(clsTm1.get(ChronoField.MINUTE_OF_HOUR), clsTm2.get(ChronoField.MINUTE_OF_HOUR));
        assertEquals(clsTm1.get(ChronoField.SECOND_OF_MINUTE), clsTm2.get(ChronoField.SECOND_OF_MINUTE));
        assertEquals(clsTm1.get(ChronoField.MILLI_OF_SECOND), clsTm2.get(ChronoField.MILLI_OF_SECOND));
        assertEquals(clsTm1.getOffset(), clsTm2.getOffset());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_Z() {
        ZoneId utc = ZoneId.of("UTC");
        ZoneOffset offsetUTC = utc.getRules().getOffset(Instant.now());

        LocalDate localDate = LocalDate.parse("2021-10-19");
        OffsetTime offsetTime = OffsetTime.parse("12:13:14" + offsetUTC);
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2021-10-19T12:13:14" + offsetUTC);

        MxPacs00800102 mx1 = setDatesIntoMessage(localDate, offsetTime, offsetDateTime);

        final String xml = mx1.message();
        // System.out.println(xml);
        assertTrue(xml.contains("<pacs:CreDtTm>2021-10-19T12:13:14+00:00</pacs:CreDtTm>"));
        assertTrue(xml.contains("<pacs:IntrBkSttlmDt>2021-10-19</pacs:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<pacs:CLSTm>12:13:14+00:00</pacs:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        // System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        LocalDate intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        LocalDate intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(ChronoField.YEAR), intrBkSttlmDt2.get(ChronoField.YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.MONTH_OF_YEAR), intrBkSttlmDt2.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.DAY_OF_YEAR), intrBkSttlmDt2.get(ChronoField.DAY_OF_YEAR));

        // assert time propagation
        OffsetTime clsTm1 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        OffsetTime clsTm2 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(ChronoField.HOUR_OF_DAY), clsTm2.get(ChronoField.HOUR_OF_DAY));
        assertEquals(clsTm1.get(ChronoField.MINUTE_OF_HOUR), clsTm2.get(ChronoField.MINUTE_OF_HOUR));
        assertEquals(clsTm1.get(ChronoField.SECOND_OF_MINUTE), clsTm2.get(ChronoField.SECOND_OF_MINUTE));
        assertEquals(clsTm1.get(ChronoField.NANO_OF_SECOND), clsTm2.get(ChronoField.NANO_OF_SECOND));
        assertEquals(clsTm1.getOffset(), clsTm2.getOffset());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_fractionalSecond() {
        MxPacs00800102 mx1 = getMxPacs00800102WithDateTimeValuesFilled();
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2021-10-19T12:13:14.123" + systemOffset);

        mx1.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime); // date time
        mx1.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .setCLSTm(OffsetTime.parse("12:13:14.123" + systemOffset)); // time

        final String xml = mx1.message();
        // System.out.println(xml);
        assertTrue(xml.contains("<pacs:CreDtTm>2021-10-19T12:13:14.123" + systemOffset + "</pacs:CreDtTm>"));
        assertTrue(xml.contains("<pacs:IntrBkSttlmDt>2021-10-19</pacs:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<pacs:CLSTm>12:13:14.123" + systemOffset + "</pacs:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        // System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        LocalDate intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        LocalDate intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(ChronoField.YEAR), intrBkSttlmDt2.get(ChronoField.YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.MONTH_OF_YEAR), intrBkSttlmDt2.get(ChronoField.MONTH_OF_YEAR));
        assertEquals(intrBkSttlmDt1.get(ChronoField.DAY_OF_MONTH), intrBkSttlmDt2.get(ChronoField.DAY_OF_MONTH));

        // assert time propagation
        OffsetTime clsTm1 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        OffsetTime clsTm2 = mx2.getFIToFICstmrCdtTrf()
                .getCdtTrfTxInf()
                .get(0)
                .getSttlmTmReq()
                .getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(ChronoField.HOUR_OF_DAY), clsTm2.get(ChronoField.HOUR_OF_DAY));
        assertEquals(clsTm1.get(ChronoField.MINUTE_OF_HOUR), clsTm2.get(ChronoField.MINUTE_OF_HOUR));
        assertEquals(clsTm1.get(ChronoField.SECOND_OF_MINUTE), clsTm2.get(ChronoField.SECOND_OF_MINUTE));
        assertEquals(clsTm1.get(ChronoField.NANO_OF_SECOND), clsTm2.get(ChronoField.NANO_OF_SECOND));
        assertEquals(clsTm1.getOffset(), clsTm2.getOffset());
    }

    @Test
    public void testDocumentDateTime_CustomPattern() {
        MxPacs00800102 mx1 = getMxPacs00800102WithDateTimeValuesFilled();

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateTimeAdapter =
                new IsoDateTimeAdapter(new OffsetDateTimeAdapter(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm")));
        conf.adapters.dateAdapter = new IsoDateAdapter(new LocalDateAdapter(DateTimeFormatter.ofPattern("yy-MM-dd")));

        final String xml = mx1.message(conf);
        // System.out.println(xml);
        assertTrue(xml.contains("<pacs:CreDtTm>21-10-19 12:13</pacs:CreDtTm>"));
        assertTrue(xml.contains("<pacs:IntrBkSttlmDt>21-10-19</pacs:IntrBkSttlmDt>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml, new MxReadConfiguration(conf));
        // System.out.println(mx2.message());

        // assert date time propagation (seconds truncated in mx2)
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.YEAR),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.YEAR));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.MONTH_OF_YEAR),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.MONTH_OF_YEAR));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.DAY_OF_WEEK),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.DAY_OF_WEEK));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.HOUR_OF_DAY),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.HOUR_OF_DAY));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.MINUTE_OF_HOUR),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(ChronoField.MINUTE_OF_HOUR));

        // assert date propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt());
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.YEAR),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.YEAR));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.MONTH_OF_YEAR),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.MONTH_OF_YEAR));
        assertEquals(
                mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.DAY_OF_WEEK),
                mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(ChronoField.DAY_OF_WEEK));
    }

    @Test
    public void testDocumentDateTime_CustomAdapter() {
        MxPacs00800102 mx1 = getMxPacs00800102WithDateTimeValuesFilled();
        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new TestCustomDateTimeAdapter());
        conf.adapters.dateAdapter = new IsoDateAdapter(new TestCustomDateAdapter());

        final String xml = mx1.message(conf);
        // System.out.println(xml);
        assertTrue(xml.contains("<pacs:CreDtTm>foobar</pacs:CreDtTm>"));
        assertTrue(xml.contains("<pacs:IntrBkSttlmDt>foobar</pacs:IntrBkSttlmDt>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml, new MxReadConfiguration(conf));
        // System.out.println(mx2.message());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt());
    }

    @Test
    public void testAppHdrDateTime_DefaultAdapters() {
        AppHdr h1 = header();

        final String xml = h1.xml();
        // System.out.println(xml);
        assertTrue(xml.contains("<CreDt>2021-10-19T12:13:14" + systemOffset + "</CreDt>"));

        final BusinessAppHdrV02 h2 = (BusinessAppHdrV02) AppHdrParser.parse(xml).get();
        // System.out.println(mx2.message());
        assertNotNull(h2.getCreDt());
        assertEquals(h1.creationDate(), h2.getCreDt());
    }

    private AppHdr header() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2021-10-19T12:13:14" + systemOffset);

        BusinessAppHdrV02 bah =
                AppHdrFactory.createBusinessAppHdrV02("AAAAUSXXXXX", "BBBBUSXXXXX", "ref", new MxId("pacs.008.001.08"));
        bah.setCreDt(offsetDateTime);
        return bah;
    }

    private MxPacs00800102 getMxPacs00800102WithDateTimeValuesFilled() {
        LocalDate localDate = LocalDate.parse("2021-10-19");
        OffsetTime offsetTime = OffsetTime.parse("12:13:14" + systemOffset);
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2021-10-19T12:13:14" + systemOffset);
        MxPacs00800102 mx1 = setDatesIntoMessage(localDate, offsetTime, offsetDateTime);
        return mx1;
    }

    private MxPacs00800102 setDatesIntoMessage(
            final LocalDate localDate, OffsetTime offsetTime, OffsetDateTime offsetDateTime) {
        final MxPacs00800102 mx = new MxPacs00800102();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV02());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader33());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(offsetDateTime); // date time
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setIntrBkSttlmDt(localDate); // date
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransactionInformation11());
        mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).setSttlmTmReq(new SettlementTimeRequest2());
        mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().setCLSTm(offsetTime); // time
        return mx;
    }

    class TestCustomDateAdapter extends XmlAdapter<String, LocalDate> {
        @Override
        public LocalDate unmarshal(String v) {
            return LocalDate.now();
        }

        @Override
        public String marshal(LocalDate cal) {
            return "foobar";
        }
    }

    public class TestCustomDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {
        @Override
        public OffsetDateTime unmarshal(String v) {
            return OffsetDateTime.now();
        }

        @Override
        public String marshal(OffsetDateTime offsetDateTime) {
            return "foobar";
        }
    }
}
