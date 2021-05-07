
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
 * Class for pain.008.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.04")
public class MxPain00800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiationV04 cstmrDrctDbtInitn;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails8 .class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CustomerDirectDebitInitiationV04 .class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DirectDebitTransaction7 .class, DirectDebitTransactionInformation13 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency6Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader55 .class, LocalInstrument2Choice.class, MandateRelatedInformation8 .class, MxPain00800104 .class, NameAndAddress10 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification43 .class, PaymentIdentification1 .class, PaymentInstruction10 .class, PaymentMethod2Code.class, PaymentTypeInformation24 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount2 .class, RemittanceInformation7 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, SequenceType3Code.class, ServiceLevel8Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation3 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.04";

    public MxPain00800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00800104(final String xml) {
        this();
        MxPain00800104 tmp = parse(xml);
        cstmrDrctDbtInitn = tmp.getCstmrDrctDbtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrDrctDbtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV04 }
     *     
     */
    public CustomerDirectDebitInitiationV04 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Sets the value of the cstmrDrctDbtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV04 }
     *     
     */
    public MxPain00800104 setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV04 value) {
        this.cstmrDrctDbtInitn = value;
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
    public static MxPain00800104 parse(String xml) {
        return ((MxPain00800104) MxReadImpl.parse(MxPain00800104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00800104 parse(String xml, MxRead parserImpl) {
        return ((MxPain00800104) parserImpl.read(MxPain00800104 .class, xml, _classes));
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
     * Creates an MxPain00800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00800104 message
     * @return
     *     a new instance of MxPain00800104
     */
    public final static MxPain00800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00800104 .class);
    }

}
