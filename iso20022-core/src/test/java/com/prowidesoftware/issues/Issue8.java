package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.MxSeev03100209;
import com.prowidesoftware.swift.model.mx.dic.CorporateActionNotificationType1Code;
import com.prowidesoftware.swift.utils.Lib;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertNotNull(mx);
    }

    @Test
    public void testNoSplmtryData() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-no_SplmtryData.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertNotNull(mx);
        assertEquals(CorporateActionNotificationType1Code.REPL, mx.getCorpActnNtfctn().getNtfctnGnlInf().getNtfctnTp());
    }

    @Test
    public void testWithSplmtryDataAsCDATA() throws IOException {
        String xml = Lib.readResource("issues/8/ABC_CANO.CA.ID.111111111-SplmtryData-CDATA.xml");
        assertNotNull(xml);
        MxSeev03100209 mx = MxSeev03100209.parse(xml);
        assertNotNull(mx);
    }

}
