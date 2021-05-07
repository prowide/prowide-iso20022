
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
 * Class for camt.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.014.001.02")
public class MxCamt01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrMmb", required = true)
    protected ReturnMemberV02 rtrMmb;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationAndName.class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddressDetails.class, ContactIdentificationAndAddress.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, LongPostalAddress1Choice.class, MemberDetails.class, MemberIdentificationChoice.class, MemberInformation2 .class, MemberReport2 .class, MemberStatus1Code.class, MemberType1Code.class, MessageIdentification.class, MxCamt01400102 .class, PaymentRole1Code.class, QueryReference.class, ReturnMemberV02 .class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.014.001.02";

    public MxCamt01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01400102(final String xml) {
        this();
        MxCamt01400102 tmp = parse(xml);
        rtrMmb = tmp.getRtrMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMemberV02 }
     *     
     */
    public ReturnMemberV02 getRtrMmb() {
        return rtrMmb;
    }

    /**
     * Sets the value of the rtrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMemberV02 }
     *     
     */
    public MxCamt01400102 setRtrMmb(ReturnMemberV02 value) {
        this.rtrMmb = value;
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
    public static MxCamt01400102 parse(String xml) {
        return ((MxCamt01400102) MxReadImpl.parse(MxCamt01400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01400102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01400102) parserImpl.read(MxCamt01400102 .class, xml, _classes));
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
     * Creates an MxCamt01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01400102 message
     * @return
     *     a new instance of MxCamt01400102
     */
    public final static MxCamt01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01400102 .class);
    }

}
