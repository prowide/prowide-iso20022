
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
 * Class for caaa.005.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.06")
public class MxCaaa00500106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlReq", required = true)
    protected AcceptorCancellationRequestV06 accptrCxlReq;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationRequest6 .class, AcceptorCancellationRequestV06 .class, Acquirer4 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CardDataReading5Code.class, CardFallback1Code.class, CardPaymentContext22 .class, CardPaymentEnvironment59 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken3 .class, CardPaymentTransaction52 .class, CardPaymentTransaction74 .class, CardPaymentTransactionDetails34 .class, CardPaymentTransactionResult3 .class, CardProductType1Code.class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, CommunicationAddress5 .class, CommunicationCharacteristics3 .class, ContentInformationType10 .class, ContentInformationType15 .class, ContentType2Code.class, CryptographicKeyType3Code.class, CustomerDevice1 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification32 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, Header30 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KEKIdentifier5 .class, KeyTransport4 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction10Code.class, MxCaaa00500106 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, Organisation25 .class, Organisation26 .class, OutputFormat1Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType4Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard26 .class, PaymentContext22 .class, PaymentTokenIdentifiers1 .class, PlainCardData16 .class, PointOfInteraction7 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent7 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics3 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress18 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SaleContext2 .class, Traceability5 .class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface4Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.06";

    public MxCaaa00500106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00500106(final String xml) {
        this();
        MxCaaa00500106 tmp = parse(xml);
        accptrCxlReq = tmp.getAccptrCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00500106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationRequestV06 }
     *     
     */
    public AcceptorCancellationRequestV06 getAccptrCxlReq() {
        return accptrCxlReq;
    }

    /**
     * Sets the value of the accptrCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationRequestV06 }
     *     
     */
    public MxCaaa00500106 setAccptrCxlReq(AcceptorCancellationRequestV06 value) {
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
    public static MxCaaa00500106 parse(String xml) {
        return ((MxCaaa00500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00500106 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00500106 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00500106) parserImpl.read(MxCaaa00500106 .class, xml, _classes));
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
     * Creates an MxCaaa00500106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00500106 message
     * @return
     *     a new instance of MxCaaa00500106
     */
    public final static MxCaaa00500106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00500106 .class);
    }

}
