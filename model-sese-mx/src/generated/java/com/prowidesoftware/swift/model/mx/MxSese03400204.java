
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
 * Class for sese.034.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.034.002.04")
public class MxSese03400204
    extends AbstractMX
{

    @XmlElement(name = "SctiesFincgStsAdvc", required = true)
    protected SecuritiesFinancingStatusAdvice002V04 sctiesFincgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus16Choice.class, AcknowledgedAcceptedStatus20Choice.class, AcknowledgementReason5 .class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason7Choice.class, AcknowledgementReason8Choice.class, AlternatePartyIdentification3 .class, AmountAndDirection12 .class, AmountAndDirection13 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason4 .class, CancellationReason8Choice.class, CancellationStatus12Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType3Code.class, DateType4Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DeniedReason3 .class, DeniedReason3Code.class, DeniedReason5Choice.class, DeniedStatus8Choice.class, FailingReason2Code.class, FailingReason5 .class, FailingReason5Choice.class, FailingStatus8Choice.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus21Choice.class, MxSese03400204 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount63 .class, PartyTextInformation3 .class, PendingProcessingReason1Code.class, PendingProcessingReason2 .class, PendingProcessingReason2Choice.class, PendingProcessingStatus10Choice.class, PendingReason10Choice.class, PendingReason1Code.class, PendingReason3 .class, PendingReason4 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus24Choice.class, PendingStatus26Choice.class, ProcessingStatus40Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType8Choice.class, ReceiveDelivery1Code.class, RejectionReason18Choice.class, RejectionReason20 .class, RejectionReason38Code.class, RejectionStatus15Choice.class, RepairReason4 .class, RepairReason5Choice.class, RepairReason5Code.class, RepairStatus11Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesFinancingStatusAdvice002V04 .class, SecuritiesFinancingTransactionDetails22 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesRTGS2Choice.class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails79 .class, SettlementParties18 .class, SettlementStatus12Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition8Choice.class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TerminationDate3Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TransactionIdentifications6 .class, TypeOfIdentification1Code.class, UnmatchedReason10Code.class, UnmatchedReason13 .class, UnmatchedReason17Choice.class, UnmatchedStatus14Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.034.002.04";

    public MxSese03400204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03400204(final String xml) {
        this();
        MxSese03400204 tmp = parse(xml);
        sctiesFincgStsAdvc = tmp.getSctiesFincgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03400204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingStatusAdvice002V04 }
     *     
     */
    public SecuritiesFinancingStatusAdvice002V04 getSctiesFincgStsAdvc() {
        return sctiesFincgStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingStatusAdvice002V04 }
     *     
     */
    public MxSese03400204 setSctiesFincgStsAdvc(SecuritiesFinancingStatusAdvice002V04 value) {
        this.sctiesFincgStsAdvc = value;
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
    public static MxSese03400204 parse(String xml) {
        return ((MxSese03400204) MxReadImpl.parse(MxSese03400204 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03400204 parse(String xml, MxRead parserImpl) {
        return ((MxSese03400204) parserImpl.read(MxSese03400204 .class, xml, _classes));
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
     * Creates an MxSese03400204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03400204 message
     * @return
     *     a new instance of MxSese03400204
     */
    public final static MxSese03400204 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese03400204 .class);
    }

}
