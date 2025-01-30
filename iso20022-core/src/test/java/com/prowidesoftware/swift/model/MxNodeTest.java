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
package com.prowidesoftware.swift.model;

import static org.junit.jupiter.api.Assertions.*;

import com.prowidesoftware.swift.utils.Lib;
import java.io.IOException;
import org.junit.jupiter.api.Test;

/**
 * @since 7.8.8
 */
public class MxNodeTest {

    @Test
    public void testParse01() {
        final String xml = "<FaceAmount>1234567.89</FaceAmount>";
        final MxNode doc = MxNode.parse(xml);
        assertEquals("1234567.89", doc.findFirstByName("FaceAmount").getValue());
    }

    @Test
    public void testParse02() {
        final String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:semt.002.002.03\">"
                + "   <Doc:SecuritiesBalanceCustodyReport.002V03>"
                + "      <Doc:Identification>"
                + "         <Doc:Identification>ICF2750609140005</Doc:Identification>"
                + "      </Doc:Identification>"
                + "      <Doc:Pagination>"
                + "         <Doc:PageNumber>00005</Doc:PageNumber>"
                + "         <Doc:LastPageIndicator>false</Doc:LastPageIndicator>"
                + "      </Doc:Pagination>"
                + "      <Doc:StatementGeneralDetails>"
                + "         <Doc:StatementDateTime>"
                + "            <Doc:Date>2006-09-13T00:00:00</Doc:Date>"
                + "         </Doc:StatementDateTime>"
                + "         <Doc:Frequency>"
                + "            <Doc:Code>DAIL</Doc:Code>"
                + "         </Doc:Frequency>"
                + "         <Doc:UpdateType>"
                + "            <Doc:Code>COMP</Doc:Code>"
                + "         </Doc:UpdateType>"
                + "         <Doc:StatementBasis>"
                + "            <Doc:Code>TRAD</Doc:Code>"
                + "         </Doc:StatementBasis>"
                + "         <Doc:ActivityIndicator>true</Doc:ActivityIndicator>"
                + "         <Doc:SubAccountIndicator>false</Doc:SubAccountIndicator>"
                + "      </Doc:StatementGeneralDetails>"
                + "      <Doc:SafekeepingAccount>"
                + "         <Doc:Identification>F275</Doc:Identification>"
                + "      </Doc:SafekeepingAccount>"
                + "      <Doc:BalanceForAccount>"
                + "         <Doc:FinancialInstrumentIdentification>"
                + "            <Doc:Identification>"
                + "               <Doc:OtherIdentification>"
                + "                  <Doc:Identification>31392EXH8</Doc:Identification>"
                + "                  <Doc:IdentificationSource>"
                + "                     <Doc:Domestic>US</Doc:Domestic>"
                + "                  </Doc:IdentificationSource>"
                + "               </Doc:OtherIdentification>"
                + "            </Doc:Identification>"
                + "            <Doc:Description>/US/31392EXH8 FEDERAL FOO MTG ASSN</Doc:Description>"
                + "         </Doc:FinancialInstrumentIdentification>"
                + "         <Doc:FinancialInstrumentAttributes>"
                + "            <Doc:CurrentFactor>0.14528727</Doc:CurrentFactor>"
                + "         </Doc:FinancialInstrumentAttributes>"
                + "         <Doc:AggregateBalance>"
                + "            <Doc:ShortLongIndicator>LONG</Doc:ShortLongIndicator>"
                + "            <Doc:Quantity>"
                + "               <Doc:Quantity>"
                + "                  <Doc:OriginalAndCurrentFace>"
                + "                     <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "                     <Doc:AmortisedValue>35732656.0</Doc:AmortisedValue>"
                + "                  </Doc:OriginalAndCurrentFace>"
                + "               </Doc:Quantity>"
                + "            </Doc:Quantity>"
                + "         </Doc:AggregateBalance>"
                + "         <Doc:AvailableBalance>"
                + "            <Doc:Quantity>"
                + "               <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "            </Doc:Quantity>"
                + "         </Doc:AvailableBalance>"
                + "         <Doc:SafekeepingPlace>"
                + "            <Doc:TypeAndIdentification>"
                + "               <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "               <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "            </Doc:TypeAndIdentification>"
                + "         </Doc:SafekeepingPlace>"
                + "         <Doc:BalanceAtSafekeepingPlace>"
                + "            <Doc:SafekeepingPlace>"
                + "               <Doc:TypeAndIdentification>"
                + "                  <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "                  <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "               </Doc:TypeAndIdentification>"
                + "            </Doc:SafekeepingPlace>"
                + "            <Doc:AggregateBalance>"
                + "               <Doc:ShortLongIndicator>LONG</Doc:ShortLongIndicator>"
                + "               <Doc:Quantity>"
                + "                  <Doc:Quantity>"
                + "                     <Doc:Quantity>"
                + "                        <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "                     </Doc:Quantity>"
                + "                  </Doc:Quantity>"
                + "               </Doc:Quantity>"
                + "            </Doc:AggregateBalance>"
                + "            <Doc:AvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:AvailableBalance>"
                + "         </Doc:BalanceAtSafekeepingPlace>"
                + "         <Doc:BalanceAtSafekeepingPlace>"
                + "            <Doc:SafekeepingPlace>"
                + "               <Doc:TypeAndIdentification>"
                + "                  <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "                  <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "               </Doc:TypeAndIdentification>"
                + "            </Doc:SafekeepingPlace>"
                + "            <Doc:AggregateBalance>"
                + "               <Doc:ShortLongIndicator>LONG</Doc:ShortLongIndicator>"
                + "               <Doc:Quantity>"
                + "                  <Doc:Quantity>"
                + "                     <Doc:Quantity>"
                + "                        <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "                     </Doc:Quantity>"
                + "                  </Doc:Quantity>"
                + "               </Doc:Quantity>"
                + "            </Doc:AggregateBalance>"
                + "            <Doc:AvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>35732656.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:AvailableBalance>"
                + "         </Doc:BalanceAtSafekeepingPlace>"
                + "      </Doc:BalanceForAccount>"
                + "      <Doc:BalanceForAccount>"
                + "         <Doc:FinancialInstrumentIdentification>"
                + "            <Doc:Identification>"
                + "               <Doc:OtherIdentification>"
                + "                  <Doc:Identification>31406RR72</Doc:Identification>"
                + "                  <Doc:IdentificationSource>"
                + "                     <Doc:Domestic>US</Doc:Domestic>"
                + "                  </Doc:IdentificationSource>"
                + "               </Doc:OtherIdentification>"
                + "            </Doc:Identification>"
                + "            <Doc:Description>/US/31406RR72 FOO POOL 817810</Doc:Description>"
                + "         </Doc:FinancialInstrumentIdentification>"
                + "         <Doc:FinancialInstrumentAttributes>"
                + "            <Doc:CurrentFactor>0.0</Doc:CurrentFactor>"
                + "         </Doc:FinancialInstrumentAttributes>"
                + "         <Doc:AggregateBalance>"
                + "            <Doc:ShortLongIndicator>LONG</Doc:ShortLongIndicator>"
                + "            <Doc:Quantity>"
                + "               <Doc:Quantity>"
                + "                  <Doc:OriginalAndCurrentFace>"
                + "                     <Doc:FaceAmount>0.0</Doc:FaceAmount>"
                + "                     <Doc:AmortisedValue>0.0</Doc:AmortisedValue>"
                + "                  </Doc:OriginalAndCurrentFace>"
                + "               </Doc:Quantity>"
                + "            </Doc:Quantity>"
                + "         </Doc:AggregateBalance>"
                + "         <Doc:AvailableBalance>"
                + "            <Doc:Quantity>"
                + "               <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "            </Doc:Quantity>"
                + "         </Doc:AvailableBalance>"
                + "         <Doc:NotAvailableBalance>"
                + "            <Doc:Quantity>"
                + "               <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "            </Doc:Quantity>"
                + "         </Doc:NotAvailableBalance>"
                + "         <Doc:SafekeepingPlace>"
                + "            <Doc:TypeAndIdentification>"
                + "               <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "               <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "            </Doc:TypeAndIdentification>"
                + "         </Doc:SafekeepingPlace>"
                + "         <Doc:BalanceAtSafekeepingPlace>"
                + "            <Doc:SafekeepingPlace>"
                + "               <Doc:TypeAndIdentification>"
                + "                  <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "                  <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "               </Doc:TypeAndIdentification>"
                + "            </Doc:SafekeepingPlace>"
                + "            <Doc:AggregateBalance>"
                + "               <Doc:ShortLongIndicator>SHOR</Doc:ShortLongIndicator>"
                + "               <Doc:Quantity>"
                + "                  <Doc:Quantity>"
                + "                     <Doc:Quantity>"
                + "                        <Doc:FaceAmount>0.0</Doc:FaceAmount>"
                + "                     </Doc:Quantity>"
                + "                  </Doc:Quantity>"
                + "               </Doc:Quantity>"
                + "            </Doc:AggregateBalance>"
                + "            <Doc:AvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:AvailableBalance>"
                + "            <Doc:NotAvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:NotAvailableBalance>"
                + "         </Doc:BalanceAtSafekeepingPlace>"
                + "         <Doc:BalanceAtSafekeepingPlace>"
                + "            <Doc:SafekeepingPlace>"
                + "               <Doc:TypeAndIdentification>"
                + "                  <Doc:SafekeepingPlaceType>NCSD</Doc:SafekeepingPlaceType>"
                + "                  <Doc:Identification>FRNYUS33</Doc:Identification>"
                + "               </Doc:TypeAndIdentification>"
                + "            </Doc:SafekeepingPlace>"
                + "            <Doc:AggregateBalance>"
                + "               <Doc:ShortLongIndicator>SHOR</Doc:ShortLongIndicator>"
                + "               <Doc:Quantity>"
                + "                  <Doc:Quantity>"
                + "                     <Doc:Quantity>"
                + "                        <Doc:FaceAmount>0.0</Doc:FaceAmount>"
                + "                     </Doc:Quantity>"
                + "                  </Doc:Quantity>"
                + "               </Doc:Quantity>"
                + "            </Doc:AggregateBalance>"
                + "            <Doc:AvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:AvailableBalance>"
                + "            <Doc:NotAvailableBalance>"
                + "               <Doc:Quantity>"
                + "                  <Doc:FaceAmount>990692.0</Doc:FaceAmount>"
                + "               </Doc:Quantity>"
                + "            </Doc:NotAvailableBalance>"
                + "         </Doc:BalanceAtSafekeepingPlace>"
                + "      </Doc:BalanceForAccount>"
                + "   </Doc:SecuritiesBalanceCustodyReport.002V03>"
                + "</Doc:Document>";

        final MxNode n = MxNode.parse(xml);
        assertEquals(
                "35732656.0",
                n.singlePathValue(
                        "/Document/SecuritiesBalanceCustodyReport.002V03/BalanceForAccount/AggregateBalance/Quantity/Quantity/OriginalAndCurrentFace/FaceAmount"));
    }

