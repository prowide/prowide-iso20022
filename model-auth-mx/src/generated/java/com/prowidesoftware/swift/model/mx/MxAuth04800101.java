
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
 * Class for auth.048.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgCcyCdRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.048.001.01")
public class MxAuth04800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgCcyCdRpt", required = true)
    protected FinancialInstrumentReportingCurrencyCodeReportV01 finInstrmRptgCcyCdRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 48;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CountryCodeAndName3 .class, CurrencyCodeAndName1 .class, FinancialInstrumentReportingCurrencyCodeReportV01 .class, Modification1Code.class, MxAuth04800101 .class, Period2 .class, Period4Choice.class, SecuritiesCurrencyIdentification2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.048.001.01";

    public MxAuth04800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth04800101(final String xml) {
        this();
        MxAuth04800101 tmp = parse(xml);
        finInstrmRptgCcyCdRpt = tmp.getFinInstrmRptgCcyCdRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth04800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgCcyCdRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingCurrencyCodeReportV01 }
     *     
     */
    public FinancialInstrumentReportingCurrencyCodeReportV01 getFinInstrmRptgCcyCdRpt() {
        return finInstrmRptgCcyCdRpt;
    }

    /**
     * Sets the value of the finInstrmRptgCcyCdRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingCurrencyCodeReportV01 }
     *     
     */
    public MxAuth04800101 setFinInstrmRptgCcyCdRpt(FinancialInstrumentReportingCurrencyCodeReportV01 value) {
        this.finInstrmRptgCcyCdRpt = value;
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
    public static MxAuth04800101 parse(String xml) {
        return ((MxAuth04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth04800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth04800101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth04800101) parserImpl.read(MxAuth04800101 .class, xml, _classes));
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
     * Creates an MxAuth04800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth04800101 message
     * @return
     *     a new instance of MxAuth04800101
     */
    public final static MxAuth04800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth04800101 .class);
    }

}
