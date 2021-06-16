
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
 * Class for cbrf.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptcptNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.011.001.01")
public class MxCbrf01100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtcptNtfctn", required = true)
    protected ParticipantNotificationV01 ptcptNtfctn;
    public final static transient String BUSINESS_PROCESS = "cbrf";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {MessageHeader1 .class, MxCbrf01100101 .class, ParticipantNotificationV01 .class };
    public final static transient String NAMESPACE = "urn:cbrf:xsd:cbrf.011.001.01";

    public MxCbrf01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf01100101(final String xml) {
        this();
        MxCbrf01100101 tmp = parse(xml);
        ptcptNtfctn = tmp.getPtcptNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptcptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantNotificationV01 }
     *     
     */
    public ParticipantNotificationV01 getPtcptNtfctn() {
        return ptcptNtfctn;
    }

    /**
     * Sets the value of the ptcptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantNotificationV01 }
     *     
     */
    public MxCbrf01100101 setPtcptNtfctn(ParticipantNotificationV01 value) {
        this.ptcptNtfctn = value;
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
    public static MxCbrf01100101 parse(String xml) {
        return ((MxCbrf01100101) MxReadImpl.parse(MxCbrf01100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf01100101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf01100101) parserImpl.read(MxCbrf01100101 .class, xml, _classes));
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
     * Creates an MxCbrf01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf01100101 message
     * @return
     *     a new instance of MxCbrf01100101
     */
    public final static MxCbrf01100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf01100101 .class);
    }

}
