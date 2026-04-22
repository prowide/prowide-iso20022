
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
 * Class for cain.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "authstnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.001.001.05")
public class MxCain00100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AuthstnInitn", required = true)
    protected AuthorisationInitiationV05 authstnInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData1 .class, AccountBalance4 .class, AccountDetails4 .class, AcquirerData1 .class, AddendumTaxType4Code.class, AdditionalAmounts5 .class, AdditionalData1 .class, AdditionalEnteredFleetData1 .class, AdditionalFee4 .class, AdditionalService3 .class, AdditionalServiceType3Code.class, Address4 .class, Adjustment13 .class, Adjustment14 .class, Amount13 .class, AmountAndTax1 .class, AncillaryPurchase4 .class, AttestationValue1Code.class, AuthorisationInitiationV05 .class, AuthorisedAmount2 .class, Authority1 .class, BenefitSupportingData1 .class, CarRentalActivity2Code.class, CarRentalServiceType3Code.class, CardAccountBalance1 .class, CardAuthenticationData1 .class, CardData16 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardDataReading5Code.class, CardDataWriting2Code.class, CardDepositType2Code.class, CardExchangeRate1 .class, Cardholder23 .class, CardholderName2 .class, CardholderVerificationCapability6Code.class, ContactBusiness1 .class, ContactBusiness2 .class, ContactPersonal1 .class, ContactPersonal2 .class, ContentInformationType41 .class, Context26 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, Customer10 .class, Customer4 .class, CustomerAssigner1Code.class, CustomerDevice6 .class, CustomerReference1 .class, CustomerType2Code.class, DateTime2 .class, DepartureOrArrival1 .class, DepartureOrArrival2 .class, DepositDetails4 .class, DestinationData1 .class, DetailedAmount24 .class, DeviceIdentification2 .class, DeviceIdentificationType2Code.class, DisplayCapabilities6 .class, DriverInParty4 .class, DriverOrVehicleCardData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, Endpoint2Code.class, ExchangeRateAgreementType2Code.class, ExchangeRateType3Code.class, Exemption2 .class, Exemption2Code.class, FinancialInstitution10 .class, FleetData7 .class, FleetDriverData2 .class, FleetLineItem7 .class, FleetPurchaseType1Code.class, FleetServiceType1Code.class, FleetTransactionDetail2 .class, FleetVehicleData1 .class, Frequency12Code.class, Frequency18Code.class, FundingService4 .class, FundingSource5 .class, FundingSourceType4Code.class, GoodAndServiceDeliveryChannel2Code.class, GoodAndServiceDeliverySchedule2Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType2Code.class, GracePeriodUnitType2Code.class, Header72 .class, HiredVehicle4 .class, ICCFallbackReason2Code.class, Instalment8 .class, InstalmentAmountData1 .class, InstalmentAmountDetailsType4Code.class, InstalmentPlan1 .class, Invoice4 .class, InvoiceLineItem4 .class, IssuerData1 .class, Jurisdiction2 .class, LegalStructure1Code.class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalAmenity2 .class, LocalData10 .class, LocalData19 .class, LocalData20 .class, LocalData21 .class, LocalData22 .class, LocalData24 .class, LocationAmenity2Code.class, Lodging5 .class, LodgingActivity2Code.class, LodgingLineItem4 .class, LodgingRoom2 .class, LodgingService1Code.class, LoyaltyProgramme4 .class, MACData1 .class, MOTO2Code.class, MessageClass2Code.class, MessageFunction16Code.class, MxCain00100105 .class, OfficialDocumentType2Code.class, OnBoardDiagnostics1 .class, OnLineCapability2Code.class, OriginalDataElements6 .class, OriginalTransactionAmounts4 .class, OriginalTransactionIdentification2 .class, OriginatorData2 .class, OutputFormat1Code.class, PINData1 .class, POIComponentType5Code.class, PartyType20Code.class, PassengerTransport4 .class, PayeeData1 .class, PayerData1 .class, PeriodUnit5Code.class, PlanOwner2Code.class, PointOfInteractionComponent16 .class, PresentationMedium2Code.class, ProcessingResult28 .class, Product8 .class, ProductCodeType1Code.class, ProgrammeMode7 .class, PromotionData1 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, QRCodePresentmentMode2Code.class, ReceiptType1Code.class, ReceiverData1 .class, RecommendationAction2 .class, RecommendedActionCode1 .class, Reconciliation5 .class, RecurringPaymentData1 .class, RentalRate3 .class, RiskAssessment1Code.class, RiskAssessment4 .class, RiskContext4 .class, RiskInputData3 .class, Sale4 .class, SaleItem5 .class, SecurityCharacteristics2Code.class, SenderData1 .class, SettlementService7 .class, ShippingData4 .class, ShippingPackage4 .class, Software2 .class, SoftwareType2Code.class, StorageLocation2Code.class, StrongCustomerAuthentication2 .class, SubMerchant1 .class, Tax44 .class, TaxReclaimMethod1Code.class, TelecomBillingEventAmount1 .class, TelecomLineItemAmount1 .class, TelecomServices4 .class, TelecomServicesLineItem4 .class, TelephonyCallType2Code.class, TemporaryServiceChargeRate1 .class, TemporaryServices4 .class, TemporaryServicesCharge2Code.class, Terminal10 .class, TerminalIntegrationCategory1Code.class, TerminalType2Code.class, Token4 .class, Token5 .class, Track2Data1Choice.class, TransactionAmounts5 .class, TransactionAttribute3Code.class, TransactionCharacteristics5 .class, TransactionIdentification58 .class, TransactionInitiator1Code.class, TransactionSpecificData1 .class, TransactorData1 .class, TransportType2Code.class, TravelAgency5 .class, TravelAgencyPackage2 .class, TravelDocument3 .class, TripLeg4 .class, TypeOfAmount22Code.class, TypeOfAmount24Code.class, TypeOfAmount25Code.class, UnitOfMeasure10Code.class, UnitOfMeasure14Code.class, UnitOfMeasure1Code.class, UserInterface1Code.class, Vehicle2 .class, VehicleRentalAdditionalAmount1 .class, VehicleRentalService4 .class, Verification4Code.class, Verification8 .class, VerificationEntity3Code.class, VerificationValue1 .class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.001.001.05";

    public MxCain00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00100105(final String xml) {
        this();
        MxCain00100105 tmp = parse(xml);
        authstnInitn = tmp.getAuthstnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the authstnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationInitiationV05 }
     *     
     */
    public AuthorisationInitiationV05 getAuthstnInitn() {
        return authstnInitn;
    }

    /**
     * Sets the value of the authstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationInitiationV05 }
     *     
     */
    public MxCain00100105 setAuthstnInitn(AuthorisationInitiationV05 value) {
        this.authstnInitn = value;
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
    public static MxCain00100105 parse(String xml) {
        return ((MxCain00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00100105 parse(String xml, MxRead parserImpl) {
        return ((MxCain00100105) parserImpl.read(MxCain00100105 .class, xml, _classes));
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
     * Creates an MxCain00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00100105 message
     * @return
     *     a new instance of MxCain00100105
     */
    public static final MxCain00100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00100105 .class);
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