    @Test
    public void testParse03_attributes() {
        final String xml = "<FaceAmount Ccy='USD'>1234567.89</FaceAmount>";
        final MxNode doc = MxNode.parse(xml);
        assertEquals("1234567.89", doc.findFirstByName("FaceAmount").getValue());
        assertEquals("USD", doc.findFirstByName("FaceAmount").getAttribute("Ccy"));
    }

    @Test
    public void testParse04_ns() {
        final String xml = "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></AppHdr>";
        final MxNode doc = MxNode.parse(xml);
        assertEquals(
                "urn:iso:std:iso:20022:tech:xsd:head.001.001.01",
                doc.findFirstByName("AppHdr").getAttribute("xmlns"));
        assertNotNull(doc.findFirst("AppHdr/From"));
        assertNull(doc.findFirst("AppHdr/From").getAttribute("xmlns"));
    }

    @Test
    public void testFindFirst() {
        String xml = "<a></a>";
        MxNode doc = MxNode.parse(xml);
        assertNull(doc.singlePathValue("a"));

        xml = "<a>1</a>";
        doc = MxNode.parse(xml);
        assertEquals("1", doc.singlePathValue("a"));
    }

    @Test
    public void testFindFirstLevel2() {
        String xml = "<a><a>1</a></a>";
        MxNode doc = MxNode.parse(xml);
        assertEquals("1", doc.singlePathValue("a/a"));

        xml = "<a><b>2</b></a>";
        doc = MxNode.parse(xml);
        assertEquals("2", doc.singlePathValue("a/b"));
    }

