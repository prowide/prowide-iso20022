
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
 * Class for semt.018.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.018.002.01")
public class MxSemt01800201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReport002V01 sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus6Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AlternateIdentification2 .class, AmountAndDirection12 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason4 .class, CancellationReason8Choice.class, CancellationStatus6Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CopyDuplicate1Code.class, CorporateActionEventType2Choice.class, CorporateActionEventType3Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, DocumentIdentification16 .class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FailingReason1Code.class, FailingReason2 .class, FailingReason2Choice.class, FailingStatus2Choice.class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GeneratedReason2 .class, GeneratedReason2Code.class, GeneratedReasons2Choice.class, GeneratedStatus2Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource2Choice.class, InstructionProcessingStatus6Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus6Choice.class, MxSemt01800201 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, NoSpecifiedReason1 .class, Number3Choice.class, OriginalAndCurrentQuantities4 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification16Choice.class, PartyIdentification17Choice.class, PartyIdentification18Choice.class, PartyIdentification38 .class, PartyIdentificationAndAccount25 .class, PendingProcessingReason1Code.class, PendingProcessingReason2 .class, PendingProcessingReason2Choice.class, PendingProcessingStatus2Choice.class, PendingReason10Choice.class, PendingReason1Code.class, PendingReason3 .class, PendingReason4 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus7Choice.class, PendingStatus8Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus2Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPendingReport002V01 .class, SecuritiesTransactionType3Code.class, SecuritiesTransactionType5Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails12 .class, SettlementOrCorporateActionEvent3Choice.class, SettlementParties6 .class, SettlementStatus4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition2Code.class, SettlementTransactionCondition3Choice.class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, Statement26 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status4Choice.class, StatusAndReason4 .class, StatusAndReason5 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction10 .class, Transaction9 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails16 .class, TransactionDetails17 .class, UnmatchedReason2Code.class, UnmatchedReason4 .class, UnmatchedReason6Choice.class, UnmatchedStatus4Choice.class, UpdateType3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.018.002.01";

    public MxSemt01800201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800201(final String xml) {
        this();
        MxSemt01800201 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReport002V01 }
     *     
     */
    public SecuritiesTransactionPendingReport002V01 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReport002V01 }
     *     
     */
    public MxSemt01800201 setSctiesTxPdgRpt(SecuritiesTransactionPendingReport002V01 value) {
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
    public static MxSemt01800201 parse(String xml) {
        return ((MxSemt01800201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01800201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01800201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800201) parserImpl.read(MxSemt01800201 .class, xml, _classes));
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
     * Creates an MxSemt01800201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800201 message
     * @return
     *     a new instance of MxSemt01800201
     */
    public final static MxSemt01800201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800201 .class);
    }

}
