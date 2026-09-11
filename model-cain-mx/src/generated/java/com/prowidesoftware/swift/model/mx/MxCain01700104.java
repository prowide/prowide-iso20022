
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for cain.017.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "nqryVrfctnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cain.017.001.04")
public class MxCain01700104
    extends AbstractMX
{

    @XmlElement(name = "NqryVrfctnRspn", required = true)
    protected InquiryVerificationResponseV04 nqryVrfctnRspn;
    public static final transient String BUSINESS_PROCESS = "cain";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ATICALaxProcessing.class, ATICAPartyType1Code.class, AcceptorData2 .class, AccountBalance4 .class, AccountDetails4 .class, AccountStatementData3 .class, AccountStatementDetails3 .class, AcquirerData1 .class, AdditionalAmounts5 .class, AdditionalData1 .class, AdditionalFee4 .class, AdditionalService3 .class, AdditionalServiceType3Code.class, Address4 .class, AttestationValue1Code.class, Authority1 .class, BenefitSupportingData1 .class, CardAccountBalance1 .class, CardAuthenticationData1 .class, CardData17 .class, CardDataReading11Code.class, CardDataReading12Code.class, Cardholder23 .class, CardholderName2 .class, ContactPersonal2 .class, ContentInformationType41 .class, Context27 .class, Credentials3 .class, CreditDebit3Code.class, DateTime2 .class, DestinationData1 .class, DetailedAmount24 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, ErrorDetails4 .class, Exemption2 .class, Exemption2Code.class, FinancialInstitution10 .class, Frequency12Code.class, Frequency18Code.class, GracePeriodUnitType2Code.class, Header72 .class, InquiryVerificationResponseV04 .class, Instalment8 .class, InstalmentAmountData1 .class, InstalmentAmountDetailsType4Code.class, InstalmentPlan1 .class, IssuerData1 .class, Jurisdiction2 .class, LifeCycleSupport1Code.class, LocalAddress1 .class, LocalAddress2 .class, LocalData10 .class, LocalData18 .class, LocalData20 .class, LocalData21 .class, LocalData22 .class, LocalData24 .class, MACData1 .class, MOTO2Code.class, MxCain01700104 .class, OriginatorData2 .class, PayeeData1 .class, PayerData1 .class, PlanOwner2Code.class, ProcessingResult29 .class, ProgrammeMode6 .class, ProtectionMethod2Code.class, PurchaseIdentifierType3Code.class, QRCodePresentmentMode2Code.class, ReceiverData1 .class, RecommendationAction2 .class, RecommendedActionCode1 .class, Reconciliation5 .class, RiskAssessment1Code.class, RiskAssessment4 .class, RiskContext4 .class, RiskInputData3 .class, SecurityCharacteristics2Code.class, SenderData1 .class, SettlementService7 .class, StorageLocation2Code.class, StrongCustomerAuthentication2 .class, SubMerchant1 .class, Terminal12 .class, Token4 .class, Token5 .class, TransactionAmounts6 .class, TransactionAttribute3Code.class, TransactionCharacteristics5 .class, TransactionIdentification60 .class, TransactionInitiator1Code.class, TransactorData1 .class, TypeOfAmount22Code.class, Verification4Code.class, Verification9 .class, VerificationEntity3Code.class, Wallet4 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cain.017.001.04";

    public MxCain01700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCain01700104(final String xml) {
        this();
        MxCain01700104 tmp = parse(xml);
        nqryVrfctnRspn = tmp.getNqryVrfctnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCain01700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the nqryVrfctnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryVerificationResponseV04 }
     *     
     */
    public InquiryVerificationResponseV04 getNqryVrfctnRspn() {
        return nqryVrfctnRspn;
    }

    /**
     * Sets the value of the nqryVrfctnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryVerificationResponseV04 }
     *     
     */
    public MxCain01700104 setNqryVrfctnRspn(InquiryVerificationResponseV04 value) {
        this.nqryVrfctnRspn = value;
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
    public static MxCain01700104 parse(String xml) {
        return ((MxCain01700104) MxReadImpl.parse(MxCain01700104 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCain01700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCain01700104) MxReadImpl.parse(MxCain01700104 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCain01700104 parse(String xml, MxRead parserImpl) {
        return ((MxCain01700104) parserImpl.read(MxCain01700104 .class, xml, _classes));
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
     * Creates an MxCain01700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCain01700104 message
     * @return
     *     a new instance of MxCain01700104
     */
    public static final MxCain01700104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCain01700104 .class);
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
