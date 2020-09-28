
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for xsys.012.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys01200102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.012.001.02")
public class MxXsys01200102
    extends AbstractMX
{

    @XmlElement(name = "xsys.012.001.02", required = true)
    protected FailedDeliveryNotificationMessage xsys01200102;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DeliveryNotificationXsys01200102 .class, Extension.class, ExtensionEnvelope.class, FailedDeliveryNotificationMessage.class, MxXsys01200102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.012.001.02";

    public MxXsys01200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys01200102(final String xml) {
        this();
        MxXsys01200102 tmp = parse(xml);
        xsys01200102 = tmp.getXsys01200102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys01200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys01200102 property.
     * 
     * @return
     *     possible object is
     *     {@link FailedDeliveryNotificationMessage }
     *     
     */
    public FailedDeliveryNotificationMessage getXsys01200102() {
        return xsys01200102;
    }

    /**
     * Sets the value of the xsys01200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailedDeliveryNotificationMessage }
     *     
     */
    public MxXsys01200102 setXsys01200102(FailedDeliveryNotificationMessage value) {
        this.xsys01200102 = value;
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
    public static MxXsys01200102 parse(String xml) {
        return ((MxXsys01200102) MxReadImpl.parse(MxXsys01200102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys01200102 parse(String xml, MxRead parserImpl) {
        return ((MxXsys01200102) parserImpl.read(MxXsys01200102 .class, xml, _classes));
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
     * Creates an MxXsys01200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys01200102 message
     * @return
     *     a new instance of MxXsys01200102
     */
    public final static MxXsys01200102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxXsys01200102 .class);
    }

}
