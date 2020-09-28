
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
 * Class for auth.044.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgEqtyTradgActvtyRslt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.02")
public class MxAuth04400102
    extends AbstractMX
{

    @XmlElement(name = "FinInstrmRptgEqtyTradgActvtyRslt", required = true)
    protected FinancialInstrumentReportingEquityTradingActivityResultV02 finInstrmRptgEqtyTradgActvtyRslt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, EquityInstrumentReportingClassification1Code.class, FinancialInstrumentReportingEquityTradingActivityResultV02 .class, MarketDetail2 .class, MxAuth04400102 .class, Period2 .class, Period4Choice.class, SecuritiesMarketReportHeader1 .class, StatisticsTransparency3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransparencyDataReport17 .class, TransparencyMethodology2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.044.001.02";

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
    public static MxAuth04400102 parse(String xml) {
        return ((MxAuth04400102) MxReadImpl.parse(MxAuth04400102 .class, xml, _classes));
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
    public final static MxAuth04400102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth04400102 .class);
    }

}
