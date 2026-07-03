
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cbrf.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "comChrtcsModReq"
})
@XmlRootElement(name = "Document", namespace = "urn:cbrf:xsd:cbrf.003.001.01")
public class MxCbrf00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ComChrtcsModReq", required = true)
    protected CommunicationCharacteristicsModificationRequestV01 comChrtcsModReq;
    public final static transient String BUSINESS_PROCESS = "cbrf";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CommunicationChannel1Choice.class, CommunicationCharacteristicsModificationRequestV01 .class, MessageHeader1 .class, MxCbrf00300101 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:cbrf:xsd:cbrf.003.001.01";

    public MxCbrf00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCbrf00300101(final String xml) {
        this();
        MxCbrf00300101 tmp = parse(xml);
        comChrtcsModReq = tmp.getComChrtcsModReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCbrf00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the comChrtcsModReq property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationCharacteristicsModificationRequestV01 }
     *     
     */
    public CommunicationCharacteristicsModificationRequestV01 getComChrtcsModReq() {
        return comChrtcsModReq;
    }

    /**
     * Sets the value of the comChrtcsModReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationCharacteristicsModificationRequestV01 }
     *     
     */
    public MxCbrf00300101 setComChrtcsModReq(CommunicationCharacteristicsModificationRequestV01 value) {
        this.comChrtcsModReq = value;
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
    public static MxCbrf00300101 parse(String xml) {
        return ((MxCbrf00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCbrf00300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCbrf00300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCbrf00300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCbrf00300101 parse(String xml, MxRead parserImpl) {
        return ((MxCbrf00300101) parserImpl.read(MxCbrf00300101 .class, xml, _classes));
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
     * Creates an MxCbrf00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCbrf00300101 message
     * @return
     *     a new instance of MxCbrf00300101
     */
    public final static MxCbrf00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCbrf00300101 .class);
    }

}
