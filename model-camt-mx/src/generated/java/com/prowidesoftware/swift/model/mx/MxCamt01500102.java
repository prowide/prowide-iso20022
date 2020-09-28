
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
 * Class for camt.015.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "modfyMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.015.001.02")
public class MxCamt01500102
    extends AbstractMX
{

    @XmlElement(name = "ModfyMmb", required = true)
    protected ModifyMemberV02 modfyMmb;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ClearingSystemMemberIdentificationChoice.class, CommunicationAddressDetails.class, ContactIdentificationAndAddress.class, LongPostalAddress1Choice.class, MemberDetails1 .class, MemberIdentificationChoice.class, MessageIdentification.class, ModifyMemberV02 .class, MxCamt01500102 .class, PaymentRole1Code.class, StructuredLongPostalAddress1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.015.001.02";

    public MxCamt01500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01500102(final String xml) {
        this();
        MxCamt01500102 tmp = parse(xml);
        modfyMmb = tmp.getModfyMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the modfyMmb property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyMemberV02 }
     *     
     */
    public ModifyMemberV02 getModfyMmb() {
        return modfyMmb;
    }

    /**
     * Sets the value of the modfyMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyMemberV02 }
     *     
     */
    public MxCamt01500102 setModfyMmb(ModifyMemberV02 value) {
        this.modfyMmb = value;
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
    public static MxCamt01500102 parse(String xml) {
        return ((MxCamt01500102) MxReadImpl.parse(MxCamt01500102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01500102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01500102) parserImpl.read(MxCamt01500102 .class, xml, _classes));
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
     * Creates an MxCamt01500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01500102 message
     * @return
     *     a new instance of MxCamt01500102
     */
    public final static MxCamt01500102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt01500102 .class);
    }

}
