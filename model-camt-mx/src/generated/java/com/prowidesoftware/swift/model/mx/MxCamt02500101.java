
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02500101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.025.001.01")
public class MxCamt02500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.025.001.01", required = true)
    protected Camt02500101 camt02500101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReferences.class, Camt02500101 .class, MessageIdentification.class, MxCamt02500101 .class, PartyIdentification.class, RequestHandling.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.025.001.01";

    public MxCamt02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02500101(final String xml) {
        this();
        MxCamt02500101 tmp = parse(xml);
        camt02500101 = tmp.getCamt02500101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02500101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02500101 }
     *     
     */
    public Camt02500101 getCamt02500101() {
        return camt02500101;
    }

    /**
     * Sets the value of the camt02500101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02500101 }
     *     
     */
    public MxCamt02500101 setCamt02500101(Camt02500101 value) {
        this.camt02500101 = value;
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
    public static MxCamt02500101 parse(String xml) {
        return ((MxCamt02500101) MxReadImpl.parse(MxCamt02500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02500101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02500101) parserImpl.read(MxCamt02500101 .class, xml, _classes));
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
     * Creates an MxCamt02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02500101 message
     * @return
     *     a new instance of MxCamt02500101
     */
    public final static MxCamt02500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02500101 .class);
    }

}
