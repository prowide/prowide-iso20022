
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
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
 * Class for xsys.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys01100101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.011.001.01")
public class MxXsys01100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "xsys.011.001.01", required = true)
    protected DeliveryNotificationMessage xsys01100101;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DeliveryNotificationMessage.class, DeliveryNotificationXsys01100101 .class, MxXsys01100101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.011.001.01";

    public MxXsys01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys01100101(final String xml) {
        this();
        MxXsys01100101 tmp = parse(xml);
        xsys01100101 = tmp.getXsys01100101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys01100101 property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNotificationMessage }
     *     
     */
    public DeliveryNotificationMessage getXsys01100101() {
        return xsys01100101;
    }

    /**
     * Sets the value of the xsys01100101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNotificationMessage }
     *     
     */
    public MxXsys01100101 setXsys01100101(DeliveryNotificationMessage value) {
        this.xsys01100101 = value;
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
    public static MxXsys01100101 parse(String xml) {
        return ((MxXsys01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxXsys01100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxXsys01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys01100101 parse(String xml, MxRead parserImpl) {
        return ((MxXsys01100101) parserImpl.read(MxXsys01100101 .class, xml, _classes));
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
     * Creates an MxXsys01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys01100101 message
     * @return
     *     a new instance of MxXsys01100101
     */
    public final static MxXsys01100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxXsys01100101 .class);
    }

}
