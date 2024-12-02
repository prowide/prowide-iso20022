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
package com.prowidesoftware.swift.model.mx;

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.mx.dic.*;
import java.math.BigDecimal;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * General MX into XML serialization test cases
 */
@DisabledOnOs(OS.WINDOWS)
public class MxWriteTest {

    @Test
    public void testWriteXml() {
        final MxCamt00300105 mx = new MxCamt00300105();

        mx.setAppHdr(new BusinessAppHdrV01());

        final CashAccountReturnCriteria3 carc3 = new CashAccountReturnCriteria3()
                .setAcctOwnrInd(true)
                .setAcctSvcrInd(false)
                .setStgOrdrInd(true);

        final AccountCriteria5 ac5 =
                new AccountCriteria5().setNewQryNm("hello world").setRtrCrit(carc3);

        final AccountCriteria1Choice ac1c =
                new AccountCriteria1Choice().setQryNm("foo hello world").setNewCrit(ac5);

        final AccountQuery1 aq1 = new AccountQuery1().setAcctCrit(ac1c);

        final GetAccountV05 gav5 = new GetAccountV05().setAcctQryDef(aq1);

        mx.setGetAcct(gav5);

        final String mxXml = mx.message();
        // System.out.println("XML: "+mxXml);

        assertFalse(
                StringUtils.contains(mxXml, "com.prowidesoftware."), "com.prowidesoftware is present in generated xml");
        assertTrue(StringUtils.contains(mxXml, MxCamt00300105.NAMESPACE), "swift namespace missing in generated xml");
        if (StringUtils.contains(mxXml, "xmlns:Doc=\"urn:swift:xsd:camt.003.001.05\"")) {
            assertTrue(StringUtils.contains(mxXml, "<Doc:GetAcct>"));
        }
        assertFalse(StringUtils.contains(mxXml, "businessHeader"), "businessHeader is present in generated xml");
    }

    @Test
    public void testWriteXml2() {
        final MxAcmt00100107 mx = new MxAcmt00100107()
                .setAcctOpngInstr(new AccountOpeningInstructionV07()
                        .setAcctPties(new AccountParties15()
                                .setPrncplAcctPty(new AccountParties10Choice()
                                        .setNmnee(new InvestmentAccountOwnershipInformation14().setClntId("clntId")))));

        final String mxXml = mx.message();

        assertFalse(
                StringUtils.contains(mxXml, "com.prowidesoftware."), "com.prowidesoftware is present in generated xml");
        assertTrue(StringUtils.contains(mxXml, MxAcmt00100107.NAMESPACE), "swift namespace missing in generated xml");
        if (StringUtils.contains(mxXml, "xmlns:Doc=\"urn:swift:xsd:acmt.001.001.07\"")) {
            assertTrue(StringUtils.contains(mxXml, "<Doc:AcctOpngInstr>"));
        }
    }

    @Test
    public void testWriteXmlMxFxtr01400102() {
        final MxFxtr01400102 mx = new MxFxtr01400102();

        mx.setFXTradInstr(new ForeignExchangeTradeInstructionV02()
                .setAgrdRate(new AgreedRate1()
                        .setUnitCcy("ARS")
                        .setXchgRate(new BigDecimal("1.2"))
                        .setQtdCcy("12")));

        final String mxXml = mx.message();

        assertTrue(StringUtils.contains(mxXml, MxFxtr01400102.NAMESPACE), "namespace missing in generated xml");
        assertFalse(StringUtils.contains(mxXml, "businessHeader"), "businessHeader is present in generated xml");
    }

    @Test
    public void testWriteXmlMxFxtr01400102Indent() {
        final MxFxtr01400102 mx = new MxFxtr01400102();

        mx.setFXTradInstr(new ForeignExchangeTradeInstructionV02()
                .setAgrdRate(new AgreedRate1()
                        .setUnitCcy("ARS")
                        .setXchgRate(new BigDecimal("1.2"))
                        .setQtdCcy("12")));

        assertTrue(StringUtils.contains(mx.message(), "            "), "default indent");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.indent = " ";
        final String mxXml = mx.message(conf);

        assertFalse(StringUtils.contains(mxXml, "            "), "custom indent");
    }

    @Test
    public void testWriteWithDefaultOptions() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        final String xml = mx.message();

