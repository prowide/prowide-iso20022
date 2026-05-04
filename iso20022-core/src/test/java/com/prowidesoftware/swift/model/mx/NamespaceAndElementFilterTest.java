/*
 * Copyright 2006-2026 Prowide
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

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.prowidesoftware.swift.utils.SafeXmlUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

class NamespaceAndElementFilterTest {

    /**
     * Regression test for PW-3202. When the element being propagated is a regular (non-xsys)
     * ISO 20022 Document wrapped in an SNL-like envelope that declares Sw/SwInt prefix mappings,
     * the filter must not replay those xsys prefix mappings on the downstream handler. The
     * Document body does not reference them, so replaying is unnecessary and in strict
     * SAX-to-StAX bridges can trigger spurious warnings or namespace-stack exceptions.
     */
    @Test
    void skipsXsysPrefixMappingReplayForNonXsysDocument() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<SwInt:DataPDU xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:Sw=\"urn:swift:snl:ns.Sw\">"
                + "  <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:seev.031.001.12\">"
                + "    <Body/>"
                + "  </Document>"
                + "</SwInt:DataPDU>";

        RecordingHandler handler = runFilter(xml, "Document");

        assertTrue(
                handler.prefixMappings.isEmpty(),
                "Expected no prefix mappings to be propagated for a non-xsys Document, got: " + handler.prefixMappings);
    }

    /**
     * Regression guard for GH-168 / PR #177. When the element being propagated is an xsys
     * Document, the filter must still replay the queued Sw/SwInt/SwGbl prefix mappings,
     * because the xsys Document body references them.
     */
    @Test
    void replaysXsysPrefixMappingsForXsysDocument() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<Envelope xmlns=\"urn:swift:xsd:envelope\""
                + "          xmlns:Sw=\"urn:swift:snl:ns.Sw\""
                + "          xmlns:SwInt=\"urn:swift:snl:ns.SwInt\""
                + "          xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\">"
                + "  <Doc:Document xmlns:Doc=\"urn:swift:xsd:xsys.003.001.01\"/>"
                + "</Envelope>";

        RecordingHandler handler = runFilter(xml, "Document");

        assertTrue(
                handler.prefixMappings.contains("Sw=urn:swift:snl:ns.Sw"),
                "Expected Sw prefix mapping to be replayed for xsys Document, got: " + handler.prefixMappings);
        assertTrue(
                handler.prefixMappings.contains("SwInt=urn:swift:snl:ns.SwInt"),
                "Expected SwInt prefix mapping to be replayed for xsys Document, got: " + handler.prefixMappings);
        assertTrue(
                handler.prefixMappings.contains("SwGbl=urn:swift:snl:ns.SwGbl"),
                "Expected SwGbl prefix mapping to be replayed for xsys Document, got: " + handler.prefixMappings);
    }

    private static RecordingHandler runFilter(String xml, String elementToPropagate) throws Exception {
        RecordingHandler handler = new RecordingHandler();
        NamespaceAndElementFilter filter = new NamespaceAndElementFilter(elementToPropagate);
        XMLReader parent = SafeXmlUtils.reader(true, null);
        filter.setParent(parent);
        filter.setContentHandler(handler);
        filter.parse(new InputSource(new StringReader(xml)));
        return handler;
    }

    private static class RecordingHandler extends DefaultHandler {
        final List<String> prefixMappings = new ArrayList<>();

        @Override
        public void startPrefixMapping(String prefix, String uri) {
            prefixMappings.add(prefix + "=" + uri);
        }
    }
}
