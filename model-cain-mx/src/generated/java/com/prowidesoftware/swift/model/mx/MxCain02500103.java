
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
 * Class for cain.025.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "adddmInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.03")
public class MxCain02500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdddmInitn", required = true)
    protected AddendumInitiationV03 adddmInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 25;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddendumData6 .class, AddendumInitiationV03 .class, AddendumTaxType3Code.class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalInformation31 .class, Address2 .class, Adjustment13 .class, Adjustment14 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount12 .class, Amount13 .class, Amount21 .class, Amount22 .class, Amount23 .class, AmountDetails3 .class, AncillaryPurchase3 .class, AttributeType1Code.class, AuthorisedAmount2 .class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CarRentalActivity1Code.class, CarRentalServiceType2Code.class, CardData14 .class, CardDataReading5Code.class, CardholderName3 .class, CertificateIssuer1 .class, CompanyAssigner2Code.class, ContactBusiness1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, Customer4 .class, Customer9 .class, CustomerAssigner1Code.class, CustomerReference1 .class, CustomerType2Code.class, DateTime2 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, Discount3 .class, Distance1 .class, DocumentReference1 .class, Driver3 .class, DriverInParty3 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, FleetData6 .class, FleetLineItem5 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetTransactionDetail1 .class, GenericIdentification183 .class, Header71 .class, HiredVehicle3 .class, Invoice3 .class, InvoiceLineItem3 .class, IssuerAndSerialNumber1 .class, JourneyType1Code.class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAmenity1 .class, LocalData11 .class, LocalData12 .class, LocalData14 .class, Location6 .class, LocationAmenity1Code.class, Lodging4 .class, LodgingActivity1Code.class, LodgingLineItem3 .class, LodgingRoom2 .class, LodgingService1Code.class, LoyaltyProgramme4 .class, LoyaltyProgramme5 .class, LoyaltyValueType1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction16Code.class, MxCain02500103 .class, OfficialDocumentType1Code.class, OnBoardDiagnostics1 .class, OriginalDataElements3 .class, OriginalTransactionAmounts3 .class, OriginalTransactionIdentification1 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification288 .class, PartyType17Code.class, PartyType18Code.class, PartyType32Code.class, PassengerTransport3 .class, PeriodUnit2Code.class, PeriodUnit3Code.class, PeriodUnit4Code.class, PlainCardData23 .class, PresentationMedium2Code.class, Product8 .class, ProductCodeType1Code.class, ProgrammeMode5 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RentalDetails3 .class, RentalRate1 .class, RentalRate2 .class, Sale3 .class, SaleItem4 .class, ServiceStartEnd3 .class, SettlementService6 .class, ShippingData3 .class, ShippingPackage3 .class, SponsoredMerchant3 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Tax41 .class, TaxReclaimMethod1Code.class, TelecomServices3 .class, TelecomServicesLineItem3 .class, TelephonyCallType1Code.class, TemporaryServices3 .class, TemporaryServicesCharge1Code.class, TimeSegment1Code.class, Token2 .class, Traceability10 .class, TransactionIdentification53 .class, TransportType1Code.class, TravelAgency4 .class, TravelAgencyPackage2 .class, TravelDocument2 .class, TripLeg3 .class, TypeOfAmount19Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, TypeOfAmount23Code.class, UnitOfMeasure10Code.class, UnitOfMeasure1Code.class, Vehicle2 .class, Vehicle6 .class, VehicleRentalAgreement3 .class, VehicleRentalInvoice3 .class, VehicleRentalService3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.03";

    public MxCain02500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02500103(final String xml) {
        this();
        MxCain02500103 tmp = parse(xml);
        adddmInitn = tmp.getAdddmInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumInitiationV03 }
     *     
     */
    public AddendumInitiationV03 getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumInitiationV03 }
     *     
     */
    public MxCain02500103 setAdddmInitn(AddendumInitiationV03 value) {
        this.adddmInitn = value;
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
    public static MxCain02500103 parse(String xml) {
        return ((MxCain02500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02500103 parse(String xml, MxRead parserImpl) {
        return ((MxCain02500103) parserImpl.read(MxCain02500103 .class, xml, _classes));
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
     * Creates an MxCain02500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02500103 message
     * @return
     *     a new instance of MxCain02500103
     */
    public static final MxCain02500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02500103 .class);
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
