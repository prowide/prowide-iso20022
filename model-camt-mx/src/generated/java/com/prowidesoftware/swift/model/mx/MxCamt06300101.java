
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
 * Class for camt.063.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "payInSchdlConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.063.001.01")
public class MxCamt06300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PayInSchdlConf", required = true)
    protected PayInScheduleConfirmationV01 payInSchdlConf;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 63;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ConfirmationDetails1 .class, MessageIdentification.class, MxCamt06300101 .class, PayInScheduleConfirmationV01 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.063.001.01";

    public MxCamt06300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06300101(final String xml) {
        this();
        MxCamt06300101 tmp = parse(xml);
        payInSchdlConf = tmp.getPayInSchdlConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the payInSchdlConf property.
     * 
     * @return
     *     possible object is
     *     {@link PayInScheduleConfirmationV01 }
     *     
     */
    public PayInScheduleConfirmationV01 getPayInSchdlConf() {
        return payInSchdlConf;
    }

    /**
     * Sets the value of the payInSchdlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInScheduleConfirmationV01 }
     *     
     */
    public MxCamt06300101 setPayInSchdlConf(PayInScheduleConfirmationV01 value) {
        this.payInSchdlConf = value;
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
    public static MxCamt06300101 parse(String xml) {
        return ((MxCamt06300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt06300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt06300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt06300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06300101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06300101) parserImpl.read(MxCamt06300101 .class, xml, _classes));
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
     * Creates an MxCamt06300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06300101 message
     * @return
     *     a new instance of MxCamt06300101
     */
    public static final MxCamt06300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt06300101 .class);
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
