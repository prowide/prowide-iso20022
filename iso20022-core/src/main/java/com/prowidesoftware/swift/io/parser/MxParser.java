/*
 * Copyright 2006-2021 Prowide
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
package com.prowidesoftware.swift.io.parser;

import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.MxNode;
import com.prowidesoftware.swift.model.mx.*;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeader;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV01;
import com.prowidesoftware.swift.utils.Lib;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Optional;
import java.util.logging.Level;

/**
 * This class is currently deprecated. The API provided is no longer useful or has been replaced by similar or moved
 * methods in: {@link AbstractMX}, {@link AppHdr}, {@link AppHdrParser}, {@link MxNode} or {@link MxParseUtils}
 *
 * @since 7.6
 * @deprecated see deprecation notes on each method
 */
@Deprecated
@ProwideDeprecated(phase2 = TargetYear.SRU2021)
public class MxParser {
    /**
     * @deprecated use {@link AppHdr#HEADER_LOCALNAME} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static final String HEADER_LOCALNAME = "AppHdr";
    /**
     * @since 7.8.4
     * @deprecated use {@link AbstractMX#DOCUMENT_LOCALNAME} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static final String DOCUMENT_LOCALNAME = "Document";
    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(MxParser.class.getName());
    private String buffer;

    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    private MxStructureInfo info = null;

    /**
     * Construct a parser for a file containing a single MX message
     *
     * @param file the file containing a single unit of a message
     * @throws IOException if an error occurs during the read of the file
     * @since 7.7
     */
    public MxParser(final File file) throws IOException {
        Validate.notNull(file);
        this.buffer = Lib.readFile(file);
    }

    /**
     * Construct a parser for a stream containing a single MX message
     *
     * @param stream non null stream containing a single unit of message
     */
    public MxParser(final InputStream stream) throws IOException {
        this.buffer = Lib.readStream(stream);
    }

    /**
     * Creates the parser initializing its content source from the given string.
     *
     * @since 7.7
     */
    public MxParser(final String message) {
        super();
        buffer = message;
    }

