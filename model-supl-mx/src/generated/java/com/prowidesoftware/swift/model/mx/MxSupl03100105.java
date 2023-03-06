
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
 * Class for supl.031.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccastsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.031.001.05")
public class MxSupl03100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCASTSD1", required = true)
    protected DTCCCASTSD1V05 dtcccastsd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionBalanceSD5 .class, CorporateActionInstructedBalanceOptionBalanceSD3 .class, CorporateActionInstructedBalanceOptionInstructionSD4 .class, CorporateActionInstructedBalanceOptionProtectInstructionSD4 .class, DTCCCASTSD1V05 .class, DTCInstructionStatus2Code.class, DTCProtectInstructionStatus1Code.class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl03100105 .class, OptionNumber1Choice.class, OptionNumber1Code.class, OtherIdentification2 .class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.031.001.05";

    public MxSupl03100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl03100105(final String xml) {
        this();
        MxSupl03100105 tmp = parse(xml);
        dtcccastsd1 = tmp.getDTCCCASTSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl03100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccastsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCASTSD1V05 }
     *     
     */
    public DTCCCASTSD1V05 getDTCCCASTSD1() {
        return dtcccastsd1;
    }

    /**
     * Sets the value of the dtcccastsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCASTSD1V05 }
     *     
     */
    public MxSupl03100105 setDTCCCASTSD1(DTCCCASTSD1V05 value) {
        this.dtcccastsd1 = value;
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
    public static MxSupl03100105 parse(String xml) {
        return ((MxSupl03100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl03100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl03100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl03100105 parse(String xml, MxRead parserImpl) {
        return ((MxSupl03100105) parserImpl.read(MxSupl03100105 .class, xml, _classes));
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
     * Creates an MxSupl03100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl03100105 message
     * @return
     *     a new instance of MxSupl03100105
     */
    public final static MxSupl03100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl03100105 .class);
    }

}
