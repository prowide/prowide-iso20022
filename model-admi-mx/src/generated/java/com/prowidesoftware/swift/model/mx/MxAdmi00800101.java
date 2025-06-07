
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for admi.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sysStsReqOrNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:admi.008.001.01")
public class MxAdmi00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SysStsReqOrNtfctn", required = true)
    protected SystemStatusRequestOrNotificationV01 sysStsReqOrNtfctn;
    public final static transient String BUSINESS_PROCESS = "admi";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {GeneralInformation3 .class, MessageFunction2Code.class, MxAdmi00800101 .class, RequestorDetails1 .class, ResponderDetails1 .class, SystemStatusRequestOrNotificationV01 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:admi.008.001.01";

    public MxAdmi00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAdmi00800101(final String xml) {
        this();
        MxAdmi00800101 tmp = parse(xml);
        sysStsReqOrNtfctn = tmp.getSysStsReqOrNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAdmi00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sysStsReqOrNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemStatusRequestOrNotificationV01 }
     *     
     */
    public SystemStatusRequestOrNotificationV01 getSysStsReqOrNtfctn() {
        return sysStsReqOrNtfctn;
    }

    /**
     * Sets the value of the sysStsReqOrNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemStatusRequestOrNotificationV01 }
     *     
     */
    public MxAdmi00800101 setSysStsReqOrNtfctn(SystemStatusRequestOrNotificationV01 value) {
        this.sysStsReqOrNtfctn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAdmi00800101 parse(String xml) {
        return ((MxAdmi00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAdmi00800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAdmi00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAdmi00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAdmi00800101 parse(String xml, MxRead parserImpl) {
        return ((MxAdmi00800101) parserImpl.read(MxAdmi00800101 .class, xml, _classes));
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
     * Creates an MxAdmi00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAdmi00800101 message
     * @return
     *     a new instance of MxAdmi00800101
     */
    public final static MxAdmi00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAdmi00800101 .class);
    }

}
