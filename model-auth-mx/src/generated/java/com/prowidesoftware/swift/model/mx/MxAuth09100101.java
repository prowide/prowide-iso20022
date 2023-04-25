
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
 * Class for auth.091.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "derivsTradRcncltnSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.091.001.01")
public class MxAuth09100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DerivsTradRcncltnSttstclRpt", required = true)
    protected DerivativesTradeReconciliationStatisticalReportV01 derivsTradRcncltnSttstclRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 91;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CompetentAuthority1 .class, Counterparty26 .class, Counterparty29 .class, CounterpartyTradeNature5Choice.class, DerivativesTradeReconciliationStatisticalReportV01 .class, DetailedReconciliationStatistics2 .class, DetailedStatisticsPerCounterparty5 .class, FinancialPartySectorType1Code.class, MxAuth09100101 .class, NoReasonCode.class, NonFinancialInstitutionSector2 .class, OptionParty1Code.class, OrganisationIdentification30 .class, OrganisationIdentification7Choice.class, OrganisationIdentification8Choice.class, OrganisationIdentification9Choice.class, ReconciliationStatisticsPerDerivativeContractGroup3 .class, ReconciliationStatisticsPerDerivativeType3 .class, ReportPeriodActivity1Code.class, StatisticsPerCounterparty1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeCounterpartyReport9 .class, TradingCapacity7Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.091.001.01";

    public MxAuth09100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth09100101(final String xml) {
        this();
        MxAuth09100101 tmp = parse(xml);
        derivsTradRcncltnSttstclRpt = tmp.getDerivsTradRcncltnSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth09100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the derivsTradRcncltnSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeReconciliationStatisticalReportV01 }
     *     
     */
    public DerivativesTradeReconciliationStatisticalReportV01 getDerivsTradRcncltnSttstclRpt() {
        return derivsTradRcncltnSttstclRpt;
    }

    /**
     * Sets the value of the derivsTradRcncltnSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeReconciliationStatisticalReportV01 }
     *     
     */
    public MxAuth09100101 setDerivsTradRcncltnSttstclRpt(DerivativesTradeReconciliationStatisticalReportV01 value) {
        this.derivsTradRcncltnSttstclRpt = value;
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
    public static MxAuth09100101 parse(String xml) {
        return ((MxAuth09100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth09100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth09100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth09100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth09100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth09100101) parserImpl.read(MxAuth09100101 .class, xml, _classes));
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
     * Creates an MxAuth09100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth09100101 message
     * @return
     *     a new instance of MxAuth09100101
     */
    public static final MxAuth09100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth09100101 .class);
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
