
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
 * Class for cain.021.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrvlInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.021.001.04")
public class MxCain02100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrvlInitn", required = true)
    protected RetrievalInitiationV04 rtrvlInitn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData2 .class, AcceptorData3 .class, AccountDetails4 .class, AcquirerData1 .class, AdditionalAmounts5 .class, AdditionalData1 .class, AdditionalFee4 .class, AdditionalService3 .class, AdditionalServiceType3Code.class, Address4 .class, Authority1 .class, CardData17 .class, CardDataReading11Code.class, CardDataReading12Code.class, CardDataWriting2Code.class, CardDepositType2Code.class, CardExchangeRate1 .class, Cardholder23 .class, CardholderName2 .class, CardholderVerificationCapability6Code.class, ContactPersonal2 .class, ContentInformationType41 .class, Context26 .class, Context30 .class, CorporateTaxType1Code.class, Credentials3 .class, CreditDebit3Code.class, CustomerDevice6 .class, DateTime2 .class, DepositDetails4 .class, DestinationData1 .class, DetailedAmount24 .class, DeviceIdentification2 .class, DeviceIdentificationType2Code.class, DisplayCapabilities6 .class, DisputeData5 .class, DisputeDocumentation2 .class, ECommerceData1 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, Endpoint2Code.class, ErrorDetails4 .class, ExchangeRateAgreementType2Code.class, ExchangeRateType3Code.class, FinancialInstitution10 .class, Frequency12Code.class, FundingService4 .class, FundingSource5 .class, FundingSourceType4Code.class, GoodAndServiceDeliveryChannel2Code.class, GoodAndServiceDeliverySchedule2Code.class, GoodsAndServices1Code.class, GoodsAndServicesSubType2Code.class, Header72 .class, ICCFallbackReason2Code.class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalData10 .class, LocalData18 .class, LocalData19 .class, LocalData20 .class, LocalData21 .class, LocalData22 .class, LocalData24 .class, MACData1 .class, MOTO2Code.class, MxCain02100104 .class, OnLineCapability2Code.class, OriginalTransaction4 .class, OriginalTransactionCharacteristics2 .class, OriginatorData2 .class, OutputFormat1Code.class, OutputFormat6Code.class, POIComponentType5Code.class, PartyType20Code.class, PayeeData1 .class, PayerData1 .class, PointOfInteractionComponent16 .class, ProcessingResult29 .class, ProcessingResult31 .class, ProgrammeMode6 .class, ProgrammeMode7 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, QRCodePresentmentMode2Code.class, ReceiptType1Code.class, ReceiverData1 .class, RecommendationAction2 .class, RecommendedActionCode1 .class, Reconciliation5 .class, RetrievalInitiationV04 .class, RiskAssessment1Code.class, RiskAssessment4 .class, RiskContext4 .class, RiskInputData3 .class, SecurityCharacteristics2Code.class, SenderData1 .class, SettlementService7 .class, Software2 .class, SoftwareType2Code.class, StorageLocation2Code.class, SubMerchant1 .class, Terminal12 .class, Terminal13 .class, TerminalIntegrationCategory1Code.class, TerminalType2Code.class, Token4 .class, Token5 .class, TransactionAmounts5 .class, TransactionAttribute3Code.class, TransactionCharacteristics6 .class, TransactionIdentification60 .class, TransactionInitiator1Code.class, TransactorData1 .class, TypeOfAmount22Code.class, UserInterface1Code.class, Verification4Code.class, Verification9 .class, VerificationEntity3Code.class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.021.001.04";

    public MxCain02100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain02100104(final String xml) {
        this();
        MxCain02100104 tmp = parse(xml);
        rtrvlInitn = tmp.getRtrvlInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain02100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrvlInitn property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalInitiationV04 }
     *     
     */
    public RetrievalInitiationV04 getRtrvlInitn() {
        return rtrvlInitn;
    }

    /**
     * Sets the value of the rtrvlInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalInitiationV04 }
     *     
     */
    public MxCain02100104 setRtrvlInitn(RetrievalInitiationV04 value) {
        this.rtrvlInitn = value;
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
    public static MxCain02100104 parse(String xml) {
        return ((MxCain02100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain02100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain02100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain02100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain02100104 parse(String xml, MxRead parserImpl) {
        return ((MxCain02100104) parserImpl.read(MxCain02100104 .class, xml, _classes));
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
     * Creates an MxCain02100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain02100104 message
     * @return
     *     a new instance of MxCain02100104
     */
    public static final MxCain02100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain02100104 .class);
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
