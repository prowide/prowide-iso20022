
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
 * Class for auth.033.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgNonEqtyTrnsprncyDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.033.001.02")
public class MxAuth03300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgNonEqtyTrnsprncyDataRpt", required = true)
    protected FinancialInstrumentReportingNonEquityTransparencyDataReportV02 finInstrmRptgNonEqtyTrnsprncyDataRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 33;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AssetClassSubProductType19Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName5Choice.class, BondDerivative2 .class, BondType1Code.class, CommodityDerivative2Choice.class, CommodityDerivative4 .class, CommodityDerivative5 .class, CommodityDerivative6 .class, ContractForDifference2 .class, CreditDefaultSwapDerivative5 .class, CreditDefaultSwapDerivative6 .class, CreditDefaultSwapIndex3 .class, CreditDefaultSwapSingleName2 .class, CreditDefaultSwapsDerivative4Choice.class, DebtInstrument5 .class, Derivative3Choice.class, DerivativePartyIdentification1Choice.class, EmissionAllowanceProductType1Code.class, EmissionAllowanceProductType2Code.class, EquityDerivative2 .class, EquityDerivative3Choice.class, EquityReturnParameter1Code.class, FinancialInstrumentContractType1Code.class, FinancialInstrumentReportingNonEquityTransparencyDataReportV02 .class, FloatingInterestRate8 .class, ForeignExchangeDerivative2 .class, InflationIndex1Choice.class, InterestRateContractTerm2 .class, InterestRateDerivative2Choice.class, InterestRateDerivative5 .class, MxAuth03300102 .class, NonEquityInstrumentReportingClassification1Code.class, Period2 .class, Period4Choice.class, ProductType5Code.class, RateBasis1Code.class, SecuritiesMarketReportHeader1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwapType1Code.class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport16 .class, UnderlyingContractForDifferenceType3Code.class, UnderlyingEquityType3Code.class, UnderlyingEquityType4Code.class, UnderlyingEquityType5Code.class, UnderlyingEquityType6Code.class, UnderlyingInterestRateType3Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.033.001.02";

    public MxAuth03300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03300102(final String xml) {
        this();
        MxAuth03300102 tmp = parse(xml);
        finInstrmRptgNonEqtyTrnsprncyDataRpt = tmp.getFinInstrmRptgNonEqtyTrnsprncyDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgNonEqtyTrnsprncyDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingNonEquityTransparencyDataReportV02 }
     *     
     */
    public FinancialInstrumentReportingNonEquityTransparencyDataReportV02 getFinInstrmRptgNonEqtyTrnsprncyDataRpt() {
        return finInstrmRptgNonEqtyTrnsprncyDataRpt;
    }

    /**
     * Sets the value of the finInstrmRptgNonEqtyTrnsprncyDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingNonEquityTransparencyDataReportV02 }
     *     
     */
    public MxAuth03300102 setFinInstrmRptgNonEqtyTrnsprncyDataRpt(FinancialInstrumentReportingNonEquityTransparencyDataReportV02 value) {
        this.finInstrmRptgNonEqtyTrnsprncyDataRpt = value;
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
    public static MxAuth03300102 parse(String xml) {
        return ((MxAuth03300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03300102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03300102) parserImpl.read(MxAuth03300102 .class, xml, _classes));
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
     * Creates an MxAuth03300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03300102 message
     * @return
     *     a new instance of MxAuth03300102
     */
    public static final MxAuth03300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03300102 .class);
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
