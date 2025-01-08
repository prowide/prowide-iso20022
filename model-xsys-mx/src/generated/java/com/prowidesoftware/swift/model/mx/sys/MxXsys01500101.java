
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
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
 * Class for xsys.015.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys01500101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.015.001.01")
public class MxXsys01500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "xsys.015.001.01", required = true)
    protected RetrievalRequest xsys01500101;
    public static final transient String BUSINESS_PROCESS = "xsys";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalFilterCriteria.class, InputOutputCriteria.class, InputSequenceCriteria.class, InputTimeCriteria.class, MultipleMessageCriteria.class, MxXsys01500101 .class, OutputSequenceCriteria.class, OutputTimeCriteria.class, ReportCriteriaXsys01500101 .class, RetrievalRequest.class, SingleMessageCriteria.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:xsys.015.001.01";

    public MxXsys01500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys01500101(final String xml) {
        this();
        MxXsys01500101 tmp = parse(xml);
        xsys01500101 = tmp.getXsys01500101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys01500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys01500101 property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalRequest }
     *     
     */
    public RetrievalRequest getXsys01500101() {
        return xsys01500101;
    }

    /**
     * Sets the value of the xsys01500101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalRequest }
     *     
     */
    public MxXsys01500101 setXsys01500101(RetrievalRequest value) {
        this.xsys01500101 = value;
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
    public static MxXsys01500101 parse(String xml) {
        return ((MxXsys01500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys01500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxXsys01500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxXsys01500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxXsys01500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys01500101 parse(String xml, MxRead parserImpl) {
        return ((MxXsys01500101) parserImpl.read(MxXsys01500101 .class, xml, _classes));
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
     * Creates an MxXsys01500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys01500101 message
     * @return
     *     a new instance of MxXsys01500101
     */
    public static final MxXsys01500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxXsys01500101 .class);
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
