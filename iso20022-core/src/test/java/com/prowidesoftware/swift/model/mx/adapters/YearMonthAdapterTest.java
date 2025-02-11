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

import com.prowidesoftware.swift.model.mx.MxAcmt03400104;
import com.prowidesoftware.swift.model.mx.MxSese01900106;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

public class YearMonthAdapterTest {

    @Test
    public void testYearMonth() {
        String xmlOrigin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<RequestPayload>\n"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n"
                + "    <Fr>\n"
                + "        <FIId>\n"
                + "            <FinInstnId>\n"
                + "                <BICFI>AAAAUSXXXXX</BICFI>\n"
                + "            </FinInstnId>\n"
                + "        </FIId>\n"
                + "    </Fr>\n"
                + "    <To>\n"
                + "        <FIId>\n"
                + "            <FinInstnId>\n"
                + "                <BICFI>TRGTXEPMCLM</BICFI>\n"
                + "            </FinInstnId>\n"
                + "        </FIId>\n"
                + "    </To>\n"
                + "    <BizMsgIdr>TRGTXEPMCLM</BizMsgIdr>\n"
                + "    <MsgDefIdr>sese.019.001.06</MsgDefIdr>\n"
                + "    <CreDt>2023-05-09T11:38:43.268-03:00</CreDt>\n"
                + "    <BizPrcgDt>2023-05-09T16:35:57-03:00</BizPrcgDt>\n"
                + "</AppHdr>\n"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:sese.019.001.06\">\n"
                + "    <AcctHldgInfReq>\n"
                + "        <MsgRef>\n"
                + "            <Id>FFFFFFF</Id>\n"
                + "            <CreDtTm>2023-05-09T16:35:48-03:00</CreDtTm>\n"
                + "        </MsgRef>\n"
                + "        <TrfrAcct>\n"
                + "            <Id>FEEEEER</Id>\n"
                + "            <Dsgnt>FEEEER</Dsgnt>\n"
                + "            <AcctNm>FEEER</AcctNm>\n"
                + "        </TrfrAcct>\n"
                + "        <Trfee>\n"
                + "            <AnyBIC>TRGTXEPMCLM</AnyBIC>\n"
                + "        </Trfee>\n"
                + "        <PdctTrf>\n"
                + "            <MstrRef>FEEEEER</MstrRef>\n"
                + "            <TrfId>FEEEEER</TrfId>\n"
                + "        </PdctTrf>\n"
                + "        <MktPrctcVrsn>\n"
                + "            <Nm>FERNANDOFERNANDO</Nm>\n"
                + "            <Dt>2022-10</Dt>\n"
                + "        </MktPrctcVrsn>\n"
                + "    </AcctHldgInfReq>\n"
                + "</Document>\n"
                + "</RequestPayload>";

        final MxSese01900106 mx1 = MxSese01900106.parse(xmlOrigin);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.documentPrefix = null;
        conf.headerPrefix = null;

        final String xml1 = mx1.message(conf);
        assertTrue(xml1.contains("<CreDtTm>2023-05-09T16:35:48-03:00</CreDtTm>"));
        assertTrue(xml1.contains("<Dt>2022-10</Dt>"));

        final MxSese01900106 mx2 = MxSese01900106.parse(xml1);
        final String xml2 = mx2.message(conf);

        assertEquals(xml1, xml2);
        assertEquals(mx1, mx2);
    }

