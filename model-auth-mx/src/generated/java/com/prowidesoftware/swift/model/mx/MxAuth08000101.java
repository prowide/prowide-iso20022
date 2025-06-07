
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
 * Class for auth.080.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgRcncltnStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.080.001.01")
public class MxAuth08000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgRcncltnStsAdvc", required = true)
    protected SecuritiesFinancingReportingReconciliationStatusAdviceV01 sctiesFincgRptgRcncltnStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 80;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AgreementType1Choice.class, AgriculturalCommodityDairy1 .class, AgriculturalCommodityForestry1 .class, AgriculturalCommodityGrain2 .class, AgriculturalCommodityLiveStock1 .class, AgriculturalCommodityOilSeed1 .class, AgriculturalCommodityOliveOil2 .class, AgriculturalCommodityOther1 .class, AgriculturalCommodityPotato1 .class, AgriculturalCommoditySeafood1 .class, AgriculturalCommoditySoft1 .class, AmountAndDirection53 .class, AssetClassCommodity5Choice.class, AssetClassCommodityAgricultural5Choice.class, AssetClassCommodityEnergy2Choice.class, AssetClassCommodityEnvironmental2Choice.class, AssetClassCommodityFertilizer3Choice.class, AssetClassCommodityFreight3Choice.class, AssetClassCommodityIndustrialProduct1Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal1Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityOtherC102Choice.class, AssetClassCommodityPaper3Choice.class, AssetClassCommodityPolypropylene3Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType29Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType30Code.class, AssetClassDetailedSubProductType31Code.class, AssetClassDetailedSubProductType32Code.class, AssetClassDetailedSubProductType33Code.class, AssetClassDetailedSubProductType34Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType38Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType47Code.class, AssetClassSubProductType48Code.class, AssetClassSubProductType49Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, BenchmarkCurveName10Choice.class, BenchmarkCurveName3Code.class, CashCompare1 .class, Cleared4Choice.class, CollateralDeliveryMethod1Code.class, CollateralMatchingCriteria3 .class, CollateralQualityType1Code.class, CollateralRole1Code.class, Commodity21 .class, CompareActiveOrHistoricCurrencyAndAmount2 .class, CompareAgreementType1 .class, CompareAmountAndDirection1 .class, CompareBenchmarkCurveName2 .class, CompareCFIIdentifier2 .class, CompareClearingStatus2 .class, CompareCollateralQualityType2 .class, CompareCommodityAssetClass2 .class, CompareCounterpartySide1 .class, CompareCountryCode2 .class, CompareDate2 .class, CompareDateTime2 .class, CompareDecimalNumber2 .class, CompareDeliveryMethod2 .class, CompareExposureType2 .class, CompareISINIdentifier2 .class, CompareInterestComputationMethod2 .class, CompareMICIdentifier2 .class, CompareNumber2 .class, CompareNumber3 .class, CompareOrganisationIdentification1 .class, ComparePercentageRate2 .class, CompareRateBasis2 .class, CompareReportingLevelType2 .class, CompareSecuritiesLendingType2 .class, CompareSecurityIdentification2 .class, CompareSpecialCollateral2 .class, CompareTerminationOption2 .class, CompareText1 .class, CompareTrueFalseIndicator2 .class, CompareUnitOfMeasure2 .class, CompareUnitPrice3 .class, CounterpartyMatchingCriteria1 .class, EnergyCommodityCoal1 .class, EnergyCommodityDistillates1 .class, EnergyCommodityElectricity1 .class, EnergyCommodityInterEnergy1 .class, EnergyCommodityLightEnd1 .class, EnergyCommodityNaturalGas2 .class, EnergyCommodityOil2 .class, EnergyCommodityOther1 .class, EnergyCommodityRenewableEnergy1 .class, EnvironmentCommodityOther1 .class, EnvironmentalCommodityCarbonRelated1 .class, EnvironmentalCommodityEmission2 .class, EnvironmentalCommodityWeather1 .class, ExposureType6Code.class, FertilizerCommodityAmmonia1 .class, FertilizerCommodityDiammoniumPhosphate1 .class, FertilizerCommodityOther1 .class, FertilizerCommodityPotash1 .class, FertilizerCommoditySulphur1 .class, FertilizerCommodityUrea1 .class, FertilizerCommodityUreaAndAmmoniumNitrate1 .class, FreightCommodityContainerShip1 .class, FreightCommodityDry2 .class, FreightCommodityOther1 .class, FreightCommodityWet2 .class, IndustrialProductCommodityConstruction1 .class, IndustrialProductCommodityManufacturing1 .class, InterestComputationMethod1Code.class, InterestComputationMethodFormat6Choice.class, LoanMatchingCriteria6 .class, MasterAgreement6 .class, MatchingCriteria7 .class, MetalCommodityNonPrecious1 .class, MetalCommodityPrecious1 .class, ModificationLevel1Code.class, MxAuth08000101 .class, NoReasonCode.class, NotAvailable1Code.class, NumberOfReportsPerStatus2 .class, OrganisationIdentification9Choice.class, OtherC10CommodityDeliverable2 .class, OtherC10CommodityNonDeliverable2 .class, PairedReconciled1Code.class, PaperCommodityContainerBoard1 .class, PaperCommodityNewsprint1 .class, PaperCommodityPulp1 .class, PaperCommodityRecoveredPaper1 .class, PaperCommodityRecoveredPaper2 .class, PolypropyleneCommodityOther1 .class, PolypropyleneCommodityPlastic1 .class, RateBasis1Code.class, ReconciliationMatchedStatus6Choice.class, ReconciliationReport5 .class, ReconciliationResult7 .class, ReconciliationStatus5Choice.class, RepoTerminationOption2Code.class, ReportPeriodActivity1Code.class, SecuritiesFinancingReportingReconciliationStatusAdviceV01 .class, SecuritiesLendingType3Choice.class, SecuritiesTransactionPrice11Choice.class, Security17 .class, SecurityCommodity4 .class, SecurityCommodityCash1 .class, SecurityIdentification26Choice.class, SpecialCollateral1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData14Choice.class, TradeData21 .class, TradeTransactionIdentification4 .class, UnitOfMeasure11Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.080.001.01";

    public MxAuth08000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08000101(final String xml) {
        this();
        MxAuth08000101 tmp = parse(xml);
        sctiesFincgRptgRcncltnStsAdvc = tmp.getSctiesFincgRptgRcncltnStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgRcncltnStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingReconciliationStatusAdviceV01 }
     *     
     */
    public SecuritiesFinancingReportingReconciliationStatusAdviceV01 getSctiesFincgRptgRcncltnStsAdvc() {
        return sctiesFincgRptgRcncltnStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgRptgRcncltnStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingReconciliationStatusAdviceV01 }
     *     
     */
    public MxAuth08000101 setSctiesFincgRptgRcncltnStsAdvc(SecuritiesFinancingReportingReconciliationStatusAdviceV01 value) {
        this.sctiesFincgRptgRcncltnStsAdvc = value;
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
    public static MxAuth08000101 parse(String xml) {
        return ((MxAuth08000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth08000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth08000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth08000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08000101) parserImpl.read(MxAuth08000101 .class, xml, _classes));
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
     * Creates an MxAuth08000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08000101 message
     * @return
     *     a new instance of MxAuth08000101
     */
    public final static MxAuth08000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08000101 .class);
    }

}
