
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
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
 * Class for xsys.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys01900101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.019.001.01")
public class MxXsys01900101
    extends AbstractMX
{

    @XmlElement(name = "xsys.019.001.01", required = true)
    protected SessionHistoryReport xsys01900101;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ExecutionReportFailureDetails.class, InputChannelDetailsXsys01900101 .class, InputChannelListXsys01900101 .class, InputChannelSessionDetails.class, InputChannelSessionList.class, InputOutputChannelListXsys01900101 .class, MxXsys01900101 .class, OutputChannelDetails.class, OutputChannelList.class, OutputChannelSessionDetails.class, OutputChannelSessionList.class, ReportInformation.class, RequestReference.class, ResultCode.class, SessionHistoryReport.class, SwBooleanIndicator.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.019.001.01";

    public MxXsys01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys01900101(final String xml) {
        this();
        MxXsys01900101 tmp = parse(xml);
        xsys01900101 = tmp.getXsys01900101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys01900101 property.
     * 
     * @return
     *     possible object is
     *     {@link SessionHistoryReport }
     *     
     */
    public SessionHistoryReport getXsys01900101() {
        return xsys01900101;
    }

    /**
     * Sets the value of the xsys01900101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionHistoryReport }
     *     
     */
    public MxXsys01900101 setXsys01900101(SessionHistoryReport value) {
        this.xsys01900101 = value;
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
    public static MxXsys01900101 parse(String xml) {
        return ((MxXsys01900101) MxReadImpl.parse(MxXsys01900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys01900101 parse(String xml, MxRead parserImpl) {
        return ((MxXsys01900101) parserImpl.read(MxXsys01900101 .class, xml, _classes));
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
     * Creates an MxXsys01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys01900101 message
     * @return
     *     a new instance of MxXsys01900101
     */
    public final static MxXsys01900101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxXsys01900101 .class);
    }

}
