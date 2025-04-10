
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
 * Class for caaa.018.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.018.001.05")
public class MxCaaa01800105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsAdvc", required = true)
    protected AcceptorCurrencyConversionAdviceV05 accptrCcyConvsAdvc;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 18;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorCurrencyConversionAdvice5 .class, AcceptorCurrencyConversionAdviceV05 .class, Acquirer10 .class, ActionMessage8 .class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData7 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment77 .class, CardPaymentTransaction111 .class, CardPaymentTransactionDetails49 .class, CardProductType1Code.class, Cardholder17 .class, CardholderAuthentication14 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType25 .class, ContentInformationType26 .class, ContentInformationType27 .class, ContentInformationType28 .class, ContentType2Code.class, CryptographicKey15 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion20 .class, CurrencyConversion21 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData8 .class, Exemption1Code.class, ExternallyDefinedData2 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header59 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport7 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount2 .class, LoyaltyHandling1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken1 .class, MessageFunction42Code.class, MobileData3 .class, MxCaaa01800105 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN8 .class, OnLineReason1Code.class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType2 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard31 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction11 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent11 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics7 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient10Choice.class, Recipient9Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SensitiveMobileData1 .class, SignedData6 .class, Signer5 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.018.001.05";

    public MxCaaa01800105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01800105(final String xml) {
        this();
        MxCaaa01800105 tmp = parse(xml);
        accptrCcyConvsAdvc = tmp.getAccptrCcyConvsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01800105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionAdviceV05 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV05 getAccptrCcyConvsAdvc() {
        return accptrCcyConvsAdvc;
    }

    /**
     * Sets the value of the accptrCcyConvsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionAdviceV05 }
     *     
     */
    public MxCaaa01800105 setAccptrCcyConvsAdvc(AcceptorCurrencyConversionAdviceV05 value) {
        this.accptrCcyConvsAdvc = value;
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
    public static MxCaaa01800105 parse(String xml) {
        return ((MxCaaa01800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01800105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01800105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01800105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01800105 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01800105) parserImpl.read(MxCaaa01800105 .class, xml, _classes));
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
     * Creates an MxCaaa01800105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01800105 message
     * @return
     *     a new instance of MxCaaa01800105
     */
    public static final MxCaaa01800105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01800105 .class);
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
