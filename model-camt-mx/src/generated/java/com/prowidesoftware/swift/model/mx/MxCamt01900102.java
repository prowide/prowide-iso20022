
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
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
 * Class for camt.019.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01900102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.019.001.02")
public class MxCamt01900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.019.001.02", required = true)
    protected Camt01900102 camt01900102;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {BusinessDayInformation1 .class, BusinessDayInformationDetails1 .class, BusinessDayInformationReport1 .class, Camt01900102 .class, CashClearingSystem1Code.class, ClosureReasonChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, ErrorHandling2 .class, MessageIdentification.class, MxCamt01900102 .class, QueryReference.class, SystemAvailabilityAndEventsDetails1 .class, SystemClosureDetails.class, SystemClosureReason1Code.class, SystemEvent1 .class, SystemEventType1Choice.class, SystemEventType2Code.class, SystemIdentificationChoice.class, SystemStatus2Code.class, SystemStatusDetails1 .class, TimePeriodDetails.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.019.001.02";

    public MxCamt01900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01900102(final String xml) {
        this();
        MxCamt01900102 tmp = parse(xml);
        camt01900102 = tmp.getCamt01900102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01900102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01900102 }
     *     
     */
    public Camt01900102 getCamt01900102() {
        return camt01900102;
    }

    /**
     * Sets the value of the camt01900102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01900102 }
     *     
     */
    public MxCamt01900102 setCamt01900102(Camt01900102 value) {
        this.camt01900102 = value;
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
    public static MxCamt01900102 parse(String xml) {
        return ((MxCamt01900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01900102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01900102) parserImpl.read(MxCamt01900102 .class, xml, _classes));
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
     * Creates an MxCamt01900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01900102 message
     * @return
     *     a new instance of MxCamt01900102
     */
    public static final MxCamt01900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01900102 .class);
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
