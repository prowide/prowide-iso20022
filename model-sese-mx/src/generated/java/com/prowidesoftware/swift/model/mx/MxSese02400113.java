
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
 * Class for sese.024.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.13")
public class MxSese02400113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
    protected SecuritiesSettlementTransactionStatusAdviceV13 sctiesSttlmTxStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 24;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, BeneficialOwnership4Choice.class, BlockChainAddressWallet3 .class, BlockTrade1Code.class, BlockTrade4Choice.class, CancellationReason22 .class, CancellationReason36Choice.class, CancellationStatus24Choice.class, CancelledStatusReason16Code.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, ExposureType15Code.class, ExposureType25Choice.class, FailingReason11 .class, FailingReason16Choice.class, FailingReason4Code.class, FailingStatus13Choice.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldIndicator6 .class, IdentificationSource3Choice.class, LetterOfGuarantee4Choice.class, Linkages41 .class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus24Choice.class, MxSese02400113 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification149 .class, PartyIdentification257Choice.class, PartyIdentification314 .class, PartyIdentificationAndAccount195 .class, PendingProcessingReason15 .class, PendingProcessingReason17Choice.class, PendingProcessingReason4Code.class, PendingProcessingStatus18Choice.class, PendingReason16 .class, PendingReason24Code.class, PendingReason28Choice.class, PendingReason30 .class, PendingReason63Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, PendingStatus67Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, ProcessingPosition5Code.class, ProcessingPosition9Choice.class, ProcessingStatus88Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity51Choice.class, ReceiveDelivery1Code.class, Registration10Choice.class, Registration1Code.class, Registration2Code.class, Registration9Choice.class, RegistrationReason5 .class, RejectionReason44Choice.class, RejectionReason59 .class, RejectionReason75Code.class, RejectionStatus39Choice.class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason8 .class, RepairStatus12Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, SafeKeepingPlace5 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat41Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesRTGS4Choice.class, SecuritiesSettlementTransactionStatusAdviceV13 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType44Choice.class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementDetails216 .class, SettlementParties125 .class, SettlementStatus30Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition12Code.class, SettlementTransactionCondition34Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionDetails166 .class, TransactionIdentifications47 .class, UnmatchedReason11Code.class, UnmatchedReason15 .class, UnmatchedReason21Choice.class, UnmatchedStatus16Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.13";

    public MxSese02400113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02400113(final String xml) {
        this();
        MxSese02400113 tmp = parse(xml);
        sctiesSttlmTxStsAdvc = tmp.getSctiesSttlmTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02400113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionStatusAdviceV13 }
     *     
     */
    public SecuritiesSettlementTransactionStatusAdviceV13 getSctiesSttlmTxStsAdvc() {
        return sctiesSttlmTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionStatusAdviceV13 }
     *     
     */
    public MxSese02400113 setSctiesSttlmTxStsAdvc(SecuritiesSettlementTransactionStatusAdviceV13 value) {
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
    public static MxSese02400113 parse(String xml) {
        return ((MxSese02400113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02400113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02400113 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02400113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02400113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02400113 parse(String xml, MxRead parserImpl) {
        return ((MxSese02400113) parserImpl.read(MxSese02400113 .class, xml, _classes));
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
     * Creates an MxSese02400113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02400113 message
     * @return
     *     a new instance of MxSese02400113
     */
    public static final MxSese02400113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02400113 .class);
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
