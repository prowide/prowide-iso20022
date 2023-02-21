
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
 * Class for semt.018.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.018.001.10")
public class MxSemt01800110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReportV10 sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CancellationReason22 .class, CancellationReason36Choice.class, CancellationStatus24Choice.class, CancelledStatusReason16Code.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CorporateActionEventType28Code.class, CorporateActionEventType73Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, FinancialInstrumentQuantity1Choice.class, Frequency25Choice.class, GeneratedReason3Code.class, GeneratedReason5 .class, GeneratedReasons5Choice.class, GeneratedStatus7Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldIndicator6 .class, IdentificationSource3Choice.class, InstructionProcessingStatus33Choice.class, LetterOfGuarantee4Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus24Choice.class, MxSemt01800110 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentificationAndAccount170 .class, PendingProcessingReason10Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason8 .class, PendingProcessingStatus11Choice.class, PendingReason15 .class, PendingReason16 .class, PendingReason27Choice.class, PendingReason28Choice.class, PendingReason2Code.class, PendingReason6Code.class, PendingStatus37Choice.class, PendingStatus38Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration10Choice.class, Registration1Code.class, Registration2Code.class, Registration9Choice.class, RegistrationReason5 .class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason8 .class, RepairStatus12Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesRTGS4Choice.class, SecuritiesTransactionPendingReportV10 .class, SecuritiesTransactionType26Code.class, SecuritiesTransactionType44Choice.class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementDetails149 .class, SettlementOrCorporateActionEvent27Choice.class, SettlementParties78 .class, SettlementStatus17Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, Statement64 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status29Choice.class, StatusAndReason36 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, Transaction67 .class, Transaction68 .class, TransactionActivity1Code.class, TransactionActivity3Choice.class, TransactionDetails115 .class, UnmatchedReason11Code.class, UnmatchedReason15 .class, UnmatchedReason21Choice.class, UnmatchedStatus16Choice.class, UpdateType15Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.018.001.10";

    public MxSemt01800110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800110(final String xml) {
        this();
        MxSemt01800110 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReportV10 }
     *     
     */
    public SecuritiesTransactionPendingReportV10 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReportV10 }
     *     
     */
    public MxSemt01800110 setSctiesTxPdgRpt(SecuritiesTransactionPendingReportV10 value) {
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
    public static MxSemt01800110 parse(String xml) {
        return ((MxSemt01800110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01800110 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01800110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800110 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800110) parserImpl.read(MxSemt01800110 .class, xml, _classes));
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
     * Creates an MxSemt01800110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800110 message
     * @return
     *     a new instance of MxSemt01800110
     */
    public final static MxSemt01800110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800110 .class);
    }

}
