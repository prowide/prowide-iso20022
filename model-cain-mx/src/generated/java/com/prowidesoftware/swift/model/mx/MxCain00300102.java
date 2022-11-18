
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
 * Class for cain.003.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.003.001.02")
public class MxCain00300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinInitn", required = true)
    protected FinancialInitiationV02 finInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails2 .class, Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AddendumData1 .class, AddendumTaxType1Code.class, AdditionalAcceptorData1 .class, AdditionalAction1 .class, AdditionalAmounts1 .class, AdditionalCharacteristicDetails1 .class, AdditionalCharacteristics1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalIdentification1 .class, AdditionalIdentificationType1Code.class, AdditionalInformation19 .class, AdditionalInformation20 .class, AdditionalRiskData1 .class, AdditionalService1 .class, AdditionalServiceType1Code.class, Address1 .class, Adjustment10 .class, Adjustment11 .class, Adjustment9 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount10 .class, Amount11 .class, Amount12 .class, Amount13 .class, Amount14 .class, Amount4 .class, Amount5 .class, Amount9 .class, AmountDetails1 .class, AncillaryPurchase1 .class, ApprovalData1 .class, ApprovalEntity1 .class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationMethod11Code.class, AuthorisedAmount1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities1 .class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData1 .class, CardDataReading5Code.class, CardDataReading7Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardProgramme1 .class, CardProgrammeMode1 .class, CardProgrammeMode2 .class, Cardholder15 .class, CardholderName1 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CarrierIdentification1 .class, CertificateIssuer1 .class, ClaimInformation1 .class, CommunicationCharacteristics3 .class, CompanyAssigner2Code.class, Contact1 .class, Contact2 .class, Contact3 .class, Contact6 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context1 .class, CorporateTaxType1Code.class, Credentials1 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, Customer3 .class, Customer4 .class, Customer5 .class, Customer6 .class, CustomerAssigner1Code.class, CustomerDevice2 .class, CustomerDeviceType1Code.class, CustomerReference1 .class, CustomerType2Code.class, DeliveryInformation3 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, DepositDetails1 .class, Destination2 .class, DetailAmount1Code.class, DetailedAmount19 .class, Device1 .class, DigestedData5 .class, Discount3 .class, DisplayCapabilities6 .class, DisputeData1 .class, DisputeIdentification1 .class, DisputeReference1 .class, Distance1 .class, DocumentReference1 .class, Driver1 .class, DriverInParty1 .class, DrivingLicense1 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment1 .class, FeeAmount2 .class, FinancialInitiation1 .class, FinancialInitiationV02 .class, FinancialInstitution4 .class, FleetData2 .class, FleetDiscountTotals1 .class, FleetLineItem1 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetSummary1 .class, Frequency12Code.class, FundingService1 .class, FundingSource2 .class, FundingSourceType2Code.class, GenericIdentification172 .class, GenericIdentification48 .class, GenericInformation1 .class, GeographicCoordinates1 .class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header42 .class, HiredVehicle1 .class, Identification2Code.class, Instalment3 .class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, Invoice1 .class, InvoiceLineItem1 .class, InvoiceSummary1 .class, IssuerAndSerialNumber1 .class, JourneyInformation1 .class, JourneyType1Code.class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAmenity1 .class, Location3 .class, LocationAmenity1Code.class, Lodging2 .class, LodgingActivity1Code.class, LodgingLineItem1 .class, LodgingProperty1 .class, LodgingRoom1 .class, LodgingService1Code.class, LodgingSummary1 .class, LoyaltyMember1 .class, LoyaltyProgramme1 .class, LoyaltyProgramme2 .class, LoyaltyValueType1Code.class, MACData1 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageClass1Code.class, MessageFunction16Code.class, MxCain00300102 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OnLineCapability2Code.class, OriginalDataElements1 .class, OriginalTransactionAmount1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification197 .class, PartyIdentification200 .class, PartyIdentification203 .class, PartyIdentification206 .class, PartyIdentification207 .class, PartyIdentification208 .class, PartyIdentification209 .class, PartyIdentification210 .class, PartyIdentification211 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType7Code.class, PartyType9Code.class, PassengerTransport1 .class, PassengerTransportSummary1 .class, PaymentTransaction117 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PlainCardData20 .class, Plan1 .class, PlanOwner1Code.class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext1 .class, PresentationMedium2Code.class, Priority3Code.class, ProcessingResult1 .class, Product7 .class, ProductCodeType1Code.class, ProtectedData1 .class, PurchaseIdentifierType1Code.class, ReceiptType1Code.class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, RentalDetails1 .class, RentalRate1 .class, ReservationDetails3 .class, Response8Code.class, ResultData1 .class, RiskAssessment1 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext1 .class, RiskInputData1 .class, Sale1 .class, SaleContext7 .class, SaleItem2 .class, SaleSummary1 .class, SecurityCharacteristics1Code.class, ServiceStartEnd1 .class, SettlementReportingEntity1 .class, SettlementService1 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, ShippingData1 .class, ShippingPackage1 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax33 .class, TaxReclaimMethod1Code.class, TelecomCallDetails1 .class, TelecomServices1 .class, TelecomServicesLineItem1 .class, TelecomServicesSummary1 .class, TelephonyCallType1Code.class, TemporaryServices1 .class, TemporaryServicesCharge1Code.class, TemporaryServicesCompany1 .class, TemporaryServicesJob1 .class, TemporaryServicesLabor1 .class, Terminal1 .class, TerminalIdentification1 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Ticket1 .class, TimeSegment1Code.class, Token1 .class, Traceability7 .class, Track2Data1Choice.class, Transaction77 .class, TransactionAmount1 .class, TransactionAmounts1 .class, TransactionAttribute1Code.class, TransactionContext1 .class, TransactionIdentification8 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TransferService1 .class, TransportType1Code.class, TravelAgency2 .class, TravelAgencyPackage1 .class, TravelDocument1 .class, TripInformation1 .class, TripLeg1 .class, TypeOfAmount10Code.class, TypeOfAmount11Code.class, TypeOfAmount12Code.class, TypeOfAmount18Code.class, TypeOfAmount19Code.class, UnitOfMeasure1 .class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, UserInterface1Code.class, UserInterface6Code.class, Vehicle2 .class, Vehicle4 .class, Vehicle5 .class, VehicleRentalAgreement1 .class, VehicleRentalCompany1 .class, VehicleRentalCustomer1 .class, VehicleRentalInvoice1 .class, VehicleRentalService1 .class, Verification1 .class, Verification2Code.class, VerificationEntity1Code.class, VerificationInformation1 .class, VerificationResult1 .class, VerificationValue1Choice.class, Wallet1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.003.001.02";

    public MxCain00300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00300102(final String xml) {
        this();
        MxCain00300102 tmp = parse(xml);
        finInitn = tmp.getFinInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInitiationV02 }
     *     
     */
    public FinancialInitiationV02 getFinInitn() {
        return finInitn;
    }

    /**
     * Sets the value of the finInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInitiationV02 }
     *     
     */
    public MxCain00300102 setFinInitn(FinancialInitiationV02 value) {
        this.finInitn = value;
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
    public static MxCain00300102 parse(String xml) {
        return ((MxCain00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00300102 parse(String xml, MxRead parserImpl) {
        return ((MxCain00300102) parserImpl.read(MxCain00300102 .class, xml, _classes));
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
     * Creates an MxCain00300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00300102 message
     * @return
     *     a new instance of MxCain00300102
     */
    public final static MxCain00300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00300102 .class);
    }

}
