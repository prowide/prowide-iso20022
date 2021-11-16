
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
 * Class for camt.019.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrBizDayInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.019.001.04")
public class MxCamt01900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrBizDayInf", required = true)
    protected ReturnBusinessDayInformationV04 rtrBizDayInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessDay1 .class, BusinessDay2 .class, BusinessDayReportOrError1Choice.class, BusinessDayReportOrError2Choice.class, ClosureReason2Choice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, GenericIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader3 .class, MxCamt01900104 .class, OriginalBusinessQuery1 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnBusinessDayInformationV04 .class, SystemAvailabilityAndEvents1 .class, SystemClosure1 .class, SystemClosureReason1Code.class, SystemEvent2 .class, SystemEventType2Choice.class, SystemEventType2Code.class, SystemIdentification2Choice.class, SystemStatus1 .class, SystemStatus1Choice.class, SystemStatus2Code.class, TimePeriodDetails.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.019.001.04";

    public MxCamt01900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01900104(final String xml) {
        this();
        MxCamt01900104 tmp = parse(xml);
        rtrBizDayInf = tmp.getRtrBizDayInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrBizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnBusinessDayInformationV04 }
     *     
     */
    public ReturnBusinessDayInformationV04 getRtrBizDayInf() {
        return rtrBizDayInf;
    }

    /**
     * Sets the value of the rtrBizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnBusinessDayInformationV04 }
     *     
     */
    public MxCamt01900104 setRtrBizDayInf(ReturnBusinessDayInformationV04 value) {
        this.rtrBizDayInf = value;
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
    public static MxCamt01900104 parse(String xml) {
        return ((MxCamt01900104) MxReadImpl.parse(MxCamt01900104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01900104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01900104) parserImpl.read(MxCamt01900104 .class, xml, _classes));
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
     * Creates an MxCamt01900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01900104 message
     * @return
     *     a new instance of MxCamt01900104
     */
    public final static MxCamt01900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01900104 .class);
    }

}
