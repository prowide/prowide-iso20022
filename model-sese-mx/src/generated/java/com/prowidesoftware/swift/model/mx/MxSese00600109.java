
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
 * Class for sese.006.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfInCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.006.001.09")
public class MxSese00600109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfInCxlReq", required = true)
    protected TransferInCancellationRequestV09 trfInCxlReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, CopyInformation5 .class, GenericIdentification1 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00600109 .class, NameAndAddress5 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, TransferInCancellationRequestV09 .class, TransferInFunction1Code.class, TransferReference15 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.006.001.09";

    public MxSese00600109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00600109(final String xml) {
        this();
        MxSese00600109 tmp = parse(xml);
        trfInCxlReq = tmp.getTrfInCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00600109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfInCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInCancellationRequestV09 }
     *     
     */
    public TransferInCancellationRequestV09 getTrfInCxlReq() {
        return trfInCxlReq;
    }

    /**
     * Sets the value of the trfInCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInCancellationRequestV09 }
     *     
     */
    public MxSese00600109 setTrfInCxlReq(TransferInCancellationRequestV09 value) {
        this.trfInCxlReq = value;
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
    public static MxSese00600109 parse(String xml) {
        return ((MxSese00600109) MxReadImpl.parse(MxSese00600109 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00600109 parse(String xml, MxRead parserImpl) {
        return ((MxSese00600109) parserImpl.read(MxSese00600109 .class, xml, _classes));
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
     * Creates an MxSese00600109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00600109 message
     * @return
     *     a new instance of MxSese00600109
     */
    public final static MxSese00600109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00600109 .class);
    }

}
