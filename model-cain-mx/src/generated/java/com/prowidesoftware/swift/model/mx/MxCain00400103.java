
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
 * Class for cain.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.004.001.03")
public class MxCain00400103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FinRspn", required = true)
    protected FinancialResponseV03 finRspn;
    public final static transient String BUSINESS_PROCESS = "cain";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountBalance2 .class, AccountDetails3 .class, Action13 .class, ActionDestination1Code.class, ActionType10Code.class, ActionType11Code.class, ActionType8Code.class, AddendumData4 .class, AdditionalAction1 .class, AdditionalAmounts3 .class, AdditionalData1 .class, AdditionalFee2 .class, AdditionalInformation20 .class, AdditionalInformation29 .class, AdditionalRiskData1 .class, AdditionalService2 .class, AdditionalServiceResult1Code.class, AdditionalServiceType2Code.class, Address2 .class, Address3 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount15 .class, Amount16 .class, Amount17 .class, ApprovalEntity2 .class, AttributeType1Code.class, Authority1 .class, Balance28 .class, BalanceType15Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData9 .class, CardDataReading10Code.class, CardDataReading9Code.class, CardProgrammeMode3 .class, Cardholder19 .class, CardholderName2 .class, CardholderName3 .class, CertificateIssuer1 .class, Contact1 .class, Contact6 .class, Content1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context13 .class, Credentials2 .class, CreditDebit3Code.class, DetailedAmount22 .class, DisputeData3 .class, DisputeIdentification1 .class, DisputeReference1 .class, ECommerceData1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment26 .class, ErrorDetails2 .class, FeeAmount3 .class, FeeCollectionInitiator1Code.class, FinancialResponse2 .class, FinancialResponseV03 .class, FleetData5 .class, FleetLineItem3 .class, FleetServiceType1Code.class, Frequency12Code.class, Frequency18Code.class, GenericIdentification183 .class, GracePeriod2 .class, GracePeriodUnitType1Code.class, Header62 .class, Identification3Code.class, Instalment4 .class, InstalmentAmountDetails2 .class, InstalmentAmountDetailsType2Code.class, InstalmentPeriod1Code.class, InterestRate1Code.class, InterestRateDetails2 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LifeCycleSupport1Code.class, LocalData1 .class, LocalData7 .class, MACData1 .class, MOTO1Code.class, MessageClass1Code.class, MessageError1Code.class, MessageFunction16Code.class, MxCain00400103 .class, OriginalDataElements2 .class, OriginalTransactionAmount2 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification200 .class, PartyIdentification258 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, PartyType20Code.class, PartyType21Code.class, PartyType22Code.class, PartyType26Code.class, PartyType28Code.class, PartyType32Code.class, PartyType9Code.class, Plan2 .class, PlanOwner1Code.class, PointOfServiceContext4 .class, Priority3Code.class, ProcessingResult10 .class, ProtectedData1 .class, ProtectionMethod1Code.class, QRCodePresentmentMode1Code.class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, Response8Code.class, ResultData7 .class, RiskAssessment1Code.class, RiskAssessment2 .class, RiskAssessmentDataEntityProvider1 .class, RiskContext2 .class, RiskInputData1 .class, SecurityCharacteristics1Code.class, SettlementReportingEntity1 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SpecialConditions1 .class, SpecialProgrammeDetails1 .class, SpecialProgrammeQualification1 .class, StorageLocation1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Terminal6 .class, TerminalIdentification3 .class, Token2 .class, Traceability9 .class, Transaction143 .class, TransactionAmount1 .class, TransactionAmounts2 .class, TransactionAttribute2Code.class, TransactionContext8 .class, TransactionIdentification51 .class, TransactionInitiator1Code.class, TransactionLifeCycleIdentification1 .class, TypeOfAmount21Code.class, TypeOfAmount22Code.class, UnitOfMeasure1Code.class, UserInterface6Code.class, Verification3Code.class, Verification4 .class, VerificationEntity2Code.class, VerificationResult2 .class, Wallet2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.004.001.03";

    public MxCain00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain00400103(final String xml) {
        this();
        MxCain00400103 tmp = parse(xml);
        finRspn = tmp.getFinRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finRspn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialResponseV03 }
     *     
     */
    public FinancialResponseV03 getFinRspn() {
        return finRspn;
    }

    /**
     * Sets the value of the finRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialResponseV03 }
     *     
     */
    public MxCain00400103 setFinRspn(FinancialResponseV03 value) {
        this.finRspn = value;
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
    public static MxCain00400103 parse(String xml) {
        return ((MxCain00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain00400103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain00400103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCain00400103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain00400103 parse(String xml, MxRead parserImpl) {
        return ((MxCain00400103) parserImpl.read(MxCain00400103 .class, xml, _classes));
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
     * Creates an MxCain00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain00400103 message
     * @return
     *     a new instance of MxCain00400103
     */
    public final static MxCain00400103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCain00400103 .class);
    }

}
