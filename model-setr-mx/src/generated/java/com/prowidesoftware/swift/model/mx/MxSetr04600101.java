
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
 * Class for setr.046.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrStsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.046.001.01")
public class MxSetr04600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrStsReq", required = true)
    protected OrderStatusRequest ordrStsReq;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 46;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement1 .class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, BICOrCountryCodeChoice.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashParties1 .class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyAndAmount.class, Date1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType2Code.class, Debt1 .class, DeliveryType1Code.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Equity1 .class, EventGroup1 .class, EventType1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, IdentificationType2Choice.class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegalFramework1Code.class, LegalRestrictions1Code.class, MxSetr04600101 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, OrderIdentification3 .class, OrderStatusRequest.class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PostalAddress1 .class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, ProductType1Code.class, PurposeCode1Choice.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType3Choice.class, Rating1 .class, Revaluation1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesFinancing1 .class, SecuritiesPaymentStatus1Code.class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, SpreadRate1 .class, StandardisationCode.class, Term1 .class, TerminationDate1Choice.class, TerminationType1Code.class, TimeUnit1Code.class, TradeTransactionCondition2Code.class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.046.001.01";

    public MxSetr04600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr04600101(final String xml) {
        this();
        MxSetr04600101 tmp = parse(xml);
        ordrStsReq = tmp.getOrdrStsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr04600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrStsReq property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusRequest }
     *     
     */
    public OrderStatusRequest getOrdrStsReq() {
        return ordrStsReq;
    }

    /**
     * Sets the value of the ordrStsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusRequest }
     *     
     */
    public MxSetr04600101 setOrdrStsReq(OrderStatusRequest value) {
        this.ordrStsReq = value;
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
    public static MxSetr04600101 parse(String xml) {
        return ((MxSetr04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr04600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr04600101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr04600101) parserImpl.read(MxSetr04600101 .class, xml, _classes));
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
     * Creates an MxSetr04600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr04600101 message
     * @return
     *     a new instance of MxSetr04600101
     */
    public static final MxSetr04600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr04600101 .class);
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
