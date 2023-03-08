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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeaderImpl;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Legacy SWIFT application header usually knonw from its namespace:  $ahV10
 *
 * @since 9.0.1
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppHdr")
@XmlRootElement(name = "AppHdr", namespace = "urn:swift:xsd:$ahV10")
public class LegacyAppHdr extends ApplicationHeaderImpl implements AppHdr {
    public static final transient String NAMESPACE = "urn:swift:xsd:$ahV10";
    final static transient Class[] _classes;
    private static final transient Logger log = Logger.getLogger(LegacyAppHdr.class.getName());

    static {
        _classes = Arrays.copyOf(ApplicationHeaderImpl._classes, ApplicationHeaderImpl._classes.length + 1);
        _classes[_classes.length - 1] = LegacyAppHdr.class;
    }

    /**
     * Parse the header from an XML with optional wrapper and sibling elements that will be ignored.
     * <p>
     * Default adapters are applied, for more options use {@link #parse(String, MxReadParams)}
     *
     * @param xml the XML content, can contain wrapper elements that will be ignored
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static LegacyAppHdr parse(final String xml) {
        return parse(xml, new MxReadParams());
    }

    /**
     * Parse the header from an XML with optional wrapper and sibling elements that will be ignored.
     * <p>
     * Default adapters are applied, for more options use {@link #parse(String, MxReadParams)}
     *
     * @param xml    the XML content, can contain wrapper elements that will be ignored
     * @param params not null unmarshalling parameters
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     * @since 9.2.6
     */
    public static LegacyAppHdr parse(final String xml, final MxReadParams params) {
        Objects.requireNonNull(params, "The unmarshalling params cannot be null");
        return (LegacyAppHdr) MxParseUtils.parse(LegacyAppHdr.class, xml, _classes, HEADER_LOCALNAME, params);
    }

    /**
     * Get the classes associated with this message
     */
    @SuppressWarnings("rawtypes")
    Class[] getClasses() {
        return _classes;
    }

    /**
     * Gets the sender BIC from ApplicationHeader/From/Type+Id where if Type is BIC the Id is returned as is,
     * otherwise the domain name is parsed to extract the SWIFT BIC
     *
     * @return found BIC code or null if element is not found
     */
    @Override
    public String from() {
        try {
            if (StringUtils.equals(this.getFrom().getType(), "BIC")) {
                return this.getFrom().getId();
            } else {
                return MxParseUtils.getBICFromDN(this.getFrom().getId());
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    /**
     * Gets the receiver BIC code from ApplicationHeader/To/Type+Id where if Type is BIC the Id is returned as is,
     * otherwise the domain name is parsed to extract the SWIFT BIC
     *
     * @return found BIC or null if not present or cannot be parsed
     */
    @Override
    public String to() {
        try {
            if (StringUtils.equals(this.getTo().getType(), "BIC")) {
                return this.getTo().getId();
            } else {
                return MxParseUtils.getBICFromDN(this.getTo().getId());
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    /**
     * Get the message reference.
     *
     * @see #getMsgRef()
     */
    @Override
    public String reference() {
        return this.getMsgRef();
    }

    /**
     * Gets the message name.
     *
     * @see #getMsgName()
     */
    @Override
    public String messageName() {
        return this.getMsgName();
    }

    /**
     * Gets the service name.
     *
     * @see #getSvcName()
     */
    @Override
    public String serviceName() {
        return this.getSvcName();
    }

    /**
     * @return true if the Dup element is present, false otherwise
     * @see #getDup()
     */
    @Override
    public boolean duplicate() {
        return this.getDup() != null;
    }

    /**
     * Gets the creation date
     *
     * @see #getCrDate()
     */
    @Override
    public XMLGregorianCalendar creationDate() {
        return this.getCrDate();
    }

    /**
     * Sets the creation date.
     *
     * @param overwrite if true, the creation date will always be set overwriting any previous value;
     * @see #setCrDate(XMLGregorianCalendar)
     */
    @Override
    public void setCreationDate(boolean overwrite) {
        if (this.getCrDate() == null || overwrite) {
            this.setCrDate(XMLGregorianCalendarUtils.now());
        }
    }

    /**
     * @deprecated use {@link #xml(MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2023)
    @Override
    public String xml(final String prefix, boolean includeXMLDeclaration) {
        MxWriteParams params = new MxWriteParams();
        params.prefix = prefix;
        params.includeXMLDeclaration = includeXMLDeclaration;
        return xml(params);
    }

    /**
     * @deprecated use {@link #xml(MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase2 = TargetYear.SRU2023)
    @Override
    public String xml(String prefix, boolean includeXMLDeclaration, EscapeHandler escapeHandler) {
        MxWriteParams params = new MxWriteParams();
        params.prefix = prefix;
        params.includeXMLDeclaration = includeXMLDeclaration;
        params.escapeHandler = escapeHandler;
        return xml(params);
    }

    @Override
    public String xml(MxWriteParams params) {
        try {
            JAXBContext context;
            if (params.context != null) {
                context = params.context;
            } else {
                context = JAXBContext.newInstance(ApplicationHeaderImpl.class);
            }
            final Marshaller marshaller = MxWriteUtils.createMarshaller(context, params);

            final StringWriter sw = new StringWriter();
            JAXBElement<ApplicationHeaderImpl> element = new JAXBElement(new QName(NAMESPACE, AppHdr.HEADER_LOCALNAME), ApplicationHeaderImpl.class, null, this);
            XmlEventWriter eventWriter = new XmlEventWriter(sw, params.prefix, params.includeXMLDeclaration, AppHdr.HEADER_LOCALNAME, params.escapeHandler, params.indent);
            marshaller.marshal(element, eventWriter);
            return sw.getBuffer().toString();

        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Error writing $ahV10 XML:" + e.getMessage());
        }
        return null;
    }

    @Override
    public Element element() {
        return element(null);
    }

    /**
     * @since 9.3.5
     */
    public Element element(JAXBContext inputContext) {
        try {
            JAXBContext context;
            if (inputContext != null) {
                context = inputContext;
            } else {
                context = JAXBContext.newInstance(ApplicationHeaderImpl.class);
            }
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            DOMResult res = new DOMResult();
            JAXBElement<ApplicationHeaderImpl> element = new JAXBElement(new QName(NAMESPACE, AppHdr.HEADER_LOCALNAME), ApplicationHeaderImpl.class, null, this);
            marshaller.marshal(element, res);
            Document doc = (Document) res.getNode();
            return (Element) doc.getFirstChild();

        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Error writing $ahV10 XML:" + e.getMessage());
        }
        return null;
    }

    /**
     * @return NAMESPACE
     * @since 9.1.7
     */
    @Override
    public String namespace() {
        return NAMESPACE;
    }

}
