
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.029.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rsltnOfInvstgtn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.08")
public class MxCamt02900108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RsltnOfInvstgtn", required = true)
    protected ResolutionOfInvestigationV08 rsltnOfInvstgtn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 29;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails12 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancellationIndividualStatus1Code.class, CancellationStatusReason3 .class, CancellationStatusReason3Choice.class, Case4 .class, CaseAssignment4 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges2 .class, Charges3 .class, ChargesRecord1 .class, ClaimNonReceipt1 .class, ClaimNonReceipt1Choice.class, ClaimNonReceiptRejectReason1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Compensation1 .class, CompensationReason1Choice.class, ContactDetails2 .class, CorrectiveGroupInformation1 .class, CorrectiveInterbankTransaction1 .class, CorrectivePaymentInitiation3 .class, CorrectiveTransaction3Choice.class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment2 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupCancellationStatus1Code.class, InvestigationStatus4Choice.class, LocalInstrument2Choice.class, MandateRelatedInformation12 .class, MandateSetupReason1Choice.class, ModificationStatusReason1 .class, ModificationStatusReason1Choice.class, MxCamt02900108 .class, NamePrefix1Code.class, NumberOfCancellationsPerStatus1 .class, NumberOfTransactionsPerStatus1 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader9 .class, OriginalGroupInformation29 .class, OriginalPaymentInstruction26 .class, OriginalTransactionReference27 .class, Party34Choice.class, Party35Choice.class, PartyIdentification125 .class, PaymentMethod4Code.class, PaymentTransaction84 .class, PaymentTransaction85 .class, PaymentTransaction90 .class, PaymentTypeInformation25 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation15 .class, ResolutionInformation2 .class, ResolutionOfInvestigationV08 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction4 .class, SettlementMethod1Code.class, StatementResolutionEntry3 .class, StructuredRemittanceInformation15 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, TransactionIndividualStatus1Code.class, UnderlyingTransaction19 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.029.001.08";

    public MxCamt02900108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02900108(final String xml) {
        this();
        MxCamt02900108 tmp = parse(xml);
        rsltnOfInvstgtn = tmp.getRsltnOfInvstgtn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02900108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rsltnOfInvstgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionOfInvestigationV08 }
     *     
     */
    public ResolutionOfInvestigationV08 getRsltnOfInvstgtn() {
        return rsltnOfInvstgtn;
    }

    /**
     * Sets the value of the rsltnOfInvstgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionOfInvestigationV08 }
     *     
     */
    public MxCamt02900108 setRsltnOfInvstgtn(ResolutionOfInvestigationV08 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt02900108 parse(String xml) {
        return ((MxCamt02900108) MxReadImpl.parse(MxCamt02900108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02900108 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02900108) parserImpl.read(MxCamt02900108 .class, xml, _classes));
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
     * Creates an MxCamt02900108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02900108 message
     * @return
     *     a new instance of MxCamt02900108
     */
    public final static MxCamt02900108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02900108 .class);
    }

}
