
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
 * Class for caaa.005.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.04")
public class MxCaaa00500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlReq", required = true)
    protected AcceptorCancellationRequestV04 accptrCxlReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationRequest4 .class, AcceptorCancellationRequestV04 .class, Acquirer4 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardDataReading1Code.class, CardFallback1Code.class, CardPaymentContext10 .class, CardPaymentEnvironment35 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentToken3 .class, CardPaymentTransaction37 .class, CardPaymentTransaction41 .class, CardPaymentTransactionDetails5 .class, CardPaymentTransactionResult2 .class, CardProductType1Code.class, CardholderVerificationCapability1Code.class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType10 .class, ContentInformationType11 .class, ContentType2Code.class, CustomerDevice1 .class, DisplayCapabilities2 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification32 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification70 .class, GenericIdentification76 .class, Header10 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa00500104 .class, OnLineCapability1Code.class, Organisation8 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard11 .class, PaymentContext10 .class, PaymentTokenIdentifiers1 .class, PlainCardData9 .class, PointOfInteraction4 .class, PointOfInteractionCapabilities3 .class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability2 .class, TrackData1 .class, TransactionChannel3Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.04";

    public MxCaaa00500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00500104(final String xml) {
        this();
        MxCaaa00500104 tmp = parse(xml);
        accptrCxlReq = tmp.getAccptrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationRequestV04 }
     *     
     */
    public AcceptorCancellationRequestV04 getAccptrCxlReq() {
        return accptrCxlReq;
    }

    /**
     * Sets the value of the accptrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationRequestV04 }
     *     
     */
    public MxCaaa00500104 setAccptrCxlReq(AcceptorCancellationRequestV04 value) {
        this.accptrCxlReq = value;
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
    public static MxCaaa00500104 parse(String xml) {
        return ((MxCaaa00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00500104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00500104) parserImpl.read(MxCaaa00500104 .class, xml, _classes));
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
     * Creates an MxCaaa00500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00500104 message
     * @return
     *     a new instance of MxCaaa00500104
     */
    public final static MxCaaa00500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00500104 .class);
    }

}
