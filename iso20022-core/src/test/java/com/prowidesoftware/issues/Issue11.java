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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.mx.BusinessAppHdrV01;
import com.prowidesoftware.swift.model.mx.MxPacs00200108;
import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import org.junit.jupiter.api.Test;

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
        assertEquals(
                "20201008BCBCMYKL22020534605",
                mx.getFIToFIPmtStsRpt().getGrpHdr().getMsgId());
    }

    /*
     * supplementary data invalid prefix is removed, so no warning is printed
     * header signature namespace is fixed
     */
    @Test
    public void testSplmtryData_no_prefix() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_no_prefix.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    /*
     * supplementary data is removed, so no warning is printed
     * header signature namespace is fixed
     */
    @Test
    public void testSplmtryData_removed() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_removed.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    /*
     * supplementary data with foo namespace is silently ignored
     * header signature namespace is fixed
     */
    @Test
    public void testSplmtryData_with_namespace() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-SplmtryData_with_namespace.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }

    /*
     * relocated unbounded content is silently ignored
     * header signature namespace is fixed
     */
    @Test
    public void testInvalidElement() throws IOException {
        String xml = Lib.readResource("issues/11/samplemsg.002.001.08-invalidElement.xml");
        assertNotNull(xml);
        MxPacs00200108 mx = MxPacs00200108.parse(xml);
        assertMessage(mx);
    }
}
