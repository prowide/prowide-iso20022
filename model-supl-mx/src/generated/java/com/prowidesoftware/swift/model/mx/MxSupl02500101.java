
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccaresd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.025.001.01")
public class MxSupl02500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCARESD1", required = true)
    protected DTCCCARESD1V01 dtcccaresd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionEventStage4Code.class, CorporateActionSD12 .class, DTCCCARESD1V01 .class, MxSupl02500101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.025.001.01";

    public MxSupl02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl02500101(final String xml) {
        this();
        MxSupl02500101 tmp = parse(xml);
        dtcccaresd1 = tmp.getDTCCCARESD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccaresd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCARESD1V01 }
     *     
     */
    public DTCCCARESD1V01 getDTCCCARESD1() {
        return dtcccaresd1;
    }

    /**
     * Sets the value of the dtcccaresd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCARESD1V01 }
     *     
     */
    public MxSupl02500101 setDTCCCARESD1(DTCCCARESD1V01 value) {
        this.dtcccaresd1 = value;
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
    public static MxSupl02500101 parse(String xml) {
        return ((MxSupl02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl02500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl02500101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl02500101) parserImpl.read(MxSupl02500101 .class, xml, _classes));
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
     * Creates an MxSupl02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl02500101 message
     * @return
     *     a new instance of MxSupl02500101
     */
    public final static MxSupl02500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl02500101 .class);
    }

}
