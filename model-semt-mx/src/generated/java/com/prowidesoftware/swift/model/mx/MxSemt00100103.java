
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
 * Class for semt.001.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMsgRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.001.001.03")
public class MxSemt00100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesMsgRjctn", required = true)
    protected SecuritiesMessageRejectionV03 sctiesMsgRjctn;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, GenericIdentification1 .class, LinkedMessage1Choice.class, MessageIdentification1 .class, MessageRejectedReason1Code.class, MxSemt00100103 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectionReason23 .class, SecuritiesMessageRejectionV03 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:semt.001.001.03";

    public MxSemt00100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00100103(final String xml) {
        this();
        MxSemt00100103 tmp = parse(xml);
        sctiesMsgRjctn = tmp.getSctiesMsgRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMsgRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMessageRejectionV03 }
     *     
     */
    public SecuritiesMessageRejectionV03 getSctiesMsgRjctn() {
        return sctiesMsgRjctn;
    }

    /**
     * Sets the value of the sctiesMsgRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMessageRejectionV03 }
     *     
     */
    public MxSemt00100103 setSctiesMsgRjctn(SecuritiesMessageRejectionV03 value) {
        this.sctiesMsgRjctn = value;
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
    public static MxSemt00100103 parse(String xml) {
        return ((MxSemt00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00100103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00100103) parserImpl.read(MxSemt00100103 .class, xml, _classes));
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
     * Creates an MxSemt00100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00100103 message
     * @return
     *     a new instance of MxSemt00100103
     */
    public static final MxSemt00100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00100103 .class);
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
