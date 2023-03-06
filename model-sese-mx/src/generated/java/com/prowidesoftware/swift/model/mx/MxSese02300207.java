
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
 * Class for sese.023.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.023.002.07")
public class MxSese02300207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxInstr", required = true)
    protected SecuritiesSettlementTransactionInstruction002V07 sctiesSttlmTxInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AffirmationStatus1Code.class, AffirmationStatus9Choice.class, AlternatePartyIdentification9 .class, AmountAndDirection58 .class, AmountAndDirection60 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties30 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, Counterparty10Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn4Choice.class, DocumentNumber6Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType17Choice.class, ExposureType4Code.class, FXStandingInstruction5Choice.class, FinancialInstrumentAttributes78 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, HoldIndicator7 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LetterOfGuarantee5Choice.class, Linkages43 .class, MarketClientSide5Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus1Code.class, MatchingStatus28Choice.class, ModificationCancellationAllowed5Choice.class, MxSese02300207 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number23Choice.class, NumberCount1Choice.class, OpeningClosing1Code.class, OpeningClosing4Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts35 .class, OtherIdentification2 .class, OtherParties29 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity4Choice.class, PartyIdentification103 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification111 .class, PartyIdentification113Choice.class, PartyIdentification119 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount131 .class, PartyIdentificationAndAccount133 .class, PartyIdentificationAndAccount134 .class, PartyIdentificationAndAccount135 .class, PartyIdentificationAndAccount136 .class, PartyIdentificationAndAccount137 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification2 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, Quantity10Choice.class, QuantityAndAccount56 .class, QuantityBreakdown38 .class, ReceiveDelivery1Code.class, References50Choice.class, Registration11Choice.class, Registration12Choice.class, Registration1Code.class, Registration2Code.class, RegistrationParameters5 .class, RegistrationReason6 .class, Reporting2Code.class, Reporting9Choice.class, RepurchaseType10Code.class, RepurchaseType26Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount27 .class, SecuritiesAccount30 .class, SecuritiesCertificate5 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesSettlementTransactionInstruction002V07 .class, SecuritiesTradeDetails63 .class, SecuritiesTransactionType17Code.class, SecuritiesTransactionType34Choice.class, SecurityIdentification20 .class, SettlementDate12Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails132 .class, SettlementParties44 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase5Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition28Choice.class, SettlementTransactionCondition5Code.class, SettlementTypeAndAdditionalParameters20 .class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StandingSettlementInstruction12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking5Choice.class, TradeDate6Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.023.002.07";

    public MxSese02300207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02300207(final String xml) {
        this();
        MxSese02300207 tmp = parse(xml);
        sctiesSttlmTxInstr = tmp.getSctiesSttlmTxInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02300207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionInstruction002V07 }
     *     
     */
    public SecuritiesSettlementTransactionInstruction002V07 getSctiesSttlmTxInstr() {
        return sctiesSttlmTxInstr;
    }

    /**
     * Sets the value of the sctiesSttlmTxInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionInstruction002V07 }
     *     
     */
    public MxSese02300207 setSctiesSttlmTxInstr(SecuritiesSettlementTransactionInstruction002V07 value) {
        this.sctiesSttlmTxInstr = value;
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
    public static MxSese02300207 parse(String xml) {
        return ((MxSese02300207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02300207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02300207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02300207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02300207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02300207 parse(String xml, MxRead parserImpl) {
        return ((MxSese02300207) parserImpl.read(MxSese02300207 .class, xml, _classes));
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
     * Creates an MxSese02300207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02300207 message
     * @return
     *     a new instance of MxSese02300207
     */
    public final static MxSese02300207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02300207 .class);
    }

}
