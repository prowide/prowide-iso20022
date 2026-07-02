
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
 * Class for supl.025.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccaresd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.025.001.05")
public class MxSupl02500105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCARESD1", required = true)
    protected DTCCCARESD1V05 dtcccaresd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionGeneralInformationSD61 .class, DTCCCARESD1V05 .class, DTCCSubEventType12Code.class, EventGroup3Code.class, FinancialInstrumentAttributesSD20 .class, MxSupl02500105 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.025.001.05";

    public MxSupl02500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl02500105(final String xml) {
        this();
        MxSupl02500105 tmp = parse(xml);
        dtcccaresd1 = tmp.getDTCCCARESD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl02500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccaresd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCARESD1V05 }
     *     
     */
    public DTCCCARESD1V05 getDTCCCARESD1() {
        return dtcccaresd1;
    }

    /**
     * Sets the value of the dtcccaresd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCARESD1V05 }
     *     
     */
    public MxSupl02500105 setDTCCCARESD1(DTCCCARESD1V05 value) {
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
    public static MxSupl02500105 parse(String xml) {
        return ((MxSupl02500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl02500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl02500105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl02500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl02500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl02500105 parse(String xml, MxRead parserImpl) {
        return ((MxSupl02500105) parserImpl.read(MxSupl02500105 .class, xml, _classes));
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
     * Creates an MxSupl02500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl02500105 message
     * @return
     *     a new instance of MxSupl02500105
     */
    public final static MxSupl02500105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl02500105 .class);
    }

}
