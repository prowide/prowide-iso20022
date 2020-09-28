package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.dic.CustomerCreditTransferInitiationV03;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader32;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification32;
import com.prowidesoftware.swift.model.mx.dic.PaymentInstructionInformation3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MxModelTest {

    @Test
    public void test() {
        MxPain00100103 mx = new MxPain00100103();
        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV03());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader32());
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("1234");
        mx.getCstmrCdtTrfInitn().addPmtInf(new PaymentInstructionInformation3());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setDbtr(new PartyIdentification32());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).getDbtr().setNm("Foo");

        MxPain00100103 mx2 = MxPain00100103.parse(mx.message());
        assertEquals(mx, mx2);

        MxPain00100103 mx3 = new MxPain00100103(mx.message());
        assertEquals(mx, mx3);

        MxPain00100103 mx4 = new MxPain00100103(new MxSwiftMessage(mx.message()));
        assertEquals(mx, mx4);
    }

}
