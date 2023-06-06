
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
 * Class for sese.024.002.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.002.11")
public class MxSese02400211
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
    protected SecuritiesSettlementTransactionStatusAdvice002V11 sctiesSttlmTxStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 24;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, AmountAndDirection67 .class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CancellationReason24 .class, CancellationReason37Choice.class, CancellationStatus25Choice.class, CancelledStatusReason16Code.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, ExposureType17Choice.class, ExposureType4Code.class, FailingReason10 .class, FailingReason11Choice.class, FailingReason2Code.class, FailingStatus12Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, HoldIndicator7 .class, IdentificationSource4Choice.class, LetterOfGuarantee5Choice.class, Linkages50 .class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus32Choice.class, MxSese02400211 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification170 .class, PartyIdentification176Choice.class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, PendingProcessingReason16 .class, PendingProcessingReason18Choice.class, PendingProcessingReason4Code.class, PendingProcessingStatus19Choice.class, PendingReason20 .class, PendingReason21Code.class, PendingReason29 .class, PendingReason37Choice.class, PendingReason60Choice.class, PendingReason6Code.class, PendingStatus46Choice.class, PendingStatus64Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, ProcessingPosition23Choice.class, ProcessingPosition5Code.class, ProcessingStatus81Choice.class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration12Choice.class, Registration1Code.class, Registration2Code.class, RegistrationReason6 .class, RejectionReason33Choice.class, RejectionReason37Code.class, RejectionReason39 .class, RejectionStatus26Choice.class, RepairReason12 .class, RepairReason14Choice.class, RepairReason4Code.class, RepairStatus16Choice.class, RepurchaseType24Choice.class, RepurchaseType9Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesRTGS5Choice.class, SecuritiesSettlementTransactionStatusAdvice002V11 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType52Choice.class, SecurityIdentification20 .class, SettlementDate32Choice.class, SettlementDateCode11Choice.class, SettlementDetails196 .class, SettlementParties90 .class, SettlementStatus29Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition12Code.class, SettlementTransactionCondition37Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate9Choice.class, TradeDateCode4Choice.class, TransactionDetails142 .class, TransactionIdentifications38 .class, UnmatchedReason11Code.class, UnmatchedReason20 .class, UnmatchedReason27Choice.class, UnmatchedStatus21Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.024.002.11";

    public MxSese02400211() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02400211(final String xml) {
        this();
        MxSese02400211 tmp = parse(xml);
        sctiesSttlmTxStsAdvc = tmp.getSctiesSttlmTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02400211(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionStatusAdvice002V11 }
     *     
     */
    public SecuritiesSettlementTransactionStatusAdvice002V11 getSctiesSttlmTxStsAdvc() {
        return sctiesSttlmTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionStatusAdvice002V11 }
     *     
     */
    public MxSese02400211 setSctiesSttlmTxStsAdvc(SecuritiesSettlementTransactionStatusAdvice002V11 value) {
        this.sctiesSttlmTxStsAdvc = value;
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
    public static MxSese02400211 parse(String xml) {
        return ((MxSese02400211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02400211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02400211 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02400211) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02400211 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02400211 parse(String xml, MxRead parserImpl) {
        return ((MxSese02400211) parserImpl.read(MxSese02400211 .class, xml, _classes));
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
     * Creates an MxSese02400211 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02400211 message
     * @return
     *     a new instance of MxSese02400211
     */
    public static final MxSese02400211 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02400211 .class);
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
