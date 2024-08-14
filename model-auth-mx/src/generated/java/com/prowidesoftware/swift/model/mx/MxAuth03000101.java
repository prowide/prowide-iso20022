
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
 * Class for auth.030.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.030.001.01")
public class MxAuth03000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRpt", required = true)
    protected DerivativesTradeReportV01 derivsTradRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd20Amount.class, ActiveOrHistoricCurrencyAnd20Amount.class, AmountAndDirection54 .class, AmountAndDirection56 .class, AssetClassCommodity2Choice.class, AssetClassSubProductAgriculturalType1Code.class, AssetClassSubProductEnergyType1Code.class, AssetClassSubProductEnvironmentalType1Code.class, AssetClassSubProductFreight1Code.class, AssetClassSubProductMetal1Code.class, BenchmarkCurveName3Code.class, Cleared9Choice.class, ClearingObligationType1Code.class, ClearingPartyAndTime8 .class, CollateralisationType1Code.class, CommonTradeDataReport33 .class, CommonTradeDataReport34 .class, CommonTradeDataReport35 .class, CommonTradeDataReport36 .class, CommonTradeDataReport37 .class, CommonTradeDataReport38 .class, CommonTradeDataReport39 .class, ContractModification1 .class, ContractType8 .class, ContractValuationData2 .class, ContractValuationData3 .class, Counterparty25 .class, Counterparty26 .class, Counterparty27 .class, Counterparty28 .class, Counterparty29 .class, CounterpartySpecificData21 .class, CounterpartySpecificData22 .class, CounterpartySpecificData23 .class, CounterpartySpecificData24 .class, CounterpartyTradeNature4Choice.class, CounterpartyTradeNature5Choice.class, CreditDerivative2 .class, CurrencyExchange10 .class, DateTimePeriod1 .class, DebtInstrumentSeniorityType2Code.class, DeliveryInterconnectionPoint1Choice.class, DerivativePartyIdentification1Choice.class, DerivativesTradeReportV01 .class, DurationType1Code.class, EnergyDeliveryAttribute4 .class, EnergyLoadType1Code.class, EnergyQuantityUnit1Choice.class, EnergyQuantityUnit1Code.class, EnergySpecificAttribute5 .class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, FinancialInstrumentContractType2Code.class, FinancialInstrumentQuantity30Choice.class, FinancialPartySectorType1Code.class, FixedRate6 .class, FloatingRate5 .class, FloatingRateIdentification3Choice.class, Frequency8Code.class, InterestRate21Choice.class, InterestRateContractTerm3 .class, InterestRateFrequency2Choice.class, InterestRateLegs7 .class, MasterAgreement5 .class, ModificationLevel1Code.class, MxAuth03000101 .class, NoReasonCode.class, NonFinancialInstitutionSector1 .class, NonFinancialInstitutionSector2 .class, OptionOrSwaption4 .class, OptionParty1Code.class, OptionStyle6Code.class, OptionType2Code.class, OrganisationIdentification30 .class, OrganisationIdentification7Choice.class, OrganisationIdentification8Choice.class, OrganisationIdentification9Choice.class, Pagination1 .class, PhysicalTransferType4Code.class, PriceStatus1Code.class, ProductClassification1Choice.class, ProductType4Code.class, Quantity46Choice.class, RateBasis1Code.class, Reconciliation1Code.class, ReportPeriodActivity1Code.class, SecuritiesTransactionPrice10Choice.class, SecuritiesTransactionPrice3Choice.class, SecuritiesTransactionPrice4 .class, SecurityIdentification18Choice.class, SecurityIdentification34Choice.class, SecurityIdentification35Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes1 .class, TimePeriodDetails1 .class, TradeClearing3 .class, TradeCollateralReport1 .class, TradeCollateralReport2 .class, TradeConfirmation1Choice.class, TradeConfirmation2 .class, TradeConfirmation2Choice.class, TradeConfirmation3 .class, TradeConfirmationType1Code.class, TradeConfirmationType2Code.class, TradeCounterpartyReport10 .class, TradeCounterpartyReport8 .class, TradeCounterpartyReport9 .class, TradeData17Choice.class, TradeDataReport1 .class, TradeNewPosition5 .class, TradeNewTransaction10 .class, TradeNonConfirmation1 .class, TradePositionComponent5 .class, TradePositionEarlyTermination5 .class, TradePositionOther5 .class, TradePositionReport7Choice.class, TradePositionValuationUpdate5 .class, TradeQueryHeader4 .class, TradeReport12Choice.class, TradeStateReport10 .class, TradeTransaction24 .class, TradeTransaction25 .class, TradeTransaction26 .class, TradeTransaction27 .class, TradeTransaction28 .class, TradeTransactionEarlyTermination5 .class, TradeTransactionOther6 .class, TradeTransactionReport8Choice.class, TradeTransactionValuationUpdate5 .class, TradingCapacity7Code.class, Tranche2 .class, TrancheIndicator2Choice.class, TransactionOperationType3Code.class, UnderlyingIdentification1Code.class, ValuationType1Code.class, WeekDay3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.030.001.01";

    public MxAuth03000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03000101(final String xml) {
        this();
        MxAuth03000101 tmp = parse(xml);
        derivsTradRpt = tmp.getDerivsTradRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReportV01 }
     *     
     */
    public DerivativesTradeReportV01 getDerivsTradRpt() {
        return derivsTradRpt;
    }

    /**
     * Sets the value of the derivsTradRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReportV01 }
     *     
     */
    public MxAuth03000101 setDerivsTradRpt(DerivativesTradeReportV01 value) {
        this.derivsTradRpt = value;
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
    public static MxAuth03000101 parse(String xml) {
        return ((MxAuth03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03000101) parserImpl.read(MxAuth03000101 .class, xml, _classes));
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
     * Creates an MxAuth03000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03000101 message
     * @return
     *     a new instance of MxAuth03000101
     */
    public static final MxAuth03000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03000101 .class);
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
