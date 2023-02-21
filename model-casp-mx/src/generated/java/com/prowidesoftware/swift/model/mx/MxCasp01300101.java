
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
 * Class for casp.013.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIMsgRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.013.001.01")
public class MxCasp01300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIMsgRjctn", required = true)
    protected SaleToPOIMessageRejectionV01 saleToPOIMsgRjctn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorRejection2 .class, GenericIdentification171 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header37 .class, MxCasp01300101 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, PartyType3Code.class, PartyType4Code.class, RejectReason1Code.class, RetailerMessage1Code.class, SaleToPOIMessageRejectionV01 .class, Traceability6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.013.001.01";

    public MxCasp01300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp01300101(final String xml) {
        this();
        MxCasp01300101 tmp = parse(xml);
        saleToPOIMsgRjctn = tmp.getSaleToPOIMsgRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp01300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIMsgRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIMessageRejectionV01 }
     *     
     */
    public SaleToPOIMessageRejectionV01 getSaleToPOIMsgRjctn() {
        return saleToPOIMsgRjctn;
    }

    /**
     * Sets the value of the saleToPOIMsgRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIMessageRejectionV01 }
     *     
     */
    public MxCasp01300101 setSaleToPOIMsgRjctn(SaleToPOIMessageRejectionV01 value) {
        this.saleToPOIMsgRjctn = value;
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
    public static MxCasp01300101 parse(String xml) {
        return ((MxCasp01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp01300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp01300101 parse(String xml, MxRead parserImpl) {
        return ((MxCasp01300101) parserImpl.read(MxCasp01300101 .class, xml, _classes));
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
     * Creates an MxCasp01300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp01300101 message
     * @return
     *     a new instance of MxCasp01300101
     */
    public final static MxCasp01300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp01300101 .class);
    }

}
