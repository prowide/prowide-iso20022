
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for cain.025.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "adddmInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.04")
public class MxCain02500104
    extends AbstractMX
{

    @XmlElement(name = "AdddmInitn", required = true)
    protected AddendumInitiationV04 adddmInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 25;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData1 .class, AcquirerData1 .class, AddendumInitiationV04 .class, AddendumTaxType4Code.class, AdditionalEnteredFleetData1 .class, AdditionalFee4 .class, Address4 .class, Adjustment13 .class, Adjustment14 .class, Amount13 .class, AmountAndTax1 .class, AncillaryPurchase4 .class, AuthorisedAmount2 .class, Authority1 .class, CarRentalActivity2Code.class, CarRentalServiceType3Code.class, CardData14 .class, CardDataReading5Code.class, ContactBusiness1 .class, ContactBusiness2 .class, ContactPersonal1 .class, ContactPersonal2 .class, ContentInformationType41 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, Customer10 .class, Customer4 .class, CustomerAssigner1Code.class, CustomerReference1 .class, CustomerType2Code.class, DateTime2 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, DestinationData1 .class, DriverInParty4 .class, DriverOrVehicleCardData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, FleetData7 .class, FleetDriverData2 .class, FleetLineItem7 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetTransactionDetail2 .class, FleetVehicleData1 .class, Header72 .class, HiredVehicle4 .class, Invoice4 .class, InvoiceLineItem4 .class, IssuerData1 .class, Jurisdiction2 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalAmenity2 .class, LocalData19 .class, LocalData20 .class, LocationAmenity2Code.class, Lodging5 .class, LodgingActivity2Code.class, LodgingLineItem4 .class, LodgingRoom2 .class, LodgingService1Code.class, LoyaltyProgramme4 .class, MACData1 .class, MessageClass2Code.class, MessageFunction16Code.class, MxCain02500104 .class, OfficialDocumentType2Code.class, OnBoardDiagnostics1 .class, OriginalDataElements6 .class, OriginalTransactionAmounts4 .class, OriginalTransactionIdentification2 .class, OriginatorData2 .class, PassengerTransport4 .class, PeriodUnit5Code.class, PresentationMedium2Code.class, Product8 .class, ProductCodeType1Code.class, ProgrammeMode6 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, ReceiverData1 .class, Reconciliation5 .class, RentalRate3 .class, Sale4 .class, SaleItem5 .class, SenderData1 .class, SettlementService7 .class, ShippingData4 .class, ShippingPackage4 .class, StorageLocation2Code.class, Tax44 .class, TaxReclaimMethod1Code.class, TelecomBillingEventAmount1 .class, TelecomLineItemAmount1 .class, TelecomServices4 .class, TelecomServicesLineItem4 .class, TelephonyCallType2Code.class, TemporaryServiceChargeRate1 .class, TemporaryServices4 .class, TemporaryServicesCharge2Code.class, Token4 .class, Token5 .class, TransactionIdentification62 .class, TransactionSpecificData1 .class, TransportType2Code.class, TravelAgency5 .class, TravelAgencyPackage2 .class, TravelDocument3 .class, TripLeg4 .class, TypeOfAmount22Code.class, TypeOfAmount24Code.class, TypeOfAmount25Code.class, UnitOfMeasure10Code.class, UnitOfMeasure14Code.class, UnitOfMeasure1Code.class, Vehicle2 .class, VehicleRentalAdditionalAmount1 .class, VehicleRentalService4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.025.001.04";

    public MxCain02500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02500104(final String xml) {
        this();
        MxCain02500104 tmp = parse(xml);
        adddmInitn = tmp.getAdddmInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumInitiationV04 }
     *     
     */
    public AddendumInitiationV04 getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumInitiationV04 }
     *     
     */
    public MxCain02500104 setAdddmInitn(AddendumInitiationV04 value) {
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
    public static MxCain02500104 parse(String xml) {
        return ((MxCain02500104) MxReadImpl.parse(MxCain02500104 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02500104) MxReadImpl.parse(MxCain02500104 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02500104 parse(String xml, MxRead parserImpl) {
        return ((MxCain02500104) parserImpl.read(MxCain02500104 .class, xml, _classes));
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
     * Creates an MxCain02500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02500104 message
     * @return
     *     a new instance of MxCain02500104
     */
    public static final MxCain02500104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCain02500104 .class);
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
