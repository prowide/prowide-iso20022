
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
 * Class for semt.017.002.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.002.09")
public class MxSemt01700209
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReport002V09 sctiesTxPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account30 .class, AccountIdentification4 .class, AdditionalReference12 .class, AmountAndDirection18 .class, AmountAndDirection59 .class, BalanceQuantity12Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClosingBalance4 .class, ClosingBalance5Choice.class, CorporateActionEventType28Code.class, CorporateActionEventType83Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriodDetails2 .class, DateType3Code.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, EventFrequency4Code.class, FinancialInstrument76 .class, FinancialInstrumentDetails33 .class, FinancialInstrumentQuantity15Choice.class, FormOfSecurity1Code.class, Frequency26Choice.class, GenericIdentification144 .class, GenericIdentification18 .class, GenericIdentification39 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, Intermediary45 .class, InvestmentFundRole2Code.class, LetterOfGuarantee5Choice.class, MarketClientSide1Code.class, MarketClientSide7Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketIdentification91 .class, MarketType16Choice.class, MarketType17Choice.class, MarketType2Code.class, MarketType4Code.class, MxSemt01700209 .class, NameAndAddress11 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number3Choice.class, OpeningBalance4 .class, OpeningBalance5Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification145Choice.class, PartyIdentification152Choice.class, PartyIdentification156 .class, PartyIdentification157 .class, PartyIdentification191 .class, PartyIdentification192 .class, PartyIdentificationAndAccount190 .class, Period2 .class, Period5Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification2 .class, PostalAddress7 .class, PriceInformation24 .class, PriceRateOrAmountOrUnknown3Choice.class, PriceValueType1Code.class, PurposeCode8Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, RepurchaseType24Choice.class, RepurchaseType9Code.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, Role7Choice.class, SafeKeepingPlace4 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount30 .class, SecuritiesAccount34 .class, SecuritiesAccount40 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS5Choice.class, SecuritiesTransactionPostingReport002V09 .class, SecuritiesTransactionType27Code.class, SecuritiesTransactionType58Choice.class, SecurityClassificationType3Choice.class, SecurityIdentification20 .class, SettlementDate20Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails162 .class, SettlementOrCorporateActionEvent29Choice.class, SettlementParties90 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition28Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement71 .class, StatementBasis12Choice.class, StatementBasis2Code.class, StatementUpdateType1Code.class, SubAccountIdentification59 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate9Choice.class, TradeDateCode4Choice.class, Transaction72 .class, TransactionActivity1Code.class, TransactionActivity4Choice.class, TransactionDetails124 .class, TypeOfPrice17Code.class, TypeOfPrice49Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.002.09";

    public MxSemt01700209() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700209(final String xml) {
        this();
        MxSemt01700209 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700209(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReport002V09 }
     *     
     */
    public SecuritiesTransactionPostingReport002V09 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReport002V09 }
     *     
     */
    public MxSemt01700209 setSctiesTxPstngRpt(SecuritiesTransactionPostingReport002V09 value) {
        this.sctiesTxPstngRpt = value;
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
    public static MxSemt01700209 parse(String xml) {
        return ((MxSemt01700209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700209 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700209) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700209 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700209 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700209) parserImpl.read(MxSemt01700209 .class, xml, _classes));
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
     * Creates an MxSemt01700209 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700209 message
     * @return
     *     a new instance of MxSemt01700209
     */
    public final static MxSemt01700209 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700209 .class);
    }

}
