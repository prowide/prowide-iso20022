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

import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.dic.CreditTransferTransactionInformation11;
import com.prowidesoftware.swift.model.mx.dic.FIToFICustomerCreditTransferV02;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader33;
import com.prowidesoftware.swift.model.mx.dic.SettlementTimeRequest2;
import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static org.junit.jupiter.api.Assertions.*;

public class MxWriteWithAdaptersTest {

    @Test
    public void testDocumentDateTime_DefaultAdapters_noFractionalSecond() throws DatatypeConfigurationException {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2021);
        c.set(Calendar.MONTH, Calendar.OCTOBER);
        c.set(Calendar.DAY_OF_WEEK,19);
        c.set(Calendar.HOUR,12);
        c.set(Calendar.MINUTE,13);
        c.set(Calendar.SECOND,14);
        MxPacs00800102 mx1 = sample(c);

        final String xml = mx1.message();
        //System.out.println(xml);
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(LocalDateTime.of(2021, 10, 19, 12, 13, 14));;
        assertTrue(xml.contains("<Doc:CreDtTm>2021-10-19T12:13:14"+ offset + "</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2021-10-19</Doc:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<Doc:CLSTm>12:13:14"+ offset + "</Doc:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        Calendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        Calendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(Calendar.YEAR), intrBkSttlmDt2.get(Calendar.YEAR));
        assertEquals(intrBkSttlmDt1.get(Calendar.MONTH), intrBkSttlmDt2.get(Calendar.MONTH));
        assertEquals(intrBkSttlmDt1.get(Calendar.DAY_OF_WEEK), intrBkSttlmDt2.get(Calendar.DAY_OF_WEEK));

        // assert time propagation
        Calendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        Calendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(Calendar.HOUR), clsTm2.get(Calendar.HOUR));
        assertEquals(clsTm1.get(Calendar.MINUTE), clsTm2.get(Calendar.MINUTE));
        assertEquals(clsTm1.get(Calendar.SECOND), clsTm2.get(Calendar.SECOND));
        assertEquals(clsTm1.get(Calendar.MILLISECOND), clsTm2.get(Calendar.MILLISECOND));
        assertEquals(clsTm1.getTimeZone(), clsTm2.getTimeZone());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_Z() throws DatatypeConfigurationException {

        Calendar utc = Calendar.getInstance();
        utc.set(Calendar.YEAR,2021);
        utc.set(Calendar.MONTH, Calendar.OCTOBER);
        utc.set(Calendar.DAY_OF_WEEK,19);
        utc.set(Calendar.HOUR,12);
        utc.set(Calendar.MINUTE,13);
        utc.set(Calendar.SECOND,14);

        utc.setTimeZone(TimeZone.getTimeZone("0"));
        MxPacs00800102 mx1 = sample(utc);

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
        Calendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        Calendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(Calendar.YEAR), intrBkSttlmDt2.get(Calendar.YEAR));
        assertEquals(intrBkSttlmDt1.get(Calendar.MONTH), intrBkSttlmDt2.get(Calendar.MONTH));
        assertEquals(intrBkSttlmDt1.DAY_OF_WEEK, intrBkSttlmDt2.DAY_OF_WEEK);

        // assert time propagation
        Calendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        Calendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(Calendar.HOUR), clsTm2.get(Calendar.HOUR));
        assertEquals(clsTm1.get(Calendar.MINUTE), clsTm2.get(Calendar.MINUTE));
        assertEquals(clsTm1.get(Calendar.SECOND), clsTm2.get(Calendar.SECOND));
        assertEquals(clsTm1.get(Calendar.MILLISECOND), clsTm2.get(Calendar.MILLISECOND));
        assertEquals(clsTm1.getTimeZone(), clsTm2.getTimeZone());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_fractionalSecond() throws DatatypeConfigurationException {
        Calendar fractionalSecond = Calendar.getInstance();
        fractionalSecond.set(Calendar.YEAR,2021);
        fractionalSecond.set(Calendar.MONTH, Calendar.OCTOBER);
        fractionalSecond.set(Calendar.DAY_OF_WEEK,19);
        fractionalSecond.set(Calendar.HOUR,12);
        fractionalSecond.set(Calendar.MINUTE,13);
        fractionalSecond.set(Calendar.SECOND,14);
        fractionalSecond.set(Calendar.MILLISECOND, 123);
        MxPacs00800102 mx1 = sample(fractionalSecond);

        final String xml = mx1.message();
        //System.out.println(xml);
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(LocalDateTime.of(2021, 10, 19, 12, 13, 14));
        assertTrue(xml.contains("<Doc:CreDtTm>2021-10-19T12:13:14.123"+ offset + "</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2021-10-19</Doc:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<Doc:CLSTm>12:13:14.123"+ offset + "</Doc:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        Calendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        Calendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.get(Calendar.YEAR), intrBkSttlmDt2.get(Calendar.YEAR));
        assertEquals(intrBkSttlmDt1.get(Calendar.MONTH), intrBkSttlmDt2.get(Calendar.MONTH));
        assertEquals(intrBkSttlmDt1.DAY_OF_WEEK, intrBkSttlmDt2.DAY_OF_WEEK);

        // assert time propagation
        Calendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        Calendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.get(Calendar.HOUR), clsTm2.get(Calendar.HOUR));
        assertEquals(clsTm1.get(Calendar.MINUTE), clsTm2.get(Calendar.MINUTE));
        assertEquals(clsTm1.get(Calendar.SECOND), clsTm2.get(Calendar.SECOND));
        assertEquals(clsTm1.get(Calendar.MILLISECOND), clsTm2.get(Calendar.MILLISECOND));
        assertEquals(clsTm1.getTimeZone(), clsTm2.getTimeZone());
    }

    @Test
    public void testDocumentDateTime_CustomPattern() throws DatatypeConfigurationException {
        Calendar noFractionalSecond = Calendar.getInstance();
        noFractionalSecond.set(Calendar.YEAR,2021);
        noFractionalSecond.set(Calendar.MONTH, Calendar.OCTOBER);
        noFractionalSecond.set(Calendar.DAY_OF_WEEK,19);
        noFractionalSecond.set(Calendar.HOUR,12);
        noFractionalSecond.set(Calendar.MINUTE,13);
        noFractionalSecond.set(Calendar.SECOND,14);

        MxPacs00800102 mx1 = sample(noFractionalSecond);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new ZonedDateTimeAdapter(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm")));
        conf.adapters.dateAdapter = new IsoDateAdapter(new SimpleDateAdapter(DateTimeFormatter.ofPattern("yy-MM-dd")));

        final String xml = mx1.message(conf);
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>21-10-19 12:13</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>21-10-19</Doc:IntrBkSttlmDt>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml, new MxReadConfiguration(conf));
        //System.out.println(mx2.message());

        // assert date time propagation (seconds truncated in mx2)
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.YEAR), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.YEAR));
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.MONTH), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.MONTH));
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().DAY_OF_WEEK, mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().DAY_OF_WEEK);
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.HOUR), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.HOUR));
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.MINUTE), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().get(Calendar.MINUTE));

        // assert date propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(Calendar.YEAR), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(Calendar.YEAR));
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(Calendar.MONTH), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().get(Calendar.MONTH));
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().DAY_OF_WEEK, mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().DAY_OF_WEEK);
    }

    @Test
    public void testDocumentDateTime_CustomAdapter() throws DatatypeConfigurationException {

        Calendar noFractionalSecond = Calendar.getInstance();
        noFractionalSecond.set(Calendar.YEAR,2021);
        noFractionalSecond.set(Calendar.MONTH, Calendar.OCTOBER);
        noFractionalSecond.set(Calendar.DAY_OF_WEEK,19);
        noFractionalSecond.set(Calendar.HOUR,12);
        noFractionalSecond.set(Calendar.MINUTE,13);
        noFractionalSecond.set(Calendar.SECOND,14);

        MxPacs00800102 mx1 = sample(noFractionalSecond);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new TestCustomAdapter());
        conf.adapters.dateAdapter = new IsoDateAdapter(new TestCustomAdapter());

        final String xml = mx1.message(conf);
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>foobar</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>foobar</Doc:IntrBkSttlmDt>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml, new MxReadConfiguration(conf));
        //System.out.println(mx2.message());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt());
    }

    @Test
    public void testAppHdrDateTime_DefaultAdapters() throws DatatypeConfigurationException {
        AppHdr h1 = header();

        final String xml = h1.xml();
        //System.out.println(xml);
        ZoneOffset offset = ZoneOffset.systemDefault().getRules().getOffset(LocalDateTime.of(2021, 10, 19, 12, 13, 14));;
        assertTrue(xml.contains("<CreDt>2021-10-19T12:13:14"+ offset + "</CreDt>"));

        final BusinessAppHdrV02 h2 = (BusinessAppHdrV02) AppHdrParser.parse(xml).get();
        //System.out.println(mx2.message());
        assertNotNull(h2.getCreDt());
        assertEquals(h1.creationDate(), h2.getCreDt());
    }

    private MxPacs00800102 sample(final Calendar cal) {
        final MxPacs00800102 mx = new MxPacs00800102();
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV02());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader33());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setCreDtTm(cal);  // date time
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setIntrBkSttlmDt(cal);  //date
        mx.getFIToFICstmrCdtTrf().addCdtTrfTxInf(new CreditTransferTransactionInformation11());
        mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).setSttlmTmReq(new SettlementTimeRequest2());
        mx.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().setCLSTm(cal); // time
        return mx;
    }

    private AppHdr header() {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2021);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_WEEK,19);
        cal.set(Calendar.HOUR,12);
        cal.set(Calendar.MINUTE,13);
        cal.set(Calendar.SECOND,14);
        BusinessAppHdrV02 bah = AppHdrFactory.createBusinessAppHdrV02("AAAAUSXXXXX", "BBBBUSXXXXX", "ref", new MxId("pacs.008.001.08"));
        bah.setCreDt(cal);
        return bah;
    }

}
