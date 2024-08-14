
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
 * Class for cain.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cardMgmtRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.024.001.01")
public class MxCain02400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CardMgmtRspn", required = true)
    protected CardManagementResponseV01 cardMgmtRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 24;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Action9 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AdditionalAction1 .class, AdditionalAmounts2 .class, AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation20 .class, AdditionalRiskData1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount14 .class, Amount4 .class, ApprovalData1 .class, ApprovalEntity1 .class, AttributeType1Code.class, AuthenticationMethod11Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData4 .class, CardDataReading7Code.class, CardManagementResponse1 .class, CardManagementResponseV01 .class, CardProgramme1 .class, CardProgrammeMode1 .class, CardProgrammeMode2 .class, CertificateIssuer1 .class, Content1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context5 .class, CustomerDevice2 .class, CustomerDeviceType1Code.class, Device1 .class, ECommerceData1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment7 .class, FeeAmount2 .class, GenericIdentification172 .class, GeographicCoordinates1 .class, Header39 .class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, MACData1 .class, MessageClass1Code.class, MessageFunction17Code.class, MxCain02400101 .class, OriginalDataElements1 .class, OutputFormat4Code.class, PINData1 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyIdentification200 .class, PartyIdentification204 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType9Code.class, PointOfServiceContext1 .class, Priority3Code.class, ProcessingResult1 .class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData1 .class, RiskAssessment1 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext1 .class, RiskInputData1 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService1 .class, SettlementServiceDate1 .class, SettlementServiceMode1 .class, SpecialConditions1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal2 .class, TerminalIdentification1 .class, Token1 .class, Traceability7 .class, Transaction81 .class, TransactionContext1 .class, TransactionIdentification8 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount10Code.class, TypeOfAmount17Code.class, UserInterface6Code.class, Verification1 .class, Verification2Code.class, VerificationEntity1Code.class, VerificationInformation1 .class, VerificationResult1 .class, VerificationValue1Choice.class, Wallet1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.024.001.01";

    public MxCain02400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02400101(final String xml) {
        this();
        MxCain02400101 tmp = parse(xml);
        cardMgmtRspn = tmp.getCardMgmtRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cardMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardManagementResponseV01 }
     *     
     */
    public CardManagementResponseV01 getCardMgmtRspn() {
        return cardMgmtRspn;
    }

    /**
     * Sets the value of the cardMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardManagementResponseV01 }
     *     
     */
    public MxCain02400101 setCardMgmtRspn(CardManagementResponseV01 value) {
        this.cardMgmtRspn = value;
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
    public static MxCain02400101 parse(String xml) {
        return ((MxCain02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02400101 parse(String xml, MxRead parserImpl) {
        return ((MxCain02400101) parserImpl.read(MxCain02400101 .class, xml, _classes));
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
     * Creates an MxCain02400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02400101 message
     * @return
     *     a new instance of MxCain02400101
     */
    public static final MxCain02400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02400101 .class);
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
