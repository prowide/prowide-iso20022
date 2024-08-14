
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
 * Class for casp.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIDvcReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.016.001.01")
public class MxCasp01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIDvcReq", required = true)
    protected SaleToPOIDeviceRequestV01 saleToPOIDvcReq;
    public static final transient String BUSINESS_PROCESS = "casp";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Acquirer9 .class, ActionMessage6 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading6Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext27 .class, CardPaymentEnvironment73 .class, CardPaymentToken4 .class, CardProductType1Code.class, Cardholder14 .class, CardholderAuthentication12 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics4 .class, ContentInformationType17 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CustomerDevice1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DeviceDisplayRequest1 .class, DeviceInitialisationCardReaderRequest1 .class, DeviceInputNotification1 .class, DeviceInputRequest1 .class, DevicePlaySoundRequest1 .class, DevicePoweroffCardReaderRequest1 .class, DevicePrintRequest1 .class, DeviceRequest2 .class, DeviceSecureInputRequest1 .class, DeviceSendApplicationProtocolDataUnitCardReaderRequest1 .class, DeviceTransmitMessageRequest1 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, GenericIdentification171 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header37 .class, InformationQualify1Code.class, InputCommand1Code.class, InputData1 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, LoyaltyAccount1 .class, LoyaltyHandling1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MobileData1 .class, MxCasp01600101 .class, NameAndAddress6 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, Organisation26 .class, Organisation32 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, PINRequestType1Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard28 .class, PaymentContext26 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction9 .class, PointOfInteractionCapabilities8 .class, PointOfInteractionComponent9 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics5 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient5Choice.class, Recipient6Choice.class, RelativeDistinguishedName1 .class, ResponseMode1Code.class, RetailerMessage1Code.class, RetailerSaleEnvironment2 .class, RetailerService8Code.class, SaleCapabilities1Code.class, SaleCapabilities2Code.class, SaleContext3 .class, SaleToPOIDeviceRequestV01 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, SoundAction1Code.class, SoundContent1 .class, SoundFormat1Code.class, StoredValueAccount1 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption1Code.class, Traceability6 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.016.001.01";

    public MxCasp01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp01600101(final String xml) {
        this();
        MxCasp01600101 tmp = parse(xml);
        saleToPOIDvcReq = tmp.getSaleToPOIDvcReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIDvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIDeviceRequestV01 }
     *     
     */
    public SaleToPOIDeviceRequestV01 getSaleToPOIDvcReq() {
        return saleToPOIDvcReq;
    }

    /**
     * Sets the value of the saleToPOIDvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIDeviceRequestV01 }
     *     
     */
    public MxCasp01600101 setSaleToPOIDvcReq(SaleToPOIDeviceRequestV01 value) {
        this.saleToPOIDvcReq = value;
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
    public static MxCasp01600101 parse(String xml) {
        return ((MxCasp01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp01600101 parse(String xml, MxRead parserImpl) {
        return ((MxCasp01600101) parserImpl.read(MxCasp01600101 .class, xml, _classes));
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
     * Creates an MxCasp01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp01600101 message
     * @return
     *     a new instance of MxCasp01600101
     */
    public static final MxCasp01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp01600101 .class);
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
