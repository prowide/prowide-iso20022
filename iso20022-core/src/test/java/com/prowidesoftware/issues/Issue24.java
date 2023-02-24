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
package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.MinimumEscapeHandler;
import com.prowidesoftware.swift.model.mx.MxPain00100103;
import com.prowidesoftware.swift.model.mx.MxWriteConfiguration;
import com.prowidesoftware.swift.model.mx.dic.CustomerCreditTransferInitiationV03;
import com.prowidesoftware.swift.model.mx.dic.GroupHeader32;
import com.prowidesoftware.swift.model.mx.dic.PartyIdentification32;
import com.prowidesoftware.swift.model.mx.dic.PaymentInstructionInformation3;
import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://github.com/prowide/prowide-iso20022/issues/24
 */
public class Issue24 {

    private MxPain00100103 sample() {
        MxPain00100103 mx = new MxPain00100103();
        mx.setCstmrCdtTrfInitn(new CustomerCreditTransferInitiationV03());
        mx.getCstmrCdtTrfInitn().setGrpHdr(new GroupHeader32());
        mx.getCstmrCdtTrfInitn().getGrpHdr().setMsgId("1234");
        mx.getCstmrCdtTrfInitn().addPmtInf(new PaymentInstructionInformation3());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).setDbtr(new PartyIdentification32());
        mx.getCstmrCdtTrfInitn().getPmtInf().get(0).getDbtr().setNm("текст текст öñ");
        return mx;
    }

    @Test
    public void testWriteDefaultEscapeHandler() {
        MxPain00100103 mx = sample();
        String xml = mx.message();
        assertTrue(xml.contains("&#1090;&#1077;&#1082;&#1089;&#1090; &#1090;&#1077;&#1082;&#1089;&#1090; &#246;&#241;"));

        MxPain00100103 mx2 = MxPain00100103.parse(xml);
        assertEquals("текст текст öñ", mx2.getCstmrCdtTrfInitn().getPmtInf().get(0).getDbtr().getNm());
        assertEquals(mx, mx2);
    }

    @Test
    public void testWriteDefaultMinimumEscapeHandler() {
        MxPain00100103 mx = sample();

        MxWriteConfiguration conf = new MxWriteConfiguration();
        conf.escapeHandler = new MinimumEscapeHandler();
        String xml = mx.message(conf);

        System.out.println(Charset.defaultCharset().name());
        assertTrue(xml.contains("текст текст öñ"));

        MxPain00100103 mx2 = MxPain00100103.parse(xml);
        assertEquals("текст текст öñ", mx2.getCstmrCdtTrfInitn().getPmtInf().get(0).getDbtr().getNm());
        assertEquals(mx, mx2);
    }

    @Test
    public void testParse() {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Doc:Document xmlns:Doc=\"urn:iso:std:iso:20022:tech:xsd:pain.001.001.03\">\n" +
                "    <Doc:CstmrCdtTrfInitn>\n" +
                "        <Doc:GrpHdr>\n" +
                "            <Doc:MsgId>1234</Doc:MsgId>\n" +
                "        </Doc:GrpHdr>\n" +
                "        <Doc:PmtInf>\n" +
                "            <Doc:Dbtr>\n" +
                "                <Doc:Nm>текст текст öñ</Doc:Nm>\n" +
                "            </Doc:Dbtr>\n" +
                "        </Doc:PmtInf>\n" +
                "    </Doc:CstmrCdtTrfInitn>\n" +
                "</Doc:Document>";
        MxPain00100103 mx2 = MxPain00100103.parse(xml);
        assertEquals("текст текст öñ", mx2.getCstmrCdtTrfInitn().getPmtInf().get(0).getDbtr().getNm());
    }

}
