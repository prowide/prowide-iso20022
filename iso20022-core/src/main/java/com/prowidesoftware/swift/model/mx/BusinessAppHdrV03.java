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

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.deprecation.DeprecationUtils;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;
import com.prowidesoftware.swift.model.mx.dic.BusinessApplicationHeaderV03Impl;
import com.prowidesoftware.swift.model.mx.dic.Party44Choice;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.StringWriter;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * ISO 20022 business application header version 3 usually known by its namespace head.001.001.03
 *
 * @since 9.3.4
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppHdr")
@XmlRootElement(name = "AppHdr", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03")
public class BusinessAppHdrV03 extends BusinessApplicationHeaderV03Impl implements AppHdr {
    public static final String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:head.001.001.03";
    static final Class[] _classes;
    private static final Logger log = Logger.getLogger(BusinessAppHdrV03.class.getName());

    static {
        _classes = Arrays.copyOf(
                BusinessApplicationHeaderV03Impl._classes, BusinessApplicationHeaderV03Impl._classes.length + 1);
        _classes[_classes.length - 1] = BusinessAppHdrV03.class;
    }

    /**
     * Parse the header from an XML with optional wrapper and sibling elements that will be ignored.
     *
     * Default adapters are applied, for more options use {@link #parse(String, MxReadParams)}
     *
     * @param xml the XML content, can contain wrapper elements that will be ignored
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static BusinessAppHdrV03 parse(final String xml) {
        return parse(xml, new MxReadParams());
    }

    /**
     * Parse the header from an XML with optional wrapper and sibling elements that will be ignored.
     *
     * @param xml the XML content, can contain wrapper elements that will be ignored
     * @param params not null unmarshalling parameters
     * @return parsed element or null if cannot be parsed
     * @throws ProwideException if severe errors occur during parse
     */
    public static BusinessAppHdrV03 parse(final String xml, final MxReadParams params) {
        Objects.requireNonNull(params, "The unmarshalling params cannot be null");
        return (BusinessAppHdrV03) MxParseUtils.parse(BusinessAppHdrV03.class, xml, _classes, HEADER_LOCALNAME, params);
    }

    /**
     * Get the classes associated with this message
     */
    @SuppressWarnings("rawtypes")
    Class[] getClasses() {
        return _classes;
    }

    /**
     * Gets the sender BIC code from these elements in the following order:
     * <ol>
     * 	<li>BusinessApplicationHeaderV03/Fr/FIId/FinInstnId/BICFI</li>
     *  <li>BusinessApplicationHeaderV03/Fr/OrgId/Id/OrgId/Id/AnyBIC</li>
     * </ol>
     *
     * @return found BIC or null if not present or cannot be parsed
     */
    @Override
    public String from() {
        return getBIC(this.getFr());
    }

    /**
     * Gets the receiver BIC code from these elements in the following order:
     * <ol>
     * 	<li>BusinessApplicationHeaderV03/To/FIId/FinInstnId/BICFI</li>
     *  <li>BusinessApplicationHeaderV03/To/OrgId/Id/OrgId/Id/AnyBIC</li>
     * </ol>
     *
     * @return found BIC or null if not present or cannot be parsed
     */
    @Override
    public String to() {
        return getBIC(this.getTo());
    }

    private String getBIC(final Party44Choice p) {
        try {
            final String found = p.getFIId().getFinInstnId().getBICFI();
            if (!StringUtils.isEmpty(found)) {
                return found;
            }
        } catch (NullPointerException e) {
            try {
                final String found = p.getOrgId().getId().getOrgId().getAnyBIC();
                if (!StringUtils.isEmpty(found)) {
                    return found;
                }
            } catch (NullPointerException e2) {
                return null;
            }
        }
        return null;
    }

    /**
     * Get the message reference.
     *
     * @see #getBizMsgIdr()
     */
    @Override
    public String reference() {
        return this.getBizMsgIdr();
    }

    /**
     * Gets the message name.
     *
     * @see #getMsgDefIdr()
     */
    @Override
    public String messageName() {
        return this.getMsgDefIdr();
    }

    /**
     * Gets the service name.
     *
     * @see #getBizSvc()
     */
    @Override
    public String serviceName() {
        return this.getBizSvc();
    }

    /**
     * @return true if the CpyDplct element is present, false otherwise
     * @see #getCpyDplct()
     */
    @Override
    public boolean duplicate() {
        return (this.isPssblDplct() != null && this.isPssblDplct()) || this.getCpyDplct() != null;
    }

    /**
     * Gets the creation date
     *
     * @see #getCreDt()
     */
    @Override
    public OffsetDateTime creationDate() {
        return this.getCreDt();
    }

    /**
     * Sets the creation date.
     *
     * @param overwrite if true, the creation date will always be set overwriting any previous value;
     * @see #setCreDt(OffsetDateTime)
     */
    @Override
    public void setCreationDate(boolean overwrite) {
        if (this.getCreDt() == null || overwrite) {
            this.setCreDt(OffsetDateTime.now(ZoneOffset.UTC));
        }
    }

    /**
     * @deprecated use {@link #xml(MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2024)
    @Override
    public String xml(String prefix, boolean includeXMLDeclaration) {
        DeprecationUtils.phase2(AbstractMX.class, "xml(String, boolean)", "Use xml(MxWriteParams) instead");
        MxWriteParams params = new MxWriteParams();
        params.prefix = prefix;
        params.includeXMLDeclaration = includeXMLDeclaration;
        return xml(params);
    }

    /**
     * @deprecated use {@link #xml(MxWriteParams)} instead
     */
    @Deprecated
    @ProwideDeprecated(phase3 = TargetYear.SRU2024)
    @Override
    public String xml(String prefix, boolean includeXMLDeclaration, EscapeHandler escapeHandler) {
        DeprecationUtils.phase2(
                AbstractMX.class, "xml(String, boolean, EscapeHandler)", "Use xml(MxWriteParams) instead");
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
                context = JAXBContext.newInstance(BusinessApplicationHeaderV03Impl.class);
            }
            final Marshaller marshaller = MxWriteUtils.createMarshaller(context, params);

            final StringWriter sw = new StringWriter();
            JAXBElement<BusinessApplicationHeaderV03Impl> element = new JAXBElement(
                    new QName(NAMESPACE, AppHdr.HEADER_LOCALNAME), BusinessApplicationHeaderV03Impl.class, null, this);
            XmlEventWriter eventWriter = new XmlEventWriter(
                    sw,
                    params.prefix,
                    params.includeXMLDeclaration,
                    AppHdr.HEADER_LOCALNAME,
                    params.escapeHandler,
                    params.indent);
            marshaller.marshal(element, eventWriter);
            return sw.getBuffer().toString();

        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Error writing head.001.001.03 XML:" + e.getMessage());
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
                context = JAXBContext.newInstance(BusinessApplicationHeaderV03Impl.class);
            }
            final Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            DOMResult res = new DOMResult();
            JAXBElement<BusinessApplicationHeaderV03Impl> element = new JAXBElement(
                    new QName(NAMESPACE, AppHdr.HEADER_LOCALNAME), BusinessApplicationHeaderV03Impl.class, null, this);
            marshaller.marshal(element, res);
            Document doc = (Document) res.getNode();
            return (Element) doc.getFirstChild();

        } catch (JAXBException e) {
            log.log(Level.SEVERE, "Error writing head.001.001.03 XML:" + e.getMessage());
        }
        return null;
    }

    /**
     * @return NAMESPACE
     */
    @Override
    public String namespace() {
        return NAMESPACE;
    }
}
