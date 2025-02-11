
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
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
 * Class for pain.008.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.02")
public class MxPain00800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiationV02 cstmrDrctDbtInitn;
    public static final transient String BUSINESS_PROCESS = "pain";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmendmentInformationDetails6 .class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CustomerDirectDebitInitiationV02 .class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DirectDebitTransaction6 .class, DirectDebitTransactionInformation9 .class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, Frequency1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader39 .class, LocalInstrument2Choice.class, MandateRelatedInformation6 .class, MxPain00800102 .class, NameAndAddress10 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Party6Choice.class, PartyIdentification32 .class, PaymentIdentification1 .class, PaymentInstructionInformation4 .class, PaymentMethod2Code.class, PaymentTypeInformation20 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RegulatoryAuthority2 .class, RegulatoryReporting3 .class, RegulatoryReportingType1Code.class, RemittanceAmount1 .class, RemittanceInformation5 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, SequenceType1Code.class, ServiceLevel8Choice.class, StructuredRegulatoryReporting3 .class, StructuredRemittanceInformation7 .class, TaxAmount1 .class, TaxAuthorisation1 .class, TaxInformation3 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.02";

    public MxPain00800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00800102(final String xml) {
        this();
        MxPain00800102 tmp = parse(xml);
        cstmrDrctDbtInitn = tmp.getCstmrDrctDbtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrDrctDbtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiationV02 }
     *     
     */
    public CustomerDirectDebitInitiationV02 getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Sets the value of the cstmrDrctDbtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiationV02 }
     *     
     */
    public MxPain00800102 setCstmrDrctDbtInitn(CustomerDirectDebitInitiationV02 value) {
        this.cstmrDrctDbtInitn = value;
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
    public static MxPain00800102 parse(String xml) {
        return ((MxPain00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00800102 parse(String xml, MxRead parserImpl) {
        return ((MxPain00800102) parserImpl.read(MxPain00800102 .class, xml, _classes));
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
     * Creates an MxPain00800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00800102 message
     * @return
     *     a new instance of MxPain00800102
     */
    public static final MxPain00800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00800102 .class);
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
