
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
 * Class for tsmt.020.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt02000101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.020.001.01")
public class MxTsmt02000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.020.001.01", required = true)
    protected Tsmt02000101 tsmt02000101;
    public static final transient String BUSINESS_PROCESS = "tsmt";
    public static final transient int FUNCTIONALITY = 20;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {BICIdentification1 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt02000101 .class, SimpleIdentificationInformation.class, Tsmt02000101 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:tsmt.020.001.01";

    public MxTsmt02000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02000101(final String xml) {
        this();
        MxTsmt02000101 tmp = parse(xml);
        tsmt02000101 = tmp.getTsmt02000101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt02000101 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt02000101 }
     *     
     */
    public Tsmt02000101 getTsmt02000101() {
        return tsmt02000101;
    }

    /**
     * Sets the value of the tsmt02000101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt02000101 }
     *     
     */
    public MxTsmt02000101 setTsmt02000101(Tsmt02000101 value) {
        this.tsmt02000101 = value;
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
    public static MxTsmt02000101 parse(String xml) {
        return ((MxTsmt02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt02000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt02000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt02000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02000101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02000101) parserImpl.read(MxTsmt02000101 .class, xml, _classes));
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
     * Creates an MxTsmt02000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02000101 message
     * @return
     *     a new instance of MxTsmt02000101
     */
    public static final MxTsmt02000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt02000101 .class);
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
