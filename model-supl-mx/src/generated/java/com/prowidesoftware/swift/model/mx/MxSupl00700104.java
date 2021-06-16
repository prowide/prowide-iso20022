
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.007.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoElgblBalSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.007.001.04")
public class MxSupl00700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOElgblBalSD1", required = true)
    protected DTCCCANOEligibleBalanceSD1V04 dtcccanoElgblBalSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountBalanceSD6 .class, AccountBalanceSD7 .class, AdjustedBalanceTypeSD3Choice.class, CorporateActionGeneralInformationSD14 .class, DTCCCANOEligibleBalanceSD1V04 .class, FinancialInstrumentAttributesSD9 .class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl00700104 .class, OtherIdentification2 .class, ShortLong1Code.class, SignedQuantityFormat4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.007.001.04";

    public MxSupl00700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00700104(final String xml) {
        this();
        MxSupl00700104 tmp = parse(xml);
        dtcccanoElgblBalSD1 = tmp.getDTCCCANOElgblBalSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoElgblBalSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOEligibleBalanceSD1V04 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V04 getDTCCCANOElgblBalSD1() {
        return dtcccanoElgblBalSD1;
    }

    /**
     * Sets the value of the dtcccanoElgblBalSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOEligibleBalanceSD1V04 }
     *     
     */
    public MxSupl00700104 setDTCCCANOElgblBalSD1(DTCCCANOEligibleBalanceSD1V04 value) {
        this.dtcccanoElgblBalSD1 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSupl00700104 parse(String xml) {
        return ((MxSupl00700104) MxReadImpl.parse(MxSupl00700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00700104 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00700104) parserImpl.read(MxSupl00700104 .class, xml, _classes));
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
     * Creates an MxSupl00700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00700104 message
     * @return
     *     a new instance of MxSupl00700104
     */
    public final static MxSupl00700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00700104 .class);
    }

}
