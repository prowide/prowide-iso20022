
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
 * Class for semt.018.002.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.018.002.12")
public class MxSemt01800212
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReport002V12 sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus25Choice.class, AcknowledgementReason13 .class, AcknowledgementReason16Choice.class, AcknowledgementReason5Code.class, AmountAndDirection67 .class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CancellationReason24 .class, CancellationReason37Choice.class, CancellationStatus25Choice.class, CancelledStatusReason16Code.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, CorporateActionEventType101Choice.class, CorporateActionEventType33Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason10 .class, FailingReason11Choice.class, FailingReason2Code.class, FailingStatus12Choice.class, FinancialInstrumentQuantity15Choice.class, Frequency26Choice.class, GeneratedReason3Code.class, GeneratedReason6 .class, GeneratedReasons6Choice.class, GeneratedStatus8Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, HoldIndicator7 .class, IdentificationSource4Choice.class, InstructionProcessingStatus45Choice.class, LetterOfGuarantee5Choice.class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MatchingStatus32Choice.class, MxSemt01800212 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification156 .class, PartyIdentification191 .class, PartyIdentificationAndAccount190 .class, PendingProcessingReason16 .class, PendingProcessingReason18Choice.class, PendingProcessingReason4Code.class, PendingProcessingStatus19Choice.class, PendingReason20 .class, PendingReason21Code.class, PendingReason29 .class, PendingReason37Choice.class, PendingReason60Choice.class, PendingReason6Code.class, PendingStatus46Choice.class, PendingStatus64Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, ProprietaryReason5 .class, ProprietaryStatusAndReason7 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration12Choice.class, Registration1Code.class, Registration2Code.class, RegistrationReason6 .class, RepairReason12 .class, RepairReason14Choice.class, RepairReason4Code.class, RepairStatus16Choice.class, RepurchaseType24Choice.class, RepurchaseType9Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesRTGS5Choice.class, SecuritiesTransactionPendingReport002V12 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType52Choice.class, SecurityIdentification20 .class, SettlementDate32Choice.class, SettlementDateCode11Choice.class, SettlementDetails197 .class, SettlementOrCorporateActionEvent32Choice.class, SettlementParties90 .class, SettlementStatus29Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition12Code.class, SettlementTransactionCondition37Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, Statement70 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status33Choice.class, StatusAndReason43 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate9Choice.class, TradeDateCode4Choice.class, Transaction117 .class, Transaction118 .class, TransactionActivity1Code.class, TransactionActivity4Choice.class, TransactionDetails144 .class, UnmatchedReason11Code.class, UnmatchedReason20 .class, UnmatchedReason27Choice.class, UnmatchedStatus21Choice.class, UpdateType16Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.018.002.12";

    public MxSemt01800212() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800212(final String xml) {
        this();
        MxSemt01800212 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800212(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReport002V12 }
     *     
     */
    public SecuritiesTransactionPendingReport002V12 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReport002V12 }
     *     
     */
    public MxSemt01800212 setSctiesTxPdgRpt(SecuritiesTransactionPendingReport002V12 value) {
        this.sctiesTxPdgRpt = value;
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
    public static MxSemt01800212 parse(String xml) {
        return ((MxSemt01800212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01800212 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01800212) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800212 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800212 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800212) parserImpl.read(MxSemt01800212 .class, xml, _classes));
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
     * Creates an MxSemt01800212 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800212 message
     * @return
     *     a new instance of MxSemt01800212
     */
    public final static MxSemt01800212 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800212 .class);
    }

}
