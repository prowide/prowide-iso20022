
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
 * Class for auth.070.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgTxMrgnDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.070.001.01")
public class MxAuth07000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgTxMrgnDataRpt", required = true)
    protected SecuritiesFinancingReportingTransactionMarginDataReportV01 sctiesFincgRptgTxMrgnDataRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 70;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, CollateralMarginCorrection3 .class, CollateralMarginError2 .class, CollateralMarginMarginUpdate2 .class, Counterparty30 .class, MxAuth07000101 .class, OrganisationIdentification9Choice.class, PostedMarginOrCollateral3 .class, ReceivedMarginOrCollateral3 .class, ReportPeriodActivity1Code.class, SecuritiesFinancingReportingTransactionMarginDataReportV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData6Choice.class, TradeReport6Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.070.001.01";

    public MxAuth07000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07000101(final String xml) {
        this();
        MxAuth07000101 tmp = parse(xml);
        sctiesFincgRptgTxMrgnDataRpt = tmp.getSctiesFincgRptgTxMrgnDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV01 }
     *     
     */
    public SecuritiesFinancingReportingTransactionMarginDataReportV01 getSctiesFincgRptgTxMrgnDataRpt() {
        return sctiesFincgRptgTxMrgnDataRpt;
    }

    /**
     * Sets the value of the sctiesFincgRptgTxMrgnDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingTransactionMarginDataReportV01 }
     *     
     */
    public MxAuth07000101 setSctiesFincgRptgTxMrgnDataRpt(SecuritiesFinancingReportingTransactionMarginDataReportV01 value) {
        this.sctiesFincgRptgTxMrgnDataRpt = value;
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
    public static MxAuth07000101 parse(String xml) {
        return ((MxAuth07000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07000101) parserImpl.read(MxAuth07000101 .class, xml, _classes));
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
     * Creates an MxAuth07000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07000101 message
     * @return
     *     a new instance of MxAuth07000101
     */
    public static final MxAuth07000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07000101 .class);
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
