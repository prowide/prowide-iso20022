
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
 * Class for casp.010.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIRptRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.010.001.04")
public class MxCasp01000104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIRptRspn", required = true)
    protected SaleToPOIReportResponseV04 saleToPOIRptRspn;
    public static final transient String BUSINESS_PROCESS = "casp";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Acquirer10 .class, Action12 .class, ActionMessage9 .class, ActionType12Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, Amount5 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData8 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult17 .class, AuthorisationResult18 .class, BarcodeType1Code.class, BusinessArea1Code.class, BytePadding1Code.class, CapturedSignature1 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext29 .class, CardPaymentEnvironment78 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType14Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken5 .class, CardPaymentTransaction114 .class, CardPaymentTransaction120 .class, CardPaymentTransaction123 .class, CardPaymentTransactionDetails51 .class, CardProductType1Code.class, Cardholder18 .class, CardholderAuthentication15 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType29 .class, ContentInformationType30 .class, ContentInformationType32 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey16 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion23 .class, CurrencyConversion24 .class, CurrencyConversion25 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, Exemption1Code.class, ExternallyDefinedData3 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header41 .class, InformationQualify1Code.class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InstalmentPlan1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport8 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyAmount1 .class, LoyaltyHandling1Code.class, LoyaltyRebates1 .class, LoyaltyResult3 .class, LoyaltyServerData1 .class, LoyaltyTransactionTotals1 .class, LoyaltyTypeTransactionTotals1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MobileData4 .class, MxCasp01000104 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN9 .class, OnLineReason2Code.class, Organisation26 .class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType3 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard32 .class, PaymentContext28 .class, PaymentInstrumentType1Code.class, PaymentReceipt4 .class, PaymentResponse4 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PlanOwner1Code.class, PointOfInteraction12 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent12 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics8 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PointOfInteractionTransactionReport4 .class, PostalAddress2 .class, PostalAddress22 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient11Choice.class, Recipient12Choice.class, RecurringTransaction4 .class, RelativeDistinguishedName1 .class, ReportGetTotalsResponse1 .class, ReportResponse5 .class, ReportTransactionResponse4 .class, Response11Code.class, Response9Code.class, ResponseType10 .class, ResponseType11 .class, RetailerMessage1Code.class, RetailerPaymentResult4 .class, RetailerResultDetail1Code.class, RetailerSaleEnvironment2 .class, RetailerService7Code.class, SaleCapabilities1Code.class, SaleContext4 .class, SaleItemRebate1 .class, SaleToPOIReportResponseV04 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData7 .class, Signer6 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals8 .class, TransactionTotalsSet1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, TypeTransactionTotals3Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.010.001.04";

    public MxCasp01000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp01000104(final String xml) {
        this();
        MxCasp01000104 tmp = parse(xml);
        saleToPOIRptRspn = tmp.getSaleToPOIRptRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp01000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIRptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIReportResponseV04 }
     *     
     */
    public SaleToPOIReportResponseV04 getSaleToPOIRptRspn() {
        return saleToPOIRptRspn;
    }

    /**
     * Sets the value of the saleToPOIRptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIReportResponseV04 }
     *     
     */
    public MxCasp01000104 setSaleToPOIRptRspn(SaleToPOIReportResponseV04 value) {
        this.saleToPOIRptRspn = value;
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
    public static MxCasp01000104 parse(String xml) {
        return ((MxCasp01000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp01000104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp01000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp01000104 parse(String xml, MxRead parserImpl) {
        return ((MxCasp01000104) parserImpl.read(MxCasp01000104 .class, xml, _classes));
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
     * Creates an MxCasp01000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp01000104 message
     * @return
     *     a new instance of MxCasp01000104
     */
    public static final MxCasp01000104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp01000104 .class);
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
