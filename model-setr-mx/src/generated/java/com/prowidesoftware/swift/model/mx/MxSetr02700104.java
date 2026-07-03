
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
 * Class for setr.027.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.027.001.04")
public class MxSetr02700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConf", required = true)
    protected SecuritiesTradeConfirmationV04 sctiesTradConf;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification55Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, Agreement5 .class, AlternatePartyIdentification10 .class, AlternatePartyIdentification8 .class, AmountAndDirection28 .class, AmountAndDirection29 .class, AmountAndDirection5 .class, AmountOrPercentageRange1 .class, AmountOrRate1Choice.class, AmountOrRate2Choice.class, Appearance1Code.class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, BorrowingReason1Code.class, BorrowingReason2Choice.class, BusinessProcessType1Code.class, BusinessProcessType2Choice.class, CalculationType1Code.class, CallIn1Code.class, CashAccountIdentification5Choice.class, CashMarginOrder1Code.class, CashParties33 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ChargeTaxBasis1Code.class, ChargeTaxBasisType2Choice.class, ClassificationType32Choice.class, Clearing5 .class, ClearingAccountType1Code.class, ClearingSide1Code.class, ClosingDate4Choice.class, ClosingType1Code.class, CollateralType3Code.class, CollateralType4Choice.class, Commission24 .class, CommissionType6Choice.class, CommissionType9Code.class, ConfirmationParties6 .class, ConfirmationPartyDetails10 .class, ConfirmationPartyDetails7 .class, ConfirmationPartyDetails8 .class, ConfirmationPartyDetails9 .class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, Date3Choice.class, DateAndDateTime1Choice.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, DateTimePeriod2 .class, DateType2Code.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryType2Code.class, DocumentNumber17Choice.class, EUCapitalGain2Code.class, EUCapitalGainType3Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType18Choice.class, ExposureType3Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentAttributes124 .class, FinancialInstrumentQuantity18Choice.class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentStipulations4 .class, ForeignExchangeTerms18 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency1Code.class, Frequency23Choice.class, FutureAndOptionContractType1Code.class, FutureOrOptionDetails3 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification7 .class, IdentificationReference8Choice.class, IdentificationSource3Choice.class, IdentificationType42Choice.class, IdentificationType43Choice.class, InterestComputationMethod1Code.class, InterestComputationMethod2Code.class, InterestComputationMethod3Choice.class, InterestComputationMethodFormat4Choice.class, InterestType2Code.class, InvestorCapacity4Choice.class, LegalFramework1Code.class, LendingTransactionMethod1Code.class, LendingTransactionMethod2Choice.class, LetterOfGuarantee4Choice.class, Linkages52 .class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification3Choice.class, MarketIdentification93 .class, MarketIdentification97 .class, MarketType18Choice.class, MarketType2Code.class, MarketType6Code.class, MarketType8Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, ModificationCancellationAllowed4Choice.class, MxSetr02700104 .class, NameAndAddress13 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number1Choice.class, Number24Choice.class, NumberCount1Choice.class, Operation1Code.class, Operator1Code.class, OptionRight1Code.class, OptionRight2Choice.class, OptionStyle10Choice.class, OptionStyle4Code.class, OptionType1Code.class, OptionType6Choice.class, Order24 .class, OriginalAndCurrentQuantities1 .class, OtherAmounts16 .class, OtherIdentification1 .class, OtherParties32 .class, OtherPrices5 .class, OwnershipLegalRestrictions1Code.class, PartialFill4 .class, PartyIdentification116Choice.class, PartyIdentification117 .class, PartyIdentification117Choice.class, PartyIdentification118 .class, PartyIdentification127Choice.class, PartyIdentification245Choice.class, PartyIdentificationAndAccount148 .class, PartyIdentificationAndAccount149 .class, PartyIdentificationAndAccount150 .class, PartyIdentificationAndAccount151 .class, PartyIdentificationAndAccount152 .class, PartyIdentificationAndAccount154 .class, PartyIdentificationAndAccount155 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PartyTextInformation5 .class, PositionEffect2Code.class, PostalAddress1 .class, PostalAddress8 .class, Price14 .class, PriceInformation28 .class, PriceRateOrAmount3Choice.class, PriceValueType7Code.class, PriorityNumeric4Choice.class, PurposeCode9Choice.class, Quantity6Choice.class, QuantityBreakdown76 .class, QuantityOrAmount2Choice.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, Rating1 .class, Registration1Code.class, Registration9Choice.class, RegistrationParameters3 .class, RegulatoryStipulations1 .class, Reporting2Code.class, Reporting6Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, Revaluation3Choice.class, Reversible1Code.class, Reversible2Choice.class, SecuritiesAccount20 .class, SecuritiesAccount35 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesCertificate3 .class, SecuritiesFinancing12 .class, SecuritiesLendingType1Code.class, SecuritiesLendingType2Choice.class, SecuritiesRTGS4Choice.class, SecuritiesTradeConfirmationV04 .class, SecurityIdentification19 .class, SettlementDate16Choice.class, SettlementDate5Code.class, SettlementDateCode12Choice.class, SettlementDetails213 .class, SettlementInstructionGeneration1Code.class, SettlementInstructionGeneration2Choice.class, SettlementParties59 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition31Choice.class, SettlementTransactionCondition7Code.class, SettlementTransactionType3Choice.class, SettlementTransactionType7Code.class, SettlingCapacity1Code.class, SettlingCapacity9Choice.class, Side3Code.class, SimpleIdentificationInformation2 .class, SpreadRate1 .class, StandingSettlementInstruction13 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, Term1 .class, TotalNumber1 .class, Tracking4Choice.class, TradeDate7Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TradeRegulatoryConditions1Code.class, TradeTransactionCondition2Code.class, TradeTransactionCondition9Choice.class, TradeType3Code.class, TradeType4Choice.class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingDate1Code.class, TradingDateCode2Choice.class, TradingPartyCapacity3Choice.class, TradingPartyCapacity4Choice.class, TransactiontIdentification4 .class, TwoLegTransactionDetails5 .class, TwoLegTransactionType4Choice.class, TypeOfIdentification1Code.class, TypeOfIdentification2Code.class, TypeOfPrice3Code.class, TypeOfPrice47Choice.class, UnderlyingFinancialInstrument7 .class, UnderlyingRatio2 .class, UnitOfMeasure1Code.class, YieldCalculation7 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.027.001.04";

    public MxSetr02700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr02700104(final String xml) {
        this();
        MxSetr02700104 tmp = parse(xml);
        sctiesTradConf = tmp.getSctiesTradConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr02700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationV04 }
     *     
     */
    public SecuritiesTradeConfirmationV04 getSctiesTradConf() {
        return sctiesTradConf;
    }

    /**
     * Sets the value of the sctiesTradConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationV04 }
     *     
     */
    public MxSetr02700104 setSctiesTradConf(SecuritiesTradeConfirmationV04 value) {
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
    public static MxSetr02700104 parse(String xml) {
        return ((MxSetr02700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr02700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr02700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr02700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr02700104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr02700104) parserImpl.read(MxSetr02700104 .class, xml, _classes));
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
     * Creates an MxSetr02700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr02700104 message
     * @return
     *     a new instance of MxSetr02700104
     */
    public final static MxSetr02700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr02700104 .class);
    }

}
