/*
 * Copyright 2006-2020 Prowide
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.prowidesoftware.swift.utils.Lib;

public class NamespaceReaderTest {

    @Test
    public void testFindNamespaceSample() throws IOException {
        final String xml = Lib.readResource("mx_sample_request_wrapper.xml");

        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:$ahV10", namespace.get());
    }

    @Test
    public void testFindNamespace() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>"
                + "</message>";

        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", namespace.get());
    }

    @Test
    public void testFindDocumentNamespace_01() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindDocumentNamespace_02() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Foo:Document xmlns:Foo=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindDocumentNamespace_03() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"></Doc:Document>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindDocumentNamespace_04() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Document xmlns=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindDocumentNamespace_05() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindDocumentNamespace_06() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\"></Doc:Document>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:swift.eni$camt.003.001.04", namespace.get());

        assertFalse(NamespaceReader.findAppHdrNamespace(xml).isPresent());
    }

    @Test
    public void testFindAppHdrNamespace_01() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></AppHdr>";
        Optional<String> namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", namespace.get());

        assertFalse(NamespaceReader.findDocumentNamespace(xml).isPresent());
    }

    @Test
    public void testFindAppHdrNamespace_02() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<h:AppHdr xmlns:h=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\"><From></From></h:AppHdr>";
        Optional<String> namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", namespace.get());

        assertFalse(NamespaceReader.findDocumentNamespace(xml).isPresent());
    }

    @Test
    public void testInvalidEndElementXml() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></foo>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());
    }

    @Test
    public void testMissingElements() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertFalse(namespace.isPresent());

        namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertFalse(namespace.isPresent());
    }

    @Test
    public void testMissingPrefix() {
        final String xml ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<message>"
                // missing prefix in element on purpose
                + "<AppHdr xmlns:h=\"urn:swift:xsd:$ahV10\"><From></From></AppHdr>"
                + "<Doc:Document xmlns:Doc=\"urn:swift:xsd:camt.003.001.04\"></Doc:Document>"
                + "</message>";

        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:camt.003.001.04", namespace.get());

        namespace = NamespaceReader.findAppHdrNamespace(xml);
        assertFalse(namespace.isPresent());
    }

    /**
     * Test that external entities feature is disabled in the XML parsing to avoid XXE (external entity injection)
     */
    @Test
    public void testXxeDisabledInAnalyzeMessage() {
        final String xml = "<!DOCTYPE foo [ <!ENTITY xxe SYSTEM \"file:///etc/passwd\" >]>"+
                "<Doc:Document xmlns:Doc=\"urn:swift:xsd:swift.eni$camt.003.001.04\">&xxe;</Doc:Document>";
        Optional<String> namespace = NamespaceReader.findDocumentNamespace(xml);
        assertTrue(namespace.isPresent());
        assertEquals("urn:swift:xsd:swift.eni$camt.003.001.04", namespace.get());
    }

}
