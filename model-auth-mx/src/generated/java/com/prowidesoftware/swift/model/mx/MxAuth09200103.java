
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
 * Class for auth.092.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRjctnSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.092.001.03")
public class MxAuth09200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRjctnSttstclRpt", required = true)
    protected DerivativesTradeRejectionStatisticalReportV03 derivsTradRjctnSttstclRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 92;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AgreementType2Choice.class, CollateralPortfolioCode5Choice.class, CounterpartyData92 .class, DateAndDateTime2Choice.class, DerivativeEventType3Code.class, DerivativesTradeRejectionStatisticalReportV03 .class, DetailedReportStatistics6 .class, DetailedStatisticsPerCounterparty18 .class, DetailedTransactionStatistics29 .class, DetailedTransactionStatistics6Choice.class, GenericIdentification175 .class, GenericValidationRuleIdentification1 .class, LegalPersonIdentification1 .class, MarginPortfolio3 .class, MasterAgreement8 .class, MxAuth09200103 .class, NaturalPersonIdentification2 .class, NaturalPersonIdentification3 .class, NotApplicable1Code.class, NumberOfTransactionsPerValidationRule6 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PartyIdentification248Choice.class, PortfolioCode3Choice.class, PortfolioCode5Choice.class, PortfolioIdentification3 .class, RejectionReason70 .class, RejectionReason71 .class, RejectionStatistics8 .class, ReportPeriodActivity1Code.class, ReportingMessageStatus2Code.class, StatisticsPerActionType1 .class, StatisticsPerCounterparty17Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeTransactionIdentification24 .class, TransactionOperationType10Code.class, UniqueTransactionIdentifier2Choice.class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.092.001.03";

    public MxAuth09200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09200103(final String xml) {
        this();
        MxAuth09200103 tmp = parse(xml);
        derivsTradRjctnSttstclRpt = tmp.getDerivsTradRjctnSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRjctnSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeRejectionStatisticalReportV03 }
     *     
     */
    public DerivativesTradeRejectionStatisticalReportV03 getDerivsTradRjctnSttstclRpt() {
        return derivsTradRjctnSttstclRpt;
    }

    /**
     * Sets the value of the derivsTradRjctnSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeRejectionStatisticalReportV03 }
     *     
     */
    public MxAuth09200103 setDerivsTradRjctnSttstclRpt(DerivativesTradeRejectionStatisticalReportV03 value) {
        this.derivsTradRjctnSttstclRpt = value;
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
    public static MxAuth09200103 parse(String xml) {
        return ((MxAuth09200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09200103 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09200103) parserImpl.read(MxAuth09200103 .class, xml, _classes));
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
     * Creates an MxAuth09200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09200103 message
     * @return
     *     a new instance of MxAuth09200103
     */
    public final static MxAuth09200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09200103 .class);
    }

}
