
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
 * Class for sese.033.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.033.002.02")
public class MxSese03300202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstructionV02Subset sctiesFincgInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AffirmationStatus1Code.class, AffirmationStatus2Choice.class, AlternatePartyIdentification3 .class, AmountAndDirection13 .class, AmountAndDirection16 .class, AmountAndDirection17 .class, AutoBorrowing1Code.class, AutomaticBorrowing4Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashAccountIdentification6Choice.class, CashParties13 .class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClassificationType3Choice.class, Counterparty6Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber2Choice.class, Eligibility1Code.class, EventFrequency3Code.class, FXStandingInstruction2Choice.class, FinancialInstrumentAttributes28 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification34 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InvestorCapacity2Choice.class, LegalFramework1Code.class, LegalFramework2Choice.class, Linkages14 .class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketIdentification9 .class, MarketType2Code.class, MarketType5Choice.class, MarketType5Code.class, MarketType6Choice.class, MatchingStatus1Code.class, MatchingStatus5Choice.class, MxSese03300202 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, Number4Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts7 .class, OtherIdentification2 .class, OtherParties14 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity2Choice.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification59Choice.class, PartyIdentification61Choice.class, PartyIdentification64Choice.class, PartyIdentificationAndAccount49 .class, PartyIdentificationAndAccount59 .class, PartyIdentificationAndAccount60 .class, PartyIdentificationAndAccount61 .class, PartyIdentificationAndAccount62 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PaymentDirection3Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric2Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, Quantity10Choice.class, QuantityAndAccount24 .class, QuantityBreakdown7 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType8Choice.class, References16Choice.class, Reporting2Code.class, Reporting3Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, RevaluationIndicator2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesFinancingInstructionV02Subset.class, SecuritiesFinancingTransactionDetails4 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesTradeDetails11 .class, SecurityIdentification15 .class, SettlementDetails40 .class, SettlementParties17 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase2Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition8Choice.class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, StandingSettlementInstruction6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TerminationDate3Choice.class, TotalNumber1 .class, Tracking2Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeOriginator2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TransactionTypeAndAdditionalParameters4 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.033.002.02";

    public MxSese03300202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300202(final String xml) {
        this();
        MxSese03300202 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstructionV02Subset }
     *     
     */
    public SecuritiesFinancingInstructionV02Subset getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstructionV02Subset }
     *     
     */
    public MxSese03300202 setSctiesFincgInstr(SecuritiesFinancingInstructionV02Subset value) {
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
    public static MxSese03300202 parse(String xml) {
        return ((MxSese03300202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03300202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03300202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300202 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300202) parserImpl.read(MxSese03300202 .class, xml, _classes));
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
     * Creates an MxSese03300202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300202 message
     * @return
     *     a new instance of MxSese03300202
     */
    public static final MxSese03300202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03300202 .class);
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
