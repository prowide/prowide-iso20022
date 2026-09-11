
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
 * Class for trck.005.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trckrInvstgtnStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:trck.005.001.03")
public class MxTrck00500103
    extends AbstractMX
{

    @XmlElement(name = "TrckrInvstgtnStsNtfctn", required = true)
    protected TrackerInvestigationStatusNotificationV03 trckrInvstgtnStsNtfctn;
    public static final transient String BUSINESS_PROCESS = "trck";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalRequestData1Choice.class, AddressType2Code.class, AddressType3Choice.class, AdjustmentCompensation1 .class, AdjustmentRequest1 .class, AmendmentInformationDetails14 .class, AmountType4Choice.class, BookingConfirmation5 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancellationReason33Choice.class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges6 .class, ChargesRecord3 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, CompensationRequest1 .class, CompensationResponse1 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriod5 .class, DebitAuthorisation3 .class, DebitAuthorisationConfirmation3 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, Document12 .class, DocumentAdjustment1 .class, DocumentFormat1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FileData1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstitutionIdentification21 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InvestigationData6 .class, InvestigationDataRecord7Choice.class, InvestigationIdentification4 .class, InvestigationLocationData1 .class, InvestigationLocationMethod1Code.class, InvestigationReason1Choice.class, InvestigationReason2 .class, InvestigationReasonSubType1Choice.class, InvestigationRequestStatus1Choice.class, InvestigationRequestStatusReason1Choice.class, InvestigationSubType1Choice.class, InvestigationType2Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData4Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxTrck00500103 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessInstruction4 .class, OriginalGroupInformation33 .class, OriginalTransactionReference48 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyAndSignature3 .class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTransactionStatus1 .class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RelatedInvestigationData1 .class, Remittance1 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, RemittanceLocation7 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction11 .class, SettlementMethod1Code.class, SkipPayload.class, StatusReason6Choice.class, StatusReasonInformation12 .class, StructuredRemittanceInformation16 .class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxPeriod3 .class, TaxRecord2 .class, TaxRecord3 .class, TaxRecordDetails2 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TrackerHeader12 .class, TrackerInvestigationRequest4 .class, TrackerInvestigationRequestStatus4 .class, TrackerInvestigationStatusNotificationV03 .class, TrackerNotificationSubType1Choice.class, TrackerNotificationType1Choice.class, TrackerParty2Choice.class, TrackerPartyIdentification2 .class, TransactionAmendment1 .class, TransactionAmendment1Choice.class, TransactionReferences6 .class, TransactionStatus1Choice.class, UnderlyingData13Choice.class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction11 .class, UnderlyingPaymentTransaction11 .class, UnderlyingStatementEntry11 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:trck.005.001.03";

    public MxTrck00500103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrck00500103(final String xml) {
        this();
        MxTrck00500103 tmp = parse(xml);
        trckrInvstgtnStsNtfctn = tmp.getTrckrInvstgtnStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrck00500103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trckrInvstgtnStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerInvestigationStatusNotificationV03 }
     *     
     */
    public TrackerInvestigationStatusNotificationV03 getTrckrInvstgtnStsNtfctn() {
        return trckrInvstgtnStsNtfctn;
    }

    /**
     * Sets the value of the trckrInvstgtnStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerInvestigationStatusNotificationV03 }
     *     
     */
    public MxTrck00500103 setTrckrInvstgtnStsNtfctn(TrackerInvestigationStatusNotificationV03 value) {
        this.trckrInvstgtnStsNtfctn = value;
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
    public static MxTrck00500103 parse(String xml) {
        return ((MxTrck00500103) MxReadImpl.parse(MxTrck00500103 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTrck00500103 parse(String xml, MxReadConfiguration conf) {
        return ((MxTrck00500103) MxReadImpl.parse(MxTrck00500103 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrck00500103 parse(String xml, MxRead parserImpl) {
        return ((MxTrck00500103) parserImpl.read(MxTrck00500103 .class, xml, _classes));
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
     * Creates an MxTrck00500103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrck00500103 message
     * @return
     *     a new instance of MxTrck00500103
     */
    public static final MxTrck00500103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrck00500103 .class);
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
