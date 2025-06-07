
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
 * Class for casp.015.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIMsgStsRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.015.001.07")
public class MxCasp01500107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIMsgStsRspn", required = true)
    protected SaleToPOIMessageStatusResponseV07 saleToPOIMsgStsRspn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, Acquirer10 .class, Action17 .class, ActionMessage11 .class, ActionType15Code.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, Amount5 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData10 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult17 .class, AuthorisationResult18 .class, BarcodeType1Code.class, BinRange1 .class, BusinessArea2Code.class, BytePadding1Code.class, CapturedSignature1 .class, CardAccountType3Code.class, CardAcquisitionResponse3 .class, CardDataReading5Code.class, CardDataReading8Code.class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment81 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType15Code.class, CardPaymentServiceType16Code.class, CardPaymentServiceType9Code.class, CardPaymentToken5 .class, CardPaymentTransaction131 .class, CardPaymentTransaction144 .class, CardPaymentTransactionDetails53 .class, CardProductType1Code.class, Cardholder21 .class, CardholderAuthentication17 .class, CardholderVerificationCapability4Code.class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, Contact13 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, CreditTransferContext1 .class, CryptographicKey18 .class, CryptographicKeyType3Code.class, CurrencyConversion29 .class, CurrencyConversion30 .class, CurrencyConversion31 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DeviceSendApplicationProtocolDataUnitCardReaderResponse1 .class, DigestedData6 .class, DirectDebitContext1 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, Exemption1Code.class, ExternallyDefinedData5 .class, Frequency3Code.class, GenericAccountIdentification1 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericIdentification30 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header41 .class, InformationQualify1Code.class, Instalment5 .class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InstalmentPlan1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocalInstrument2Choice.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyAmount1 .class, LoyaltyHandling1Code.class, LoyaltyRebates1 .class, LoyaltyResponse3 .class, LoyaltyResult3 .class, LoyaltyServerData1 .class, MandateRelatedInformation17 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MessageStatusResponse9 .class, MessageStatusResponseData9 .class, MobileData6 .class, MxCasp01500107 .class, NamePrefix2Code.class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN11 .class, OnLineReason2Code.class, Organisation26 .class, Organisation41 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OtherContact1 .class, OutputBarcode2 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType7Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, Party52Choice.class, PartyIdentification272 .class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard35 .class, PaymentContext29 .class, PaymentContext30 .class, PaymentInstrumentType2Code.class, PaymentReceipt6 .class, PaymentResponse7 .class, PaymentTokenIdentifiers1 .class, PaymentTransaction165 .class, PaymentTypeInformation26 .class, PersonIdentification15 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PhysicalInterfaceParameter1 .class, PlainCardData17 .class, PlainCardData22 .class, PlanOwner1Code.class, PointOfInteraction15 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent17 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics10 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress22 .class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, ProcessRetry3 .class, ProcessTiming6 .class, Product4 .class, Product5 .class, Product6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient13Choice.class, Recipient15Choice.class, RecurringTransaction6 .class, RelativeDistinguishedName1 .class, Response11Code.class, Response9Code.class, ResponseType10 .class, ResponseType11 .class, RetailerMessage1Code.class, RetailerPaymentResult7 .class, RetailerResultDetail1Code.class, RetailerReversalResult7 .class, RetailerSaleEnvironment2 .class, ReversalResponse9 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleItemRebate1 .class, SaleToPOIMessageStatusResponseV07 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, ServiceLevel8Choice.class, SignedData9 .class, Signer8 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, StoredValueData8 .class, StoredValueResponse8 .class, StoredValueTransactionType3Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, TimeUnit1Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.015.001.07";

    public MxCasp01500107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp01500107(final String xml) {
        this();
        MxCasp01500107 tmp = parse(xml);
        saleToPOIMsgStsRspn = tmp.getSaleToPOIMsgStsRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp01500107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIMsgStsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIMessageStatusResponseV07 }
     *     
     */
    public SaleToPOIMessageStatusResponseV07 getSaleToPOIMsgStsRspn() {
        return saleToPOIMsgStsRspn;
    }

    /**
     * Sets the value of the saleToPOIMsgStsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIMessageStatusResponseV07 }
     *     
     */
    public MxCasp01500107 setSaleToPOIMsgStsRspn(SaleToPOIMessageStatusResponseV07 value) {
        this.saleToPOIMsgStsRspn = value;
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
    public static MxCasp01500107 parse(String xml) {
        return ((MxCasp01500107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01500107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp01500107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp01500107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01500107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp01500107 parse(String xml, MxRead parserImpl) {
        return ((MxCasp01500107) parserImpl.read(MxCasp01500107 .class, xml, _classes));
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
     * Creates an MxCasp01500107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp01500107 message
     * @return
     *     a new instance of MxCasp01500107
     */
    public final static MxCasp01500107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp01500107 .class);
    }

}
