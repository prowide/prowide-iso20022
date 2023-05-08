
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
 * Class for supl.030.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccaissd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.030.001.06")
public class MxSupl03000106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAISSD1", required = true)
    protected DTCCCAISSD1V06 dtcccaissd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountPrice5 .class, AmountPriceType1Code.class, ContactIdentification5 .class, CorporateActionAcknowledgementSD1 .class, CorporateActionCertificateSD1 .class, DTCCCAISSD1V06 .class, DTCInstructionStatus2Code.class, DTCProtectInstructionStatus3Code.class, DeceasedStatusSD1 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity31Choice.class, InstructionReason4Code.class, InstructionsTransactionsSequence2 .class, MxSupl03000106 .class, PercentagePrice1 .class, PriceFormat63Choice.class, PriceRateType3Code.class, PriceValueType13Code.class, ReorganisationInstructionSD12 .class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SecuritiesQuantitySD9 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.030.001.06";

    public MxSupl03000106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl03000106(final String xml) {
        this();
        MxSupl03000106 tmp = parse(xml);
        dtcccaissd1 = tmp.getDTCCCAISSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl03000106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccaissd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAISSD1V06 }
     *     
     */
    public DTCCCAISSD1V06 getDTCCCAISSD1() {
        return dtcccaissd1;
    }

    /**
     * Sets the value of the dtcccaissd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAISSD1V06 }
     *     
     */
    public MxSupl03000106 setDTCCCAISSD1(DTCCCAISSD1V06 value) {
        this.dtcccaissd1 = value;
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
    public static MxSupl03000106 parse(String xml) {
        return ((MxSupl03000106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03000106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl03000106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl03000106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl03000106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl03000106 parse(String xml, MxRead parserImpl) {
        return ((MxSupl03000106) parserImpl.read(MxSupl03000106 .class, xml, _classes));
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
     * Creates an MxSupl03000106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl03000106 message
     * @return
     *     a new instance of MxSupl03000106
     */
    public static final MxSupl03000106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl03000106 .class);
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
