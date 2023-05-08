
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
 * Class for auth.093.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktFndRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.093.001.01")
public class MxAuth09300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktFndRpt", required = true)
    protected MoneyMarketFundReportV01 mnyMktFndRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 93;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActionPlan1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AmortisedCostMethodPriceDeviationEvent1 .class, ArrangementType1Code.class, ArrangementType2Code.class, ArrangementType3Code.class, AssessmentResultType1Code.class, AssetIdentification2 .class, AssetValuation1 .class, BreakdownByArrangement1 .class, BreakdownByCountry3 .class, ConstantNetAssetValueDeviationEvent1 .class, CurrencyExchange14 .class, DerivativeInstrument7 .class, EventFrequency9Code.class, FinancialAssetType2Code.class, FinancialInstrument60Choice.class, FinancialInstrument74 .class, FinancialInstrument77 .class, FinancialInstrumentAttributes99 .class, FinancialInstrumentContractType3Code.class, FinancialInstrumentQuantity1Choice.class, Financialinstrument78 .class, FinancingUnderlyingType1Code.class, ForeignExchangeTerms36 .class, FundLiquidity1 .class, FundReportCancellation1 .class, FundReportData1Choice.class, FundReportUpdate1 .class, FundValuation1 .class, GenericIdentification13 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification1 .class, HalfYear2 .class, HoldingAsset2 .class, InstrumentIdentification3Choice.class, InstrumentIdentification4Choice.class, InvestorConcentration1 .class, InvestorGroupBreakdownType1 .class, LegalFramework2Code.class, LegalFramework5Choice.class, Liability1 .class, LiabilityDetails2 .class, LowVolatilityNetAssetValueReportData1 .class, MarketSpecificAttribute1 .class, MasterFundType1Code.class, MaturingAssetThresholdEvent1 .class, Measure1Choice.class, MoneyMarketFundReportHeader2 .class, MoneyMarketFundReportV01 .class, MoneyMarketFundType1Choice.class, MoneyMarketFundType1Code.class, Month2Choice.class, MonthType2 .class, MonthlyValue2Choice.class, MxAuth09300101 .class, NameAndAddress5 .class, NetAssetValueBasis1Code.class, NineMonths2 .class, NoVulnerability1Code.class, NotAvailable1Code.class, OrganisationIdentificationSchemeName1Choice.class, OutflowImpact1 .class, Party45Choice.class, Party6 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyIdentification194 .class, PartyIdentification195 .class, PartySectorType1Code.class, PerformanceFactors2 .class, PerformanceValueType1Choice.class, Period2 .class, Period4Choice.class, PostalAddress1 .class, QuantitativeData2 .class, Quarter2 .class, QuarterPeriod1 .class, RangeBreakdown1 .class, RangeType1Code.class, RegisteredDistributionCountry1Choice.class, RelatedEvent2 .class, ReportData2Choice.class, ReportItemJustification1 .class, ReportPeriodActivity3Code.class, ReportingPeriodType1Code.class, SecurityIdentification31Choice.class, SecurityIdentification33 .class, ShareClassList1 .class, StressTestImpact1Choice.class, StressTestReport1 .class, StressTestResult2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnderlyingDerivativeType1Code.class, ValuationType2Code.class, Year2 .class, Yield1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.093.001.01";

    public MxAuth09300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09300101(final String xml) {
        this();
        MxAuth09300101 tmp = parse(xml);
        mnyMktFndRpt = tmp.getMnyMktFndRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktFndRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketFundReportV01 }
     *     
     */
    public MoneyMarketFundReportV01 getMnyMktFndRpt() {
        return mnyMktFndRpt;
    }

    /**
     * Sets the value of the mnyMktFndRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketFundReportV01 }
     *     
     */
    public MxAuth09300101 setMnyMktFndRpt(MoneyMarketFundReportV01 value) {
        this.mnyMktFndRpt = value;
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
    public static MxAuth09300101 parse(String xml) {
        return ((MxAuth09300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09300101) parserImpl.read(MxAuth09300101 .class, xml, _classes));
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
     * Creates an MxAuth09300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09300101 message
     * @return
     *     a new instance of MxAuth09300101
     */
    public static final MxAuth09300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09300101 .class);
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
