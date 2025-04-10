
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
 * Class for sese.034.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.02")
public class MxSese03400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgStsAdvc", required = true)
    protected SecuritiesFinancingStatusAdviceV02 sctiesFincgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus2Choice.class, AcknowledgedAcceptedStatus3Choice.class, AcknowledgementReason2 .class, AcknowledgementReason3 .class, AcknowledgementReason3Choice.class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndDirection4 .class, AmountAndDirection8 .class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CancellationReason1 .class, CancellationReason5Choice.class, CancellationStatus4Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType4Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DeniedReason1 .class, DeniedReason3Choice.class, DeniedReason3Code.class, DeniedStatus1Choice.class, FailingReason1 .class, FailingReason1Choice.class, FailingReason1Code.class, FailingStatus1Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MatchingStatus3Choice.class, MxSese03400102 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, NoReasonCode.class, NoSpecifiedReason1 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification48 .class, PartyIdentificationAndAccount42 .class, PartyTextInformation1 .class, PendingProcessingReason1 .class, PendingProcessingReason1Choice.class, PendingProcessingReason1Code.class, PendingProcessingStatus1Choice.class, PendingReason1 .class, PendingReason1Choice.class, PendingReason1Code.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason6Code.class, PendingStatus3Choice.class, PendingStatus4Choice.class, PostalAddress1 .class, ProcessingStatus3Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, ReceiveDelivery1Code.class, RejectionReason26Code.class, RejectionReason2Choice.class, RejectionReason6 .class, RejectionStatus3Choice.class, RepairReason2Choice.class, RepairReason3 .class, RepairReason5Code.class, RepairStatus3Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus2Choice.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesFinancingStatusAdviceV02 .class, SecuritiesFinancingTransactionDetails8 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesRTGS1Choice.class, SecurityIdentification14 .class, SettlementDate2Choice.class, SettlementDateCode2Choice.class, SettlementDetails29 .class, SettlementParties11 .class, SettlementStatus2Choice.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition7Choice.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TransactionIdentifications1 .class, TypeOfIdentification1Code.class, UnmatchedReason1Code.class, UnmatchedReason2 .class, UnmatchedReason3Choice.class, UnmatchedStatus2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.02";

    public MxSese03400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03400102(final String xml) {
        this();
        MxSese03400102 tmp = parse(xml);
        sctiesFincgStsAdvc = tmp.getSctiesFincgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingStatusAdviceV02 }
     *     
     */
    public SecuritiesFinancingStatusAdviceV02 getSctiesFincgStsAdvc() {
        return sctiesFincgStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingStatusAdviceV02 }
     *     
     */
    public MxSese03400102 setSctiesFincgStsAdvc(SecuritiesFinancingStatusAdviceV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese03400102 parse(String xml) {
        return ((MxSese03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03400102 parse(String xml, MxRead parserImpl) {
        return ((MxSese03400102) parserImpl.read(MxSese03400102 .class, xml, _classes));
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
     * Creates an MxSese03400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03400102 message
     * @return
     *     a new instance of MxSese03400102
     */
    public final static MxSese03400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03400102 .class);
    }

}
