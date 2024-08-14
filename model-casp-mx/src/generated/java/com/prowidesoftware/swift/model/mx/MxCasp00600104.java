
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
 * Class for casp.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "saleToPOISsnMgmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casp.006.001.04")
public class MxCasp00600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SaleToPOISsnMgmtRspn", required = true)
    protected SaleToPOISessionManagementResponseV04 saleToPOISsnMgmtRspn;
    public final static transient String BUSINESS_PROCESS = "casp";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Acquirer10 .class, ActionMessage9 .class, AddressType2Code.class, AddressVerification1 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm24Code.class, Algorithm25Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification29 .class, AlgorithmIdentification30 .class, AmountUnit1Code.class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData8 .class, AuthenticationEntity2Code.class, AuthenticationMethod6Code.class, AuthenticationMethod8Code.class, AuthenticationResult1Code.class, BarcodeType1Code.class, BusinessArea1Code.class, BytePadding1Code.class, CapturedSignature1 .class, CardDataReading5Code.class, CardDataReading8Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardIdentificationType1Code.class, CardPaymentContext29 .class, CardPaymentEnvironment78 .class, CardProductType1Code.class, Cardholder18 .class, CardholderAuthentication15 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Check1 .class, CheckType1Code.class, CommunicationAddress9 .class, CommunicationCharacteristics5 .class, ContentInformationType29 .class, ContentInformationType30 .class, ContentInformationType32 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey16 .class, CryptographicKeyType3Code.class, CustomerDevice3 .class, DataSetCategory17Code.class, DataSetIdentification9 .class, DataSetRequest3 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DeviceDisplayResponse2 .class, DeviceInitialisationCardReaderResponse2 .class, DeviceInputResponse4 .class, DevicePrintResponse1 .class, DeviceResponse5 .class, DeviceSecureInputResponse4 .class, DeviceSendApplicationProtocolDataUnitCardReaderResponse1 .class, DeviceTransmitMessageResponse1 .class, DiagnosisResponse4 .class, DigestedData5 .class, DisplayCapabilities4 .class, DocumentType7Code.class, EncapsulatedContent3 .class, EncryptedContent6 .class, EncryptionFormat2Code.class, EnvelopedData9 .class, Exemption1Code.class, ExternallyDefinedData3 .class, GenericIdentification176 .class, GenericIdentification177 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericInformation1 .class, Geolocation1 .class, GeolocationGeographicCoordinates1 .class, GeolocationUTMCoordinates1 .class, Header41 .class, HostStatus1 .class, ICCResetData1 .class, InformationQualify1Code.class, InputCommand1Code.class, InputResult4 .class, InputResultData4 .class, IssuerAndSerialNumber2 .class, KEK8 .class, KEKIdentifier7 .class, KeyTransport8 .class, KeyUsage1Code.class, LocationCategory3Code.class, LocationCategory4Code.class, LoginResponse4 .class, LoyaltyAccount3 .class, LoyaltyHandling1Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MerchantToken2 .class, MobileData4 .class, MxCasp00600104 .class, NameAndAddress6 .class, NetworkParameters7 .class, NetworkParameters9 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN9 .class, Organisation26 .class, Organisation41 .class, OriginatorInformation1 .class, OutputBarcode1 .class, OutputFormat1Code.class, OutputFormat3Code.class, OutputResult2 .class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType6Code.class, PackageType3 .class, Parameter10 .class, Parameter12 .class, Parameter15 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification178Choice.class, PartyType33Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard32 .class, PaymentContext28 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PhysicalInterfaceParameter1 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction12 .class, PointOfInteractionCapabilities9 .class, PointOfInteractionComponent12 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics8 .class, PointOfInteractionComponentIdentification2 .class, PointOfInteractionComponentStatus3 .class, PostalAddress2 .class, PostalAddress22 .class, QRCodeEncodingMode1Code.class, QRCodeErrorCorrection1Code.class, Recipient11Choice.class, Recipient12Choice.class, RelativeDistinguishedName1 .class, Response11Code.class, ResponseType11 .class, RetailerMessage1Code.class, RetailerResultDetail1Code.class, RetailerSaleEnvironment2 .class, RetailerService5Code.class, RetailerService9Code.class, SaleCapabilities1Code.class, SaleCapabilities2Code.class, SaleContext4 .class, SaleToPOISessionManagementResponseV04 .class, SaleTokenScope1Code.class, SensitiveMobileData1 .class, SessionManagementResponse5 .class, SignedData7 .class, Signer6 .class, SimpleIdentificationInformation4 .class, StatusReportContent11 .class, StoredValueAccount2 .class, StoredValueAccountType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption2Code.class, TMSActionIdentification8 .class, TMSEvent9 .class, TerminalManagementAction5Code.class, TerminalManagementActionResult5Code.class, Token1 .class, Traceability8 .class, TrackData2 .class, TrackFormat1Code.class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionVerificationResult4 .class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casp.006.001.04";

    public MxCasp00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasp00600104(final String xml) {
        this();
        MxCasp00600104 tmp = parse(xml);
        saleToPOISsnMgmtRspn = tmp.getSaleToPOISsnMgmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasp00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the saleToPOISsnMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link SaleToPOISessionManagementResponseV04 }
     *     
     */
    public SaleToPOISessionManagementResponseV04 getSaleToPOISsnMgmtRspn() {
        return saleToPOISsnMgmtRspn;
    }

    /**
     * Sets the value of the saleToPOISsnMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleToPOISessionManagementResponseV04 }
     *     
     */
    public MxCasp00600104 setSaleToPOISsnMgmtRspn(SaleToPOISessionManagementResponseV04 value) {
        this.saleToPOISsnMgmtRspn = value;
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
    public static MxCasp00600104 parse(String xml) {
        return ((MxCasp00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasp00600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasp00600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasp00600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasp00600104 parse(String xml, MxRead parserImpl) {
        return ((MxCasp00600104) parserImpl.read(MxCasp00600104 .class, xml, _classes));
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
     * Creates an MxCasp00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasp00600104 message
     * @return
     *     a new instance of MxCasp00600104
     */
    public final static MxCasp00600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasp00600104 .class);
    }

}
