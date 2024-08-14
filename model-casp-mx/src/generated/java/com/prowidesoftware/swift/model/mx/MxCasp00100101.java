
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
 * Class for casp.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOISvcReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.001.001.01")
public class MxCasp00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOISvcReq", required = true)
    protected SaleToPOIServiceRequestV01 saleToPOISvcReq;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Acquirer9 .class, ActionMessage5 .class, ActionMessage6 .class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BalanceInquiryRequest2 .class, BarcodeType1Code.class, BatchRequest1 .class, BytePadding1Code.class, CardAccountType3Code.class, CardAcquisitionRequest2 .class, CardDataReading5Code.class, CardDataReading6Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext27 .class, CardPaymentEnvironment73 .class, CardPaymentServiceType13Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken4 .class, CardPaymentTransaction86 .class, CardPaymentTransaction91 .class, CardPaymentTransactionDetails47 .class, CardProductType1Code.class, Cardholder14 .class, CardholderAuthentication12 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics4 .class, ContentInformationType17 .class, ContentInformationType18 .class, ContentInformationType19 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion14 .class, CurrencyConversion15 .class, CurrencyConversion16 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EnableServiceRequest1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, Frequency3Code.class, GenericIdentification171 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header37 .class, IndustryData1 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, LoyaltyAccount1 .class, LoyaltyAccountRequest1 .class, LoyaltyAmount1 .class, LoyaltyHandling1Code.class, LoyaltyRequest1 .class, LoyaltyRequestData1 .class, LoyaltyTransaction1 .class, LoyaltyTransactionType1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MobileData1 .class, MxCasp00100101 .class, NameAndAddress6 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, OnLineReason1Code.class, Organisation26 .class, Organisation32 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentAccountRequest1 .class, PaymentCard28 .class, PaymentContext26 .class, PaymentRequest1 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction9 .class, PointOfInteractionCapabilities8 .class, PointOfInteractionComponent9 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics5 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient5Choice.class, Recipient6Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, RetailerMessage1Code.class, RetailerSaleEnvironment2 .class, RetailerService2Code.class, ReversalReason1Code.class, ReversalRequest1 .class, SaleCapabilities1Code.class, SaleContext3 .class, SaleToPOIServiceRequestV01 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, ServiceRequest2 .class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, StoredValueAccount1 .class, StoredValueAccountType1Code.class, StoredValueData2 .class, StoredValueRequest2 .class, StoredValueTransactionType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption1Code.class, Traceability6 .class, TrackData2 .class, TrackFormat1Code.class, TransactionAction1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionToPerform1Choice.class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.001.001.01";

    public MxCasp00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp00100101(final String xml) {
        this();
        MxCasp00100101 tmp = parse(xml);
        saleToPOISvcReq = tmp.getSaleToPOISvcReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOISvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIServiceRequestV01 }
     *     
     */
    public SaleToPOIServiceRequestV01 getSaleToPOISvcReq() {
        return saleToPOISvcReq;
    }

    /**
     * Sets the value of the saleToPOISvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIServiceRequestV01 }
     *     
     */
    public MxCasp00100101 setSaleToPOISvcReq(SaleToPOIServiceRequestV01 value) {
        this.saleToPOISvcReq = value;
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
    public static MxCasp00100101 parse(String xml) {
        return ((MxCasp00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp00100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp00100101 parse(String xml, MxRead parserImpl) {
        return ((MxCasp00100101) parserImpl.read(MxCasp00100101 .class, xml, _classes));
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
     * Creates an MxCasp00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp00100101 message
     * @return
     *     a new instance of MxCasp00100101
     */
    public final static MxCasp00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp00100101 .class);
    }

}
