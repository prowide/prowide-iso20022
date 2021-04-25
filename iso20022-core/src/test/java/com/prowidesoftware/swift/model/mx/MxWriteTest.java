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
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

public class MxWriteTest {

    @Test
    public void testWriteXml() {
        final MxCamt00300105 mx = new MxCamt00300105();

        mx.setAppHdr(new BusinessAppHdrV01());

        final CashAccountReturnCriteria3 carc3 = new CashAccountReturnCriteria3()
                .setAcctOwnrInd(true)
                .setAcctSvcrInd(false)
                .setStgOrdrInd(true);

        final AccountCriteria5 ac5 = new AccountCriteria5()
                .setNewQryNm("hello world")
                .setRtrCrit(carc3);

        final AccountCriteria1Choice ac1c = new AccountCriteria1Choice()
                .setQryNm("foo hello world")
                .setNewCrit(ac5);

        final AccountQuery1 aq1 = new AccountQuery1()
                .setAcctCrit(ac1c);

        final GetAccountV05 gav5 = new GetAccountV05()
                .setAcctQryDef(aq1);

        mx.setGetAcct(gav5);

        final String mxXml = mx.message();
        //System.out.println("XML: "+mxXml);

        assertFalse(StringUtils.contains(mxXml, "com.prowidesoftware."), "com.prowidesoftware is present in generated xml");
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
                                        .setNmnee(new InvestmentAccountOwnershipInformation14()
                                                .setClntId("clntId")
                                        )
                                )
                        )
                );

        final String mxXml = mx.message();
        //System.out.println(mxXml);

        assertFalse(StringUtils.contains(mxXml, "com.prowidesoftware."), "com.prowidesoftware is present in generated xml");
        assertTrue(StringUtils.contains(mxXml, MxAcmt00100107.NAMESPACE), "swift namespace missing in generated xml");
        if (StringUtils.contains(mxXml, "xmlns:Doc=\"urn:swift:xsd:acmt.001.001.07\"")) {
            assertTrue(StringUtils.contains(mxXml, "<Doc:AcctOpngInstr>"));
        }
    }

    @Test
    public void testWriteDateTime() throws Exception {
        final MxPacs00800102 mx1 = new MxPacs00800102();
        mx1.setFIToFICstmrCdtTrf(new FIToFICustomerCreditTransferV02().addCdtTrfTxInf(new CreditTransferTransactionInformation11()));
        final XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar(2015, Calendar.NOVEMBER, 19, 12, 13, 14));
        mx1.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).setSttlmTmIndctn((new SettlementDateTimeIndication1()).setCdtDtTm(cal));
        final String xml = mx1.message();
        //System.out.println(mx1.message());
        assertTrue(xml.contains("<Doc:CdtDtTm>2015-11-19T12:13:14.000"));

        final MxPacs00800102 mx2 = MxPacs00800102.parse(xml);
        //System.out.println(mx2.message());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmIndctn());
        assertNotNull(mx2.getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getSttlmTmIndctn().getCdtDtTm());
    }

    @Test
    public void testWriteXmlMxFxtr01400102() {
        final MxFxtr01400102 mx = new MxFxtr01400102();

        mx.setFXTradInstr(
                new ForeignExchangeTradeInstructionV02()
                        .setAgrdRate(new AgreedRate1().setUnitCcy("ARS").setXchgRate(new BigDecimal("1.2")).setQtdCcy("12"))
        );

        final String mxXml = mx.message();
        //System.out.println("XML: "+mxXml);

        assertTrue(StringUtils.contains(mxXml, MxFxtr01400102.NAMESPACE), "namespace missing in generated xml");
        assertFalse(StringUtils.contains(mxXml, "businessHeader"), "businessHeader is present in generated xml");
    }

    @Test
    public void testXmlPadding() {
        MxCamt00300106 mx = new MxCamt00300106();
        mx.setGetAcct(new GetAccountV06());
        mx.getGetAcct().setAcctQryDef(new AccountQuery2());
        mx.getGetAcct().getAcctQryDef().setAcctCrit(new AccountCriteria2Choice());
        mx.getGetAcct().getAcctQryDef().getAcctCrit().setQryNm("FOO");
        String xml = mx.message();
        //System.out.println(xml);
        assertTrue(xml.contains("     <Doc:QryNm>"));
    }

    @Test
    public void testNoBlankLines() {
        MxPain00100108 mx = new MxPain00100108();

        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV08());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader48());
        mx.getCstmrCdtTrfInitn().getGrpHdr().setCtrlSum(new BigDecimal(100));
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("asdfasd");
        mx.getCstmrCdtTrfInitn().addPmtInf(new PaymentInstruction22());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setDbtr(new PartyIdentification43().setNm("foo"));
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setChrgBr(ChargeBearerType1Code.CRED);

        //System.out.println(mx.message());
        Arrays.stream(mx.message().split("\\r?\\n")).forEach(line -> assertTrue(StringUtils.isNotBlank(line)));
    }

}
