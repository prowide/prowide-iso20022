
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.079.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.079.001.01")
public class MxAuth07900101
    extends AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxStatRpt", required = true)
    protected SecuritiesFinancingReportingTransactionStateReportV01 sctiesFincgRptgTxStatRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 79;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AgreementType1Choice.class, AgriculturalCommodityDairy1 .class, AgriculturalCommodityForestry1 .class, AgriculturalCommodityGrain2 .class, AgriculturalCommodityLiveStock1 .class, AgriculturalCommodityOilSeed1 .class, AgriculturalCommodityOliveOil2 .class, AgriculturalCommodityOther1 .class, AgriculturalCommodityPotato1 .class, AgriculturalCommoditySeafood1 .class, AgriculturalCommoditySoft1 .class, AmountAndDirection61 .class, AssetClassCommodity5Choice.class, AssetClassCommodityAgricultural5Choice.class, AssetClassCommodityEnergy2Choice.class, AssetClassCommodityEnvironmental2Choice.class, AssetClassCommodityFertilizer3Choice.class, AssetClassCommodityFreight3Choice.class, AssetClassCommodityIndustrialProduct1Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal1Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityOtherC102Choice.class, AssetClassCommodityPaper3Choice.class, AssetClassCommodityPolypropylene3Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType29Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType30Code.class, AssetClassDetailedSubProductType31Code.class, AssetClassDetailedSubProductType32Code.class, AssetClassDetailedSubProductType33Code.class, AssetClassDetailedSubProductType34Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType38Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType47Code.class, AssetClassSubProductType48Code.class, AssetClassSubProductType49Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName8Choice.class, Branch2Choice.class, Cleared2Choice.class, Cleared8Choice.class, ClearingPartyAndTime7 .class, Collateral27 .class, CollateralDeliveryMethod1Code.class, CollateralFlag6Choice.class, CollateralQualityType1Code.class, CollateralRole1Code.class, CollateralType7Choice.class, CollaterisedData4 .class, Commodity3 .class, ContractModification1 .class, ContractTerm2Choice.class, CounterpartyData48 .class, CounterpartyData51 .class, CounterpartyIdentification1 .class, CounterpartyIdentification2 .class, CounterpartyTradeNature3Choice.class, EnergyCommodityCoal1 .class, EnergyCommodityDistillates1 .class, EnergyCommodityElectricity1 .class, EnergyCommodityInterEnergy1 .class, EnergyCommodityLightEnd1 .class, EnergyCommodityNaturalGas2 .class, EnergyCommodityOil2 .class, EnergyCommodityOther1 .class, EnergyCommodityRenewableEnergy1 .class, EnvironmentCommodityOther1 .class, EnvironmentalCommodityCarbonRelated1 .class, EnvironmentalCommodityEmission2 .class, EnvironmentalCommodityWeather1 .class, ExposureType6Code.class, FertilizerCommodityAmmonia1 .class, FertilizerCommodityDiammoniumPhosphate1 .class, FertilizerCommodityOther1 .class, FertilizerCommodityPotash1 .class, FertilizerCommoditySulphur1 .class, FertilizerCommodityUrea1 .class, FertilizerCommodityUreaAndAmmoniumNitrate1 .class, FinancialPartyClassification1Choice.class, FinancialPartySectorType2Code.class, FixedRate2 .class, FixedRate7 .class, FixedTermContract2 .class, FloatingInterestRate10 .class, FloatingInterestRate12 .class, FloatingInterestRate16 .class, FreightCommodityContainerShip1 .class, FreightCommodityDry2 .class, FreightCommodityOther1 .class, FreightCommodityWet2 .class, FundType2Code.class, HaircutPortfolioSecurityIdentification1 .class, IndustrialProductCommodityConstruction1 .class, IndustrialProductCommodityManufacturing1 .class, InterestComputationMethod1Code.class, InterestComputationMethodFormat6Choice.class, InterestRate14Choice.class, InterestRate15Choice.class, InterestRate7Choice.class, InterestRateContractTerm2 .class, LoanData1 .class, LoanData2 .class, LoanData32 .class, LoanData39 .class, LoanData42 .class, MasterAgreement1 .class, MetalCommodityNonPrecious1 .class, MetalCommodityPrecious1 .class, ModificationLevel1Code.class, MxAuth07900101 .class, NoReasonCode.class, NotAvailable1Code.class, OrganisationIdentification9Choice.class, OtherC10CommodityDeliverable2 .class, OtherC10CommodityNonDeliverable2 .class, PaperCommodityContainerBoard1 .class, PaperCommodityNewsprint1 .class, PaperCommodityPulp1 .class, PaperCommodityRecoveredPaper1 .class, PaperCommodityRecoveredPaper2 .class, PolypropyleneCommodityOther1 .class, PolypropyleneCommodityPlastic1 .class, PrincipalAmount1 .class, Quantity13 .class, QuantityNominalValue1Choice.class, RateAdjustment1 .class, RateBasis1Code.class, RebateRate1Choice.class, ReconciliationFlag1 .class, RepoTerminationOption2Code.class, SecuritiesFinancingReportingTransactionStateReportV01 .class, SecuritiesLendingType3Choice.class, SecuritiesTransactionPrice2Choice.class, Security3 .class, Security4 .class, SecurityCommodity2Choice.class, SecurityIdentification26Choice.class, SecurityIssuer1 .class, SettlementParties31Choice.class, SpecialCollateral1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeRepositoryReportingType1Code.class, TradeStateReport6 .class, TransactionCollateralData8Choice.class, TransactionCounterpartyData3Choice.class, TransactionCounterpartyData7 .class, TransactionLoanData5Choice.class, TransactionOperationType3Code.class, UnitOfMeasure1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.079.001.01";

    public MxAuth07900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07900101(final String xml) {
        this();
        MxAuth07900101 tmp = parse(xml);
        sctiesFincgRptgTxStatRpt = tmp.getSctiesFincgRptgTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionStateReportV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionStateReportV01 getSctiesFincgRptgTxStatRpt() {
        return sctiesFincgRptgTxStatRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionStateReportV01 }
     *     
     */
    public MxAuth07900101 setSctiesFincgRptgTxStatRpt(SecuritiesFinancingReportingTransactionStateReportV01 value) {
        this.sctiesFincgRptgTxStatRpt = value;
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
    public static MxAuth07900101 parse(String xml) {
        return ((MxAuth07900101) MxReadImpl.parse(MxAuth07900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07900101) parserImpl.read(MxAuth07900101 .class, xml, _classes));
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
     * Creates an MxAuth07900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07900101 message
     * @return
     *     a new instance of MxAuth07900101
     */
    public final static MxAuth07900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth07900101 .class);
    }

}
