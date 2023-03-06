
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for xsys.009.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys00900102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.009.001.02")
public class MxXsys00900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "xsys.009.001.02", required = true)
    protected QueueStatusReportXsys00900102 xsys00900102;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcquisitionStateCode.class, ActivationStateCode.class, ExecutionReportFailureDetails.class, Message.class, MessageList.class, MxXsys00900102 .class, QueueStatusList.class, QueueStatusReportXsys00900102 .class, QueueStatusXsys00900102 .class, ReportInformation.class, RequestReference.class, ResultCode.class, SessionDetails.class, SessionList.class, SwBooleanIndicator.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.009.001.02";

    public MxXsys00900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys00900102(final String xml) {
        this();
        MxXsys00900102 tmp = parse(xml);
        xsys00900102 = tmp.getXsys00900102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys00900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys00900102 property.
     * 
     * @return
     *     possible object is
     *     {@link QueueStatusReportXsys00900102 }
     *     
     */
    public QueueStatusReportXsys00900102 getXsys00900102() {
        return xsys00900102;
    }

    /**
     * Sets the value of the xsys00900102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueStatusReportXsys00900102 }
     *     
     */
    public MxXsys00900102 setXsys00900102(QueueStatusReportXsys00900102 value) {
        this.xsys00900102 = value;
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
    public static MxXsys00900102 parse(String xml) {
        return ((MxXsys00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxXsys00900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxXsys00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys00900102 parse(String xml, MxRead parserImpl) {
        return ((MxXsys00900102) parserImpl.read(MxXsys00900102 .class, xml, _classes));
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
     * Creates an MxXsys00900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys00900102 message
     * @return
     *     a new instance of MxXsys00900102
     */
    public final static MxXsys00900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxXsys00900102 .class);
    }

}
