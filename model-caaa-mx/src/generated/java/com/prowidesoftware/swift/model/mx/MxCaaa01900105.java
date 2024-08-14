
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
 * Class for caaa.019.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsAdvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.019.001.05")
public class MxCaaa01900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsAdvcRspn", required = true)
    protected AcceptorCurrencyConversionAdviceResponseV05 accptrCcyConvsAdvcRspn;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCancellationAdviceResponse10 .class, AcceptorCurrencyConversionAdviceResponseV05 .class, Acquirer10 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, AttributeType1Code.class, AuthenticatedData8 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BytePadding1Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment78 .class, CardPaymentTransactionAdviceResponse8 .class, CardProductType1Code.class, Cardholder18 .class, CardholderAuthentication15 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType30 .class, ContentInformationType31 .class, ContentInformationType32 .class, ContentType2Code.class, CryptographicKey16 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, Exemption1Code.class, ExternallyDefinedData3 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header59 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport8 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MessageFunction42Code.class, MobileData4 .class, MxCaaa01900105 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN9 .class, Organisation41 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType3 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard32 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction12 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent12 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics8 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, Recipient11Choice.class, Recipient12Choice.class, RelativeDistinguishedName1 .class, Response9Code.class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SensitiveMobileData1 .class, SignedData7 .class, Signer6 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.019.001.05";

    public MxCaaa01900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01900105(final String xml) {
        this();
        MxCaaa01900105 tmp = parse(xml);
        accptrCcyConvsAdvcRspn = tmp.getAccptrCcyConvsAdvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsAdvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionAdviceResponseV05 }
     *     
     */
    public AcceptorCurrencyConversionAdviceResponseV05 getAccptrCcyConvsAdvcRspn() {
        return accptrCcyConvsAdvcRspn;
    }

    /**
     * Sets the value of the accptrCcyConvsAdvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionAdviceResponseV05 }
     *     
     */
    public MxCaaa01900105 setAccptrCcyConvsAdvcRspn(AcceptorCurrencyConversionAdviceResponseV05 value) {
        this.accptrCcyConvsAdvcRspn = value;
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
    public static MxCaaa01900105 parse(String xml) {
        return ((MxCaaa01900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01900105 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01900105) parserImpl.read(MxCaaa01900105 .class, xml, _classes));
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
     * Creates an MxCaaa01900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01900105 message
     * @return
     *     a new instance of MxCaaa01900105
     */
    public static final MxCaaa01900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01900105 .class);
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
