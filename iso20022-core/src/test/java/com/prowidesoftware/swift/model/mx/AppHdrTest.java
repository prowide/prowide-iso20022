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

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.utils.TestUtils;
import java.io.StringReader;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.junit.jupiter.api.Test;
import org.xmlunit.xpath.JAXPXPathEngine;

/**
 * Test cases for reading and writing MX headers
 *
 * @since 9.0.1
 */
public class AppHdrTest {

    private void testXpath(String xml, String path, String expected) {
        Source source = new StreamSource(new StringReader(xml));
        assertEquals(expected, new JAXPXPathEngine().evaluate(TestUtils.patch(path), source));
    }

    /*
     * ISO header V1
     */
    @Test
    public void testBusinessAppHdrV01Xm() {
        BusinessAppHdrV01 bah = new BusinessAppHdrV01();
        bah.setFr(new Party9Choice());
        bah.getFr().setFIId(new BranchAndFinancialInstitutionIdentification5());
        bah.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification8());
        bah.getFr().getFIId().getFinInstnId().setBICFI("BIC");
        bah.getFr().getFIId().setBrnchId(new BranchData2());
        bah.getFr().getFIId().getBrnchId().setId("id");
        bah.getFr().getFIId().getBrnchId().setNm("name");
        bah.getFr().getFIId().getBrnchId().setPstlAdr(new PostalAddress6());
        bah.getFr().getFIId().getBrnchId().getPstlAdr().setCtry("AR");

        final String xml = bah.xml();

