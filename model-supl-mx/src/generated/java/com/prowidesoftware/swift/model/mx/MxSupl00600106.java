
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
 * Class for supl.006.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacnsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.006.001.06")
public class MxSupl00600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCACNSD1", required = true)
    protected DTCCCACNSD1V06 dtcccacnsd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CorporateActionCancellationSD1 .class, CorporateActionCancellationSD2 .class, CorporateActionGeneralInformationSD24 .class, CorporateActionNotificationSD1 .class, DTCCCACNSD1V06 .class, DTCCLinkType1Code.class, DTCCSubEventType5Code.class, ExtendedEventType4Code.class, IdentificationSource4Choice.class, MxSupl00600106 .class, OtherIdentification2 .class, SecurityIdentification15 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.006.001.06";

    public MxSupl00600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00600106(final String xml) {
        this();
        MxSupl00600106 tmp = parse(xml);
        dtcccacnsd1 = tmp.getDTCCCACNSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacnsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACNSD1V06 }
     *     
     */
    public DTCCCACNSD1V06 getDTCCCACNSD1() {
        return dtcccacnsd1;
    }

    /**
     * Sets the value of the dtcccacnsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACNSD1V06 }
     *     
     */
    public MxSupl00600106 setDTCCCACNSD1(DTCCCACNSD1V06 value) {
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
    public static MxSupl00600106 parse(String xml) {
        return ((MxSupl00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00600106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00600106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00600106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00600106 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00600106) parserImpl.read(MxSupl00600106 .class, xml, _classes));
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
     * Creates an MxSupl00600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00600106 message
     * @return
     *     a new instance of MxSupl00600106
     */
    public static final MxSupl00600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00600106 .class);
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
