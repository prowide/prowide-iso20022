
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
 * Class for semt.017.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.07")
public class MxSemt01700107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReportV07 sctiesTxPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection21 .class, AmountAndDirection3 .class, BalanceQuantity8Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClosingBalance3 .class, ClosingBalance4Choice.class, CorporateActionEventType24Code.class, CorporateActionEventType56Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FinancialInstrumentDetails25 .class, FinancialInstrumentQuantity1Choice.class, Frequency25Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification56 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, LetterOfGuarantee4Choice.class, MarketClientSide4Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketIdentification89 .class, MarketType15Choice.class, MarketType2Code.class, MarketType4Code.class, MarketType8Choice.class, MxSemt01700107 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number3Choice.class, OpeningBalance3 .class, OpeningBalance4Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification91 .class, PartyIdentification92Choice.class, PartyIdentification98 .class, PartyIdentificationAndAccount117 .class, Period2 .class, Period2Choice.class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PriceInformation13 .class, PriceRateOrAmountOrUnknownChoice.class, PriceValueType1Code.class, PurposeCode7Choice.class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration9Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount24 .class, SecuritiesAccount25 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS4Choice.class, SecuritiesTransactionPostingReportV07 .class, SecuritiesTransactionType18Choice.class, SecuritiesTransactionType8Code.class, SecurityIdentification19 .class, SettlementDate4Code.class, SettlementDate9Choice.class, SettlementDateCode7Choice.class, SettlementDetails126 .class, SettlementOrCorporateActionEvent19Choice.class, SettlementParties40 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, ShortLong1Code.class, Statement44 .class, StatementBasis2Code.class, StatementBasis8Choice.class, StatementUpdateType1Code.class, SubAccountIdentification49 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate5Choice.class, TradeDateCode3Choice.class, Transaction52 .class, TransactionActivity1Code.class, TransactionActivity3Choice.class, TransactionDetails95 .class, TypeOfPrice16Code.class, TypeOfPrice30Choice.class, UpdateType15Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.07";

    public MxSemt01700107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700107(final String xml) {
        this();
        MxSemt01700107 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReportV07 }
     *     
     */
    public SecuritiesTransactionPostingReportV07 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReportV07 }
     *     
     */
    public MxSemt01700107 setSctiesTxPstngRpt(SecuritiesTransactionPostingReportV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSemt01700107 parse(String xml) {
        return ((MxSemt01700107) MxReadImpl.parse(MxSemt01700107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700107 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700107) parserImpl.read(MxSemt01700107 .class, xml, _classes));
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
     * Creates an MxSemt01700107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700107 message
     * @return
     *     a new instance of MxSemt01700107
     */
    public final static MxSemt01700107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700107 .class);
    }

}
