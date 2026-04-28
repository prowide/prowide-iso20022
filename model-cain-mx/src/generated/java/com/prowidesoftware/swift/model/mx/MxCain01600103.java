
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
 * Class for cain.016.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nqryInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.03")
public class MxCain01600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NqryInitn", required = true)
    protected InquiryInitiationV03 nqryInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails4 .class, Action16 .class, ActionDestination1Code.class, ActionType14Code.class, ActionType8Code.class, AdditionalAmounts4 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttestationValue1Code.class, AttributeType1Code.class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData11 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder22 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context23 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice5 .class, CustomerDeviceType2Code.class, DateTime2 .class, DetailedAmount22 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DisplayCapabilities6 .class, ECommerceData1 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData12 .class, ExchangeRateAgreementType1Code.class, ExchangeRateInformation5 .class, ExchangeRateType2Code.class, Exemption2 .class, Exemption2Code.class, Frequency12Code.class, Frequency18Code.class, GenericIdentification183 .class, GracePeriodUnitType1Code.class, Header71 .class, ICCFallbackReason1Code.class, InquiryInitiationV03 .class, Instalment6 .class, InstalmentAmountDetails3 .class, InstalmentAmountDetailsType3Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalData11 .class, LocalData12 .class, LocalData13 .class, LocalData14 .class, MACData1 .class, MOTO2Code.class, MxCain01600103 .class, OnLineCapability2Code.class, OutputFormat1Code.class, OutputFormat4Code.class, PINData1 .class, PINEntrySecurityCharacteristic1Code.class, POIComponentType5Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification288 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType34Code.class, PartyType9Code.class, Plan3 .class, PlanOwner1Code.class, PointOfInteractionComponent16 .class, ProcessingResult27 .class, ProgrammeMode4 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, QRCodePresentmentMode1Code.class, Recipient5Choice.class, Recipient7Choice.class, RecommendationAction1 .class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RiskAssessment1Code.class, RiskAssessment3 .class, RiskContext3 .class, RiskInputData2 .class, SecurityCharacteristics1Code.class, SettlementService5 .class, Software1 .class, SoftwareType1Code.class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, SponsoredMerchant3 .class, StorageLocation1Code.class, StrongCustomerAuthentication2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal7 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAmounts4 .class, TransactionCharacteristics2 .class, TransactionIdentification54 .class, TransactionInitiator1Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface1Code.class, Verification3Code.class, Verification6 .class, VerificationEntity2Code.class, VerificationValue1 .class, Wallet3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.016.001.03";

    public MxCain01600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01600103(final String xml) {
        this();
        MxCain01600103 tmp = parse(xml);
        nqryInitn = tmp.getNqryInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the nqryInitn property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryInitiationV03 }
     *     
     */
    public InquiryInitiationV03 getNqryInitn() {
        return nqryInitn;
    }

    /**
     * Sets the value of the nqryInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryInitiationV03 }
     *     
     */
    public MxCain01600103 setNqryInitn(InquiryInitiationV03 value) {
        this.nqryInitn = value;
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
    public static MxCain01600103 parse(String xml) {
        return ((MxCain01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01600103 parse(String xml, MxRead parserImpl) {
        return ((MxCain01600103) parserImpl.read(MxCain01600103 .class, xml, _classes));
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
     * Creates an MxCain01600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01600103 message
     * @return
     *     a new instance of MxCain01600103
     */
    public final static MxCain01600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01600103 .class);
    }

}
