
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
 * Class for camt.014.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.014.001.03")
public class MxCamt01400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrMmb", required = true)
    protected ReturnMemberV03 rtrMmb;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, CashAccount24 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationAddress8 .class, ContactIdentificationAndAddress1 .class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, FinancialIdentificationSchemeName1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, LongPostalAddress1Choice.class, Member4 .class, MemberIdentification2Choice.class, MemberReport4 .class, MemberReportOrError3Choice.class, MemberReportOrError4Choice.class, MemberStatus1Code.class, MemberType1Code.class, MessageHeader7 .class, MxCamt01400103 .class, OriginalBusinessQuery1 .class, PaymentRole1Code.class, RequestType4Choice.class, ReturnMemberV03 .class, StructuredLongPostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.014.001.03";

    public MxCamt01400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01400103(final String xml) {
        this();
        MxCamt01400103 tmp = parse(xml);
        rtrMmb = tmp.getRtrMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMemberV03 }
     *     
     */
    public ReturnMemberV03 getRtrMmb() {
        return rtrMmb;
    }

    /**
     * Sets the value of the rtrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMemberV03 }
     *     
     */
    public MxCamt01400103 setRtrMmb(ReturnMemberV03 value) {
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
    public static MxCamt01400103 parse(String xml) {
        return ((MxCamt01400103) MxReadImpl.parse(MxCamt01400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01400103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01400103) parserImpl.read(MxCamt01400103 .class, xml, _classes));
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
     * Creates an MxCamt01400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01400103 message
     * @return
     *     a new instance of MxCamt01400103
     */
    public final static MxCamt01400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt01400103 .class);
    }

}
