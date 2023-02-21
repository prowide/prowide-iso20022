
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
 * Class for camt.027.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "clmNonRct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.027.001.06")
public class MxCamt02700106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ClmNonRct", required = true)
    protected ClaimNonReceiptV06 clmNonRct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 27;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails12 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Case4 .class, CaseAssignment4 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClaimNonReceiptV06 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment2 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InstructionForAssignee1 .class, LocalInstrument2Choice.class, MandateRelatedInformation12 .class, MandateSetupReason1Choice.class, MissingCover3 .class, MxCamt02700106 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation29 .class, OriginalTransactionReference27 .class, Party34Choice.class, Party35Choice.class, PartyIdentification125 .class, PaymentMethod4Code.class, PaymentTypeInformation25 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation15 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction3 .class, SettlementInstruction4 .class, SettlementMethod1Code.class, StructuredRemittanceInformation15 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction4 .class, UnderlyingPaymentTransaction3 .class, UnderlyingStatementEntry2 .class, UnderlyingTransaction4Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.027.001.06";

    public MxCamt02700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02700106(final String xml) {
        this();
        MxCamt02700106 tmp = parse(xml);
        clmNonRct = tmp.getClmNonRct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the clmNonRct property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimNonReceiptV06 }
     *     
     */
    public ClaimNonReceiptV06 getClmNonRct() {
        return clmNonRct;
    }

    /**
     * Sets the value of the clmNonRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimNonReceiptV06 }
     *     
     */
    public MxCamt02700106 setClmNonRct(ClaimNonReceiptV06 value) {
        this.clmNonRct = value;
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
    public static MxCamt02700106 parse(String xml) {
        return ((MxCamt02700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02700106 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02700106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02700106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02700106 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02700106) parserImpl.read(MxCamt02700106 .class, xml, _classes));
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
     * Creates an MxCamt02700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02700106 message
     * @return
     *     a new instance of MxCamt02700106
     */
    public final static MxCamt02700106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02700106 .class);
    }

}
