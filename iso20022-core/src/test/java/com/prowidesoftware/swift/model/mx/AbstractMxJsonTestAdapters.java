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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.prowidesoftware.swift.model.mx.dic.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for JSON conversion in the MX model (AbstractMX and subclasses).
 *
 * @since 7.10.2@
 */
public class AbstractMxJsonTestAdapters {

    @Test
    public void testMxJson() {
        MxPain00100108 mx = new MxPain00100108();
        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV08());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader48());

        mx.getCstmrCdtTrfInitn().getGrpHdr().setCtrlSum(new BigDecimal("1234.56"));
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("MYID");

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        mx.getCstmrCdtTrfInitn().getGrpHdr().setCreDtTm(offsetDateTime);
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

        assertPain00100108(mx, offsetDateTime);
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
        assertPain00100108(mx2, offsetDateTime);

        /*
         * Generic class from JSON
         */
        MxPain00100108 mx3 = (MxPain00100108) AbstractMX.fromJson(json);
        //System.out.println(mx2.message());
        assertPain00100108(mx3, offsetDateTime);
    }

    private void assertPain00100108(final MxPain00100108 mx, final OffsetDateTime offsetDateTime) {
        assertEquals(new BigDecimal("1234.56"), mx.getCstmrCdtTrfInitn().getGrpHdr().getCtrlSum());
        assertEquals("MYID", mx.getCstmrCdtTrfInitn().getGrpHdr().getMsgId());
        assertEquals(offsetDateTime, mx.getCstmrCdtTrfInitn().getGrpHdr().getCreDtTm());
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
    public void testMxDateTimeJson_OffsetDateTime() {
        String source = "{\n" +
                "  \"sctiesSttlmTxInstr\": {\n" +
                "    \"id\": {\n" +
                "      \"creDtTm\": {\n" +
                "        \"dtTm\": {\n" +
                "          \"dateTime\": {\n" +
                "            \"date\": {\n" +
                "              \"year\": 2021,\n" +
                "              \"month\": 4,\n" +
                "              \"day\": 8\n" +
                "            },\n" +
                "            \"time\": {\n" +
                "              \"hour\": 14,\n" +
                "              \"minute\": 48,\n" +
                "              \"second\": 38,\n" +
                "              \"nano\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          \"offset\": {\n" +
                "            \"totalSeconds\": 3600\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:swift:xsd:sese.023.002.01\",\n" +
                "  \"identifier\": \"sese.023.002.01\"\n" +
                "}";
        AbstractMX mx = AbstractMX.fromJson(source);
        assertEquals(source.trim(), mx.toJson().trim());
    }

    @Test
    public void testMxLocalDateJson_LocalDate_OffsetDateTime() {
        String source = "{\n" +
                "  \"sctiesSttlmTxInstr\": {\n" +
                "    \"id\": {\n" +
                "      \"txId\": \"171618023000000\",\n" +
                "      \"cpyDplct\": \"COPY\"\n" +
                "    },\n" +
                "    \"sttlmTpAndAddtlParams\": {\n" +
                "      \"sctiesMvmntTp\": \"RECE\",\n" +
                "      \"pmt\": \"APMT\"\n" +
                "    },\n" +
                "    \"lnkgs\": [\n" +
                "      {\n" +
                "        \"ref\": {\n" +
                "          \"acctSvcrTxId\": \"GT6JVFKH0P4VXV\"\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"tradDtls\": {\n" +
                "      \"tradDt\": {\n" +
                "        \"dt\": {\n" +
                "          \"dt\": {\n" +
                "            \"year\": 2020,\n" +
                "            \"month\": 11,\n" +
                "            \"day\": 2\n" +
                "          }\n" +
                "        }\n" +
                "      },\n" +
                "      \"sttlmDt\": {\n" +
                "        \"dt\": {\n" +
                "          \"dt\": {\n" +
                "            \"year\": 2020,\n" +
                "            \"month\": 11,\n" +
                "            \"day\": 4\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"MUGCLULLXXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"MTBJJPJTXXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"171618023000000\",\n" +
                "    \"msgDefIdr\": \"sese.023.002.01\",\n" +
                "    \"creDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2020,\n" +
                "          \"month\": 11,\n" +
                "          \"day\": 20\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 4,\n" +
                "          \"minute\": 35,\n" +
                "          \"second\": 58,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": 0\n" +
                "      }\n" +
                "    },\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:swift:xsd:sese.023.002.01\",\n" +
                "  \"identifier\": \"sese.023.002.01\"\n" +
                "}";
        AbstractMX mx = AbstractMX.fromJson(source);
        assertEquals(source.trim(), mx.toJson().trim());
    }

    @Test
    public void testMxDateJsonSerializeAndParse_LocalDate() {
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

        assertEquals(json, json2);
        assertEquals(mx, mx2);
    }

    @Test
    public void parseMxWithAppHdr_LocalDate() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
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
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"second\": 38,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";

        assertDoesNotThrow(() -> AbstractMX.fromJson(json));
    }

    @Test
    public void parseSerializedMxWithAppHdr_OffsetDateTime() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"day\": 8,\n" +
                "            \"month\": 4,\n" +
                "            \"year\": 2021\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"nano\": 0,\n" +
                "            \"second\": 38\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
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
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"day\": 8,\n" +
                "          \"month\": 4,\n" +
                "          \"year\": 2021\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"nano\": 0,\n" +
                "          \"second\": 38\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
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
    public void parseSerializedMxWithAppHdrBAH_V1_OffsetDateTime() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
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
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"second\": 38,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
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
    public void parseSerializedMxWithAppHdrBAH_V2_OffsetDateTime() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
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
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"second\": 38,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
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
    public void parseSerializedMxWithAppHdrNoNameSpace_OffsetDateTime() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 21\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
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
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
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
    public void parseSerializedMxWithAppHdrInvalidNamespace_OffsetDateTime() {
        final String json = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"1939E8A71727EDDF\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 21\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
                "      },\n" +
                "      \"nbOfTxs\": \"1\",\n" +
                "      \"sttlmInf\": {\n" +
                "        \"sttlmMtd\": \"INDA\"\n" +
                "      },\n" +
                "      \"instgAgt\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"ROYCFRPBTGT\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"instdAgt\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"TRGTXEPMCLM\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"cdtTrfTxInf\": [\n" +
                "      {\n" +
                "        \"pmtId\": {\n" +
                "          \"instrId\": \"PA23012418819\",\n" +
                "          \"endToEndId\": \"PA23012418819\",\n" +
                "          \"txId\": \"PA23012418819\",\n" +
                "          \"uetr\": \"6e8b66f5-ce02-4635-9eaa-3c0ff96ee901\"\n" +
                "        },\n" +
                "        \"intrBkSttlmAmt\": {\n" +
                "          \"value\": 13000.0,\n" +
                "          \"ccy\": \"EUR\"\n" +
                "        },\n" +
                "        \"intrBkSttlmDt\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 1,\n" +
                "          \"day\": 24\n" +
                "        },\n" +
                "        \"intrmyAgt1\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"TRGTXEPMCLM\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"intrmyAgt1Acct\": {\n" +
                "          \"id\": {\n" +
                "            \"othr\": {\n" +
                "              \"id\": \"RBCPB-A2A-ROYCFRPBTGT\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"dbtr\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"ROYCFRPBTGT\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtrAgt\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"ROYCFRPBTGT\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtrAgtAcct\": {\n" +
                "          \"id\": {\n" +
                "            \"othr\": {\n" +
                "              \"id\": \"MFREURROYCFRPBTGT\"\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtr\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"ROYCFRPBTGT\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtrAcct\": {\n" +
                "          \"id\": {\n" +
                "            \"othr\": {\n" +
                "              \"id\": \"RFREURROYCFRPBTGT\"\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"ROYCFRPBTGT\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"TRGTXEPMCLM\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"PA23012418819\",\n" +
                "    \"msgDefIdr\": \"pacs.009.001.10\",\n" +
                "    \"creDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 21\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"second\": 38,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
                "    },\n" +
                "    \"pssblDplct\": false,\n" +
                "    \"prty\": \"NORM\",\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.10\",\n" +
                "  \"identifier\": \"pacs.009.001.10\"\n" +
                "}";


        AbstractMX source = AbstractMX.fromJson(json);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }

    @Test
    public void testJSON_With_LocalDate() {
        String jsonWithNoOffset = "{\n" +
                "  \"fiCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"A2P76703\",\n" +
                "      \"creDtTm\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 4,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 14,\n" +
                "            \"minute\": 48,\n" +
                "            \"second\": 38,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
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
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 14,\n" +
                "          \"minute\": 48,\n" +
                "          \"second\": 38,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "    }\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.009.001.07\",\n" +
                "  \"identifier\": \"pacs.009.001.07\"\n" +
                "}";

        AbstractMX source = AbstractMX.fromJson(jsonWithNoOffset);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }

    @Test
    public void testJSON_With_LocalDate_OffsetDateTime_OffsetTime() {
        String jsonTimeAndDate = "{\n" +
                "  \"cretStgOrdr\": {\n" +
                "    \"msgHdr\": {\n" +
                "      \"msgId\": \"1221212121\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 5,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 43,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"stgOrdrId\": {\n" +
                "      \"id\": \"AAAACAD0XXX\",\n" +
                "      \"acct\": {\n" +
                "        \"id\": {\n" +
                "          \"iban\": \"AA00XXXAAAACAD0XXXAAAACAD0XXXAAAAC\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"valSet\": {\n" +
                "      \"exctnTp\": {\n" +
                "        \"tm\": {\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 8,\n" +
                "            \"nano\": 0\n" +
                "          },\n" +
                "          \"offset\": {\n" +
                "            \"totalSeconds\": 7200\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"orgId\": {\n" +
                "        \"nm\": \"dssddsqsdqdsqdqs\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"AAAACAD0XXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"AAAACAD0XXX\",\n" +
                "    \"msgDefIdr\": \"camt.102.001.02\",\n" +
                "    \"creDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 15,\n" +
                "          \"minute\": 46,\n" +
                "          \"second\": 9,\n" +
                "          \"nano\": 258000000\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizPrcgDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 20,\n" +
                "          \"minute\": 45,\n" +
                "          \"second\": 31,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
                "    },\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:camt.102.001.02\",\n" +
                "  \"identifier\": \"camt.102.001.02\"\n" +
                "}";

        AbstractMX source = AbstractMX.fromJson(jsonTimeAndDate);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }

    @Test
    public void testJSON_With_LocalDate_OffsetTimeWithNoOffset() {
        String jsonTimeAndDate = "{\n" +
                "  \"cretStgOrdr\": {\n" +
                "    \"msgHdr\": {\n" +
                "      \"msgId\": \"1221212121\",\n" +
                "      \"creDtTm\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 5,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 43,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "      }\n" +
                "    },\n" +
                "    \"stgOrdrId\": {\n" +
                "      \"id\": \"AAAACAD0XXX\",\n" +
                "      \"acct\": {\n" +
                "        \"id\": {\n" +
                "          \"iban\": \"AA00XXXAAAACAD0XXXAAAACAD0XXXAAAAC\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"valSet\": {\n" +
                "      \"exctnTp\": {\n" +
                "        \"tm\": {\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 8,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"orgId\": {\n" +
                "        \"nm\": \"dssddsqsdqdsqdqs\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"AAAACAD0XXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"AAAACAD0XXX\",\n" +
                "    \"msgDefIdr\": \"camt.102.001.02\",\n" +
                "    \"creDt\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 15,\n" +
                "          \"minute\": 46,\n" +
                "          \"second\": 9,\n" +
                "          \"nano\": 258000000\n" +
                "        }\n" +
                "    },\n" +
                "    \"bizPrcgDt\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 20,\n" +
                "          \"minute\": 45,\n" +
                "          \"second\": 31,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "    },\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:camt.102.001.02\",\n" +
                "  \"identifier\": \"camt.102.001.02\"\n" +
                "}";

        AbstractMX source = AbstractMX.fromJson(jsonTimeAndDate);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }


    @Test
    public void testJSONOffsetDateTimeWithNoNano_TimeWithNoNanoNoOffset() {
        String jsonTimeAndDate = "{\n" +
                "  \"cretStgOrdr\": {\n" +
                "    \"msgHdr\": {\n" +
                "      \"msgId\": \"1221212121\",\n" +
                "      \"creDtTm\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2021,\n" +
                "            \"month\": 5,\n" +
                "            \"day\": 8\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 43\n" +
                "          }\n" +
                "      }\n" +
                "    },\n" +
                "    \"stgOrdrId\": {\n" +
                "      \"id\": \"AAAACAD0XXX\",\n" +
                "      \"acct\": {\n" +
                "        \"id\": {\n" +
                "          \"iban\": \"AA00XXXAAAACAD0XXXAAAACAD0XXXAAAAC\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"valSet\": {\n" +
                "      \"exctnTp\": {\n" +
                "        \"tm\": {\n" +
                "          \"time\": {\n" +
                "            \"hour\": 20,\n" +
                "            \"minute\": 45,\n" +
                "            \"second\": 8\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"orgId\": {\n" +
                "        \"nm\": \"dssddsqsdqdsqdqs\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"AAAACAD0XXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"AAAACAD0XXX\",\n" +
                "    \"msgDefIdr\": \"camt.102.001.02\",\n" +
                "    \"creDt\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 15,\n" +
                "          \"minute\": 46,\n" +
                "          \"second\": 9\n" +
                "        }\n" +
                "    },\n" +
                "    \"bizPrcgDt\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 20,\n" +
                "          \"minute\": 45,\n" +
                "          \"second\": 31\n" +
                "        }\n" +
                "    },\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:camt.102.001.02\",\n" +
                "  \"identifier\": \"camt.102.001.02\"\n" +
                "}";

        AbstractMX source = AbstractMX.fromJson(jsonTimeAndDate);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }

    @Test
    public void testJSONYearMonth() {
        String jsonTimeAndDate = "{\n" +
                "  \"acctHldgInfReq\": {\n" +
                "    \"msgRef\": {\n" +
                "      \"id\": \"FFFFFFF\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2023,\n" +
                "            \"month\": 5,\n" +
                "            \"day\": 9\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 16,\n" +
                "            \"minute\": 35,\n" +
                "            \"second\": 48,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": -10800\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"trfrAcct\": {\n" +
                "      \"id\": \"FEEEEER\",\n" +
                "      \"dsgnt\": \"FEEEER\",\n" +
                "      \"acctNm\": \"FEEER\"\n" +
                "    },\n" +
                "    \"trfee\": {\n" +
                "      \"anyBIC\": \"TRGTXEPMCLM\"\n" +
                "    },\n" +
                "    \"pdctTrf\": [\n" +
                "      {\n" +
                "        \"mstrRef\": \"FEEEEER\",\n" +
                "        \"trfId\": \"FEEEEER\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"mktPrctcVrsn\": {\n" +
                "      \"nm\": \"FERNANDOFERNANDO\",\n" +
                "      \"dt\": {\n" +
                "        \"year\": 2013,\n" +
                "        \"month\": 10\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"AAAAUSXXXXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"TRGTXEPMCLM\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"TRGTXEPMCLM\",\n" +
                "    \"msgDefIdr\": \"sese.019.001.06\",\n" +
                "    \"creDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2023,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 9\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 11,\n" +
                "          \"minute\": 38,\n" +
                "          \"second\": 43,\n" +
                "          \"nano\": 268000000\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizPrcgDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2023,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 9\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 16,\n" +
                "          \"minute\": 35,\n" +
                "          \"second\": 57,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": -10800\n" +
                "      }\n" +
                "    },\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:sese.019.001.06\",\n" +
                "  \"identifier\": \"sese.019.001.06\"\n" +
                "}";

        AbstractMX source = AbstractMX.fromJson(jsonTimeAndDate);

        AbstractMX mx = AbstractMX.fromJson(source.toJson());
        AbstractMX mx2 = AbstractMX.fromJson(mx.toJson());
        assertEquals(mx, mx2);

        BusinessAppHdrV02 businessAppHdrV02 = (BusinessAppHdrV02) mx.getAppHdr();
        assertNotNull(businessAppHdrV02);
    }

    @Test
    public void testGson() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(LocalDate.now().getMonth()));

        //OffsetDateTime: {"dateTime":{"date":{"year":2021,"month":5,"day":8},"time":{"hour":21,"minute":48,"second":39,"nano":61498000}},"offset":{"totalSeconds":7200}}
        //LocalDateTime : {"date":{"year":2021,"month":5,"day":8},"time":{"hour":21,"minute":49,"second":48,"nano":279285000}}
        //OffsetTime    : {"time":{"hour":21,"minute":49,"second":20,"nano":212849000},"offset":{"totalSeconds":7200}}
        //LocalTime     : {"hour":21,"minute":50,"second":25,"nano":863749000}
        //Year          : {"year":2021}
        //YearMonth     : {"year":2021,"month":5}
        //Month         : "MAY"
    }


    @Test
    void testMarshalJson() throws JsonProcessingException {
        MxPacs00800107 message = MxPacs00800107.parse(
                "<message>\n" +
                        "    <AppHdr xmlns='urn:iso:std:iso:20022:tech:xsd:head.001.001.01'\n" +
                        "            xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>\n" +
                        "        <Fr>\n" +
                        "            <FIId>\n" +
                        "                <FinInstnId>\n" +
                        "                    <BICFI>ABCDUS33XXX</BICFI>\n" +
                        "                </FinInstnId>\n" +
                        "            </FIId>\n" +
                        "        </Fr>\n" +
                        "        <To>\n" +
                        "            <FIId>\n" +
                        "                <FinInstnId>\n" +
                        "                    <BICFI>EFGHUS33XXX</BICFI>\n" +
                        "                </FinInstnId>\n" +
                        "            </FIId>\n" +
                        "        </To>\n" +
                        "        <BizMsgIdr>12312312312</BizMsgIdr>\n" +
                        "        <MsgDefIdr>pacs.008.001.07</MsgDefIdr>\n" +
                        "        <CreDt>2019-10-19T20:53:13Z</CreDt>\n" +
                        "        <PssblDplct>false</PssblDplct>\n" +
                        "    </AppHdr>\n" +
                        "    <Document xmlns='urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07'\n" +
                        "              xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>\n" +
                        "        <FIToFICstmrCdtTrf>\n" +
                        "            <GrpHdr>\n" +
                        "                <MsgId>823823423</MsgId>\n" +
                        "                <CreDtTm>2019-10-19T21:00:45Z</CreDtTm>\n" +
                        "                <BtchBookg>false</BtchBookg>\n" +
                        "                <NbOfTxs>1</NbOfTxs>\n" +
                        "                <CtrlSum>10000</CtrlSum>\n" +
                        "                <TtlIntrBkSttlmAmt Ccy='USD'>10000</TtlIntrBkSttlmAmt>\n"
                        +
                        "                <IntrBkSttlmDt>2019-10-28</IntrBkSttlmDt>\n" +
                        "                <SttlmInf>\n" +
                        "                    <SttlmMtd>INDA</SttlmMtd>\n" +
                        "                </SttlmInf>\n" +
                        "                <InstgAgt>\n" +
                        "                    <FinInstnId>\n" +
                        "                        <BICFI>CITTGB2LPBG</BICFI>\n" +
                        "                        <Nm>Lionel Messi</Nm>\n" +
                        "                        <Othr>\n" +
                        "                            <Id>2342342342</Id>\n" +
                        "                            <Issr>FOOISSUER</Issr>\n" +
                        "                        </Othr>\n" +
                        "                    </FinInstnId>\n" +
                        "                </InstgAgt>\n" +
                        "                <InstdAgt>\n" +
                        "                    <FinInstnId>\n" +
                        "                        <BICFI>ICBCUS4CXXX</BICFI>\n" +
                        "                        <Nm>Manu Ginobili</Nm>\n" +
                        "                        <PstlAdr>\n" +
                        "                            <AdrTp>PBOX</AdrTp>\n" +
                        "                            <Dept>1</Dept>\n" +
                        "                            <SubDept>DFGH</SubDept>\n" +
                        "                            <StrtNm>My Street</StrtNm>\n" +
                        "                            <BldgNb>1122</BldgNb>\n" +
                        "                            <PstCd>10002</PstCd>\n" +
                        "                            <TwnNm>Los Angeles</TwnNm>\n" +
                        "                            <CtrySubDvsn>ABCD</CtrySubDvsn>\n" +
                        "                        </PstlAdr>\n" +
                        "                    </FinInstnId>\n" +
                        "                </InstdAgt>\n" +
                        "            </GrpHdr>\n" +
                        "            <CdtTrfTxInf>\n" +
                        "                <PmtId>\n" +
                        "                    <InstrId>2233445566</InstrId>\n" +
                        "                    <EndToEndId>987654321987654321</EndToEndId>\n" +
                        "                    <TxId>123456789</TxId>\n" +
                        "                    <ClrSysRef>SDSDS333</ClrSysRef>\n" +
                        "                </PmtId>\n" +
                        "                <IntrBkSttlmAmt Ccy='USD'>5000</IntrBkSttlmAmt>\n" +
                        "                <IntrBkSttlmDt>2019-07-31</IntrBkSttlmDt>\n" +
                        "                <SttlmPrty>URGT</SttlmPrty>\n" +
                        "                <AccptncDtTm>2019-04-28T20:54:39Z</AccptncDtTm>\n" +
                        "                <PoolgAdjstmntDt>2019-04-29</PoolgAdjstmntDt>\n" +
                        "                <InstdAmt Ccy='USD'>5000</InstdAmt>\n" +
                        "                <ChrgBr>SHAR</ChrgBr>\n" +
                        "                <Dbtr>\n" +
                        "                    <Nm>Jhon Doe</Nm>\n" +
                        "                    <PstlAdr>\n" +
                        "                        <AdrTp>HOME</AdrTp>\n" +
                        "                        <Dept>ABCD</Dept>\n" +
                        "                        <SubDept>1</SubDept>\n" +
                        "                        <StrtNm>Foo Street</StrtNm>\n" +
                        "                        <BldgNb>1</BldgNb>\n" +
                        "                        <PstCd>1234</PstCd>\n" +
                        "                        <TwnNm>Buenos Aires</TwnNm>\n" +
                        "                        <CtrySubDvsn>CABA</CtrySubDvsn>\n" +
                        "                        <Ctry>AR</Ctry>\n" +
                        "                    </PstlAdr>\n" +
                        "                    <CtryOfRes>AR</CtryOfRes>\n" +
                        "                </Dbtr>\n" +
                        "                <DbtrAgt>\n" +
                        "                    <FinInstnId>\n" +
                        "                        <BICFI>ITUSUSP1XXX</BICFI>\n" +
                        "                        <Nm>Foo Corp</Nm>\n" +
                        "                    </FinInstnId>\n" +
                        "                </DbtrAgt>\n" +
                        "                <CdtrAgt>\n" +
                        "                    <FinInstnId>\n" +
                        "                        <BICFI>USTBUS31XXX</BICFI>\n" +
                        "                    </FinInstnId>\n" +
                        "                </CdtrAgt>\n" +
                        "                <Cdtr>\n" +
                        "                    <Nm>Mike Smith</Nm>\n" +
                        "                </Cdtr>\n" +
                        "            </CdtTrfTxInf>\n" +
                        "        </FIToFICstmrCdtTrf>\n" +
                        "    </Document>\n" +
                        "</message>");

        ObjectMapper mapper = new ObjectMapper();
        String jsonExcpected = "{\n" +
                "  \"fiToFICstmrCdtTrf\": {\n" +
                "    \"grpHdr\": {\n" +
                "      \"msgId\": \"823823423\",\n" +
                "      \"creDtTm\": {\n" +
                "        \"dateTime\": {\n" +
                "          \"date\": {\n" +
                "            \"year\": 2019,\n" +
                "            \"month\": 10,\n" +
                "            \"day\": 19\n" +
                "          },\n" +
                "          \"time\": {\n" +
                "            \"hour\": 21,\n" +
                "            \"minute\": 0,\n" +
                "            \"second\": 45,\n" +
                "            \"nano\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"offset\": {\n" +
                "          \"totalSeconds\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"btchBookg\": false,\n" +
                "      \"nbOfTxs\": \"1\",\n" +
                "      \"ctrlSum\": 10000,\n" +
                "      \"ttlIntrBkSttlmAmt\": {\n" +
                "        \"value\": 10000,\n" +
                "        \"ccy\": \"USD\"\n" +
                "      },\n" +
                "      \"intrBkSttlmDt\": {\n" +
                "        \"year\": 2019,\n" +
                "        \"month\": 10,\n" +
                "        \"day\": 28\n" +
                "      },\n" +
                "      \"sttlmInf\": {\n" +
                "        \"sttlmMtd\": \"INDA\"\n" +
                "      },\n" +
                "      \"instgAgt\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"CITTGB2LPBG\",\n" +
                "          \"nm\": \"Lionel Messi\",\n" +
                "          \"othr\": {\n" +
                "            \"id\": \"2342342342\",\n" +
                "            \"issr\": \"FOOISSUER\"\n" +
                "          }\n" +
                "        }\n" +
                "      },\n" +
                "      \"instdAgt\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"ICBCUS4CXXX\",\n" +
                "          \"nm\": \"Manu Ginobili\",\n" +
                "          \"pstlAdr\": {\n" +
                "            \"adrTp\": \"PBOX\",\n" +
                "            \"dept\": \"1\",\n" +
                "            \"subDept\": \"DFGH\",\n" +
                "            \"strtNm\": \"My Street\",\n" +
                "            \"bldgNb\": \"1122\",\n" +
                "            \"pstCd\": \"10002\",\n" +
                "            \"twnNm\": \"Los Angeles\",\n" +
                "            \"ctrySubDvsn\": \"ABCD\"\n" +
                "          }\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"cdtTrfTxInf\": [\n" +
                "      {\n" +
                "        \"pmtId\": {\n" +
                "          \"instrId\": \"2233445566\",\n" +
                "          \"endToEndId\": \"987654321987654321\",\n" +
                "          \"txId\": \"123456789\",\n" +
                "          \"clrSysRef\": \"SDSDS333\"\n" +
                "        },\n" +
                "        \"intrBkSttlmAmt\": {\n" +
                "          \"value\": 5000,\n" +
                "          \"ccy\": \"USD\"\n" +
                "        },\n" +
                "        \"intrBkSttlmDt\": {\n" +
                "          \"year\": 2019,\n" +
                "          \"month\": 7,\n" +
                "          \"day\": 31\n" +
                "        },\n" +
                "        \"sttlmPrty\": \"URGT\",\n" +
                "        \"accptncDtTm\": {\n" +
                "          \"dateTime\": {\n" +
                "            \"date\": {\n" +
                "              \"year\": 2019,\n" +
                "              \"month\": 4,\n" +
                "              \"day\": 28\n" +
                "            },\n" +
                "            \"time\": {\n" +
                "              \"hour\": 20,\n" +
                "              \"minute\": 54,\n" +
                "              \"second\": 39,\n" +
                "              \"nano\": 0\n" +
                "            }\n" +
                "          },\n" +
                "          \"offset\": {\n" +
                "            \"totalSeconds\": 0\n" +
                "          }\n" +
                "        },\n" +
                "        \"poolgAdjstmntDt\": {\n" +
                "          \"year\": 2019,\n" +
                "          \"month\": 4,\n" +
                "          \"day\": 29\n" +
                "        },\n" +
                "        \"instdAmt\": {\n" +
                "          \"value\": 5000,\n" +
                "          \"ccy\": \"USD\"\n" +
                "        },\n" +
                "        \"chrgBr\": \"SHAR\",\n" +
                "        \"dbtr\": {\n" +
                "          \"nm\": \"Jhon Doe\",\n" +
                "          \"pstlAdr\": {\n" +
                "            \"adrTp\": \"HOME\",\n" +
                "            \"dept\": \"ABCD\",\n" +
                "            \"subDept\": \"1\",\n" +
                "            \"strtNm\": \"Foo Street\",\n" +
                "            \"bldgNb\": \"1\",\n" +
                "            \"pstCd\": \"1234\",\n" +
                "            \"twnNm\": \"Buenos Aires\",\n" +
                "            \"ctrySubDvsn\": \"CABA\",\n" +
                "            \"ctry\": \"AR\"\n" +
                "          },\n" +
                "          \"ctryOfRes\": \"AR\"\n" +
                "        },\n" +
                "        \"dbtrAgt\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"ITUSUSP1XXX\",\n" +
                "            \"nm\": \"Foo Corp\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtrAgt\": {\n" +
                "          \"finInstnId\": {\n" +
                "            \"bicfi\": \"USTBUS31XXX\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"cdtr\": {\n" +
                "          \"nm\": \"Mike Smith\"\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"appHdr\": {\n" +
                "    \"fr\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"ABCDUS33XXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "      \"fiId\": {\n" +
                "        \"finInstnId\": {\n" +
                "          \"bicfi\": \"EFGHUS33XXX\"\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"bizMsgIdr\": \"12312312312\",\n" +
                "    \"msgDefIdr\": \"pacs.008.001.07\",\n" +
                "    \"creDt\": {\n" +
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2019,\n" +
                "          \"month\": 10,\n" +
                "          \"day\": 19\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 20,\n" +
                "          \"minute\": 53,\n" +
                "          \"second\": 13,\n" +
                "          \"nano\": 0\n" +
                "        }\n" +
                "      },\n" +
                "      \"offset\": {\n" +
                "        \"totalSeconds\": 0\n" +
                "      }\n" +
                "    },\n" +
                "    \"pssblDplct\": false,\n" +
                "    \"namespace\": \"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"\n" +
                "  },\n" +
                "  \"type\": \"MX\",\n" +
                "  \"@xmlns\": \"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07\",\n" +
                "  \"identifier\": \"pacs.008.001.07\"\n" +
                "}";

        System.out.println(jsonExcpected);
        System.out.println(message.toJson());

        assertEquals(mapper.readTree(jsonExcpected), mapper.readTree(message.toJson()));
        assertEquals(jsonExcpected.trim(), message.toJson().trim());

    }
}