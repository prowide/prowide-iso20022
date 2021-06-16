
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
 * Class for sese.033.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.002.09")
public class MxSese03300209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstruction002V09 sctiesFincgInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AffirmationStatus1Code.class, AffirmationStatus9Choice.class, AlternatePartyIdentification9 .class, AmountAndDirection44 .class, AmountAndDirection58 .class, AmountAndDirection59 .class, AmountAndDirection96 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties38 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, Counterparty14Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateCode32Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber6Choice.class, Eligibility1Code.class, EventFrequency3Code.class, FXStandingInstruction5Choice.class, FinancialInstrumentAttributes97 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms23 .class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LegalFramework1Code.class, LegalFramework4Choice.class, Linkages55 .class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus1Code.class, MatchingStatus28Choice.class, MxSese03300209 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number23Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts43 .class, OtherIdentification2 .class, OtherParties35 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity4Choice.class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification147Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification162 .class, PartyIdentificationAndAccount176 .class, PartyIdentificationAndAccount177 .class, PartyIdentificationAndAccount178 .class, PartyIdentificationAndAccount179 .class, PartyIdentificationAndAccount180 .class, PartyIdentificationAndAccount181 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, Quantity10Choice.class, QuantityAndAccount86 .class, QuantityBreakdown48 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType67Choice.class, References50Choice.class, Reporting11Choice.class, Reporting3Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, RevaluationIndicator4Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesFinancingInstruction002V09 .class, SecuritiesFinancingTransactionDetails46 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesTradeDetails102 .class, SecurityIdentification20 .class, SettlementDetails152 .class, SettlementParties81 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase5Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition22Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StandingSettlementInstruction17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TerminationDate7Choice.class, TotalNumber1 .class, Tracking5Choice.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TransactionTypeAndAdditionalParameters18 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.033.002.09";

    public MxSese03300209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300209(final String xml) {
        this();
        MxSese03300209 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstruction002V09 }
     *     
     */
    public SecuritiesFinancingInstruction002V09 getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstruction002V09 }
     *     
     */
    public MxSese03300209 setSctiesFincgInstr(SecuritiesFinancingInstruction002V09 value) {
        this.sctiesFincgInstr = value;
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
    public static MxSese03300209 parse(String xml) {
        return ((MxSese03300209) MxReadImpl.parse(MxSese03300209 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300209 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300209) parserImpl.read(MxSese03300209 .class, xml, _classes));
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
     * Creates an MxSese03300209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300209 message
     * @return
     *     a new instance of MxSese03300209
     */
    public final static MxSese03300209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03300209 .class);
    }

}
