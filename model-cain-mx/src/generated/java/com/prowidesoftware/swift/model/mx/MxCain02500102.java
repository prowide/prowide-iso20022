
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for cain.025.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "adddmInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.02")
public class MxCain02500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdddmInitn", required = true)
    protected AddendumInitiationV02 adddmInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddendumData3 .class, AddendumInitiation2 .class, AddendumInitiationV02 .class, AddendumTaxType2Code.class, AdditionalAcceptorData1 .class, AdditionalCharacteristicDetails1 .class, AdditionalCharacteristics1 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalIdentification1 .class, AdditionalIdentificationType1Code.class, AdditionalInformation19 .class, Address2 .class, Address3 .class, Adjustment10 .class, Adjustment12 .class, Adjustment9 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount12 .class, Amount13 .class, Amount16 .class, Amount18 .class, Amount19 .class, Amount20 .class, AmountDetails2 .class, AncillaryPurchase2 .class, AttributeType1Code.class, AuthorisedAmount1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData2 .class, CardDataReading5Code.class, CardProgrammeMode3 .class, CardholderName3 .class, CarrierIdentification1 .class, CertificateIssuer1 .class, CompanyAssigner2Code.class, Contact2 .class, Contact3 .class, Contact6 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CorporateTaxType1Code.class, CreditDebit3Code.class, Customer4 .class, Customer6 .class, Customer8 .class, CustomerAssigner1Code.class, CustomerReference1 .class, CustomerType2Code.class, DeliveryInformation4 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, Destination3 .class, Discount3 .class, Distance1 .class, DocumentReference1 .class, Driver2 .class, DriverInParty2 .class, DrivingLicense2 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment30 .class, FeeAmount3 .class, FleetData4 .class, FleetDiscountTotals1 .class, FleetLineItem4 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetSummary2 .class, Frequency18Code.class, GenericIdentification183 .class, GracePeriod2 .class, GracePeriodUnitType1Code.class, Header66 .class, HiredVehicle2 .class, Instalment4 .class, InstalmentAmountDetails2 .class, InstalmentAmountDetailsType2Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, Invoice2 .class, InvoiceLineItem2 .class, InvoiceSummary2 .class, IssuerAndSerialNumber1 .class, JourneyInformation1 .class, JourneyType1Code.class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAmenity1 .class, LocalData1 .class, LocalData4 .class, LocalData5 .class, Location4 .class, LocationAmenity1Code.class, Lodging3 .class, LodgingActivity1Code.class, LodgingLineItem2 .class, LodgingProperty2 .class, LodgingRoom1 .class, LodgingService1Code.class, LodgingSummary2 .class, LoyaltyMember2 .class, LoyaltyProgramme2 .class, LoyaltyProgramme3 .class, LoyaltyValueType1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction16Code.class, MessageFunction29Code.class, MxCain02500102 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OriginalDataElements2 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification208 .class, PartyIdentification210 .class, PartyIdentification255 .class, PartyIdentification258 .class, PartyIdentification259 .class, PartyIdentification260 .class, PartyIdentification261 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PassengerTransport2 .class, PassengerTransportSummary2 .class, PaymentTransaction141 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PlainCardData21 .class, Plan2 .class, PlanOwner1Code.class, PresentationMedium2Code.class, Priority3Code.class, Product7 .class, ProductCodeType1Code.class, ProtectedData1 .class, ProtectionMethod1Code.class, PurchaseIdentifierType1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, RentalDetails2 .class, RentalRate1 .class, ReservationDetails3 .class, Sale2 .class, SaleItem3 .class, SaleSummary1 .class, ServiceStartEnd2 .class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, ShippingData2 .class, ShippingPackage2 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax39 .class, TaxReclaimMethod1Code.class, TelecomCallDetails2 .class, TelecomServices2 .class, TelecomServicesLineItem2 .class, TelecomServicesSummary2 .class, TelephonyCallType1Code.class, TemporaryServices2 .class, TemporaryServicesCharge1Code.class, TemporaryServicesCompany2 .class, TemporaryServicesJob1 .class, TemporaryServicesLabor1 .class, Ticket2 .class, TimeSegment1Code.class, Token2 .class, Traceability9 .class, Transaction148 .class, TransactionContext10 .class, TransactionIdentification20 .class, TransactionLifeCycleIdentification1 .class, TransportType1Code.class, TravelAgency3 .class, TravelAgencyPackage1 .class, TravelDocument2 .class, TripInformation1 .class, TripLeg2 .class, TypeOfAmount19Code.class, TypeOfAmount20Code.class, TypeOfAmount21Code.class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, UnitOfMeasure2 .class, Vehicle2 .class, Vehicle4 .class, Vehicle5 .class, VehicleRentalAgreement2 .class, VehicleRentalCompany2 .class, VehicleRentalCustomer2 .class, VehicleRentalInvoice2 .class, VehicleRentalService2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.02";

    public MxCain02500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02500102(final String xml) {
        this();
        MxCain02500102 tmp = parse(xml);
        adddmInitn = tmp.getAdddmInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumInitiationV02 }
     *     
     */
    public AddendumInitiationV02 getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumInitiationV02 }
     *     
     */
    public MxCain02500102 setAdddmInitn(AddendumInitiationV02 value) {
        this.adddmInitn = value;
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
    public static MxCain02500102 parse(String xml) {
        return ((MxCain02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02500102 parse(String xml, MxRead parserImpl) {
        return ((MxCain02500102) parserImpl.read(MxCain02500102 .class, xml, _classes));
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
     * Creates an MxCain02500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02500102 message
     * @return
     *     a new instance of MxCain02500102
     */
    public final static MxCain02500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02500102 .class);
    }

}
