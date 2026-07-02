
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
 * Class for supl.034.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapcsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.034.001.05")
public class MxSupl03400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAPCSD1", required = true)
    protected DTCCCAPCSD1V05 dtcccapcsd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionGeneralInformationSD62 .class, DTCCCAPCSD1V05 .class, DTCCSubEventType11Code.class, EventGroup2Code.class, ExtendedEventType6Code.class, FinancialInstrumentAttributesSD20 .class, MxSupl03400105 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.034.001.05";

    public MxSupl03400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl03400105(final String xml) {
        this();
        MxSupl03400105 tmp = parse(xml);
        dtcccapcsd1 = tmp.getDTCCCAPCSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl03400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapcsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPCSD1V05 }
     *     
     */
    public DTCCCAPCSD1V05 getDTCCCAPCSD1() {
        return dtcccapcsd1;
    }

    /**
     * Sets the value of the dtcccapcsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPCSD1V05 }
     *     
     */
    public MxSupl03400105 setDTCCCAPCSD1(DTCCCAPCSD1V05 value) {
        this.dtcccapcsd1 = value;
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
    public static MxSupl03400105 parse(String xml) {
        return ((MxSupl03400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl03400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl03400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl03400105 parse(String xml, MxRead parserImpl) {
        return ((MxSupl03400105) parserImpl.read(MxSupl03400105 .class, xml, _classes));
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
     * Creates an MxSupl03400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl03400105 message
     * @return
     *     a new instance of MxSupl03400105
     */
    public final static MxSupl03400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl03400105 .class);
    }

}
