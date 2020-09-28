
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
 * Class for sese.024.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.024.002.05")
public class MxSese02400205
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
    protected SecuritiesSettlementTransactionStatusAdvice002V05 sctiesSttlmTxStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AmountAndDirection12 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason13Choice.class, CancellationReason6 .class, CancellationStatus11Choice.class, CancelledStatusReason13Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, ExposureType11Choice.class, ExposureType4Code.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, HoldIndicator5 .class, IdentificationSource4Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus22Choice.class, MxSese02400205 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingProcessingReason2Code.class, PendingProcessingReason7 .class, PendingProcessingReason7Choice.class, PendingProcessingStatus9Choice.class, PendingReason10 .class, PendingReason18Choice.class, PendingReason2Code.class, PendingReason3 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus24Choice.class, PendingStatus31Choice.class, ProcessingStatus42Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Registration2Code.class, Registration8Choice.class, RegistrationReason4 .class, RejectionReason20Choice.class, RejectionReason22 .class, RejectionReason37Code.class, RejectionStatus16Choice.class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus10Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionStatusAdvice002V05 .class, SecuritiesTransactionType16Choice.class, SecuritiesTransactionType7Code.class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails85 .class, SettlementParties21 .class, SettlementStatus13Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition14Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionDetails66 .class, TransactionIdentifications22 .class, UnmatchedReason14 .class, UnmatchedReason18Choice.class, UnmatchedReason8Code.class, UnmatchedStatus15Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.024.002.05";

    public MxSese02400205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02400205(final String xml) {
        this();
        MxSese02400205 tmp = parse(xml);
        sctiesSttlmTxStsAdvc = tmp.getSctiesSttlmTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02400205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionStatusAdvice002V05 }
     *     
     */
    public SecuritiesSettlementTransactionStatusAdvice002V05 getSctiesSttlmTxStsAdvc() {
        return sctiesSttlmTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionStatusAdvice002V05 }
     *     
     */
    public MxSese02400205 setSctiesSttlmTxStsAdvc(SecuritiesSettlementTransactionStatusAdvice002V05 value) {
        this.sctiesSttlmTxStsAdvc = value;
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
    public static MxSese02400205 parse(String xml) {
        return ((MxSese02400205) MxReadImpl.parse(MxSese02400205 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02400205 parse(String xml, MxRead parserImpl) {
        return ((MxSese02400205) parserImpl.read(MxSese02400205 .class, xml, _classes));
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
     * Creates an MxSese02400205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02400205 message
     * @return
     *     a new instance of MxSese02400205
     */
    public final static MxSese02400205 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02400205 .class);
    }

}
