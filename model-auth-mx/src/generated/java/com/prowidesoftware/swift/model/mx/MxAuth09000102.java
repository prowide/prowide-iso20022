
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
 * Class for auth.090.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradPosSetRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.090.001.02")
public class MxAuth09000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradPosSetRpt", required = true)
    protected DerivativesTradePositionSetReportV02 derivsTradPosSetRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 90;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd19DecimalAmount.class, ActiveOrHistoricCurrencyAnd20DecimalAmount.class, AgreementType2Choice.class, AgriculturalCommodityDairy2 .class, AgriculturalCommodityForestry2 .class, AgriculturalCommodityGrain3 .class, AgriculturalCommodityLiveStock2 .class, AgriculturalCommodityOilSeed2 .class, AgriculturalCommodityOliveOil3 .class, AgriculturalCommodityOther2 .class, AgriculturalCommodityPotato2 .class, AgriculturalCommoditySeafood2 .class, AgriculturalCommoditySoft2 .class, AssetClassCommodity6Choice.class, AssetClassCommodityAgricultural6Choice.class, AssetClassCommodityC10Other1 .class, AssetClassCommodityEnergy3Choice.class, AssetClassCommodityEnvironmental3Choice.class, AssetClassCommodityFertilizer4Choice.class, AssetClassCommodityFreight4Choice.class, AssetClassCommodityIndex1 .class, AssetClassCommodityIndustrialProduct2Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal2Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityPaper4Choice.class, AssetClassCommodityPolypropylene4Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType29Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType30Code.class, AssetClassDetailedSubProductType31Code.class, AssetClassDetailedSubProductType32Code.class, AssetClassDetailedSubProductType33Code.class, AssetClassDetailedSubProductType34Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType16Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType49Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, BasketConstituents3 .class, CollateralPortfolioCode5Choice.class, CollateralisationType3Code.class, Counterparty45 .class, Counterparty46 .class, CounterpartyTradeNature15Choice.class, CreditDerivative7 .class, CustomBasket4 .class, DebtInstrumentSeniorityType2Code.class, DerivativePartyIdentification1Choice.class, DerivativesTradePositionSetReportV02 .class, Direction2 .class, Direction4Choice.class, EnergyCommodityCoal2 .class, EnergyCommodityDistillates2 .class, EnergyCommodityElectricity2 .class, EnergyCommodityInterEnergy2 .class, EnergyCommodityLightEnd2 .class, EnergyCommodityNaturalGas3 .class, EnergyCommodityOil3 .class, EnergyCommodityOther2 .class, EnergyCommodityRenewableEnergy2 .class, EnvironmentCommodityOther2 .class, EnvironmentalCommodityCarbonRelated2 .class, EnvironmentalCommodityEmission3 .class, EnvironmentalCommodityWeather2 .class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, FertilizerCommodityAmmonia2 .class, FertilizerCommodityDiammoniumPhosphate2 .class, FertilizerCommodityOther2 .class, FertilizerCommodityPotash2 .class, FertilizerCommoditySulphur2 .class, FertilizerCommodityUrea2 .class, FertilizerCommodityUreaAndAmmoniumNitrate2 .class, FinancialInstitutionSector1 .class, FinancialInstrumentContractType2Code.class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, FreightCommodityContainerShip2 .class, FreightCommodityDry3 .class, FreightCommodityOther2 .class, FreightCommodityWet3 .class, Frequency13Code.class, GenericIdentification175 .class, GenericIdentification184 .class, GenericIdentification185 .class, IndexIdentification1 .class, IndustrialProductCommodityConstruction2 .class, IndustrialProductCommodityManufacturing2 .class, InstrumentIdentification6Choice.class, LegalPersonIdentification1 .class, MarginCollateralReport4 .class, MarginPortfolio3 .class, MasterAgreement8 .class, MaturityTerm2 .class, MetalCommodityNonPrecious2 .class, MetalCommodityPrecious2 .class, MxAuth09000102 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, NotionalAmount7 .class, NotionalAmountLegs6 .class, OptionParty1Code.class, OptionParty3Code.class, OptionType2Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, OtherPayment6 .class, PaperCommodityContainerBoard2 .class, PaperCommodityNewsprint2 .class, PaperCommodityOther1 .class, PaperCommodityPulp2 .class, PartyIdentification236Choice.class, PartyIdentification248Choice.class, PaymentType4Code.class, PaymentType5Choice.class, PolypropyleneCommodityOther2 .class, PolypropyleneCommodityPlastic2 .class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PositionSet21 .class, PositionSet22 .class, PositionSetAggregated2Choice.class, PositionSetAggregated4 .class, PositionSetBuyerAndSeller2 .class, PositionSetCollateralDimensions3 .class, PositionSetCollateralMetrics2 .class, PositionSetCollateralTotal2 .class, PositionSetDimensions16 .class, PositionSetMetrics14 .class, PositionSetTotal2 .class, PostedMarginOrCollateral6 .class, ProductType4Code.class, RateBasis1Code.class, ReceivedMarginOrCollateral6 .class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, SecurityIdentification41Choice.class, SpecialPurpose2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimeToMaturity1Choice.class, TimeToMaturityPeriod1 .class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradingCapacity7Code.class, UnderlyingIdentification1Code.class, UniqueProductIdentifier1Choice.class, UniqueProductIdentifier2Choice.class, UnitOfMeasure8Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.090.001.02";

    public MxAuth09000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09000102(final String xml) {
        this();
        MxAuth09000102 tmp = parse(xml);
        derivsTradPosSetRpt = tmp.getDerivsTradPosSetRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradPosSetRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradePositionSetReportV02 }
     *     
     */
    public DerivativesTradePositionSetReportV02 getDerivsTradPosSetRpt() {
        return derivsTradPosSetRpt;
    }

    /**
     * Sets the value of the derivsTradPosSetRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradePositionSetReportV02 }
     *     
     */
    public MxAuth09000102 setDerivsTradPosSetRpt(DerivativesTradePositionSetReportV02 value) {
        this.derivsTradPosSetRpt = value;
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
    public static MxAuth09000102 parse(String xml) {
        return ((MxAuth09000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09000102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09000102) parserImpl.read(MxAuth09000102 .class, xml, _classes));
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
     * Creates an MxAuth09000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09000102 message
     * @return
     *     a new instance of MxAuth09000102
     */
    public static final MxAuth09000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09000102 .class);
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
