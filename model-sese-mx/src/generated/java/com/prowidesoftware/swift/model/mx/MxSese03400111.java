
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
 * Class for sese.034.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.11")
public class MxSese03400111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgStsAdvc", required = true)
    protected SecuritiesFinancingStatusAdviceV11 sctiesFincgStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 34;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgedAcceptedStatus22Choice.class, AcknowledgementReason10 .class, AcknowledgementReason12Choice.class, AcknowledgementReason13Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection51 .class, BeneficialOwnership4Choice.class, BlockChainAddressWallet3 .class, BlockTrade1Code.class, BlockTrade4Choice.class, CancellationReason12 .class, CancellationReason23Choice.class, CancellationStatus16Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem3Code.class, CashSettlementSystem6Choice.class, CashSettlementSystemPlace1Choice.class, CentralCounterPartyEligibility4Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode18Choice.class, DateType3Code.class, DateType4Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DeniedReason12 .class, DeniedReason17Choice.class, DeniedReason3Code.class, DeniedStatus17Choice.class, DigitalPaymentSettlement2 .class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, FinancialInstrumentQuantity33Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus26Choice.class, MxSese03400111 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification144 .class, PartyIdentification149 .class, PartyIdentification257Choice.class, PartyIdentification315 .class, PartyIdentificationAndAccount199 .class, PartyTextInformation1 .class, PendingProcessingReason18 .class, PendingProcessingReason20Choice.class, PendingProcessingReason6Code.class, PendingProcessingStatus21Choice.class, PendingReason18 .class, PendingReason1Code.class, PendingReason31Choice.class, PendingReason32Code.class, PendingReason35 .class, PendingReason77Choice.class, PendingStatus40Choice.class, PendingStatus81Choice.class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, ProcessingStatus102Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity51Choice.class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, ReceiveDelivery1Code.class, RejectionReason41Choice.class, RejectionReason60 .class, RejectionReason70Code.class, RejectionStatus36Choice.class, RepairReason10 .class, RepairReason12Choice.class, RepairReason5Code.class, RepairStatus14Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus7Choice.class, Restriction5Choice.class, SafeKeepingPlace5 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat41Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount22 .class, SecuritiesFinancingStatusAdviceV11 .class, SecuritiesFinancingTransactionDetails59 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS4Choice.class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementDetails227 .class, SettlementParties127 .class, SettlementStatus18Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition20Code.class, SettlementTransactionCondition45Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate6Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionIdentifications53 .class, TypeOfIdentification1Code.class, UnmatchedReason13Code.class, UnmatchedReason17 .class, UnmatchedReason24Choice.class, UnmatchedStatus18Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.11";

    public MxSese03400111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03400111(final String xml) {
        this();
        MxSese03400111 tmp = parse(xml);
        sctiesFincgStsAdvc = tmp.getSctiesFincgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03400111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingStatusAdviceV11 }
     *     
     */
    public SecuritiesFinancingStatusAdviceV11 getSctiesFincgStsAdvc() {
        return sctiesFincgStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingStatusAdviceV11 }
     *     
     */
    public MxSese03400111 setSctiesFincgStsAdvc(SecuritiesFinancingStatusAdviceV11 value) {
        this.sctiesFincgStsAdvc = value;
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
    public static MxSese03400111 parse(String xml) {
        return ((MxSese03400111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03400111 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03400111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03400111 parse(String xml, MxRead parserImpl) {
        return ((MxSese03400111) parserImpl.read(MxSese03400111 .class, xml, _classes));
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
     * Creates an MxSese03400111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03400111 message
     * @return
     *     a new instance of MxSese03400111
     */
    public static final MxSese03400111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03400111 .class);
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
