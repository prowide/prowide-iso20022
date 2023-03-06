
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
 * Class for setr.044.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConfStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.02")
public class MxSetr04400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConfStsAdvc", required = true)
    protected SecuritiesTradeConfirmationStatusAdviceV02 sctiesTradConfStsAdvc;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationReason1 .class, AffirmationReason1Choice.class, AffirmationStatus6Choice.class, AllegementMatchingReason1 .class, AllegementReason1Choice.class, AllegementReason1Code.class, AlternatePartyIdentification5 .class, AmountAndDirection29 .class, AmountOrRate2Choice.class, AwaitingAffirmationReason1 .class, AwaitingAffirmationReason1Choice.class, AwaitingAffirmationReason1Code.class, AwaitingCancellationReason1 .class, AwaitingCancellationReason1Choice.class, AwaitingCancellationReason1Code.class, BusinessProcessType1Choice.class, BusinessProcessType1Code.class, CalculationType1Code.class, CallIn1Code.class, CancellationProcessingStatus6Choice.class, CancellationReason11Choice.class, CashAccountIdentification2Choice.class, CashMarginOrder1Code.class, ChargeTaxBasis1Code.class, ChargeTaxBasisType1Choice.class, Commission16 .class, CommissionType2Choice.class, CommissionType9Code.class, ConfirmationParties4 .class, ConfirmationPartyDetails1 .class, ConfirmationPartyDetails2 .class, ConfirmationPartyDetails3 .class, ConfirmationPartyDetails6 .class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime1Choice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DeliveryReceiptType2Code.class, DocumentNumber4Choice.class, EUCapitalGain2Code.class, EUCapitalGainType2Choice.class, Eligibility1Code.class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantityChoice.class, ForeignExchangeTerms18 .class, GenericIdentification20 .class, GenericIdentification29 .class, GenericIdentification37 .class, GenericIdentification38 .class, IdentificationReference11Choice.class, IdentificationSource3Choice.class, IdentificationType40Choice.class, InstructionProcessingReason1Choice.class, InstructionProcessingReason2Choice.class, InterestType2Code.class, InvestorCapacity3Choice.class, Linkages18 .class, MarketIdentification3Choice.class, MarketIdentification79 .class, MarketIdentification80 .class, MarketType11Choice.class, MarketType12Choice.class, MarketType2Code.class, MarketType6Code.class, MatchingReason1Choice.class, MatchingReason4Choice.class, MatchingStatus1Code.class, MatchingStatus23Choice.class, MatchingStatus8Choice.class, MxSetr04400102 .class, NameAndAddress13 .class, NoReasonCode.class, Order18 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartialFill2 .class, PartyIdentification32Choice.class, PartyIdentification54 .class, PartyIdentification55 .class, PartyIdentification68Choice.class, PartyIdentificationAndAccount34 .class, PartyIdentificationAndAccount79 .class, PartyTextInformation1 .class, PartyTextInformation5 .class, PendingProcessing1Choice.class, PositionEffect2Code.class, PostalAddress8 .class, Price4 .class, PriceRateOrAmountChoice.class, PriceValueType7Code.class, ProcessingStatus17Choice.class, ProprietaryReason1 .class, ProprietaryStatusAndReason1 .class, PurposeCode5Choice.class, Quantity6Choice.class, QuantityBreakdown11 .class, QuantityOrAmount1Choice.class, RegistrationParameters3 .class, RejectionReason28Code.class, RejectionReason9 .class, RejectionReason9Choice.class, RepairReason5 .class, RepairReason7Code.class, RepairReason9Choice.class, ReplacementProcessingStatus7Choice.class, Reporting2Code.class, Reporting5Choice.class, SecuritiesAccount3 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesCertificate3 .class, SecuritiesTradeConfirmationStatusAdviceV02 .class, SecurityIdentification14 .class, SettlementDate5Code.class, SettlementDate8Choice.class, SettlementDateCode5Choice.class, SettlementParties23 .class, Side3Code.class, SimpleIdentificationInformation2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate4Choice.class, TradeRegulatoryConditions1Code.class, TradeTransactionCondition4Choice.class, TradeType3Choice.class, TradeType3Code.class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingDate1Code.class, TradingDateCode1Choice.class, TradingPartyCapacity1Choice.class, TradingPartyCapacity2Choice.class, TransactiontIdentification4 .class, TypeOfIdentification2Code.class, TypeOfPrice10Choice.class, TypeOfPrice3Code.class, UnaffirmedReason1Code.class, UnaffirmedReason2Choice.class, UnmatchedReason4Code.class, UnmatchedReason5 .class, UnmatchedReason7Choice.class, YieldCalculation2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.02";

    public MxSetr04400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr04400102(final String xml) {
        this();
        MxSetr04400102 tmp = parse(xml);
        sctiesTradConfStsAdvc = tmp.getSctiesTradConfStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr04400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConfStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationStatusAdviceV02 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV02 getSctiesTradConfStsAdvc() {
        return sctiesTradConfStsAdvc;
    }

    /**
     * Sets the value of the sctiesTradConfStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationStatusAdviceV02 }
     *     
     */
    public MxSetr04400102 setSctiesTradConfStsAdvc(SecuritiesTradeConfirmationStatusAdviceV02 value) {
        this.sctiesTradConfStsAdvc = value;
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
    public static MxSetr04400102 parse(String xml) {
        return ((MxSetr04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr04400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr04400102 parse(String xml, MxRead parserImpl) {
        return ((MxSetr04400102) parserImpl.read(MxSetr04400102 .class, xml, _classes));
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
     * Creates an MxSetr04400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr04400102 message
     * @return
     *     a new instance of MxSetr04400102
     */
    public final static MxSetr04400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr04400102 .class);
    }

}
