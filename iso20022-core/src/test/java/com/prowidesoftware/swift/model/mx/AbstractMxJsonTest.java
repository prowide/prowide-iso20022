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
import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for JSON conversion in the MX model (AbstractMX and subclasses).
 *
 * @since 7.10.2
 */
public class AbstractMxJsonTest {

    @Test
    public void testMxJson() throws Exception {
        MxPain00100108 mx = new MxPain00100108();
        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV08());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader48());

        mx.getCstmrCdtTrfInitn().getGrpHdr().setCtrlSum(new BigDecimal("1234.56"));
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("MYID");
        XMLGregorianCalendar cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        mx.getCstmrCdtTrfInitn().getGrpHdr().setCreDtTm(cal);
        mx.getCstmrCdtTrfInitn().getGrpHdr().setNbOfTxs("1");

        mx.getCstmrCdtTrfInitn().getGrpHdr().setInitgPty(new PartyIdentification43());
        mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().setNm("Joe Doe");
        mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().setCtryOfRes("USA");
        mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().setId(new Party11Choice());
        mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().getId().setOrgId(new OrganisationIdentification8());
        mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().getId().getOrgId().setAnyBIC("FOOBARXX");

        mx.getCstmrCdtTrfInitn().getGrpHdr().setFwdgAgt(new BranchAndFinancialInstitutionIdentification5());
        mx.getCstmrCdtTrfInitn().getGrpHdr().getFwdgAgt().setBrnchId(new BranchData2());
        mx.getCstmrCdtTrfInitn().getGrpHdr().getFwdgAgt().getBrnchId().setId("Ident1234");
        mx.getCstmrCdtTrfInitn().getGrpHdr().getFwdgAgt().getBrnchId().setNm("A Name");

        assertPain00100108(mx, cal);
        //System.out.println(mx.message());

        /*
         * to JSON
         */
        final String json = mx.toJson();
        //System.out.println(json);

        /*
         * Mx class from JSON
         */
        MxPain00100108 mx2 = MxPain00100108.fromJson(json);
        //System.out.println(mx2.message());
        assertPain00100108(mx2, cal);

        /*
         * Generic class from JSON
         */
        MxPain00100108 mx3 = (MxPain00100108) AbstractMX.fromJson(json);
        //System.out.println(mx2.message());
        assertPain00100108(mx3, cal);
    }

    private void assertPain00100108(final MxPain00100108 mx, final XMLGregorianCalendar cal) {
        assertEquals(new BigDecimal("1234.56"), mx.getCstmrCdtTrfInitn().getGrpHdr().getCtrlSum());
        assertEquals("MYID", mx.getCstmrCdtTrfInitn().getGrpHdr().getMsgId());
        assertEquals(cal, mx.getCstmrCdtTrfInitn().getGrpHdr().getCreDtTm());
        assertEquals("1", mx.getCstmrCdtTrfInitn().getGrpHdr().getNbOfTxs());
        assertEquals("Joe Doe", mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().getNm());
        assertEquals("USA", mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().getCtryOfRes());
        assertEquals("FOOBARXX", mx.getCstmrCdtTrfInitn().getGrpHdr().getInitgPty().getId().getOrgId().getAnyBIC());
        assertEquals("Ident1234", mx.getCstmrCdtTrfInitn().getGrpHdr().getFwdgAgt().getBrnchId().getId());
        assertEquals("A Name", mx.getCstmrCdtTrfInitn().getGrpHdr().getFwdgAgt().getBrnchId().getNm());
    }

    @Test
    public void testMxJson2() {
        MxCamt05300106 mx = new MxCamt05300106();
        mx.setBkToCstmrStmt(new BankToCustomerStatementV06());

        mx.getBkToCstmrStmt().addStmt(new AccountStatement6());
        mx.getBkToCstmrStmt().getStmt().get(0).setAcct(new CashAccount25());
        mx.getBkToCstmrStmt().getStmt().get(0).getAcct().setCcy("USD");
        mx.getBkToCstmrStmt().getStmt().get(0).getAcct().setNm("account 1");

        mx.getBkToCstmrStmt().addStmt(new AccountStatement6());
        mx.getBkToCstmrStmt().getStmt().get(1).setAcct(new CashAccount25());
        mx.getBkToCstmrStmt().getStmt().get(1).getAcct().setCcy("ARS");
        mx.getBkToCstmrStmt().getStmt().get(1).getAcct().setNm("account 2");

        assertCamt05300106(mx);
        //System.out.println(mx.message());

        /*
         * to JSON
         */
        final String json = mx.toJson();
        //System.out.println(json);

        /*
         * Mx class from JSON
         */
        MxCamt05300106 mx2 = MxCamt05300106.fromJson(json);
        //System.out.println(mx2.message());
        assertCamt05300106(mx2);

        /*
         * Generic class from JSON
         */
        MxCamt05300106 mx3 = (MxCamt05300106) AbstractMX.fromJson(json);
        //System.out.println(mx2.message());
        assertCamt05300106(mx3);
    }

    private void assertCamt05300106(final MxCamt05300106 mx) {
        assertEquals(2, mx.getBkToCstmrStmt().getStmt().size());
        assertEquals("USD", mx.getBkToCstmrStmt().getStmt().get(0).getAcct().getCcy());
        assertEquals("account 1", mx.getBkToCstmrStmt().getStmt().get(0).getAcct().getNm());
        assertEquals("ARS", mx.getBkToCstmrStmt().getStmt().get(1).getAcct().getCcy());
        assertEquals("account 2", mx.getBkToCstmrStmt().getStmt().get(1).getAcct().getNm());
    }

    @Test
    public void testMxDateJson() {
        String source = "{\n" +
                "  \"sctiesSttlmTxInstr\": {\n" +
                "    \"id\": {\n" +
                "      \"creDtTm\": {\n" +
                "        \"dt\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 2,\n" +
                "          \"day\": 3,\n" +
                "          \"timezone\": -2147483648,\n" +
                "          \"hour\": -2147483648,\n" +
                "          \"minute\": -2147483648,\n" +
                "          \"second\": -2147483648\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:swift:xsd:sese.023.002.01\",\n" +
                "  \"identifier\": \"sese.023.002.01\"\n" +
                "}";
        AbstractMX mx = AbstractMX.fromJson(source);
        assertEquals(source, mx.toJson());
    }

    @Test
    public void testMxDateJsonSerializeAndParse() {
        String source = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<RequestPayload>\n" +
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:sese.023.002.01\">\n" +
                "    <Doc:SctiesSttlmTxInstr>\n" +
                "        <Doc:Id>\n" +
                "            <Doc:CreDtTm>\n" +
                "                <Doc:Dt>2021-02-03</Doc:Dt>\n" +
                "            </Doc:CreDtTm>\n" +
                "        </Doc:Id>\n" +
                "    </Doc:SctiesSttlmTxInstr>\n" +
                "</Doc:Document>\n" +
                "</RequestPayload>";
        AbstractMX mx = AbstractMX.parse(source);
        String json = mx.toJson();
        AbstractMX mx2 = AbstractMX.fromJson(json);
        String json2 = mx2.toJson();
        assertEquals(mx, mx2);
        assertEquals(json, json2);
    }

    @Test
    public void parseMxWithAppHdr() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"from\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        assertDoesNotThrow(() -> AbstractMX.fromJson(json));
    }

    @Test
    public void parseSerializedMxWithAppHdr() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"from\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        AbstractMX source = AbstractMX.fromJson(json);
        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);
    }

    @Test
    public void parseSerializedMxWithAppHdrBAH_V1() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\",\n" +
                "    \"fr\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        AbstractMX source = AbstractMX.fromJson(json);
        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV01 BAH_V1 = (BusinessAppHdrV01) mx.getAppHdr();
        assertNotNull(BAH_V1);
    }

    @Test
    public void parseSerializedMxWithAppHdrBAH_V2() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\",\n" +
                "    \"fr\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        AbstractMX source = AbstractMX.fromJson(json);
        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 BAH_V2 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(BAH_V2);
    }

    @Test
    public void parseSerializedMxWithAppHdrNoNameSpace() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        AbstractMX source = AbstractMX.fromJson(json);
        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        LegacyAppHdr legacyAppHdr = (LegacyAppHdr) mx.getAppHdr();
        assertNotNull(legacyAppHdr);
    }

    @Test
    public void parseSerializedMxWithAppHdrInvalidNamespace() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"year\": 2021,\n" +
                "        \"month\": 4,\n" +
                "        \"day\": 28,\n" +
                "        \"timezone\": 0,\n" +
                "        \"hour\": 9,\n" +
                "        \"minute\": 22,\n" +
                "        \"second\": 56\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"namespace\": \"urn:iso:std:iso:00000:tech:xsd:head.000.000.00\",\n" +
                "    \"fr\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"ABNANL20606\"\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"type\": \"BIC\",\n" +
                "      \"id\": \"GIISIT2TXXX\"\n" +
                "    },\n" +
                "    \"msgName\": \"pacs.009.001.07\",\n" +
                "    \"msgRef\": \"CPTE190421113270\",\n" +
                "    \"crDate\": {\n" +
                "      \"year\": 2021,\n" +
                "      \"month\": 4,\n" +
                "      \"day\": 28,\n" +
                "      \"timezone\": 0,\n" +
                "      \"hour\": 9,\n" +
                "      \"minute\": 22,\n" +
                "      \"second\": 56\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";
        AbstractMX source = AbstractMX.fromJson(json);
        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        LegacyAppHdr legacyAppHdr = (LegacyAppHdr) mx.getAppHdr();
        assertNotNull(legacyAppHdr);
    }

}