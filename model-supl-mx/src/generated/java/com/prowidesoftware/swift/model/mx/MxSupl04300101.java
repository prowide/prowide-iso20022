
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
 * Class for supl.043.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mltplFXSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.043.001.01")
public class MxSupl04300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MltplFXSD1", required = true)
    protected MultipleForeignExchangeSD1V01 mltplFXSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AmountType4Choice.class, EquivalentAmount2 .class, ExchangeRateInformation3 .class, ExchangeRateType4Code.class, FXSupplementaryData1 .class, MultipleForeignExchangeSD1V01 .class, MxSupl04300101 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.043.001.01";

    public MxSupl04300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl04300101(final String xml) {
        this();
        MxSupl04300101 tmp = parse(xml);
        mltplFXSD1 = tmp.getMltplFXSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl04300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mltplFXSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleForeignExchangeSD1V01 }
     *     
     */
    public MultipleForeignExchangeSD1V01 getMltplFXSD1() {
        return mltplFXSD1;
    }

    /**
     * Sets the value of the mltplFXSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleForeignExchangeSD1V01 }
     *     
     */
    public MxSupl04300101 setMltplFXSD1(MultipleForeignExchangeSD1V01 value) {
        this.mltplFXSD1 = value;
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
    public static MxSupl04300101 parse(String xml) {
        return ((MxSupl04300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl04300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl04300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl04300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl04300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl04300101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl04300101) parserImpl.read(MxSupl04300101 .class, xml, _classes));
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
     * Creates an MxSupl04300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl04300101 message
     * @return
     *     a new instance of MxSupl04300101
     */
    public final static MxSupl04300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl04300101 .class);
    }

}
