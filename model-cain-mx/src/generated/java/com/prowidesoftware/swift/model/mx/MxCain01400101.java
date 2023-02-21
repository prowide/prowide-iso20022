
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
 * Class for cain.014.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlFlfmtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.014.001.01")
public class MxCain01400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlFlfmtInitn", required = true)
    protected RetrievalFulfilmentInitiationV01 rtrvlFlfmtInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails2 .class, Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AdditionalAction1 .class, AdditionalAmounts1 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, AdditionalInformation22 .class, AdditionalRiskData1 .class, AdditionalService1 .class, AdditionalServiceType1Code.class, Address1 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount14 .class, Amount4 .class, Amount5 .class, ApprovalData1 .class, ApprovalEntity1 .class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationMethod11Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities1 .class, CardData3 .class, CardData5 .class, CardDataReading7Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardProgramme1 .class, CardProgrammeMode1 .class, CardProgrammeMode2 .class, Cardholder15 .class, CardholderName1 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ClaimInformation1 .class, CommunicationCharacteristics3 .class, Contact1 .class, Contact7 .class, Content1 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context3 .class, Context4 .class, Credentials1 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, Customer3 .class, CustomerDevice2 .class, CustomerDeviceType1Code.class, DeliveryInformation2 .class, DepositDetails1 .class, DetailAmount1Code.class, DetailedAmount19 .class, Device1 .class, DigestedData5 .class, DisplayCapabilities6 .class, DisputeData1 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment13 .class, Environment6 .class, FeeAmount2 .class, FinancialInstitution4 .class, FundingService1 .class, FundingSource2 .class, FundingSourceType2Code.class, GenericIdentification172 .class, GenericIdentification48 .class, GenericInformation1 .class, GeographicCoordinates1 .class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, Header48 .class, Identification2Code.class, IssuerAndSerialNumber1 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, MACData1 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction29Code.class, MxCain01400101 .class, OnLineCapability2Code.class, OriginalTransaction1 .class, OriginalTransactionAmount1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat4Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification197 .class, PartyIdentification198 .class, PartyIdentification199 .class, PartyIdentification200 .class, PartyIdentification203 .class, PartyIdentification211 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType7Code.class, PartyType9Code.class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PointOfServiceContext1 .class, PointOfServiceContext2 .class, Priority3Code.class, ProcessingResult2 .class, ProtectedData1 .class, ReceiptType1Code.class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, RetrievalDeliveryMethod1Choice.class, RetrievalFulfilmentInitiation1 .class, RetrievalFulfilmentInitiationV01 .class, RetrievalFulfilmentInstructions1 .class, RiskAssessment1 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext1 .class, RiskInputData1 .class, SaleContext7 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService1 .class, SettlementService2 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SignedData5 .class, Signer4 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, SponsoredMerchant1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal2 .class, Terminal3 .class, TerminalIdentification1 .class, TerminalIdentification2 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token1 .class, Traceability7 .class, Transaction85 .class, Transaction89 .class, TransactionAmount1 .class, TransactionAmounts1 .class, TransactionAttribute1Code.class, TransactionContext1 .class, TransactionContext3 .class, TransactionIdentification11 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TransferService1 .class, TypeOfAmount10Code.class, TypeOfAmount11Code.class, TypeOfAmount12Code.class, UserInterface1Code.class, UserInterface6Code.class, UserInterface8Code.class, Verification2 .class, Verification2Code.class, VerificationEntity1Code.class, VerificationResult1 .class, Wallet1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.014.001.01";

    public MxCain01400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01400101(final String xml) {
        this();
        MxCain01400101 tmp = parse(xml);
        rtrvlFlfmtInitn = tmp.getRtrvlFlfmtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlFlfmtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalFulfilmentInitiationV01 }
     *     
     */
    public RetrievalFulfilmentInitiationV01 getRtrvlFlfmtInitn() {
        return rtrvlFlfmtInitn;
    }

    /**
     * Sets the value of the rtrvlFlfmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalFulfilmentInitiationV01 }
     *     
     */
    public MxCain01400101 setRtrvlFlfmtInitn(RetrievalFulfilmentInitiationV01 value) {
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
    public static MxCain01400101 parse(String xml) {
        return ((MxCain01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01400101 parse(String xml, MxRead parserImpl) {
        return ((MxCain01400101) parserImpl.read(MxCain01400101 .class, xml, _classes));
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
     * Creates an MxCain01400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01400101 message
     * @return
     *     a new instance of MxCain01400101
     */
    public final static MxCain01400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01400101 .class);
    }

}
