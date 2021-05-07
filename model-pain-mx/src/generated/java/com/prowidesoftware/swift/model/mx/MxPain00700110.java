
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
 * Class for pain.007.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrPmtRvsl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.007.001.10")
public class MxPain00700110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrPmtRvsl", required = true)
    protected CustomerPaymentReversalV10 cstmrPmtRvsl;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails13 .class, AmountType4Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CustomerPaymentReversalV10 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader88 .class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData1Choice.class, MandateRelatedInformation14 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxPain00700110 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader16 .class, OriginalPaymentInstruction37 .class, OriginalTransactionReference31 .class, OtherContact1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PaymentMethod4Code.class, PaymentReversalReason9 .class, PaymentTransaction125 .class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation16 .class, ReversalReason4Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction7 .class, SettlementMethod1Code.class, StructuredRemittanceInformation16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.007.001.10";

    public MxPain00700110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00700110(final String xml) {
        this();
        MxPain00700110 tmp = parse(xml);
        cstmrPmtRvsl = tmp.getCstmrPmtRvsl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00700110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrPmtRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentReversalV10 }
     *     
     */
    public CustomerPaymentReversalV10 getCstmrPmtRvsl() {
        return cstmrPmtRvsl;
    }

    /**
     * Sets the value of the cstmrPmtRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentReversalV10 }
     *     
     */
    public MxPain00700110 setCstmrPmtRvsl(CustomerPaymentReversalV10 value) {
        this.cstmrPmtRvsl = value;
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
    public static MxPain00700110 parse(String xml) {
        return ((MxPain00700110) MxReadImpl.parse(MxPain00700110 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00700110 parse(String xml, MxRead parserImpl) {
        return ((MxPain00700110) parserImpl.read(MxPain00700110 .class, xml, _classes));
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
     * Creates an MxPain00700110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00700110 message
     * @return
     *     a new instance of MxPain00700110
     */
    public final static MxPain00700110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00700110 .class);
    }

}
