
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
 * Class for camt.028.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "addtlPmtInf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.028.001.04")
public class MxCamt02800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AddtlPmtInf", required = true)
    protected AdditionalPaymentInformationV04 addtlPmtInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalPaymentInformationV04 .class, AddressType2Code.class, AmountType3Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, Case3 .class, CaseAssignment3 .class, CashAccount24 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Instruction3Code.class, Instruction4Code.class, InstructionForCreditorAgent1 .class, InstructionForNextAgent1 .class, LocalInstrument2Choice.class, MxCamt02800104 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation3 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PaymentComplementaryInformation3 .class, PaymentTypeInformation25 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount2 .class, RemittanceInformation7 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction1 .class, SettlementMethod1Code.class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction2 .class, UnderlyingPaymentTransaction2 .class, UnderlyingStatementEntry1 .class, UnderlyingTransaction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.028.001.04";

    public MxCamt02800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02800104(final String xml) {
        this();
        MxCamt02800104 tmp = parse(xml);
        addtlPmtInf = tmp.getAddtlPmtInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the addtlPmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalPaymentInformationV04 }
     *     
     */
    public AdditionalPaymentInformationV04 getAddtlPmtInf() {
        return addtlPmtInf;
    }

    /**
     * Sets the value of the addtlPmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalPaymentInformationV04 }
     *     
     */
    public MxCamt02800104 setAddtlPmtInf(AdditionalPaymentInformationV04 value) {
        this.addtlPmtInf = value;
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
    public static MxCamt02800104 parse(String xml) {
        return ((MxCamt02800104) MxReadImpl.parse(MxCamt02800104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02800104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02800104) parserImpl.read(MxCamt02800104 .class, xml, _classes));
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
     * Creates an MxCamt02800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02800104 message
     * @return
     *     a new instance of MxCamt02800104
     */
    public final static MxCamt02800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02800104 .class);
    }

}
