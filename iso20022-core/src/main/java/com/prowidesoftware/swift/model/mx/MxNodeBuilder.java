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

import com.prowidesoftware.swift.model.MxNode;
import com.prowidesoftware.swift.model.MxNodeContentHandler;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.AttributesImpl;

/**
 * Builds the generic {@link MxNode} tree of a message straight from its JAXB model, marshalling into the same
 * content handler that {@link MxNode#parse(String)} uses, so the tree never goes through an XML string and a second
 * SAX parse. The resulting tree canonicalizes exactly as the one parsed from the serialized message.
 *
 * <p>Used by {@link DefaultMxMetadataStrategy} for the checksums and the metadata lookups. When a
 * {@link MxMetadataScope} is open, the trees are built once per message and reused.
 *
 * @since 10.4.1
 */
final class MxNodeBuilder {
    private static final Logger log = Logger.getLogger(MxNodeBuilder.class.getName());

    private MxNodeBuilder() {}

    /**
     * Tree of the message Document, equivalent to {@code MxNode.parse(mx.document())}; reused within an open
     * {@link MxMetadataScope}.
     *
     * @return the Document node or null if the model cannot be marshalled
     */
    static MxNode documentNode(final AbstractMX mx) {
        final MxMetadataScope scope = MxMetadataScope.current();
        return scope != null ? scope.documentNode(mx, MxNodeBuilder::buildDocumentNode) : buildDocumentNode(mx);
    }

    /**
     * Canonical form of the complete message, equivalent to {@code MxNode.parse(mx.message()).toCanonicalString()}:
     * when the message has a header, a {@code RequestPayload} root holds the header and the Document, otherwise it
     * is the Document alone. Composed from the header and Document trees, so the Document tree is shared with
     * {@link #documentNode(AbstractMX)} within an open {@link MxMetadataScope}.
     *
     * @return the canonical string or null if the model cannot be marshalled
     */
    static String messageCanonicalString(final AbstractMX mx) {
        final MxNode document = documentNode(mx);
        if (document == null) {
            return null;
        }
        final MxMetadataScope scope = MxMetadataScope.current();
        final String header = scope != null
                ? scope.headerCanonical(mx, MxNodeBuilder::buildHeaderCanonical)
                : buildHeaderCanonical(mx);
        if (header == null) {
            // same shape as message(): without a (serializable) header there is no envelope
            return document.toCanonicalString();
        }
        final String envelope = EnvelopeType.CUSTOM.rootElement();
        return "<" + envelope + ">" + header + document.toCanonicalString() + "</" + envelope + ">";
    }

    /**
     * Tree of the complete message, equivalent to {@code MxNode.parse(mx.message())}, built in one pass. The header
     * is small and is fed from its XML, so any {@link AppHdr} implementation is supported.
     *
     * @return the root node or null if the model cannot be marshalled
     */
    static MxNode messageNode(final AbstractMX mx) {
        final AppHdr appHdr = mx.getAppHdr();
        final String headerXml = appHdr != null ? appHdr.xml() : null;
        if (headerXml == null) {
            return buildDocumentNode(mx);
        }
        final MxNodeContentHandler handler = new MxNodeContentHandler();
        final ContentHandler fragment = new NormalizingHandler(handler);
        try {
            final String envelope = EnvelopeType.CUSTOM.rootElement();
            handler.startDocument();
            handler.startElement("", envelope, envelope, new AttributesImpl());
            parseInto(headerXml, fragment);
            marshalDocument(mx, fragment);
            handler.endElement("", envelope, envelope);
            handler.endDocument();
            return handler.getRootNode();
        } catch (Exception e) {
            log.log(Level.FINE, "Could not build the node tree from the model: " + e);
            return null;
        }
    }

    private static MxNode buildDocumentNode(final AbstractMX mx) {
        final MxNodeContentHandler handler = new MxNodeContentHandler();
        try {
            handler.startDocument();
            marshalDocument(mx, new NormalizingHandler(handler));
            handler.endDocument();
            return handler.getRootNode();
        } catch (Exception e) {
            log.log(Level.FINE, "Could not build the node tree from the model: " + e);
            return null;
        }
    }

    /**
     * Canonical form of the header tree, or null when the message has no header or it cannot be serialized.
     */
    private static String buildHeaderCanonical(final AbstractMX mx) {
        final AppHdr appHdr = mx.getAppHdr();
        final String headerXml = appHdr != null ? appHdr.xml() : null;
        if (headerXml == null) {
            return null;
        }
        final MxNodeContentHandler handler = new MxNodeContentHandler();
        try {
            handler.startDocument();
            parseInto(headerXml, new NormalizingHandler(handler));
            handler.endDocument();
            final MxNode header = handler.getRootNode();
            return header != null ? header.toCanonicalString() : null;
        } catch (Exception e) {
            log.log(Level.FINE, "Could not build the node tree of the header: " + e);
            return null;
        }
    }

