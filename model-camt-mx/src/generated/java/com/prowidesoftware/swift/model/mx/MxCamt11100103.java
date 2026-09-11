
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
 * Class for camt.111.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstgtnRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.111.001.03")
public class MxCamt11100103
    extends AbstractMX
{

    @XmlElement(name = "InvstgtnRspn", required = true)
    protected InvestigationResponseV03 invstgtnRspn;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 111;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AdjustmentCompensation1 .class, AmendmentInformationDetails14 .class, AmountType4Choice.class, BookingConfirmation8 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges6 .class, ChargesRecord3 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, CompensationResponse1 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriod5 .class, DebitAuthorisationConfirmation3 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, Document12 .class, DocumentAdjustment1 .class, DocumentFormat1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FileData1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InvestigationActionReason1 .class, InvestigationActionReason1Choice.class, InvestigationData18 .class, InvestigationDataRecord12Choice.class, InvestigationLocationData1 .class, InvestigationLocationMethod1Code.class, InvestigationReason1Choice.class, InvestigationReasonSubType1Choice.class, InvestigationRequest50 .class, InvestigationRequestAction1 .class, InvestigationRequestAction1Choice.class, InvestigationResponse23 .class, InvestigationResponseV03 .class, InvestigationServiceLevel1Choice.class, InvestigationStatus2 .class, InvestigationStatusReason1Choice.class, InvestigationSubType1Choice.class, InvestigationType1Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData4Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxCamt11100103 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation33 .class, OriginalTransactionReference48 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyAndSignature3 .class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTransactionStatus1 .class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RelatedInvestigationData1 .class, Remittance1 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, RemittanceLocation7 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction11 .class, SettlementMethod1Code.class, SkipPayload.class, StatusReason6Choice.class, StatusReasonInformation12 .class, StructuredRemittanceInformation16 .class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxPeriod3 .class, TaxRecord2 .class, TaxRecord3 .class, TaxRecordDetails2 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransactionAmendment1 .class, TransactionAmendment1Choice.class, TransactionReferences10 .class, TransactionStatus1Choice.class, UnderlyingData13Choice.class, UnderlyingGroupInformation1 .class, UnderlyingInvestigationInstrument1Choice.class, UnderlyingPaymentInstruction11 .class, UnderlyingPaymentTransaction11 .class, UnderlyingStatementEntry11 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.111.001.03";

    public MxCamt11100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt11100103(final String xml) {
        this();
        MxCamt11100103 tmp = parse(xml);
        invstgtnRspn = tmp.getInvstgtnRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt11100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstgtnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationResponseV03 }
     *     
     */
    public InvestigationResponseV03 getInvstgtnRspn() {
        return invstgtnRspn;
    }

    /**
     * Sets the value of the invstgtnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationResponseV03 }
     *     
     */
    public MxCamt11100103 setInvstgtnRspn(InvestigationResponseV03 value) {
        this.invstgtnRspn = value;
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
    public static MxCamt11100103 parse(String xml) {
        return ((MxCamt11100103) MxReadImpl.parse(MxCamt11100103 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt11100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt11100103) MxReadImpl.parse(MxCamt11100103 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt11100103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt11100103) parserImpl.read(MxCamt11100103 .class, xml, _classes));
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
     * Creates an MxCamt11100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt11100103 message
     * @return
     *     a new instance of MxCamt11100103
     */
    public static final MxCamt11100103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt11100103 .class);
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
