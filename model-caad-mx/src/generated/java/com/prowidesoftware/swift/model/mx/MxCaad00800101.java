
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
 * Class for caad.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "admstvInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.008.001.01")
public class MxCaad00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdmstvInitn", required = true)
    protected AdministrativeInitiationV01 admstvInitn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountDetails3 .class, Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AddendumData3 .class, AddendumTaxType2Code.class, AdditionalAcceptorData1 .class, AdditionalAction1 .class, AdditionalAmounts3 .class, AdditionalCharacteristicDetails1 .class, AdditionalCharacteristics1 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee2 .class, AdditionalIdentification1 .class, AdditionalIdentificationType1Code.class, AdditionalInformation19 .class, AdditionalInformation29 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Address3 .class, Adjustment10 .class, Adjustment12 .class, Adjustment9 .class, AdministrativeInitiation1 .class, AdministrativeInitiationV01 .class, AdministrativeType1Code.class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount12 .class, Amount13 .class, Amount15 .class, Amount16 .class, Amount17 .class, Amount18 .class, Amount19 .class, Amount20 .class, AmountDetails2 .class, AncillaryPurchase2 .class, ApprovalEntity2 .class, AttributeType1Code.class, AuthenticatedData5 .class, AuthorisedAmount1 .class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities2 .class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData6 .class, CardData7 .class, CardDataReading10Code.class, CardDataReading5Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardProgramme2 .class, CardProgrammeMode2 .class, CardProgrammeMode3 .class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CarrierIdentification1 .class, CertificateIssuer1 .class, ClaimInformation1 .class, CommunicationCharacteristics3 .class, CompanyAssigner2Code.class, Contact1 .class, Contact2 .class, Contact3 .class, Contact6 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context12 .class, Context18 .class, CorporateTaxType1Code.class, Credentials2 .class, CreditDebit3Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, Customer4 .class, Customer6 .class, Customer7 .class, Customer8 .class, CustomerAssigner1Code.class, CustomerDevice4 .class, CustomerDeviceType2Code.class, CustomerReference1 .class, CustomerType2Code.class, DeliveryInformation4 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, DepositDetails2 .class, Destination3 .class, DetailedAmount22 .class, Device2 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DeviceOperatingSystem1 .class, DeviceOperatingSystemType1Code.class, DigestedData5 .class, Discount3 .class, DisplayCapabilities6 .class, DisputeData3 .class, DisputeIdentification1 .class, DisputeReference1 .class, Distance1 .class, DocumentReference1 .class, Driver2 .class, DriverInParty2 .class, DrivingLicense2 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment20 .class, Environment34 .class, ErrorDetails2 .class, ExchangeRateAgreementType1Code.class, ExchangeRateDetail1 .class, ExchangeRateInformation2 .class, ExchangeRateType2Code.class, FeeAmount3 .class, FinancialInstitution7 .class, FleetData4 .class, FleetDiscountTotals1 .class, FleetLineItem4 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetSummary2 .class, Frequency12Code.class, Frequency18Code.class, FundingService2 .class, FundingSource2 .class, FundingSourceType2Code.class, GenericIdentification183 .class, GenericIdentification48 .class, GenericInformation1 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, GracePeriod2 .class, GracePeriodUnitType1Code.class, Header66 .class, HiredVehicle2 .class, ICCFallbackReason1Code.class, Identification3Code.class, Instalment4 .class, InstalmentAmountDetails2 .class, InstalmentAmountDetailsType2Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, Invoice2 .class, InvoiceLineItem2 .class, InvoiceSummary2 .class, IssuerAndSerialNumber1 .class, JourneyInformation1 .class, JourneyType1Code.class, Jurisdiction2 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, LegalStructure1Code.class, LocalAmenity1 .class, LocalData1 .class, LocalData2 .class, LocalData3 .class, LocalData4 .class, LocalData5 .class, LocalData7 .class, LocalData9 .class, Location4 .class, LocationAmenity1Code.class, Lodging3 .class, LodgingActivity1Code.class, LodgingLineItem2 .class, LodgingProperty2 .class, LodgingRoom1 .class, LodgingService1Code.class, LodgingSummary2 .class, LoyaltyMember2 .class, LoyaltyProgramme2 .class, LoyaltyProgramme3 .class, LoyaltyValueType1Code.class, MACData1 .class, MOTO1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageError1Code.class, MessageFunction29Code.class, MxCaad00800101 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OnLineCapability2Code.class, OriginalTransaction2 .class, OriginalTransactionAmount2 .class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, PINEntrySecurityCharacteristic1Code.class, POICommunicationType2Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification200 .class, PartyIdentification208 .class, PartyIdentification210 .class, PartyIdentification254 .class, PartyIdentification255 .class, PartyIdentification257 .class, PartyIdentification258 .class, PartyIdentification259 .class, PartyIdentification260 .class, PartyIdentification261 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType7Code.class, PartyType9Code.class, PassengerTransport2 .class, PassengerTransportSummary2 .class, PaymentTransaction141 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PlainCardData21 .class, Plan2 .class, PlanOwner1Code.class, PointOfInteractionComponent13 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification3 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext3 .class, PresentationMedium2Code.class, Priority3Code.class, ProcessingResult10 .class, ProcessingResult16 .class, Product7 .class, ProductCodeType1Code.class, ProtectedData1 .class, ProtectionMethod1Code.class, PurchaseIdentifierType1Code.class, QRCodePresentmentMode1Code.class, RateLock1 .class, ReceiptType1Code.class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, RentalDetails2 .class, RentalRate1 .class, ReservationDetails3 .class, Response8Code.class, ResultData7 .class, RiskAssessment1Code.class, RiskAssessment2 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext2 .class, RiskInputData1 .class, Sale2 .class, SaleContext8 .class, SaleItem3 .class, SaleSummary1 .class, SecurityCharacteristics1Code.class, ServiceStartEnd2 .class, SettlementReportingEntity1 .class, SettlementService3 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, ShippingData2 .class, ShippingPackage2 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax39 .class, TaxReclaimMethod1Code.class, TelecomCallDetails2 .class, TelecomServices2 .class, TelecomServicesLineItem2 .class, TelecomServicesSummary2 .class, TelephonyCallType1Code.class, TemporaryServices2 .class, TemporaryServicesCharge1Code.class, TemporaryServicesCompany2 .class, TemporaryServicesJob1 .class, TemporaryServicesLabor1 .class, Terminal4 .class, Terminal5 .class, TerminalIdentification3 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Ticket2 .class, TimeSegment1Code.class, Token2 .class, Traceability9 .class, Track2Data1Choice.class, Transaction144 .class, Transaction147 .class, TransactionAmount1 .class, TransactionAmounts2 .class, TransactionAttribute2Code.class, TransactionContext7 .class, TransactionIdentification12 .class, TransactionIdentification18 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TransactionLifeCycleIdentification2 .class, TransferService2 .class, TransportType1Code.class, TravelAgency3 .class, TravelAgencyPackage1 .class, TravelDocument2 .class, TripInformation1 .class, TripLeg2 .class, TypeOfAmount19Code.class, TypeOfAmount20Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, UnitOfMeasure2 .class, UserInterface1Code.class, UserInterface6Code.class, Vehicle2 .class, Vehicle4 .class, Vehicle5 .class, VehicleRentalAgreement2 .class, VehicleRentalCompany2 .class, VehicleRentalCustomer2 .class, VehicleRentalInvoice2 .class, VehicleRentalService2 .class, Verification3Code.class, Verification4 .class, Verification5 .class, VerificationEntity2Code.class, VerificationInformation1 .class, VerificationResult2 .class, VerificationValue1Choice.class, Wallet2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.008.001.01";

    public MxCaad00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00800101(final String xml) {
        this();
        MxCaad00800101 tmp = parse(xml);
        admstvInitn = tmp.getAdmstvInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the admstvInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeInitiationV01 }
     *     
     */
    public AdministrativeInitiationV01 getAdmstvInitn() {
        return admstvInitn;
    }

    /**
     * Sets the value of the admstvInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeInitiationV01 }
     *     
     */
    public MxCaad00800101 setAdmstvInitn(AdministrativeInitiationV01 value) {
        this.admstvInitn = value;
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
    public static MxCaad00800101 parse(String xml) {
        return ((MxCaad00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00800101 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00800101) parserImpl.read(MxCaad00800101 .class, xml, _classes));
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
     * Creates an MxCaad00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00800101 message
     * @return
     *     a new instance of MxCaad00800101
     */
    public static final MxCaad00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00800101 .class);
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
