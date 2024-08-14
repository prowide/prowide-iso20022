
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
 * Class for auth.044.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgEqtyTradgActvtyRslt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.02")
public class MxAuth04400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgEqtyTradgActvtyRslt", required = true)
    protected FinancialInstrumentReportingEquityTradingActivityResultV02 finInstrmRptgEqtyTradgActvtyRslt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, EquityInstrumentReportingClassification1Code.class, FinancialInstrumentReportingEquityTradingActivityResultV02 .class, MarketDetail2 .class, MxAuth04400102 .class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, StatisticsTransparency3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport17 .class, TransparencyMethodology2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.02";

    public MxAuth04400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04400102(final String xml) {
        this();
        MxAuth04400102 tmp = parse(xml);
        finInstrmRptgEqtyTradgActvtyRslt = tmp.getFinInstrmRptgEqtyTradgActvtyRslt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgEqtyTradgActvtyRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingEquityTradingActivityResultV02 }
     *     
     */
    public FinancialInstrumentReportingEquityTradingActivityResultV02 getFinInstrmRptgEqtyTradgActvtyRslt() {
        return finInstrmRptgEqtyTradgActvtyRslt;
    }

    /**
     * Sets the value of the finInstrmRptgEqtyTradgActvtyRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingEquityTradingActivityResultV02 }
     *     
     */
    public MxAuth04400102 setFinInstrmRptgEqtyTradgActvtyRslt(FinancialInstrumentReportingEquityTradingActivityResultV02 value) {
        this.finInstrmRptgEqtyTradgActvtyRslt = value;
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
    public static MxAuth04400102 parse(String xml) {
        return ((MxAuth04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth04400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04400102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04400102) parserImpl.read(MxAuth04400102 .class, xml, _classes));
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
     * Creates an MxAuth04400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04400102 message
     * @return
     *     a new instance of MxAuth04400102
     */
    public static final MxAuth04400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth04400102 .class);
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
