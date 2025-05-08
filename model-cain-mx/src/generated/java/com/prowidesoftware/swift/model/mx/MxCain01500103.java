
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
 * Class for cain.015.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlFlfmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.015.001.03")
public class MxCain01500103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlFlfmtRspn", required = true)
    protected RetrievalFulfilmentResponseV03 rtrvlFlfmtRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, Address2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, Authority1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData13 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardholderName2 .class, CardholderName3 .class, CertificateIssuer1 .class, ContactBusiness1 .class, ContactPersonal1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, Context24 .class, Credentials3 .class, CreditDebit3Code.class, DateTime2 .class, DisputeData4 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, ErrorDetails3 .class, FinancialInstitution8 .class, Frequency12Code.class, GenericIdentification183 .class, GoodAndServiceDeliveryChannel1Code.class, GoodAndServiceDeliverySchedule1Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType1Code.class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalData10 .class, LocalData14 .class, LocalData15 .class, MACData1 .class, MOTO2Code.class, MessageError1Code.class, MxCain01500103 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyIdentification287 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType26Code.class, PartyType32Code.class, PartyType9Code.class, ProcessingResult23 .class, ProgrammeMode5 .class, ProtectedData2 .class, ProtectionMethod1Code.class, PurchaseIdentifierType2Code.class, QRCodePresentmentMode1Code.class, ReceiptType1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, RetrievalFulfilmentInstructions3 .class, RetrievalFulfilmentResponseV03 .class, RiskAssessment1Code.class, SecurityCharacteristics1Code.class, SettlementService6 .class, SpecialProgrammeDetails2 .class, SpecialProgrammeQualification2 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal8 .class, Token2 .class, Traceability10 .class, Track2Data1Choice.class, TransactionAttribute2Code.class, TransactionCharacteristics3 .class, TransactionIdentification54 .class, TransactionInitiator1Code.class, TypeOfAmount21Code.class, UserInterface8Code.class, Wallet3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.015.001.03";

    public MxCain01500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01500103(final String xml) {
        this();
        MxCain01500103 tmp = parse(xml);
        rtrvlFlfmtRspn = tmp.getRtrvlFlfmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlFlfmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalFulfilmentResponseV03 }
     *     
     */
    public RetrievalFulfilmentResponseV03 getRtrvlFlfmtRspn() {
        return rtrvlFlfmtRspn;
    }

    /**
     * Sets the value of the rtrvlFlfmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalFulfilmentResponseV03 }
     *     
     */
    public MxCain01500103 setRtrvlFlfmtRspn(RetrievalFulfilmentResponseV03 value) {
        this.rtrvlFlfmtRspn = value;
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
    public static MxCain01500103 parse(String xml) {
        return ((MxCain01500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01500103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain01500103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01500103 parse(String xml, MxRead parserImpl) {
        return ((MxCain01500103) parserImpl.read(MxCain01500103 .class, xml, _classes));
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
     * Creates an MxCain01500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01500103 message
     * @return
     *     a new instance of MxCain01500103
     */
    public static final MxCain01500103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain01500103 .class);
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
