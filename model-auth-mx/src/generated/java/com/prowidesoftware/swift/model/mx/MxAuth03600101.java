
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
 * Class for auth.036.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgRefDataDltaRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.036.001.01")
public class MxAuth03600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgRefDataDltaRpt", required = true)
    protected FinancialInstrumentReportingReferenceDataDeltaReportV01 finInstrmRptgRefDataDltaRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AgriculturalCommodityDairy1 .class, AgriculturalCommodityForestry1 .class, AgriculturalCommodityGrain1 .class, AgriculturalCommodityLiveStock1 .class, AgriculturalCommodityOilSeed1 .class, AgriculturalCommodityOliveOil1 .class, AgriculturalCommodityPotato1 .class, AgriculturalCommoditySeafood1 .class, AgriculturalCommoditySoft1 .class, AmountAndDirection61 .class, AssetClass2 .class, AssetClassCommodity3Choice.class, AssetClassCommodityAgricultural1Choice.class, AssetClassCommodityEnergy1Choice.class, AssetClassCommodityEnvironmental1Choice.class, AssetClassCommodityFertilizer1Choice.class, AssetClassCommodityFreight1Choice.class, AssetClassCommodityIndustrialProduct1Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal1Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityOtherC102Choice.class, AssetClassCommodityPaper1Choice.class, AssetClassCommodityPolypropylene1Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType12Code.class, AssetClassDetailedSubProductType14Code.class, AssetClassDetailedSubProductType15Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType4Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType6Code.class, AssetClassDetailedSubProductType7Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType38Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType47Code.class, AssetClassSubProductType48Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, AssetClassTransactionType1Code.class, AssetFXSubProductType1Code.class, AssetPriceType1Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName5Choice.class, BenchmarkCurveName6Choice.class, DebtInstrument2 .class, DebtInstrumentSeniorityType1Code.class, DerivativeCommodity2 .class, DerivativeForeignExchange3 .class, DerivativeInstrument5 .class, DerivativeInterest3 .class, EnergyCommodityCoal1 .class, EnergyCommodityDistillates1 .class, EnergyCommodityElectricity1 .class, EnergyCommodityInterEnergy1 .class, EnergyCommodityLightEnd1 .class, EnergyCommodityNaturalGas1 .class, EnergyCommodityOil1 .class, EnergyCommodityRenewableEnergy1 .class, EnvironmentalCommodityCarbonRelated1 .class, EnvironmentalCommodityEmission1 .class, EnvironmentalCommodityWeather1 .class, FertilizerCommodityAmmonia1 .class, FertilizerCommodityDiammoniumPhosphate1 .class, FertilizerCommodityPotash1 .class, FertilizerCommoditySulphur1 .class, FertilizerCommodityUrea1 .class, FertilizerCommodityUreaAndAmmoniumNitrate1 .class, FinancialInstrument48Choice.class, FinancialInstrument53 .class, FinancialInstrument58 .class, FinancialInstrumentIdentification5Choice.class, FinancialInstrumentReportingReferenceDataDeltaReportV01 .class, FloatingInterestRate6 .class, FloatingInterestRate8 .class, FreightCommodityContainerShip1 .class, FreightCommodityDry1 .class, FreightCommodityWet1 .class, IndustrialProductCommodityConstruction1 .class, IndustrialProductCommodityManufacturing1 .class, InterestRate6Choice.class, InterestRate8Choice.class, InterestRateContractTerm2 .class, MetalCommodityNonPrecious1 .class, MetalCommodityPrecious1 .class, MxAuth03600101 .class, OptionStyle7Code.class, OptionType2Code.class, OtherC10CommodityDeliverable2 .class, OtherC10CommodityNonDeliverable2 .class, PaperCommodityContainerBoard1 .class, PaperCommodityNewsprint1 .class, PaperCommodityPulp1 .class, PaperCommodityRecoveredPaper1 .class, Period2 .class, Period4Choice.class, PhysicalTransferType4Code.class, PolypropyleneCommodityPlastic1 .class, PriceStatus1Code.class, RateBasis1Code.class, RecordTechnicalData3 .class, SecuritiesMarketReportHeader1 .class, SecuritiesReferenceDataReport5 .class, SecuritiesReferenceDeltaStatusReport2Choice.class, SecuritiesTransactionPrice1 .class, SecuritiesTransactionPrice2Choice.class, SecuritiesTransactionPrice4Choice.class, SecurityInstrumentDescription9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueAttributes1 .class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.036.001.01";

    public MxAuth03600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03600101(final String xml) {
        this();
        MxAuth03600101 tmp = parse(xml);
        finInstrmRptgRefDataDltaRpt = tmp.getFinInstrmRptgRefDataDltaRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgRefDataDltaRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingReferenceDataDeltaReportV01 }
     *     
     */
    public FinancialInstrumentReportingReferenceDataDeltaReportV01 getFinInstrmRptgRefDataDltaRpt() {
        return finInstrmRptgRefDataDltaRpt;
    }

    /**
     * Sets the value of the finInstrmRptgRefDataDltaRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingReferenceDataDeltaReportV01 }
     *     
     */
    public MxAuth03600101 setFinInstrmRptgRefDataDltaRpt(FinancialInstrumentReportingReferenceDataDeltaReportV01 value) {
        this.finInstrmRptgRefDataDltaRpt = value;
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
    public static MxAuth03600101 parse(String xml) {
        return ((MxAuth03600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03600101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03600101) parserImpl.read(MxAuth03600101 .class, xml, _classes));
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
     * Creates an MxAuth03600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03600101 message
     * @return
     *     a new instance of MxAuth03600101
     */
    public static final MxAuth03600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03600101 .class);
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
