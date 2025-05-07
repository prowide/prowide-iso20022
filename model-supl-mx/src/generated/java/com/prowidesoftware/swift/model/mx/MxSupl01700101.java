
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
 * Class for supl.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.017.001.01")
public class MxSupl01700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PmtSD1", required = true)
    protected PaymentSD1V01 pmtSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AttendanceContext1Code.class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, CardAmountAndCurrencyExchange1 .class, CardDataReading1Code.class, CardPaymentServiceType2Code.class, CardPaymentTransactionDetails8 .class, CardholderAuthentication2 .class, CardholderVerificationCapability1Code.class, CashAccount24 .class, CashAccountType2Choice.class, CurrencyExchange3 .class, DisplayCapabilities1 .class, GenericAccountIdentification1 .class, GenericIdentification32 .class, MxSupl01700101 .class, OnLineCapability1Code.class, POIComponentType1Code.class, PartyType3Code.class, PartyType4Code.class, PaymentContext3 .class, PaymentSD1V01 .class, PlainCardData3 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, TransactionChannel1Code.class, TransactionData1 .class, TransactionEnvironment1Code.class, TypeOfAmount3Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.017.001.01";

    public MxSupl01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01700101(final String xml) {
        this();
        MxSupl01700101 tmp = parse(xml);
        pmtSD1 = tmp.getPmtSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pmtSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSD1V01 }
     *     
     */
    public PaymentSD1V01 getPmtSD1() {
        return pmtSD1;
    }

    /**
     * Sets the value of the pmtSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSD1V01 }
     *     
     */
    public MxSupl01700101 setPmtSD1(PaymentSD1V01 value) {
        this.pmtSD1 = value;
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
    public static MxSupl01700101 parse(String xml) {
        return ((MxSupl01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl01700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01700101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01700101) parserImpl.read(MxSupl01700101 .class, xml, _classes));
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
     * Creates an MxSupl01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01700101 message
     * @return
     *     a new instance of MxSupl01700101
     */
    public final static MxSupl01700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl01700101 .class);
    }

}
