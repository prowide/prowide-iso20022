
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
 * Class for admi.004.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sysEvtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:admi.004.001.02")
public class MxAdmi00400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SysEvtNtfctn", required = true)
    protected SystemEventNotificationV02 sysEvtNtfctn;
    public static final transient String BUSINESS_PROCESS = "admi";
    public static final transient int FUNCTIONALITY = 4;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Event2 .class, MxAdmi00400102 .class, SystemEventNotificationV02 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:admi.004.001.02";

    public MxAdmi00400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00400102(final String xml) {
        this();
        MxAdmi00400102 tmp = parse(xml);
        sysEvtNtfctn = tmp.getSysEvtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sysEvtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventNotificationV02 }
     *     
     */
    public SystemEventNotificationV02 getSysEvtNtfctn() {
        return sysEvtNtfctn;
    }

    /**
     * Sets the value of the sysEvtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventNotificationV02 }
     *     
     */
    public MxAdmi00400102 setSysEvtNtfctn(SystemEventNotificationV02 value) {
        this.sysEvtNtfctn = value;
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
    public static MxAdmi00400102 parse(String xml) {
        return ((MxAdmi00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi00400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi00400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00400102 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00400102) parserImpl.read(MxAdmi00400102 .class, xml, _classes));
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
     * Creates an MxAdmi00400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00400102 message
     * @return
     *     a new instance of MxAdmi00400102
     */
    public static final MxAdmi00400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi00400102 .class);
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
