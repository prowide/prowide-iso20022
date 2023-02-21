
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
 * Class for tsmt.037.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt03700102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.037.001.02")
public class MxTsmt03700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "tsmt.037.001.02", required = true)
    protected Tsmt03700102 tsmt03700102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, BaselineStatus1Code.class, MessageIdentification1 .class, MxTsmt03700102 .class, StatusReportItems1 .class, Tsmt03700102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.037.001.02";

    public MxTsmt03700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt03700102(final String xml) {
        this();
        MxTsmt03700102 tmp = parse(xml);
        tsmt03700102 = tmp.getTsmt03700102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt03700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt03700102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt03700102 }
     *     
     */
    public Tsmt03700102 getTsmt03700102() {
        return tsmt03700102;
    }

    /**
     * Sets the value of the tsmt03700102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt03700102 }
     *     
     */
    public MxTsmt03700102 setTsmt03700102(Tsmt03700102 value) {
        this.tsmt03700102 = value;
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
    public static MxTsmt03700102 parse(String xml) {
        return ((MxTsmt03700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt03700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt03700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt03700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt03700102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt03700102) parserImpl.read(MxTsmt03700102 .class, xml, _classes));
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
     * Creates an MxTsmt03700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt03700102 message
     * @return
     *     a new instance of MxTsmt03700102
     */
    public final static MxTsmt03700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt03700102 .class);
    }

}
