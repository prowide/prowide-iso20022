
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
 * Class for auth.108.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradMrgnDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.108.001.01")
public class MxAuth10800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradMrgnDataRpt", required = true)
    protected DerivativesTradeMarginDataReportV01 derivsTradMrgnDataRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 108;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20DecimalAmount.class, CollateralPortfolioCode5Choice.class, CollateralisationType3Code.class, Counterparty45 .class, Counterparty46 .class, CounterpartyTradeNature15Choice.class, DerivativesTradeMarginDataReportV01 .class, Direction2 .class, Direction4Choice.class, FinancialInstitutionSector1 .class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, GenericIdentification175 .class, LegalPersonIdentification1 .class, MarginCollateralReport4 .class, MarginPortfolio3 .class, MarginReportData7 .class, MxAuth10800101 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, OptionParty1Code.class, OptionParty3Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, Pagination1 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostedMarginOrCollateral6 .class, ReceivedMarginOrCollateral6 .class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes6 .class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradeData55Choice.class, TradeReport31Choice.class, TradeReportHeader4 .class, TradingCapacity7Code.class, UniqueTransactionIdentifier2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.108.001.01";

    public MxAuth10800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10800101(final String xml) {
        this();
        MxAuth10800101 tmp = parse(xml);
        derivsTradMrgnDataRpt = tmp.getDerivsTradMrgnDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradMrgnDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeMarginDataReportV01 }
     *     
     */
    public DerivativesTradeMarginDataReportV01 getDerivsTradMrgnDataRpt() {
        return derivsTradMrgnDataRpt;
    }

    /**
     * Sets the value of the derivsTradMrgnDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeMarginDataReportV01 }
     *     
     */
    public MxAuth10800101 setDerivsTradMrgnDataRpt(DerivativesTradeMarginDataReportV01 value) {
        this.derivsTradMrgnDataRpt = value;
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
    public static MxAuth10800101 parse(String xml) {
        return ((MxAuth10800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10800101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10800101) parserImpl.read(MxAuth10800101 .class, xml, _classes));
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
     * Creates an MxAuth10800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10800101 message
     * @return
     *     a new instance of MxAuth10800101
     */
    public static final MxAuth10800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10800101 .class);
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
