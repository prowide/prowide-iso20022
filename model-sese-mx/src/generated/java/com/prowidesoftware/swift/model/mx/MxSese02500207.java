
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.025.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.025.002.07")
public class MxSese02500207
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxConf", required = true)
    protected SecuritiesSettlementTransactionConfirmation002V07 sctiesSttlmTxConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalParameters31 .class, AlternatePartyIdentification9 .class, AmountAndDirection57 .class, AmountAndDirection58 .class, AmountAndDirection60 .class, AutoBorrowing1Code.class, AutomaticBorrowing8Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashAccountIdentification6Choice.class, CashParties30 .class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClassificationType33Choice.class, Counterparty10Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType17Choice.class, ExposureType4Code.class, FinancialInstrumentAttributes78 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms27 .class, FormOfSecurity1Code.class, FormOfSecurity7Choice.class, Frequency27Choice.class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, IdentificationSource4Choice.class, IdentificationType44Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InvestorCapacity5Choice.class, LetterOfGuarantee5Choice.class, Linkages50 .class, MarketClientSide5Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSese02500207 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number23Choice.class, OpeningClosing1Code.class, OpeningClosing4Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OptionType1Code.class, OptionType7Choice.class, OriginalAndCurrentQuantities4 .class, OriginatorRole2Code.class, OtherAmounts38 .class, OtherIdentification2 .class, OtherParties29 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement2Code.class, PartyIdentification103 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification111 .class, PartyIdentification113Choice.class, PartyIdentification119 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount131 .class, PartyIdentificationAndAccount133 .class, PartyIdentificationAndAccount134 .class, PartyIdentificationAndAccount135 .class, PartyIdentificationAndAccount136 .class, PartyIdentificationAndAccount137 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification2 .class, PreConfirmation1Code.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric5Choice.class, ProcessingPosition23Choice.class, ProcessingPosition5Code.class, Quantity10Choice.class, QuantityAndAccount57 .class, QuantityBreakdown44 .class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, RegistrationParameters5 .class, Reporting2Code.class, Reporting9Choice.class, RepurchaseType24Choice.class, RepurchaseType9Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount27 .class, SecuritiesCertificate5 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus6Choice.class, SecuritiesRTGS5Choice.class, SecuritiesSettlementTransactionConfirmation002V07 .class, SecuritiesTradeDetails62 .class, SecuritiesTransactionType24Choice.class, SecuritiesTransactionType8Code.class, SecurityIdentification20 .class, SettlementDate12Choice.class, SettlementDate14Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails134 .class, SettlementParties44 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase5Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition28Choice.class, SettlementTransactionCondition5Code.class, SettlementTypeAndIdentification24 .class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, StandingSettlementInstruction12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate6Choice.class, TradeDateCode4Choice.class, TradeOriginator4Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition6Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice32Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.025.002.07";

    public MxSese02500207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02500207(final String xml) {
        this();
        MxSese02500207 tmp = parse(xml);
        sctiesSttlmTxConf = tmp.getSctiesSttlmTxConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02500207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionConfirmation002V07 }
     *     
     */
    public SecuritiesSettlementTransactionConfirmation002V07 getSctiesSttlmTxConf() {
        return sctiesSttlmTxConf;
    }

    /**
     * Sets the value of the sctiesSttlmTxConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionConfirmation002V07 }
     *     
     */
    public MxSese02500207 setSctiesSttlmTxConf(SecuritiesSettlementTransactionConfirmation002V07 value) {
        this.sctiesSttlmTxConf = value;
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
    public static MxSese02500207 parse(String xml) {
        return ((MxSese02500207) MxReadImpl.parse(MxSese02500207 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02500207 parse(String xml, MxRead parserImpl) {
        return ((MxSese02500207) parserImpl.read(MxSese02500207 .class, xml, _classes));
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
     * Creates an MxSese02500207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02500207 message
     * @return
     *     a new instance of MxSese02500207
     */
    public final static MxSese02500207 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02500207 .class);
    }

}
