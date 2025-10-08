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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prowidesoftware.JsonSerializable;
import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.AbstractMessage;
import com.prowidesoftware.swift.model.MessageStandardType;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.utils.Lib;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 * Base class for specific MX messages.<br>
 * <p>
 * IMPORTANT: An MX message is conformed by a set of optional headers and a message payload or document with the actual
 * specific MX message. The name of the envelope element that binds a Header to the message to which it applies is
 * <b>implementation/network specific</b> and not part of the scope of this model.
 *
 * <p>This class provides the base container model for MX messages including an attribute for the header. Further it
 * supports both versions for the header; the SWIFT Application Header (legacy) and the ISO Business Application Header.
 *
 * <p>Serialization of this model into XML text can be done for the with or without the header portion. When the header
 * is set and included into the serialization, the container root element must be provided.
 *
 * @see AbstractMT
 * @since 7.6
 */
public abstract class AbstractMX extends AbstractMessage implements JsonSerializable {
    public static final String DOCUMENT_LOCALNAME = "Document";
    private static final Logger log = Logger.getLogger(AbstractMX.class.getName());
    /**
     * @deprecated the default root element for the custom envelope is now defined in {@link EnvelopeType#CUSTOM}
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2025)
    public static String DEFAULT_ROOT_ELEMENT = "RequestPayload";

    /**
     * Header portion of the message payload, common to all specific MX subclasses.
     * This information is required before opening the actual message to process the content properly.
     *
     * @since 7.7 original field using BusinessHeader class
     * @since 9.0.1 changed to interface AppHdr
     */
    private AppHdr appHdr;

    protected AbstractMX() {
        super(MessageStandardType.MX);
        // prevent construction
    }

    protected AbstractMX(final AppHdr appHdr) {
        super(MessageStandardType.MX);
        this.appHdr = appHdr;
    }

    /**
     * Parses the XML string containing the Document and optional AppHdr into a specific instance of MX message object.
     * The message and header types and version is auto-detected.
     *
     * <p>The unmarshaller uses the default type adapters. For more parse options use {@link #parse(String, MxId, MxReadConfiguration)}.
     *
     * @param xml the XML content to parse
     * @return parsed message or null if string content could not be parsed into an Mx
     * @since 9.0.1
     */
    public static AbstractMX parse(final String xml) {
        return MxReadImpl.parse(xml, null, new MxReadParams());
    }

    /**
     * Parses the XML string containing the Document and optional AppHdr into a specific instance of MX message object.
     * The header version, if present, is auto-detected from its namespace.
     *
     * <p>If the string is empty, does not contain an MX document, the message type cannot be detected or an error
     * occur reading and parsing the message content; this method returns null.
     *
     * <p>The implementation detects the message type and uses reflection to call the parser in the specific subclass.
     *
     * <p>The unmarshaller uses the default type adapters. For more parse options use {@link #parse(String, MxId, MxReadConfiguration)}.
     *
     * @param xml string a string containing the Document of an MX message in XML format
     * @param id  optional parameter to indicate the specific MX type to create; auto detected from namespace if null.
     * @return parsed message or null if string content could not be parsed into an Mx
     * @since 7.8.4
     */
    public static AbstractMX parse(final String xml, MxId id) {
        return MxReadImpl.parse(xml, id, new MxReadParams());
    }

