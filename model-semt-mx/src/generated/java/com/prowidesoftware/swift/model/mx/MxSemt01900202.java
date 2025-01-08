
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
 * Class for semt.019.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.019.002.02")
public class MxSemt01900202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtRpt", required = true)
    protected SecuritiesSettlementTransactionAllegementReportV02Subset sctiesSttlmTxAllgmtRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AllegementStatus1Code.class, AllegementStatus2Choice.class, AlternatePartyIdentification3 .class, AmountAndDirection13 .class, AmountAndDirection25 .class, AmountAndDirection26 .class, BeneficialOwnership2Choice.class, CashAccountIdentification6Choice.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, ClassificationType3Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, EventFrequency4Code.class, FinancialInstrumentAttributes29 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, Frequency6Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, LegalFramework1Code.class, LegalFramework2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketIdentification9 .class, MarketType2Code.class, MarketType5Choice.class, MarketType5Code.class, MarketType6Choice.class, MxSemt01900202 .class, NameAndAddress12 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherAmounts11 .class, OtherIdentification2 .class, OtherParties16 .class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount63 .class, PartyTextInformation3 .class, PaymentDirection3Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityAndAccount23 .class, QuantityBreakdown7 .class, Rate2 .class, RateName2 .class, RateType1Code.class, RateType8Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, RepurchaseType10Choice.class, RepurchaseType6Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesFinancingTransactionDetails9 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionAllegementReportV02Subset.class, SecuritiesTradeDetails22 .class, SecuritiesTransactionType6Code.class, SecuritiesTransactionType8Choice.class, SecurityIdentification15 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails34 .class, SettlementParties18 .class, SettlementTransactionCondition10Choice.class, SettlementTransactionCondition4Code.class, Statement28 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TerminationDate3Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.019.002.02";

    public MxSemt01900202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01900202(final String xml) {
        this();
        MxSemt01900202 tmp = parse(xml);
        sctiesSttlmTxAllgmtRpt = tmp.getSctiesSttlmTxAllgmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01900202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementReportV02Subset }
     *     
     */
    public SecuritiesSettlementTransactionAllegementReportV02Subset getSctiesSttlmTxAllgmtRpt() {
        return sctiesSttlmTxAllgmtRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementReportV02Subset }
     *     
     */
    public MxSemt01900202 setSctiesSttlmTxAllgmtRpt(SecuritiesSettlementTransactionAllegementReportV02Subset value) {
        this.sctiesSttlmTxAllgmtRpt = value;
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
    public static MxSemt01900202 parse(String xml) {
        return ((MxSemt01900202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01900202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01900202 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01900202) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01900202 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01900202 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01900202) parserImpl.read(MxSemt01900202 .class, xml, _classes));
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
     * Creates an MxSemt01900202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01900202 message
     * @return
     *     a new instance of MxSemt01900202
     */
    public static final MxSemt01900202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01900202 .class);
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
