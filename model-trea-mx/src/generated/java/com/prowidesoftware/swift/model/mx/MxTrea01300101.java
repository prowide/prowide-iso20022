
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
 * Class for trea.013.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "wdrwlNtfctnV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.013.001.01")
public class MxTrea01300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "WdrwlNtfctnV01", required = true)
    protected WithdrawalNotificationV01 wdrwlNtfctnV01;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {MessageReference.class, MxTrea01300101 .class, WithdrawalNotificationV01 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.013.001.01";

    public MxTrea01300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea01300101(final String xml) {
        this();
        MxTrea01300101 tmp = parse(xml);
        wdrwlNtfctnV01 = tmp.getWdrwlNtfctnV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea01300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the wdrwlNtfctnV01 property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawalNotificationV01 }
     *     
     */
    public WithdrawalNotificationV01 getWdrwlNtfctnV01() {
        return wdrwlNtfctnV01;
    }

    /**
     * Sets the value of the wdrwlNtfctnV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawalNotificationV01 }
     *     
     */
    public MxTrea01300101 setWdrwlNtfctnV01(WithdrawalNotificationV01 value) {
        this.wdrwlNtfctnV01 = value;
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
    public static MxTrea01300101 parse(String xml) {
        return ((MxTrea01300101) MxReadImpl.parse(MxTrea01300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea01300101 parse(String xml, MxRead parserImpl) {
        return ((MxTrea01300101) parserImpl.read(MxTrea01300101 .class, xml, _classes));
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
     * Creates an MxTrea01300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea01300101 message
     * @return
     *     a new instance of MxTrea01300101
     */
    public final static MxTrea01300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTrea01300101 .class);
    }

}
