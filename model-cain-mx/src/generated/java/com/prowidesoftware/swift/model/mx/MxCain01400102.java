
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
 * Class for cain.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlFlfmtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.014.001.02")
public class MxCain01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlFlfmtInitn", required = true)
    protected RetrievalFulfilmentInitiationV02 rtrvlFlfmtInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails3 .class, Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AdditionalAction1 .class, AdditionalAmounts3 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation22 .class, AdditionalInformation29 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Address3 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount15 .class, Amount16 .class, Amount17 .class, ApprovalEntity2 .class, AttributeType1Code.class, AuthenticatedData5 .class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities2 .class, CardData10 .class, CardData7 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardProgramme2 .class, CardProgrammeMode2 .class, CardProgrammeMode3 .class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ClaimInformation1 .class, CommunicationCharacteristics3 .class, Contact1 .class, Contact6 .class, Contact7 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context12 .class, Context15 .class, Credentials2 .class, CreditDebit3Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, Customer7 .class, CustomerDevice4 .class, CustomerDeviceType2Code.class, DeliveryInformation5 .class, DepositDetails2 .class, DetailedAmount22 .class, Device2 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DeviceOperatingSystem1 .class, DeviceOperatingSystemType1Code.class, DigestedData5 .class, DisplayCapabilities6 .class, DisputeData3 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment20 .class, Environment21 .class, ErrorDetails2 .class, ExchangeRateAgreementType1Code.class, ExchangeRateDetail1 .class, ExchangeRateInformation2 .class, ExchangeRateType2Code.class, FeeAmount3 .class, FeeCollectionInitiator1Code.class, FinancialInstitution7 .class, Frequency12Code.class, FundingService2 .class, FundingSource2 .class, FundingSourceType2Code.class, GenericIdentification183 .class, GenericIdentification48 .class, GenericInformation1 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, Header66 .class, ICCFallbackReason1Code.class, Identification3Code.class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, LocalData1 .class, LocalData2 .class, LocalData3 .class, LocalData4 .class, LocalData5 .class, LocalData7 .class, MACData1 .class, MOTO1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageError1Code.class, MessageFunction29Code.class, MxCain01400102 .class, OnLineCapability2Code.class, OriginalTransaction2 .class, OriginalTransactionAmount2 .class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINEntrySecurityCharacteristic1Code.class, POICommunicationType2Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification200 .class, PartyIdentification254 .class, PartyIdentification255 .class, PartyIdentification257 .class, PartyIdentification258 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType7Code.class, PartyType9Code.class, PointOfInteractionComponent13 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification3 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext3 .class, PointOfServiceContext5 .class, Priority3Code.class, ProcessingResult10 .class, ProtectedData1 .class, ProtectionMethod1Code.class, QRCodePresentmentMode1Code.class, RateLock1 .class, ReceiptType1Code.class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData7 .class, RetrievalDeliveryMethod1Choice.class, RetrievalFulfilmentInitiation2 .class, RetrievalFulfilmentInitiationV02 .class, RetrievalFulfilmentInstructions2 .class, RiskAssessment1Code.class, RiskAssessment2 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext2 .class, RiskInputData1 .class, SaleContext8 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService3 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal5 .class, Terminal6 .class, TerminalIdentification3 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability9 .class, Transaction136 .class, Transaction147 .class, TransactionAmount1 .class, TransactionAmounts2 .class, TransactionAttribute2Code.class, TransactionContext7 .class, TransactionContext8 .class, TransactionIdentification18 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TransferService2 .class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface1Code.class, UserInterface6Code.class, UserInterface8Code.class, Verification3Code.class, Verification4 .class, VerificationEntity2Code.class, VerificationResult2 .class, Wallet2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.014.001.02";

    public MxCain01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01400102(final String xml) {
        this();
        MxCain01400102 tmp = parse(xml);
        rtrvlFlfmtInitn = tmp.getRtrvlFlfmtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlFlfmtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalFulfilmentInitiationV02 }
     *     
     */
    public RetrievalFulfilmentInitiationV02 getRtrvlFlfmtInitn() {
        return rtrvlFlfmtInitn;
    }

    /**
     * Sets the value of the rtrvlFlfmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalFulfilmentInitiationV02 }
     *     
     */
    public MxCain01400102 setRtrvlFlfmtInitn(RetrievalFulfilmentInitiationV02 value) {
        this.rtrvlFlfmtInitn = value;
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
    public static MxCain01400102 parse(String xml) {
        return ((MxCain01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01400102 parse(String xml, MxRead parserImpl) {
        return ((MxCain01400102) parserImpl.read(MxCain01400102 .class, xml, _classes));
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
     * Creates an MxCain01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01400102 message
     * @return
     *     a new instance of MxCain01400102
     */
    public final static MxCain01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01400102 .class);
    }

}
