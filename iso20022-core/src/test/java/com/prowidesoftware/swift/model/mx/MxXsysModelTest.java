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

import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.sys.MxXsys01200101;
import com.prowidesoftware.swift.model.mx.sys.dic.DeliveryNotificationXsys01200101;
import com.prowidesoftware.swift.model.mx.sys.dic.FailedDeliveryNotificationMessageXsys01200101;
import com.prowidesoftware.swift.model.mx.sys.dic.SwIntRequestHeader;
import com.prowidesoftware.swift.utils.TestUtils;
import java.io.StringReader;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.junit.jupiter.api.Test;
import org.xmlunit.xpath.JAXPXPathEngine;

/**
 * Test to cover MX system message parse an create, using plain document and also document with SNL wrapper.
 * The test involves marshaling and unmarshaling with elements from SNL namespaces
 *
 * @since 7.9.3
 */
public class MxXsysModelTest {

    public static final String document = ""
            + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.012.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
            + "	<Doc:xsys.012.001.01>"
            + "		<Doc:DlvryNtfctn>"
            + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
            + "			<Sw:SnFRefType>InterAct</Sw:SnFRefType>"
            + "			<Sw:AcceptStatus>Failed</Sw:AcceptStatus>"
            + "			<Sw:AckSwiftTime>2010-05-04T15:33:12Z</Sw:AckSwiftTime>"
            + "			<Sw:AckDescription>Message delivery attempts exceeded system threshold</Sw:AckDescription>"
            + "			<Sw:AckInfo>SwRejectcode=SwGbl.MaxRetryExceeded</Sw:AckInfo>"
            + "			<SwInt:RequestHeader>"
            + "				<SwInt:Requestor>cn=requestor,o=aaaabebb,o=swift</SwInt:Requestor>"
            + "				<SwInt:Responder>cn=responder,o=bbbbus33,o=swift</SwInt:Responder>"
            + "				<SwInt:Service>mnop.cop</SwInt:Service>"
            + "				<SwInt:RequestType>pain.001.002.04</SwInt:RequestType>"
            + "				<SwInt:Priority>Normal</SwInt:Priority>"
            + "				<SwInt:RequestRef>Ref-12345</SwInt:RequestRef>"
            + "			</SwInt:RequestHeader>"
            + "		</Doc:DlvryNtfctn>"
            + "	</Doc:xsys.012.001.01>"
            + "</Doc:Document>";
    public static final String sample_document_only = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + document;
    public static final String sample_with_wrapper = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<SwInt:HandleRequest xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\">"
            + "	<SwInt:RequestHandle>"
            + "		<SwInt:RequestDescriptor>"
            + "			<SwInt:SwiftRequestRef>SNL00110-2010-05-04T15:32:59.3912.000004Z</SwInt:SwiftRequestRef>"
            + "			<SwInt:SwiftRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</SwInt:SwiftRef>"
            + "			<SwInt:NonRep>"
            + "				<SwInt:NRType>SVCOPT</SwInt:NRType>"
            + "			</SwInt:NonRep>"
            + "			<Sw:SnFOutputInfo>"
            + "				<Sw:SnFSessionId>aaaabebb_generic:p:000047</Sw:SnFSessionId>"
            + "				<Sw:SnFOutputSeq>2337176</Sw:SnFOutputSeq>"
            + "				<Sw:DeliveryTime>2010-05-04T15:33:14Z</Sw:DeliveryTime>"
            + "				<Sw:SnFInputTime>0105:2010-05-04T15:33:12</Sw:SnFInputTime>"
            + "			</Sw:SnFOutputInfo>"
            + "			<SwInt:MRRResult>"
            + "				<SwInt:SNLId>snl00110</SwInt:SNLId>"
            + "				<SwInt:SNLEP>spark_ap2</SwInt:SNLEP>"
            + "			</SwInt:MRRResult>"
            + "		</SwInt:RequestDescriptor>"
            + "		<SwInt:RequestHeader>"
            + "			<SwInt:Requestor>cn=system,o=swift,o=swift</SwInt:Requestor>"
            + "			<SwInt:Responder>cn=requestor,o=aaaabebb,o=swift</SwInt:Responder>"
            + "			<SwInt:Service>swift.snf.system</SwInt:Service>"
            + "			<SwInt:RequestType>xsys.012.001.01</SwInt:RequestType>"
            + "			<SwInt:Priority>Normal</SwInt:Priority>"
            + "		</SwInt:RequestHeader>"
            + "		<SwInt:RequestPayload>"
            + "			<Ah:AppHdr xmlns:Ah=\"urn:swift:xsd:$ahV10\">"
            + "				<Ah:MsgRef>2010-05-04T15:33:12Z</Ah:MsgRef>"
            + "				<Ah:CrDate>2010-05-04T15:33:12Z</Ah:CrDate>"
            + "			</Ah:AppHdr>"
            + document
            + "		</SwInt:RequestPayload>"
            + "	</SwInt:RequestHandle>"
            + "</SwInt:HandleRequest>";

