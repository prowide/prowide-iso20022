
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.018.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.018.002.06")
public class MxSemt01800206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReport002V06 sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AmountAndDirection12 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason13Choice.class, CancellationReason6 .class, CancellationStatus11Choice.class, CancelledStatusReason13Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CorporateActionEventType14Code.class, CorporateActionEventType19Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GeneratedReason3Code.class, GeneratedReason4 .class, GeneratedReasons4Choice.class, GeneratedStatus6Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, HoldIndicator5 .class, IdentificationSource4Choice.class, InstructionProcessingStatus17Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus22Choice.class, MxSemt01800206 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingProcessingReason2Code.class, PendingProcessingReason7 .class, PendingProcessingReason7Choice.class, PendingProcessingStatus9Choice.class, PendingReason10 .class, PendingReason18Choice.class, PendingReason2Code.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus24Choice.class, PendingStatus31Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationReason4 .class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus10Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPendingReport002V06 .class, SecuritiesTransactionType14Choice.class, SecuritiesTransactionType9Code.class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails86 .class, SettlementOrCorporateActionEvent11Choice.class, SettlementParties21 .class, SettlementStatus13Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition14Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, Statement26 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status16Choice.class, StatusAndReason26 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction42 .class, Transaction43 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails72 .class, UnmatchedReason14 .class, UnmatchedReason18Choice.class, UnmatchedReason8Code.class, UnmatchedStatus15Choice.class, UpdateType3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.018.002.06";

    public MxSemt01800206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800206(final String xml) {
        this();
        MxSemt01800206 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReport002V06 }
     *     
     */
    public SecuritiesTransactionPendingReport002V06 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReport002V06 }
     *     
     */
    public MxSemt01800206 setSctiesTxPdgRpt(SecuritiesTransactionPendingReport002V06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt01800206 parse(String xml) {
        return ((MxSemt01800206) MxReadImpl.parse(MxSemt01800206 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800206 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800206) parserImpl.read(MxSemt01800206 .class, xml, _classes));
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
     * Creates an MxSemt01800206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800206 message
     * @return
     *     a new instance of MxSemt01800206
     */
    public final static MxSemt01800206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800206 .class);
    }

}