    /**
     * @deprecated use {@link AppHdrParser#parse(Element)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static BusinessHeader parseBusinessHeader(final Element e) {
        DOMImplementationLS lsImpl = (DOMImplementationLS) e.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false);
        String xml = serializer.writeToString(e);
        return (new MxParser(xml)).parseBusinessHeader();
    }

    /**
     * @since 9.0.1
     * @deprecated use {@link AppHdrParser#parse(Element)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static AppHdr parseAppHdr(final Element e) {
        return AppHdrParser.parse(e).orElse(null);
    }

    /**
     * @deprecated use {@link LegacyAppHdr#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static ApplicationHeader parseApplicationHeader(final MxNode tree) {
        return MxBusinessHeaderParser.parseApplicationHeader(tree);
    }

    /**
     * @deprecated use {@link BusinessAppHdrV01#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public static BusinessApplicationHeaderV01 parseBusinessApplicationHeaderV01(final MxNode tree) {
        return MxBusinessHeaderParser.parseBusinessApplicationHeaderV01(tree);
    }

    /**
     * @deprecated use {@link MxParseUtils#getBICFromDN(String)} instead
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    public static String getBICFromDN(final String dn) {
        return MxParseUtils.getBICFromDN(dn);
    }

    /**
     * @deprecated use {@link MxNode#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public MxNode parse() {
        return MxNode.parse(this.buffer);
    }

    /**
     * @deprecated use {@link AppHdrParser#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public BusinessHeader parseBusinessHeader() {
        Optional<AppHdr> appHdr = AppHdrParser.parse(this.buffer);
        if (appHdr.isPresent()) {
            return null;
        }
        // backward compatible implementation during the deprecation phase
        if (appHdr.get() instanceof LegacyAppHdr) {
            return new BusinessHeader((LegacyAppHdr) appHdr.get());
        } else if (appHdr.get() instanceof BusinessAppHdrV01) {
            return new BusinessHeader((BusinessAppHdrV01) appHdr.get());
        }
        // otherwise we return null, which would be the case for the deprecated implementation as well
        return null;
    }

    /**
     * @return parsed header or null if the content cannot be parsed or the header is not present in the XML
     * @since 9.0.1
     * @deprecated use {@link AppHdrParser#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public AppHdr parseAppHdr() {
        return AppHdrParser.parse(this.buffer).orElse(null);
    }

    /**
     * @deprecated use {@link LegacyAppHdr#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public ApplicationHeader parseApplicationHeader() {
        LegacyAppHdr legacyHdr = LegacyAppHdr.parse(this.buffer);
        ApplicationHeader result = new ApplicationHeader();
        result.setFrom(legacyHdr.getFrom());
        result.setTo(legacyHdr.getTo());
        result.setSvcName(legacyHdr.getSvcName());
        result.setMsgName(legacyHdr.getMsgName());
        result.setMsgRef(legacyHdr.getMsgRef());
        result.setCrDate(legacyHdr.getCrDate());
        result.setDup(legacyHdr.getDup());
        return result;
    }

    /**
     * @deprecated use {@link BusinessAppHdrV01#parse(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public BusinessApplicationHeaderV01 parseBusinessApplicationHeaderV01() {
        BusinessAppHdrV01 businessAppHdrV01 = BusinessAppHdrV01.parse(this.buffer);
        BusinessApplicationHeaderV01 result = new BusinessApplicationHeaderV01();
        result.setCharSet(businessAppHdrV01.getCharSet());
        result.setFr(businessAppHdrV01.getFr());
        result.setTo(businessAppHdrV01.getTo());
        result.setBizMsgIdr(businessAppHdrV01.getBizMsgIdr());
        result.setMsgDefIdr(businessAppHdrV01.getMsgDefIdr());
        result.setBizSvc(businessAppHdrV01.getBizSvc());
        result.setCreDt(businessAppHdrV01.getCreDt());
        result.setCpyDplct(businessAppHdrV01.getCpyDplct());
        result.setPssblDplct(businessAppHdrV01.isPssblDplct());
        result.setPrty(businessAppHdrV01.getPrty());
        result.setSgntr(businessAppHdrV01.getSgntr());
        result.setRltd(businessAppHdrV01.getRltd());
        return result;
    }

    /**
     * @return id with the detected MX message type or null if it cannot be determined.
     * @since 7.7
     * @deprecated use {@link MxParseUtils#identifyMessage(String)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public MxId detectMessage() {
        if (StringUtils.isBlank(this.buffer)) {
            log.log(Level.SEVERE, "cannot detect message from null or empty content");
            return null;
        }
        Optional<MxId> id = MxParseUtils.identifyMessage(this.buffer);
        return id.orElse(null);
    }

    /**
     * @since 7.8.4
     * @deprecated use {@link #analyzeMessage()} instead
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2021)
    public MxStructureInfo analizeMessage() {
        DeprecationUtils.phase3(this.getClass(), "analizeMessage", "use analyzeMessage instead");
        return analyzeMessage();
    }

    /**
     * Convenient API to get structure information from an MX message.
     * <p>This can be helpful when the actual content of an XML is unknown and
     * some preprocessing of the XML must be done in order to parse or
     * validate its content properly.
     * <p>The implementation is intended to be lightweight and efficient, based on {@link javax.xml.stream.XMLStreamReader}
     * <p>If the message contains more than one Document element, the first one will be picked. The same applies for
     * the header, only the first AppHdr will be picked
     *
     * @since 7.10.3
     * @deprecated the {@link AbstractMX#parse(String)} can be used to parse any unknown message. If you just want to
     * detect the message type you can also use the {@link MxParseUtils#identifyMessage(String)}
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public MxStructureInfo analyzeMessage() {
        if (this.info != null) {
            return this.info;
        }
        this.info = new MxStructureInfo();
        if (StringUtils.isBlank(this.buffer)) {
            log.log(Level.WARNING, "cannot analyze message from null or empty content");
            return this.info;
        }
        final javax.xml.stream.XMLInputFactory xif = SafeXmlUtils.inputFactory();
        try {
            final javax.xml.stream.XMLStreamReader reader = xif.createXMLStreamReader(new StringReader(this.buffer));
            boolean first = true;
            while (reader.hasNext()) {
                int event = reader.next();
                if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event) {
                    if (!this.info.containsDocument && reader.getLocalName().equals(AbstractMX.DOCUMENT_LOCALNAME)) {
                        this.info.containsDocument = true;
                        this.info.documentNamespace = readNamespace(reader);
                        this.info.documentPrefix = StringUtils.trimToNull(reader.getPrefix());
                    } else if (!this.info.containsHeader && reader.getLocalName().equals(AppHdr.HEADER_LOCALNAME)) {
                        this.info.containsHeader = true;
                        this.info.headerNamespace = readNamespace(reader);
                        this.info.headerPrefix = StringUtils.trimToNull(reader.getPrefix());
                    } else if (first) {
                        this.info.containsWrapper = true;
                    }
                    first = false;
                }
            }
        } catch (final Exception e) {
            log.log(Level.SEVERE, "error while analyzing message: " + e.getMessage());
            info.exception = e;
        }
        return this.info;
    }

    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    private String readNamespace(final javax.xml.stream.XMLStreamReader reader) {
        // iterate and return the namespace matching the element prefix
        if (reader.getNamespaceCount() > 0) {
            //log.finest("ELEMENT START: " + reader.getLocalName() + " , namespace count is: " + reader.getNamespaceCount());
            for (int nsIndex = 0; nsIndex < reader.getNamespaceCount(); nsIndex++) {
                final String nsPrefix = StringUtils.trimToNull(reader.getNamespacePrefix(nsIndex));
                final String elementPrefix = StringUtils.trimToNull(reader.getPrefix());
                if (StringUtils.equals(nsPrefix, elementPrefix)) {
                    // if prefix match or is not set in both the element and the namespace we return it as found namespace
                    return reader.getNamespaceURI(nsIndex);
                }
            }
        }
        return null;
    }

    /**
     * Helper API to strip Document portion of message XML.
     *
     * <p>This API is convenient when only the Document element of an MX message is needed and the wrapper/payload
     * structure is unknown.
     *
     * <p>This implementation is intended to be lightweight and efficient so it actually does a simple substring
     * operation on the XML using information provided by the result of {@link #analyzeMessage()}. The XML is not
     * converted into DOM on purpose because we want to strip the content event when the XML is not totally well-formed.
     *<
     * <p>If the message contains more than one Document element the expected result is as follows:
     * <ul>
     * 		<li>If the documents are nested (this can happen for example when an additional MX message is provided
     * 		within a supplementary data element within the main MX) then the outermost Document will be returned.</li>
     * 		<li>If the documents are not-nested (weird situation) the result might be not well-formed</li>
     * </ul>
     *
     * @return XML with Document element of the Mx message or null if message is blank or invalid
     * @since 7.8.4
     * @deprecated parse the message using {@link AbstractMX#parse(String)} instead, and then use any of the document
     * serializer {@link AbstractMX#document()} methods
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public String stripDocument() {
        analyzeMessage();
        if (this.info.containsDocument) {
            final String tag = this.info.getDocumentPrefix() != null ? this.info.getDocumentPrefix() + ":" + AbstractMX.DOCUMENT_LOCALNAME : AbstractMX.DOCUMENT_LOCALNAME;
            int beginIndex = this.buffer.indexOf("<" + tag);
            int endIndex = this.buffer.lastIndexOf("</" + tag);
            if (beginIndex >= 0 && endIndex >= 0) {
                return this.buffer.substring(beginIndex, endIndex) + "</" + tag + ">";
            }
        }
        return null;
    }

    /**
     * Helper API to strip AppHdr portion of message XML.
     *
     * <p>This API is convenient when only the header element of an MX message
     * is needed and the wrapper/payload structure is unknown.
     *
     * <p>To gather the header already parsed into objects see {@link #parseBusinessHeader()}
     *
     * <p>This implementation is intended to be lightweight and efficient so it actually
     * does a simple substring operation on the XML using information provided
     * by the result of {@link #analyzeMessage()}. The XML is not converted into DOM.
     * <br >
     * If the message contains more than one AppHdr element the expected result is as follows:
     * <ul>
     * <li>If the headers are not nested, the first one will be returned.</li>
     * <li>If the headers are nested (weird situation) the result might be not well-formed</li>
     * </ul>
     *
     * @return XML with AppHdr element of the Mx message or null if not found
     * @since 7.8.4
     * @deprecated parse the message using {@link AbstractMX#parse(String)} instead, and then use any of the header
     * serializer {@link AbstractMX#header()} methods
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public String stripHeader() {
        analyzeMessage();
        if (this.info.containsHeader()) {
            final String tag = this.info.getHeaderPrefix() != null ? this.info.getHeaderPrefix() + ":" + AppHdr.HEADER_LOCALNAME : AppHdr.HEADER_LOCALNAME;
            int beginIndex = this.buffer.indexOf("<" + tag);
            int endIndex = this.buffer.indexOf("</" + tag);
            if (beginIndex >= 0 && endIndex >= 0) {
                return this.buffer.substring(beginIndex, endIndex) + "</" + tag + ">";
            }
        }
        return null;
    }

    /**
     * Structure information from an MX message
     *
     * @since 7.8.4
     * @deprecated the {@link AbstractMX#parse(String)} can be used to parse any unknown message. If you just want to
     * detect the message type you can also use the {@link MxParseUtils#identifyMessage(String)}
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public class MxStructureInfo {
        private boolean containsWrapper = false;
        private boolean containsHeader = false;
        private boolean containsDocument = false;
        private String documentNamespace = null;
        private String documentPrefix = null;
        private String headerNamespace = null;
        private String headerPrefix = null;
        private Exception exception = null;

        public boolean containsWrapper() {
            return containsWrapper;
        }

        public boolean containsHeader() {
            return containsHeader;
        }

        public boolean containsDocument() {
            return containsDocument;
        }

        public String getDocumentNamespace() {
            return documentNamespace;
        }

        public String getDocumentPrefix() {
            return documentPrefix;
        }

        public String getHeaderNamespace() {
            return headerNamespace;
        }

        public String getHeaderPrefix() {
            return headerPrefix;
        }

        public Exception getException() {
            return exception;
        }

        /**
         * @return true if the message contains a header and it is a legacy SWIFT ahV10 header, false if it is not and
         * empty if the message has no header to check
         * @since 8.0.5
         */
        public Optional<Boolean> containsLegacyHeader() {
            if (containsHeader) {
                return Optional.of(StringUtils.contains(this.headerNamespace, "ahV10"));
            } else {
                return Optional.empty();
            }
        }

        @Override
        public String toString() {
            return "MxStructureInfo [containsWrapper=" + containsWrapper + ", containsHeader=" + containsHeader
                    + ", containsDocument=" + containsDocument + ", documentNamespace=" + documentNamespace
                    + ", documentPrefix=" + documentPrefix + ", headerNamespace=" + headerNamespace + ", headerPrefix="
                    + headerPrefix + "]";
        }
    }

}
