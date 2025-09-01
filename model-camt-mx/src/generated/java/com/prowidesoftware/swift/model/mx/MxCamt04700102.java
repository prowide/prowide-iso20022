
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
 * Class for camt.047.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.047.001.02")
public class MxCamt04700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrRsvatn", required = true)
    protected ReturnReservationV02 rtrRsvatn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 47;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AmountChoice.class, CashClearingSystem1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, LimitStatus1Code.class, MessageIdentification.class, MxCamt04700102 .class, QueryReference.class, ReservationDetails1 .class, ReservationIdentificationDetails1 .class, ReservationReport2 .class, ReservationType1Code.class, Reservations2 .class, ReturnReservationV02 .class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.047.001.02";

    public MxCamt04700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04700102(final String xml) {
        this();
        MxCamt04700102 tmp = parse(xml);
        rtrRsvatn = tmp.getRtrRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReservationV02 }
     *     
     */
    public ReturnReservationV02 getRtrRsvatn() {
        return rtrRsvatn;
    }

    /**
     * Sets the value of the rtrRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReservationV02 }
     *     
     */
    public MxCamt04700102 setRtrRsvatn(ReturnReservationV02 value) {
        this.rtrRsvatn = value;
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
    public static MxCamt04700102 parse(String xml) {
        return ((MxCamt04700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04700102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04700102) parserImpl.read(MxCamt04700102 .class, xml, _classes));
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
     * Creates an MxCamt04700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04700102 message
     * @return
     *     a new instance of MxCamt04700102
     */
    public final static MxCamt04700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04700102 .class);
    }

}
