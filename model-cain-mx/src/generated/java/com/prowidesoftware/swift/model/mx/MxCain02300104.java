
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
 * Class for cain.023.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cardMgmtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.023.001.04")
public class MxCain02300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CardMgmtInitn", required = true)
    protected CardManagementInitiationV04 cardMgmtInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 23;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData1 .class, AccountDetails4 .class, AcquirerData1 .class, AdditionalAmounts5 .class, AdditionalFee4 .class, AdditionalService3 .class, AdditionalServiceType3Code.class, Address4 .class, AttestationValue1Code.class, Authority1 .class, CardAuthenticationData1 .class, CardData16 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardDataWriting2Code.class, CardExchangeRate1 .class, CardManagementInitiationV04 .class, Cardholder23 .class, CardholderName2 .class, CardholderVerificationCapability6Code.class, ContactPersonal2 .class, ContentInformationType41 .class, Context28 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice6 .class, DateTime2 .class, DestinationData1 .class, DetailedAmount24 .class, DeviceIdentification2 .class, DeviceIdentificationType2Code.class, DisplayCapabilities6 .class, ECommerceData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, Endpoint2Code.class, ExchangeRateAgreementType2Code.class, ExchangeRateType3Code.class, Exemption2 .class, Exemption2Code.class, Frequency12Code.class, Header72 .class, ICCFallbackReason2Code.class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalData19 .class, LocalData20 .class, LocalData22 .class, LocalData24 .class, MACData1 .class, MOTO2Code.class, MessageClass2Code.class, MessageFunction16Code.class, MxCain02300104 .class, OnLineCapability2Code.class, OriginalDataElements5 .class, OriginalTransactionIdentification2 .class, OriginatorData2 .class, OutputFormat1Code.class, PINData1 .class, POIComponentType5Code.class, PartyType20Code.class, PointOfInteractionComponent16 .class, ProcessingResult28 .class, ProgrammeMode7 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, QRCodePresentmentMode2Code.class, ReceiverData1 .class, RecommendationAction2 .class, RecommendedActionCode1 .class, Reconciliation5 .class, RiskAssessment1Code.class, RiskAssessment4 .class, RiskContext4 .class, RiskInputData3 .class, SecurityCharacteristics2Code.class, SenderData1 .class, SettlementService7 .class, Software2 .class, SoftwareType2Code.class, StorageLocation2Code.class, StrongCustomerAuthentication2 .class, SubMerchant1 .class, Terminal10 .class, TerminalIntegrationCategory1Code.class, TerminalType2Code.class, Token4 .class, Token5 .class, Track2Data1Choice.class, TransactionAmounts6 .class, TransactionAttribute3Code.class, TransactionCharacteristics6 .class, TransactionIdentification58 .class, TransactionInitiator1Code.class, TransactorData1 .class, TypeOfAmount22Code.class, UserInterface1Code.class, Verification4Code.class, Verification8 .class, VerificationEntity3Code.class, VerificationValue1 .class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.023.001.04";

    public MxCain02300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02300104(final String xml) {
        this();
        MxCain02300104 tmp = parse(xml);
        cardMgmtInitn = tmp.getCardMgmtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cardMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CardManagementInitiationV04 }
     *     
     */
    public CardManagementInitiationV04 getCardMgmtInitn() {
        return cardMgmtInitn;
    }

    /**
     * Sets the value of the cardMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardManagementInitiationV04 }
     *     
     */
    public MxCain02300104 setCardMgmtInitn(CardManagementInitiationV04 value) {
        this.cardMgmtInitn = value;
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
    public static MxCain02300104 parse(String xml) {
        return ((MxCain02300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02300104 parse(String xml, MxRead parserImpl) {
        return ((MxCain02300104) parserImpl.read(MxCain02300104 .class, xml, _classes));
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
     * Creates an MxCain02300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02300104 message
     * @return
     *     a new instance of MxCain02300104
     */
    public static final MxCain02300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02300104 .class);
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
