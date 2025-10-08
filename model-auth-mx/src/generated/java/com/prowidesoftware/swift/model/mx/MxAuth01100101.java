
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
 * Class for auth.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRptCxlStsV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.011.001.01")
public class MxAuth01100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRptCxlStsV01", required = true)
    protected RegulatoryTransactionReportCancellationStatusV01 rgltryTxRptCxlStsV01;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DocumentIdentification8 .class, GenericIdentification1 .class, MxAuth01100101 .class, PartyIdentification23Choice.class, RegulatoryTransactionReportCancellationStatusV01 .class, RejectedCancellationStatusReason1Choice.class, RejectedCancellationStatusReason1Code.class, ReportStatusAndReason2 .class, Status2Code.class, TradeTransactionStatusAndReason2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.011.001.01";

    public MxAuth01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01100101(final String xml) {
        this();
        MxAuth01100101 tmp = parse(xml);
        rgltryTxRptCxlStsV01 = tmp.getRgltryTxRptCxlStsV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRptCxlStsV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportCancellationStatusV01 }
     *     
     */
    public RegulatoryTransactionReportCancellationStatusV01 getRgltryTxRptCxlStsV01() {
        return rgltryTxRptCxlStsV01;
    }

    /**
     * Sets the value of the rgltryTxRptCxlStsV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportCancellationStatusV01 }
     *     
     */
    public MxAuth01100101 setRgltryTxRptCxlStsV01(RegulatoryTransactionReportCancellationStatusV01 value) {
        this.rgltryTxRptCxlStsV01 = value;
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
    public static MxAuth01100101 parse(String xml) {
        return ((MxAuth01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth01100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth01100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01100101) parserImpl.read(MxAuth01100101 .class, xml, _classes));
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
     * Creates an MxAuth01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01100101 message
     * @return
     *     a new instance of MxAuth01100101
     */
    public final static MxAuth01100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01100101 .class);
    }

}
