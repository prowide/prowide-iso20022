
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
 * Class for auth.022.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.022.001.04")
public class MxAuth02200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CtrctRegnStmt", required = true)
    protected ContractRegistrationStatementV04 ctrctRegnStmt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BenchmarkCurveName2Code.class, BenchmarkCurveName4Choice.class, BinaryFile1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CashCollateral5 .class, CertificateIdentification1 .class, CertificateReference2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CommunicationMethod4Code.class, Contact13 .class, ContractBalance1 .class, ContractBalanceType1Choice.class, ContractClosureReason1Choice.class, ContractCollateral1 .class, ContractRegistrationReference2Choice.class, ContractRegistrationStatement4 .class, ContractRegistrationStatementV04 .class, CreditDebit3Code.class, CurrencyControlHeader7 .class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, DepositType1Code.class, DocumentAmendment1 .class, DocumentEntryAmendment1 .class, DocumentGeneralInformation5 .class, DocumentIdentification22 .class, DocumentIdentification28 .class, DocumentIdentification29 .class, DocumentIdentification35 .class, ExchangeRate1 .class, ExchangeRateType1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FloatingInterestRate4 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GenericValidationRuleIdentification1 .class, InterestPaymentDateRange1 .class, InterestPaymentSchedule1 .class, InterestRate2Choice.class, InterestRateContractTerm1 .class, LegalOrganisation2 .class, LoanContract4 .class, LoanContractTranche1 .class, MxAuth02200104 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PaymentSchedule1 .class, PaymentScheduleType2Choice.class, PaymentScheduleType2Code.class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, QueryType3Code.class, RateBasis1Code.class, RegisteredContract18 .class, RegisteredContractAmendment1 .class, RegisteredContractCommunication1 .class, RegisteredContractJournal3 .class, ReportingPeriod4 .class, ShipmentAttribute2 .class, ShipmentCondition1Choice.class, ShipmentDateRange1 .class, ShipmentDateRange2 .class, ShipmentSchedule2Choice.class, SignatureEnvelopeReference.class, SpecialCondition1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportingDocument4 .class, SupportingDocumentEntry2 .class, SyndicatedLoan3 .class, TaxExemptionReasonFormat1Choice.class, TaxParty4 .class, TimePeriod2 .class, TradeContract4 .class, TradeParty6 .class, TransactionCertificate4 .class, TransactionCertificate5 .class, TransactionCertificateContract2 .class, TransactionCertificateRecord2 .class, UnderlyingContract4Choice.class, ValidationRuleSchemeName1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.022.001.04";

    public MxAuth02200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02200104(final String xml) {
        this();
        MxAuth02200104 tmp = parse(xml);
        ctrctRegnStmt = tmp.getCtrctRegnStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnStmt property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationStatementV04 }
     *     
     */
    public ContractRegistrationStatementV04 getCtrctRegnStmt() {
        return ctrctRegnStmt;
    }

    /**
     * Sets the value of the ctrctRegnStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationStatementV04 }
     *     
     */
    public MxAuth02200104 setCtrctRegnStmt(ContractRegistrationStatementV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxAuth02200104 parse(String xml) {
        return ((MxAuth02200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02200104 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02200104) parserImpl.read(MxAuth02200104 .class, xml, _classes));
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
     * Creates an MxAuth02200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02200104 message
     * @return
     *     a new instance of MxAuth02200104
     */
    public final static MxAuth02200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02200104 .class);
    }

}
