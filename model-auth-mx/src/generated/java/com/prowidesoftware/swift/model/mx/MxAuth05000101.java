
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
 * Class for auth.050.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgInstrmClssfctnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.050.001.01")
public class MxAuth05000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInstrmRptgInstrmClssfctnRpt", required = true)
    protected FinancialInstrumentReportingInstrumentClassificationReportV01 finInstrmRptgInstrmClssfctnRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 50;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {FinancialInstrumentReportingInstrumentClassificationReportV01 .class, Modification1Code.class, MxAuth05000101 .class, Period2 .class, Period4Choice.class, SecuritiesInstrumentClassification2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.050.001.01";

    public MxAuth05000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth05000101(final String xml) {
        this();
        MxAuth05000101 tmp = parse(xml);
        finInstrmRptgInstrmClssfctnRpt = tmp.getFinInstrmRptgInstrmClssfctnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth05000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgInstrmClssfctnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingInstrumentClassificationReportV01 }
     *     
     */
    public FinancialInstrumentReportingInstrumentClassificationReportV01 getFinInstrmRptgInstrmClssfctnRpt() {
        return finInstrmRptgInstrmClssfctnRpt;
    }

    /**
     * Sets the value of the finInstrmRptgInstrmClssfctnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingInstrumentClassificationReportV01 }
     *     
     */
    public MxAuth05000101 setFinInstrmRptgInstrmClssfctnRpt(FinancialInstrumentReportingInstrumentClassificationReportV01 value) {
        this.finInstrmRptgInstrmClssfctnRpt = value;
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
    public static MxAuth05000101 parse(String xml) {
        return ((MxAuth05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth05000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth05000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth05000101) parserImpl.read(MxAuth05000101 .class, xml, _classes));
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
     * Creates an MxAuth05000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth05000101 message
     * @return
     *     a new instance of MxAuth05000101
     */
    public final static MxAuth05000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth05000101 .class);
    }

}
