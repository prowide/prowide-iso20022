
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
 * Class for auth.039.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgNonWorkgDayRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.039.001.01")
public class MxAuth03900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgNonWorkgDayRpt", required = true)
    protected FinancialInstrumentReportingNonWorkingDayReportV01 finInstrmRptgNonWorkgDayRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 39;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {FinancialInstrumentReportingNonWorkingDayReportV01 .class, MxAuth03900101 .class, NonTradingDayReason1Code.class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, SecuritiesNonTradingDay1 .class, SecuritiesNonTradingDayReport1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.039.001.01";

    public MxAuth03900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03900101(final String xml) {
        this();
        MxAuth03900101 tmp = parse(xml);
        finInstrmRptgNonWorkgDayRpt = tmp.getFinInstrmRptgNonWorkgDayRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgNonWorkgDayRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingNonWorkingDayReportV01 }
     *     
     */
    public FinancialInstrumentReportingNonWorkingDayReportV01 getFinInstrmRptgNonWorkgDayRpt() {
        return finInstrmRptgNonWorkgDayRpt;
    }

    /**
     * Sets the value of the finInstrmRptgNonWorkgDayRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingNonWorkingDayReportV01 }
     *     
     */
    public MxAuth03900101 setFinInstrmRptgNonWorkgDayRpt(FinancialInstrumentReportingNonWorkingDayReportV01 value) {
        this.finInstrmRptgNonWorkgDayRpt = value;
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
    public static MxAuth03900101 parse(String xml) {
        return ((MxAuth03900101) MxReadImpl.parse(MxAuth03900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03900101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03900101) parserImpl.read(MxAuth03900101 .class, xml, _classes));
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
     * Creates an MxAuth03900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03900101 message
     * @return
     *     a new instance of MxAuth03900101
     */
    public final static MxAuth03900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03900101 .class);
    }

}
