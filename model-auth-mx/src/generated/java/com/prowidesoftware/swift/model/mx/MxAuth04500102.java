
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
 * Class for auth.045.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgNonEqtyTradgActvtyRslt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.045.001.02")
public class MxAuth04500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgNonEqtyTradgActvtyRslt", required = true)
    protected FinancialInstrumentReportingNonEquityTradingActivityResultV02 finInstrmRptgNonEqtyTradgActvtyRslt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 45;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, FinancialInstrumentReportingNonEquityTradingActivityResultV02 .class, MxAuth04500102 .class, NonEquityInstrumentReportingClassification1Code.class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, StatisticsTransparency2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TonsOrCurrency2Choice.class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport18 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.045.001.02";

    public MxAuth04500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04500102(final String xml) {
        this();
        MxAuth04500102 tmp = parse(xml);
        finInstrmRptgNonEqtyTradgActvtyRslt = tmp.getFinInstrmRptgNonEqtyTradgActvtyRslt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgNonEqtyTradgActvtyRslt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingNonEquityTradingActivityResultV02 }
     *     
     */
    public FinancialInstrumentReportingNonEquityTradingActivityResultV02 getFinInstrmRptgNonEqtyTradgActvtyRslt() {
        return finInstrmRptgNonEqtyTradgActvtyRslt;
    }

    /**
     * Sets the value of the finInstrmRptgNonEqtyTradgActvtyRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingNonEquityTradingActivityResultV02 }
     *     
     */
    public MxAuth04500102 setFinInstrmRptgNonEqtyTradgActvtyRslt(FinancialInstrumentReportingNonEquityTradingActivityResultV02 value) {
        this.finInstrmRptgNonEqtyTradgActvtyRslt = value;
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
    public static MxAuth04500102 parse(String xml) {
        return ((MxAuth04500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth04500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth04500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04500102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04500102) parserImpl.read(MxAuth04500102 .class, xml, _classes));
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
     * Creates an MxAuth04500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04500102 message
     * @return
     *     a new instance of MxAuth04500102
     */
    public static final MxAuth04500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth04500102 .class);
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
