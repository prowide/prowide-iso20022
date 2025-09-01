
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
 * Class for auth.035.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgTradgVolCapDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.035.001.01")
public class MxAuth03500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgTradgVolCapDataRpt", required = true)
    protected FinancialInstrumentReportingTradingVolumeCapDataReportV01 finInstrmRptgTradgVolCapDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {FinancialInstrumentReportingTradingVolumeCapDataReportV01 .class, MxAuth03500101 .class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, VolumeCapReport1 .class, VolumeCapReport2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.035.001.01";

    public MxAuth03500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth03500101(final String xml) {
        this();
        MxAuth03500101 tmp = parse(xml);
        finInstrmRptgTradgVolCapDataRpt = tmp.getFinInstrmRptgTradgVolCapDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth03500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgTradgVolCapDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingTradingVolumeCapDataReportV01 }
     *     
     */
    public FinancialInstrumentReportingTradingVolumeCapDataReportV01 getFinInstrmRptgTradgVolCapDataRpt() {
        return finInstrmRptgTradgVolCapDataRpt;
    }

    /**
     * Sets the value of the finInstrmRptgTradgVolCapDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingTradingVolumeCapDataReportV01 }
     *     
     */
    public MxAuth03500101 setFinInstrmRptgTradgVolCapDataRpt(FinancialInstrumentReportingTradingVolumeCapDataReportV01 value) {
        this.finInstrmRptgTradgVolCapDataRpt = value;
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
    public static MxAuth03500101 parse(String xml) {
        return ((MxAuth03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth03500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth03500101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth03500101) parserImpl.read(MxAuth03500101 .class, xml, _classes));
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
     * Creates an MxAuth03500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth03500101 message
     * @return
     *     a new instance of MxAuth03500101
     */
    public final static MxAuth03500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth03500101 .class);
    }

}
