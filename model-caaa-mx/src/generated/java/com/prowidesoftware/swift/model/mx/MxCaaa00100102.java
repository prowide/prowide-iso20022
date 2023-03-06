
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
 * Class for caaa.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.02")
public class MxCaaa00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnReq", required = true)
    protected AcceptorAuthorisationRequestV02 accptrAuthstnReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorAuthorisationRequest2 .class, AcceptorAuthorisationRequestV02 .class, Acquirer2 .class, AddressVerification1 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData2 .class, AuthenticationEntity1Code.class, AuthenticationMethod2Code.class, CSCManagement1Code.class, CardAccountType1Code.class, CardDataReading1Code.class, CardPaymentContext1 .class, CardPaymentEnvironment9 .class, CardPaymentServiceType2Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType4Code.class, CardPaymentTransaction11 .class, CardPaymentTransaction17 .class, CardPaymentTransactionDetails1 .class, CardPaymentTransactionResult1 .class, CardSecurityInformation1 .class, Cardholder3 .class, CardholderAuthentication3 .class, CardholderIdentification1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, CommunicationCharacteristics1 .class, ContentInformationType5 .class, ContentInformationType6 .class, ContentType1Code.class, DetailedAmount1 .class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, Frequency4Code.class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, GenericIdentification48 .class, Header1 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction1Code.class, MxCaaa00100102 .class, OnLineCapability1Code.class, OnLinePIN2 .class, OnLineReason1Code.class, Organisation8 .class, PINFormat2Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard5 .class, PaymentContext1 .class, PersonIdentificationType4Code.class, PlainCardData1 .class, PointOfInteraction2 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent3 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics1 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Product1 .class, Recipient2Choice.class, RecurringTransaction1 .class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TypeOfAmount1Code.class, TypeOfAmount2Code.class, UnitOfMeasure1Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.02";

    public MxCaaa00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00100102(final String xml) {
        this();
        MxCaaa00100102 tmp = parse(xml);
        accptrAuthstnReq = tmp.getAccptrAuthstnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationRequestV02 }
     *     
     */
    public AcceptorAuthorisationRequestV02 getAccptrAuthstnReq() {
        return accptrAuthstnReq;
    }

    /**
     * Sets the value of the accptrAuthstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationRequestV02 }
     *     
     */
    public MxCaaa00100102 setAccptrAuthstnReq(AcceptorAuthorisationRequestV02 value) {
        this.accptrAuthstnReq = value;
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
    public static MxCaaa00100102 parse(String xml) {
        return ((MxCaaa00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00100102) parserImpl.read(MxCaaa00100102 .class, xml, _classes));
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
     * Creates an MxCaaa00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00100102 message
     * @return
     *     a new instance of MxCaaa00100102
     */
    public final static MxCaaa00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00100102 .class);
    }

}
