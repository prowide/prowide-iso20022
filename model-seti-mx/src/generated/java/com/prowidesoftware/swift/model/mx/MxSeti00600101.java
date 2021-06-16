
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
 * Class for seti.006.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "qtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seti.006.001.01")
public class MxSeti00600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "QtRspn", required = true)
    protected QuoteResponse qtRspn;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement1 .class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, BICOrCountryCodeChoice.class, BenchmarkCurve1 .class, BenchmarkCurveName1Code.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashParties1 .class, Commission2 .class, CommissionType1Choice.class, CommissionValueType1Code.class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyAndAmount.class, CustomerOrderCapacity1Code.class, Date1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType1Choice.class, DateType2Code.class, Debt1 .class, DeliveryType1Code.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Eligibility1Code.class, Equity1 .class, EventGroup1 .class, EventType1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, IdentificationType2Choice.class, InstrumentLeg2 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegSwapType1Code.class, LegalFramework1Code.class, LegalRestrictions1Code.class, MarketIdentification1 .class, MarketType1Code.class, MxSeti00600101 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, Order1 .class, OrderQuantity1 .class, OrderQuantityType3Code.class, OrderType1Code.class, OriginatorRole1Code.class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification24Choice.class, PartyIdentification25Choice.class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentification6Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PostalAddress1 .class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, ProductType1Code.class, PurposeCode1Choice.class, Qualifier1Code.class, Quantity1Choice.class, QuantityOrAmount1Choice.class, Quote4 .class, QuoteEntry2 .class, QuoteResponse.class, QuoteResponseType1Code.class, QuoteSet2 .class, QuoteSide1 .class, QuoteStatus1Code.class, QuoteStatus2 .class, QuoteType1Code.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType3Choice.class, Rating1 .class, Reference5 .class, RejectionReason3Code.class, RelativeSize1Code.class, ResponseLevel1Code.class, Revaluation1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesFinancing1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesSettlement1 .class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementDate2Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, SingleOrMassQuote2Choice.class, SingleQuote1 .class, SpreadRate1 .class, StandardisationCode.class, Term1 .class, TerminationDate1Choice.class, TerminationType1Code.class, TimeUnit1Code.class, TradeTransactionCondition2Code.class, TradingCapacity3Code.class, TradingSession1 .class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seti.006.001.01";

    public MxSeti00600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti00600101(final String xml) {
        this();
        MxSeti00600101 tmp = parse(xml);
        qtRspn = tmp.getQtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti00600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the qtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteResponse }
     *     
     */
    public QuoteResponse getQtRspn() {
        return qtRspn;
    }

    /**
     * Sets the value of the qtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteResponse }
     *     
     */
    public MxSeti00600101 setQtRspn(QuoteResponse value) {
        this.qtRspn = value;
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
    public static MxSeti00600101 parse(String xml) {
        return ((MxSeti00600101) MxReadImpl.parse(MxSeti00600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti00600101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti00600101) parserImpl.read(MxSeti00600101 .class, xml, _classes));
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
     * Creates an MxSeti00600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti00600101 message
     * @return
     *     a new instance of MxSeti00600101
     */
    public final static MxSeti00600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeti00600101 .class);
    }

}
