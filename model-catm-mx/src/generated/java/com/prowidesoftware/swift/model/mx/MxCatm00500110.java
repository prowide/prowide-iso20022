
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
 * Class for catm.005.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.10")
public class MxCatm00500110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnReq", required = true)
    protected MaintenanceDelegationRequestV10 mntncDlgtnReq;
    public static final transient String BUSINESS_PROCESS = "catm";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcceptorConfigurationContent13 .class, AcceptorConfigurationDataSet5 .class, Acquirer10 .class, AcquirerHostConfiguration9 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters16 .class, ActionMessage11 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm26Code.class, Algorithm27Code.class, Algorithm28Code.class, Algorithm29Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification31 .class, AlgorithmIdentification32 .class, AlgorithmIdentification33 .class, AlgorithmIdentification34 .class, AlgorithmIdentification35 .class, AlgorithmIdentification36 .class, AmountUnit1Code.class, ApplicationParameters13 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData10 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BatchTransactionType1Code.class, BusinessArea2Code.class, BytePadding1Code.class, CancellationProcess2Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext30 .class, CardPaymentEnvironment80 .class, CardProductType1Code.class, Cardholder21 .class, CardholderAuthentication17 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, ClockSynchronisation3 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType38 .class, ContentInformationType39 .class, ContentInformationType40 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey18 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DataSetCategory10Code.class, DataSetCategory18Code.class, DataSetCategory19Code.class, DataSetIdentification10 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DeviceDisplayRequest6 .class, DeviceInitialisationCardReaderRequest6 .class, DeviceInputNotification6 .class, DeviceInputRequest6 .class, DevicePlayResourceRequest1 .class, DevicePoweroffCardReaderRequest6 .class, DevicePrintRequest6 .class, DeviceRequest7 .class, DeviceSecureInputRequest6 .class, DeviceSendApplicationProtocolDataUnitCardReaderRequest1 .class, DeviceTransmitMessageRequest2 .class, DigestedData6 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent7 .class, EncryptionFormat2Code.class, EnvelopedData11 .class, ErrorAction5 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, Exemption1Code.class, ExternallyDefinedData5 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification186 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter6 .class, InformationQualify1Code.class, InputCommand1Code.class, InputData6 .class, IssuerAndSerialNumber2 .class, KEK9 .class, KEKIdentifier5 .class, KEKIdentifier7 .class, KeyTransport10 .class, KeyUsage1Code.class, LocalDateTime1 .class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MaintenanceDelegateAction9 .class, MaintenanceDelegation18 .class, MaintenanceDelegationRequest10 .class, MaintenanceDelegationRequestV10 .class, MaintenanceIdentificationAssociation1 .class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantConfigurationParameters6 .class, MerchantToken2 .class, MessageFunction43Code.class, MessageItemCondition2 .class, MessageItemCondition2Code.class, MobileData6 .class, MxCatm00500110 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType2Code.class, OnLineCapability1Code.class, OnLinePIN11 .class, Organisation26 .class, Organisation41 .class, OriginatorInformation1 .class, OutputBarcode2 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, PINRequestType1Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType5 .class, Parameter12 .class, Parameter16 .class, Parameter17 .class, Parameter18 .class, Parameter7 .class, PartyIdentification178Choice.class, PartyType15Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard35 .class, PaymentContext29 .class, PaymentTerminalParameters8 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData17 .class, PlainCardData22 .class, PointOfInteraction14 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent15 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics10 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, ProcessRetry3 .class, ProcessTiming5 .class, ProcessTiming6 .class, ProcessingPosition2Code.class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient13Choice.class, Recipient15Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, ResourceAction1Code.class, ResourceContent1 .class, ResourceType1Code.class, ResponseMode2Code.class, RetailerMessage1Code.class, RetailerSaleEnvironment2 .class, RetailerService2Code.class, RetailerService8Code.class, SaleCapabilities1Code.class, SaleCapabilities2Code.class, SaleContext4 .class, SaleToPOIProtocolParameter3 .class, SaleTokenScope1Code.class, SecurityParameters16 .class, SensitiveMobileData1 .class, ServiceProviderParameters3 .class, SignedData9 .class, Signer8 .class, SimpleIdentificationInformation4 .class, SoundFormat1Code.class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, TMSAction12 .class, TMSHeader1 .class, TMSProtocolParameters7 .class, TerminalManagementAction3Code.class, TerminalManagementAction5Code.class, TerminalManagementActionResult5Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementErrorAction2Code.class, TerminalPackageType5 .class, TimeUnit1Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.10";

    public MxCatm00500110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00500110(final String xml) {
        this();
        MxCatm00500110 tmp = parse(xml);
        mntncDlgtnReq = tmp.getMntncDlgtnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00500110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationRequestV10 }
     *     
     */
    public MaintenanceDelegationRequestV10 getMntncDlgtnReq() {
        return mntncDlgtnReq;
    }

    /**
     * Sets the value of the mntncDlgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationRequestV10 }
     *     
     */
    public MxCatm00500110 setMntncDlgtnReq(MaintenanceDelegationRequestV10 value) {
        this.mntncDlgtnReq = value;
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
    public static MxCatm00500110 parse(String xml) {
        return ((MxCatm00500110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00500110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00500110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00500110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00500110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00500110 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00500110) parserImpl.read(MxCatm00500110 .class, xml, _classes));
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
     * Creates an MxCatm00500110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00500110 message
     * @return
     *     a new instance of MxCatm00500110
     */
    public static final MxCatm00500110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00500110 .class);
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
