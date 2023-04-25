
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
 * Class for cain.016.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nqryInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.02")
public class MxCain01600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NqryInitn", required = true)
    protected InquiryInitiationV02 nqryInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 16;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountDetails3 .class, Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AddendumData5 .class, AdditionalAction1 .class, AdditionalAmounts3 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation29 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Address3 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount15 .class, Amount16 .class, Amount17 .class, AttributeType1Code.class, AuthenticatedData5 .class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities2 .class, CardData6 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardProgramme2 .class, CardProgrammeMode2 .class, CardProgrammeMode3 .class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, CommunicationCharacteristics3 .class, Contact1 .class, Contact6 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context11 .class, Credentials2 .class, CreditDebit3Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CustomerDevice4 .class, CustomerDeviceType2Code.class, DetailAmount2Code.class, DetailedAmount23 .class, Device2 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DeviceOperatingSystem1 .class, DeviceOperatingSystemType1Code.class, DigestedData5 .class, DisplayCapabilities6 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment18 .class, ExchangeRateAgreementType1Code.class, ExchangeRateDetail1 .class, ExchangeRateInformation2 .class, ExchangeRateType2Code.class, FeeAmount3 .class, Frequency12Code.class, Frequency18Code.class, GenericIdentification183 .class, GenericIdentification48 .class, GenericInformation1 .class, GracePeriod2 .class, GracePeriodUnitType1Code.class, Header60 .class, ICCFallbackReason1Code.class, Identification3Code.class, InquiryInitiation2 .class, InquiryInitiationV02 .class, Instalment4 .class, InstalmentAmountDetails2 .class, InstalmentAmountDetailsType2Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, LocalData1 .class, LocalData4 .class, LocalData5 .class, LocalData7 .class, MACData1 .class, MOTO1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction17Code.class, MxCain01600102 .class, OnLineCapability2Code.class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, PINEntrySecurityCharacteristic1Code.class, POICommunicationType2Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification200 .class, PartyIdentification255 .class, PartyIdentification258 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType28Code.class, PartyType7Code.class, Plan2 .class, PlanOwner1Code.class, PointOfInteractionComponent13 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification3 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext3 .class, Priority3Code.class, ProcessingResult11 .class, ProtectedData1 .class, ProtectionMethod1Code.class, QRCodePresentmentMode1Code.class, RateLock1 .class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData7 .class, RiskAssessment1Code.class, RiskAssessment2 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext2 .class, RiskInputData1 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService3 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal4 .class, TerminalIdentification3 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability9 .class, Track2Data1Choice.class, Transaction131 .class, TransactionContext7 .class, TransactionIdentification18 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount21Code.class, UserInterface1Code.class, UserInterface6Code.class, Verification3Code.class, Verification5 .class, VerificationEntity2Code.class, VerificationInformation1 .class, VerificationResult2 .class, VerificationValue1Choice.class, Wallet2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.02";

    public MxCain01600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01600102(final String xml) {
        this();
        MxCain01600102 tmp = parse(xml);
        nqryInitn = tmp.getNqryInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the nqryInitn property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryInitiationV02 }
     *     
     */
    public InquiryInitiationV02 getNqryInitn() {
        return nqryInitn;
    }

    /**
     * Sets the value of the nqryInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryInitiationV02 }
     *     
     */
    public MxCain01600102 setNqryInitn(InquiryInitiationV02 value) {
        this.nqryInitn = value;
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
    public static MxCain01600102 parse(String xml) {
        return ((MxCain01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01600102 parse(String xml, MxRead parserImpl) {
        return ((MxCain01600102) parserImpl.read(MxCain01600102 .class, xml, _classes));
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
     * Creates an MxCain01600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01600102 message
     * @return
     *     a new instance of MxCain01600102
     */
    public static final MxCain01600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01600102 .class);
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
