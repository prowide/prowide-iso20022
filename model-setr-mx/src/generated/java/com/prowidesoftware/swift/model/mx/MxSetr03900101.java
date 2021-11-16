
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
 * Class for setr.039.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "crossOrdrCclReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.039.001.01")
public class MxSetr03900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CrossOrdrCclReq", required = true)
    protected CrossOrderCancelRequest crossOrdrCclReq;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 39;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection1 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, BICOrCountryCodeChoice.class, BenchmarkCurve1 .class, BenchmarkCurveName1Code.class, Booking1 .class, BookingType1Code.class, BookingUnit1Choice.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashMarginOrder1Code.class, CashParties1 .class, ClearingFeeType1Code.class, Commission2 .class, CommissionType1Choice.class, CommissionValueType1Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, CrossOrder2 .class, CrossOrderCancel1 .class, CrossOrderCancelRequest.class, CrossType1Code.class, CurrencyAndAmount.class, CurrencyExchange4 .class, CurrencyReferenceDetails.class, CustomerOrderCapacity1Code.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType1Choice.class, DayBookingInstruction1Code.class, Debt1 .class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Eligibility1Code.class, Equity1 .class, EventGroup1 .class, EventType1Code.class, ExecutionTimeLimit1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, IdentificationType2Choice.class, InstrumentLeg2 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegSwapType1Code.class, LegalRestrictions1Code.class, MarketIdentification1 .class, MarketType1Code.class, MxSetr03900101 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, Order9 .class, OrderQuantity1 .class, OrderQuantity3 .class, OrderQuantityType3Code.class, OrderRestrictions1Code.class, OtherAmounts1 .class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentification6Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PositionEffect1Code.class, PostalAddress1 .class, PreAllocation1 .class, PreAllocationMethod1Code.class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, Prioritisation1Code.class, ProductType1Code.class, PurposeCode1Choice.class, Quantity1Choice.class, QuantityOrAmount1Choice.class, RateOrAbsoluteValue1Choice.class, Rating1 .class, Reference13 .class, RelativeSize1Code.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesSettlement1 .class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementDate2Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, StandardisationCode.class, Term1 .class, TimeUnit1Code.class, TradeTransactionCondition2Code.class, TradingCapacity3Code.class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.039.001.01";

    public MxSetr03900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr03900101(final String xml) {
        this();
        MxSetr03900101 tmp = parse(xml);
        crossOrdrCclReq = tmp.getCrossOrdrCclReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr03900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the crossOrdrCclReq property.
     * 
     * @return
     *     possible object is
     *     {@link CrossOrderCancelRequest }
     *     
     */
    public CrossOrderCancelRequest getCrossOrdrCclReq() {
        return crossOrdrCclReq;
    }

    /**
     * Sets the value of the crossOrdrCclReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossOrderCancelRequest }
     *     
     */
    public MxSetr03900101 setCrossOrdrCclReq(CrossOrderCancelRequest value) {
        this.crossOrdrCclReq = value;
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
    public static MxSetr03900101 parse(String xml) {
        return ((MxSetr03900101) MxReadImpl.parse(MxSetr03900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr03900101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr03900101) parserImpl.read(MxSetr03900101 .class, xml, _classes));
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
     * Creates an MxSetr03900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr03900101 message
     * @return
     *     a new instance of MxSetr03900101
     */
    public final static MxSetr03900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr03900101 .class);
    }

}
