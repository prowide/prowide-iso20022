
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
 * Class for reda.060.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "netgCutOffRefDataUpdReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.060.001.02")
public class MxReda06000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NetgCutOffRefDataUpdReq", required = true)
    protected NettingCutOffReferenceDataUpdateRequestV02 netgCutOffRefDataUpdReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 60;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, ClearingSystemIdentification2Choice.class, CutOff1 .class, MxReda06000102 .class, NameAndAddress8 .class, NettingCutOff2 .class, NettingCutOffReferenceDataUpdateRequestV02 .class, NettingIdentification2Choice.class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PostalAddress1 .class, RequestData2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.060.001.02";

    public MxReda06000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06000102(final String xml) {
        this();
        MxReda06000102 tmp = parse(xml);
        netgCutOffRefDataUpdReq = tmp.getNetgCutOffRefDataUpdReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the netgCutOffRefDataUpdReq property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReferenceDataUpdateRequestV02 }
     *     
     */
    public NettingCutOffReferenceDataUpdateRequestV02 getNetgCutOffRefDataUpdReq() {
        return netgCutOffRefDataUpdReq;
    }

    /**
     * Sets the value of the netgCutOffRefDataUpdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReferenceDataUpdateRequestV02 }
     *     
     */
    public MxReda06000102 setNetgCutOffRefDataUpdReq(NettingCutOffReferenceDataUpdateRequestV02 value) {
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
    public static MxReda06000102 parse(String xml) {
        return ((MxReda06000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06000102 parse(String xml, MxRead parserImpl) {
        return ((MxReda06000102) parserImpl.read(MxReda06000102 .class, xml, _classes));
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
     * Creates an MxReda06000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06000102 message
     * @return
     *     a new instance of MxReda06000102
     */
    public static final MxReda06000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06000102 .class);
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
