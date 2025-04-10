
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
 * Class for camt.025.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rct"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.025.001.02")
public class MxCamt02500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "Rct", required = true)
    protected ReceiptV02 rct;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 25;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReferences.class, MessageIdentification.class, MxCamt02500102 .class, PartyIdentification.class, ReceiptDetails1 .class, ReceiptV02 .class, RequestHandling.class, RequestType1Choice.class, RequestType1Code.class, RequestType2Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.025.001.02";

    public MxCamt02500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02500102(final String xml) {
        this();
        MxCamt02500102 tmp = parse(xml);
        rct = tmp.getRct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rct property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptV02 }
     *     
     */
    public ReceiptV02 getRct() {
        return rct;
    }

    /**
     * Sets the value of the rct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptV02 }
     *     
     */
    public MxCamt02500102 setRct(ReceiptV02 value) {
        this.rct = value;
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
    public static MxCamt02500102 parse(String xml) {
        return ((MxCamt02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02500102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02500102) parserImpl.read(MxCamt02500102 .class, xml, _classes));
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
     * Creates an MxCamt02500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02500102 message
     * @return
     *     a new instance of MxCamt02500102
     */
    public static final MxCamt02500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02500102 .class);
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
