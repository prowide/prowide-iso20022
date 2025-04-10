
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
 * Class for camt.049.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "delRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.049.001.02")
public class MxCamt04900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DelRsvatn", required = true)
    protected DeleteReservationV02 delRsvatn;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 49;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, CashClearingSystem1Code.class, DeleteReservationV02 .class, MessageIdentification.class, MxCamt04900102 .class, ReservationIdentificationDetails1 .class, ReservationType1Code.class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.049.001.02";

    public MxCamt04900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04900102(final String xml) {
        this();
        MxCamt04900102 tmp = parse(xml);
        delRsvatn = tmp.getDelRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the delRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteReservationV02 }
     *     
     */
    public DeleteReservationV02 getDelRsvatn() {
        return delRsvatn;
    }

    /**
     * Sets the value of the delRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteReservationV02 }
     *     
     */
    public MxCamt04900102 setDelRsvatn(DeleteReservationV02 value) {
        this.delRsvatn = value;
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
    public static MxCamt04900102 parse(String xml) {
        return ((MxCamt04900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04900102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04900102) parserImpl.read(MxCamt04900102 .class, xml, _classes));
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
     * Creates an MxCamt04900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04900102 message
     * @return
     *     a new instance of MxCamt04900102
     */
    public static final MxCamt04900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04900102 .class);
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
