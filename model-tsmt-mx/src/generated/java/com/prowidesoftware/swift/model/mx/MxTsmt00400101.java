
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
 * Class for tsmt.004.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt00400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.004.001.01")
public class MxTsmt00400101
    extends AbstractMX
{

    @XmlElement(name = "tsmt.004.001.01", required = true)
    protected Tsmt00400101 tsmt00400101;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, MessageIdentification1 .class, MxTsmt00400101 .class, Tsmt00400101 .class, UTCOffset1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.004.001.01";

    public MxTsmt00400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00400101(final String xml) {
        this();
        MxTsmt00400101 tmp = parse(xml);
        tsmt00400101 = tmp.getTsmt00400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt00400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt00400101 }
     *     
     */
    public Tsmt00400101 getTsmt00400101() {
        return tsmt00400101;
    }

    /**
     * Sets the value of the tsmt00400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt00400101 }
     *     
     */
    public MxTsmt00400101 setTsmt00400101(Tsmt00400101 value) {
        this.tsmt00400101 = value;
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
    public static MxTsmt00400101 parse(String xml) {
        return ((MxTsmt00400101) MxReadImpl.parse(MxTsmt00400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00400101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00400101) parserImpl.read(MxTsmt00400101 .class, xml, _classes));
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
     * Creates an MxTsmt00400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00400101 message
     * @return
     *     a new instance of MxTsmt00400101
     */
    public final static MxTsmt00400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt00400101 .class);
    }

}
