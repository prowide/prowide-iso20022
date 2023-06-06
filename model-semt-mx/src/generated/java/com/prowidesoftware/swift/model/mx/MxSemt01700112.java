
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
 * Class for semt.017.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.12")
public class MxSemt01700112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReportV12 sctiesTxPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account29 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AddressType2Code.class, AmountAndDirection21 .class, AmountAndDirection3 .class, BalanceQuantity14Choice.class, BeneficialOwnership4Choice.class, BlockChainAddressWallet2 .class, BlockChainAddressWallet3 .class, BlockChainAddressWallet4 .class, BlockTrade1Code.class, BlockTrade4Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClosingBalance5 .class, ClosingBalance6Choice.class, CorporateActionEventType33Code.class, CorporateActionEventType88Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DateType3Code.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, EventFrequency4Code.class, FinancialInstrument72 .class, FinancialInstrumentDetails41 .class, FinancialInstrumentQuantity33Choice.class, FormOfSecurity1Code.class, Frequency25Choice.class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, Intermediary44 .class, InvestmentFundRole2Code.class, LetterOfGuarantee4Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketIdentification89 .class, MarketType15Choice.class, MarketType2Code.class, MarketType4Code.class, MarketType8Choice.class, MxSemt01700112 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number3Choice.class, OpeningBalance5 .class, OpeningBalance6Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification125Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PartyIdentification139 .class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentificationAndAccount195 .class, Period2 .class, Period7Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PriceInformation21 .class, PriceRateOrAmountOrUnknown2Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity51Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration9Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, Role6Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount25 .class, SecuritiesAccount36 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS4Choice.class, SecuritiesTransactionPostingReportV12 .class, SecuritiesTransactionType27Code.class, SecuritiesTransactionType48Choice.class, SecurityClassificationType2Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails190 .class, SettlementOrCorporateActionEvent31Choice.class, SettlementParties97 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition12Code.class, SettlementTransactionCondition34Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement79 .class, StatementBasis2Code.class, StatementBasis8Choice.class, StatementUpdateType1Code.class, SubAccountIdentification64 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, Transaction123 .class, TransactionActivity1Code.class, TransactionActivity3Choice.class, TransactionDetails154 .class, TypeOfPrice17Code.class, TypeOfPrice48Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.12";

    public MxSemt01700112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700112(final String xml) {
        this();
        MxSemt01700112 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReportV12 }
     *     
     */
    public SecuritiesTransactionPostingReportV12 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReportV12 }
     *     
     */
    public MxSemt01700112 setSctiesTxPstngRpt(SecuritiesTransactionPostingReportV12 value) {
        this.sctiesTxPstngRpt = value;
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
    public static MxSemt01700112 parse(String xml) {
        return ((MxSemt01700112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700112 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700112 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700112) parserImpl.read(MxSemt01700112 .class, xml, _classes));
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
     * Creates an MxSemt01700112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700112 message
     * @return
     *     a new instance of MxSemt01700112
     */
    public static final MxSemt01700112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700112 .class);
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
