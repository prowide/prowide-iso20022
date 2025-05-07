
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
 * Class for auth.108.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradMrgnDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.108.001.02")
public class MxAuth10800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradMrgnDataRpt", required = true)
    protected DerivativesTradeMarginDataReportV02 derivsTradMrgnDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 108;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20DecimalAmount.class, CollateralPortfolioCode6Choice.class, CollateralisationType3Code.class, Counterparty45 .class, Counterparty46 .class, CounterpartyTradeNature15Choice.class, DerivativesTradeMarginDataReportV02 .class, Direction2 .class, Direction4Choice.class, FinancialInstitutionSector1 .class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, GenericIdentification175 .class, LegalPersonIdentification1 .class, MarginCollateralReport5 .class, MarginPortfolio4 .class, MarginReportData9 .class, MxAuth10800102 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, OptionParty1Code.class, OptionParty3Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, Pagination1 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostedMarginOrCollateral6 .class, ReceivedMarginOrCollateral6 .class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes6 .class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradeData61Choice.class, TradeReport34Choice.class, TradeReportHeader4 .class, TradingCapacity7Code.class, UniqueTransactionIdentifier2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.108.001.02";

    public MxAuth10800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10800102(final String xml) {
        this();
        MxAuth10800102 tmp = parse(xml);
        derivsTradMrgnDataRpt = tmp.getDerivsTradMrgnDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradMrgnDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeMarginDataReportV02 }
     *     
     */
    public DerivativesTradeMarginDataReportV02 getDerivsTradMrgnDataRpt() {
        return derivsTradMrgnDataRpt;
    }

    /**
     * Sets the value of the derivsTradMrgnDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeMarginDataReportV02 }
     *     
     */
    public MxAuth10800102 setDerivsTradMrgnDataRpt(DerivativesTradeMarginDataReportV02 value) {
        this.derivsTradMrgnDataRpt = value;
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
    public static MxAuth10800102 parse(String xml) {
        return ((MxAuth10800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10800102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10800102) parserImpl.read(MxAuth10800102 .class, xml, _classes));
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
     * Creates an MxAuth10800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10800102 message
     * @return
     *     a new instance of MxAuth10800102
     */
    public final static MxAuth10800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10800102 .class);
    }

}
