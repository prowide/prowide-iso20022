
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
 * Class for tsmt.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt00200102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.002.001.02")
public class MxTsmt00200102
    extends AbstractMX
{

    @XmlElement(name = "tsmt.002.001.02", required = true)
    protected Tsmt00200102 tsmt00200102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action1Code.class, Activity1 .class, ActivityDetails1 .class, ActivityReportItems1 .class, BICIdentification1 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt00200102 .class, PendingActivity1 .class, Tsmt00200102 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.002.001.02";

    public MxTsmt00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00200102(final String xml) {
        this();
        MxTsmt00200102 tmp = parse(xml);
        tsmt00200102 = tmp.getTsmt00200102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt00200102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt00200102 }
     *     
     */
    public Tsmt00200102 getTsmt00200102() {
        return tsmt00200102;
    }

    /**
     * Sets the value of the tsmt00200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt00200102 }
     *     
     */
    public MxTsmt00200102 setTsmt00200102(Tsmt00200102 value) {
        this.tsmt00200102 = value;
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
    public static MxTsmt00200102 parse(String xml) {
        return ((MxTsmt00200102) MxReadImpl.parse(MxTsmt00200102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00200102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00200102) parserImpl.read(MxTsmt00200102 .class, xml, _classes));
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
     * Creates an MxTsmt00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00200102 message
     * @return
     *     a new instance of MxTsmt00200102
     */
    public final static MxTsmt00200102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt00200102 .class);
    }

}
