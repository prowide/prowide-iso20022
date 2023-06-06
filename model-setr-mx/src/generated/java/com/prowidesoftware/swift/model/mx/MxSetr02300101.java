
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
 * Class for setr.023.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.023.001.01")
public class MxSetr02300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrModReq", required = true)
    protected OrderModificationRequest ordrModReq;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 23;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement1 .class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection1 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, AutoRouting1Code.class, BICOrCountryCodeChoice.class, BenchmarkCurve1 .class, BenchmarkCurveName1Code.class, Booking1 .class, BookingType1Code.class, BookingUnit1Choice.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashMarginOrder1Code.class, CashParties1 .class, ClearingFeeType1Code.class, Commission2 .class, CommissionType1Choice.class, CommissionType8Code.class, CommissionValueType1Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyAndAmount.class, CurrencyExchange4 .class, CurrencyReferenceDetails.class, CustomerHandlingInstructionChoice.class, CustomerHandlingInstructions1Code.class, CustomerOrderCapacity1Code.class, Date1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType1Choice.class, DateType2Code.class, DayBookingInstruction1Code.class, Debt1 .class, DeliveryType1Code.class, DiscretionInstructions1 .class, DisplayInstruction1 .class, DisplayMethod1Code.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Eligibility1Code.class, Equity1 .class, EventGroup1 .class, EventType1Code.class, ExecutionTimeLimit1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, GoodTillBookingInstruction1Code.class, IdentificationType2Choice.class, InstrumentLeg3 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegalFramework1Code.class, LegalRestrictions1Code.class, MarketIdentification1 .class, MarketType1Code.class, MoneyLaunderingCheck1Code.class, MoveType1Code.class, MultiLegOrder1 .class, MultilegReportType1Code.class, MxSetr02300101 .class, NameAndAddress5 .class, OffsetType1Code.class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, Order3 .class, OrderModificationRequest.class, OrderParameters1 .class, OrderQuantity1 .class, OrderQuantity3 .class, OrderQuantityType3Code.class, OrderType1Code.class, OtherAmounts1 .class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentification6Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PegOrderInstructions1 .class, PegType1Code.class, PositionEffect1Code.class, PostalAddress1 .class, PreAllocation1 .class, PreAllocationMethod1Code.class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceProtectionScope1Code.class, PriceProtectionScope2Code.class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, Priority1Code.class, ProductType1Code.class, PurposeCode1Choice.class, Quantity1Choice.class, QuantityOrAmount1Choice.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType3Choice.class, Rating1 .class, Reference10 .class, RefreshTime1Code.class, RelativeSize1Code.class, Reporting1Code.class, Revaluation1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesExecutionInstructions1 .class, SecuritiesFinancing1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesSettlement1 .class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementDate2Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, SingleOrMultiLegOrderChoice.class, SingleOrder1 .class, SpreadRate1 .class, StandardisationCode.class, StayOnSideType1Code.class, StrategyParameters1 .class, Term1 .class, TerminationDate1Choice.class, TerminationType1Code.class, TimeUnit1Code.class, TradeRegulatoryTimeStampGroup.class, TradeTransactionCondition1Code.class, TradeTransactionCondition2Code.class, TradingCapacity3Code.class, TradingFloorOrderHandling1Code.class, TradingSession1 .class, TypeOfDiscretionPrice1Code.class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.023.001.01";

    public MxSetr02300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02300101(final String xml) {
        this();
        MxSetr02300101 tmp = parse(xml);
        ordrModReq = tmp.getOrdrModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrModReq property.
     * 
     * @return
     *     possible object is
     *     {@link OrderModificationRequest }
     *     
     */
    public OrderModificationRequest getOrdrModReq() {
        return ordrModReq;
    }

    /**
     * Sets the value of the ordrModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderModificationRequest }
     *     
     */
    public MxSetr02300101 setOrdrModReq(OrderModificationRequest value) {
        this.ordrModReq = value;
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
    public static MxSetr02300101 parse(String xml) {
        return ((MxSetr02300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr02300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr02300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02300101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02300101) parserImpl.read(MxSetr02300101 .class, xml, _classes));
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
     * Creates an MxSetr02300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02300101 message
     * @return
     *     a new instance of MxSetr02300101
     */
    public static final MxSetr02300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr02300101 .class);
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
