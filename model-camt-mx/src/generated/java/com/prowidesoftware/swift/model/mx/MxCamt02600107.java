
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
 * Class for camt.026.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ublToApply"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.026.001.07")
public class MxCamt02600107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "UblToApply", required = true)
    protected UnableToApplyV07 ublToApply;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails13 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, Case5 .class, CaseAssignment5 .class, CashAccount38 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, LocalInstrument2Choice.class, MandateRelatedInformation14 .class, MandateSetupReason1Choice.class, MissingOrIncorrectInformation3 .class, MxCamt02600107 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation29 .class, OriginalTransactionReference28 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation16 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction7 .class, SettlementMethod1Code.class, StructuredRemittanceInformation16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, UnableToApplyIncorrect1 .class, UnableToApplyIncorrectInformation4Code.class, UnableToApplyJustification3Choice.class, UnableToApplyMissing1 .class, UnableToApplyMissingInformation3Code.class, UnableToApplyV07 .class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction5 .class, UnderlyingPaymentTransaction4 .class, UnderlyingStatementEntry3 .class, UnderlyingTransaction5Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.026.001.07";

    public MxCamt02600107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02600107(final String xml) {
        this();
        MxCamt02600107 tmp = parse(xml);
        ublToApply = tmp.getUblToApply();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02600107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ublToApply property.
     * 
     * @return
     *     possible object is
     *     {@link UnableToApplyV07 }
     *     
     */
    public UnableToApplyV07 getUblToApply() {
        return ublToApply;
    }

    /**
     * Sets the value of the ublToApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnableToApplyV07 }
     *     
     */
    public MxCamt02600107 setUblToApply(UnableToApplyV07 value) {
        this.ublToApply = value;
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
    public static MxCamt02600107 parse(String xml) {
        return ((MxCamt02600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02600107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02600107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02600107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02600107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02600107) parserImpl.read(MxCamt02600107 .class, xml, _classes));
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
     * Creates an MxCamt02600107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02600107 message
     * @return
     *     a new instance of MxCamt02600107
     */
    public final static MxCamt02600107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02600107 .class);
    }

}
