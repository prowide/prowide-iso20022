
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for admi.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "admi00200101"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.002.001.01")
public class MxAdmi00200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "admi.002.001.01", required = true)
    protected MessageRejectV01 admi00200101;
    public static final transient String BUSINESS_PROCESS = "admi";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {MessageReference.class, MessageRejectV01 .class, MxAdmi00200101 .class, RejectionReason2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:admi.002.001.01";

    public MxAdmi00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00200101(final String xml) {
        this();
        MxAdmi00200101 tmp = parse(xml);
        admi00200101 = tmp.getAdmi00200101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the admi00200101 property.
     * 
     * @return
     *     possible object is
     *     {@link MessageRejectV01 }
     *     
     */
    public MessageRejectV01 getAdmi00200101() {
        return admi00200101;
    }

    /**
     * Sets the value of the admi00200101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRejectV01 }
     *     
     */
    public MxAdmi00200101 setAdmi00200101(MessageRejectV01 value) {
        this.admi00200101 = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAdmi00200101 parse(String xml) {
        return ((MxAdmi00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi00200101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi00200101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00200101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00200101 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00200101) parserImpl.read(MxAdmi00200101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAdmi00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00200101 message
     * @return
     *     a new instance of MxAdmi00200101
     */
    public static final MxAdmi00200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi00200101 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
