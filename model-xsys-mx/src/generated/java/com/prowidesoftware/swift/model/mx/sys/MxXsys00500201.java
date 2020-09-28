
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
 * Class for xsys.005.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys00500201"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.005.002.01")
public class MxXsys00500201
    extends AbstractMX
{

    @XmlElement(name = "xsys.005.002.01", required = true)
    protected UndeliveredMessagesReportXsys00500201 xsys00500201;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {MxXsys00500201 .class, ReportCriteriaXsys00500201 .class, ReportInfo.class, ResultCode.class, SwBooleanIndicator.class, UndeliveredMessageListXsys00500201 .class, UndeliveredMessageXsys00500201 .class, UndeliveredMessagesReportXsys00500201 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.005.002.01";

    public MxXsys00500201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys00500201(final String xml) {
        this();
        MxXsys00500201 tmp = parse(xml);
        xsys00500201 = tmp.getXsys00500201();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys00500201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys00500201 property.
     * 
     * @return
     *     possible object is
     *     {@link UndeliveredMessagesReportXsys00500201 }
     *     
     */
    public UndeliveredMessagesReportXsys00500201 getXsys00500201() {
        return xsys00500201;
    }

    /**
     * Sets the value of the xsys00500201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndeliveredMessagesReportXsys00500201 }
     *     
     */
    public MxXsys00500201 setXsys00500201(UndeliveredMessagesReportXsys00500201 value) {
        this.xsys00500201 = value;
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
    public static MxXsys00500201 parse(String xml) {
        return ((MxXsys00500201) MxReadImpl.parse(MxXsys00500201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys00500201 parse(String xml, MxRead parserImpl) {
        return ((MxXsys00500201) parserImpl.read(MxXsys00500201 .class, xml, _classes));
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
     * Creates an MxXsys00500201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys00500201 message
     * @return
     *     a new instance of MxXsys00500201
     */
    public final static MxXsys00500201 fromJson(String json) {
        return AbstractMX.fromJson(json, MxXsys00500201 .class);
    }

}
