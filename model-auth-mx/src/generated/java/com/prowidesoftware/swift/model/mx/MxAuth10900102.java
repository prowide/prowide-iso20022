
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
 * Class for auth.109.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradMrgnDataTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.109.001.02")
public class MxAuth10900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradMrgnDataTxStatRpt", required = true)
    protected DerivativesTradeMarginDataTransactionStateReportV02 derivsTradMrgnDataTxStatRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 109;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20DecimalAmount.class, CollateralPortfolioCode6Choice.class, CollateralisationType3Code.class, ContractModification8 .class, Counterparty45 .class, Counterparty46 .class, CounterpartyTradeNature15Choice.class, DerivativesTradeMarginDataTransactionStateReportV02 .class, Direction2 .class, Direction4Choice.class, FinancialInstitutionSector1 .class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, GenericIdentification175 .class, LegalPersonIdentification1 .class, MarginCollateralReport5 .class, MarginPortfolio4 .class, MarginReportData10 .class, MxAuth10900102 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, OptionParty1Code.class, OptionParty3Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, Pagination1 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostedMarginOrCollateral6 .class, ReceivedMarginOrCollateral6 .class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes6 .class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradeData62Choice.class, TradeReportHeader4 .class, TradingCapacity7Code.class, TransactionOperationType11Code.class, UniqueTransactionIdentifier2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.109.001.02";

    public MxAuth10900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10900102(final String xml) {
        this();
        MxAuth10900102 tmp = parse(xml);
        derivsTradMrgnDataTxStatRpt = tmp.getDerivsTradMrgnDataTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradMrgnDataTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeMarginDataTransactionStateReportV02 }
     *     
     */
    public DerivativesTradeMarginDataTransactionStateReportV02 getDerivsTradMrgnDataTxStatRpt() {
        return derivsTradMrgnDataTxStatRpt;
    }

    /**
     * Sets the value of the derivsTradMrgnDataTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeMarginDataTransactionStateReportV02 }
     *     
     */
    public MxAuth10900102 setDerivsTradMrgnDataTxStatRpt(DerivativesTradeMarginDataTransactionStateReportV02 value) {
        this.derivsTradMrgnDataTxStatRpt = value;
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
    public static MxAuth10900102 parse(String xml) {
        return ((MxAuth10900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10900102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10900102) parserImpl.read(MxAuth10900102 .class, xml, _classes));
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
     * Creates an MxAuth10900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10900102 message
     * @return
     *     a new instance of MxAuth10900102
     */
    public static final MxAuth10900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10900102 .class);
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
