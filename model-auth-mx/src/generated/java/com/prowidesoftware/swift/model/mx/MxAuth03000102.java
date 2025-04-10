
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
 * Class for auth.030.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.030.001.02")
public class MxAuth03000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRpt", required = true)
    protected DerivativesTradeReportV02 derivsTradRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd19DecimalAmount.class, AgreementType2Choice.class, AmountAndDirection106 .class, AssetClassCommodity2Choice.class, AssetClassSubProductAgriculturalType1Code.class, AssetClassSubProductEnergyType1Code.class, AssetClassSubProductEnvironmentalType1Code.class, AssetClassSubProductFreight1Code.class, AssetClassSubProductMetal1Code.class, BasketConstituents1 .class, BenchmarkCurveName5Code.class, Cleared12Choice.class, ClearingObligationType1Code.class, ClearingPartyAndTime10 .class, CollateralisationType2Code.class, CommonTradeDataReport49 .class, CommonTradeDataReport50 .class, ContractModification4 .class, ContractType10 .class, ContractValuationData6 .class, Counterparty31 .class, Counterparty34 .class, CounterpartySpecificData29 .class, CounterpartyTradeNature9Choice.class, CreditDerivative4 .class, CurrencyExchange17 .class, CustomBasket1 .class, DateTimePeriod1 .class, DebtInstrumentSeniorityType2Code.class, DeliveryInterconnectionPoint1Choice.class, DerivativePartyIdentification1Choice.class, DerivativesTradeReportV02 .class, Direction2Choice.class, DurationType1Code.class, EnergyDeliveryAttribute5 .class, EnergyLoadType1Code.class, EnergyQuantityUnit2Choice.class, EnergyQuantityUnit2Code.class, EnergySpecificAttribute6 .class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, ExerciseDate1Choice.class, FinancialInstrumentContractType2Code.class, FinancialInstrumentQuantity32Choice.class, FinancialPartySectorType1Code.class, FixedRate10 .class, FloatingRate7 .class, FloatingRateIdentification4Choice.class, Frequency13Code.class, GenericIdentification174 .class, GenericIdentification175 .class, GenericIdentification179 .class, InstrumentIdentification1Choice.class, InterestComputationMethod4Code.class, InterestComputationMethodFormat7 .class, InterestRate23Choice.class, InterestRateContractTerm4 .class, InterestRateFrequency3Choice.class, InterestRateLegs9 .class, LegCurrency2 .class, MasterAgreement7 .class, ModificationLevel1Code.class, MxAuth03000102 .class, NaturalPersonIdentification2 .class, NoReasonCode.class, NonFinancialInstitutionSector2 .class, NonFinancialInstitutionSector4 .class, NotApplicable1Code.class, NotionalAmount1 .class, NotionalQuantity1 .class, OptionOrSwaption7 .class, OptionParty1Code.class, OptionParty3Code.class, OptionStyle6Code.class, OptionType2Code.class, OrganisationIdentification10Choice.class, OrganisationIdentification36 .class, OtherPayment3 .class, Package1 .class, Pagination1 .class, PartyIdentification235Choice.class, PaymentType4Code.class, PaymentType5Choice.class, PhysicalTransferType4Code.class, PortfolioCode1Choice.class, PrePostHaircut1 .class, PriceData1 .class, PriceStatus1Code.class, PriceStatus2Code.class, ProductType4Code.class, Quantity47Choice.class, Reconciliation2Code.class, ReportPeriodActivity1Code.class, Schedule1 .class, Schedule2 .class, Schedule3 .class, Schedule4 .class, SecuritiesTransactionPrice13Choice.class, SecuritiesTransactionPrice14Choice.class, SecuritiesTransactionPrice17Choice.class, SecuritiesTransactionPrice5 .class, SecurityIdentification22 .class, SecurityIdentification36Choice.class, SecurityIdentification37Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes4 .class, TimePeriodDetails1 .class, TradeClearing5 .class, TradeCollateralReport5 .class, TradeConfirmation1Choice.class, TradeConfirmation2 .class, TradeConfirmationType1Code.class, TradeConfirmationType2Code.class, TradeCounterpartyReport14 .class, TradeData19Choice.class, TradeData23 .class, TradeNonConfirmation1 .class, TradeQueryHeader4 .class, TradeReport15Choice.class, TradeStateReport12 .class, TradeTransaction37 .class, TradingCapacity7Code.class, Tranche3 .class, TrancheIndicator3Choice.class, TransactionOperationType7Code.class, UnderlyingIdentification1Code.class, UniqueTransactionIdentifier1Choice.class, UnitOfMeasure12Code.class, ValuationType1Code.class, WeekDay3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.030.001.02";

    public MxAuth03000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03000102(final String xml) {
        this();
        MxAuth03000102 tmp = parse(xml);
        derivsTradRpt = tmp.getDerivsTradRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReportV02 }
     *     
     */
    public DerivativesTradeReportV02 getDerivsTradRpt() {
        return derivsTradRpt;
    }

    /**
     * Sets the value of the derivsTradRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReportV02 }
     *     
     */
    public MxAuth03000102 setDerivsTradRpt(DerivativesTradeReportV02 value) {
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
    public static MxAuth03000102 parse(String xml) {
        return ((MxAuth03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03000102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03000102) parserImpl.read(MxAuth03000102 .class, xml, _classes));
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
     * Creates an MxAuth03000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03000102 message
     * @return
     *     a new instance of MxAuth03000102
     */
    public static final MxAuth03000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03000102 .class);
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
