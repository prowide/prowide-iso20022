
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
 * Class for supl.006.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacnsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.006.001.10")
public class MxSupl00600110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCACNSD1", required = true)
    protected DTCCCACNSD1V10 dtcccacnsd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CorporateActionCancellationSD3 .class, CorporateActionCancellationSD4 .class, CorporateActionGeneralInformationSD40 .class, CorporateActionNotificationSD10 .class, DTCCCACNSD1V10 .class, DTCCLinkType1Code.class, DTCCSubEventType8Code.class, EventGroup4Code.class, ExtendedEventType6Code.class, FinancialInstrumentAttributesSD20 .class, IdentificationSource4Choice.class, MxSupl00600110 .class, OtherIdentification2 .class, Pagination1 .class, SecurityIdentification20 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.006.001.10";

    public MxSupl00600110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00600110(final String xml) {
        this();
        MxSupl00600110 tmp = parse(xml);
        dtcccacnsd1 = tmp.getDTCCCACNSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00600110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacnsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACNSD1V10 }
     *     
     */
    public DTCCCACNSD1V10 getDTCCCACNSD1() {
        return dtcccacnsd1;
    }

    /**
     * Sets the value of the dtcccacnsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACNSD1V10 }
     *     
     */
    public MxSupl00600110 setDTCCCACNSD1(DTCCCACNSD1V10 value) {
        this.dtcccacnsd1 = value;
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
    public static MxSupl00600110 parse(String xml) {
        return ((MxSupl00600110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00600110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00600110 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00600110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00600110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00600110 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00600110) parserImpl.read(MxSupl00600110 .class, xml, _classes));
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
     * Creates an MxSupl00600110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00600110 message
     * @return
     *     a new instance of MxSupl00600110
     */
    public static final MxSupl00600110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00600110 .class);
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
