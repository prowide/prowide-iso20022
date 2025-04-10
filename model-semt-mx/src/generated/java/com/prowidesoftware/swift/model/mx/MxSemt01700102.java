
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
 * Class for semt.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.02")
public class MxSemt01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReportV02 sctiesTxPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection3 .class, AmountAndDirection4 .class, BalanceQuantity5Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClosingBalance1 .class, ClosingBalance1Choice.class, CorporateActionEventType1Choice.class, CorporateActionEventType3Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FinancialInstrumentDetails5 .class, FinancialInstrumentQuantity1Choice.class, Frequency4Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification22 .class, IdentificationSource3Choice.class, LetterOfGuarantee1Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketIdentification6 .class, MarketType2Code.class, MarketType3Choice.class, MarketType4Choice.class, MarketType4Code.class, MxSemt01700102 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number3Choice.class, OpeningBalance1 .class, OpeningBalance1Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification36Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification46 .class, PartyIdentificationAndAccount44 .class, Period2 .class, Period2Choice.class, PostalAddress1 .class, PriceInformation6 .class, PriceRateOrAmountOrUnknownChoice.class, PriceValueType1Code.class, PurposeCode2Choice.class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, RepurchaseType3Choice.class, RepurchaseType3Code.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesAccount14 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS1Choice.class, SecuritiesTransactionPostingReportV02 .class, SecuritiesTransactionType3Choice.class, SecuritiesTransactionType4Code.class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails27 .class, SettlementOrCorporateActionEvent1Choice.class, SettlementParties13 .class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Choice.class, SettlementTransactionCondition6Code.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, ShortLong1Code.class, Statement11 .class, StatementBasis2Choice.class, StatementBasis2Code.class, StatementUpdateType1Code.class, SubAccountIdentification15 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TradeDate1Choice.class, TradeDateCode1Choice.class, Transaction13 .class, TransactionActivity1Choice.class, TransactionActivity1Code.class, TransactionDetails24 .class, TypeOfPrice16Code.class, TypeOfPrice6Choice.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.001.02";

    public MxSemt01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700102(final String xml) {
        this();
        MxSemt01700102 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReportV02 }
     *     
     */
    public SecuritiesTransactionPostingReportV02 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReportV02 }
     *     
     */
    public MxSemt01700102 setSctiesTxPstngRpt(SecuritiesTransactionPostingReportV02 value) {
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
    public static MxSemt01700102 parse(String xml) {
        return ((MxSemt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700102) parserImpl.read(MxSemt01700102 .class, xml, _classes));
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
     * Creates an MxSemt01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700102 message
     * @return
     *     a new instance of MxSemt01700102
     */
    public static final MxSemt01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700102 .class);
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
