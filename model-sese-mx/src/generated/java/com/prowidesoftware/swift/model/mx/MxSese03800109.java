
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
 * Class for sese.038.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.09")
public class MxSese03800109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxModReq", required = true)
    protected SecuritiesSettlementTransactionModificationRequestV09 sctiesSttlmTxModReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 38;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Code.class, AffirmationStatus8Choice.class, AlternatePartyIdentification7 .class, AmountAndDirection44 .class, AmountAndDirection51 .class, AmountAndDirection95 .class, BeneficialOwnership4Choice.class, BlockChainAddressWallet3 .class, CashAccountIdentification5Choice.class, CashParties36 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty15Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn3Choice.class, DocumentNumber5Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType12Code.class, ExposureType22Choice.class, FXStandingInstruction4Choice.class, FinancialInstrumentAttributes111 .class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LetterOfGuarantee4Choice.class, Linkages40 .class, Linkages63 .class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, ModificationCancellationAllowed4Choice.class, MxSese03800109 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, OpeningClosing1Code.class, OpeningClosing3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts39 .class, OtherIdentification1 .class, OtherParties43 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity5Choice.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification134Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentification148 .class, PartyIdentification149 .class, PartyIdentificationAndAccount164 .class, PartyIdentificationAndAccount165 .class, PartyIdentificationAndAccount171 .class, PartyIdentificationAndAccount195 .class, PartyIdentificationAndAccount196 .class, PartyIdentificationAndAccount197 .class, PartyIdentificationAndAccount198 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, Price10 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, Quantity51Choice.class, QuantityAndAccount100 .class, QuantityAndAccount98 .class, QuantityBreakdown62 .class, ReceiveDelivery1Code.class, References47Choice.class, Registration1Code.class, Registration9Choice.class, RegistrationParameters6 .class, Reporting2Code.class, Reporting6Choice.class, Restriction5Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCertificate4 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesSettlementTransactionDetails50 .class, SecuritiesSettlementTransactionDetails51 .class, SecuritiesSettlementTransactionDetails52 .class, SecuritiesSettlementTransactionModificationRequestV09 .class, SecuritiesTradeDetails120 .class, SecuritiesTradeDetails121 .class, SecuritiesTransactionType28Code.class, SecuritiesTransactionType59Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails200 .class, SettlementParties100 .class, SettlementParties97 .class, SettlementParties98 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTypeAndAdditionalParameters13 .class, SettlementTypeAndAdditionalParameters14 .class, SettlementTypeAndIdentification18 .class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, Tracking4Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TransactionDetails150 .class, TransactionDetails151 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, UpdateType37Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.038.001.09";

    public MxSese03800109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03800109(final String xml) {
        this();
        MxSese03800109 tmp = parse(xml);
        sctiesSttlmTxModReq = tmp.getSctiesSttlmTxModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03800109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxModReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionModificationRequestV09 }
     *     
     */
    public SecuritiesSettlementTransactionModificationRequestV09 getSctiesSttlmTxModReq() {
        return sctiesSttlmTxModReq;
    }

    /**
     * Sets the value of the sctiesSttlmTxModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionModificationRequestV09 }
     *     
     */
    public MxSese03800109 setSctiesSttlmTxModReq(SecuritiesSettlementTransactionModificationRequestV09 value) {
        this.sctiesSttlmTxModReq = value;
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
    public static MxSese03800109 parse(String xml) {
        return ((MxSese03800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03800109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03800109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03800109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03800109 parse(String xml, MxRead parserImpl) {
        return ((MxSese03800109) parserImpl.read(MxSese03800109 .class, xml, _classes));
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
     * Creates an MxSese03800109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03800109 message
     * @return
     *     a new instance of MxSese03800109
     */
    public final static MxSese03800109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03800109 .class);
    }

}