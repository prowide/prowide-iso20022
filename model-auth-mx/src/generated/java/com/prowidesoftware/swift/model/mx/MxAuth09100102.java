
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
 * Class for auth.091.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRcncltnSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.091.001.02")
public class MxAuth09100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRcncltnSttstclRpt", required = true)
    protected DerivativesTradeReconciliationStatisticalReportV02 derivsTradRcncltnSttstclRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 91;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd19DecimalAmount.class, AgreementType2Choice.class, AgriculturalCommodityDairy2 .class, AgriculturalCommodityForestry2 .class, AgriculturalCommodityGrain3 .class, AgriculturalCommodityLiveStock2 .class, AgriculturalCommodityOilSeed2 .class, AgriculturalCommodityOliveOil3 .class, AgriculturalCommodityOther2 .class, AgriculturalCommodityPotato2 .class, AgriculturalCommoditySeafood2 .class, AgriculturalCommoditySoft2 .class, AmountAndDirection106 .class, AssetClassCommodity6Choice.class, AssetClassCommodityAgricultural6Choice.class, AssetClassCommodityC10Other1 .class, AssetClassCommodityEnergy3Choice.class, AssetClassCommodityEnvironmental3Choice.class, AssetClassCommodityFertilizer4Choice.class, AssetClassCommodityFreight4Choice.class, AssetClassCommodityIndex1 .class, AssetClassCommodityIndustrialProduct2Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal2Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityPaper4Choice.class, AssetClassCommodityPolypropylene4Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType29Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType30Code.class, AssetClassDetailedSubProductType31Code.class, AssetClassDetailedSubProductType32Code.class, AssetClassDetailedSubProductType33Code.class, AssetClassDetailedSubProductType34Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType16Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType49Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, BasketConstituents3 .class, Cleared23Choice.class, ClearingAccountType4Code.class, ClearingExceptionOrExemption2 .class, ClearingExceptionOrExemption3Choice.class, ClearingExemptionException1Code.class, ClearingObligationType1Code.class, ClearingPartyAndTime21Choice.class, ClearingPartyAndTime22 .class, ClearingPartyAndTime22Choice.class, ClearingPartyAndTime23 .class, CollateralPortfolioCode5Choice.class, CompareActiveOrHistoricCurrencyAndAmount4 .class, CompareActiveOrHistoricCurrencyCode1 .class, CompareAmountAndDirection3 .class, CompareAssetClass1 .class, CompareBenchmarkCode1 .class, CompareCFIIdentifier3 .class, CompareCommodityAssetClass4 .class, CompareDate3 .class, CompareDatePeriod2 .class, CompareDateTime3 .class, CompareDayCount1 .class, CompareDeliveryInterconnectionPoint1 .class, CompareDeliveryType1 .class, CompareDerivativeEvent1 .class, CompareDurationType1 .class, CompareEnergyDeliveryAttribute1 .class, CompareEnergyLoadType1 .class, CompareEnergyQuantityUnit1 .class, CompareExchangeRate1 .class, CompareExchangeRateBasis1 .class, CompareFinancialInstrumentContractType1 .class, CompareFrequencyUnit1 .class, CompareISINIdentifier2 .class, CompareISINIdentifier4 .class, CompareLegDirection2 .class, CompareLongFraction19DecimalNumber1 .class, CompareMICIdentifier3 .class, CompareMasterAgreementType1 .class, CompareMax350Text1 .class, CompareMax50Text1 .class, CompareNotionalAmount1 .class, CompareNumber5 .class, CompareNumber7 .class, CompareOptionStyle1 .class, CompareOptionType1 .class, CompareOrganisationIdentification6 .class, CompareOrganisationIdentification7 .class, CompareOtherPayment1 .class, CompareOtherPaymentType1 .class, ComparePercentageRate3 .class, ComparePostTradeRiskReduction2 .class, CompareReferenceParty1 .class, CompareReportingLevelType2 .class, CompareSeniorityType1 .class, CompareText1 .class, CompareText2 .class, CompareTimePeriod2 .class, CompareTradeClearingObligation1 .class, CompareTradeClearingStatus3 .class, CompareTradeConfirmation2 .class, CompareTrancheIndicator1 .class, CompareTrueFalseIndicator3 .class, CompareUnderlyingInstrument3 .class, CompareUniqueProductIdentifier2 .class, CompareUniqueTransactionIdentifier2 .class, CompareUnitPrice4 .class, CompareUnitPrice5 .class, CompareUnitPrice7 .class, CompareUnitPrice8 .class, CompareValuationType1 .class, CompareWeekDay1 .class, ContractMatchingCriteria3 .class, CounterpartyData91 .class, CounterpartyMatchingCriteria6 .class, CustomBasket4 .class, DateAndDateTime2Choice.class, DatePeriod4 .class, DebtInstrumentSeniorityType2Code.class, DeliveryInterconnectionPoint1Choice.class, DerivativeEvent6 .class, DerivativeEventType3Code.class, DerivativePartyIdentification1Choice.class, DerivativesTradeReconciliationStatisticalReportV02 .class, Direction2 .class, Direction4Choice.class, DurationType1Code.class, EnergyCommodityCoal2 .class, EnergyCommodityDistillates2 .class, EnergyCommodityElectricity2 .class, EnergyCommodityInterEnergy2 .class, EnergyCommodityLightEnd2 .class, EnergyCommodityNaturalGas3 .class, EnergyCommodityOil3 .class, EnergyCommodityOther2 .class, EnergyCommodityRenewableEnergy2 .class, EnergyLoadType1Code.class, EnergyQuantityUnit2Choice.class, EnergyQuantityUnit2Code.class, EnvironmentCommodityOther2 .class, EnvironmentalCommodityCarbonRelated2 .class, EnvironmentalCommodityEmission3 .class, EnvironmentalCommodityWeather2 .class, EventIdentifier1Choice.class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, FertilizerCommodityAmmonia2 .class, FertilizerCommodityDiammoniumPhosphate2 .class, FertilizerCommodityOther2 .class, FertilizerCommodityPotash2 .class, FertilizerCommoditySulphur2 .class, FertilizerCommodityUrea2 .class, FertilizerCommodityUreaAndAmmoniumNitrate2 .class, FinancialInstrumentContractType2Code.class, FreightCommodityContainerShip2 .class, FreightCommodityDry3 .class, FreightCommodityOther2 .class, FreightCommodityWet3 .class, Frequency13Code.class, GenericIdentification175 .class, GenericIdentification179 .class, GenericIdentification184 .class, GenericIdentification185 .class, IndexIdentification1 .class, IndustrialProductCommodityConstruction2 .class, IndustrialProductCommodityManufacturing2 .class, InstrumentIdentification6Choice.class, InterestComputationMethod4Code.class, InterestComputationMethodFormat7 .class, LegalPersonIdentification1 .class, MarginPortfolio3 .class, MasterAgreement8 .class, MatchingCriteria16 .class, MetalCommodityNonPrecious2 .class, MetalCommodityPrecious2 .class, ModificationLevel1Code.class, MxAuth09100102 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonClearingReason2 .class, NotApplicable1Code.class, NotionalAmount6 .class, OptionParty1Code.class, OptionParty3Code.class, OptionStyle6Code.class, OptionType2Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PTRREvent3 .class, PairingStatus1Code.class, PaperCommodityContainerBoard2 .class, PaperCommodityNewsprint2 .class, PaperCommodityOther1 .class, PaperCommodityPulp2 .class, PartyIdentification236Choice.class, PartyIdentification248Choice.class, PaymentType4Code.class, PaymentType5Choice.class, PhysicalTransferType4Code.class, PolypropyleneCommodityOther2 .class, PolypropyleneCommodityPlastic2 .class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostTradeRiskReductionIdentifier1 .class, PriceStatus1Code.class, ProductType4Code.class, ReconciliationCategory2 .class, ReconciliationCategory3 .class, ReconciliationCounterpartyPairStatistics6 .class, ReconciliationReport14 .class, ReconciliationStatisticsPerCounterparty3 .class, ReconciliationStatus1Code.class, ReconciliationStatus2Code.class, ReportPeriodActivity1Code.class, ReportingRequirement2Choice.class, RiskReductionService1Code.class, Schedule11 .class, SecuritiesTransactionPrice13Choice.class, SecuritiesTransactionPrice14Choice.class, SecuritiesTransactionPrice17Choice.class, SecuritiesTransactionPrice5 .class, SecurityIdentification41Choice.class, StatisticsPerCounterparty15Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimePeriod3 .class, TradeConfirmation3Choice.class, TradeConfirmation4 .class, TradeConfirmationType1Code.class, TradeConfirmationType2Code.class, TradeNonConfirmation1 .class, TradeRepositoryReportingType1Code.class, TradeTransactionIdentification24 .class, Tranche3 .class, TrancheIndicator3Choice.class, TransactionMatchingCriteria6 .class, TransactionOperationType10Code.class, UnderlyingIdentification1Code.class, UniqueProductIdentifier1Choice.class, UniqueProductIdentifier2Choice.class, UniqueTransactionIdentifier1Choice.class, UniqueTransactionIdentifier2Choice.class, UnitOfMeasure8Choice.class, ValuationMatchingCriteria1 .class, ValuationType1Code.class, WeekDay3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.091.001.02";

    public MxAuth09100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09100102(final String xml) {
        this();
        MxAuth09100102 tmp = parse(xml);
        derivsTradRcncltnSttstclRpt = tmp.getDerivsTradRcncltnSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRcncltnSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReconciliationStatisticalReportV02 }
     *     
     */
    public DerivativesTradeReconciliationStatisticalReportV02 getDerivsTradRcncltnSttstclRpt() {
        return derivsTradRcncltnSttstclRpt;
    }

    /**
     * Sets the value of the derivsTradRcncltnSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReconciliationStatisticalReportV02 }
     *     
     */
    public MxAuth09100102 setDerivsTradRcncltnSttstclRpt(DerivativesTradeReconciliationStatisticalReportV02 value) {
        this.derivsTradRcncltnSttstclRpt = value;
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
    public static MxAuth09100102 parse(String xml) {
        return ((MxAuth09100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09100102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09100102) parserImpl.read(MxAuth09100102 .class, xml, _classes));
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
     * Creates an MxAuth09100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09100102 message
     * @return
     *     a new instance of MxAuth09100102
     */
    public static final MxAuth09100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09100102 .class);
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
