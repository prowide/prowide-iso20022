package com.prowidesoftware.issues;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.AppHdr;
import com.prowidesoftware.swift.model.mx.AppHdrParser;
import com.prowidesoftware.swift.model.mx.sys.MxXsys00200101;
import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class Jira1462Test {

    @Test
    void test() throws IOException {
        String xml = Lib.readResource("sample_hvcs_xsys.002_pacs.008.xml");
        final AbstractMX read = AbstractMX.parse(xml, new MxId("xsys", "002", "001", "01"));
        assertNotNull(read, "read object null ");
        assertTrue(read instanceof MxXsys00200101);

        final MxXsys00200101 mx = (MxXsys00200101) read;
        assertNotNull(mx);
        assertNotNull(mx.getMessageStandardType());
        assertNotNull(mx.getAppHdr());
        assertEquals(
                "swi00003-2023-07-19T04:56:40.63614.012852Z",
                mx.getXsys00200101().getAuthstnNtfctn().getSnFRef());

        SwAny thirdPartyToSenderInformation =
                mx.getXsys00200101().getAuthstnNtfctn().getThirdPartyToSenderInformation();
        assertNotNull(thirdPartyToSenderInformation);
        assertFalse(thirdPartyToSenderInformation.getAny().isEmpty());
        System.out.println("MxXsys00200101 WITH TEXT: " + mx.message());
    }

    @Test
    void testWithNamespaces() throws IOException {
        String xml = Lib.readResource("sample_hvcs_xsys.002_pacs.008_namespaces.xml");
        Optional<AppHdr> parse = AppHdrParser.parse(xml);
        assertTrue(parse.isPresent());

        final AbstractMX read = AbstractMX.parse(xml, new MxId("xsys", "002", "001", "01"));
        assertNotNull(read, "read object null ");
        assertTrue(read instanceof MxXsys00200101);

        final MxXsys00200101 mx = (MxXsys00200101) read;
        assertNotNull(mx);
        assertNotNull(mx.getMessageStandardType());
        assertEquals(
                "swi00003-2023-07-19T04:56:40.63614.012852Z",
                mx.getXsys00200101().getAuthstnNtfctn().getSnFRef());

        SwAny thirdPartyToSenderInformation =
                mx.getXsys00200101().getAuthstnNtfctn().getThirdPartyToSenderInformation();
        assertNotNull(thirdPartyToSenderInformation);
        assertFalse(thirdPartyToSenderInformation.getAny().isEmpty());
        System.out.println("MxXsys00200101 WITH TEXT: " + mx.message());
    }

    @Test
    void withoutNoSwAny() throws IOException {
        final AbstractMX read = AbstractMX.parse(
                Lib.readResource("sample_hvcs_xsys.002_pacs.008_noSw.xml"), new MxId("xsys", "002", "001", "01"));
        assertNotNull(read, "read object null ");
        assertTrue(read instanceof MxXsys00200101);

        final MxXsys00200101 mx = (MxXsys00200101) read;
        assertNotNull(mx);
        assertNotNull(mx.getMessageStandardType());
        assertEquals(
                "swi00003-2023-07-19T04:56:40.63614.012852Z",
                mx.getXsys00200101().getAuthstnNtfctn().getSnFRef());

        SwAny thirdPartyToSenderInformation =
                mx.getXsys00200101().getAuthstnNtfctn().getThirdPartyToSenderInformation();
        assertNotNull(thirdPartyToSenderInformation);
        // assertFalse(thirdPartyToSenderInformation.getAny().isEmpty());
        // System.out.println("MxXsys00200101 WITH TEXT: " + mx.message());
    }
}
