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

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.dic.CustomerCreditTransferInitiationV03;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader32;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification32;
import com.prowidesoftware.swift.model.mx.dic.PaymentInstructionInformation3;
import org.junit.jupiter.api.Test;

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
