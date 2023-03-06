
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
 * Class for supl.007.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccanoElgblBalSD1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.007.001.07")
public class MxSupl00700107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCANOElgblBalSD1", required = true)
    protected DTCCCANOEligibleBalanceSD1V07 dtcccanoElgblBalSD1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountBalanceSD10 .class, AccountBalanceSD11 .class, AccountBalanceSD12 .class, AdjustedBalanceTypeSD4Choice.class, CorporateActionGeneralInformationSD30 .class, DTCCCANOEligibleBalanceSD1V07 .class, DTCCSubEventType6Code.class, EventGroup1Code.class, ExtendedEventType6Code.class, FinancialInstrumentAttributesSD17 .class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl00700107 .class, OtherIdentification2 .class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.007.001.07";

    public MxSupl00700107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00700107(final String xml) {
        this();
        MxSupl00700107 tmp = parse(xml);
        dtcccanoElgblBalSD1 = tmp.getDTCCCANOElgblBalSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00700107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccanoElgblBalSD1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCANOEligibleBalanceSD1V07 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V07 getDTCCCANOElgblBalSD1() {
        return dtcccanoElgblBalSD1;
    }

    /**
     * Sets the value of the dtcccanoElgblBalSD1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCANOEligibleBalanceSD1V07 }
     *     
     */
    public MxSupl00700107 setDTCCCANOElgblBalSD1(DTCCCANOEligibleBalanceSD1V07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSupl00700107 parse(String xml) {
        return ((MxSupl00700107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00700107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00700107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00700107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00700107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00700107 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00700107) parserImpl.read(MxSupl00700107 .class, xml, _classes));
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
     * Creates an MxSupl00700107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00700107 message
     * @return
     *     a new instance of MxSupl00700107
     */
    public final static MxSupl00700107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00700107 .class);
    }

}
