
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
 * Class for reda.060.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "netgCutOffRefDataUpdReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.060.001.01")
public class MxReda06000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NetgCutOffRefDataUpdReq", required = true)
    protected NettingCutOffReferenceDataUpdateRequestV01 netgCutOffRefDataUpdReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 60;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, ClearingSystemIdentification2Choice.class, CutOff1 .class, MxReda06000101 .class, NameAndAddress8 .class, NettingCutOff1 .class, NettingCutOffReferenceDataUpdateRequestV01 .class, NettingIdentification1Choice.class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PostalAddress1 .class, RequestData1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.060.001.01";

    public MxReda06000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06000101(final String xml) {
        this();
        MxReda06000101 tmp = parse(xml);
        netgCutOffRefDataUpdReq = tmp.getNetgCutOffRefDataUpdReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the netgCutOffRefDataUpdReq property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReferenceDataUpdateRequestV01 }
     *     
     */
    public NettingCutOffReferenceDataUpdateRequestV01 getNetgCutOffRefDataUpdReq() {
        return netgCutOffRefDataUpdReq;
    }

    /**
     * Sets the value of the netgCutOffRefDataUpdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReferenceDataUpdateRequestV01 }
     *     
     */
    public MxReda06000101 setNetgCutOffRefDataUpdReq(NettingCutOffReferenceDataUpdateRequestV01 value) {
        this.netgCutOffRefDataUpdReq = value;
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
    public static MxReda06000101 parse(String xml) {
        return ((MxReda06000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06000101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06000101) parserImpl.read(MxReda06000101 .class, xml, _classes));
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
     * Creates an MxReda06000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06000101 message
     * @return
     *     a new instance of MxReda06000101
     */
    public static final MxReda06000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06000101 .class);
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
