
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
 * Class for sese.032.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxGnrtnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.032.001.03")
public class MxSese03200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctn", required = true)
    protected SecuritiesSettlementTransactionGenerationNotificationV03 sctiesSttlmTxGnrtnNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 32;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus7Choice.class, AcknowledgementReason3 .class, AcknowledgementReason4Choice.class, AcknowledgementReason5Code.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Choice.class, AffirmationStatus1Code.class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection9 .class, AutoBorrowing1Code.class, AutomaticBorrowing1Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashAccountIdentification5Choice.class, CashParties8 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Choice.class, DeliveryReturn1Code.class, DocumentNumber1Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType2Code.class, ExposureType3Choice.class, FXStandingInstruction1Choice.class, FailingReason2Code.class, FailingReason3 .class, FailingReason3Choice.class, FailingStatus3Choice.class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GeneratedReason1 .class, GeneratedReason2Code.class, GeneratedReasons1Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification37 .class, HoldIndicator4 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InvestorCapacity1Choice.class, LetterOfGuarantee1Choice.class, Linkages17 .class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MatchingStatus1Choice.class, MatchingStatus1Code.class, MatchingStatus7Choice.class, ModificationCancellationAllowed1Choice.class, MxSese03200103 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, NoReasonCode.class, Number2Choice.class, NumberCount1Choice.class, OpeningClosing1Choice.class, OpeningClosing1Code.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts14 .class, OtherIdentification1 .class, OtherParties19 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity1Choice.class, PartyIdentification36Choice.class, PartyIdentification38Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification48 .class, PartyIdentificationAndAccount39 .class, PartyIdentificationAndAccount41 .class, PartyIdentificationAndAccount42 .class, PartyIdentificationAndAccount50 .class, PartyIdentificationAndAccount81 .class, PartyIdentificationAndAccount86 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PendingProcessingReason2Code.class, PendingProcessingReason3 .class, PendingProcessingReason3Choice.class, PendingProcessingStatus3Choice.class, PendingReason13Choice.class, PendingReason2 .class, PendingReason2Choice.class, PendingReason2Code.class, PendingReason5 .class, PendingReason6Code.class, PendingStatus13Choice.class, PendingStatus9Choice.class, PostalAddress1 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProcessingStatus23Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, Quantity6Choice.class, QuantityAndAccount25 .class, QuantityBreakdown13 .class, ReceiveDelivery1Code.class, References25Choice.class, Registration1Choice.class, Registration1Code.class, Registration2Code.class, Registration7Choice.class, RegistrationParameters1 .class, RegistrationReason3 .class, RepairReason1 .class, RepairReason1Choice.class, RepairReason4Code.class, RepairStatus5Choice.class, Reporting2Choice.class, Reporting2Code.class, RepurchaseType1Choice.class, RepurchaseType2Code.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionGenerationNotificationV03 .class, SecuritiesTradeDetails1 .class, SecuritiesTransactionType7Code.class, SecuritiesTransactionType9Choice.class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails42 .class, SettlementParties11 .class, SettlementStatus7Choice.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition12Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlementTypeAndIdentification15 .class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, StatusAndReason12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking1Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeOriginator1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, UnmatchedReason5Code.class, UnmatchedReason6 .class, UnmatchedReason9Choice.class, UnmatchedStatus5Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.032.001.03";

    public MxSese03200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03200103(final String xml) {
        this();
        MxSese03200103 tmp = parse(xml);
        sctiesSttlmTxGnrtnNtfctn = tmp.getSctiesSttlmTxGnrtnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionGenerationNotificationV03 }
     *     
     */
    public SecuritiesSettlementTransactionGenerationNotificationV03 getSctiesSttlmTxGnrtnNtfctn() {
        return sctiesSttlmTxGnrtnNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionGenerationNotificationV03 }
     *     
     */
    public MxSese03200103 setSctiesSttlmTxGnrtnNtfctn(SecuritiesSettlementTransactionGenerationNotificationV03 value) {
        this.sctiesSttlmTxGnrtnNtfctn = value;
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
    public static MxSese03200103 parse(String xml) {
        return ((MxSese03200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03200103 parse(String xml, MxRead parserImpl) {
        return ((MxSese03200103) parserImpl.read(MxSese03200103 .class, xml, _classes));
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
     * Creates an MxSese03200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03200103 message
     * @return
     *     a new instance of MxSese03200103
     */
    public final static MxSese03200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03200103 .class);
    }

}
