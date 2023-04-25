
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
 * Class for auth.105.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgPosSetRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.105.001.01")
public class MxAuth10500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgPosSetRpt", required = true)
    protected SecuritiesFinancingReportingPositionSetReportV01 sctiesFincgRptgPosSetRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 105;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection107 .class, AmountAndDirection53 .class, CollateralData33 .class, CollateralQualityType1Code.class, CollateralRole1Code.class, CollateralType6Code.class, ContractTerm6Choice.class, CounterpartyData86 .class, CounterpartyIdentification10 .class, ExposureMetrics4 .class, ExposureMetrics5 .class, ExposureMetrics6 .class, ExposureType10Code.class, GenericIdentification175 .class, IssuerJurisdiction1Choice.class, LoanData134 .class, MaturityTerm2 .class, MxAuth10500101 .class, NamedPosition3 .class, NoReasonCode.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PositionSet16 .class, PositionSet17 .class, PositionSet18 .class, PositionSet19 .class, PositionSet20 .class, PositionSetDimensions12 .class, PositionSetDimensions14 .class, PositionSetDimensions15 .class, PositionSetMetrics10 .class, PositionSetMetrics11 .class, PositionSetMetrics12 .class, PositionSetMetrics13 .class, PositionSetMetrics7 .class, PositionSetReport3Choice.class, PostedMarginOrCollateral4 .class, PriceMetrics3 .class, PriceStatus1Code.class, PrincipalAmount3 .class, QuantityNominalValue2Choice.class, RateBasis1Code.class, Rates1Choice.class, Rates3 .class, ReconciliationFlag2 .class, ReinvestedCashTypeAndAmount2 .class, ReinvestmentType1Code.class, ReportPeriodActivity1Code.class, ReuseValue1Choice.class, SecuritiesFinancingReportingPositionSetReportV01 .class, SecuritiesLendingType3Choice.class, SecuritiesTransactionPrice18Choice.class, SecuritiesTransactionPrice19Choice.class, SecuritiesTransactionPrice5 .class, Security49 .class, SecurityIssuer4 .class, SpecialCollateral1Code.class, SpecialPurpose2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimeToMaturity2Choice.class, TimeToMaturityPeriod2 .class, TradeMarket2Code.class, TradeRepositoryReportingType1Code.class, TradingVenueType1Choice.class, VolumeMetrics4 .class, VolumeMetrics5 .class, VolumeMetrics6 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.105.001.01";

    public MxAuth10500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10500101(final String xml) {
        this();
        MxAuth10500101 tmp = parse(xml);
        sctiesFincgRptgPosSetRpt = tmp.getSctiesFincgRptgPosSetRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgPosSetRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingPositionSetReportV01 }
     *     
     */
    public SecuritiesFinancingReportingPositionSetReportV01 getSctiesFincgRptgPosSetRpt() {
        return sctiesFincgRptgPosSetRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgPosSetRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingPositionSetReportV01 }
     *     
     */
    public MxAuth10500101 setSctiesFincgRptgPosSetRpt(SecuritiesFinancingReportingPositionSetReportV01 value) {
        this.sctiesFincgRptgPosSetRpt = value;
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
    public static MxAuth10500101 parse(String xml) {
        return ((MxAuth10500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10500101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10500101) parserImpl.read(MxAuth10500101 .class, xml, _classes));
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
     * Creates an MxAuth10500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10500101 message
     * @return
     *     a new instance of MxAuth10500101
     */
    public static final MxAuth10500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10500101 .class);
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
