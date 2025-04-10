
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
 * Class for semt.017.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.017.002.07")
public class MxSemt01700207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReport002V07 sctiesTxPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountAndDirection18 .class, AmountAndDirection59 .class, BalanceQuantity12Choice.class, BeneficialOwnership5Choice.class, BlockTrade1Code.class, BlockTrade5Choice.class, CashSettlementSystem2Code.class, CashSettlementSystem5Choice.class, CentralCounterPartyEligibility5Choice.class, ClosingBalance4 .class, ClosingBalance5Choice.class, CorporateActionEventType24Code.class, CorporateActionEventType71Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FinancialInstrumentDetails27 .class, FinancialInstrumentQuantity15Choice.class, Frequency26Choice.class, GenericIdentification144 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, LetterOfGuarantee5Choice.class, MarketClientSide5Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketIdentification91 .class, MarketType16Choice.class, MarketType17Choice.class, MarketType2Code.class, MarketType4Code.class, MxSemt01700207 .class, NameAndAddress12 .class, NettingEligibility5Choice.class, Number3Choice.class, OpeningBalance4 .class, OpeningBalance5Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification108 .class, PartyIdentification119 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount146 .class, Period2 .class, Period2Choice.class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification2 .class, PriceInformation16 .class, PriceRateOrAmountOrUnknown1Choice.class, PriceValueType1Code.class, PurposeCode8Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration11Choice.class, Registration1Code.class, RepurchaseType24Choice.class, RepurchaseType9Code.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction6Choice.class, SafeKeepingPlace2 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SecuritiesAccount27 .class, SecuritiesAccount30 .class, SecuritiesAccount34 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS5Choice.class, SecuritiesTransactionPostingReport002V07 .class, SecuritiesTransactionType24Choice.class, SecuritiesTransactionType8Code.class, SecurityIdentification20 .class, SettlementDate12Choice.class, SettlementDate4Code.class, SettlementDateCode9Choice.class, SettlementDetails139 .class, SettlementOrCorporateActionEvent20Choice.class, SettlementParties49 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod5Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition28Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity8Choice.class, ShortLong1Code.class, Statement56 .class, StatementBasis12Choice.class, StatementBasis2Code.class, StatementUpdateType1Code.class, SubAccountIdentification50 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty5Choice.class, TaxLiability1Code.class, TradeDate6Choice.class, TradeDateCode4Choice.class, Transaction55 .class, TransactionActivity1Code.class, TransactionActivity4Choice.class, TransactionDetails98 .class, TypeOfPrice16Code.class, TypeOfPrice45Choice.class, UpdateType16Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.017.002.07";

    public MxSemt01700207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700207(final String xml) {
        this();
        MxSemt01700207 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReport002V07 }
     *     
     */
    public SecuritiesTransactionPostingReport002V07 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReport002V07 }
     *     
     */
    public MxSemt01700207 setSctiesTxPstngRpt(SecuritiesTransactionPostingReport002V07 value) {
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
    public static MxSemt01700207 parse(String xml) {
        return ((MxSemt01700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700207 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700207) parserImpl.read(MxSemt01700207 .class, xml, _classes));
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
     * Creates an MxSemt01700207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700207 message
     * @return
     *     a new instance of MxSemt01700207
     */
    public static final MxSemt01700207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700207 .class);
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
