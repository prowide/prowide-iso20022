
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
 * Class for sese.032.002.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxGnrtnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.032.002.08")
public class MxSese03200208
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctn", required = true)
    protected SecuritiesSettlementTransactionGenerationNotification002V08 sctiesSttlmTxGnrtnNtfctn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 32;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AffirmationStatus1Code.class, AffirmationStatus9Choice.class, AlternatePartyIdentification9 .class, AmountAndDirection44 .class, AmountAndDirection58 .class, AmountAndDirection90 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties30 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn4Choice.class, DocumentNumber6Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType17Choice.class, ExposureType4Code.class, FXStandingInstruction5Choice.class, FailingReason10 .class, FailingReason11Choice.class, FailingReason2Code.class, FailingStatus12Choice.class, FinancialInstrumentAttributes97 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms23 .class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GeneratedReason3Code.class, GeneratedReason6 .class, GeneratedReasons6Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, HoldIndicator7 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LetterOfGuarantee5Choice.class, Linkages43 .class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus1Code.class, MatchingStatus28Choice.class, MatchingStatus32Choice.class, ModificationCancellationAllowed5Choice.class, MxSese03200208 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, NoReasonCode.class, Number23Choice.class, NumberCount1Choice.class, OpeningClosing1Code.class, OpeningClosing4Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts43 .class, OtherIdentification2 .class, OtherParties29 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity4Choice.class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification113Choice.class, PartyIdentification119 .class, PartyIdentification128 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount133 .class, PartyIdentificationAndAccount134 .class, PartyIdentificationAndAccount135 .class, PartyIdentificationAndAccount136 .class, PartyIdentificationAndAccount137 .class, PartyIdentificationAndAccount160 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PendingProcessingReason12 .class, PendingProcessingReason14Choice.class, PendingProcessingReason2Code.class, PendingProcessingStatus15Choice.class, PendingReason20 .class, PendingReason24 .class, PendingReason2Code.class, PendingReason37Choice.class, PendingReason41Choice.class, PendingReason6Code.class, PendingStatus46Choice.class, PendingStatus50Choice.class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification2 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType5Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProcessingStatus62Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity10Choice.class, QuantityAndAccount69 .class, QuantityBreakdown48 .class, ReceiveDelivery1Code.class, References50Choice.class, Registration11Choice.class, Registration12Choice.class, Registration1Code.class, Registration2Code.class, RegistrationParameters7 .class, RegistrationReason6 .class, RepairReason12 .class, RepairReason14Choice.class, RepairReason4Code.class, RepairStatus16Choice.class, Reporting2Code.class, Reporting9Choice.class, RepurchaseType10Code.class, RepurchaseType26Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesCertificate5 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesSettlementTransactionGenerationNotification002V08 .class, SecuritiesTradeDetails87 .class, SecuritiesTransactionType20Code.class, SecuritiesTransactionType42Choice.class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails156 .class, SettlementParties64 .class, SettlementStatus22Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition29Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlementTypeAndIdentification24 .class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StatusAndReason29 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking5Choice.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, UnmatchedReason11Code.class, UnmatchedReason20 .class, UnmatchedReason27Choice.class, UnmatchedStatus21Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.032.002.08";

    public MxSese03200208() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03200208(final String xml) {
        this();
        MxSese03200208 tmp = parse(xml);
        sctiesSttlmTxGnrtnNtfctn = tmp.getSctiesSttlmTxGnrtnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03200208(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionGenerationNotification002V08 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V08 getSctiesSttlmTxGnrtnNtfctn() {
        return sctiesSttlmTxGnrtnNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionGenerationNotification002V08 }
     *     
     */
    public MxSese03200208 setSctiesSttlmTxGnrtnNtfctn(SecuritiesSettlementTransactionGenerationNotification002V08 value) {
        this.sctiesSttlmTxGnrtnNtfctn = value;
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
    public static MxSese03200208 parse(String xml) {
        return ((MxSese03200208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03200208 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03200208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03200208 parse(String xml, MxRead parserImpl) {
        return ((MxSese03200208) parserImpl.read(MxSese03200208 .class, xml, _classes));
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
     * Creates an MxSese03200208 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03200208 message
     * @return
     *     a new instance of MxSese03200208
     */
    public static final MxSese03200208 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03200208 .class);
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
