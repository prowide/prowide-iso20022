
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
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
 * Class for xsys.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys00300101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.003.001.01")
public class MxXsys00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "xsys.003.001.01", required = true)
    protected RefusalNotification xsys00300101;
    public static final transient String BUSINESS_PROCESS = "xsys";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {MxXsys00300101 .class, Notification.class, RefusalNotification.class, RefusalReasonNotification.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:xsys.003.001.01";

    public MxXsys00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys00300101(final String xml) {
        this();
        MxXsys00300101 tmp = parse(xml);
        xsys00300101 = tmp.getXsys00300101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys00300101 property.
     * 
     * @return
     *     possible object is
     *     {@link RefusalNotification }
     *     
     */
    public RefusalNotification getXsys00300101() {
        return xsys00300101;
    }

    /**
     * Sets the value of the xsys00300101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefusalNotification }
     *     
     */
    public MxXsys00300101 setXsys00300101(RefusalNotification value) {
        this.xsys00300101 = value;
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
    public static MxXsys00300101 parse(String xml) {
        return ((MxXsys00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxXsys00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxXsys00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys00300101 parse(String xml, MxRead parserImpl) {
        return ((MxXsys00300101) parserImpl.read(MxXsys00300101 .class, xml, _classes));
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
     * Creates an MxXsys00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys00300101 message
     * @return
     *     a new instance of MxXsys00300101
     */
    public static final MxXsys00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxXsys00300101 .class);
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
