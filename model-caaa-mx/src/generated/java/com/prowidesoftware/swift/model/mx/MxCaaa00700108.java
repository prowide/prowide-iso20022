
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
 * Class for caaa.007.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.08")
public class MxCaaa00700108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlAdvc", required = true)
    protected AcceptorCancellationAdviceV08 accptrCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCancellationAdvice8 .class, AcceptorCancellationAdviceV08 .class, Acquirer4 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthenticationResult1Code.class, AuthorisationResult12 .class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading6Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardPaymentContext27 .class, CardPaymentEnvironment68 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType9Code.class, CardPaymentToken4 .class, CardPaymentTransaction79 .class, CardPaymentTransaction83 .class, CardPaymentTransactionDetails34 .class, CardPaymentTransactionResult3 .class, CardProductType1Code.class, Cardholder13 .class, CardholderAuthentication11 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, CommunicationAddress9 .class, CommunicationCharacteristics3 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentInformationType19 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CustomerDevice1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, FailureReason3Code.class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, GenericInformation1 .class, Header36 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction14Code.class, MxCaaa00700108 .class, NameAndAddress6 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, Organisation26 .class, Organisation32 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard28 .class, PaymentContext26 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction8 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SaleContext3 .class, SaleTokenScope1Code.class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability5 .class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.08";

    public MxCaaa00700108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00700108(final String xml) {
        this();
        MxCaaa00700108 tmp = parse(xml);
        accptrCxlAdvc = tmp.getAccptrCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00700108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceV08 }
     *     
     */
    public AcceptorCancellationAdviceV08 getAccptrCxlAdvc() {
        return accptrCxlAdvc;
    }

    /**
     * Sets the value of the accptrCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceV08 }
     *     
     */
    public MxCaaa00700108 setAccptrCxlAdvc(AcceptorCancellationAdviceV08 value) {
        this.accptrCxlAdvc = value;
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
    public static MxCaaa00700108 parse(String xml) {
        return ((MxCaaa00700108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00700108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00700108 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00700108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00700108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00700108 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00700108) parserImpl.read(MxCaaa00700108 .class, xml, _classes));
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
     * Creates an MxCaaa00700108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00700108 message
     * @return
     *     a new instance of MxCaaa00700108
     */
    public static final MxCaaa00700108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00700108 .class);
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