        assertNotNull(xml);
        // System.out.println(xml);
        testXpath(xml, "/AppHdr/Fr/FIId/FinInstnId/BICFI", "BIC");
        testXpath(xml, "/AppHdr/Fr/FIId/BrnchId/Id", "id");
        testXpath(xml, "/AppHdr/Fr/FIId/BrnchId/Nm", "name");
    }

    /*
     * ISO header V2
     */
    @Test
    public void testBusinessAppHdrV02Xml() {
        BusinessAppHdrV02 bah = new BusinessAppHdrV02();
        bah.setFr(new Party44Choice());
        bah.getFr().setFIId(new BranchAndFinancialInstitutionIdentification6());
        bah.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
        bah.getFr().getFIId().getFinInstnId().setBICFI("BIC");
        bah.getFr().getFIId().setBrnchId(new BranchData3());
        bah.getFr().getFIId().getBrnchId().setId("id");
        bah.getFr().getFIId().getBrnchId().setNm("name");
        bah.getFr().getFIId().getBrnchId().setPstlAdr(new PostalAddress24());
        bah.getFr().getFIId().getBrnchId().getPstlAdr().setCtry("AR");
        bah.setMktPrctc(new ImplementationSpecification1());
        bah.getMktPrctc().setId("FOO");
        bah.getMktPrctc().setRegy("BAR");

        final String xml = bah.xml();

        assertNotNull(xml);
        // System.out.println(xml);
        testXpath(xml, "/AppHdr/Fr/FIId/FinInstnId/BICFI", "BIC");
        testXpath(xml, "/AppHdr/Fr/FIId/BrnchId/Id", "id");
        testXpath(xml, "/AppHdr/Fr/FIId/BrnchId/Nm", "name");
    }

    /*
     * SWIFT header
     */
    @Test
    public void testLegacyAppHdrXml() {
        LegacyAppHdr ah = new LegacyAppHdr();
        ah.setFrom(new EntityIdentification());
        ah.getFrom().setId("id");

        final String xml = ah.xml();

        assertNotNull(xml);
        testXpath(xml, "/AppHdr/From/Id", "id");
    }

    @Test
    public void testWriteEmpty() {
        assertNotNull(new BusinessAppHdrV01().xml());
        assertNotNull(new BusinessAppHdrV02().xml());
        assertNotNull(new LegacyAppHdr().xml());
    }

    @Test
    public void testNamespace() {
        assertTrue(new BusinessAppHdrV01().xml().contains(BusinessAppHdrV01.NAMESPACE));
        assertTrue(new BusinessAppHdrV02().xml().contains(BusinessAppHdrV02.NAMESPACE));
        assertTrue(new LegacyAppHdr().xml().contains(LegacyAppHdr.NAMESPACE));
    }

    @Test
    public void testLegacyAppHdrApi() {
        LegacyAppHdr h = new LegacyAppHdr();

        h.setFrom(new EntityIdentification());
        h.getFrom().setType("BIC");
        h.getFrom().setId("FOOBARXX");
        h.setTo(new EntityIdentification());
        h.getTo().setType("BIC");
        h.getTo().setId("ABCFOOXX");

        assertEquals("FOOBARXX", h.from());
        assertEquals("ABCFOOXX", h.to());

        h.getFrom().setType("DN");
        h.getFrom().setId("cn=funds,o=abcdchzz,o=swift");
        h.setTo(new EntityIdentification());
        h.getTo().setType("DN");
        h.getTo().setId("cn=funds,o=dcbadeff,o=swift");
        h.setMsgRef("MYREF1234");
        h.setMsgName("pacs.008.001.08");
        h.setSvcName("TGS");

        assertEquals("ABCDCHZZ", h.from());
        assertEquals("DCBADEFF", h.to());
        assertEquals("MYREF1234", h.reference());
        assertEquals("pacs.008.001.08", h.messageName());
        assertEquals("TGS", h.serviceName());
        assertFalse(h.duplicate());

        h.setDup(new DuplicateIndication());
        assertTrue(h.duplicate());
    }

    @Test
    public void testBusinessAppHdrV01Api() {
        BusinessAppHdrV01 h = new BusinessAppHdrV01();

        h.setFr(new Party9Choice());
        h.getFr().setFIId(new BranchAndFinancialInstitutionIdentification5());
        h.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification8());
        h.getFr().getFIId().getFinInstnId().setBICFI("FOOBARXX");
        h.setTo(new Party9Choice());
        h.getTo().setFIId(new BranchAndFinancialInstitutionIdentification5());
        h.getTo().getFIId().setFinInstnId(new FinancialInstitutionIdentification8());
        h.getTo().getFIId().getFinInstnId().setBICFI("ABCFOOXX");
        h.setBizMsgIdr("MYID1234");
        h.setMsgDefIdr("pacs.008.001.08");
        h.setBizSvc("TGS");

        assertEquals("FOOBARXX", h.from());
        assertEquals("ABCFOOXX", h.to());
        assertEquals("MYID1234", h.reference());
        assertEquals("pacs.008.001.08", h.messageName());
        assertEquals("TGS", h.serviceName());
        assertFalse(h.duplicate());

        // h.setCpyDplct(CopyDuplicate1Code.DUPL);
        // assertTrue(h.duplicate());
    }

    @Test
    public void testBusinessAppHdrV02Api() {
        BusinessAppHdrV02 h = new BusinessAppHdrV02();

        h.setFr(new Party44Choice());
        h.getFr().setFIId(new BranchAndFinancialInstitutionIdentification6());
        h.getFr().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
        h.getFr().getFIId().getFinInstnId().setBICFI("FOOBARXX");
        h.setTo(new Party44Choice());
        h.getTo().setFIId(new BranchAndFinancialInstitutionIdentification6());
        h.getTo().getFIId().setFinInstnId(new FinancialInstitutionIdentification18());
        h.getTo().getFIId().getFinInstnId().setBICFI("ABCFOOXX");
        h.setBizMsgIdr("MYID1234");
        h.setMsgDefIdr("pacs.008.001.08");
        h.setBizSvc("TGS");

        assertEquals("FOOBARXX", h.from());
        assertEquals("ABCFOOXX", h.to());
        assertEquals("MYID1234", h.reference());
        assertEquals("pacs.008.001.08", h.messageName());
        assertEquals("TGS", h.serviceName());
        assertFalse(h.duplicate());

        // h.setCpyDplct(CopyDuplicate1Code.DUPL);
        // assertTrue(h.duplicate());
    }
}
