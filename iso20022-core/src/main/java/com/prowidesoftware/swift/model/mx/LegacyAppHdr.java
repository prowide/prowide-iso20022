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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.swift.model.mx.dic.ApplicationHeaderImpl;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;
import java.io.StringWriter;
import java.util.Arrays;
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
    private static final transient Logger log = Logger.getLogger(LegacyAppHdr.class.getName());

    public static final transient String NAMESPACE = "urn:swift:xsd:$ahV10";

    final static transient Class[] _classes;
    static {
        _classes = Arrays.copyOf(ApplicationHeaderImpl._classes, ApplicationHeaderImpl._classes.length + 1);
        _classes[_classes.length - 1] = LegacyAppHdr.class;
    }

    /**
     * Get the classes associated with this message
     */
    @SuppressWarnings("rawtypes")
    Class[] getClasses() {
        return _classes;
    }

    /**
     * Parse the header from an XML with optional wrapper and sibling elements that will be ignored.
     * @param xml the XML content, can contain wrapper elements that will be ignored
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static LegacyAppHdr parse(final String xml) {
        return (LegacyAppHdr) MxParseUtils.parse(LegacyAppHdr.class, xml, _classes, HEADER_LOCALNAME);
    }

    /**
     * Gets the sender BIC from ApplicationHeader/From/Type+Id where if Type is BIC the Id is returned as is,
     * otherwise the domain name is parsed to extract the SWIFT BIC
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
     * @see #getMsgRef()
     */
    @Override
    public String reference() {
        return this.getMsgRef();
    }

    /**
     * Gets the message name.
     * @see #getMsgName()
     */
    @Override
    public String messageName() {
        return this.getMsgName();
    }

    /**
     * Gets the service name.
     * @see #getSvcName()
     */
    @Override
    public String serviceName() {
        return this.getSvcName();
    }

    /**
     * @see #getDup()
     * @return true if the Dup element is present, false otherwise
     */
    @Override
    public boolean duplicate() {
        return this.getDup() != null;
    }

    /**
     * Gets the creation date
     * @see #getCrDate()
     */
    @Override
    public XMLGregorianCalendar creationDate() {
        return this.getCrDate();
    }

    /**
     * Sets the creation date.
     * @param overwrite if true, the creation date will always be set overwriting any previous value;
     * @see #setCrDate(XMLGregorianCalendar)
     */
    @Override
    public void setCreationDate(boolean overwrite) {
        if (this.getCrDate() == null || overwrite) {
            this.setCrDate(XMLGregorianCalendarUtils.now());
        }
    }

    @Override
    public String xml(String prefix, boolean includeXMLDeclaration) {
        try {
            JAXBContext context = JAXBContext.newInstance(ApplicationHeaderImpl.class);
            final Marshaller marshaller = context.createMarshaller();

            final StringWriter sw = new StringWriter();
            JAXBElement<ApplicationHeaderImpl> element = new JAXBElement(new QName(NAMESPACE, AppHdr.HEADER_LOCALNAME), ApplicationHeaderImpl.class, null, this);
            marshaller.marshal(element, new XmlEventWriter(sw, prefix, includeXMLDeclaration, AppHdr.HEADER_LOCALNAME));
            return sw.getBuffer().toString();

        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Error writing $ahV10 XML:" + e.getMessage());
        }
        return null;
    }

    @Override
    public Element element() {
        try {
            JAXBContext context = JAXBContext.newInstance(ApplicationHeaderImpl.class);
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

}