        final String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" + "<RequestPayload>\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></head:AppHdr>\n"
                + "<pacs:Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <pacs:FIToFICstmrCdtTrf>\n"
                + "        <pacs:GrpHdr>\n"
                + "            <pacs:MsgId>123</pacs:MsgId>\n"
                + "        </pacs:GrpHdr>\n"
                + "    </pacs:FIToFICstmrCdtTrf>\n"
                + "</pacs:Document>\n"
                + "</RequestPayload>";
        assertEquals(expected, xml);
    }

    @Test
    public void testWriteWithCustomOptions() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.includeXMLDeclaration = false;
        conf.rootElement = "Message";
        conf.headerPrefix = "Head";
        conf.documentPrefix = "Doc";
        conf.useCategoryAsDocumentPrefix = false;

        final String xml = mx.message(conf);

        final String expected = "<Message>\n"
                + "<Head:AppHdr xmlns:Head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></Head:AppHdr>\n"
                + "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <Doc:FIToFICstmrCdtTrf>\n"
                + "        <Doc:GrpHdr>\n"
                + "            <Doc:MsgId>123</Doc:MsgId>\n"
                + "        </Doc:GrpHdr>\n"
                + "    </Doc:FIToFICstmrCdtTrf>\n"
                + "</Doc:Document>\n"
                + "</Message>";
        assertEquals(expected, xml);
    }

    @Test
    public void testWriteWithNoPrefixes() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.includeXMLDeclaration = false;
        conf.rootElement = "Root";
        conf.headerPrefix = null;
        conf.documentPrefix = null;

        final String xml = mx.message(conf);

        final String expected =
                "<Root>\n" + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></AppHdr>\n"
                        + "<Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                        + "    <FIToFICstmrCdtTrf>\n"
                        + "        <GrpHdr>\n"
                        + "            <MsgId>123</MsgId>\n"
                        + "        </GrpHdr>\n"
                        + "    </FIToFICstmrCdtTrf>\n"
                        + "</Document>\n"
                        + "</Root>";
        assertEquals(expected, xml);
    }

    @Test
    public void testWriteWithSWIFTEnvelope() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.envelopeType = EnvelopeType.SWIFT;

        final String xml = mx.message(conf);

        final String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<Envelope xmlns=\"urn:swift:xsd:envelope\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></head:AppHdr>\n"
                + "<pacs:Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <pacs:FIToFICstmrCdtTrf>\n"
                + "        <pacs:GrpHdr>\n"
                + "            <pacs:MsgId>123</pacs:MsgId>\n"
                + "        </pacs:GrpHdr>\n"
                + "    </pacs:FIToFICstmrCdtTrf>\n"
                + "</pacs:Document>\n"
                + "</Envelope>";
        assertEquals(expected, xml);
    }

    @Test
    public void testWriteWithISOEnvelopeV1() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.envelopeType = EnvelopeType.BME_V1;

        final String xml = mx.message(conf);

        final String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<env:BizMsgEnvlp xmlns=\"urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                + "<env:Hdr>\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></head:AppHdr>\n"
                + "</env:Hdr>\n"
                + "<env:Doc>\n"
                + "<pacs:Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <pacs:FIToFICstmrCdtTrf>\n"
                + "        <pacs:GrpHdr>\n"
                + "            <pacs:MsgId>123</pacs:MsgId>\n"
                + "        </pacs:GrpHdr>\n"
                + "    </pacs:FIToFICstmrCdtTrf>\n"
                + "</pacs:Document>\n"
                + "</env:Doc>\n"
                + "</env:BizMsgEnvlp>";
        assertEquals(expected, xml);
    }

    @Test
    public void testWriteWithISOEnvelopeV2() {
        final MxPacs00800110 mx = new MxPacs00800110();
        mx.setAppHdr(new BusinessAppHdrV02());
        mx.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV10());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader96());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("123");

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.envelopeType = EnvelopeType.BME_V2;

        final String xml = mx.message(conf);

        final String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"
                + "<env:BizMsgEnvlp xmlns=\"urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.02\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
                + "<env:Hdr>\n"
                + "<head:AppHdr xmlns:head=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"></head:AppHdr>\n"
                + "</env:Hdr>\n"
                + "<env:Doc>\n"
                + "<pacs:Document xmlns:pacs=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.10\">\n"
                + "    <pacs:FIToFICstmrCdtTrf>\n"
                + "        <pacs:GrpHdr>\n"
                + "            <pacs:MsgId>123</pacs:MsgId>\n"
                + "        </pacs:GrpHdr>\n"
                + "    </pacs:FIToFICstmrCdtTrf>\n"
                + "</pacs:Document>\n"
                + "</env:Doc>\n"
                + "</env:BizMsgEnvlp>";
        assertEquals(expected, xml);
    }
}
