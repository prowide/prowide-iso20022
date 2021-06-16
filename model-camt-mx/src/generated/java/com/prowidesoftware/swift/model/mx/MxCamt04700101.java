
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
 * Class for camt.047.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04700101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.047.001.01")
public class MxCamt04700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.047.001.01", required = true)
    protected Camt04700101 camt04700101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 47;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AmountChoice.class, Camt04700101 .class, CashClearingSystem1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, ErrorHandling2 .class, LimitStatus1Code.class, MessageIdentification.class, MxCamt04700101 .class, QueryReference.class, ReservationDetails1 .class, ReservationIdentificationDetails1 .class, ReservationReport1 .class, ReservationType1Code.class, Reservations1 .class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.047.001.01";

    public MxCamt04700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04700101(final String xml) {
        this();
        MxCamt04700101 tmp = parse(xml);
        camt04700101 = tmp.getCamt04700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04700101 }
     *     
     */
    public Camt04700101 getCamt04700101() {
        return camt04700101;
    }

    /**
     * Sets the value of the camt04700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04700101 }
     *     
     */
    public MxCamt04700101 setCamt04700101(Camt04700101 value) {
        this.camt04700101 = value;
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
    public static MxCamt04700101 parse(String xml) {
        return ((MxCamt04700101) MxReadImpl.parse(MxCamt04700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04700101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04700101) parserImpl.read(MxCamt04700101 .class, xml, _classes));
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
     * Creates an MxCamt04700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04700101 message
     * @return
     *     a new instance of MxCamt04700101
     */
    public final static MxCamt04700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04700101 .class);
    }

}
