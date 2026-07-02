
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
 * Class for semt.017.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.09")
public class MxSemt01700109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReportV09 sctiesTxPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account29 .class, AccountIdentification26 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AddressType2Code.class, AmountAndDirection21 .class, AmountAndDirection3 .class, BalanceQuantity8Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClosingBalance3 .class, ClosingBalance4Choice.class, CorporateActionEventType28Code.class, CorporateActionEventType73Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateTimePeriodDetails2 .class, DateType3Code.class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, EventFrequency4Code.class, FinancialInstrument72 .class, FinancialInstrumentDetails32 .class, FinancialInstrumentQuantity1Choice.class, FormOfSecurity1Code.class, Frequency25Choice.class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, Intermediary44 .class, InvestmentFundRole2Code.class, LetterOfGuarantee4Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketIdentification89 .class, MarketType15Choice.class, MarketType2Code.class, MarketType4Code.class, MarketType8Choice.class, MxSemt01700109 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number3Choice.class, OpeningBalance3 .class, OpeningBalance4Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification125Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PartyIdentification139 .class, PartyIdentification144 .class, PartyIdentification148 .class, PartyIdentificationAndAccount170 .class, Period2 .class, Period5Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PriceInformation21 .class, PriceRateOrAmountOrUnknown2Choice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration9Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, Role6Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount25 .class, SecuritiesAccount36 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS4Choice.class, SecuritiesTransactionPostingReportV09 .class, SecuritiesTransactionType27Code.class, SecuritiesTransactionType48Choice.class, SecurityClassificationType2Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails150 .class, SettlementOrCorporateActionEvent26Choice.class, SettlementParties78 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, ShortLong1Code.class, SimpleIdentificationInformation4 .class, Statement61 .class, StatementBasis2Code.class, StatementBasis8Choice.class, StatementUpdateType1Code.class, SubAccountIdentification53 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, Transaction69 .class, TransactionActivity1Code.class, TransactionActivity3Choice.class, TransactionDetails114 .class, TypeOfPrice17Code.class, TypeOfPrice48Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.09";

    public MxSemt01700109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700109(final String xml) {
        this();
        MxSemt01700109 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReportV09 }
     *     
     */
    public SecuritiesTransactionPostingReportV09 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReportV09 }
     *     
     */
    public MxSemt01700109 setSctiesTxPstngRpt(SecuritiesTransactionPostingReportV09 value) {
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
    public static MxSemt01700109 parse(String xml) {
        return ((MxSemt01700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700109 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700109) parserImpl.read(MxSemt01700109 .class, xml, _classes));
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
     * Creates an MxSemt01700109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700109 message
     * @return
     *     a new instance of MxSemt01700109
     */
    public final static MxSemt01700109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700109 .class);
    }

}
