
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
 * Class for cain.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "authstnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.001.001.04")
public class MxCain00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AuthstnInitn", required = true)
    protected AuthorisationInitiationV04 authstnInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountBalance3 .class, AccountDetails4 .class, Action16 .class, ActionDestination1Code.class, ActionType14Code.class, ActionType8Code.class, AddendumData6 .class, AddendumTaxType3Code.class, AdditionalAmounts4 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalInformation31 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Adjustment13 .class, Adjustment14 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount12 .class, Amount13 .class, Amount21 .class, Amount22 .class, Amount23 .class, AmountDetails3 .class, AncillaryPurchase3 .class, AttestationValue1Code.class, AttributeType1Code.class, AuthorisationInitiationV04 .class, AuthorisedAmount2 .class, Authority1 .class, Balance29 .class, BalanceType15Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData11 .class, CardDataReading10Code.class, CardDataReading5Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder22 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, CompanyAssigner2Code.class, ContactBusiness1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context19 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, Customer4 .class, Customer9 .class, CustomerAssigner1Code.class, CustomerDevice5 .class, CustomerDeviceType2Code.class, CustomerReference1 .class, CustomerType2Code.class, DateTime2 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, DepositDetails3 .class, DetailedAmount22 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, Discount3 .class, DisplayCapabilities6 .class, Distance1 .class, DocumentReference1 .class, Driver3 .class, DriverInParty3 .class, ECommerceData1 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData12 .class, ExchangeRateAgreementType1Code.class, ExchangeRateInformation5 .class, ExchangeRateType2Code.class, Exemption2 .class, Exemption2Code.class, FinancialInstitution8 .class, FleetData6 .class, FleetLineItem5 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetTransactionDetail1 .class, Frequency12Code.class, Frequency18Code.class, FundingService3 .class, FundingSource4 .class, FundingSourceType3Code.class, GenericIdentification183 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, GracePeriodUnitType1Code.class, Header71 .class, HiredVehicle3 .class, ICCFallbackReason1Code.class, Instalment6 .class, InstalmentAmountDetails3 .class, InstalmentAmountDetailsType3Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, Invoice3 .class, InvoiceLineItem3 .class, IssuerAndSerialNumber1 .class, JourneyType1Code.class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAmenity1 .class, LocalData10 .class, LocalData11 .class, LocalData12 .class, LocalData13 .class, LocalData14 .class, LocalData15 .class, Location6 .class, LocationAmenity1Code.class, Lodging4 .class, LodgingActivity1Code.class, LodgingLineItem3 .class, LodgingRoom2 .class, LodgingService1Code.class, LoyaltyProgramme4 .class, LoyaltyProgramme5 .class, LoyaltyValueType1Code.class, MACData1 .class, MOTO2Code.class, MessageClass1Code.class, MessageFunction16Code.class, MxCain00100104 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OnLineCapability2Code.class, OriginalDataElements3 .class, OriginalTransactionAmounts3 .class, OriginalTransactionIdentification1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, PINEntrySecurityCharacteristic1Code.class, POIComponentType5Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification287 .class, PartyIdentification288 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType34Code.class, PartyType9Code.class, PassengerTransport3 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PeriodUnit4Code.class, PlainCardData23 .class, Plan3 .class, PlanOwner1Code.class, PointOfInteractionComponent16 .class, PresentationMedium2Code.class, ProcessingResult27 .class, Product8 .class, ProductCodeType1Code.class, ProgrammeMode4 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, QRCodePresentmentMode1Code.class, ReceiptType1Code.class, Recipient5Choice.class, Recipient7Choice.class, RecommendationAction1 .class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RentalDetails3 .class, RentalRate1 .class, RentalRate2 .class, RiskAssessment1Code.class, RiskAssessment3 .class, RiskContext3 .class, RiskInputData2 .class, Sale3 .class, SaleItem4 .class, SecurityCharacteristics1Code.class, ServiceStartEnd3 .class, SettlementService5 .class, ShippingData3 .class, ShippingPackage3 .class, Software1 .class, SoftwareType1Code.class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, SponsoredMerchant3 .class, StorageLocation1Code.class, StrongCustomerAuthentication2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax41 .class, TaxReclaimMethod1Code.class, TelecomServices3 .class, TelecomServicesLineItem3 .class, TelephonyCallType1Code.class, TemporaryServices3 .class, TemporaryServicesCharge1Code.class, Terminal7 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, TimeSegment1Code.class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAmounts3 .class, TransactionAttribute2Code.class, TransactionCharacteristics1 .class, TransactionIdentification57 .class, TransactionInitiator1Code.class, TransportType1Code.class, TravelAgency4 .class, TravelAgencyPackage2 .class, TravelDocument2 .class, TripLeg3 .class, TypeOfAmount19Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, TypeOfAmount23Code.class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, UserInterface1Code.class, Vehicle2 .class, Vehicle6 .class, VehicleRentalAgreement3 .class, VehicleRentalInvoice3 .class, VehicleRentalService3 .class, Verification3Code.class, Verification6 .class, VerificationEntity2Code.class, VerificationValue1 .class, Wallet3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.001.001.04";

    public MxCain00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00100104(final String xml) {
        this();
        MxCain00100104 tmp = parse(xml);
        authstnInitn = tmp.getAuthstnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the authstnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationInitiationV04 }
     *     
     */
    public AuthorisationInitiationV04 getAuthstnInitn() {
        return authstnInitn;
    }

    /**
     * Sets the value of the authstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationInitiationV04 }
     *     
     */
    public MxCain00100104 setAuthstnInitn(AuthorisationInitiationV04 value) {
        this.authstnInitn = value;
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
    public static MxCain00100104 parse(String xml) {
        return ((MxCain00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00100104 parse(String xml, MxRead parserImpl) {
        return ((MxCain00100104) parserImpl.read(MxCain00100104 .class, xml, _classes));
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
     * Creates an MxCain00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00100104 message
     * @return
     *     a new instance of MxCain00100104
     */
    public final static MxCain00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00100104 .class);
    }

}
