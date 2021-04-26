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
package com.prowidesoftware.swift.model.mx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prowidesoftware.JsonSerializable;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.AbstractMessage;
import com.prowidesoftware.swift.model.MessageStandardType;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeader;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV01;
import com.prowidesoftware.swift.utils.Lib;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


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
public abstract class AbstractMX extends AbstractMessage implements IDocument, JsonSerializable {
    public static final String DOCUMENT_LOCALNAME = "Document";
    private static final transient Logger log = Logger.getLogger(AbstractMX.class.getName());
    /**
     * Default root element when an MX is serialized as XML including both AppHdr and Document
     *
     * @since 8.0.2
     */
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

    protected static String message(final String namespace, final AbstractMX obj, @SuppressWarnings("rawtypes") final Class[] classes, final String prefix, boolean includeXMLDeclaration) {
        return MxWriteImpl.write(namespace, obj, classes, prefix, includeXMLDeclaration);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    protected static AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class[] classes) {
        return MxReadImpl.parse(targetClass, xml, classes);
    }

    /**
     * Parses the XML string containing the Document and optional AppHdr into a specific instance of MX message object.
     * The message and header types and version is auto detected.
     *
     * <p>The implementation uses {@link #parse(File, MxId)} with message id null for auto detection.
     *
     * @param xml the XML content to parse
     * @return parsed message or null if string content could not be parsed into an Mx
     * @since 9.0.1
     */
    public static AbstractMX parse(final String xml) {
        return parse(xml, null);
    }

    /**
     * Parses the XML string containing the Document and optional AppHdr into a specific instance of MX message object.
     * The header version, if present, is autodetected from its namespace.
     *
     * <p>If the string is empty, does not contain an MX document, the message type cannot be detected or an error
     * occur reading and parsing the message content; this method returns null.
     *
     * <p>The implementation detects the message type and uses reflection to call the parser in the specific subclass.
     *
     * @param xml string a string containing the Document of an MX message in XML format
     * @param id  optional parameter to indicate the specific MX type to create; auto detected from namespace if null.
     * @return parsed message or null if string content could not be parsed into an Mx
     * @since 7.8.4
     */
    public static AbstractMX parse(final String xml, MxId id) {
        return MxReadImpl.parse(xml, id);
    }

