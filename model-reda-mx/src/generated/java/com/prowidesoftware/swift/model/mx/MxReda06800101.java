
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
 * Class for reda.068.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToPayCdtrEnrlmntCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.068.001.01")
public class MxReda06800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToPayCdtrEnrlmntCxlReq", required = true)
    protected RequestToPayCreditorEnrolmentCancellationRequestV01 reqToPayCdtrEnrlmntCxlReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 68;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Contact4 .class, CreditorEnrolment3 .class, CreditorEnrolmentCancellation2 .class, CreditorEnrolmentCancellationReason1Choice.class, CreditorEnrolmentCancellationReason2 .class, CreditorServiceEnrolment1 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, EnrolmentHeader2 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxReda06800101 .class, NamePrefix2Code.class, OrganisationIdentification37 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessInstruction1 .class, OriginalEnrolment2Choice.class, OtherContact1 .class, Party49Choice.class, PersonIdentification17 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, RTPPartyIdentification1 .class, RequestToPayCreditorEnrolmentCancellationRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Visibilty1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.068.001.01";

    public MxReda06800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06800101(final String xml) {
        this();
        MxReda06800101 tmp = parse(xml);
        reqToPayCdtrEnrlmntCxlReq = tmp.getReqToPayCdtrEnrlmntCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToPayCdtrEnrlmntCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToPayCreditorEnrolmentCancellationRequestV01 }
     *     
     */
    public RequestToPayCreditorEnrolmentCancellationRequestV01 getReqToPayCdtrEnrlmntCxlReq() {
        return reqToPayCdtrEnrlmntCxlReq;
    }

    /**
     * Sets the value of the reqToPayCdtrEnrlmntCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToPayCreditorEnrolmentCancellationRequestV01 }
     *     
     */
    public MxReda06800101 setReqToPayCdtrEnrlmntCxlReq(RequestToPayCreditorEnrolmentCancellationRequestV01 value) {
        this.reqToPayCdtrEnrlmntCxlReq = value;
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
    public static MxReda06800101 parse(String xml) {
        return ((MxReda06800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06800101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06800101) parserImpl.read(MxReda06800101 .class, xml, _classes));
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
     * Creates an MxReda06800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06800101 message
     * @return
     *     a new instance of MxReda06800101
     */
    public final static MxReda06800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06800101 .class);
    }

}
