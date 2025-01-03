
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
 * Class for sese.033.002.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.002.11")
public class MxSese03300211
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstruction002V11 sctiesFincgInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AffirmationStatus1Code.class, AffirmationStatus9Choice.class, AlternatePartyIdentification9 .class, AmountAndDirection44 .class, AmountAndDirection58 .class, AmountAndDirection59 .class, AmountAndDirection96 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockChainAddressWallet7 .class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties38 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, Counterparty16Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateCode32Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber6Choice.class, Eligibility1Code.class, EventFrequency3Code.class, FXStandingInstruction5Choice.class, FinancialInstrumentAttributes122 .class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms23 .class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LegalFramework1Code.class, LegalFramework4Choice.class, Linkages65 .class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus1Code.class, MatchingStatus28Choice.class, MxSese03300211 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number23Choice.class, NumberCount2Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts43 .class, OtherIdentification2 .class, OtherParties44 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity6Choice.class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification147Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification162 .class, PartyIdentificationAndAccount177 .class, PartyIdentificationAndAccount178 .class, PartyIdentificationAndAccount181 .class, PartyIdentificationAndAccount206 .class, PartyIdentificationAndAccount208 .class, PartyIdentificationAndAccount209 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, Price11 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, Quantity54Choice.class, QuantityAndAccount104 .class, QuantityBreakdown69 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType67Choice.class, References50Choice.class, Reporting2Code.class, Reporting9Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, RevaluationIndicator4Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesFinancingInstruction002V11 .class, SecuritiesFinancingTransactionDetails46 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails125 .class, SecurityIdentification20 .class, SettlementDetails152 .class, SettlementParties105 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase5Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition22Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StandingSettlementInstruction19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TerminationDate7Choice.class, TotalNumber2 .class, Tracking5Choice.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TransactionTypeAndAdditionalParameters18 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.033.002.11";

    public MxSese03300211() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300211(final String xml) {
        this();
        MxSese03300211 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300211(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstruction002V11 }
     *     
     */
    public SecuritiesFinancingInstruction002V11 getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstruction002V11 }
     *     
     */
    public MxSese03300211 setSctiesFincgInstr(SecuritiesFinancingInstruction002V11 value) {
        this.sctiesFincgInstr = value;
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
    public static MxSese03300211 parse(String xml) {
        return ((MxSese03300211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03300211 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03300211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300211 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300211) parserImpl.read(MxSese03300211 .class, xml, _classes));
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
     * Creates an MxSese03300211 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300211 message
     * @return
     *     a new instance of MxSese03300211
     */
    public static final MxSese03300211 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03300211 .class);
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
