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
package com.prowidesoftware.swift.model;


import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class MxSwiftMessageTest {

    @Test
    public void testRead() throws IOException {
        File f = File.createTempFile("mx_", ".xml");
        MxSwiftMessage mx = new MxSwiftMessage(f);
        Assertions.assertEquals(mx.getMessage(), "");
        f.deleteOnExit();
    }

    @Test
    public void testConstructorFromFile() throws IOException {
        File f = File.createTempFile("mx_", ".xml");
        FileOutputStream fos = new FileOutputStream(f);
        fos.write("<?xml version=\"1.0\" ?>".getBytes(StandardCharsets.UTF_8));
        fos.write("<Document/>".getBytes(StandardCharsets.UTF_8));
        fos.close();
        MxSwiftMessage mx = new MxSwiftMessage(f);
        Assertions.assertTrue(StringUtils.contains(mx.getMessage(), "Document"));
        f.deleteOnExit();
    }

    @Test
    public void testMetadataFromGrpHr() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\">"
                + "<FIToFICstmrCdtTrf>"
                + "	<GrpHdr>"
                + "		<MsgId>MSGID-0001</MsgId>"
                + "		<CreDtTm>2001-12-17T09:30:47Z</CreDtTm>"
                + "		<NbOfTxs>1</NbOfTxs>"
                + "		<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
                + "		<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                + "		<InstgAgt><FinInstnId><BIC>KBBECH20DSZ</BIC></FinInstnId></InstgAgt>"
                + "		<InstdAgt><FinInstnId><BIC>DRESDEF0VNZ</BIC></FinInstnId></InstdAgt>"
                + "	</GrpHdr>"
                + "	<CdtTrfTxInf>"
                + " </CdtTrfTxInf>"
                + "</FIToFICstmrCdtTrf>"
                + "</Document>";
        MxSwiftMessage mx = new MxSwiftMessage(xml);
        assertNotNull(mx);
        assertEquals("pacs.008.001.02", mx.getIdentifier());
        assertEquals("KBBECH20DSZ", mx.getSender());
        assertEquals("DRESDEF0VNZ", mx.getReceiver());
        assertEquals("MSGID-0001", mx.getReference());
    }

    @Test
    public void testMetadataFromAppHdr() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                + "<AppHdr xmlns=\"urn:swift:xsd:$ahV10\">"
                + "<From>"
                + "	<Type>DN</Type>"
                + " <Id>cn=funds,o=abcdchzzwww,o=swift</Id>"
                + "</From>"
                + "<To>"
                + "	<Type>DN</Type>"
                + "	<Id>cn=funds,o=dcbadeff,o=swift</Id>"
                + "</To>"
                + "	<MsgRef>11308917</MsgRef>"
                + "	<CrDate>2013-12-23T15:50:00</CrDate>"
                + "</AppHdr>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\">"
                + "<FIToFICstmrCdtTrf>"
                + "	<GrpHdr>"
                + "		<MsgId>MSGID-0001</MsgId>"
                + "		<CreDtTm>2001-12-17T09:30:47Z</CreDtTm>"
                + "		<NbOfTxs>1</NbOfTxs>"
                + "		<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
                + "		<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                + "		<InstgAgt><FinInstnId><BIC>KBBECH20DSZ</BIC></FinInstnId></InstgAgt>"
                + "		<InstdAgt><FinInstnId><BIC>DRESDEF0VNZ</BIC></FinInstnId></InstdAgt>"
                + "	</GrpHdr>"
                + "	<CdtTrfTxInf>"
                + " </CdtTrfTxInf>"
                + "</FIToFICstmrCdtTrf>"
                + "</Document>"
                + "</message>";
        MxSwiftMessage mx = new MxSwiftMessage(xml);
        assertNotNull(mx);
        assertEquals("pacs.008.001.02", mx.getIdentifier());
        assertEquals("ABCDCHZZWWW", mx.getSender());
        assertEquals("DCBADEFFXXX", mx.getReceiver());
        assertEquals("11308917", mx.getReference());
    }

    @Test
    public void testUpdateMetadata() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\">"
                + "<FIToFICstmrCdtTrf>"
                + "	<GrpHdr>"
                // missing reference field on purpose
                + "		<CreDtTm>2001-12-17T09:30:47Z</CreDtTm>"
                + "		<NbOfTxs>1</NbOfTxs>"
                + "		<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
                + "		<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                // missing sender on purpose
                + "		<InstdAgt><FinInstnId><BIC>DRESDEF0VNZ</BIC></FinInstnId></InstdAgt>"
                + "	</GrpHdr>"
                + "	<CdtTrfTxInf>"
                + " </CdtTrfTxInf>"
                + "</FIToFICstmrCdtTrf>"
                + "</Document>";
        MxSwiftMessage mx = new MxSwiftMessage(xml);
        assertNotNull(mx);

        // default metadata from message
        assertEquals("pacs.008.001.02", mx.getIdentifier());
        assertNull(mx.getSender());         // not present in XML
        assertEquals("DRESDEF0VNZ", mx.getReceiver());
        assertNull(mx.getReference());      // not present in XML
        assertNull(mx.getCurrency());       // not present in XML and also not handled by default strategy
        assertNull(mx.getAmount());         // not present in XML and also not handled by default strategy

        // manually set some metadata
        mx.setReference("REFERENCE1");
        mx.setCurrency("USD");
        mx.setAmount(new BigDecimal("1"));
        mx.setSender("AAAAUSXXXXX");

        // update from the same XML
        mx.updateFromXML(xml);

        assertEquals("pacs.008.001.02", mx.getIdentifier());
        assertEquals("AAAAUSXXXXX", mx.getSender());    // preserved
        assertEquals("DRESDEF0VNZ", mx.getReceiver());
        assertEquals("REFERENCE1", mx.getReference());  // preserved
        assertEquals("USD", mx.getCurrency());          // preserved
        assertEquals(new BigDecimal("1"), mx.getAmount());  // preserved

        String xmlUpdate = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\">"
                + "<FIToFICstmrCdtTrf>"
                + "	<GrpHdr>"
                // added reference
                + "		<MsgId>MSGID-0001</MsgId>"
                + "		<CreDtTm>2001-12-17T09:30:47Z</CreDtTm>"
                + "		<NbOfTxs>1</NbOfTxs>"
                + "		<IntrBkSttlmDt>2012-01-25</IntrBkSttlmDt>"
                + "		<SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf>"
                // added sender
                + "		<InstgAgt><FinInstnId><BIC>KBBECH20DSZ</BIC></FinInstnId></InstgAgt>"
                + "		<InstdAgt><FinInstnId><BIC>DRESDEF0VNZ</BIC></FinInstnId></InstdAgt>"
                + "	</GrpHdr>"
                + "	<CdtTrfTxInf>"
                + " </CdtTrfTxInf>"
                + "</FIToFICstmrCdtTrf>"
                + "</Document>";

        // update from changed XML
        mx.updateFromXML(xmlUpdate);

        assertEquals("pacs.008.001.02", mx.getIdentifier());
        assertEquals("KBBECH20DSZ", mx.getSender());    // updated
        assertEquals("DRESDEF0VNZ", mx.getReceiver());
        assertEquals("MSGID-0001", mx.getReference());  // updated
        assertEquals("USD", mx.getCurrency());
        assertEquals(new BigDecimal("1"), mx.getAmount());
    }

    @Test
    public void testMetadataFromDocumentWithoutNamespace() {
        final String xml = "<Document><setr.015.001.02><RltdRef><Ref>24512SWI67-IT</Ref><MsgNm>setr.013.001.01</MsgNm></RltdRef><SwtchExctnDtls><DealRef>IT56/89/90</DealRef><OrdrRef>20042402090912</OrdrRef><InvstmtAcctDtls><AcctId><Prtry><Id>A67367Z32-67</Id></Prtry></AcctId></InvstmtAcctDtls><AddtlCshIn Ccy=\"EUR\">200</AddtlCshIn><RedLegDtls><LegId>1</LegId><FinInstrmDtls><Id><ISIN>IT1111111111</ISIN></Id></FinInstrmDtls><UnitsNb><Unit>25</Unit></UnitsNb><NetAmt Ccy=\"EUR\">500</NetAmt><TradDtTm><Dt>2005-11-10</Dt></TradDtTm><PricDtls><Tp><Strd>SWIC</Strd></Tp><Val><Amt Ccy=\"EUR\">20</Amt></Val></PricDtls><CumDvddInd>true</CumDvddInd><PhysDlvryInd>false</PhysDlvryInd></RedLegDtls><SbcptLegDtls><LegId>2</LegId><FinInstrmDtls><Id><ISIN>IT2222222222</ISIN></Id></FinInstrmDtls><UnitsNb><Unit>100</Unit></UnitsNb><NetAmt Ccy=\"EUR\">700</NetAmt><TradDtTm><Dt>2005-11-10</Dt></TradDtTm><PricDtls><Tp><Strd>SWIC</Strd></Tp><Val><Amt Ccy=\"EUR\">7</Amt></Val></PricDtls><CumDvddInd>true</CumDvddInd><PhysDlvryInd>false</PhysDlvryInd></SbcptLegDtls></SwtchExctnDtls></setr.015.001.02></Document>";
        MxSwiftMessage mx = new MxSwiftMessage(xml);
        assertNotNull(mx);
    }

    @Test
    public void testMxId() {
        MxSwiftMessage m = new MxSwiftMessage();
        assertNull(m.getMxId().getBusinessProcess());
        assertNull(m.getMxId().getFunctionality());
        assertNull(m.getMxId().getVariant());
        assertNull(m.getMxId().getVersion());

        String xml = "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.six-interbank-clearing.com/de/pacs.008.001.02.ch.01 pacs.008.001.02.ch.01.xsd\"></Document>";
        m = new MxSwiftMessage(xml);

        assertEquals(new MxId(MxBusinessProcess.pacs, "008", "001", "02"), m.getMxId());
    }

    @Test
    public void category() {
        MxSwiftMessage mx = new MxSwiftMessage();
        assertEquals("", mx.getCategory());

        mx.setIdentifier("");
        assertEquals("", mx.getCategory());

        mx.setIdentifier("camt.002.002.01");
        assertEquals("camt", mx.getCategory());
    }

}
