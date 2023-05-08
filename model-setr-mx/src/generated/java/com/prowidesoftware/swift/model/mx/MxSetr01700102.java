
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
 * Class for setr.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "setr01700102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.017.001.02")
public class MxSetr01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "setr.017.001.02", required = true)
    protected Setr01700102 setr01700102;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, GenericIdentification1 .class, MxSetr01700102 .class, NameAndAddress5 .class, OrderStatus3Code.class, OrderStatusAndReason4 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedStatus4 .class, RejectedStatusReason4 .class, RejectedStatusReason4Code.class, Setr01700102 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.017.001.02";

    public MxSetr01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01700102(final String xml) {
        this();
        MxSetr01700102 tmp = parse(xml);
        setr01700102 = tmp.getSetr01700102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the setr01700102 property.
     * 
     * @return
     *     possible object is
     *     {@link Setr01700102 }
     *     
     */
    public Setr01700102 getSetr01700102() {
        return setr01700102;
    }

    /**
     * Sets the value of the setr01700102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Setr01700102 }
     *     
     */
    public MxSetr01700102 setSetr01700102(Setr01700102 value) {
        this.setr01700102 = value;
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
    public static MxSetr01700102 parse(String xml) {
        return ((MxSetr01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01700102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01700102) parserImpl.read(MxSetr01700102 .class, xml, _classes));
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
     * Creates an MxSetr01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01700102 message
     * @return
     *     a new instance of MxSetr01700102
     */
    public static final MxSetr01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01700102 .class);
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
