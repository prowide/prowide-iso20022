
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
 * Class for sese.024.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.02")
public class MxSese02400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
    protected SecuritiesSettlementTransactionStatusAdviceV02 sctiesSttlmTxStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus3Choice.class, AcknowledgementReason3 .class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection8 .class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CancellationReason1 .class, CancellationReason5Choice.class, CancellationStatus4Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, ExposureType2Code.class, ExposureType4Choice.class, FailingReason1 .class, FailingReason1Choice.class, FailingReason1Code.class, FailingStatus1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, HoldIndicator2 .class, IdentificationSource3Choice.class, LetterOfGuarantee1Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MatchingStatus2Choice.class, MxSese02400102 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount44 .class, PendingProcessingReason1 .class, PendingProcessingReason1Choice.class, PendingProcessingReason1Code.class, PendingProcessingStatus1Choice.class, PendingReason1 .class, PendingReason1Choice.class, PendingReason1Code.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason6Code.class, PendingStatus3Choice.class, PendingStatus4Choice.class, PostalAddress1 .class, ProcessingStatus1Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, Registration2Code.class, Registration3Choice.class, RegistrationReason1 .class, RejectionReason25Code.class, RejectionReason4Choice.class, RejectionReason5 .class, RejectionStatus1Choice.class, RepairReason1 .class, RepairReason1Choice.class, RepairReason4Code.class, RepairStatus1Choice.class, RepurchaseType3Choice.class, RepurchaseType3Code.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionStatusAdviceV02 .class, SecuritiesTransactionType1Choice.class, SecuritiesTransactionType1Code.class, SecurityIdentification14 .class, SettlementDate2Choice.class, SettlementDateCode2Choice.class, SettlementDetails23 .class, SettlementParties13 .class, SettlementStatus2Choice.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Choice.class, SettlementTransactionCondition6Code.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionDetails22 .class, TransactionIdentifications9 .class, UnmatchedReason1 .class, UnmatchedReason1Choice.class, UnmatchedReason2Code.class, UnmatchedStatus1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.02";

    public MxSese02400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02400102(final String xml) {
        this();
        MxSese02400102 tmp = parse(xml);
        sctiesSttlmTxStsAdvc = tmp.getSctiesSttlmTxStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionStatusAdviceV02 }
     *     
     */
    public SecuritiesSettlementTransactionStatusAdviceV02 getSctiesSttlmTxStsAdvc() {
        return sctiesSttlmTxStsAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionStatusAdviceV02 }
     *     
     */
    public MxSese02400102 setSctiesSttlmTxStsAdvc(SecuritiesSettlementTransactionStatusAdviceV02 value) {
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
    public static MxSese02400102 parse(String xml) {
        return ((MxSese02400102) MxReadImpl.parse(MxSese02400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02400102 parse(String xml, MxRead parserImpl) {
        return ((MxSese02400102) parserImpl.read(MxSese02400102 .class, xml, _classes));
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
     * Creates an MxSese02400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02400102 message
     * @return
     *     a new instance of MxSese02400102
     */
    public final static MxSese02400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02400102 .class);
    }

}
