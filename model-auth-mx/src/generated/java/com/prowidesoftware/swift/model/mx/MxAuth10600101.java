
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
 * Class for auth.106.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradWrnngsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.106.001.01")
public class MxAuth10600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradWrnngsRpt", required = true)
    protected DerivativesTradeWarningsReportV01 derivsTradWrnngsRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 106;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AbnormalValuesData4 .class, AbnormalValuesTransactionData2 .class, ActiveOrHistoricCurrencyAnd19DecimalAmount.class, AgreementType2Choice.class, AmountAndDirection106 .class, CollateralPortfolioCode5Choice.class, CounterpartyData92 .class, DateAndDateTime2Choice.class, DerivativeEventType3Code.class, DerivativesTradeWarningsReportV01 .class, DetailedAbnormalValuesStatistics4Choice.class, DetailedMissingMarginInformationStatistics4Choice.class, DetailedMissingValuationsStatistics4Choice.class, DetailedStatisticsPerCounterparty17 .class, DetailedTransactionStatistics26 .class, DetailedTransactionStatistics27 .class, DetailedTransactionStatistics28 .class, Frequency19Code.class, GenericIdentification175 .class, LegalPersonIdentification1 .class, MarginPortfolio3 .class, MasterAgreement8 .class, MissingMarginData2 .class, MissingMarginTransactionData2 .class, MissingValuationsData2 .class, MissingValuationsTransactionData2 .class, MxAuth10600101 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NotApplicable1Code.class, NotionalAmount5 .class, NotionalAmount6 .class, NotionalAmountLegs5 .class, NotionalQuantity9 .class, NotionalQuantityLegs5 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, QuantityOrTerm1Choice.class, QuantityTerm1 .class, ReportPeriodActivity1Code.class, Schedule10 .class, Schedule11 .class, StatisticsPerCounterparty16Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeTransactionIdentification24 .class, TransactionOperationType10Code.class, UniqueTransactionIdentifier2Choice.class, UnitOfMeasure8Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.106.001.01";

    public MxAuth10600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth10600101(final String xml) {
        this();
        MxAuth10600101 tmp = parse(xml);
        derivsTradWrnngsRpt = tmp.getDerivsTradWrnngsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth10600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradWrnngsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeWarningsReportV01 }
     *     
     */
    public DerivativesTradeWarningsReportV01 getDerivsTradWrnngsRpt() {
        return derivsTradWrnngsRpt;
    }

    /**
     * Sets the value of the derivsTradWrnngsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeWarningsReportV01 }
     *     
     */
    public MxAuth10600101 setDerivsTradWrnngsRpt(DerivativesTradeWarningsReportV01 value) {
        this.derivsTradWrnngsRpt = value;
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
    public static MxAuth10600101 parse(String xml) {
        return ((MxAuth10600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth10600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth10600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth10600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth10600101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth10600101) parserImpl.read(MxAuth10600101 .class, xml, _classes));
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
     * Creates an MxAuth10600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth10600101 message
     * @return
     *     a new instance of MxAuth10600101
     */
    public final static MxAuth10600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth10600101 .class);
    }

}
