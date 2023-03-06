
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
 * Class for caaa.006.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.006.001.09")
public class MxCaaa00600109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCxlRspn", required = true)
    protected AcceptorCancellationResponseV09 accptrCxlRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationResponse9 .class, AcceptorCancellationResponseV09 .class, Acquirer10 .class, Action11 .class, ActionMessage8 .class, ActionType9Code.class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, AttributeType1Code.class, AuthenticatedData7 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult16 .class, BarcodeType1Code.class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment77 .class, CardPaymentTransaction105 .class, CardPaymentTransaction97 .class, CardPaymentTransactionDetails34 .class, CardProductType1Code.class, Cardholder17 .class, CardholderAuthentication14 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType25 .class, ContentInformationType26 .class, ContentInformationType27 .class, ContentInformationType28 .class, ContentType2Code.class, CryptographicKey15 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData8 .class, Exemption1Code.class, ExternallyDefinedData2 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header59 .class, InformationQualify1Code.class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport7 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount2 .class, LoyaltyHandling1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken1 .class, MessageFunction42Code.class, MobileData3 .class, MxCaaa00600109 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN8 .class, Organisation41 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType2 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard31 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction11 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent11 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics7 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient10Choice.class, Recipient9Choice.class, RelativeDistinguishedName1 .class, Response9Code.class, ResponseType10 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SensitiveMobileData1 .class, SignedData6 .class, Signer5 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.006.001.09";

    public MxCaaa00600109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00600109(final String xml) {
        this();
        MxCaaa00600109 tmp = parse(xml);
        accptrCxlRspn = tmp.getAccptrCxlRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00600109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationResponseV09 }
     *     
     */
    public AcceptorCancellationResponseV09 getAccptrCxlRspn() {
        return accptrCxlRspn;
    }

    /**
     * Sets the value of the accptrCxlRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationResponseV09 }
     *     
     */
    public MxCaaa00600109 setAccptrCxlRspn(AcceptorCancellationResponseV09 value) {
        this.accptrCxlRspn = value;
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
    public static MxCaaa00600109 parse(String xml) {
        return ((MxCaaa00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00600109 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00600109 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00600109) parserImpl.read(MxCaaa00600109 .class, xml, _classes));
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
     * Creates an MxCaaa00600109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00600109 message
     * @return
     *     a new instance of MxCaaa00600109
     */
    public final static MxCaaa00600109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00600109 .class);
    }

}
