
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
 * Class for supl.011.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacosd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.011.001.08")
public class MxSupl01100108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCACOSD1", required = true)
    protected DTCCCACOSD1V08 dtcccacosd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountBalanceSD14 .class, CorporateActionConfirmationCashMovementDetailsSD5 .class, CorporateActionConfirmationDetailsSD2 .class, CorporateActionConfirmationSecuritiesMovementDetailsSD6 .class, CorporateActionGeneralInformationSD44 .class, CorporateActionSD20 .class, CreditDebitCode.class, DTCAdjustmentPaymentSubReason2Code.class, DTCAdjustmentPaymentType4Code.class, DTCCCACOSD1V08 .class, DTCCPayoutType4Code.class, DTCCPayoutType5Code.class, DTCCSubEventType8Code.class, DateAndDateTime2Choice.class, DateFormat48Choice.class, DateType8Code.class, EventGroup2Code.class, ExtendedEventType6Code.class, FinancialInstrumentAttributesSD17 .class, FinancialInstrumentQuantity15Choice.class, FractionDispositionType12Code.class, IdentificationSource4Choice.class, MxSupl01100108 .class, OptionTransactionSD6 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.011.001.08";

    public MxSupl01100108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01100108(final String xml) {
        this();
        MxSupl01100108 tmp = parse(xml);
        dtcccacosd1 = tmp.getDTCCCACOSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01100108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacosd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACOSD1V08 }
     *     
     */
    public DTCCCACOSD1V08 getDTCCCACOSD1() {
        return dtcccacosd1;
    }

    /**
     * Sets the value of the dtcccacosd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACOSD1V08 }
     *     
     */
    public MxSupl01100108 setDTCCCACOSD1(DTCCCACOSD1V08 value) {
        this.dtcccacosd1 = value;
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
    public static MxSupl01100108 parse(String xml) {
        return ((MxSupl01100108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01100108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl01100108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl01100108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01100108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01100108 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01100108) parserImpl.read(MxSupl01100108 .class, xml, _classes));
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
     * Creates an MxSupl01100108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01100108 message
     * @return
     *     a new instance of MxSupl01100108
     */
    public static final MxSupl01100108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl01100108 .class);
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
