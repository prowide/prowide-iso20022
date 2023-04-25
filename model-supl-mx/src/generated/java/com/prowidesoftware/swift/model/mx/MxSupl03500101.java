
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
 * Class for supl.035.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "eupsd2SCADataSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.035.001.01")
public class MxSupl03500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "EUPSD2SCADataSD1", required = true)
    protected EUPSD2SCADataSD1V01 eupsd2SCADataSD1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 35;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AttestationValue1Code.class, EUPSD2SCADataSD1V01 .class, Exemption1 .class, Exemption2Code.class, MxSupl03500101 .class, StrongCustomerAuthentication1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.035.001.01";

    public MxSupl03500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl03500101(final String xml) {
        this();
        MxSupl03500101 tmp = parse(xml);
        eupsd2SCADataSD1 = tmp.getEUPSD2SCADataSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl03500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the eupsd2SCADataSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link EUPSD2SCADataSD1V01 }
     *     
     */
    public EUPSD2SCADataSD1V01 getEUPSD2SCADataSD1() {
        return eupsd2SCADataSD1;
    }

    /**
     * Sets the value of the eupsd2SCADataSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUPSD2SCADataSD1V01 }
     *     
     */
    public MxSupl03500101 setEUPSD2SCADataSD1(EUPSD2SCADataSD1V01 value) {
        this.eupsd2SCADataSD1 = value;
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
    public static MxSupl03500101 parse(String xml) {
        return ((MxSupl03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl03500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl03500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl03500101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl03500101) parserImpl.read(MxSupl03500101 .class, xml, _classes));
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
     * Creates an MxSupl03500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl03500101 message
     * @return
     *     a new instance of MxSupl03500101
     */
    public static final MxSupl03500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl03500101 .class);
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
