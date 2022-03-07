
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
 * Class for sese.032.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxGnrtnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.032.002.01")
public class MxSese03200201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctn", required = true)
    protected SecuritiesSettlementTransactionGenerationNotification002V01 sctiesSttlmTxGnrtnNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus6Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AffirmationStatus1Code.class, AffirmationStatus2Choice.class, AlternateIdentification2 .class, AlternatePartyIdentification3 .class, AmountAndDirection16 .class, AmountAndDirection17 .class, AutoBorrowing1Code.class, AutomaticBorrowing4Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashAccountIdentification6Choice.class, CashParties4 .class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClassificationType3Choice.class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn2Choice.class, DocumentIdentification16 .class, DocumentNumber2Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType1Code.class, ExposureType2Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FXStandingInstruction2Choice.class, FailingReason1Code.class, FailingReason2 .class, FailingReason2Choice.class, FailingStatus2Choice.class, FinancialInstrumentAttributes14 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GeneratedReason2 .class, GeneratedReason2Code.class, GeneratedReasons2Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InvestorCapacity2Choice.class, LetterOfGuarantee2Choice.class, Linkages4 .class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketIdentification9 .class, MarketType2Code.class, MarketType5Choice.class, MarketType5Code.class, MarketType6Choice.class, MatchingStatus1Code.class, MatchingStatus5Choice.class, MatchingStatus6Choice.class, ModificationCancellationAllowed2Choice.class, MxSese03200201 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, NoSpecifiedReason1 .class, Number4Choice.class, NumberCount1Choice.class, OpeningClosing1Code.class, OpeningClosing2Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts7 .class, OtherParties7 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity2Choice.class, PartyIdentification16Choice.class, PartyIdentification17Choice.class, PartyIdentification18Choice.class, PartyIdentification31Choice.class, PartyIdentification4 .class, PartyIdentificationAndAccount26 .class, PartyIdentificationAndAccount27 .class, PartyIdentificationAndAccount28 .class, PartyIdentificationAndAccount29 .class, PartyIdentificationAndAccount30 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PaymentDirection3Choice.class, PendingProcessingReason1Code.class, PendingProcessingReason2 .class, PendingProcessingReason2Choice.class, PendingProcessingStatus2Choice.class, PendingReason10Choice.class, PendingReason1Code.class, PendingReason3 .class, PendingReason4 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus7Choice.class, PendingStatus8Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric2Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProcessingStatus12Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, QuantityAndAccount5 .class, QuantityBreakdown7 .class, ReceiveDelivery1Code.class, References12Choice.class, Registration1Code.class, Registration2Choice.class, RegistrationParameters2 .class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus2Choice.class, Reporting2Code.class, Reporting3Choice.class, RepurchaseType2Code.class, RepurchaseType4Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesCertificate2 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionGenerationNotification002V01 .class, SecuritiesTradeDetails15 .class, SecuritiesTransactionType1Code.class, SecuritiesTransactionType4Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails19 .class, SettlementParties7 .class, SettlementStatus4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition2Code.class, SettlementTransactionCondition3Choice.class, SettlementTypeAndIdentification8 .class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, StatusAndReason6 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking2Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeOriginator2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, UnmatchedReason2Code.class, UnmatchedReason4 .class, UnmatchedReason6Choice.class, UnmatchedStatus4Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.032.002.01";

    public MxSese03200201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03200201(final String xml) {
        this();
        MxSese03200201 tmp = parse(xml);
        sctiesSttlmTxGnrtnNtfctn = tmp.getSctiesSttlmTxGnrtnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03200201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionGenerationNotification002V01 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotification002V01 getSctiesSttlmTxGnrtnNtfctn() {
        return sctiesSttlmTxGnrtnNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionGenerationNotification002V01 }
     *     
     */
    public MxSese03200201 setSctiesSttlmTxGnrtnNtfctn(SecuritiesSettlementTransactionGenerationNotification002V01 value) {
        this.sctiesSttlmTxGnrtnNtfctn = value;
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
    public static MxSese03200201 parse(String xml) {
        return ((MxSese03200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03200201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03200201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03200201 parse(String xml, MxRead parserImpl) {
        return ((MxSese03200201) parserImpl.read(MxSese03200201 .class, xml, _classes));
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
     * Creates an MxSese03200201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03200201 message
     * @return
     *     a new instance of MxSese03200201
     */
    public final static MxSese03200201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03200201 .class);
    }

}
