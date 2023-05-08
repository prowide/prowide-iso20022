
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
 * Class for semt.017.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPstngRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.017.002.05")
public class MxSemt01700205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPstngRpt", required = true)
    protected SecuritiesTransactionPostingReport002V05 sctiesTxPstngRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountAndDirection13 .class, AmountAndDirection18 .class, BalanceQuantity7Choice.class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClosingBalance2 .class, ClosingBalance2Choice.class, CorporateActionEventType14Code.class, CorporateActionEventType19Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateTimePeriodDetails.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FinancialInstrumentDetails18 .class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification28 .class, IdentificationSource4Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification10 .class, MarketIdentification2Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType4Code.class, MarketType6Choice.class, MarketType7Choice.class, MxSemt01700205 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, Number3Choice.class, OpeningBalance2 .class, OpeningBalance2Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, Period2 .class, Period2Choice.class, PriceInformation8 .class, PriceRateOrAmountOrUnknown1Choice.class, PriceValueType1Code.class, PurposeCode4Choice.class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount16 .class, SecuritiesAccount17 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPostingReport002V05 .class, SecuritiesTransactionType13Choice.class, SecuritiesTransactionType8Code.class, SecurityIdentification15 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails87 .class, SettlementOrCorporateActionEvent12Choice.class, SettlementParties21 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition14Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlingCapacity2Code.class, SettlingCapacity5Choice.class, ShortLong1Code.class, Statement27 .class, StatementBasis2Code.class, StatementBasis5Choice.class, StatementUpdateType1Code.class, SubAccountIdentification35 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction39 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails68 .class, TypeOfPrice16Code.class, TypeOfPrice8Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.017.002.05";

    public MxSemt01700205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01700205(final String xml) {
        this();
        MxSemt01700205 tmp = parse(xml);
        sctiesTxPstngRpt = tmp.getSctiesTxPstngRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01700205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPstngRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPostingReport002V05 }
     *     
     */
    public SecuritiesTransactionPostingReport002V05 getSctiesTxPstngRpt() {
        return sctiesTxPstngRpt;
    }

    /**
     * Sets the value of the sctiesTxPstngRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPostingReport002V05 }
     *     
     */
    public MxSemt01700205 setSctiesTxPstngRpt(SecuritiesTransactionPostingReport002V05 value) {
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
    public static MxSemt01700205 parse(String xml) {
        return ((MxSemt01700205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01700205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01700205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01700205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01700205 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01700205) parserImpl.read(MxSemt01700205 .class, xml, _classes));
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
     * Creates an MxSemt01700205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01700205 message
     * @return
     *     a new instance of MxSemt01700205
     */
    public static final MxSemt01700205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01700205 .class);
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
