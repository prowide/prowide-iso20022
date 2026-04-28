
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
 * Class for cain.027.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "chrgBckInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.027.001.03")
public class MxCain02700103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ChrgBckInitn", required = true)
    protected ChargeBackInitiationV03 chrgBckInitn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountDetails4 .class, Action16 .class, ActionDestination1Code.class, ActionType14Code.class, ActionType8Code.class, AdditionalAmounts4 .class, AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData13 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardDepositType1Code.class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder22 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ChargeBackInitiationV03 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context19 .class, Context21 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice5 .class, CustomerDeviceType2Code.class, DateTime2 .class, DepositDetails3 .class, DetailedAmount22 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DisplayCapabilities6 .class, DisputeData4 .class, DisputeDocumentation1 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, Endpoint1Code.class, EnvelopedData12 .class, ErrorDetails3 .class, ExchangeRateAgreementType1Code.class, ExchangeRateInformation5 .class, ExchangeRateType2Code.class, FinancialInstitution8 .class, Frequency12Code.class, FundingService3 .class, FundingSource4 .class, FundingSourceType3Code.class, GenericIdentification183 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, Header71 .class, ICCFallbackReason1Code.class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalData10 .class, LocalData11 .class, LocalData13 .class, LocalData14 .class, LocalData15 .class, MACData1 .class, MOTO2Code.class, MessageError1Code.class, MxCain02700103 .class, OnLineCapability2Code.class, OriginalTransaction3 .class, OriginalTransactionAmounts3 .class, OriginalTransactionCharacteristics1 .class, OutputFormat1Code.class, OutputFormat4Code.class, PINEntrySecurityCharacteristic1Code.class, POIComponentType5Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification284 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification287 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType34Code.class, PartyType9Code.class, PointOfInteractionComponent16 .class, ProcessingResult22 .class, ProcessingResult25 .class, ProgrammeMode4 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, QRCodePresentmentMode1Code.class, ReceiptType1Code.class, Recipient5Choice.class, Recipient7Choice.class, RecommendationAction1 .class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RiskAssessment1Code.class, RiskAssessment3 .class, RiskContext3 .class, RiskInputData2 .class, SecurityCharacteristics1Code.class, SettlementService5 .class, SettlementService6 .class, Software1 .class, SoftwareType1Code.class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal8 .class, Terminal9 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAmounts3 .class, TransactionAttribute2Code.class, TransactionCharacteristics3 .class, TransactionIdentification54 .class, TransactionIdentification55 .class, TransactionInitiator1Code.class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UserInterface1Code.class, Verification3Code.class, Verification7 .class, VerificationEntity2Code.class, Wallet3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.027.001.03";

    public MxCain02700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02700103(final String xml) {
        this();
        MxCain02700103 tmp = parse(xml);
        chrgBckInitn = tmp.getChrgBckInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the chrgBckInitn property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBackInitiationV03 }
     *     
     */
    public ChargeBackInitiationV03 getChrgBckInitn() {
        return chrgBckInitn;
    }

    /**
     * Sets the value of the chrgBckInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBackInitiationV03 }
     *     
     */
    public MxCain02700103 setChrgBckInitn(ChargeBackInitiationV03 value) {
        this.chrgBckInitn = value;
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
    public static MxCain02700103 parse(String xml) {
        return ((MxCain02700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02700103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02700103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02700103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02700103 parse(String xml, MxRead parserImpl) {
        return ((MxCain02700103) parserImpl.read(MxCain02700103 .class, xml, _classes));
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
     * Creates an MxCain02700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02700103 message
     * @return
     *     a new instance of MxCain02700103
     */
    public final static MxCain02700103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02700103 .class);
    }

}
