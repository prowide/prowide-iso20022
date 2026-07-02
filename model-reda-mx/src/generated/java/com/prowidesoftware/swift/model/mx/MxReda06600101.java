
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.066.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToPayCdtrEnrlmntReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.066.001.01")
public class MxReda06600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToPayCdtrEnrlmntReq", required = true)
    protected RequestToPayCreditorEnrolmentRequestV01 reqToPayCdtrEnrlmntReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 66;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Contact4 .class, CreditorEnrolment3 .class, CreditorInvoice3 .class, CreditorServiceEnrolment1 .class, CustomerTypeRequest2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DocumentFormat2Choice.class, DocumentType1Choice.class, EnrolmentHeader2 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericOrganisationType1 .class, GenericPersonIdentification1 .class, GenericPersonType1 .class, MxReda06600101 .class, NamePrefix2Code.class, OrganisationIdentification37 .class, OrganisationIdentificationSchemeName1Choice.class, OrganisationType2 .class, OtherContact1 .class, Party49Choice.class, PersonIdentification17 .class, PersonIdentificationSchemeName1Choice.class, PersonType2 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, RTPPartyIdentification1 .class, RequestToPayCreditorEnrolmentRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Visibilty1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.066.001.01";

    public MxReda06600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06600101(final String xml) {
        this();
        MxReda06600101 tmp = parse(xml);
        reqToPayCdtrEnrlmntReq = tmp.getReqToPayCdtrEnrlmntReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToPayCdtrEnrlmntReq property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToPayCreditorEnrolmentRequestV01 }
     *     
     */
    public RequestToPayCreditorEnrolmentRequestV01 getReqToPayCdtrEnrlmntReq() {
        return reqToPayCdtrEnrlmntReq;
    }

    /**
     * Sets the value of the reqToPayCdtrEnrlmntReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToPayCreditorEnrolmentRequestV01 }
     *     
     */
    public MxReda06600101 setReqToPayCdtrEnrlmntReq(RequestToPayCreditorEnrolmentRequestV01 value) {
        this.reqToPayCdtrEnrlmntReq = value;
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
    public static MxReda06600101 parse(String xml) {
        return ((MxReda06600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06600101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06600101) parserImpl.read(MxReda06600101 .class, xml, _classes));
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
     * Creates an MxReda06600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06600101 message
     * @return
     *     a new instance of MxReda06600101
     */
    public final static MxReda06600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06600101 .class);
    }

}
