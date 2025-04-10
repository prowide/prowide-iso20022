
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
 * Class for setr.012.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sbcptOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.012.002.01")
public class MxSetr01200201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SbcptOrdrConf", required = true)
    protected SubscriptionOrderConfirmationMinusV01 sbcptOrdrConf;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account8 .class, AccountIdentification1 .class, AccountIdentificationAndName4 .class, AdditionalReference5 .class, AlternateSecurityIdentification4 .class, CashAccountIdentification1 .class, Charge23 .class, ChargeType16Code.class, Commission14 .class, CommissionType6Code.class, CopyInformation3 .class, CreditTransfer7 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount6 .class, DeliveryReceiptType2Code.class, EUCapitalGain2Code.class, Extension1 .class, FinancialInstitutionIdentification6Choice.class, FinancialInstrument19 .class, FinancialInstrumentQuantity4 .class, ForeignExchangeTerms10 .class, FormOfSecurity1Code.class, FundSettlementParameters5 .class, GenericIdentification17 .class, IncomePreference1Code.class, Intermediary20 .class, InvestmentAccount32 .class, InvestmentAccount33 .class, InvestmentFundRole5Code.class, MessageIdentification3 .class, MxSetr01200201 .class, NameAndAddress11 .class, PartyIdentification26Choice.class, PartyIdentificationAndAccount13 .class, PaymentInstrument14Choice.class, PaymentTransaction28 .class, PlaceOfTradeIdentification3Choice.class, PostalAddress7 .class, PriceValue6 .class, ReceivingPartiesAndAccount5 .class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SecurityIdentification7Choice.class, SimpleIdentificationInformation.class, SimpleIdentificationInformation3 .class, SubscriptionExecution9 .class, SubscriptionMultipleExecution4 .class, SubscriptionOrderConfirmationMinusV01 .class, Tax20 .class, TaxType14Code.class, TaxableIncomePerShareCalculated2Code.class, TotalCharges5 .class, TotalCommissions4 .class, TotalTaxes5 .class, TypeOfPrice15Code.class, UnitPrice17 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:setr.012.002.01";

    public MxSetr01200201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01200201(final String xml) {
        this();
        MxSetr01200201 tmp = parse(xml);
        sbcptOrdrConf = tmp.getSbcptOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01200201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sbcptOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrderConfirmationMinusV01 }
     *     
     */
    public SubscriptionOrderConfirmationMinusV01 getSbcptOrdrConf() {
        return sbcptOrdrConf;
    }

    /**
     * Sets the value of the sbcptOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrderConfirmationMinusV01 }
     *     
     */
    public MxSetr01200201 setSbcptOrdrConf(SubscriptionOrderConfirmationMinusV01 value) {
        this.sbcptOrdrConf = value;
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
    public static MxSetr01200201 parse(String xml) {
        return ((MxSetr01200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01200201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01200201 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01200201) parserImpl.read(MxSetr01200201 .class, xml, _classes));
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
     * Creates an MxSetr01200201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01200201 message
     * @return
     *     a new instance of MxSetr01200201
     */
    public static final MxSetr01200201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01200201 .class);
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
