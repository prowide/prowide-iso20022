
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
 * Class for camt.013.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.013.001.02")
public class MxCamt01300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetMmb", required = true)
    protected GetMemberV02 getMmb;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ClearingSystemMemberIdentificationChoice.class, GetMemberV02 .class, MemberCriteria.class, MemberCriteriaDefinitionChoice.class, MemberIdentificationChoice.class, MemberQueryDefinition2 .class, MemberReturnCriteria.class, MemberSearchCriteria.class, MemberStatus1Code.class, MemberType1Code.class, MessageIdentification.class, MxCamt01300102 .class, QueryType2Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.013.001.02";

    public MxCamt01300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01300102(final String xml) {
        this();
        MxCamt01300102 tmp = parse(xml);
        getMmb = tmp.getGetMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getMmb property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberV02 }
     *     
     */
    public GetMemberV02 getGetMmb() {
        return getMmb;
    }

    /**
     * Sets the value of the getMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberV02 }
     *     
     */
    public MxCamt01300102 setGetMmb(GetMemberV02 value) {
        this.getMmb = value;
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
    public static MxCamt01300102 parse(String xml) {
        return ((MxCamt01300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01300102) parserImpl.read(MxCamt01300102 .class, xml, _classes));
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
     * Creates an MxCamt01300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01300102 message
     * @return
     *     a new instance of MxCamt01300102
     */
    public static final MxCamt01300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01300102 .class);
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