    @Test
    public void testYearMonth_CustomPattern() {
        String xmlOrigin = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<RequestPayload>\n"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n"
                + "    <Fr>\n"
                + "        <FIId>\n"
                + "            <FinInstnId>\n"
                + "                <BICFI>AAAAUSXXXXX</BICFI>\n"
                + "            </FinInstnId>\n"
                + "        </FIId>\n"
                + "    </Fr>\n"
                + "    <To>\n"
                + "        <FIId>\n"
                + "            <FinInstnId>\n"
                + "                <BICFI>TRGTXEPMCLM</BICFI>\n"
                + "            </FinInstnId>\n"
                + "        </FIId>\n"
                + "    </To>\n"
                + "    <BizMsgIdr>TRGTXEPMCLM</BizMsgIdr>\n"
                + "    <MsgDefIdr>sese.019.001.06</MsgDefIdr>\n"
                + "    <CreDt>2023-05-09T11:38:43.268-03:00</CreDt>\n"
                + "    <BizPrcgDt>2023-05-09T16:35:57-03:00</BizPrcgDt>\n"
                + "</AppHdr>\n"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:sese.019.001.06\">\n"
                + "    <AcctHldgInfReq>\n"
                + "        <MsgRef>\n"
                + "            <Id>FFFFFFF</Id>\n"
                + "            <CreDtTm>2023-05-09T16:35:48-03:00</CreDtTm>\n"
                + "        </MsgRef>\n"
                + "        <TrfrAcct>\n"
                + "            <Id>FEEEEER</Id>\n"
                + "            <Dsgnt>FEEEER</Dsgnt>\n"
                + "            <AcctNm>FEEER</AcctNm>\n"
                + "        </TrfrAcct>\n"
                + "        <Trfee>\n"
                + "            <AnyBIC>TRGTXEPMCLM</AnyBIC>\n"
                + "        </Trfee>\n"
                + "        <PdctTrf>\n"
                + "            <MstrRef>FEEEEER</MstrRef>\n"
                + "            <TrfId>FEEEEER</TrfId>\n"
                + "        </PdctTrf>\n"
                + "        <MktPrctcVrsn>\n"
                + "            <Nm>FERNANDOFERNANDO</Nm>\n"
                + "            <Dt>2021-10</Dt>\n"
                + "        </MktPrctcVrsn>\n"
                + "    </AcctHldgInfReq>\n"
                + "</Document>\n"
                + "</RequestPayload>";

        final MxSese01900106 mx = MxSese01900106.parse(xmlOrigin);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.documentPrefix = null;
        conf.headerPrefix = null;

        final String xml = mx.message(conf);
        assertTrue(xml.contains("<CreDtTm>2023-05-09T16:35:48-03:00</CreDtTm>"));
        assertTrue(xml.contains("<Dt>2021-10</Dt>"));

        conf.adapters.yearMonthAdapter =
                new IsoYearMonthAdapter(new YearMonthAdapter(DateTimeFormatter.ofPattern("yy-MM")));

        final String xmlCustomFormat = mx.message(conf);
        assertTrue(xmlCustomFormat.contains("<CreDtTm>2023-05-09T16:35:48-03:00</CreDtTm>"));
        assertTrue(xmlCustomFormat.contains("<Dt>21-10</Dt>"));
    }

    @Test
    public void testYear_CustomPattern() {
        String xmlOrigin = "<Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04\">\n"
                + "    <AcctSwtchReqPmt>\n"
                + "        <CdtInstr>\n"
                + "            <Tax>\n"
                + "                <Rcrd>\n"
                + "                    <Prd>\n"
                + "                        <Yr>2022</Yr>\n"
                + "                    </Prd>\n"
                + "                </Rcrd>\n"
                + "            </Tax>\n"
                + "        </CdtInstr>\n"
                + "    </AcctSwtchReqPmt>\n"
                + "</Document>";

        final MxAcmt03400104 mx = MxAcmt03400104.parse(xmlOrigin);

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.documentPrefix = null;
        conf.headerPrefix = null;

        final String xml = mx.message(conf);
        assertTrue(xml.contains("<Yr>2022</Yr>"));

        conf.adapters.yearAdapter = new IsoYearAdapter(new YearAdapter(DateTimeFormatter.ofPattern("yy")));

        final String xmlCustomFormat = mx.message(conf);
        assertTrue(xmlCustomFormat.contains("<Yr>22</Yr>"));
    }
}
