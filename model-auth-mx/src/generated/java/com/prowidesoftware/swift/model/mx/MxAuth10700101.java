
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
 * Class for auth.107.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.107.001.01")
public class MxAuth10700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradStatRpt", required = true)
    protected DerivativesTradeStateReportV01 derivsTradStatRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 107;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd19DecimalAmount.class, AgreementType2Choice.class, AgriculturalCommodityDairy2 .class, AgriculturalCommodityForestry2 .class, AgriculturalCommodityGrain3 .class, AgriculturalCommodityLiveStock2 .class, AgriculturalCommodityOilSeed2 .class, AgriculturalCommodityOliveOil3 .class, AgriculturalCommodityOther2 .class, AgriculturalCommodityPotato2 .class, AgriculturalCommoditySeafood2 .class, AgriculturalCommoditySoft2 .class, AllocationIndicator1Code.class, AmountAndDirection106 .class, AmountAndDirection109 .class, AssetClassCommodity6Choice.class, AssetClassCommodityAgricultural6Choice.class, AssetClassCommodityC10Other1 .class, AssetClassCommodityEnergy3Choice.class, AssetClassCommodityEnvironmental3Choice.class, AssetClassCommodityFertilizer4Choice.class, AssetClassCommodityFreight4Choice.class, AssetClassCommodityIndex1 .class, AssetClassCommodityIndustrialProduct2Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal2Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityPaper4Choice.class, AssetClassCommodityPolypropylene4Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType29Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType30Code.class, AssetClassDetailedSubProductType31Code.class, AssetClassDetailedSubProductType32Code.class, AssetClassDetailedSubProductType33Code.class, AssetClassDetailedSubProductType34Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType16Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType49Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, BasketConstituents3 .class, Cleared23Choice.class, ClearingAccountType4Code.class, ClearingExceptionOrExemption2 .class, ClearingExceptionOrExemption3Choice.class, ClearingExemptionException1Code.class, ClearingObligationType1Code.class, ClearingPartyAndTime21Choice.class, ClearingPartyAndTime22 .class, ClearingPartyAndTime22Choice.class, ClearingPartyAndTime23 .class, CollateralPortfolioCode5Choice.class, CommonTradeDataReport70 .class, ContractModification9 .class, ContractType14 .class, ContractValuationData8 .class, Counterparty45 .class, Counterparty46 .class, CounterpartySpecificData36 .class, CounterpartyTradeNature15Choice.class, CreditDerivative4 .class, CurrencyExchange22 .class, CurrencyExchange23 .class, CustomBasket4 .class, DateAndDateTime2Choice.class, DatePeriod1 .class, DebtInstrumentSeniorityType2Code.class, DeliveryInterconnectionPoint1Choice.class, DerivativeEvent6 .class, DerivativeEventType3Code.class, DerivativePartyIdentification1Choice.class, DerivativesTradeStateReportV01 .class, Direction2 .class, Direction4Choice.class, DisseminationData1 .class, DurationType1Code.class, EmbeddedType1Code.class, EnergyCommodityCoal2 .class, EnergyCommodityDistillates2 .class, EnergyCommodityElectricity2 .class, EnergyCommodityInterEnergy2 .class, EnergyCommodityLightEnd2 .class, EnergyCommodityNaturalGas3 .class, EnergyCommodityOil3 .class, EnergyCommodityOther2 .class, EnergyCommodityRenewableEnergy2 .class, EnergyDeliveryAttribute10 .class, EnergyLoadType1Code.class, EnergyQuantityUnit2Choice.class, EnergyQuantityUnit2Code.class, EnergySpecificAttribute9 .class, EnvironmentCommodityOther2 .class, EnvironmentalCommodityCarbonRelated2 .class, EnvironmentalCommodityEmission3 .class, EnvironmentalCommodityWeather2 .class, EventIdentifier1Choice.class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, ExerciseDate1Choice.class, FertilizerCommodityAmmonia2 .class, FertilizerCommodityDiammoniumPhosphate2 .class, FertilizerCommodityOther2 .class, FertilizerCommodityPotash2 .class, FertilizerCommoditySulphur2 .class, FertilizerCommodityUrea2 .class, FertilizerCommodityUreaAndAmmoniumNitrate2 .class, FinancialInstitutionSector1 .class, FinancialInstrumentContractType2Code.class, FinancialInstrumentQuantity32Choice.class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, FixedRate10 .class, FloatingRate13 .class, FloatingRateIdentification8Choice.class, FreightCommodityContainerShip2 .class, FreightCommodityDry3 .class, FreightCommodityOther2 .class, FreightCommodityWet3 .class, Frequency13Code.class, Frequency19Code.class, GenericIdentification175 .class, GenericIdentification179 .class, GenericIdentification184 .class, GenericIdentification185 .class, IndexIdentification1 .class, IndustrialProductCommodityConstruction2 .class, IndustrialProductCommodityManufacturing2 .class, InstrumentIdentification6Choice.class, InterestComputationMethod4Code.class, InterestComputationMethodFormat7 .class, InterestRate33Choice.class, InterestRateContractTerm4 .class, InterestRateFrequency3Choice.class, InterestRateLegs14 .class, LegalPersonIdentification1 .class, MarginPortfolio3 .class, MasterAgreement8 .class, MetalCommodityNonPrecious2 .class, MetalCommodityPrecious2 .class, ModificationLevel1Code.class, MxAuth10700101 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonClearingReason2 .class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, NotionalAmount5 .class, NotionalAmount6 .class, NotionalAmountLegs5 .class, NotionalQuantity9 .class, NotionalQuantityLegs5 .class, OptionOrSwaption10 .class, OptionParty1Code.class, OptionParty3Code.class, OptionStyle6Code.class, OptionType2Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, OtherPayment5 .class, PTRREvent2 .class, Package4 .class, Pagination1 .class, PaperCommodityContainerBoard2 .class, PaperCommodityNewsprint2 .class, PaperCommodityOther1 .class, PaperCommodityPulp2 .class, PartyIdentification236Choice.class, PartyIdentification248Choice.class, PaymentType4Code.class, PaymentType5Choice.class, PhysicalTransferType4Code.class, PolypropyleneCommodityOther2 .class, PolypropyleneCommodityPlastic2 .class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostTradeRiskReductionIdentifier1 .class, PriceData2 .class, PriceStatus1Code.class, PriceStatus2Code.class, ProductType4Code.class, Quantity47Choice.class, QuantityOrTerm1Choice.class, QuantityTerm1 .class, Reconciliation3Code.class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, ResetDateAndValue1 .class, RiskReductionService1Code.class, Schedule1 .class, Schedule10 .class, Schedule11 .class, Schedule4 .class, SecuritiesTransactionPrice14Choice.class, SecuritiesTransactionPrice17Choice.class, SecuritiesTransactionPrice20Choice.class, SecuritiesTransactionPrice5 .class, SecurityIdentification41Choice.class, SecurityIdentification46 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes5 .class, TimePeriodDetails1 .class, TradeClearing11 .class, TradeConfirmation1Choice.class, TradeConfirmation2 .class, TradeConfirmationType1Code.class, TradeConfirmationType2Code.class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradeData58Choice.class, TradeNonConfirmation1 .class, TradeReportHeader4 .class, TradeStateReport22 .class, TradeTransaction49 .class, TradingCapacity7Code.class, Tranche3 .class, TrancheIndicator3Choice.class, TransactionOperationType10Code.class, UnderlyingIdentification1Code.class, UniqueProductIdentifier1Choice.class, UniqueProductIdentifier2Choice.class, UniqueTransactionIdentifier1Choice.class, UniqueTransactionIdentifier2Choice.class, UniqueTransactionIdentifier3Choice.class, UnitOfMeasure8Choice.class, ValuationType1Code.class, WeekDay3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.107.001.01";

    public MxAuth10700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10700101(final String xml) {
        this();
        MxAuth10700101 tmp = parse(xml);
        derivsTradStatRpt = tmp.getDerivsTradStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeStateReportV01 }
     *     
     */
    public DerivativesTradeStateReportV01 getDerivsTradStatRpt() {
        return derivsTradStatRpt;
    }

    /**
     * Sets the value of the derivsTradStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeStateReportV01 }
     *     
     */
    public MxAuth10700101 setDerivsTradStatRpt(DerivativesTradeStateReportV01 value) {
        this.derivsTradStatRpt = value;
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
    public static MxAuth10700101 parse(String xml) {
        return ((MxAuth10700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10700101) parserImpl.read(MxAuth10700101 .class, xml, _classes));
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
     * Creates an MxAuth10700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10700101 message
     * @return
     *     a new instance of MxAuth10700101
     */
    public final static MxAuth10700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10700101 .class);
    }

}
