
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
 * Class for semt.018.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.018.002.04")
public class MxSemt01800204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReport002V04 sctiesTxPdgRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 18;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AmountAndDirection12 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason13Choice.class, CancellationReason6 .class, CancellationStatus11Choice.class, CancelledStatusReason13Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CorporateActionEventType14Code.class, CorporateActionEventType19Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GeneratedReason2 .class, GeneratedReason2Code.class, GeneratedReasons2Choice.class, GeneratedStatus4Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, HoldIndicator5 .class, IdentificationSource4Choice.class, InstructionProcessingStatus11Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus18Choice.class, MxSemt01800204 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingProcessingReason2Code.class, PendingProcessingReason7 .class, PendingProcessingReason7Choice.class, PendingProcessingStatus9Choice.class, PendingReason10 .class, PendingReason18Choice.class, PendingReason2Code.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus24Choice.class, PendingStatus31Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationReason4 .class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus10Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPendingReport002V04 .class, SecuritiesTransactionType14Choice.class, SecuritiesTransactionType9Code.class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails56 .class, SettlementOrCorporateActionEvent11Choice.class, SettlementParties21 .class, SettlementStatus13Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition14Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, Statement26 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status11Choice.class, StatusAndReason17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction30 .class, Transaction31 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails59 .class, UnmatchedReason13Choice.class, UnmatchedReason5Code.class, UnmatchedReason9 .class, UnmatchedStatus10Choice.class, UpdateType3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.018.002.04";

    public MxSemt01800204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800204(final String xml) {
        this();
        MxSemt01800204 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReport002V04 }
     *     
     */
    public SecuritiesTransactionPendingReport002V04 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReport002V04 }
     *     
     */
    public MxSemt01800204 setSctiesTxPdgRpt(SecuritiesTransactionPendingReport002V04 value) {
        this.sctiesTxPdgRpt = value;
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
    public static MxSemt01800204 parse(String xml) {
        return ((MxSemt01800204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01800204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01800204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800204 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800204) parserImpl.read(MxSemt01800204 .class, xml, _classes));
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
     * Creates an MxSemt01800204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800204 message
     * @return
     *     a new instance of MxSemt01800204
     */
    public static final MxSemt01800204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800204 .class);
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
