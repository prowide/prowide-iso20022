
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
 * Class for auth.010.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRptStsV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.010.001.01")
public class MxAuth01000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRptStsV01", required = true)
    protected RegulatoryTransactionReportStatusV01 rgltryTxRptStsV01;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DocumentIdentification8 .class, GenericIdentification1 .class, MxAuth01000101 .class, PartyIdentification23Choice.class, RegulatoryTransactionReportStatusV01 .class, RejectedStatusReason9Choice.class, RejectedStatusReason9Code.class, ReportStatusAndReason1 .class, Status2Code.class, TradeTransactionStatusAndReason1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.010.001.01";

    public MxAuth01000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01000101(final String xml) {
        this();
        MxAuth01000101 tmp = parse(xml);
        rgltryTxRptStsV01 = tmp.getRgltryTxRptStsV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRptStsV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportStatusV01 }
     *     
     */
    public RegulatoryTransactionReportStatusV01 getRgltryTxRptStsV01() {
        return rgltryTxRptStsV01;
    }

    /**
     * Sets the value of the rgltryTxRptStsV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportStatusV01 }
     *     
     */
    public MxAuth01000101 setRgltryTxRptStsV01(RegulatoryTransactionReportStatusV01 value) {
        this.rgltryTxRptStsV01 = value;
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
    public static MxAuth01000101 parse(String xml) {
        return ((MxAuth01000101) MxReadImpl.parse(MxAuth01000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01000101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01000101) parserImpl.read(MxAuth01000101 .class, xml, _classes));
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
     * Creates an MxAuth01000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01000101 message
     * @return
     *     a new instance of MxAuth01000101
     */
    public final static MxAuth01000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01000101 .class);
    }

}
