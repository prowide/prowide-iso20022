
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.021.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.021.001.01")
public class MxSetr02100101
    extends AbstractMX
{

    @XmlElement(name = "Ordr", required = true)
    protected Order ordr;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement1 .class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection1 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, AutoRouting1Code.class, BICOrCountryCodeChoice.class, BenchmarkCurve1 .class, BenchmarkCurveName1Code.class, Booking1 .class, BookingType1Code.class, BookingUnit1Choice.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashMarginOrder1Code.class, CashParties1 .class, ClearingFeeType1Code.class, Commission2 .class, CommissionType1Choice.class, CommissionType8Code.class, CommissionValueType1Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyAndAmount.class, CurrencyExchange4 .class, CurrencyReferenceDetails.class, CustomerHandlingInstructionChoice.class, CustomerHandlingInstructions1Code.class, CustomerOrderCapacity1Code.class, Date1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType1Choice.class, DateType2Code.class, DayBookingInstruction1Code.class, Debt1 .class, DeliveryType1Code.class, DiscretionInstructions1 .class, DisplayInstruction1 .class, DisplayMethod1Code.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Eligibility1Code.class, Equity1 .class, EventGroup1 .class, EventType1Code.class, ExecutionTimeLimit1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, GoodTillBookingInstruction1Code.class, IdentificationType2Choice.class, InstrumentLeg3 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegalFramework1Code.class, LegalRestrictions1Code.class, MarketIdentification1 .class, MarketType1Code.class, MoneyLaunderingCheck1Code.class, MoveType1Code.class, MultiLegOrder1 .class, MultilegReportType1Code.class, MxSetr02100101 .class, NameAndAddress5 .class, OffsetType1Code.class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, Order.class, Order3 .class, OrderParameters1 .class, OrderQuantity1 .class, OrderQuantity3 .class, OrderQuantityType3Code.class, OrderType1Code.class, OrderType2Code.class, OtherAmounts1 .class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentification6Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PegOrderInstructions1 .class, PegType1Code.class, PositionEffect1Code.class, PostalAddress1 .class, PreAllocation1 .class, PreAllocationMethod1Code.class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceProtectionScope1Code.class, PriceProtectionScope2Code.class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, Priority1Code.class, ProductType1Code.class, PurposeCode1Choice.class, Quantity1Choice.class, QuantityOrAmount1Choice.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType3Choice.class, Rating1 .class, Reference8 .class, RefreshTime1Code.class, RelativeSize1Code.class, Reporting1Code.class, Revaluation1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesExecutionInstructions1 .class, SecuritiesFinancing1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesSettlement1 .class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementDate2Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, SingleOrMultiLegOrderChoice.class, SingleOrder1 .class, SpreadRate1 .class, StandardisationCode.class, StayOnSideType1Code.class, StrategyParameters1 .class, Term1 .class, TerminationDate1Choice.class, TerminationType1Code.class, TimeUnit1Code.class, TradeRegulatoryTimeStampGroup.class, TradeTransactionCondition1Code.class, TradeTransactionCondition2Code.class, TradingCapacity3Code.class, TradingFloorOrderHandling1Code.class, TradingSession1 .class, TriggerAction1Code.class, TriggerPriceType1Code.class, TriggerType1Code.class, TriggeringInstructions.class, TypeOfDiscretionPrice1Code.class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.021.001.01";

    public MxSetr02100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02100101(final String xml) {
        this();
        MxSetr02100101 tmp = parse(xml);
        ordr = tmp.getOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordr property.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrdr() {
        return ordr;
    }

    /**
     * Sets the value of the ordr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public MxSetr02100101 setOrdr(Order value) {
        this.ordr = value;
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
    public static MxSetr02100101 parse(String xml) {
        return ((MxSetr02100101) MxReadImpl.parse(MxSetr02100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02100101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02100101) parserImpl.read(MxSetr02100101 .class, xml, _classes));
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
     * Creates an MxSetr02100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02100101 message
     * @return
     *     a new instance of MxSetr02100101
     */
    public final static MxSetr02100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr02100101 .class);
    }

}
