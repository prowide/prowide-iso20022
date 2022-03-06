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
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

public class MxWriteWithAdaptersTest {

    @Test
    public void testDocumentDateTime_DefaultAdapters_noFractionalSecond() throws DatatypeConfigurationException {
        XMLGregorianCalendar noFractionalSecond = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
        MxPacs00800102 mx1 = sample(noFractionalSecond);

        final String xml = mx1.message();
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>2021-10-19T12:13:14"+ OffsetDateTime.now().getOffset() + "</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2021-10-19</Doc:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<Doc:CLSTm>12:13:14"+ OffsetDateTime.now().getOffset() + "</Doc:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        XMLGregorianCalendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        XMLGregorianCalendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.getYear(), intrBkSttlmDt2.getYear());
        assertEquals(intrBkSttlmDt1.getMonth(), intrBkSttlmDt2.getMonth());
        assertEquals(intrBkSttlmDt1.getDay(), intrBkSttlmDt2.getDay());

        // assert time propagation
        XMLGregorianCalendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        XMLGregorianCalendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.getHour(), clsTm2.getHour());
        assertEquals(clsTm1.getMinute(), clsTm2.getMinute());
        assertEquals(clsTm1.getSecond(), clsTm2.getSecond());
        assertEquals(clsTm1.getFractionalSecond(), clsTm2.getFractionalSecond());
        assertEquals(clsTm1.getTimezone(), clsTm2.getTimezone());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_Z() throws DatatypeConfigurationException {
        XMLGregorianCalendar utc = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
        utc.setTimezone(0);
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
        XMLGregorianCalendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        XMLGregorianCalendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.getYear(), intrBkSttlmDt2.getYear());
        assertEquals(intrBkSttlmDt1.getMonth(), intrBkSttlmDt2.getMonth());
        assertEquals(intrBkSttlmDt1.getDay(), intrBkSttlmDt2.getDay());

        // assert time propagation
        XMLGregorianCalendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        XMLGregorianCalendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.getHour(), clsTm2.getHour());
        assertEquals(clsTm1.getMinute(), clsTm2.getMinute());
        assertEquals(clsTm1.getSecond(), clsTm2.getSecond());
        assertEquals(clsTm1.getFractionalSecond(), clsTm2.getFractionalSecond());
        assertEquals(clsTm1.getTimezone(), clsTm2.getTimezone());
    }

    @Test
    public void testDocumentDateTime_DefaultAdapters_fractionalSecond() throws DatatypeConfigurationException {
        XMLGregorianCalendar fractionalSecond = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
        fractionalSecond.setFractionalSecond(new BigDecimal("0.123"));
        MxPacs00800102 mx1 = sample(fractionalSecond);

        final String xml = mx1.message();
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>2021-10-19T12:13:14.123"+ OffsetDateTime.now().getOffset() + "</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>2021-10-19</Doc:IntrBkSttlmDt>"));
        assertTrue(xml.contains("<Doc:CLSTm>12:13:14.123"+ OffsetDateTime.now().getOffset() + "</Doc:CLSTm>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());

        // assert date time propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());

        // assert date propagation
        XMLGregorianCalendar intrBkSttlmDt1 = mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        XMLGregorianCalendar intrBkSttlmDt2 = mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt();
        assertNotNull(intrBkSttlmDt2);
        assertEquals(intrBkSttlmDt1.getYear(), intrBkSttlmDt2.getYear());
        assertEquals(intrBkSttlmDt1.getMonth(), intrBkSttlmDt2.getMonth());
        assertEquals(intrBkSttlmDt1.getDay(), intrBkSttlmDt2.getDay());

        // assert time propagation
        XMLGregorianCalendar clsTm1 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        XMLGregorianCalendar clsTm2 = mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmReq().getCLSTm();
        assertNotNull(clsTm2);
        assertEquals(clsTm1.getHour(), clsTm2.getHour());
        assertEquals(clsTm1.getMinute(), clsTm2.getMinute());
        assertEquals(clsTm1.getSecond(), clsTm2.getSecond());
        assertEquals(clsTm1.getFractionalSecond(), clsTm2.getFractionalSecond());
        assertEquals(clsTm1.getTimezone(), clsTm2.getTimezone());
    }

    @Test
    public void testDocumentDateTime_CustomPattern() throws DatatypeConfigurationException {
        XMLGregorianCalendar noFractionalSecond = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
        MxPacs00800102 mx1 = sample(noFractionalSecond);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.dateTimeAdapter = new IsoDateTimeAdapter(new ZonedDateTimeAdapter(new SimpleDateFormat("yy-MM-dd HH:mm")));
        conf.adapters.dateAdapter = new IsoDateAdapter(new SimpleDateAdapter(new SimpleDateFormat("yy-MM-dd")));

        final String xml = mx1.message(conf);
        //System.out.println(xml);
        assertTrue(xml.contains("<Doc:CreDtTm>21-10-19 12:13</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:IntrBkSttlmDt>21-10-19</Doc:IntrBkSttlmDt>"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml, new MxReadConfiguration(conf));
        //System.out.println(mx2.message());

        // assert date time propagation (seconds truncated in mx2)
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getYear(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getYear());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getMonth(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getMonth());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getDay(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getDay());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getHour(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getHour());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getMinute(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getCreDtTm().getMinute());

        // assert date propagation
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getYear(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getYear());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getMonth(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getMonth());
        assertEquals(mx1.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getDay(), mx2.getFIToFICstmrCdtTrf().getGrpHdr().getIntrBkSttlmDt().getDay());
    }

    @Test
    public void testDocumentDateTime_CustomAdapter() throws DatatypeConfigurationException {
        XMLGregorianCalendar noFractionalSecond = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
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
        assertTrue(xml.contains("<CreDt>2021-10-19T12:13:14"+ OffsetDateTime.now().getOffset() + "</CreDt>"));

        final BusinessAppHdrV02 h2 = (BusinessAppHdrV02) AppHdrParser.parse(xml).get();
        //System.out.println(mx2.message());
        assertNotNull(h2.getCreDt());
        assertEquals(h1.creationDate(), h2.getCreDt());
    }

    private MxPacs00800102 sample(final XMLGregorianCalendar cal) {
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

    private AppHdr header() throws DatatypeConfigurationException {
        final XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2021, Calendar.OCTOBER, 19, 12, 13, 14));
        BusinessAppHdrV02 bah = AppHdrFactory.createBusinessAppHdrV02("AAAAUSXXXXX", "BBBBUSXXXXX", "ref", new MxId("pacs.008.001.08"));
        bah.setCreDt(cal);
        return bah;
    }

}
