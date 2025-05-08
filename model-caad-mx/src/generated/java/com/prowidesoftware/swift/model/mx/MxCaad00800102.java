
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
 * Class for caad.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "admstvInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caad.008.001.02")
public class MxCaad00800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AdmstvInitn", required = true)
    protected AdministrativeInitiationV02 admstvInitn;
    public static final transient String BUSINESS_PROCESS = "caad";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountDetails4 .class, Action16 .class, ActionDestination1Code.class, ActionType14Code.class, ActionType8Code.class, AdditionalAmounts4 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, AdministrativeInitiationV02 .class, AdministrativeType1Code.class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData11 .class, CardData13 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder22 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context19 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, Customer4 .class, CustomerDevice5 .class, CustomerDeviceType2Code.class, CustomerType2Code.class, DateTime2 .class, DepositDetails3 .class, DetailedAmount22 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DisplayCapabilities6 .class, DisputeData4 .class, DisputeDocumentation1 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData12 .class, ErrorDetails3 .class, ExchangeRateAgreementType1Code.class, ExchangeRateInformation5 .class, ExchangeRateType2Code.class, FinancialInstitution8 .class, Frequency12Code.class, Frequency18Code.class, FundingService3 .class, FundingSource4 .class, FundingSourceType3Code.class, GenericIdentification183 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, GracePeriodUnitType1Code.class, Header71 .class, ICCFallbackReason1Code.class, Instalment6 .class, InstalmentAmountDetails3 .class, InstalmentAmountDetailsType3Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalData10 .class, LocalData11 .class, LocalData12 .class, LocalData13 .class, LocalData14 .class, LocalData15 .class, LocalData17 .class, MACData1 .class, MOTO2Code.class, MessageError1Code.class, MxCaad00800102 .class, OnLineCapability2Code.class, OriginalTransaction3 .class, OriginalTransactionCharacteristics1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, PINEntrySecurityCharacteristic1Code.class, POIComponentType5Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification284 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification287 .class, PartyIdentification288 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType34Code.class, PartyType9Code.class, Plan3 .class, PlanOwner1Code.class, PointOfInteractionComponent16 .class, ProcessingResult22 .class, ProcessingResult27 .class, ProgrammeMode4 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, QRCodePresentmentMode1Code.class, ReceiptType1Code.class, Recipient5Choice.class, Recipient7Choice.class, RecommendationAction1 .class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RiskAssessment1Code.class, RiskAssessment3 .class, RiskContext3 .class, RiskInputData2 .class, SecurityCharacteristics1Code.class, SettlementService5 .class, SettlementService6 .class, Software1 .class, SoftwareType1Code.class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, SponsoredMerchant3 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal7 .class, Terminal9 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAmounts3 .class, TransactionAttribute2Code.class, TransactionIdentification54 .class, TransactionIdentification56 .class, TransactionInitiator1Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface1Code.class, Verification3Code.class, Verification6 .class, Verification7 .class, VerificationEntity2Code.class, VerificationValue1 .class, Wallet3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caad.008.001.02";

    public MxCaad00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaad00800102(final String xml) {
        this();
        MxCaad00800102 tmp = parse(xml);
        admstvInitn = tmp.getAdmstvInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaad00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the admstvInitn property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeInitiationV02 }
     *     
     */
    public AdministrativeInitiationV02 getAdmstvInitn() {
        return admstvInitn;
    }

    /**
     * Sets the value of the admstvInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeInitiationV02 }
     *     
     */
    public MxCaad00800102 setAdmstvInitn(AdministrativeInitiationV02 value) {
        this.admstvInitn = value;
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
    public static MxCaad00800102 parse(String xml) {
        return ((MxCaad00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaad00800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaad00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaad00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaad00800102 parse(String xml, MxRead parserImpl) {
        return ((MxCaad00800102) parserImpl.read(MxCaad00800102 .class, xml, _classes));
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
     * Creates an MxCaad00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaad00800102 message
     * @return
     *     a new instance of MxCaad00800102
     */
    public static final MxCaad00800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaad00800102 .class);
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
