
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
 * Class for casp.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOISvcRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.002.001.02")
public class MxCasp00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOISvcRspn", required = true)
    protected SaleToPOIServiceResponseV02 saleToPOISvcRspn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Acquirer10 .class, Action10 .class, ActionMessage7 .class, ActionType9Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm19Code.class, Algorithm24Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData6 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult14 .class, BalanceInquiryResponse2 .class, BarcodeType1Code.class, BatchResponse2 .class, BytePadding1Code.class, CapturedSignature1 .class, CardAccountType3Code.class, CardAcquisitionResponse2 .class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext28 .class, CardPaymentEnvironment75 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken5 .class, CardPaymentTransaction100 .class, CardPaymentTransaction102 .class, CardPaymentTransaction94 .class, CardPaymentTransactionDetails48 .class, CardProductType1Code.class, Cardholder16 .class, CardholderAuthentication13 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType21 .class, ContentInformationType22 .class, ContentInformationType23 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey14 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion17 .class, CurrencyConversion18 .class, CurrencyConversion19 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData7 .class, Exemption1Code.class, ExternallyDefinedData1 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header41 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, LoyaltyAccount2 .class, LoyaltyAmount1 .class, LoyaltyHandling1Code.class, LoyaltyRebates1 .class, LoyaltyResponse2 .class, LoyaltyResult2 .class, LoyaltyServerData1 .class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MobileData2 .class, MxCasp00200102 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN7 .class, OnLineReason1Code.class, Organisation26 .class, Organisation32 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType1 .class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentAccount3 .class, PaymentCard30 .class, PaymentContext27 .class, PaymentReceipt2 .class, PaymentResponse2 .class, PaymentTokenIdentifiers1 .class, PerformedTransaction2 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction10 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent10 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics6 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient5Choice.class, Recipient8Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response5Code.class, Response9Code.class, ResponseType10 .class, ResponseType9 .class, RetailerMessage1Code.class, RetailerPaymentResult2 .class, RetailerResultDetail1Code.class, RetailerReversalResult2 .class, RetailerSaleEnvironment2 .class, RetailerService3Code.class, ReversalResponse3 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleItemRebate1 .class, SaleToPOIServiceResponseV02 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, ServiceResponse3 .class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, StoredValueData3 .class, StoredValueResponse3 .class, StoredValueTransactionType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.002.001.02";

    public MxCasp00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp00200102(final String xml) {
        this();
        MxCasp00200102 tmp = parse(xml);
        saleToPOISvcRspn = tmp.getSaleToPOISvcRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOISvcRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIServiceResponseV02 }
     *     
     */
    public SaleToPOIServiceResponseV02 getSaleToPOISvcRspn() {
        return saleToPOISvcRspn;
    }

    /**
     * Sets the value of the saleToPOISvcRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIServiceResponseV02 }
     *     
     */
    public MxCasp00200102 setSaleToPOISvcRspn(SaleToPOIServiceResponseV02 value) {
        this.saleToPOISvcRspn = value;
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
    public static MxCasp00200102 parse(String xml) {
        return ((MxCasp00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp00200102 parse(String xml, MxRead parserImpl) {
        return ((MxCasp00200102) parserImpl.read(MxCasp00200102 .class, xml, _classes));
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
     * Creates an MxCasp00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp00200102 message
     * @return
     *     a new instance of MxCasp00200102
     */
    public final static MxCasp00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp00200102 .class);
    }

}
