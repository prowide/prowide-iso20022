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

import com.prowidesoftware.swift.model.mx.MxSese01900106;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearMonthAdapterTest {

    @Test
    public void testYearMonth() {
        String xmlOrigin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<RequestPayload>\n" +
                "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n" +
                "    <h:Fr>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>AAAAUSXXXXX</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:Fr>\n" +
                "    <h:To>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>TRGTXEPMCLM</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:To>\n" +
                "    <h:BizMsgIdr>TRGTXEPMCLM</h:BizMsgIdr>\n" +
                "    <h:MsgDefIdr>sese.019.001.06</h:MsgDefIdr>\n" +
                "    <h:CreDt>2023-05-09T11:38:43.268-03:00</h:CreDt>\n" +
                "    <h:BizPrcgDt>2023-05-09T16:35:57-03:00</h:BizPrcgDt>\n" +
                "</h:AppHdr>\n" +
                "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:sese.019.001.06\">\n" +
                "    <Doc:AcctHldgInfReq>\n" +
                "        <Doc:MsgRef>\n" +
                "            <Doc:Id>FFFFFFF</Doc:Id>\n" +
                "            <Doc:CreDtTm>2023-05-09T16:35:48-03:00</Doc:CreDtTm>\n" +
                "        </Doc:MsgRef>\n" +
                "        <Doc:TrfrAcct>\n" +
                "            <Doc:Id>FEEEEER</Doc:Id>\n" +
                "            <Doc:Dsgnt>FEEEER</Doc:Dsgnt>\n" +
                "            <Doc:AcctNm>FEEER</Doc:AcctNm>\n" +
                "        </Doc:TrfrAcct>\n" +
                "        <Doc:Trfee>\n" +
                "            <Doc:AnyBIC>TRGTXEPMCLM</Doc:AnyBIC>\n" +
                "        </Doc:Trfee>\n" +
                "        <Doc:PdctTrf>\n" +
                "            <Doc:MstrRef>FEEEEER</Doc:MstrRef>\n" +
                "            <Doc:TrfId>FEEEEER</Doc:TrfId>\n" +
                "        </Doc:PdctTrf>\n" +
                "        <Doc:MktPrctcVrsn>\n" +
                "            <Doc:Nm>FERNANDOFERNANDO</Doc:Nm>\n" +
                "            <Doc:Dt>2022-10</Doc:Dt>\n" +
                "        </Doc:MktPrctcVrsn>\n" +
                "    </Doc:AcctHldgInfReq>\n" +
                "</Doc:Document>\n" +
                "</RequestPayload>";

        final MxSese01900106 mx1 = MxSese01900106.parse(xmlOrigin);
        final String xml1 = mx1.message();
        //System.out.println(xml1);
        assertTrue(xml1.contains("<Doc:CreDtTm>2023-05-09T16:35:48-03:00</Doc:CreDtTm>"));
        assertTrue(xml1.contains("<Doc:Dt>2022-10</Doc:Dt>"));

        final MxSese01900106 mx2 = MxSese01900106.parse(xml1);
        final String xml2 = mx2.message();

        assertEquals(xml1, xml2);
        assertEquals(mx1, mx2);
    }

    @Test
    public void testYearMonth_CustomPattern() {
        String xmlOrigin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<RequestPayload>\n" +
                "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n" +
                "    <h:Fr>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>AAAAUSXXXXX</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:Fr>\n" +
                "    <h:To>\n" +
                "        <h:FIId>\n" +
                "            <h:FinInstnId>\n" +
                "                <h:BICFI>TRGTXEPMCLM</h:BICFI>\n" +
                "            </h:FinInstnId>\n" +
                "        </h:FIId>\n" +
                "    </h:To>\n" +
                "    <h:BizMsgIdr>TRGTXEPMCLM</h:BizMsgIdr>\n" +
                "    <h:MsgDefIdr>sese.019.001.06</h:MsgDefIdr>\n" +
                "    <h:CreDt>2023-05-09T11:38:43.268-03:00</h:CreDt>\n" +
                "    <h:BizPrcgDt>2023-05-09T16:35:57-03:00</h:BizPrcgDt>\n" +
                "</h:AppHdr>\n" +
                "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:sese.019.001.06\">\n" +
                "    <Doc:AcctHldgInfReq>\n" +
                "        <Doc:MsgRef>\n" +
                "            <Doc:Id>FFFFFFF</Doc:Id>\n" +
                "            <Doc:CreDtTm>2023-05-09T16:35:48-03:00</Doc:CreDtTm>\n" +
                "        </Doc:MsgRef>\n" +
                "        <Doc:TrfrAcct>\n" +
                "            <Doc:Id>FEEEEER</Doc:Id>\n" +
                "            <Doc:Dsgnt>FEEEER</Doc:Dsgnt>\n" +
                "            <Doc:AcctNm>FEEER</Doc:AcctNm>\n" +
                "        </Doc:TrfrAcct>\n" +
                "        <Doc:Trfee>\n" +
                "            <Doc:AnyBIC>TRGTXEPMCLM</Doc:AnyBIC>\n" +
                "        </Doc:Trfee>\n" +
                "        <Doc:PdctTrf>\n" +
                "            <Doc:MstrRef>FEEEEER</Doc:MstrRef>\n" +
                "            <Doc:TrfId>FEEEEER</Doc:TrfId>\n" +
                "        </Doc:PdctTrf>\n" +
                "        <Doc:MktPrctcVrsn>\n" +
                "            <Doc:Nm>FERNANDOFERNANDO</Doc:Nm>\n" +
                "            <Doc:Dt>2021-10</Doc:Dt>\n" +
                "        </Doc:MktPrctcVrsn>\n" +
                "    </Doc:AcctHldgInfReq>\n" +
                "</Doc:Document>\n" +
                "</RequestPayload>";

        final MxSese01900106 mx = MxSese01900106.parse(xmlOrigin);
        final String xml = mx.message();
        assertTrue(xml.contains("<Doc:CreDtTm>2023-05-09T16:35:48-03:00</Doc:CreDtTm>"));
        assertTrue(xml.contains("<Doc:Dt>2021-10</Doc:Dt>"));

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.adapters.yearMonthAdapter = new IsoYearMonthAdapter(new YearMonthAdapter(DateTimeFormatter.ofPattern("yy-MM")));

        final String xmlCustomFormat = mx.message(conf);
        //System.out.println(xml);
        assertTrue(xmlCustomFormat.contains("<Doc:CreDtTm>2023-05-09T16:35:48-03:00</Doc:CreDtTm>"));
        assertTrue(xmlCustomFormat.contains("<Doc:Dt>21-10</Doc:Dt>"));
    }

}