    /**
     * @deprecated use Lib.readFile(file) and any parse from String method
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2025)
    public static AbstractMX parse(final File file, MxId id) throws IOException {
        DeprecationUtils.phase3(
                AbstractMX.class, "parse(File, MxId)", "Use Lib.readFile(file) and any parse from String method");
        return MxReadImpl.parse(Lib.readFile(file), id, new MxReadParams());
    }

    /**
     * Parses the XML Element into a specific MX object.
     * The Mx to create is detected from the namespace.
     *
     * @param e content to parse
     * @return specific Mx instance, for example, MxCamt0010101; or null if XML cannot be parsed or specific Mx cannot be detected
     * @since 9.0
     */
    public static AbstractMX parse(final Element e) {
        final String prefix = e.getPrefix();
        if (prefix != null) {
            NamedNodeMap attributes = e.getAttributes();
            List<Node> removables = new ArrayList<>();
            for (int i = 0; i < attributes.getLength(); i++) {
                Node attr = attributes.item(i);
                if (!StringUtils.equals(attr.getNodeName(), "xmlns:" + prefix)
                        && !StringUtils.equals(attr.getNodeName(), "xmlns:xsi")) {
                    removables.add(attr);
                }
            }
            for (Node attr : removables) {
                attributes.removeNamedItem(attr.getNodeName());
            }
        }
        DOMImplementationLS lsImpl =
                (DOMImplementationLS) e.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false);
        String xml = serializer.writeToString(e);
        if (e.getNamespaceURI() != null) {
            return AbstractMX.parse(xml, new MxId(e.getNamespaceURI()), new MxReadConfiguration());
        }
        return null;
    }

    /**
     * Parses the XML string containing the Document and optional AppHdr into a specific instance of MX message object.
     * The header version, if present, is auto detected from its namespace.
     *
     * <p>If the string is empty, does not contain an MX document, the message type cannot be detected or an error
     * occur reading and parsing the message content; this method returns null.
     *
     * <p>The implementation detects the message type and uses reflection to call the parser in the specific subclass.
     *
     * @param xml  string a string containing the Document of an MX message in XML format
     * @param id   optional parameter to indicate the specific MX type to create; auto detected from namespace if null.
     * @param conf specific options for the unmarshalling or null to use the default parameters
     * @return parsed message or null if string content could not be parsed into an Mx
     * @since 9.2.6
     */
    public static AbstractMX parse(final String xml, MxId id, final MxReadConfiguration conf) {
        return MxReadImpl.parse(xml, id, new MxReadParams(conf));
    }

    /**
     * Used by subclasses to implement JSON deserialization.
     *
     * @param json     a JSON representation of an MX message
     * @param classOfT the specific MX subclass
     * @return a specific deserialized MX message object
     * @since 7.10.3
     */
    protected static <T> T fromJson(String json, Class<T> classOfT) {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
                .registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
                .registerTypeAdapter(AppHdr.class, new AppHdrAdapter())
                .create();
        return gson.fromJson(json, classOfT);
    }

    /**
     * Creates an MX messages from its JSON representation.
     *
     * @param json a JSON representation of an MX message
     * @return a specific deserialized MX message object, for example MxPain00100108
     * @since 7.10.3
     */
    public static AbstractMX fromJson(String json) {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
                .registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
                .registerTypeAdapter(AppHdr.class, new AppHdrAdapter())
                .create();
        return gson.fromJson(json, AbstractMX.class);
    }

    /**
     * Get this message as an XML string.
     *
     * <p>If the business header is set, the created XML will include both the 'AppHdr' and the 'Document' elements,
     * under the configured root element. If the header is not present, the created XMl will only include the
     * 'Document'. Both 'AppHdr' and 'Document' are generated with namespace declaration and optional with prefixes as
     * indicated in the configuration.
     * <p>The configuration options enables customization of the XML serialization, including the root element name and
     * prefixes. And it also provides default configurations for SWIFT and ISO 20022 envelopes.
     *
     * @param conf specific options for the serialization or null to use the default parameters
     * @return the XML content or null if errors occur during serialization
     */
    public String message(MxWriteConfiguration conf) {
        MxWriteConfiguration usableConf = conf != null ? conf : new MxWriteConfiguration();
        MxWriteParams params = new MxWriteParams(usableConf);

        // handle manually at this method level
        params.includeXMLDeclaration = false;

        EnvelopeType envelopeType = usableConf.envelopeType;
        String envelopeElement =
                envelopeType == EnvelopeType.CUSTOM ? usableConf.rootElement : envelopeType.rootElement();

        StringBuilder xml = new StringBuilder();
        if (usableConf.includeXMLDeclaration) {
            xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        }

        params.prefix = usableConf.headerPrefix;
        final String header = header(params);
        if (header != null) {
            // open envelope element
            xml.append("<");
            if (envelopeType.prefix() != null) {
                xml.append(envelopeType.prefix()).append(":");
            }
            xml.append(envelopeElement);

            if (envelopeType != EnvelopeType.CUSTOM) {
                xml.append(" xmlns=\"")
                        .append(usableConf.envelopeType.namespace())
                        .append("\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
            }
            xml.append(">\n");

            // for ISO envelopes we have to add an extra element wrapping the header
            if (envelopeType.name().startsWith("BME")) {
                xml.append("<").append(envelopeType.prefix()).append(":Hdr>\n");
            }

            // write AppHdr
            xml.append(header).append("\n");

            // for ISO envelopes we have to close the extra element wrapping the header
            if (envelopeType.name().startsWith("BME")) {
                xml.append("</").append(envelopeType.prefix()).append(":Hdr>\n");
            }
        }

        // for ISO envelopes we have to wrap the Document in an extra element
        if (envelopeType.name().startsWith("BME")) {
            xml.append("<").append(envelopeType.prefix()).append(":Doc>\n");
        }

        // write Document
        if (usableConf.documentPrefix != null && usableConf.useCategoryAsDocumentPrefix) {
            params.prefix = getBusinessProcess();
        } else {
            params.prefix = usableConf.documentPrefix;
        }
        xml.append(document(params)).append("\n");

        // for ISO envelopes we have to close the extra element wrapping the Document
        if (envelopeType.name().startsWith("BME")) {
            xml.append("</").append(envelopeType.prefix()).append(":Doc>\n");
        }

        if (header != null) {
            // close the envelope element
            xml.append("</");
            if (envelopeType.prefix() != null) {
                xml.append(envelopeType.prefix()).append(":");
            }
            xml.append(envelopeElement).append(">");
        }
        return xml.toString();
    }

    /**
     * Get this message AppHdr as an XML string.
     *
     * @since 9.2.6
     */
    public String header(final MxWriteParams params) {
        if (this.appHdr != null) {
            return this.appHdr.xml(params);
        } else {
            return null;
        }
    }

    /**
     * Get this message Document as an XML string.
     *
     * @param params not null marshalling parameters
     * @since 9.2.6
     */
    public String document(MxWriteParams params) {
        Objects.requireNonNull(params, "marshalling params cannot be null");
        return MxWriteImpl.write(getNamespace(), this, getClasses(), params);
    }

    /**
     * Get the classes associated with this message
     *
     * @since 7.7
     */
    @SuppressWarnings("rawtypes")
    public abstract Class[] getClasses();

    /**
     * Get the XML namespace of the message
     *
     * @since 7.7
     */
    public abstract String getNamespace();

    /**
     * Get this message AppHdr as an XML string.
     *
     * <p>The XML will not include the XML declaration, will bind the namespace to all elements without prefix and will
     * use the default escape handler and content adapters.
     * <p>
     * For more serialization options use {@link #header(MxWriteParams)}
     *
     * @return the serialized header or null if header is not set or errors occur during serialization
     * @since 7.8
     */
    public String header() {
        return header(new MxWriteParams());
    }

    /**
     * Get this message Document as an XML string.
     *
     * <p>The XML will not include the XML declaration, will bind the namespace to all elements using "doc" as default
     * prefix and will use the default escape handler. For more serialization options use {@link #document(MxWriteParams)}
     *
     * @return document serialized into XML string or null if errors occur during serialization
     * @since 7.8
     */
    public String document() {
        MxWriteConfiguration conf = new MxWriteConfiguration();
        MxWriteParams params = new MxWriteParams(conf);
        params.prefix = conf.documentPrefix;
        return document(params);
    }

    /**
     * @deprecated use {@link #document(MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2025)
    public String document(final String prefix, boolean includeXMLDeclaration, EscapeHandler escapeHandler) {
        DeprecationUtils.phase3(
                AbstractMX.class, "document(String, boolean, EscapeHandler)", "Use document(MxWriteParams) instead");
        MxWriteParams params = new MxWriteParams();
        params.prefix = prefix;
        params.includeXMLDeclaration = includeXMLDeclaration;
        params.escapeHandler = escapeHandler;
        return document(params);
    }

    /**
     * Convenience method to get this message XML as javax.xml.transform.Source.
     *
     * @return null if message() returns null or StreamSource in other case
     * @see #message()
     * @since 7.7
     */
    public Source xmlSource() {
        final String xml = message();
        log.fine("XML: " + xml);
        if (xml != null) {
            return new StreamSource(new StringReader(xml));
        }
        return null;
    }

    /**
     * Get this message as an XML string.
     *
     * <p>If the header is present, then 'AppHdr' and 'Document' elements will be wrapped under a default root element
     * 'RequestPayload'. Both header and document are generated with the corresponding namespaces and by default the
     * prefix 'head' is used for the header and the message category is used as prefix for the document.
     * <br>For more serialization options see {@link #message(MxWriteConfiguration)}
     * <br>To serialize only the header or the document (without header) see {@link #header()} and {@link #document()}
     *
     * @return the XML content or null if errors occur during serialization
     * @since 7.7
     */
    @Override
    public String message() {
        return message(new MxWriteConfiguration());
    }

    /**
     * @deprecated use {@link #message(MxWriteConfiguration)} and handle write from String to file with plain Java API
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2025)
    public void write(final File file) throws IOException {
        DeprecationUtils.phase3(AbstractMX.class, "write(File)", "Use message(MxWriteConfiguration) instead");
        Objects.requireNonNull(file, "the file to write cannot be null");
        boolean created = file.createNewFile();
        if (created) {
            log.fine("new file created: " + file.getAbsolutePath());
        }
        final FileOutputStream stream = new FileOutputStream(file.getAbsoluteFile());
        write(stream);
        stream.close();
    }

    /**
     * @deprecated use {@link #message(MxWriteConfiguration)} and handle write from String to stream with plain Java API
     */
    @Deprecated
    @ProwideDeprecated(phase4 = TargetYear.SRU2025)
    public void write(final OutputStream stream) throws IOException {
        DeprecationUtils.phase3(AbstractMX.class, "write(OutputStream)", "Use message(MxWriteConfiguration) instead");
        Objects.requireNonNull(stream, "the stream to write cannot be null");
        stream.write(message().getBytes(StandardCharsets.UTF_8));
    }

    /**
     * @return the business header or null if not set
     * @since 9.0.1
     */
    @XmlTransient
    public AppHdr getAppHdr() {
        return this.appHdr;
    }

    /**
     * @param appHdr the header to set
     * @since 9.0.1
     */
    public void setAppHdr(final AppHdr appHdr) {
        this.appHdr = appHdr;
    }

    /**
     * Returns the MX message identification.<br>
     * Composed by the business process, functionality, variant and version.
     *
     * @return the constructed message id
     * @since 7.7
     */
    public MxId getMxId() {
        MxId mxId = new MxId(
                getBusinessProcess(),
                StringUtils.leftPad(Integer.toString(getFunctionality()), 3, "0"),
                StringUtils.leftPad(Integer.toString(getVariant()), 3, "0"),
                StringUtils.leftPad(Integer.toString(getVersion()), 2, "0"));
        if (this.appHdr != null) {
            mxId.setBusinessService(this.appHdr.serviceName());
        }
        return mxId;
    }

    /**
     * get the Alphabetic code in four positions (fixed length) identifying the Business Process
     *
     * @return the business process of the implementing class
     * @since 7.7
     */
    public abstract String getBusinessProcess();

    /**
     * Get the code identifying the Message Functionality
     *
     * @return the set functionality or null if not set
     * @since 7.7
     */
    public abstract int getFunctionality();

    /**
     * Get the Message variant
     *
     * @return the set variant or null if not set
     * @since 7.7
     */
    public abstract int getVariant();

    /**
     * Get the message version
     *
     * @return the set vesion or null if not set
     * @since 7.7
     */
    public abstract int getVersion();

    public Element element() {
        return element(null);
    }

    public Element element(JAXBContext inputContext) {
        // it didn't work as expected
        // properties.put(JAXBRIContext.DEFAULT_NAMESPACE_REMAP, namespace);
        try {
            JAXBContext context;
            if (inputContext != null) {
                context = inputContext;
            } else {
                context = JaxbContextLoader.INSTANCE.get(this.getClass(), getClasses());
            }

            DOMResult res = new DOMResult();
            context.createMarshaller().marshal(this, res);
            Document doc = (Document) res.getNode();

            return (Element) doc.getFirstChild();
        } catch (Exception e) {
            log.log(Level.WARNING, "Error creating XML Document for MX", e);
            return null;
        }
    }

    /**
     * Get a JSON representation of this MX	message.
     *
     * @since 7.10.3
     */
    @Override
    public String toJson() {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapter(AbstractMX.class, new AbstractMXAdapter())
                .registerTypeHierarchyAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
                .registerTypeAdapter(AppHdr.class, new AppHdrAdapter())
                .setPrettyPrinting()
                .create();
        // we use AbstractMX and not this.getClass() in order to force usage of the adapter
        return gson.toJson(this, AbstractMX.class);
    }

    /**
     * @return same as {@link #getNamespace()}
     * @since 9.1.2
     */
    public String targetNamespace() {
        return getNamespace();
    }
}
