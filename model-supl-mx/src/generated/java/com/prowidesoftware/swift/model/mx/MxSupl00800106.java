
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
 * Class for supl.008.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccainsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.008.001.06")
public class MxSupl00800106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAINSD1", required = true)
    protected DTCCCAINSD1V06 dtcccainsd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ContactIdentification5 .class, CorporateActionAcknowledgementSD1 .class, CorporateActionCertificateSD1 .class, DTCCCAINSD1V06 .class, DeceasedStatusSD1 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity31Choice.class, FinancialInstrumentQuantity4 .class, InstructionsTransactionsSequence1 .class, MxSupl00800106 .class, OptionalDividendAccountQuantitySD3 .class, ReorganisationInstructionSD10 .class, ReorganisationTransactionType2Code.class, RestrictedFINActiveCurrencyAndAmount.class, TaxCategory2 .class, TaxExemptQuantitySD2 .class, WireInstructionSD3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.008.001.06";

    public MxSupl00800106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00800106(final String xml) {
        this();
        MxSupl00800106 tmp = parse(xml);
        dtcccainsd1 = tmp.getDTCCCAINSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00800106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccainsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAINSD1V06 }
     *     
     */
    public DTCCCAINSD1V06 getDTCCCAINSD1() {
        return dtcccainsd1;
    }

    /**
     * Sets the value of the dtcccainsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAINSD1V06 }
     *     
     */
    public MxSupl00800106 setDTCCCAINSD1(DTCCCAINSD1V06 value) {
        this.dtcccainsd1 = value;
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
    public static MxSupl00800106 parse(String xml) {
        return ((MxSupl00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00800106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00800106 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00800106) parserImpl.read(MxSupl00800106 .class, xml, _classes));
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
     * Creates an MxSupl00800106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00800106 message
     * @return
     *     a new instance of MxSupl00800106
     */
    public final static MxSupl00800106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00800106 .class);
    }

}
