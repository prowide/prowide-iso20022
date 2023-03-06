
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
 * Class for catm.005.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mntncDlgtnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.08")
public class MxCatm00500108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MntncDlgtnReq", required = true)
    protected MaintenanceDelegationRequestV08 mntncDlgtnReq;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorConfigurationContent11 .class, AcceptorConfigurationDataSet3 .class, Acquirer10 .class, AcquirerHostConfiguration9 .class, AcquirerProtocolExchangeBehavior2 .class, AcquirerProtocolParameters15 .class, ActionMessage9 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, ApplicationParameters11 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData8 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BatchTransactionType1Code.class, BusinessArea1Code.class, BytePadding1Code.class, CancellationProcess2Code.class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext29 .class, CardPaymentEnvironment78 .class, CardProductType1Code.class, Cardholder18 .class, CardholderAuthentication15 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, ClockSynchronisation3 .class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType29 .class, ContentInformationType30 .class, ContentInformationType32 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey16 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DataSetCategory10Code.class, DataSetCategory16Code.class, DataSetCategory17Code.class, DataSetIdentification9 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DeviceDisplayRequest4 .class, DeviceInitialisationCardReaderRequest4 .class, DeviceInputNotification4 .class, DeviceInputRequest4 .class, DevicePlayResourceRequest1 .class, DevicePoweroffCardReaderRequest4 .class, DevicePrintRequest4 .class, DeviceRequest5 .class, DeviceSecureInputRequest4 .class, DeviceSendApplicationProtocolDataUnitCardReaderRequest1 .class, DeviceTransmitMessageRequest2 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, ErrorAction5 .class, ExchangeConfiguration10 .class, ExchangeConfiguration9 .class, ExchangePolicy2Code.class, Exemption1Code.class, ExternallyDefinedData3 .class, FinancialCapture1Code.class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, HostCommunicationParameter6 .class, InformationQualify1Code.class, InputCommand1Code.class, InputData4 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier5 .class, KEKIdentifier7 .class, KeyTransport8 .class, KeyUsage1Code.class, LocalDateTime1 .class, LocationCategory3Code.class, LocationCategory4Code.class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MaintenanceDelegateAction7 .class, MaintenanceDelegation13 .class, MaintenanceDelegationRequest8 .class, MaintenanceDelegationRequestV08 .class, MaintenanceIdentificationAssociation1 .class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantConfigurationParameters6 .class, MerchantToken2 .class, MessageFunction43Code.class, MessageItemCondition1 .class, MessageItemCondition1Code.class, MobileData4 .class, MxCatm00500108 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters8 .class, NetworkParameters9 .class, NetworkType1Code.class, NetworkType2Code.class, NonFinancialRequestType1Code.class, OnLineCapability1Code.class, OnLinePIN9 .class, Organisation26 .class, Organisation41 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, PINFormat3Code.class, PINRequestType1Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType3 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType15Code.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard32 .class, PaymentContext28 .class, PaymentTerminalParameters8 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction12 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent12 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics8 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, ProcessRetry3 .class, ProcessTiming5 .class, ProcessTiming6 .class, ProcessingPosition2Code.class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient11Choice.class, Recipient12Choice.class, ReconciliationCriteria1Code.class, RelativeDistinguishedName1 .class, ResourceAction1Code.class, ResourceContent1 .class, ResourceType1Code.class, ResponseMode2Code.class, RetailerSaleEnvironment2 .class, RetailerService8Code.class, SaleCapabilities1Code.class, SaleCapabilities2Code.class, SaleContext4 .class, SaleToPOIProtocolParameter2 .class, SaleTokenScope1Code.class, SecurityParameters14 .class, SensitiveMobileData1 .class, ServiceProviderParameters2 .class, SignedData7 .class, Signer6 .class, SimpleIdentificationInformation4 .class, SoundFormat1Code.class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, TMSAction10 .class, TMSHeader1 .class, TMSProtocolParameters6 .class, TerminalManagementAction3Code.class, TerminalManagementAction5Code.class, TerminalManagementActionResult5Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementErrorAction2Code.class, TerminalPackageType3 .class, TimeUnit1Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.005.001.08";

    public MxCatm00500108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00500108(final String xml) {
        this();
        MxCatm00500108 tmp = parse(xml);
        mntncDlgtnReq = tmp.getMntncDlgtnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00500108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mntncDlgtnReq property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceDelegationRequestV08 }
     *     
     */
    public MaintenanceDelegationRequestV08 getMntncDlgtnReq() {
        return mntncDlgtnReq;
    }

    /**
     * Sets the value of the mntncDlgtnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceDelegationRequestV08 }
     *     
     */
    public MxCatm00500108 setMntncDlgtnReq(MaintenanceDelegationRequestV08 value) {
        this.mntncDlgtnReq = value;
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
    public static MxCatm00500108 parse(String xml) {
        return ((MxCatm00500108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00500108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCatm00500108 parse(String xml, MxReadConfiguration conf) {
        return ((MxCatm00500108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCatm00500108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00500108 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00500108) parserImpl.read(MxCatm00500108 .class, xml, _classes));
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
     * Creates an MxCatm00500108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00500108 message
     * @return
     *     a new instance of MxCatm00500108
     */
    public final static MxCatm00500108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCatm00500108 .class);
    }

}
