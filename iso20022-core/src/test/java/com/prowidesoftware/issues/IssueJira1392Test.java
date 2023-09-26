package com.prowidesoftware.issues;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.mx.dic.BranchAndFinancialInstitutionIdentification6;
import com.prowidesoftware.swift.model.mx.dic.FinancialInstitutionIdentification18;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader93;
import com.prowidesoftware.swift.model.mx.dic.SettlementInstruction7;
import org.junit.jupiter.api.Test;

public class IssueJira1392Test {

    @Test
    public void testQuoteCharacter() {
        com.prowidesoftware.swift.model.mx.MxPacs00800108 mx = new com.prowidesoftware.swift.model.mx.MxPacs00800108();
        mx.setFIToFICstmrCdtTrf(new com.prowidesoftware.swift.model.mx.dic.FIToFICustomerCreditTransferV08());
        mx.getFIToFICstmrCdtTrf().setGrpHdr(new GroupHeader93());
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setMsgId("\"");
        mx.getFIToFICstmrCdtTrf().getGrpHdr().setSttlmInf(new SettlementInstruction7());
        mx.getFIToFICstmrCdtTrf()
                .getGrpHdr()
                .getSttlmInf()
                .setInstdRmbrsmntAgt(new BranchAndFinancialInstitutionIdentification6());
        mx.getFIToFICstmrCdtTrf()
                .getGrpHdr()
                .getSttlmInf()
                .getInstdRmbrsmntAgt()
                .setFinInstnId(new FinancialInstitutionIdentification18());
        mx.getFIToFICstmrCdtTrf()
                .getGrpHdr()
                .getSttlmInf()
                .getInstdRmbrsmntAgt()
                .getFinInstnId()
                .setNm("FOO\"BAR");
        System.out.println(mx.document());
        assertTrue(mx.document().contains(">\"<"));
        assertTrue(mx.document().contains(">FOO\"BAR<"));
    }
}
