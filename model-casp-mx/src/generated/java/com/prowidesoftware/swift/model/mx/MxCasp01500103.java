
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
 * Class for casp.015.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOIMsgStsRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.015.001.03")
public class MxCasp01500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOIMsgStsRspn", required = true)
    protected SaleToPOIMessageStatusResponseV03 saleToPOIMsgStsRspn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 15;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Acquirer10 .class, Action11 .class, ActionMessage8 .class, ActionType9Code.class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction3 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountAndDirection93 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData7 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, AuthorisationResult14 .class, BarcodeType1Code.class, BytePadding1Code.class, CapturedSignature1 .class, CardAccountType3Code.class, CardAcquisitionResponse2 .class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext28 .class, CardPaymentEnvironment77 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken5 .class, CardPaymentTransaction109 .class, CardPaymentTransaction110 .class, CardPaymentTransaction112 .class, CardPaymentTransactionDetails49 .class, CardProductType1Code.class, Cardholder17 .class, CardholderAuthentication14 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType25 .class, ContentInformationType26 .class, ContentInformationType28 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey15 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion20 .class, CurrencyConversion21 .class, CurrencyConversion22 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice3 .class, CustomerOrder1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount15 .class, DetailedAmount21 .class, DetailedAmount4 .class, DeviceSendApplicationProtocolDataUnitCardReaderResponse1 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData8 .class, Exemption1Code.class, ExternallyDefinedData2 .class, Frequency3Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification90 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header41 .class, InformationQualify1Code.class, InstalmentPlan1Code.class, IssuerAndSerialNumber2 .class, KEK7 .class, KEKIdentifier2 .class, KeyTransport7 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount2 .class, LoyaltyAmount1 .class, LoyaltyHandling1Code.class, LoyaltyRebates1 .class, LoyaltyResponse2 .class, LoyaltyResult2 .class, LoyaltyServerData1 .class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken1 .class, MessageStatusResponse5 .class, MessageStatusResponseData5 .class, MobileData3 .class, MxCasp01500103 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN8 .class, OnLineReason1Code.class, Organisation26 .class, Organisation41 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType2 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard31 .class, PaymentContext27 .class, PaymentReceipt3 .class, PaymentResponse3 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction11 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent11 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics7 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, Product4 .class, Product5 .class, Product6 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient10Choice.class, Recipient9Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response11Code.class, Response9Code.class, ResponseType10 .class, ResponseType11 .class, RetailerMessage1Code.class, RetailerPaymentResult3 .class, RetailerResultDetail1Code.class, RetailerReversalResult3 .class, RetailerSaleEnvironment2 .class, ReversalResponse5 .class, SaleCapabilities1Code.class, SaleContext4 .class, SaleItemRebate1 .class, SaleToPOIMessageStatusResponseV03 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SignedData6 .class, Signer5 .class, SimpleIdentificationInformation4 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, StoredValueData4 .class, StoredValueResponse4 .class, StoredValueTransactionType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.015.001.03";

    public MxCasp01500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp01500103(final String xml) {
        this();
        MxCasp01500103 tmp = parse(xml);
        saleToPOIMsgStsRspn = tmp.getSaleToPOIMsgStsRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp01500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOIMsgStsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOIMessageStatusResponseV03 }
     *     
     */
    public SaleToPOIMessageStatusResponseV03 getSaleToPOIMsgStsRspn() {
        return saleToPOIMsgStsRspn;
    }

    /**
     * Sets the value of the saleToPOIMsgStsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOIMessageStatusResponseV03 }
     *     
     */
    public MxCasp01500103 setSaleToPOIMsgStsRspn(SaleToPOIMessageStatusResponseV03 value) {
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
    public static MxCasp01500103 parse(String xml) {
        return ((MxCasp01500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp01500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp01500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp01500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp01500103 parse(String xml, MxRead parserImpl) {
        return ((MxCasp01500103) parserImpl.read(MxCasp01500103 .class, xml, _classes));
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
     * Creates an MxCasp01500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp01500103 message
     * @return
     *     a new instance of MxCasp01500103
     */
    public final static MxCasp01500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp01500103 .class);
    }

}
