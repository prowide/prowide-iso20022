
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
 * Class for caaa.001.001.14 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrAuthstnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.14")
public class MxCaaa00100114
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrAuthstnReq", required = true)
    protected AcceptorAuthorisationRequestV14 accptrAuthstnReq;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 14;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorAuthorisationRequest14 .class, AcceptorAuthorisationRequestV14 .class, AccountChoiceMethod1Code.class, AccountIdentification4Choice.class, AccountIdentification54Choice.class, AccountSchemeName1Choice.class, Acquirer10 .class, ActionMessage11 .class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, Amount5 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData10 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BinRange1 .class, BusinessArea2Code.class, BytePadding1Code.class, CardAccount16 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentEnvironment81 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType15Code.class, CardPaymentServiceType9Code.class, CardPaymentTransaction138 .class, CardPaymentTransaction139 .class, CardPaymentTransactionDetails53 .class, CardPaymentTransactionResult4 .class, CardProductType1Code.class, Cardholder21 .class, CardholderAuthentication17 .class, CardholderVerificationCapability4Code.class, CashAccount40 .class, CashAccountType2Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, Contact13 .class, ContentInformationType37 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, CreditTransferContext1 .class, CryptographicKey18 .class, CryptographicKeyType3Code.class, CurrencyConversion29 .class, CurrencyConversion30 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, DateAndPlaceOfBirth1 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData6 .class, DirectDebitContext1 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, Exemption1Code.class, ExternallyDefinedData5 .class, Frequency3Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericIdentification30 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header70 .class, InformationQualify1Code.class, Instalment5 .class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InstalmentPlan1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MandateRelatedInformation17 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MessageFunction46Code.class, MobileData6 .class, MxCaaa00100114 .class, NameAndAddress3 .class, NamePrefix2Code.class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN11 .class, OnLineReason2Code.class, Organisation26 .class, Organisation41 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OtherContact1 .class, OutputBarcode2 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType7Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, Party52Choice.class, PartyIdentification177Choice.class, PartyIdentification272 .class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard35 .class, PaymentContext29 .class, PaymentContext30 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PhysicalInterfaceParameter1 .class, PlainCardData17 .class, PlainCardData22 .class, PlanOwner1Code.class, PointOfInteraction15 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent17 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics10 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress1 .class, PostalAddress22 .class, PostalAddress27 .class, PreferredContactMethod2Code.class, Product6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient13Choice.class, Recipient15Choice.class, RecurringTransaction6 .class, RelativeDistinguishedName1 .class, Response9Code.class, ResponseType10 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData9 .class, Signer8 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.001.001.14";

    public MxCaaa00100114() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00100114(final String xml) {
        this();
        MxCaaa00100114 tmp = parse(xml);
        accptrAuthstnReq = tmp.getAccptrAuthstnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00100114(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrAuthstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorAuthorisationRequestV14 }
     *     
     */
    public AcceptorAuthorisationRequestV14 getAccptrAuthstnReq() {
        return accptrAuthstnReq;
    }

    /**
     * Sets the value of the accptrAuthstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorAuthorisationRequestV14 }
     *     
     */
    public MxCaaa00100114 setAccptrAuthstnReq(AcceptorAuthorisationRequestV14 value) {
        this.accptrAuthstnReq = value;
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
    public static MxCaaa00100114 parse(String xml) {
        return ((MxCaaa00100114) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00100114 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00100114 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00100114) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00100114 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00100114 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00100114) parserImpl.read(MxCaaa00100114 .class, xml, _classes));
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
     * Creates an MxCaaa00100114 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00100114 message
     * @return
     *     a new instance of MxCaaa00100114
     */
    public static final MxCaaa00100114 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00100114 .class);
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
