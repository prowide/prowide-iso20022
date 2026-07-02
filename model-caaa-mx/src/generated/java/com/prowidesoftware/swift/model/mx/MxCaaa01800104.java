
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
 * Class for caaa.018.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.018.001.04")
public class MxCaaa01800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsAdvc", required = true)
    protected AcceptorCurrencyConversionAdviceV04 accptrCcyConvsAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCurrencyConversionAdvice4 .class, AcceptorCurrencyConversionAdviceV04 .class, Acquirer10 .class, ActionMessage7 .class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm19Code.class, Algorithm24Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData6 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardPaymentEnvironment74 .class, CardPaymentToken5 .class, CardPaymentTransaction93 .class, CardPaymentTransactionDetails48 .class, CardProductType1Code.class, Cardholder16 .class, CardholderAuthentication13 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType21 .class, ContentInformationType22 .class, ContentInformationType23 .class, ContentInformationType24 .class, ContentType2Code.class, CryptographicKey14 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion17 .class, CurrencyConversion19 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, DateAndPlaceOfBirth1 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData7 .class, Exemption1Code.class, ExternallyDefinedData1 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header58 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction41Code.class, MobileData2 .class, MxCaaa01800104 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN7 .class, OnLineReason1Code.class, Organisation32 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType1 .class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard30 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction10 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent10 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics6 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient5Choice.class, Recipient8Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, SensitiveMobileData1 .class, SignedData5 .class, Signer4 .class, Traceability8 .class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.018.001.04";

    public MxCaaa01800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01800104(final String xml) {
        this();
        MxCaaa01800104 tmp = parse(xml);
        accptrCcyConvsAdvc = tmp.getAccptrCcyConvsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionAdviceV04 }
     *     
     */
    public AcceptorCurrencyConversionAdviceV04 getAccptrCcyConvsAdvc() {
        return accptrCcyConvsAdvc;
    }

    /**
     * Sets the value of the accptrCcyConvsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionAdviceV04 }
     *     
     */
    public MxCaaa01800104 setAccptrCcyConvsAdvc(AcceptorCurrencyConversionAdviceV04 value) {
        this.accptrCcyConvsAdvc = value;
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
    public static MxCaaa01800104 parse(String xml) {
        return ((MxCaaa01800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01800104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01800104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01800104) parserImpl.read(MxCaaa01800104 .class, xml, _classes));
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
     * Creates an MxCaaa01800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01800104 message
     * @return
     *     a new instance of MxCaaa01800104
     */
    public final static MxCaaa01800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01800104 .class);
    }

}
