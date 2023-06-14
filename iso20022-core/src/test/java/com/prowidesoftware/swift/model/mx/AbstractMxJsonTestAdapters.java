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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.prowidesoftware.swift.model.mx.dic.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for JSON conversion in the MX model (AbstractMX and subclasses).
 *
 * @since 7.10.2@
 */
public class AbstractMxJsonTestAdapters {

    @Test
    public void testMxPain00100108_toJson_fromJson_With_OffsetDateTime() {
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

        //toJson()
        final String json = mx.toJson();

        //fromJson()
        MxPain00100108 mx2 = MxPain00100108.fromJson(json);
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
    public void testMxCamt05300106_toJson_fromJson_With_OffsetDateTime() {
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

        //toJson
        final String json = mx.toJson();

        //fromJson with MxCamt05300106
        MxCamt05300106 mx2 = MxCamt05300106.fromJson(json);
        assertCamt05300106(mx2);

        //fromJson casting to (MxCamt05300106)
        MxCamt05300106 mx3 = (MxCamt05300106) AbstractMX.fromJson(json);
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

        JsonElement sourceElement = JsonParser.parseString(source);
        JsonElement mxJsonElement = JsonParser.parseString(mx.toJson().trim());

        assertEquals(sourceElement, mxJsonElement);
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
                "      }\n" +
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
                "      }\n" +
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
    public void testJSONOffsetDateTimeWithNoNano_TimeWithNoNanoNoOffset() {
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
                "            \"second\": 43\n" +
                "          }\n" +
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
                "      \"dateTime\": {\n" +
                "        \"date\": {\n" +
                "          \"year\": 2021,\n" +
                "          \"month\": 5,\n" +
                "          \"day\": 8\n" +
                "        },\n" +
                "        \"time\": {\n" +
                "          \"hour\": 20,\n" +
                "          \"minute\": 45,\n" +
                "          \"second\": 43\n" +
                "        }\n" +
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
                "          \"second\": 43\n" +
                "        }\n" +
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
}