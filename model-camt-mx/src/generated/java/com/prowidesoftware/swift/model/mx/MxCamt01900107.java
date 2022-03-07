
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
 * Class for camt.019.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrBizDayInf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.019.001.07")
public class MxCamt01900107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrBizDayInf", required = true)
    protected ReturnBusinessDayInformationV07 rtrBizDayInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessDay8 .class, BusinessDay9 .class, BusinessDayReportOrError10Choice.class, BusinessDayReportOrError9Choice.class, ClosureReason2Choice.class, DateAndDateTime2Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, ErrorHandling3Choice.class, ErrorHandling5 .class, GenericIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader7 .class, MxCamt01900107 .class, OriginalBusinessQuery1 .class, RequestType4Choice.class, ReturnBusinessDayInformationV07 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemAvailabilityAndEvents3 .class, SystemClosure2 .class, SystemClosureReason1Code.class, SystemEvent3 .class, SystemEventType4Choice.class, SystemIdentification2Choice.class, SystemStatus2Choice.class, SystemStatus2Code.class, SystemStatus3 .class, TimePeriod1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.019.001.07";

    public MxCamt01900107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01900107(final String xml) {
        this();
        MxCamt01900107 tmp = parse(xml);
        rtrBizDayInf = tmp.getRtrBizDayInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01900107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrBizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnBusinessDayInformationV07 }
     *     
     */
    public ReturnBusinessDayInformationV07 getRtrBizDayInf() {
        return rtrBizDayInf;
    }

    /**
     * Sets the value of the rtrBizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnBusinessDayInformationV07 }
     *     
     */
    public MxCamt01900107 setRtrBizDayInf(ReturnBusinessDayInformationV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt01900107 parse(String xml) {
        return ((MxCamt01900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01900107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01900107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01900107) parserImpl.read(MxCamt01900107 .class, xml, _classes));
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
     * Creates an MxCamt01900107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01900107 message
     * @return
     *     a new instance of MxCamt01900107
     */
    public final static MxCamt01900107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01900107 .class);
    }

}
