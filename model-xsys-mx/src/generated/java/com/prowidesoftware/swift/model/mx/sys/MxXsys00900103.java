
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for xsys.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys00900103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.009.001.03")
public class MxXsys00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "xsys.009.001.03", required = true)
    protected QueueStatusReportXsys00900103 xsys00900103;
    public static final transient String BUSINESS_PROCESS = "xsys";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcquisitionStateCode.class, ActivationStateCode.class, ExecutionReportFailureDetails.class, MessageListXsys00900103 .class, MessageXsys00900103 .class, MxXsys00900103 .class, QueueStatusListXsys00900103 .class, QueueStatusReportXsys00900103 .class, QueueStatusXsys00900103 .class, ReportInformation.class, RequestReference.class, ResultCode.class, SessionDetails.class, SessionList.class, SwBooleanIndicator.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:xsys.009.001.03";

    public MxXsys00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys00900103(final String xml) {
        this();
        MxXsys00900103 tmp = parse(xml);
        xsys00900103 = tmp.getXsys00900103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys00900103 property.
     * 
     * @return
     *     possible object is
     *     {@link QueueStatusReportXsys00900103 }
     *     
     */
    public QueueStatusReportXsys00900103 getXsys00900103() {
        return xsys00900103;
    }

    /**
     * Sets the value of the xsys00900103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueStatusReportXsys00900103 }
     *     
     */
    public MxXsys00900103 setXsys00900103(QueueStatusReportXsys00900103 value) {
        this.xsys00900103 = value;
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
    public static MxXsys00900103 parse(String xml) {
        return ((MxXsys00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxXsys00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxXsys00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys00900103 parse(String xml, MxRead parserImpl) {
        return ((MxXsys00900103) parserImpl.read(MxXsys00900103 .class, xml, _classes));
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
     * Creates an MxXsys00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys00900103 message
     * @return
     *     a new instance of MxXsys00900103
     */
    public static final MxXsys00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxXsys00900103 .class);
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
