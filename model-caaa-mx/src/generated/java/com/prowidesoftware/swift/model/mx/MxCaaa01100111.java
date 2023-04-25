
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
 * Class for caaa.011.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.11")
public class MxCaaa01100111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV11 accptrBtchTrf;
    public static final transient String BUSINESS_PROCESS = "caaa";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorBatchTransferV11 .class, AccountChoiceMethod1Code.class, AccountIdentification54Choice.class, Acquirer10 .class, Action12 .class, ActionMessage9 .class, ActionType12Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, Amount5 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData8 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult17 .class, AuthorisationResult18 .class, AuthorisationResult19 .class, BarcodeType1Code.class, BusinessArea1Code.class, BytePadding1Code.class, CardAccount16 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentBatchTransfer10 .class, CardPaymentContext29 .class, CardPaymentDataSet29 .class, CardPaymentDataSetTransaction10Choice.class, CardPaymentDataSetTransaction38 .class, CardPaymentDataSetTransaction39 .class, CardPaymentDataSetTransaction40 .class, CardPaymentDataSetTransaction41 .class, CardPaymentEnvironment78 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType14Code.class, CardPaymentServiceType9Code.class, CardPaymentTransaction114 .class, CardPaymentTransaction116 .class, CardPaymentTransaction118 .class, CardPaymentTransaction119 .class, CardPaymentTransaction121 .class, CardPaymentTransaction122 .class, CardPaymentTransactionDetails50 .class, CardPaymentTransactionDetails51 .class, CardPaymentTransactionResult4 .class, CardProductType1Code.class, Cardholder18 .class, CardholderAuthentication15 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommonData11 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType29 .class, ContentInformationType30 .class, ContentInformationType31 .class, ContentInformationType32 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey16 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion23 .class, CurrencyConversion24 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, DataSetCategory8Code.class, DataSetIdentification5 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, Exemption1Code.class, ExternallyDefinedData3 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification1 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, GracePeriod1 .class, GracePeriodUnitType1Code.class, Header56 .class, InformationQualify1Code.class, InstalmentAmountDetails1 .class, InstalmentAmountDetailsType1Code.class, InstalmentPeriod1Code.class, InstalmentPlan1Code.class, InterestRate1Code.class, InterestRateDetails1 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport8 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MobileData4 .class, MxCaaa01100111 .class, NameAndAddress3 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN9 .class, OnLineReason2Code.class, Organisation26 .class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType3 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification177Choice.class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard32 .class, PaymentContext28 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PlanOwner1Code.class, PointOfInteraction12 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent12 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics8 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress22 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient11Choice.class, Recipient12Choice.class, RecurringTransaction4 .class, RelativeDistinguishedName1 .class, Response9Code.class, ResponseType10 .class, RetailerSaleEnvironment2 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData7 .class, Signer6 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupportedPaymentOption2Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, TokenRequestComponent2 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals12 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.11";

    public MxCaaa01100111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100111(final String xml) {
        this();
        MxCaaa01100111 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV11 }
     *     
     */
    public AcceptorBatchTransferV11 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV11 }
     *     
     */
    public MxCaaa01100111 setAccptrBtchTrf(AcceptorBatchTransferV11 value) {
        this.accptrBtchTrf = value;
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
    public static MxCaaa01100111 parse(String xml) {
        return ((MxCaaa01100111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01100111 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01100111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100111 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100111) parserImpl.read(MxCaaa01100111 .class, xml, _classes));
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
     * Creates an MxCaaa01100111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100111 message
     * @return
     *     a new instance of MxCaaa01100111
     */
    public static final MxCaaa01100111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01100111 .class);
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
