
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
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
 * Class for camt.018.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getBizDayInf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.018.001.05")
public class MxCamt01800105
    extends AbstractMX
{

    @XmlElement(name = "GetBizDayInf", required = true)
    protected GetBusinessDayInformationV05 getBizDayInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessDayCriteria2 .class, BusinessDayCriteria3Choice.class, BusinessDayQuery2 .class, BusinessDayReturnCriteria2 .class, BusinessDaySearchCriteria2 .class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, GenericIdentification1 .class, GetBusinessDayInformationV05 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader9 .class, MxCamt01800105 .class, QueryType2Code.class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemEventType2Choice.class, SystemEventType2Code.class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.018.001.05";

    public MxCamt01800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01800105(final String xml) {
        this();
        MxCamt01800105 tmp = parse(xml);
        getBizDayInf = tmp.getGetBizDayInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getBizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link GetBusinessDayInformationV05 }
     *     
     */
    public GetBusinessDayInformationV05 getGetBizDayInf() {
        return getBizDayInf;
    }

    /**
     * Sets the value of the getBizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBusinessDayInformationV05 }
     *     
     */
    public MxCamt01800105 setGetBizDayInf(GetBusinessDayInformationV05 value) {
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
    public static MxCamt01800105 parse(String xml) {
        return ((MxCamt01800105) MxReadImpl.parse(MxCamt01800105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01800105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01800105) parserImpl.read(MxCamt01800105 .class, xml, _classes));
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
     * Creates an MxCamt01800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01800105 message
     * @return
     *     a new instance of MxCamt01800105
     */
    public final static MxCamt01800105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt01800105 .class);
    }

}
