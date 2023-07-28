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
package com.prowidesoftware.issues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.prowidesoftware.swift.model.mx.MxSeev03100209;
import com.prowidesoftware.swift.model.mx.dic.CorporateActionNotificationType1Code;
import com.prowidesoftware.swift.model.mx.dic.SafekeepingAccountIdentification1Code;
import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import org.junit.jupiter.api.Test;

/**
 * https://github.com/prowide/prowide-iso20022/issues/8
 */
public class Issue8 {

    /**
     * Fails because of the namespace in SplmtryData
     */
    @Test
    public void testSplmtryData() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111.txt");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    private void assertMessage(MxSeev03100209 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().from());
        assertEquals("XXXXXXXXXXX", mx.getAppHdr().to());
        assertEquals("1111111111111111", mx.getAppHdr().reference());
        assertNotNull(mx.getCorpActnNtfctn());
        assertEquals(
                CorporateActionNotificationType1Code.REPL,
                mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
        assertEquals("111111111", mx.getCorpActnNtfctn().getCorpActnGnlInf().getCorpActnEvtId());
        assertEquals(
                SafekeepingAccountIdentification1Code.GENR,
                mx.getCorpActnNtfctn().getAcctDtls().getForAllAccts().getIdCd());
    }

    @Test
    public void testNoSplmtryData() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_none.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataCDATA() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_CDATA.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataEmpty() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_empty.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryDataSimple() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData_simple.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertMessage(mx);
    }
}
