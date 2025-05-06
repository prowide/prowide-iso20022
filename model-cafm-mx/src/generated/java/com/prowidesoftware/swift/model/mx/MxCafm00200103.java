
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
 * Class for cafm.002.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileActnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafm.002.001.03")
public class MxCafm00200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FileActnRspn", required = true)
    protected FileActionResponseV03 fileActnRspn;
    public static final transient String BUSINESS_PROCESS = "cafm";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, Address2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData15 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardDataWriting1Code.class, CardReadingCapabilities1 .class, CardWritingCapabilities1 .class, Cardholder22 .class, CardholderName2 .class, CardholderName3 .class, CardholderVerificationCapabilities1 .class, CardholderVerificationCapability5Code.class, CertificateIssuer1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CorporateTaxType1Code.class, CorrectionIdentification1 .class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice5 .class, CustomerDeviceType2Code.class, DataRecord1Choice.class, DeviceIdentification1 .class, DeviceIdentificationType1Code.class, DisplayCapabilities6 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, FileActionResponseV03 .class, FinancialInstitution8 .class, Frequency12Code.class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalAddress1 .class, LocalData10 .class, LocalData11 .class, LocalData13 .class, LocalData14 .class, LocalData15 .class, MACData1 .class, MxCafm00200103 .class, OnLineCapability2Code.class, OutputFormat1Code.class, OutputFormat5Code.class, PINEntrySecurityCharacteristic1Code.class, POIComponentType5Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification284 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification287 .class, PartyType17Code.class, PartyType18Code.class, PartyType32Code.class, PointOfInteractionComponent16 .class, ProgrammeMode5 .class, ProtectedData2 .class, ProtectionMethod1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RiskAssessment1Code.class, SettlementService6 .class, Software1 .class, SoftwareType1Code.class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal7 .class, TerminalIntegrationCategory1Code.class, TerminalType1Code.class, Token2 .class, Traceability10 .class, TypeOfAmount21Code.class, UserInterface1Code.class, Wallet3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafm.002.001.03";

    public MxCafm00200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafm00200103(final String xml) {
        this();
        MxCafm00200103 tmp = parse(xml);
        fileActnRspn = tmp.getFileActnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafm00200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fileActnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FileActionResponseV03 }
     *     
     */
    public FileActionResponseV03 getFileActnRspn() {
        return fileActnRspn;
    }

    /**
     * Sets the value of the fileActnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionResponseV03 }
     *     
     */
    public MxCafm00200103 setFileActnRspn(FileActionResponseV03 value) {
        this.fileActnRspn = value;
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
    public static MxCafm00200103 parse(String xml) {
        return ((MxCafm00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafm00200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafm00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafm00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafm00200103 parse(String xml, MxRead parserImpl) {
        return ((MxCafm00200103) parserImpl.read(MxCafm00200103 .class, xml, _classes));
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
     * Creates an MxCafm00200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafm00200103 message
     * @return
     *     a new instance of MxCafm00200103
     */
    public static final MxCafm00200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafm00200103 .class);
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
