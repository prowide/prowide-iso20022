
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
 * Class for reda.067.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToPayCdtrEnrlmntAmdmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.067.001.01")
public class MxReda06700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToPayCdtrEnrlmntAmdmntReq", required = true)
    protected RequestToPayCreditorEnrolmentAmendmentRequestV01 reqToPayCdtrEnrlmntAmdmntReq;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 67;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Contact4 .class, CreditorEnrolment3 .class, CreditorEnrolment4 .class, CreditorEnrolmentAmendment3 .class, CreditorEnrolmentAmendment4 .class, CreditorEnrolmentAmendmentReason1Choice.class, CreditorEnrolmentAmendmentReason2 .class, CreditorInvoice4 .class, CreditorServiceEnrolment1 .class, CustomerTypeRequest2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DocumentFormat2Choice.class, DocumentType1Choice.class, EnrolmentHeader2 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericOrganisationType1 .class, GenericPersonIdentification1 .class, GenericPersonType1 .class, MxReda06700101 .class, NamePrefix2Code.class, OrganisationIdentification37 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationType2 .class, OriginalBusinessInstruction1 .class, OriginalEnrolment2Choice.class, OtherContact1 .class, Party49Choice.class, PersonIdentification17 .class, PersonIdentificationSchemeName1Choice.class, PersonType2 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, RTPPartyIdentification1 .class, RequestToPayCreditorEnrolmentAmendmentRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Visibilty1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.067.001.01";

    public MxReda06700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06700101(final String xml) {
        this();
        MxReda06700101 tmp = parse(xml);
        reqToPayCdtrEnrlmntAmdmntReq = tmp.getReqToPayCdtrEnrlmntAmdmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToPayCdtrEnrlmntAmdmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToPayCreditorEnrolmentAmendmentRequestV01 }
     *     
     */
    public RequestToPayCreditorEnrolmentAmendmentRequestV01 getReqToPayCdtrEnrlmntAmdmntReq() {
        return reqToPayCdtrEnrlmntAmdmntReq;
    }

    /**
     * Sets the value of the reqToPayCdtrEnrlmntAmdmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToPayCreditorEnrolmentAmendmentRequestV01 }
     *     
     */
    public MxReda06700101 setReqToPayCdtrEnrlmntAmdmntReq(RequestToPayCreditorEnrolmentAmendmentRequestV01 value) {
        this.reqToPayCdtrEnrlmntAmdmntReq = value;
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
    public static MxReda06700101 parse(String xml) {
        return ((MxReda06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06700101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06700101) parserImpl.read(MxReda06700101 .class, xml, _classes));
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
     * Creates an MxReda06700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06700101 message
     * @return
     *     a new instance of MxReda06700101
     */
    public static final MxReda06700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06700101 .class);
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