    private void testXpath(String xml, String path, String expected) {
        Source source = new StreamSource(new StringReader(xml));
        assertEquals(expected, new JAXPXPathEngine().evaluate(TestUtils.patch(path), source));
    }

    @Test
    public void testParseDocumentOnly() {
        MxXsys01200101 mx = MxXsys01200101.parse(sample_document_only);
        assertNotNull(mx);
        assertNull(mx.getAppHdr());
        assertSampleDocument(mx);
    }

    private void assertSampleDocument(MxXsys01200101 mx) {
        /*
         * assert model
         */
        assertEquals(new MxId("xsys.012.001.01"), mx.getMxId());
        assertNotNull(mx.getXsys01200101());
        assertNotNull(mx.getXsys01200101().getDlvryNtfctn());
        assertNotNull(mx.getXsys01200101().getDlvryNtfctn().getSnFRef());
        assertEquals(
                "swi00001-2010-05-04T15:32:59.21582.11198379Z",
                mx.getXsys01200101().getDlvryNtfctn().getSnFRef());
        assertEquals("InterAct", mx.getXsys01200101().getDlvryNtfctn().getSnFRefType());
        assertEquals("Failed", mx.getXsys01200101().getDlvryNtfctn().getAcceptStatus());
        assertEquals(
                "2010-05-04T15:33:12Z", mx.getXsys01200101().getDlvryNtfctn().getAckSwiftTime());
        assertEquals(
                "Message delivery attempts exceeded system threshold",
                mx.getXsys01200101().getDlvryNtfctn().getAckDescription());
        assertEquals(
                "SwRejectcode=SwGbl.MaxRetryExceeded",
                mx.getXsys01200101().getDlvryNtfctn().getAckInfo());
        assertNotNull(mx.getXsys01200101().getDlvryNtfctn().getRequestHeader());
        assertEquals(
                "cn=requestor,o=aaaabebb,o=swift",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getRequestor());
        assertEquals(
                "cn=responder,o=bbbbus33,o=swift",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getResponder());
        assertEquals(
                "mnop.cop",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getService());
        assertEquals(
                "pain.001.002.04",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getRequestType());
        assertEquals(
                "Normal",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getPriority());
        assertEquals(
                "Ref-12345",
                mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().getRequestRef());
        /*
         * assert serialized XML
         */
        String xml = mx.document();
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/SnFRef", "swi00001-2010-05-04T15:32:59.21582.11198379Z");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/SnFRefType", "InterAct");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/AcceptStatus", "Failed");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/AckSwiftTime", "2010-05-04T15:33:12Z");
        testXpath(
                xml,
                "/Document/xsys.012.001.01/DlvryNtfctn/AckDescription",
                "Message delivery attempts exceeded system threshold");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/AckInfo", "SwRejectcode=SwGbl.MaxRetryExceeded");
        testXpath(
                xml,
                "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/Requestor",
                "cn=requestor,o=aaaabebb,o=swift");
        testXpath(
                xml,
                "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/Responder",
                "cn=responder,o=bbbbus33,o=swift");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/Service", "mnop.cop");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/RequestType", "pain.001.002.04");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/Priority", "Normal");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/RequestRef", "Ref-12345");
    }

    @Test
    public void testParseDocumentWithWrapper() {
        MxXsys01200101 mx = MxXsys01200101.parse(sample_with_wrapper);
        assertNotNull(mx);
        assertNotNull(mx.getAppHdr());
        assertSampleDocument(mx);
    }

    @Test
    public void testCreate() {
        MxXsys01200101 mx = new MxXsys01200101();
        mx.setXsys01200101(new FailedDeliveryNotificationMessageXsys01200101());
        mx.getXsys01200101().setDlvryNtfctn(new DeliveryNotificationXsys01200101());
        mx.getXsys01200101().getDlvryNtfctn().setSnFRef("ref");
        mx.getXsys01200101().getDlvryNtfctn().setSnFRefType("InterAct");
        mx.getXsys01200101().getDlvryNtfctn().setAcceptStatus("Failed");
        mx.getXsys01200101().getDlvryNtfctn().setRequestHeader(new SwIntRequestHeader());
        mx.getXsys01200101().getDlvryNtfctn().getRequestHeader().setPriority("Normal");
        final String xml = mx.message();
        // System.out.println(xml);
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/SnFRef", "ref");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/SnFRefType", "InterAct");
        testXpath(xml, "/Document/xsys.012.001.01/DlvryNtfctn/RequestHeader/Priority", "Normal");
        // TODO assert for prefixes and namespaces
    }

    @Test
    void testMetadataExtractor() {
        MxSwiftMessage mx = new MxSwiftMessage(document);
        assertEquals("AAAABEBBXXX", mx.getSender());
        assertEquals("BBBBUS33XXX", mx.getReceiver());
    }

    @Test
    void testMetadataExtractorNotRequestor() {
        String documentNoRequestor = ""
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.012.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "	<Doc:xsys.012.001.01>"
                + "		<Doc:DlvryNtfctn>"
                + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
                + "			<Sw:SnFRefType>InterAct</Sw:SnFRefType>"
                + "			<Sw:AcceptStatus>Failed</Sw:AcceptStatus>"
                + "			<Sw:AckSwiftTime>2010-05-04T15:33:12Z</Sw:AckSwiftTime>"
                + "			<Sw:AckDescription>Message delivery attempts exceeded system threshold</Sw:AckDescription>"
                + "			<Sw:AckInfo>SwRejectcode=SwGbl.MaxRetryExceeded</Sw:AckInfo>"
                + "			<SwInt:RequestHeader>"
                + "				<SwInt:Responder>cn=responder,o=bbbbus33,o=swift</SwInt:Responder>"
                + "				<SwInt:Service>mnop.cop</SwInt:Service>"
                + "				<SwInt:RequestType>pain.001.002.04</SwInt:RequestType>"
                + "				<SwInt:Priority>Normal</SwInt:Priority>"
                + "				<SwInt:RequestRef>Ref-12345</SwInt:RequestRef>"
                + "			</SwInt:RequestHeader>"
                + "		</Doc:DlvryNtfctn>"
                + "	</Doc:xsys.012.001.01>"
                + "</Doc:Document>";
        MxSwiftMessage mx = new MxSwiftMessage(documentNoRequestor);
        assertNull(mx.getSender());
        assertEquals("BBBBUS33XXX", mx.getReceiver());
    }

    @Test
    void testMetadataExtractorEmptyResponder() {
        String documentEmptyResponder = ""
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.012.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "	<Doc:xsys.012.001.01>"
                + "		<Doc:DlvryNtfctn>"
                + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
                + "			<Sw:SnFRefType>InterAct</Sw:SnFRefType>"
                + "			<Sw:AcceptStatus>Failed</Sw:AcceptStatus>"
                + "			<Sw:AckSwiftTime>2010-05-04T15:33:12Z</Sw:AckSwiftTime>"
                + "			<Sw:AckDescription>Message delivery attempts exceeded system threshold</Sw:AckDescription>"
                + "			<Sw:AckInfo>SwRejectcode=SwGbl.MaxRetryExceeded</Sw:AckInfo>"
                + "			<SwInt:RequestHeader>"
                + "				<SwInt:Requestor>cn=requestor,o=aaaabebb,o=swift</SwInt:Requestor>"
                + "				<SwInt:Responder></SwInt:Responder>"
                + "				<SwInt:Service>mnop.cop</SwInt:Service>"
                + "				<SwInt:RequestType>pain.001.002.04</SwInt:RequestType>"
                + "				<SwInt:Priority>Normal</SwInt:Priority>"
                + "				<SwInt:RequestRef>Ref-12345</SwInt:RequestRef>"
                + "			</SwInt:RequestHeader>"
                + "		</Doc:DlvryNtfctn>"
                + "	</Doc:xsys.012.001.01>"
                + "</Doc:Document>";
        MxSwiftMessage mx = new MxSwiftMessage(documentEmptyResponder);
        assertEquals("AAAABEBBXXX", mx.getSender());
        assertNull(mx.getReceiver());
    }

    @Test
    void testMetadataExtractorEmptyRequestHeader() {
        String documentEmptyRequestHeader = ""
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.012.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "	<Doc:xsys.012.001.01>"
                + "		<Doc:DlvryNtfctn>"
                + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
                + "			<Sw:SnFRefType>InterAct</Sw:SnFRefType>"
                + "			<Sw:AcceptStatus>Failed</Sw:AcceptStatus>"
                + "			<Sw:AckSwiftTime>2010-05-04T15:33:12Z</Sw:AckSwiftTime>"
                + "			<Sw:AckDescription>Message delivery attempts exceeded system threshold</Sw:AckDescription>"
                + "			<Sw:AckInfo>SwRejectcode=SwGbl.MaxRetryExceeded</Sw:AckInfo>"
                + "			<SwInt:RequestHeader>"
                + "			</SwInt:RequestHeader>"
                + "		</Doc:DlvryNtfctn>"
                + "	</Doc:xsys.012.001.01>"
                + "</Doc:Document>";
        MxSwiftMessage mx = new MxSwiftMessage(documentEmptyRequestHeader);
        assertNull(mx.getSender());
        assertNull(mx.getReceiver());
    }

    @Test
    void testMetadataExtractorNoRequestHeader() {
        String documentNoRequestHeader = ""
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.012.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "	<Doc:xsys.012.001.01>"
                + "		<Doc:DlvryNtfctn>"
                + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
                + "			<Sw:SnFRefType>InterAct</Sw:SnFRefType>"
                + "			<Sw:AcceptStatus>Failed</Sw:AcceptStatus>"
                + "			<Sw:AckSwiftTime>2010-05-04T15:33:12Z</Sw:AckSwiftTime>"
                + "			<Sw:AckDescription>Message delivery attempts exceeded system threshold</Sw:AckDescription>"
                + "			<Sw:AckInfo>SwRejectcode=SwGbl.MaxRetryExceeded</Sw:AckInfo>"
                + "		</Doc:DlvryNtfctn>"
                + "	</Doc:xsys.012.001.01>"
                + "</Doc:Document>";
        MxSwiftMessage mx = new MxSwiftMessage(documentNoRequestHeader);
        assertNull(mx.getSender());
        assertNull(mx.getReceiver());
    }

    /**
     * Test case for GitHub issue #168: Parsing error in MxXsys003.001.01 when AppHdr comes before Document
     * https://github.com/prowide/prowide-iso20022/issues/168
     */
    @Test
    void testParseXsys003WithAppHdrBeforeDocument() {
        String document = ""
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.003.001.01\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "	<Doc:xsys.003.001.01>"
                + "		<Doc:AuthstnRfslNtfctn>"
                + "			<Sw:SnFRef>swi00001-2010-05-04T15:32:59.21582.11198379Z</Sw:SnFRef>"
                + "			<Sw:SnFRef>InterAct</Sw:SnFRef>"
                + "			<SwInt:RequestHeader>"
                + "				<SwInt:Requestor>cn=requestor,o=aaaabebb,o=swift</SwInt:Requestor>"
                + "				<SwInt:Responder>cn=responder,o=bbbbus33,o=swift</SwInt:Responder>"
                + "				<SwInt:Service>mnop.cop</SwInt:Service>"
                + "				<SwInt:RequestType>pain.001.002.04</SwInt:RequestType>"
                + "				<SwInt:Priority>Normal</SwInt:Priority>"
                + "				<SwInt:RequestRef>Ref-12345</SwInt:RequestRef>"
                + "			</SwInt:RequestHeader>"
                + "         <Sw:ThirdPartyRefusalReason>"
                + "<Sw:Cd>hhe</Sw:Cd><Sw:TPInfo>hreehud</Sw:TPInfo>"
                + " </Sw:ThirdPartyRefusalReason>"
                + "		</Doc:AuthstnRfslNtfctn>"
                + "	</Doc:xsys.003.001.01>"
                + "</Doc:Document>";

        String appHdr = "<Ah:AppHdr xmlns:Ah=\"urn:swift:xsd:$ahV10\">"
                + "				<Ah:MsgRef>2010-05-04T15:33:12Z</Ah:MsgRef>"
                + "				<Ah:CrDate>2010-05-04T15:33:12Z</Ah:CrDate>"
                + "			</Ah:AppHdr>";

        // Test with AppHdr BEFORE Document (correct order, but currently fails)
        String xmlAppHdrBeforeDocument =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Envelope xmlns=\"urn:swift:xsd:envelope\">" + appHdr
                        + document + "</Envelope>";

        // Test with AppHdr AFTER Document (incorrect order, but currently works as workaround)
        String xmlAppHdrAfterDocument =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Envelope xmlns=\"urn:swift:xsd:envelope\">" + document
                        + appHdr + "</Envelope>";

        // Test without AppHdr (currently works)
        String xmlDocumentOnly = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Envelope xmlns=\"urn:swift:xsd:envelope\">"
                + document + "</Envelope>";

        // This should work but currently throws "negative size array" exception
        AbstractMX mx1 = AbstractMX.parse(xmlAppHdrBeforeDocument);
        assertNotNull(mx1, "Should parse successfully when AppHdr is before Document");
        assertNotNull(mx1.getAppHdr(), "AppHdr should be parsed");

        // This works as a workaround (but violates SWIFT standards)
        AbstractMX mx2 = AbstractMX.parse(xmlAppHdrAfterDocument);
        assertNotNull(mx2, "Should parse when AppHdr is after Document");
        assertNotNull(mx2.getAppHdr(), "AppHdr should be parsed");

        // This works (no AppHdr)
        AbstractMX mx3 = AbstractMX.parse(xmlDocumentOnly);
        assertNotNull(mx3, "Should parse when no AppHdr is present");
        assertNull(mx3.getAppHdr(), "AppHdr should be null");
    }
}
