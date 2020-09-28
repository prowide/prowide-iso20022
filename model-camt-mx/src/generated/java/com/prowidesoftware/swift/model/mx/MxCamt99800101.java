
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
 * Class for camt.998.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt99800101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.998.001.01")
public class MxCamt99800101
    extends AbstractMX
{

    @XmlElement(name = "camt.998.001.01", required = true)
    protected Camt99800101 camt99800101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 998;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Camt99800101 .class, MessageReference.class, MxCamt99800101 .class, ProprietaryData.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.998.001.01";

    public MxCamt99800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt99800101(final String xml) {
        this();
        MxCamt99800101 tmp = parse(xml);
        camt99800101 = tmp.getCamt99800101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt99800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt99800101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt99800101 }
     *     
     */
    public Camt99800101 getCamt99800101() {
        return camt99800101;
    }

    /**
     * Sets the value of the camt99800101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt99800101 }
     *     
     */
    public MxCamt99800101 setCamt99800101(Camt99800101 value) {
        this.camt99800101 = value;
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
    public static MxCamt99800101 parse(String xml) {
        return ((MxCamt99800101) MxReadImpl.parse(MxCamt99800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt99800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt99800101) parserImpl.read(MxCamt99800101 .class, xml, _classes));
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
     * Creates an MxCamt99800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt99800101 message
     * @return
     *     a new instance of MxCamt99800101
     */
    public final static MxCamt99800101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt99800101 .class);
    }

}
