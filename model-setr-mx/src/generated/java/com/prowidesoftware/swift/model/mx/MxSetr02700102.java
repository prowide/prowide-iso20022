
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for setr.027.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.027.001.02")
public class MxSetr02700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConf", required = true)
    protected SecuritiesTradeConfirmationV02 sctiesTradConf;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Agreement3 .class, AlternatePartyIdentification5 .class, AlternatePartyIdentification6 .class, AmountAndDirection28 .class, AmountAndDirection29 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, AmountOrRate2Choice.class, Appearance1Code.class, AutoBorrowing1Code.class, AutomaticBorrowing5Choice.class, BeneficialOwnership3Choice.class, BlockTrade1Code.class, BlockTrade3Choice.class, BorrowingReason1Choice.class, BorrowingReason1Code.class, BusinessProcessType1Choice.class, BusinessProcessType1Code.class, CalculationType1Code.class, CallIn1Code.class, CashAccountIdentification2Choice.class, CashAccountIdentification5Choice.class, CashMarginOrder1Code.class, CashParties18 .class, CashSettlementSystem2Code.class, CashSettlementSystem3Choice.class, CentralCounterPartyEligibility3Choice.class, ChargeTaxBasis1Code.class, ChargeTaxBasisType1Choice.class, ClassificationType30Choice.class, Clearing3 .class, ClearingAccountType1Code.class, ClearingSide1Code.class, ClosingDate1Choice.class, ClosingType1Code.class, CollateralType1Choice.class, CollateralType3Code.class, Commission16 .class, CommissionType2Choice.class, CommissionType9Code.class, ConfirmationParties2 .class, ConfirmationPartyDetails1 .class, ConfirmationPartyDetails2 .class, ConfirmationPartyDetails3 .class, ConfirmationPartyDetails5 .class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, Date2Choice.class, DateAndDateTime1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType2Code.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryType2Code.class, DocumentNumber4Choice.class, EUCapitalGain2Code.class, EUCapitalGainType2Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType3Code.class, ExposureType9Choice.class, FXStandingInstruction3Choice.class, FinancialInstrumentAttributes44 .class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations2 .class, ForeignExchangeTerms18 .class, FormOfSecurity1Code.class, FormOfSecurity4Choice.class, Frequency1Code.class, Frequency7Choice.class, FutureAndOptionContractType1Code.class, FutureOrOptionDetails1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification38 .class, GenericIdentification7 .class, IdentificationReference8Choice.class, IdentificationSource3Choice.class, IdentificationType40Choice.class, IdentificationType41Choice.class, InterestComputationMethod1Code.class, InterestComputationMethod2Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat3Choice.class, InterestType2Code.class, InvestorCapacity3Choice.class, LegalFramework1Code.class, LendingTransactionMethod1Choice.class, LendingTransactionMethod1Code.class, LetterOfGuarantee3Choice.class, Linkages15 .class, MarketClientSide3Choice.class, MarketClientSideCode.class, MarketIdentification13 .class, MarketIdentification3Choice.class, MarketIdentification77 .class, MarketType11Choice.class, MarketType12Choice.class, MarketType2Code.class, MarketType6Code.class, MatchingStatus1Code.class, MatchingStatus8Choice.class, ModificationCancellationAllowed3Choice.class, MxSetr02700102 .class, NameAndAddress13 .class, NameAndAddress5 .class, NettingEligibility3Choice.class, Number1Choice.class, Number21Choice.class, NumberCount1Choice.class, Operation1Code.class, Operator1Code.class, OptionRight1Choice.class, OptionRight1Code.class, OptionStyle4Code.class, OptionStyle6Choice.class, OptionType1Code.class, OptionType4Choice.class, Order14 .class, OriginalAndCurrentQuantities1 .class, OtherAmounts16 .class, OtherIdentification1 .class, OtherParties18 .class, OtherPrices1 .class, OwnershipLegalRestrictions1Code.class, PartialFill1 .class, PartyIdentification32Choice.class, PartyIdentification35Choice.class, PartyIdentification54 .class, PartyIdentification55 .class, PartyIdentification68Choice.class, PartyIdentification70Choice.class, PartyIdentificationAndAccount34 .class, PartyIdentificationAndAccount77 .class, PartyIdentificationAndAccount78 .class, PartyIdentificationAndAccount79 .class, PartyIdentificationAndAccount80 .class, PartyIdentificationAndAccount83 .class, PartyIdentificationAndAccount87 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PartyTextInformation5 .class, PositionEffect2Code.class, PostalAddress1 .class, PostalAddress8 .class, Price4 .class, PriceInformation9 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, PriorityNumeric3Choice.class, PurposeCode5Choice.class, Quantity6Choice.class, QuantityBreakdown11 .class, QuantityOrAmount1Choice.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType19Choice.class, RateType1Code.class, Rating1 .class, Registration1Code.class, Registration6Choice.class, RegistrationParameters3 .class, RegulatoryStipulations1 .class, Reporting2Code.class, Reporting5Choice.class, RepurchaseType11Choice.class, RepurchaseType7Code.class, Restriction3Choice.class, Revaluation2Choice.class, Reversible1Choice.class, Reversible1Code.class, SecuritiesAccount20 .class, SecuritiesAccount3 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesCertificate3 .class, SecuritiesFinancing10 .class, SecuritiesLendingType1Choice.class, SecuritiesLendingType1Code.class, SecuritiesRTGS3Choice.class, SecuritiesTradeConfirmationV02 .class, SecurityIdentification14 .class, SettlementDate5Code.class, SettlementDate8Choice.class, SettlementDateCode5Choice.class, SettlementDetails43 .class, SettlementInstructionGeneration1Choice.class, SettlementInstructionGeneration1Code.class, SettlementParties23 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase3Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod3Choice.class, SettlementTransactionCondition11Choice.class, SettlementTransactionCondition7Code.class, SettlementTransactionType1Choice.class, SettlementTransactionType7Code.class, SettlingCapacity1Code.class, SettlingCapacity3Choice.class, Side3Code.class, SimpleIdentificationInformation2 .class, SpreadRate1 .class, StandingSettlementInstruction9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty3Choice.class, TaxLiability1Code.class, Term1 .class, TotalNumber1 .class, Tracking3Choice.class, TradeDate1Choice.class, TradeDate4Choice.class, TradeDateCode1Choice.class, TradeRegulatoryConditions1Code.class, TradeTransactionCondition2Code.class, TradeTransactionCondition4Choice.class, TradeType3Choice.class, TradeType3Code.class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingDate1Code.class, TradingDateCode1Choice.class, TradingPartyCapacity1Choice.class, TradingPartyCapacity2Choice.class, TransactiontIdentification4 .class, TwoLegTransactionDetails1 .class, TwoLegTransactionType1Choice.class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class, TypeOfPrice10Choice.class, TypeOfPrice3Code.class, UnderlyingFinancialInstrument2 .class, UnderlyingRatio1 .class, UnitOfMeasure1Code.class, YieldCalculation2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.027.001.02";

    public MxSetr02700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02700102(final String xml) {
        this();
        MxSetr02700102 tmp = parse(xml);
        sctiesTradConf = tmp.getSctiesTradConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationV02 }
     *     
     */
    public SecuritiesTradeConfirmationV02 getSctiesTradConf() {
        return sctiesTradConf;
    }

    /**
     * Sets the value of the sctiesTradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationV02 }
     *     
     */
    public MxSetr02700102 setSctiesTradConf(SecuritiesTradeConfirmationV02 value) {
        this.sctiesTradConf = value;
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
    public static MxSetr02700102 parse(String xml) {
        return ((MxSetr02700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr02700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr02700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02700102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02700102) parserImpl.read(MxSetr02700102 .class, xml, _classes));
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
     * Creates an MxSetr02700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02700102 message
     * @return
     *     a new instance of MxSetr02700102
     */
    public final static MxSetr02700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr02700102 .class);
    }

}
