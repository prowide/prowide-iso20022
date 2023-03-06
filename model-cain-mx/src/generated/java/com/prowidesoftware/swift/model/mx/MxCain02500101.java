
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
 * Class for cain.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "adddmInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.01")
public class MxCain02500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdddmInitn", required = true)
    protected AddendumInitiationV01 adddmInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddendumData1 .class, AddendumInitiation1 .class, AddendumInitiationV01 .class, AddendumTaxType1Code.class, AdditionalAcceptorData1 .class, AdditionalCharacteristicDetails1 .class, AdditionalCharacteristics1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalIdentification1 .class, AdditionalIdentificationType1Code.class, AdditionalInformation19 .class, Address1 .class, Adjustment10 .class, Adjustment11 .class, Adjustment9 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount10 .class, Amount11 .class, Amount12 .class, Amount13 .class, Amount5 .class, Amount9 .class, AmountDetails1 .class, AncillaryPurchase1 .class, AttributeType1Code.class, AuthorisedAmount1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData2 .class, CardDataReading5Code.class, CardProgrammeMode1 .class, CarrierIdentification1 .class, CertificateIssuer1 .class, CompanyAssigner2Code.class, Contact2 .class, Contact3 .class, Contact6 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context8 .class, CorporateTaxType1Code.class, Customer4 .class, Customer5 .class, Customer6 .class, CustomerAssigner1Code.class, CustomerReference1 .class, CustomerType2Code.class, DeliveryInformation3 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, Destination2 .class, Discount3 .class, Distance1 .class, DocumentReference1 .class, Driver1 .class, DriverInParty1 .class, DrivingLicense1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment16 .class, FeeAmount2 .class, FleetData2 .class, FleetDiscountTotals1 .class, FleetLineItem1 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetSummary1 .class, Frequency12Code.class, GenericIdentification172 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header48 .class, HiredVehicle1 .class, Instalment3 .class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, Invoice1 .class, InvoiceLineItem1 .class, InvoiceSummary1 .class, IssuerAndSerialNumber1 .class, JourneyInformation1 .class, JourneyType1Code.class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAmenity1 .class, Location3 .class, LocationAmenity1Code.class, Lodging2 .class, LodgingActivity1Code.class, LodgingLineItem1 .class, LodgingProperty1 .class, LodgingRoom1 .class, LodgingService1Code.class, LodgingSummary1 .class, LoyaltyMember1 .class, LoyaltyProgramme1 .class, LoyaltyProgramme2 .class, LoyaltyValueType1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction29Code.class, MxCain02500101 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OriginalDataElements1 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyIdentification206 .class, PartyIdentification207 .class, PartyIdentification208 .class, PartyIdentification209 .class, PartyIdentification210 .class, PartyType17Code.class, PartyType18Code.class, PassengerTransport1 .class, PassengerTransportSummary1 .class, PaymentTransaction117 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PlainCardData20 .class, Plan1 .class, PlanOwner1Code.class, PresentationMedium2Code.class, Product7 .class, ProductCodeType1Code.class, ProtectedData1 .class, PurchaseIdentifierType1Code.class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, RentalDetails1 .class, RentalRate1 .class, ReservationDetails3 .class, Sale1 .class, SaleItem2 .class, SaleSummary1 .class, ServiceStartEnd1 .class, ShippingData1 .class, ShippingPackage1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax33 .class, TaxReclaimMethod1Code.class, TelecomCallDetails1 .class, TelecomServices1 .class, TelecomServicesLineItem1 .class, TelecomServicesSummary1 .class, TelephonyCallType1Code.class, TemporaryServices1 .class, TemporaryServicesCharge1Code.class, TemporaryServicesCompany1 .class, TemporaryServicesJob1 .class, TemporaryServicesLabor1 .class, Ticket1 .class, TimeSegment1Code.class, Token1 .class, Traceability7 .class, Transaction91 .class, TransactionContext5 .class, TransactionIdentification14 .class, TransactionLifeCycleIdentification1 .class, TransportType1Code.class, TravelAgency2 .class, TravelAgencyPackage1 .class, TravelDocument1 .class, TripInformation1 .class, TripLeg1 .class, TypeOfAmount10Code.class, TypeOfAmount18Code.class, TypeOfAmount19Code.class, UnitOfMeasure1 .class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, Vehicle2 .class, Vehicle4 .class, Vehicle5 .class, VehicleRentalAgreement1 .class, VehicleRentalCompany1 .class, VehicleRentalCustomer1 .class, VehicleRentalInvoice1 .class, VehicleRentalService1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.01";

    public MxCain02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02500101(final String xml) {
        this();
        MxCain02500101 tmp = parse(xml);
        adddmInitn = tmp.getAdddmInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumInitiationV01 }
     *     
     */
    public AddendumInitiationV01 getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumInitiationV01 }
     *     
     */
    public MxCain02500101 setAdddmInitn(AddendumInitiationV01 value) {
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
    public static MxCain02500101 parse(String xml) {
        return ((MxCain02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02500101 parse(String xml, MxRead parserImpl) {
        return ((MxCain02500101) parserImpl.read(MxCain02500101 .class, xml, _classes));
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
     * Creates an MxCain02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02500101 message
     * @return
     *     a new instance of MxCain02500101
     */
    public final static MxCain02500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02500101 .class);
    }

}
