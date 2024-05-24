
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
 * Class for cafm.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileActnInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02")
public class MxCafm00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FileActnInitn", required = true)
    protected FileActionInitiationV02 fileActnInitn;
    public static final transient String BUSINESS_PROCESS = "cafm";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee2 .class, Address2 .class, Address3 .class, Algorithm11Code.class, Algorithm13Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, AuthenticatedData5 .class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, Capabilities2 .class, CardData8 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardProgrammeMode3 .class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, CommunicationCharacteristics3 .class, Contact1 .class, Contact6 .class, ContentInformationType19 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CorrectionIdentification1 .class, Credentials2 .class, CreditDebit3Code.class, CryptographicKey13 .class, CryptographicKeyType3Code.class, Customer7 .class, CustomerDevice4 .class, CustomerDeviceType2Code.class, DataRecord1Choice.class, Device2 .class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DeviceOperatingSystem1 .class, DeviceOperatingSystemType1Code.class, DigestedData5 .class, DisplayCapabilities6 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat2Code.class, EncryptionFormat3Code.class, EnvelopedData5 .class, EnvelopedData6 .class, Environment22 .class, FeeAmount3 .class, FileActionDetails2 .class, FileActionInitiation2 .class, FileActionInitiationV02 .class, FileActionResult1Code.class, FileActionScope1Code.class, FileActionType2Code.class, FinancialInstitution7 .class, Frequency12Code.class, GenericIdentification183 .class, GenericIdentification48 .class, GenericInformation1 .class, Header68 .class, Identification3Code.class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK5 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport5 .class, KeyTransport6 .class, KeyUsage1Code.class, LocalData1 .class, LocalData2 .class, LocalData3 .class, LocalData4 .class, LocalData5 .class, LocalData7 .class, MACData1 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction44Code.class, MxCafm00100102 .class, OnLineCapability2Code.class, OriginatorInformation1 .class, OutputFormat1Code.class, OutputFormat5Code.class, PINEntrySecurityCharacteristic1Code.class, POICommunicationType2Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter13 .class, Parameter14 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification254 .class, PartyIdentification257 .class, PartyIdentification258 .class, PartyIdentification262 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType7Code.class, PointOfInteractionComponent13 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification3 .class, PointOfInteractionComponentStatus3 .class, Priority3Code.class, ProtectedData1 .class, ProtectionMethod1Code.class, Recipient5Choice.class, Recipient6Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, ResultData9 .class, RiskAssessment1Code.class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SignedData5 .class, Signer4 .class, SponsoredMerchant2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal4 .class, TerminalIdentification3 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token3 .class, Token4 .class, Traceability9 .class, Transaction157 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount21Code.class, UserInterface1Code.class, Wallet2 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02";

    public MxCafm00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafm00100102(final String xml) {
        this();
        MxCafm00100102 tmp = parse(xml);
        fileActnInitn = tmp.getFileActnInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafm00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fileActnInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionInitiationV02 }
     *     
     */
    public FileActionInitiationV02 getFileActnInitn() {
        return fileActnInitn;
    }

    /**
     * Sets the value of the fileActnInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionInitiationV02 }
     *     
     */
    public MxCafm00100102 setFileActnInitn(FileActionInitiationV02 value) {
        this.fileActnInitn = value;
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
    public static MxCafm00100102 parse(String xml) {
        return ((MxCafm00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafm00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafm00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafm00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCafm00100102) parserImpl.read(MxCafm00100102 .class, xml, _classes));
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
     * Creates an MxCafm00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafm00100102 message
     * @return
     *     a new instance of MxCafm00100102
     */
    public static final MxCafm00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafm00100102 .class);
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
