
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
 * Class for caaa.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.03")
public class MxCaaa00500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlReq", required = true)
    protected AcceptorCancellationRequestV03 accptrCxlReq;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCancellationRequest3 .class, AcceptorCancellationRequestV03 .class, Acquirer2 .class, Algorithm10Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData3 .class, CardDataReading1Code.class, CardPaymentContext1 .class, CardPaymentEnvironment23 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentTransaction21 .class, CardPaymentTransaction26 .class, CardPaymentTransactionDetails5 .class, CardPaymentTransactionResult1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType7 .class, ContentInformationType8 .class, ContentType1Code.class, DisplayCapabilities2 .class, EncapsulatedContent2 .class, EncryptedContent2 .class, EnvelopedData3 .class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, GenericIdentification48 .class, Header7 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa00500103 .class, OnLineCapability1Code.class, Organisation8 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard8 .class, PaymentContext1 .class, PlainCardData6 .class, PointOfInteraction3 .class, PointOfInteractionCapabilities2 .class, PointOfInteractionComponent4 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Recipient3Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface2Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.03";

    public MxCaaa00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00500103(final String xml) {
        this();
        MxCaaa00500103 tmp = parse(xml);
        accptrCxlReq = tmp.getAccptrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationRequestV03 }
     *     
     */
    public AcceptorCancellationRequestV03 getAccptrCxlReq() {
        return accptrCxlReq;
    }

    /**
     * Sets the value of the accptrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationRequestV03 }
     *     
     */
    public MxCaaa00500103 setAccptrCxlReq(AcceptorCancellationRequestV03 value) {
        this.accptrCxlReq = value;
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
    public static MxCaaa00500103 parse(String xml) {
        return ((MxCaaa00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00500103 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00500103) parserImpl.read(MxCaaa00500103 .class, xml, _classes));
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
     * Creates an MxCaaa00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00500103 message
     * @return
     *     a new instance of MxCaaa00500103
     */
    public static final MxCaaa00500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00500103 .class);
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
