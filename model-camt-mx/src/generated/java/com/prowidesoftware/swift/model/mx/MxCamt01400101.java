
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
 * Class for camt.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt01400101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.014.001.01")
public class MxCamt01400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.014.001.01", required = true)
    protected Camt01400101 camt01400101;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationAndName.class, Camt01400101 .class, ClearingSystemMemberIdentificationChoice.class, CommunicationAddressDetails.class, ContactIdentificationAndAddress.class, ErrorHandling2 .class, LongPostalAddress1Choice.class, MemberDetails.class, MemberIdentificationChoice.class, MemberInformation.class, MemberReport.class, MemberStatus1Code.class, MemberType1Code.class, MessageIdentification.class, MxCamt01400101 .class, PaymentRole1Code.class, QueryReference.class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.014.001.01";

    public MxCamt01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01400101(final String xml) {
        this();
        MxCamt01400101 tmp = parse(xml);
        camt01400101 = tmp.getCamt01400101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt01400101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt01400101 }
     *     
     */
    public Camt01400101 getCamt01400101() {
        return camt01400101;
    }

    /**
     * Sets the value of the camt01400101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt01400101 }
     *     
     */
    public MxCamt01400101 setCamt01400101(Camt01400101 value) {
        this.camt01400101 = value;
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
    public static MxCamt01400101 parse(String xml) {
        return ((MxCamt01400101) MxReadImpl.parse(MxCamt01400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01400101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01400101) parserImpl.read(MxCamt01400101 .class, xml, _classes));
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
     * Creates an MxCamt01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01400101 message
     * @return
     *     a new instance of MxCamt01400101
     */
    public final static MxCamt01400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01400101 .class);
    }

}
