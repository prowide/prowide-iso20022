
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
 * Class for semt.017.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.017.002.01")
public class MxSemt01700201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReport002V01 sctiesTxPstngRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AlternateIdentification2 .class, AmountAndDirection13 .class, AmountAndDirection18 .class, BalanceQuantity7Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClosingBalance2 .class, ClosingBalance2Choice.class, CopyDuplicate1Code.class, CorporateActionEventType2Choice.class, CorporateActionEventType3Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DateType3Code.class, DeliveryReceiptType2Code.class, DocumentIdentification16 .class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentDetails3 .class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification28 .class, IdentificationSource2Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification10 .class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType4Code.class, MarketType6Choice.class, MarketType7Choice.class, MxSemt01700201 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, Number3Choice.class, OpeningBalance2 .class, OpeningBalance2Choice.class, OriginalAndCurrentQuantities4 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification16Choice.class, PartyIdentification17Choice.class, PartyIdentification18Choice.class, PartyIdentification38 .class, PartyIdentificationAndAccount25 .class, Period2 .class, Period2Choice.class, PriceInformation8 .class, PriceRateOrAmountOrUnknown1Choice.class, PriceValueType1Code.class, PurposeCode4Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount16 .class, SecuritiesAccount17 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPostingReport002V01 .class, SecuritiesTransactionType4Code.class, SecuritiesTransactionType6Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails13 .class, SettlementOrCorporateActionEvent4Choice.class, SettlementParties6 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition2Code.class, SettlementTransactionCondition3Choice.class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, ShortLong1Code.class, Statement27 .class, StatementBasis2Code.class, StatementBasis5Choice.class, StatementUpdateType1Code.class, SubAccountIdentification14 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction11 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails18 .class, TypeOfPrice16Code.class, TypeOfPrice8Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.017.002.01";

    public MxSemt01700201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700201(final String xml) {
        this();
        MxSemt01700201 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReport002V01 }
     *     
     */
    public SecuritiesTransactionPostingReport002V01 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReport002V01 }
     *     
     */
    public MxSemt01700201 setSctiesTxPstngRpt(SecuritiesTransactionPostingReport002V01 value) {
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
    public static MxSemt01700201 parse(String xml) {
        return ((MxSemt01700201) MxReadImpl.parse(MxSemt01700201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700201 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700201) parserImpl.read(MxSemt01700201 .class, xml, _classes));
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
     * Creates an MxSemt01700201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700201 message
     * @return
     *     a new instance of MxSemt01700201
     */
    public final static MxSemt01700201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700201 .class);
    }

}
