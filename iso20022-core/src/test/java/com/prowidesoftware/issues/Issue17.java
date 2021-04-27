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

import com.prowidesoftware.swift.model.mx.MxSeev03100209;
import com.prowidesoftware.swift.model.mx.dic.CorporateActionNotificationType1Code;
import com.prowidesoftware.swift.model.mx.dic.SafekeepingAccountIdentification1Code;
import com.prowidesoftware.swift.utils.Lib;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://github.com/prowide/prowide-iso20022/issues/17
 */
public class Issue17 {


    @Test
    public void test_whiteSpaceInCCY() throws IOException {
        String xml = Lib.readResource("issues/17/ABC_CANO.CA.ID.DT_test.txt");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
        String xmlResult = mx.message();
        // Original issue
        assertFalse(xmlResult.contains("<Doc:Amt Ccy=\"USD\" >0.000000</Doc:Amt>"));
        // Excpected result
        assertTrue(xmlResult.contains("<Doc:Amt Ccy=\"USD\">0.000000</Doc:Amt>"));
    }

    @Test
    public void test_missingNewLine() throws IOException {
        String xml = Lib.readResource("issues/17/ABC_CANO.CA.ID.DT_test.txt");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
        String xmlResult = mx.message();
        // Original issue
        assertFalse(xmlResult.contains("<Doc:Dt>\n" +
                "                        <Doc:Dt>2021-11-11</Doc:Dt></Doc:Dt>"));
        // Excpected result
        assertTrue(xmlResult.contains(" <Doc:Dt>\n" +
                "                        <Doc:Dt>2021-11-11</Doc:Dt>\n" +
                "                    </Doc:Dt>"));
    }

    private void assertMessage(MxSeev03100209 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().from());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().to());
        assertEquals("1111111111111111", mx.getAppHdr().reference());
        assertNotNull(mx.getCorpActnNtfctn());
        assertEquals(CorporateActionNotificationType1Code.REPL, mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
        assertEquals("111111111", mx.getCorpActnNtfctn().getCorpActnGnlInf().getCorpActnEvtId());
        assertEquals(SafekeepingAccountIdentification1Code.GENR, mx.getCorpActnNtfctn().getAcctDtls().getForAllAccts().getIdCd());
    }

}