
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
 * Class for camt.018.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getBizDayInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.018.001.03")
public class MxCamt01800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetBizDayInf", required = true)
    protected GetBusinessDayInformationV03 getBizDayInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessDayCriteria1 .class, BusinessDayCriteria2Choice.class, BusinessDayQuery1 .class, BusinessDayReturnCriteria2 .class, BusinessDaySearchCriteria1 .class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, GenericIdentification1 .class, GetBusinessDayInformationV03 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader2 .class, MxCamt01800103 .class, QueryType2Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SystemEventType2Choice.class, SystemEventType2Code.class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.018.001.03";

    public MxCamt01800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01800103(final String xml) {
        this();
        MxCamt01800103 tmp = parse(xml);
        getBizDayInf = tmp.getGetBizDayInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getBizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link GetBusinessDayInformationV03 }
     *     
     */
    public GetBusinessDayInformationV03 getGetBizDayInf() {
        return getBizDayInf;
    }

    /**
     * Sets the value of the getBizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBusinessDayInformationV03 }
     *     
     */
    public MxCamt01800103 setGetBizDayInf(GetBusinessDayInformationV03 value) {
        this.getBizDayInf = value;
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
    public static MxCamt01800103 parse(String xml) {
        return ((MxCamt01800103) MxReadImpl.parse(MxCamt01800103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01800103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01800103) parserImpl.read(MxCamt01800103 .class, xml, _classes));
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
     * Creates an MxCamt01800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01800103 message
     * @return
     *     a new instance of MxCamt01800103
     */
    public final static MxCamt01800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01800103 .class);
    }

}
