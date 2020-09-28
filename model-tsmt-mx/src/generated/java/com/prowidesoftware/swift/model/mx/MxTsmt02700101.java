
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
 * Class for tsmt.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt02700101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.027.001.01")
public class MxTsmt02700101
    extends AbstractMX
{

    @XmlElement(name = "tsmt.027.001.01", required = true)
    protected Tsmt02700101 tsmt02700101;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, BaselineStatus2Code.class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt02700101 .class, SimpleIdentificationInformation.class, TransactionStatus3 .class, Tsmt02700101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.027.001.01";

    public MxTsmt02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02700101(final String xml) {
        this();
        MxTsmt02700101 tmp = parse(xml);
        tsmt02700101 = tmp.getTsmt02700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt02700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt02700101 }
     *     
     */
    public Tsmt02700101 getTsmt02700101() {
        return tsmt02700101;
    }

    /**
     * Sets the value of the tsmt02700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt02700101 }
     *     
     */
    public MxTsmt02700101 setTsmt02700101(Tsmt02700101 value) {
        this.tsmt02700101 = value;
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
    public static MxTsmt02700101 parse(String xml) {
        return ((MxTsmt02700101) MxReadImpl.parse(MxTsmt02700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02700101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02700101) parserImpl.read(MxTsmt02700101 .class, xml, _classes));
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
     * Creates an MxTsmt02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02700101 message
     * @return
     *     a new instance of MxTsmt02700101
     */
    public final static MxTsmt02700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt02700101 .class);
    }

}
