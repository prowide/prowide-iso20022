
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.043.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgRefDataIndxRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.043.001.01")
public class MxAuth04300101
    extends AbstractMX
{

    @XmlElement(name = "FinInstrmRptgRefDataIndxRpt", required = true)
    protected FinancialInstrumentReportingReferenceDataIndexReportV01 finInstrmRptgRefDataIndxRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BenchmarkCurveName2Code.class, FinancialInstrument46Choice.class, FinancialInstrumentReportingReferenceDataIndexReportV01 .class, MxAuth04300101 .class, Period2 .class, Period4Choice.class, SecuritiesIndexReport1 .class, SecuritiesMarketReportHeader1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.043.001.01";

    public MxAuth04300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04300101(final String xml) {
        this();
        MxAuth04300101 tmp = parse(xml);
        finInstrmRptgRefDataIndxRpt = tmp.getFinInstrmRptgRefDataIndxRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgRefDataIndxRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingReferenceDataIndexReportV01 }
     *     
     */
    public FinancialInstrumentReportingReferenceDataIndexReportV01 getFinInstrmRptgRefDataIndxRpt() {
        return finInstrmRptgRefDataIndxRpt;
    }

    /**
     * Sets the value of the finInstrmRptgRefDataIndxRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingReferenceDataIndexReportV01 }
     *     
     */
    public MxAuth04300101 setFinInstrmRptgRefDataIndxRpt(FinancialInstrumentReportingReferenceDataIndexReportV01 value) {
        this.finInstrmRptgRefDataIndxRpt = value;
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
    public static MxAuth04300101 parse(String xml) {
        return ((MxAuth04300101) MxReadImpl.parse(MxAuth04300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04300101) parserImpl.read(MxAuth04300101 .class, xml, _classes));
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
     * Creates an MxAuth04300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04300101 message
     * @return
     *     a new instance of MxAuth04300101
     */
    public final static MxAuth04300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth04300101 .class);
    }

}
