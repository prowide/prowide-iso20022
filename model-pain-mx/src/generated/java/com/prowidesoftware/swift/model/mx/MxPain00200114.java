
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
 * Class for pain.002.001.14 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrPmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.002.001.14")
public class MxPain00200114
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrPmtStsRpt", required = true)
    protected CustomerPaymentStatusReportV14 cstmrPmtStsRpt;
    public static final transient String BUSINESS_PROCESS = "pain";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 14;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmendmentInformationDetails15 .class, AmountType4Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges16 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemIdentification3Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, CreditTransferMandateData1 .class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, CurrencyExchange13 .class, CustomerPaymentStatusReportV14 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod2 .class, DateType2Choice.class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency36Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader128 .class, LocalInstrument2Choice.class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateRelatedData3Choice.class, MandateRelatedInformation16 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxPain00200114 .class, NamePrefix2Code.class, NumberOfTransactionsPerStatus5 .class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupHeader22 .class, OriginalPaymentInstruction51 .class, OriginalTransactionReference42 .class, OtherContact1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PaymentMethod4Code.class, PaymentTransaction160 .class, PaymentTypeInformation27 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, ReferredDocumentInformation8 .class, RemittanceAmount4 .class, RemittanceInformation22 .class, SequenceType3Code.class, ServiceLevel8Choice.class, SettlementInstruction15 .class, SettlementMethod1Code.class, StatusReason6Choice.class, StatusReasonInformation14 .class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TrackerData7 .class, TrackerRecord5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.002.001.14";

    public MxPain00200114() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00200114(final String xml) {
        this();
        MxPain00200114 tmp = parse(xml);
        cstmrPmtStsRpt = tmp.getCstmrPmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00200114(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrPmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPaymentStatusReportV14 }
     *     
     */
    public CustomerPaymentStatusReportV14 getCstmrPmtStsRpt() {
        return cstmrPmtStsRpt;
    }

    /**
     * Sets the value of the cstmrPmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPaymentStatusReportV14 }
     *     
     */
    public MxPain00200114 setCstmrPmtStsRpt(CustomerPaymentStatusReportV14 value) {
        this.cstmrPmtStsRpt = value;
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
    public static MxPain00200114 parse(String xml) {
        return ((MxPain00200114) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00200114 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00200114 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00200114) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00200114 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00200114 parse(String xml, MxRead parserImpl) {
        return ((MxPain00200114) parserImpl.read(MxPain00200114 .class, xml, _classes));
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
     * Creates an MxPain00200114 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00200114 message
     * @return
     *     a new instance of MxPain00200114
     */
    public static final MxPain00200114 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00200114 .class);
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
