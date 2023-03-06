
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
 * Class for camt.014.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.014.001.05")
public class MxCamt01400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrMmb", required = true)
    protected ReturnMemberV05 rtrMmb;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationAddress10 .class, ContactIdentificationAndAddress2 .class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, FinancialIdentificationSchemeName1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, LongPostalAddress1Choice.class, Member7 .class, MemberIdentification3Choice.class, MemberReport6 .class, MemberReportOrError7Choice.class, MemberReportOrError8Choice.class, MemberStatus1Code.class, MessageHeader7 .class, MxCamt01400105 .class, OriginalBusinessQuery1 .class, PaymentRole1Choice.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RequestType4Choice.class, ReturnMemberV05 .class, StructuredLongPostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemMemberStatus1Choice.class, SystemMemberType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.014.001.05";

    public MxCamt01400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01400105(final String xml) {
        this();
        MxCamt01400105 tmp = parse(xml);
        rtrMmb = tmp.getRtrMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMemberV05 }
     *     
     */
    public ReturnMemberV05 getRtrMmb() {
        return rtrMmb;
    }

    /**
     * Sets the value of the rtrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMemberV05 }
     *     
     */
    public MxCamt01400105 setRtrMmb(ReturnMemberV05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt01400105 parse(String xml) {
        return ((MxCamt01400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt01400105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt01400105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt01400105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01400105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01400105) parserImpl.read(MxCamt01400105 .class, xml, _classes));
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
     * Creates an MxCamt01400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01400105 message
     * @return
     *     a new instance of MxCamt01400105
     */
    public final static MxCamt01400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01400105 .class);
    }

}