    private static void parseInto(final String xml, final ContentHandler handler) throws Exception {
        final XMLReader reader = SafeXmlUtils.reader(true, null);
        reader.setContentHandler(handler);
        reader.parse(new InputSource(new StringReader(xml)));
    }

    /**
     * Marshals the Document with the same context, adapters and root element name as {@link AbstractMX#document()}.
     */
    private static void marshalDocument(final AbstractMX mx, final ContentHandler handler) throws Exception {
        final MxWriteParams params = new MxWriteParams(new MxWriteConfiguration());
        final JAXBContext context = JaxbContextLoader.INSTANCE.get(mx);
        @SuppressWarnings({"unchecked", "rawtypes"})
        final JAXBElement<?> element = new JAXBElement(new QName("Document"), mx.getClass(), null, mx);
        final Marshaller marshaller = MxWriteUtils.createMarshaller(context, params);
        marshaller.marshal(element, handler);
    }

    /**
     * Forwards the events of a fragment to the tree handler, dropping the document start and end that both the
     * marshaller and the parser emit, so several fragments can be nested under one root.
     *
     * <p>It also applies the normalization an XML parser applies when reading the serialized message, since the
     * model keeps the characters as they are: line ends in text (CR and CRLF become LF) and whitespace in attribute
     * values (each of CR, LF, TAB becomes a space). Already normalized input is unchanged.
     */
    private static final class NormalizingHandler implements ContentHandler {
        private final ContentHandler target;

        /** a CR at the end of the previous chunk, a following LF belongs to it */
        private boolean pendingCr;

        NormalizingHandler(ContentHandler target) {
            this.target = target;
        }

        @Override
        public void setDocumentLocator(Locator locator) {}

        @Override
        public void startDocument() {}

        @Override
        public void endDocument() {}

        @Override
        public void startPrefixMapping(String prefix, String uri) throws SAXException {
            target.startPrefixMapping(prefix, uri);
        }

        @Override
        public void endPrefixMapping(String prefix) throws SAXException {
            target.endPrefixMapping(prefix);
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
            pendingCr = false;
            target.startElement(uri, localName, qName, normalizedAttributes(atts));
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            pendingCr = false;
            target.endElement(uri, localName, qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (length == 0) {
                return;
            }
            final boolean skipLeadingLf = pendingCr && ch[start] == '\n';
            pendingCr = ch[start + length - 1] == '\r';
            boolean hasCr = false;
            for (int i = start; i < start + length; i++) {
                if (ch[i] == '\r') {
                    hasCr = true;
                    break;
                }
            }
            if (!hasCr && !skipLeadingLf) {
                // the usual case: nothing to normalize, forward as is
                target.characters(ch, start, length);
                return;
            }
            final StringBuilder sb = new StringBuilder(length);
            boolean previousCr = false;
            for (int i = skipLeadingLf ? start + 1 : start; i < start + length; i++) {
                final char c = ch[i];
                if (c == '\r') {
                    sb.append('\n');
                } else if (c != '\n' || !previousCr) {
                    sb.append(c);
                }
                previousCr = c == '\r';
            }
            if (sb.length() > 0) {
                target.characters(sb.toString().toCharArray(), 0, sb.length());
            }
        }

        private static Attributes normalizedAttributes(Attributes atts) {
            if (atts == null) {
                return null;
            }
            AttributesImpl copy = null;
            for (int i = 0; i < atts.getLength(); i++) {
                final String value = atts.getValue(i);
                if (value != null
                        && (value.indexOf('\r') >= 0 || value.indexOf('\n') >= 0 || value.indexOf('\t') >= 0)) {
                    if (copy == null) {
                        copy = new AttributesImpl(atts);
                    }
                    copy.setValue(
                            i,
                            value.replace("\r\n", " ")
                                    .replace('\r', ' ')
                                    .replace('\n', ' ')
                                    .replace('\t', ' '));
                }
            }
            return copy != null ? copy : atts;
        }

        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
            target.ignorableWhitespace(ch, start, length);
        }

        @Override
        public void processingInstruction(String pi, String data) throws SAXException {
            target.processingInstruction(pi, data);
        }

        @Override
        public void skippedEntity(String name) throws SAXException {
            target.skippedEntity(name);
        }
    }
}
