
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
 * Class for caaa.015.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.015.001.04")
public class MxCaaa01500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrRjctn", required = true)
    protected AcceptorRejectionV04 accptrRjctn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorRejection2 .class, AcceptorRejectionV04 .class, GenericIdentification53 .class, GenericIdentification76 .class, Header13 .class, MessageFunction4Code.class, MxCaaa01500104 .class, PartyType3Code.class, PartyType4Code.class, RejectReason1Code.class, Traceability2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.015.001.04";

    public MxCaaa01500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01500104(final String xml) {
        this();
        MxCaaa01500104 tmp = parse(xml);
        accptrRjctn = tmp.getAccptrRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorRejectionV04 }
     *     
     */
    public AcceptorRejectionV04 getAccptrRjctn() {
        return accptrRjctn;
    }

    /**
     * Sets the value of the accptrRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorRejectionV04 }
     *     
     */
    public MxCaaa01500104 setAccptrRjctn(AcceptorRejectionV04 value) {
        this.accptrRjctn = value;
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
    public static MxCaaa01500104 parse(String xml) {
        return ((MxCaaa01500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01500104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01500104) parserImpl.read(MxCaaa01500104 .class, xml, _classes));
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
     * Creates an MxCaaa01500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01500104 message
     * @return
     *     a new instance of MxCaaa01500104
     */
    public static final MxCaaa01500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01500104 .class);
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
