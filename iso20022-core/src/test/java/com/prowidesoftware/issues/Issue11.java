package com.prowidesoftware.issues;

import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import com.prowidesoftware.swift.model.mx.MxPacs00200108;
import com.prowidesoftware.swift.utils.Lib;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://github.com/prowide/prowide-iso20022/issues/11
 */
public class Issue11 {

    /*
     * Supplementary data is not bounded to any namespace
     * Signature element in header is missing namespace
     */
    @Test
    public void test() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08.txt");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertNull(mx);
    }

    private void assertMessage(MxPacs00200108 mx) {
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        BusinessAppHdrV01 h = (BusinessAppHdrV01) mx.getAppHdr();
        assertEquals("APPEXXXX", h.getFr().getFIId().getFinInstnId().getOthr().getId());
        assertNotNull(mx.getFIToFIPmtStsRpt());
        assertEquals("20201008BCBCMYKL22020534605", mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());
    }

    @Test
    public void testInvalidElement() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-invalidElement.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryData_no_prefix() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_no_prefix.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryData_removed() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_removed.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    @Test
    public void testSplmtryData_with_namespace() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

}