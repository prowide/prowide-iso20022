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

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 * Content handler used by {@link MxNode} to build the generic node tree from SAX events.
 *
 * <p>Non Namespace Aware. The namespace uri, if present, is stored as attribute named "xmlns" in the root node.
 *
 * <p>Internal class: public since 10.4.1 so the model package can marshal a JAXB object straight into a node tree,
 * without an intermediate XML string. It is not part of the public API contract.
 */
public final class MxNodeContentHandler implements org.xml.sax.ContentHandler {
    private static final transient Logger log = Logger.getLogger(MxNodeContentHandler.class.getName());

    private MxNode currentNode;
    private MxNode rootNode;

    /** Text of the current element received so far; the parser may deliver it in several chunks */
    private final StringBuilder text = new StringBuilder();

    /**
     * @return the root of the tree built so far, available once the root element has ended
     */
    public MxNode getRootNode() {
        return this.rootNode;
    }

    public void setDocumentLocator(final org.xml.sax.Locator locator) {}

    public void startDocument() throws org.xml.sax.SAXException {
        this.currentNode = null;
    }

    public void endDocument() throws org.xml.sax.SAXException {}

    public void startPrefixMapping(final String prefix, final String uri) throws org.xml.sax.SAXException {}

    public void endPrefixMapping(final String prefix) throws org.xml.sax.SAXException {}

    public void startElement(
            final String uri, final String localName, final String qName, final org.xml.sax.Attributes atts)
            throws org.xml.sax.SAXException {
        if (log.isLoggable(Level.FINEST)) {
            log.finest("uri: " + uri + "\nlocalName: " + localName + "\nqName: " + qName
                    + (atts == null ? "" : "\natts(" + atts.getLength() + "): ..."));
        }
        flushText();
        final MxNode node = new MxNode(currentNode, localName);
        if (atts != null) {
            for (int i = 0; i < atts.getLength(); i++) {
                node.addAttribute(atts.getLocalName(i), atts.getValue(i));
            }
        }
        /*
         * set uri as xmlns attribute for the first node in namespace
         */
        if (uri != null
                && (node.getParent() == null
                        || !StringUtils.equals(node.getParent().getAttribute("xmlns"), uri))) {
            node.addAttribute("xmlns", uri);
        }
        currentNode = node;
    }

    public void endElement(final String uri, final String localName, final String qName)
            throws org.xml.sax.SAXException {
        log.finest("end: " + localName);
        flushText();
        if (currentNode.getParent() == null) {
            rootNode = currentNode;
        }
        // shouln't overlap
        // TODO merge review
        currentNode = currentNode.getParent();
    }

    public void characters(final char[] ch, final int start, final int length) throws org.xml.sax.SAXException {
        // SAX delivers the text of an element in as many chunks as it likes (around entity references and CDATA
        // sections, or at buffer boundaries), so the chunks are accumulated and set on the node when the element
        // ends or a child element starts
        text.append(ch, start, length);
    }

    /**
     * Appends the accumulated text to the current node value, so text split around child elements is kept whole.
     */
    private void flushText() {
        if (text.length() > 0 && currentNode != null) {
            final String previous = currentNode.getValue();
            currentNode.setValue(previous == null ? text.toString() : previous + text);
        }
        text.setLength(0);
    }

    public void ignorableWhitespace(final char[] ch, final int start, final int length)
            throws org.xml.sax.SAXException {}

    public void processingInstruction(final String target, final String data) throws org.xml.sax.SAXException {
        /*
         *  2015.03 miguel
         *  seria muy intersante soportar custom processing instructions aca
         */
    }

    public void skippedEntity(final String name) throws org.xml.sax.SAXException {
        log.finer("skippedEntity: " + name);
    }
}