    @Test
    public void testFindFirstWithChildren() {
        final String xml = "<a>" + "		<b>1</b>" + "		<c>2</c>" + "</a>";
        final MxNode doc = MxNode.parse(xml);
        assertNotNull(doc.singlePathValue("a/b"));
        assertNotNull(doc.singlePathValue("a/c"));
    }

    @Test
    public void testFindFirstAbsoluteAndRelativePath() {
        final String xml = "<a><b><c>1</c></b></a>";
        final MxNode doc = MxNode.parse(xml);
        /*
         * absolute
         */
        assertEquals("1", doc.singlePathValue("/a/b/c"));
        /*
         * relative from root
         */
        assertEquals("1", doc.singlePathValue("a/b/c"));
        /*
         * invalid relative
         */
        assertNull(doc.singlePathValue("b/c"));
        /*
         * invalid absolute
         */
        assertNull(doc.singlePathValue("/b/c"));
    }

    @Test
    public void testFindByName() {
        final String xml = "<a>1</a>";
        final MxNode doc = MxNode.parse(xml);
        assertNotNull(doc.findFirstByName("a"));
        assertEquals("1", doc.findFirstByName("a").getValue());
        assertNull(doc.findFirstByName("b"));
    }

    @Test
    public void testFindByNameLevel2() {
        final String xml = "<a><b>2</b><b>3</b></a>";
        final MxNode doc = MxNode.parse(xml);
        assertNotNull(doc.findFirstByName("a"));
        assertNotNull(doc.findFirstByName("b"));
        assertEquals("2", doc.findFirstByName("b").getValue());
    }

