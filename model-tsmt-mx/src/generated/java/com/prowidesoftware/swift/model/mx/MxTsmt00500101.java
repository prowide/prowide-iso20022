
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt00500101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.005.001.01")
public class MxTsmt00500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.005.001.01", required = true)
    protected Tsmt00500101 tsmt00500101;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, Count1 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt00500101 .class, SimpleIdentificationInformation.class, Tsmt00500101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.005.001.01";

    public MxTsmt00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00500101(final String xml) {
        this();
        MxTsmt00500101 tmp = parse(xml);
        tsmt00500101 = tmp.getTsmt00500101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt00500101 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt00500101 }
     *     
     */
    public Tsmt00500101 getTsmt00500101() {
        return tsmt00500101;
    }

    /**
     * Sets the value of the tsmt00500101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt00500101 }
     *     
     */
    public MxTsmt00500101 setTsmt00500101(Tsmt00500101 value) {
        this.tsmt00500101 = value;
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
    public static MxTsmt00500101 parse(String xml) {
        return ((MxTsmt00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt00500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00500101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00500101) parserImpl.read(MxTsmt00500101 .class, xml, _classes));
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
     * Creates an MxTsmt00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00500101 message
     * @return
     *     a new instance of MxTsmt00500101
     */
    public final static MxTsmt00500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt00500101 .class);
    }

}
