
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
 * Class for camt.048.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04800101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.048.001.01")
public class MxCamt04800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.048.001.01", required = true)
    protected Camt04800101 camt04800101;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 48;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AmountChoice.class, Camt04800101 .class, CashClearingSystem1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, MessageIdentification.class, MxCamt04800101 .class, ReservationDetails2 .class, ReservationIdentificationDetails1 .class, ReservationType1Code.class, SimpleIdentificationInformation.class, SystemIdentificationChoice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.048.001.01";

    public MxCamt04800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04800101(final String xml) {
        this();
        MxCamt04800101 tmp = parse(xml);
        camt04800101 = tmp.getCamt04800101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04800101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04800101 }
     *     
     */
    public Camt04800101 getCamt04800101() {
        return camt04800101;
    }

    /**
     * Sets the value of the camt04800101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04800101 }
     *     
     */
    public MxCamt04800101 setCamt04800101(Camt04800101 value) {
        this.camt04800101 = value;
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
    public static MxCamt04800101 parse(String xml) {
        return ((MxCamt04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04800101) parserImpl.read(MxCamt04800101 .class, xml, _classes));
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
     * Creates an MxCamt04800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04800101 message
     * @return
     *     a new instance of MxCamt04800101
     */
    public static final MxCamt04800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04800101 .class);
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
