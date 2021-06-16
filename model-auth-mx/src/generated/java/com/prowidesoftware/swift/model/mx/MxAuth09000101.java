
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.090.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradPosSetRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.090.001.01")
public class MxAuth09000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradPosSetRpt", required = true)
    protected DerivativesTradePositionSetReportV01 derivsTradPosSetRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 90;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20Amount.class, BenchmarkCurveName2Code.class, CollateralisationType1Code.class, Counterparty26 .class, Counterparty29 .class, CounterpartyTradeNature5Choice.class, DebtInstrumentSeniorityType2Code.class, DerivativesTradePositionSetReportV01 .class, ExchangeRateBasis1 .class, ExchangeRateBasis1Choice.class, FinancialInstrumentContractType2Code.class, FinancialPartySectorType1Code.class, MasterAgreement2 .class, MaturityTerm2 .class, MxAuth09000101 .class, NoReasonCode.class, NonFinancialInstitutionSector2 .class, OptionParty1Code.class, OptionType2Code.class, OrganisationIdentification30 .class, OrganisationIdentification7Choice.class, OrganisationIdentification8Choice.class, OrganisationIdentification9Choice.class, PositionSet3 .class, PositionSet4 .class, PositionSetAggregated2 .class, PositionSetBuyerAndSeller1 .class, PositionSetCollateralDimensions2 .class, PositionSetCollateralMetrics1 .class, PositionSetCollateralTotal1 .class, PositionSetDimensions2 .class, PositionSetMetrics1 .class, PositionSetPostedAndReceived1 .class, PositionSetTotal1 .class, PositionSetValueAndNotional1 .class, ProductType4Code.class, RateBasis1Code.class, SecurityIdentification18Choice.class, SecurityIdentification28Choice.class, SecurityIdentification29Choice.class, SpecialPurpose2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TimeToMaturity1Choice.class, TimeToMaturityPeriod1 .class, TradeCounterpartyReport9 .class, TradingCapacity7Code.class, UnderlyingIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.090.001.01";

    public MxAuth09000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09000101(final String xml) {
        this();
        MxAuth09000101 tmp = parse(xml);
        derivsTradPosSetRpt = tmp.getDerivsTradPosSetRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradPosSetRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradePositionSetReportV01 }
     *     
     */
    public DerivativesTradePositionSetReportV01 getDerivsTradPosSetRpt() {
        return derivsTradPosSetRpt;
    }

    /**
     * Sets the value of the derivsTradPosSetRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradePositionSetReportV01 }
     *     
     */
    public MxAuth09000101 setDerivsTradPosSetRpt(DerivativesTradePositionSetReportV01 value) {
        this.derivsTradPosSetRpt = value;
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
    public static MxAuth09000101 parse(String xml) {
        return ((MxAuth09000101) MxReadImpl.parse(MxAuth09000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09000101) parserImpl.read(MxAuth09000101 .class, xml, _classes));
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
     * Creates an MxAuth09000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09000101 message
     * @return
     *     a new instance of MxAuth09000101
     */
    public final static MxAuth09000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09000101 .class);
    }

}
