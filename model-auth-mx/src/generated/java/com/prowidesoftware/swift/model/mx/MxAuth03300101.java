
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
 * Class for auth.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgNonEqtyTrnsprncyDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.033.001.01")
public class MxAuth03300101
    extends AbstractMX
{

    @XmlElement(name = "FinInstrmRptgNonEqtyTrnsprncyDataRpt", required = true)
    protected FinancialInstrumentReportingNonEquityTransparencyDataReportV01 finInstrmRptgNonEqtyTrnsprncyDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AssetClassSubProductType19Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName5Choice.class, BondDerivative2 .class, BondType1Code.class, CommodityDerivate2Choice.class, CommodityDerivate4 .class, CommodityDerivate5 .class, CommodityDerivate6 .class, ContractForDifference2 .class, CreditDefaultSwapDerivative3 .class, CreditDefaultSwapDerivative4 .class, CreditDefaultSwapIndex2 .class, CreditDefaultSwapSingleName2 .class, CreditDefaultSwapsDerivative3Choice.class, DebtInstrument5 .class, Derivative2Choice.class, DerivativePartyIdentification1Choice.class, EmissionAllowanceProductType1Code.class, EmissionAllowanceProductType2Code.class, EquityDerivative2 .class, EquityDerivative3Choice.class, EquityReturnParameter1Code.class, FinancialInstrumentContractType1Code.class, FinancialInstrumentReportingNonEquityTransparencyDataReportV01 .class, FloatingInterestRate8 .class, ForeignExchangeDerivative2 .class, InflationIndex1Choice.class, InterestRateContractTerm2 .class, InterestRateDerivative2Choice.class, InterestRateDerivative5 .class, MxAuth03300101 .class, NonEquityInstrumentReportingClassification1Code.class, Period2 .class, Period4Choice.class, ProductType5Code.class, RateBasis1Code.class, SecuritiesMarketReportHeader1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwapType1Code.class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport10 .class, UnderlyingContractForDifferenceType3Code.class, UnderlyingEquityType3Code.class, UnderlyingEquityType4Code.class, UnderlyingEquityType5Code.class, UnderlyingEquityType6Code.class, UnderlyingInterestRateType3Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.033.001.01";

    public MxAuth03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03300101(final String xml) {
        this();
        MxAuth03300101 tmp = parse(xml);
        finInstrmRptgNonEqtyTrnsprncyDataRpt = tmp.getFinInstrmRptgNonEqtyTrnsprncyDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgNonEqtyTrnsprncyDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingNonEquityTransparencyDataReportV01 }
     *     
     */
    public FinancialInstrumentReportingNonEquityTransparencyDataReportV01 getFinInstrmRptgNonEqtyTrnsprncyDataRpt() {
        return finInstrmRptgNonEqtyTrnsprncyDataRpt;
    }

    /**
     * Sets the value of the finInstrmRptgNonEqtyTrnsprncyDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingNonEquityTransparencyDataReportV01 }
     *     
     */
    public MxAuth03300101 setFinInstrmRptgNonEqtyTrnsprncyDataRpt(FinancialInstrumentReportingNonEquityTransparencyDataReportV01 value) {
        this.finInstrmRptgNonEqtyTrnsprncyDataRpt = value;
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
    public static MxAuth03300101 parse(String xml) {
        return ((MxAuth03300101) MxReadImpl.parse(MxAuth03300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03300101) parserImpl.read(MxAuth03300101 .class, xml, _classes));
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
     * Creates an MxAuth03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03300101 message
     * @return
     *     a new instance of MxAuth03300101
     */
    public final static MxAuth03300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth03300101 .class);
    }

}
