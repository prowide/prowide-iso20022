
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
 * Class for setr.044.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTradConfStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.03")
public class MxSetr04400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTradConfStsAdvc", required = true)
    protected SecuritiesTradeConfirmationStatusAdviceV03 sctiesTradConfStsAdvc;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification55Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationReason2 .class, AffirmationReason2Choice.class, AffirmationStatus11Choice.class, AllegementMatchingReason2 .class, AllegementReason1Code.class, AllegementReason2Choice.class, AlternatePartyIdentification8 .class, AmountAndDirection29 .class, AmountOrRate2Choice.class, AwaitingAffirmationReason1Code.class, AwaitingAffirmationReason2 .class, AwaitingAffirmationReason2Choice.class, AwaitingCancellationReason1Code.class, AwaitingCancellationReason2 .class, AwaitingCancellationReason2Choice.class, BusinessProcessType1Code.class, BusinessProcessType2Choice.class, CalculationType1Code.class, CallIn1Code.class, CancellationProcessingStatus10Choice.class, CancellationReason39Choice.class, CashAccountIdentification5Choice.class, CashMarginOrder1Code.class, ChargeTaxBasis1Code.class, ChargeTaxBasisType2Choice.class, Commission25 .class, CommissionType6Choice.class, CommissionType9Code.class, ConfirmationParties9 .class, ConfirmationPartyDetails11 .class, ConfirmationPartyDetails12 .class, ConfirmationPartyDetails14 .class, ConfirmationPartyDetails16 .class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime1Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, DeliveryReceiptType2Code.class, DocumentNumber17Choice.class, EUCapitalGain2Code.class, EUCapitalGainType3Choice.class, Eligibility1Code.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms18 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, IdentificationReference11Choice.class, IdentificationSource3Choice.class, IdentificationType43Choice.class, InstructionProcessingReason3Choice.class, InstructionProcessingReason4Choice.class, InterestType2Code.class, InvestorCapacity4Choice.class, Linkages72 .class, MarketIdentification3Choice.class, MarketIdentification93 .class, MarketIdentification97 .class, MarketType18Choice.class, MarketType2Code.class, MarketType6Code.class, MarketType8Choice.class, MatchingReason5Choice.class, MatchingReason6Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, MatchingStatus35Choice.class, MxSetr04400103 .class, NameAndAddress13 .class, NoReasonCode.class, Order23 .class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, PartialFill4 .class, PartyIdentification240Choice.class, PartyIdentification244Choice.class, PartyIdentification267 .class, PartyIdentification268 .class, PartyIdentificationAndAccount218 .class, PartyIdentificationAndAccount220 .class, PartyTextInformation1 .class, PartyTextInformation5 .class, PendingProcessing2Choice.class, PositionEffect2Code.class, PostalAddress8 .class, Price14 .class, PriceRateOrAmount3Choice.class, PriceValueType7Code.class, ProcessingStatus98Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, PurposeCode9Choice.class, Quantity6Choice.class, QuantityBreakdown76 .class, QuantityOrAmount2Choice.class, RegistrationParameters3 .class, RejectionReason52Choice.class, RejectionReason67 .class, RejectionReason78Code.class, RepairReason14 .class, RepairReason19Choice.class, RepairReason7Code.class, ReplacementProcessingStatus10Choice.class, Reporting2Code.class, Reporting6Choice.class, SecuritiesAccount35 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesCertificate3 .class, SecuritiesTradeConfirmationStatusAdviceV03 .class, SecurityIdentification19 .class, SettlementDate16Choice.class, SettlementDate5Code.class, SettlementDateCode12Choice.class, SettlementParties121 .class, Side3Code.class, SimpleIdentificationInformation2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate7Choice.class, TradeRegulatoryConditions1Code.class, TradeTransactionCondition9Choice.class, TradeType3Code.class, TradeType4Choice.class, TradingCapacity4Code.class, TradingCapacity6Code.class, TradingDate1Code.class, TradingDateCode2Choice.class, TradingPartyCapacity3Choice.class, TradingPartyCapacity4Choice.class, TransactiontIdentification4 .class, TypeOfIdentification2Code.class, TypeOfPrice3Code.class, TypeOfPrice47Choice.class, UnaffirmedReason1Code.class, UnaffirmedReason3Choice.class, UnmatchedReason23 .class, UnmatchedReason32Choice.class, UnmatchedReason4Code.class, YieldCalculation7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.044.001.03";

    public MxSetr04400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr04400103(final String xml) {
        this();
        MxSetr04400103 tmp = parse(xml);
        sctiesTradConfStsAdvc = tmp.getSctiesTradConfStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr04400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTradConfStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTradeConfirmationStatusAdviceV03 }
     *     
     */
    public SecuritiesTradeConfirmationStatusAdviceV03 getSctiesTradConfStsAdvc() {
        return sctiesTradConfStsAdvc;
    }

    /**
     * Sets the value of the sctiesTradConfStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTradeConfirmationStatusAdviceV03 }
     *     
     */
    public MxSetr04400103 setSctiesTradConfStsAdvc(SecuritiesTradeConfirmationStatusAdviceV03 value) {
        this.sctiesTradConfStsAdvc = value;
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
    public static MxSetr04400103 parse(String xml) {
        return ((MxSetr04400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr04400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr04400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr04400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr04400103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr04400103) parserImpl.read(MxSetr04400103 .class, xml, _classes));
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
     * Creates an MxSetr04400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr04400103 message
     * @return
     *     a new instance of MxSetr04400103
     */
    public static final MxSetr04400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr04400103 .class);
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
