
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
 * Class for semt.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesMsgRjctnV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.001.001.02")
public class MxSemt00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesMsgRjctnV02", required = true)
    protected SecuritiesMessageRejectionV02 sctiesMsgRjctnV02;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference3 .class, AddressType2Code.class, GenericIdentification1 .class, MessageIdentification1 .class, MessageRejectedReason1Code.class, MxSemt00100102 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectionReason3 .class, SecuritiesMessageRejectionV02 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.001.001.02";

    public MxSemt00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00100102(final String xml) {
        this();
        MxSemt00100102 tmp = parse(xml);
        sctiesMsgRjctnV02 = tmp.getSctiesMsgRjctnV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesMsgRjctnV02 property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMessageRejectionV02 }
     *     
     */
    public SecuritiesMessageRejectionV02 getSctiesMsgRjctnV02() {
        return sctiesMsgRjctnV02;
    }

    /**
     * Sets the value of the sctiesMsgRjctnV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMessageRejectionV02 }
     *     
     */
    public MxSemt00100102 setSctiesMsgRjctnV02(SecuritiesMessageRejectionV02 value) {
        this.sctiesMsgRjctnV02 = value;
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
    public static MxSemt00100102 parse(String xml) {
        return ((MxSemt00100102) MxReadImpl.parse(MxSemt00100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00100102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00100102) parserImpl.read(MxSemt00100102 .class, xml, _classes));
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
     * Creates an MxSemt00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00100102 message
     * @return
     *     a new instance of MxSemt00100102
     */
    public final static MxSemt00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00100102 .class);
    }

}
