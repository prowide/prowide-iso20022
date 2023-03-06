
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
 * Class for sese.023.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.023.002.05")
public class MxSese02300205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxInstr", required = true)
    protected SecuritiesSettlementTransactionInstruction002V05 sctiesSttlmTxInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AffirmationStatus1Code.class, AffirmationStatus2Choice.class, AlternatePartyIdentification3 .class, AmountAndDirection17 .class, AmountAndDirection38 .class, AutoBorrowing1Code.class, AutomaticBorrowing4Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashAccountIdentification6Choice.class, CashParties19 .class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClassificationType3Choice.class, Counterparty7Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn2Choice.class, DocumentNumber2Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType11Choice.class, ExposureType4Code.class, FXStandingInstruction2Choice.class, FinancialInstrumentAttributes41 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification39 .class, HoldIndicator5 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InvestorCapacity2Choice.class, LetterOfGuarantee2Choice.class, Linkages24 .class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus1Code.class, MatchingStatus5Choice.class, ModificationCancellationAllowed2Choice.class, MxSese02300205 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, Number4Choice.class, NumberCount1Choice.class, OpeningClosing1Code.class, OpeningClosing2Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts20 .class, OtherIdentification2 .class, OtherParties24 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity2Choice.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification61Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount60 .class, PartyIdentificationAndAccount63 .class, PartyIdentificationAndAccount64 .class, PartyIdentificationAndAccount66 .class, PartyIdentificationAndAccount88 .class, PartyIdentificationAndAccount92 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric2Choice.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, Quantity10Choice.class, QuantityAndAccount34 .class, QuantityBreakdown18 .class, ReceiveDelivery1Code.class, References32Choice.class, Registration1Code.class, Registration2Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationParameters2 .class, RegistrationReason4 .class, Reporting2Code.class, Reporting3Choice.class, RepurchaseType2Code.class, RepurchaseType4Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesCertificate2 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionInstruction002V05 .class, SecuritiesTradeDetails44 .class, SecuritiesTransactionType16Choice.class, SecuritiesTransactionType7Code.class, SecurityIdentification15 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails81 .class, SettlementParties18 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase2Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition14Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlementTypeAndAdditionalParameters10 .class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, StandingSettlementInstruction7 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking2Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeOriginator2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.023.002.05";

    public MxSese02300205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02300205(final String xml) {
        this();
        MxSese02300205 tmp = parse(xml);
        sctiesSttlmTxInstr = tmp.getSctiesSttlmTxInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02300205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionInstruction002V05 }
     *     
     */
    public SecuritiesSettlementTransactionInstruction002V05 getSctiesSttlmTxInstr() {
        return sctiesSttlmTxInstr;
    }

    /**
     * Sets the value of the sctiesSttlmTxInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionInstruction002V05 }
     *     
     */
    public MxSese02300205 setSctiesSttlmTxInstr(SecuritiesSettlementTransactionInstruction002V05 value) {
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
    public static MxSese02300205 parse(String xml) {
        return ((MxSese02300205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02300205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02300205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02300205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02300205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02300205 parse(String xml, MxRead parserImpl) {
        return ((MxSese02300205) parserImpl.read(MxSese02300205 .class, xml, _classes));
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
     * Creates an MxSese02300205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02300205 message
     * @return
     *     a new instance of MxSese02300205
     */
    public final static MxSese02300205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02300205 .class);
    }

}
