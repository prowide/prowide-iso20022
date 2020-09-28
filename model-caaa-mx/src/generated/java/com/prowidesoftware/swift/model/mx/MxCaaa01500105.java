
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
 * Class for caaa.015.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.015.001.05")
public class MxCaaa01500105
    extends AbstractMX
{

    @XmlElement(name = "AccptrRjctn", required = true)
    protected AcceptorRejectionV05 accptrRjctn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorRejection2 .class, AcceptorRejectionV05 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification94 .class, Header26 .class, MessageFunction9Code.class, MxCaaa01500105 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, PartyType3Code.class, PartyType4Code.class, RejectReason1Code.class, Traceability5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.015.001.05";

    public MxCaaa01500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01500105(final String xml) {
        this();
        MxCaaa01500105 tmp = parse(xml);
        accptrRjctn = tmp.getAccptrRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejectionV05 }
     *     
     */
    public AcceptorRejectionV05 getAccptrRjctn() {
        return accptrRjctn;
    }

    /**
     * Sets the value of the accptrRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejectionV05 }
     *     
     */
    public MxCaaa01500105 setAccptrRjctn(AcceptorRejectionV05 value) {
        this.accptrRjctn = value;
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
    public static MxCaaa01500105 parse(String xml) {
        return ((MxCaaa01500105) MxReadImpl.parse(MxCaaa01500105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01500105 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01500105) parserImpl.read(MxCaaa01500105 .class, xml, _classes));
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
     * Creates an MxCaaa01500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01500105 message
     * @return
     *     a new instance of MxCaaa01500105
     */
    public final static MxCaaa01500105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa01500105 .class);
    }

}
