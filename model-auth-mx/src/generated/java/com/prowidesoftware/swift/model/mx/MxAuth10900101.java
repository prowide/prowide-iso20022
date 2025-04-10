
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
 * Class for auth.109.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradMrgnDataTxStatRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.109.001.01")
public class MxAuth10900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradMrgnDataTxStatRpt", required = true)
    protected DerivativesTradeMarginDataTransactionStateReportV01 derivsTradMrgnDataTxStatRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 109;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAnd20DecimalAmount.class, CollateralPortfolioCode5Choice.class, CollateralisationType3Code.class, ContractModification8 .class, Counterparty45 .class, Counterparty46 .class, CounterpartyTradeNature15Choice.class, DerivativesTradeMarginDataTransactionStateReportV01 .class, Direction2 .class, Direction4Choice.class, FinancialInstitutionSector1 .class, FinancialPartyClassification2Choice.class, FinancialPartySectorType3Code.class, GenericIdentification175 .class, LegalPersonIdentification1 .class, MarginCollateralReport4 .class, MarginPortfolio3 .class, MarginReportData8 .class, MxAuth10900101 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NoReasonCode.class, NonFinancialInstitutionSector10 .class, NotApplicable1Code.class, OptionParty1Code.class, OptionParty3Code.class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, Pagination1 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, PostedMarginOrCollateral6 .class, ReceivedMarginOrCollateral6 .class, ReportPeriodActivity1Code.class, ReportingExemption1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TechnicalAttributes6 .class, TradeCounterpartyRelationship1Choice.class, TradeCounterpartyRelationshipRecord1 .class, TradeCounterpartyReport20 .class, TradeCounterpartyType1Code.class, TradeData56Choice.class, TradeReportHeader4 .class, TradingCapacity7Code.class, TransactionOperationType11Code.class, UniqueTransactionIdentifier2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.109.001.01";

    public MxAuth10900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10900101(final String xml) {
        this();
        MxAuth10900101 tmp = parse(xml);
        derivsTradMrgnDataTxStatRpt = tmp.getDerivsTradMrgnDataTxStatRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradMrgnDataTxStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeMarginDataTransactionStateReportV01 }
     *     
     */
    public DerivativesTradeMarginDataTransactionStateReportV01 getDerivsTradMrgnDataTxStatRpt() {
        return derivsTradMrgnDataTxStatRpt;
    }

    /**
     * Sets the value of the derivsTradMrgnDataTxStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeMarginDataTransactionStateReportV01 }
     *     
     */
    public MxAuth10900101 setDerivsTradMrgnDataTxStatRpt(DerivativesTradeMarginDataTransactionStateReportV01 value) {
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
    public static MxAuth10900101 parse(String xml) {
        return ((MxAuth10900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10900101) parserImpl.read(MxAuth10900101 .class, xml, _classes));
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
     * Creates an MxAuth10900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10900101 message
     * @return
     *     a new instance of MxAuth10900101
     */
    public static final MxAuth10900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10900101 .class);
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
