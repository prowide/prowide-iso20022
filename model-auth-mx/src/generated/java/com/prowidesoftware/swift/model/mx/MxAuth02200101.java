
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.022.001.01")
public class MxAuth02200101
    extends AbstractMX
{

    @XmlElement(name = "CtrctRegnStmt", required = true)
    protected ContractRegistrationStatementV01 ctrctRegnStmt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName4Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccountType2Choice.class, CashCollateral5 .class, CertificateIdentification1 .class, CertificateReference1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod4Code.class, ContactDetails2 .class, ContractBalance1 .class, ContractBalanceType1Choice.class, ContractClosureReason1Choice.class, ContractCollateral1 .class, ContractRegistrationReference1Choice.class, ContractRegistrationStatement1 .class, ContractRegistrationStatementV01 .class, CreditDebit3Code.class, CurrencyControlHeader2 .class, DateAndPlaceOfBirth.class, DatePeriodDetails1 .class, DepositType1Code.class, DocumentAmendment1 .class, DocumentGeneralInformation3 .class, DocumentIdentification22 .class, DocumentIdentification28 .class, DocumentIdentification29 .class, ExchangeRate1 .class, ExchangeRateType1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FloatingInterestRate4 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GenericValidationRuleIdentification1 .class, InterestPaymentDateRange1 .class, InterestPaymentDateRange2 .class, InterestPaymentSchedule1Choice.class, InterestRate2Choice.class, InterestRateContractTerm1 .class, LegalOrganisation2 .class, LoanContract1 .class, LoanContractTranche1 .class, MxAuth02200101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification77 .class, PaymentDateRange1 .class, PaymentDateRange2 .class, PaymentSchedule1Choice.class, PaymentScheduleType1Choice.class, PaymentScheduleType1Code.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress19 .class, PostalAddress6 .class, ProprietaryReference1 .class, QueryType3Code.class, RateBasis1Code.class, RegisteredContract5 .class, RegisteredContractAmendment1 .class, RegisteredContractCommunication1 .class, RegisteredContractJournal1 .class, ReportingPeriod1 .class, ShipmentAttribute1 .class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SignatureEnvelopeReference.class, SpecialCondition1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportingDocument1 .class, SupportingDocumentEntry1 .class, SyndicatedLoan1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TimePeriodDetails1 .class, TradeContract1 .class, TradeParty2 .class, TransactionCertificate1 .class, TransactionCertificate2 .class, TransactionCertificateContract1 .class, TransactionCertificateRecord1 .class, UnderlyingContract1Choice.class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.022.001.01";

    public MxAuth02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02200101(final String xml) {
        this();
        MxAuth02200101 tmp = parse(xml);
        ctrctRegnStmt = tmp.getCtrctRegnStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnStmt property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationStatementV01 }
     *     
     */
    public ContractRegistrationStatementV01 getCtrctRegnStmt() {
        return ctrctRegnStmt;
    }

    /**
     * Sets the value of the ctrctRegnStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationStatementV01 }
     *     
     */
    public MxAuth02200101 setCtrctRegnStmt(ContractRegistrationStatementV01 value) {
        this.ctrctRegnStmt = value;
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
    public static MxAuth02200101 parse(String xml) {
        return ((MxAuth02200101) MxReadImpl.parse(MxAuth02200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02200101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02200101) parserImpl.read(MxAuth02200101 .class, xml, _classes));
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
     * Creates an MxAuth02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02200101 message
     * @return
     *     a new instance of MxAuth02200101
     */
    public final static MxAuth02200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth02200101 .class);
    }

}
