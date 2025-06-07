
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
 * Class for caaa.002.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12")
public class MxCaaa00200112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnRspn", required = true)
    protected AcceptorAuthorisationResponseV12 accptrAuthstnRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorAuthorisationResponse12 .class, AcceptorAuthorisationResponseV12 .class, Acquirer10 .class, Action14 .class, ActionMessage10 .class, ActionType13Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, Amount5 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData9 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult17 .class, BarcodeType1Code.class, BinRange1 .class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment79 .class, CardPaymentTransaction128 .class, CardPaymentTransaction129 .class, CardPaymentTransactionDetails52 .class, CardProductType1Code.class, Cardholder20 .class, CardholderAuthentication16 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType33 .class, ContentInformationType34 .class, ContentInformationType35 .class, ContentInformationType36 .class, ContentType2Code.class, CryptographicKey17 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion26 .class, CurrencyConversion27 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData10 .class, Exemption1Code.class, ExternallyDefinedData4 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header70 .class, InformationQualify1Code.class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InstalmentPlan1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport9 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MessageFunction46Code.class, MobileData5 .class, MxCaaa00200112 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN10 .class, OnLineReason2Code.class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode2 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType4 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard33 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PlanOwner1Code.class, PointOfInteraction13 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent14 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics9 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, ProcessRetry3 .class, ProcessTiming6 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient13Choice.class, Recipient14Choice.class, RecurringTransaction5 .class, RelativeDistinguishedName1 .class, Response9Code.class, ResponseType10 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SensitiveMobileData1 .class, SignedData8 .class, Signer7 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, TimeUnit1Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.12";

    public MxCaaa00200112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00200112(final String xml) {
        this();
        MxCaaa00200112 tmp = parse(xml);
        accptrAuthstnRspn = tmp.getAccptrAuthstnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00200112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationResponseV12 }
     *     
     */
    public AcceptorAuthorisationResponseV12 getAccptrAuthstnRspn() {
        return accptrAuthstnRspn;
    }

    /**
     * Sets the value of the accptrAuthstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationResponseV12 }
     *     
     */
    public MxCaaa00200112 setAccptrAuthstnRspn(AcceptorAuthorisationResponseV12 value) {
        this.accptrAuthstnRspn = value;
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
    public static MxCaaa00200112 parse(String xml) {
        return ((MxCaaa00200112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00200112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00200112 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00200112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00200112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00200112 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00200112) parserImpl.read(MxCaaa00200112 .class, xml, _classes));
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
     * Creates an MxCaaa00200112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00200112 message
     * @return
     *     a new instance of MxCaaa00200112
     */
    public final static MxCaaa00200112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00200112 .class);
    }

}
