
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacnsd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.006.001.02")
public class MxSupl00600102
    extends AbstractMX
{

    @XmlElement(name = "DTCCCACNSD1", required = true)
    protected DTCCCACNSD1V02 dtcccacnsd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionCancellationSD1 .class, CorporateActionCancellationSD2 .class, CorporateActionGeneralInformationSD2 .class, CorporateActionNotificationSD1 .class, DTCCCACNSD1V02 .class, DTCCLinkType1Code.class, DTCCSubEventType1Code.class, ExtendedEventType1Code.class, IdentificationSource4Choice.class, MxSupl00600102 .class, OtherIdentification2 .class, SecurityIdentification15 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.006.001.02";

    public MxSupl00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00600102(final String xml) {
        this();
        MxSupl00600102 tmp = parse(xml);
        dtcccacnsd1 = tmp.getDTCCCACNSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacnsd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACNSD1V02 }
     *     
     */
    public DTCCCACNSD1V02 getDTCCCACNSD1() {
        return dtcccacnsd1;
    }

    /**
     * Sets the value of the dtcccacnsd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACNSD1V02 }
     *     
     */
    public MxSupl00600102 setDTCCCACNSD1(DTCCCACNSD1V02 value) {
        this.dtcccacnsd1 = value;
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
    public static MxSupl00600102 parse(String xml) {
        return ((MxSupl00600102) MxReadImpl.parse(MxSupl00600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00600102 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00600102) parserImpl.read(MxSupl00600102 .class, xml, _classes));
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
     * Creates an MxSupl00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00600102 message
     * @return
     *     a new instance of MxSupl00600102
     */
    public final static MxSupl00600102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl00600102 .class);
    }

}
