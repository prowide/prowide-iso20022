
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
 * Class for supl.008.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccainsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.008.001.03")
public class MxSupl00800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAINSD1", required = true)
    protected DTCCCAINSD1V03 dtcccainsd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {DTCCCAINSD1V03 .class, FinancialInstrumentQuantity15Choice.class, MxSupl00800103 .class, OptionalDividendAccountQuantitySD2 .class, OriginalAndCurrentQuantities4 .class, Quantity1Code.class, Quantity40Choice.class, SecuritiesQuantityDetailsSD1 .class, TaxExemptQuantitySD1 .class, WireInstructionSD2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.008.001.03";

    public MxSupl00800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00800103(final String xml) {
        this();
        MxSupl00800103 tmp = parse(xml);
        dtcccainsd1 = tmp.getDTCCCAINSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccainsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAINSD1V03 }
     *     
     */
    public DTCCCAINSD1V03 getDTCCCAINSD1() {
        return dtcccainsd1;
    }

    /**
     * Sets the value of the dtcccainsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAINSD1V03 }
     *     
     */
    public MxSupl00800103 setDTCCCAINSD1(DTCCCAINSD1V03 value) {
        this.dtcccainsd1 = value;
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
    public static MxSupl00800103 parse(String xml) {
        return ((MxSupl00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00800103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00800103 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00800103) parserImpl.read(MxSupl00800103 .class, xml, _classes));
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
     * Creates an MxSupl00800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00800103 message
     * @return
     *     a new instance of MxSupl00800103
     */
    public static final MxSupl00800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00800103 .class);
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
