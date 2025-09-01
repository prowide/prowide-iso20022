
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.029.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rsltnOfInvstgtn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.12")
public class MxCamt02900112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RsltnOfInvstgtn", required = true)
    protected ResolutionOfInvestigationV12 rsltnOfInvstgtn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails14 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CancellationIndividualStatus1Code.class, CancellationStatusReason3Choice.class, CancellationStatusReason4 .class, Case5 .class, CaseAssignment5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges13 .class, Charges6 .class, ChargesRecord3 .class, ClaimNonReceipt2 .class, ClaimNonReceipt2Choice.class, ClaimNonReceiptRejectReason1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Compensation4 .class, CompensationReason1Choice.class, Contact4 .class, CorrectiveGroupInformation1 .class, CorrectiveInterbankTransaction3 .class, CorrectivePaymentInitiation5 .class, CorrectiveTransaction5Choice.class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupCancellationStatus1Code.class, InvestigationStatus5Choice.class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData2Choice.class, MandateRelatedInformation15 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, ModificationStatusReason1Choice.class, ModificationStatusReason2 .class, MxCamt02900112 .class, NamePrefix2Code.class, NumberOfCancellationsPerStatus1 .class, NumberOfTransactionsPerStatus1 .class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader14 .class, OriginalGroupInformation29 .class, OriginalPaymentInstruction43 .class, OriginalTransactionReference35 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTransaction139 .class, PaymentTransaction147 .class, PaymentTransaction148 .class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, ResolutionData4 .class, ResolutionOfInvestigationV12 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction11 .class, SettlementMethod1Code.class, StatementResolutionEntry4 .class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TransactionIndividualStatus1Code.class, UnderlyingTransaction31 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.12";

    public MxCamt02900112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02900112(final String xml) {
        this();
        MxCamt02900112 tmp = parse(xml);
        rsltnOfInvstgtn = tmp.getRsltnOfInvstgtn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02900112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rsltnOfInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionOfInvestigationV12 }
     *     
     */
    public ResolutionOfInvestigationV12 getRsltnOfInvstgtn() {
        return rsltnOfInvstgtn;
    }

    /**
     * Sets the value of the rsltnOfInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionOfInvestigationV12 }
     *     
     */
    public MxCamt02900112 setRsltnOfInvstgtn(ResolutionOfInvestigationV12 value) {
        this.rsltnOfInvstgtn = value;
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
    public static MxCamt02900112 parse(String xml) {
        return ((MxCamt02900112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02900112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02900112 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02900112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02900112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02900112 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02900112) parserImpl.read(MxCamt02900112 .class, xml, _classes));
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
     * Creates an MxCamt02900112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02900112 message
     * @return
     *     a new instance of MxCamt02900112
     */
    public final static MxCamt02900112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02900112 .class);
    }

}