    @Test
    public void testFindByNameAndPath() {
        final String xml = "<a>" + "	<b>" + "		<c>" + "			<d>4</d>" + "		</c>" + "	</b>" + "</a>";
        final MxNode doc = MxNode.parse(xml);

        assertEquals("4", doc.singlePathValue("/a/b/c/d"));

        final MxNode b = doc.findFirstByName("b");
        assertNotNull(b);

        assertEquals("4", b.singlePathValue("b/c/d"));
    }

    @Test
    public void testReadSample() throws IOException {
        final String xml = Lib.readResource("mx_sample_document.xml");
        assertNotNull(xml);
        final MxNode doc = MxNode.parse(xml);
        assertNotNull(doc);
        doc.print();
        assertEquals("1", doc.singlePathValue("Document/GetAcct/MsgId/Id"));
        assertEquals("1", doc.singlePathValue("/Document/GetAcct/MsgId/Id"));
        assertEquals("1", doc.singlePathValue("Document/GetAcct/MsgId/Id/"));
        assertEquals("1", doc.singlePathValue("/Document/GetAcct/MsgId/Id/"));
        assertNull(doc.singlePathValue("/foobar"));
        assertNull(doc.singlePathValue("/foobar/1/2/3/4/5/6/7"));

        MxNode n = doc.findFirstByName("Id");
        assertNotNull(n);
        assertEquals("1", n.getValue());
        n = doc.findFirstByName("ID");
        assertNotNull(n);
        assertEquals("1", n.getValue());
    }

    @Test
    public void testPathApplicationHeader() throws IOException {
        final String xml = Lib.readResource("mx_sample_header.xml");
        assertNotNull(xml);
        final MxNode doc = MxNode.parse(xml);
        assertNotNull(doc);
        assertEquals("DN", doc.singlePathValue("AppHdr/From/Type"));
        assertEquals("DN", doc.singlePathValue("/AppHdr/From/Type"));
    }

    @Test
    public void createMxTest() {
        MxNode n = new MxNode(null, "Document");
        MxNode n1 = new MxNode(n, "FIToFICstmrCdtTrf");
        MxNode n2 = new MxNode(n1, "GrpHdr");
        new MxNode(n2, "MsgId").setValue("MSGID-0001");
        new MxNode(n2, "CreDtTm").setValue("2001-12-17T09:30:47Z");
        new MxNode(n2, "NbOfTxs").setValue("1");
        new MxNode(n2, "IntrBkSttlmDt").setValue("2012-01-25");
        // n.print();
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @Test
    public void testXxeDisabled() {
        String xml =
                "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>" + "<FaceAmount>&xxe;</FaceAmount>";
        final MxNode doc = MxNode.parse(xml);
        assertNull(doc);
    }

    @Test
    public void testRemoveEmptyElements() {
        final MxNode n = new MxNode(null, "root");
        new MxNode(n, "X").setValue("value"); // Add child with value
        assertEquals(1, n.getChildren().size());

        n.removeEmptyElements(); // Should not remove the child as it has value
        assertFalse(n.getChildren().isEmpty()); // Still has children
    }

    @Test
    public void testRemoveEmptyElements2() {
        final MxNode n = new MxNode(null, "root");
        MxNode x = new MxNode(n, "X");
        x.addAttribute("a", "attr-value"); // Add an attribute
        assertEquals(1, n.getChildren().size());

        n.removeEmptyElements(); // Should not remove node as it has an attribute
        assertFalse(n.getChildren().isEmpty());
    }

    @Test
    public void testRemoveEmptyElements3() {
        final MxNode n = new MxNode(null, "root");
        new MxNode(n, "X"); // Create child node with no value and no attributes
        assertEquals(1, n.getChildren().size());

        n.removeEmptyElements(); // Should remove the child as it's empty
        assertTrue(n.getChildren().isEmpty()); // No children left
    }

    @Test
    public void testRemoveEmptyElements4() {
        final MxNode n = new MxNode(null, "root");
        MxNode x = new MxNode(n, "X");
        new MxNode(x, "Y"); // Create an empty child under X

        n.removeEmptyElements(); // Should remove Y as it's empty
        assertEquals(1, n.getChildren().size()); // X should still exist
        assertTrue(n.getChildren().get(0).getChildren().isEmpty()); // X should have no children
    }

    @Test
    public void testRemoveEmptyElements5() {
        final MxNode n = new MxNode(null, "root");
        MxNode x = new MxNode(n, "X");
        new MxNode(x, "Y").setValue("y"); // Add child with value
        new MxNode(x, "Z").setValue(""); // Add child with empty value

        assertEquals(1, n.getChildren().size());
        assertEquals(2, x.getChildren().size());

        n.removeEmptyElements(); // Should remove Z as it's empty
        assertEquals(1, x.getChildren().size()); // Only Y should remain
    }
}