    /**
     * Parses a file content into a specific instance of MX.
     *
     * @param file a file containing a swift MX message
     * @param id   optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
     * @return parser message or null if file content could not be parsed
     * @throws IOException if the file cannot be written
     * @see #parse(String, MxId)
     * @since 7.8.4
     */
    public static AbstractMX parse(final File file, MxId id) throws IOException {
        return parse(Lib.readFile(file), id);
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
                if (!StringUtils.equals(attr.getNodeName(), "xmlns:" + prefix) && !StringUtils.equals(attr.getNodeName(), "xmlns:xsi")) {
                    removables.add(attr);
                }
            }
            for (Node attr : removables) {
                attributes.removeNamedItem(attr.getNodeName());
            }
        }
        DOMImplementationLS lsImpl = (DOMImplementationLS) e.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
        LSSerializer serializer = lsImpl.createLSSerializer();
        serializer.getDomConfig().setParameter("xml-declaration", false);
        String xml = serializer.writeToString(e);
        if (e.getNamespaceURI() != null) {
            return AbstractMX.parse(xml, new MxId(e.getNamespaceURI()));
        }
        return null;
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
                .create();
        return gson.fromJson(json, AbstractMX.class);
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

    /**
     * Get this message as an XML string.
     * <p>If the header is present, then 'AppHdr' and 'Document' elements will be wrapped under a
     * {@link #DEFAULT_ROOT_ELEMENT}
     * <br>Both header and documents are generated with the corresponding namespaces and by default the prefix 'h' is
     * used for the header and the prefix 'Doc' for the document.
     *
     * @see #message(String, boolean)
     * @since 7.7
     */
    @Override
    public String message() {
        return message(null, true);
    }

    /**
     * Get this message as an XML string.
     *
     * <p>If the business header is set, the created XML will include both the 'AppHdr' and the 'Document' elements,
     * under a the indicated or default root element.
     * <br>If the header is not present, the created XMl will only include the 'Document'.
     * <br>Both 'AppHdr' and 'Document' are generated with namespace declaration and default prefixes 'h' and 'Doc'
     * respectively.
     *
     * <p>IMPORTANT: The name of the envelope element that binds a Header to the message to which it applies is
     * implementation/network specific. The header root element ‘AppHdr’ and the ISO 20022 MessageDefinition
     * root element ‘Document’ must always be sibling elements in any XML document, with the AppHdr element preceding
     * the Document element.
     *
     * @param rootElement           optional specification of the root element if not provided {@link #DEFAULT_ROOT_ELEMENT} is used
     * @param includeXMLDeclaration true to include the XML declaration
     * @return header serialized into XML string or null if the header is not set or errors occur during serialization
     * @return created XML
     * @since 7.8
     */
    public String message(final String rootElement, boolean includeXMLDeclaration) {
        String root = rootElement != null ? rootElement : DEFAULT_ROOT_ELEMENT;
        StringBuilder xml = new StringBuilder();
        if (includeXMLDeclaration) {
            xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
        }
        final String header = header("h", false);
        if (header != null) {
            xml.append("<" + root + ">\n");
            xml.append(header + "\n");
        }
        xml.append(document("Doc", false) + "\n");
        if (header != null) {
            xml.append("</" + root + ">");
        }
        return xml.toString();
    }

    /**
     * Same as {@link #message(String, boolean)} with includeXMLDeclaration set to true
     *
     * @since 7.8
     */
    public String message(final String rootElement) {
        return message(rootElement, true);
    }

    /**
     * Get this message AppHdr as an XML string.
     * <p>The XML will not include the XML declaration, and will include de namespace as default (without prefix).
     *
     * @return the serialized header or null if header is not set or errors occur during serialization
     * @see #header(String, boolean)
     * @since 7.8
     */
    public String header() {
        return header(null, false);
    }

    /**
     * Get this message AppHdr as an XML string.
     *
     * @param prefix                optional prefix for namespace (empty by default)
     * @param includeXMLDeclaration true to include the XML declaration
     * @return header serialized into XML string or null if the header is not set or errors occur during serialization
     * @since 7.8
     */
    public String header(final String prefix, boolean includeXMLDeclaration) {
        if (this.appHdr != null) {
            return this.appHdr.xml(prefix, includeXMLDeclaration);
        } else {
            return null;
        }
    }

    /**
     * Get this message Document as an XML string.
     * <p>The XML will include the XML declaration, and will use "Doc" as prefix for the elements.
     *
     * @return document serialized into XML string or null if errors occur during serialization
     * @see #document(String, boolean)
     * @since 7.8
     */
    public String document() {
        return document("Doc", true);
    }

    /**
     * Get this message Document as an XML string.
     *
     * @param prefix                optional prefix for namespace (empty by default)
     * @param includeXMLDeclaration true to include the XML declaration
     * @return document serialized into XML string or null if errors occur during serialization
     * @since 7.8
     */
    public String document(final String prefix, boolean includeXMLDeclaration) {
        return message(getNamespace(), this, getClasses(), prefix, includeXMLDeclaration);
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
     * Writes the message document content into a file in XML format (headers not included).
     *
     * @param file a not null file to write, if it does not exists, it will be created
     * @since 7.7
     */
    public void write(final File file) throws IOException {
        Validate.notNull(file, "the file to write cannot be null");
        boolean created = file.createNewFile();
        if (created) {
            log.fine("new file created: " + file.getAbsolutePath());
        }
        final FileOutputStream stream = new FileOutputStream(file.getAbsoluteFile());
        write(stream);
        stream.close();
    }

    /**
     * Writes the message document content into a file in XML format, encoding content in UTF-8 (headers not included).
     *
     * @param stream a non null stream to write
     * @throws IOException if the stream cannot be written
     * @since 7.7
     */
    public void write(final OutputStream stream) throws IOException {
        Validate.notNull(stream, "the stream to write cannot be null");
        stream.write(message().getBytes("UTF-8"));
    }

    /**
     * @return the business header or null if not set
     * @since 7.7
     * @deprecated use {@link #getAppHdr()} instead
     */
    @XmlTransient
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    public BusinessHeader getBusinessHeader() {
        // backward compatible implementation during the deprecation phase
        if (appHdr instanceof BusinessHeader) {
            // if it is already a deprecated header we cast and return
            return (BusinessHeader) appHdr;

        } else if (appHdr instanceof ApplicationHeader) {
            return new BusinessHeader((ApplicationHeader) appHdr);

        } else if (appHdr instanceof BusinessApplicationHeaderV01) {
            return new BusinessHeader((BusinessApplicationHeaderV01) appHdr);

        } else if (appHdr instanceof LegacyAppHdr) {
            return new BusinessHeader((LegacyAppHdr) appHdr);

        }
        if (appHdr instanceof BusinessAppHdrV01) {
            return new BusinessHeader((BusinessAppHdrV01) appHdr);
        }

        // otherwise we return null, which would be the case for the deprecated implementation as well
        return null;
    }

    /**
     * @param businessHeader the header to set
     * @since 7.8
     * @deprecated use {@link #setAppHdr(AppHdr)} instead
     */
    @ProwideDeprecated(phase2 = TargetYear.SRU2021)
    @Deprecated
    public void setBusinessHeader(final BusinessHeader businessHeader) {
        setAppHdr(businessHeader);
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
        return new MxId(getBusinessProcess(),
                StringUtils.leftPad(Integer.toString(getFunctionality()), 3, "0"),
                StringUtils.leftPad(Integer.toString(getVariant()), 3, "0"),
                StringUtils.leftPad(Integer.toString(getVersion()), 2, "0"));
    }

    public Element element() {
        // it didn't work as expected
        // properties.put(JAXBRIContext.DEFAULT_NAMESPACE_REMAP, namespace);
        try {
            JAXBContext context = JaxbContextLoader.INSTANCE.get(this.getClass(), getClasses());

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
                .registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarAdapter())
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
