
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for admi.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "admi00400101"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.004.001.01")
public class MxAdmi00400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "admi.004.001.01", required = true)
    protected Admi00400101 admi00400101;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Admi00400101 .class, Event1 .class, MxAdmi00400101 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:admi.004.001.01";

    public MxAdmi00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00400101(final String xml) {
        this();
        MxAdmi00400101 tmp = parse(xml);
        admi00400101 = tmp.getAdmi00400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the admi00400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Admi00400101 }
     *     
     */
    public Admi00400101 getAdmi00400101() {
        return admi00400101;
    }

    /**
     * Sets the value of the admi00400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Admi00400101 }
     *     
     */
    public MxAdmi00400101 setAdmi00400101(Admi00400101 value) {
        this.admi00400101 = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAdmi00400101 parse(String xml) {
        return ((MxAdmi00400101) MxReadImpl.parse(MxAdmi00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00400101 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00400101) parserImpl.read(MxAdmi00400101 .class, xml, _classes));
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
     * Creates an MxAdmi00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00400101 message
     * @return
     *     a new instance of MxAdmi00400101
     */
    public final static MxAdmi00400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi00400101 .class);
    }

}
