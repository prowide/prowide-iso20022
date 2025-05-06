
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
 * Class for camt.053.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.13")
public class MxCamt05300113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrStmt", required = true)
    protected BankToCustomerStatementV13 bkToCstmrStmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 53;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest4 .class, AccountSchemeName1Choice.class, AccountStatement14 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmountRange2 .class, AddressType2Code.class, AddressType3Choice.class, AmountAndCurrencyExchange4 .class, AmountAndCurrencyExchangeDetails5 .class, AmountAndCurrencyExchangeDetails6 .class, AmountAndDirection35 .class, AmountRangeBoundary1 .class, AttendanceContext1Code.class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, BalanceSubType1Choice.class, BalanceType10Choice.class, BalanceType13 .class, BankToCustomerStatementV13 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CSCManagement1Code.class, CardAggregated2 .class, CardDataReading1Code.class, CardEntry5 .class, CardIndividualTransaction2 .class, CardPaymentServiceType2Code.class, CardSecurityInformation1 .class, CardSequenceNumberRange1 .class, CardTransaction18 .class, CardTransaction3Choice.class, CardholderAuthentication2 .class, CardholderVerificationCapability1Code.class, CashAccount40 .class, CashAccount43 .class, CashAccountType2Choice.class, CashAvailability1 .class, CashAvailabilityDate1Choice.class, CashBalance8 .class, CashDeposit1 .class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges15 .class, ChargesRecord8 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CopyDuplicate1Code.class, CorporateAction82 .class, CorporateActionEventType104Choice.class, CreditDebitCode.class, CreditLine3 .class, CreditLineType1Choice.class, CreditorReferenceInformation3 .class, CreditorReferenceType2Choice.class, CreditorReferenceType3 .class, CurrencyExchange24 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DateType2Choice.class, DisplayCapabilities1 .class, DocumentAdjustment1 .class, DocumentAmount1 .class, DocumentAmountType1Choice.class, DocumentLineIdentification1 .class, DocumentLineInformation2 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType1 .class, DocumentType2Choice.class, EntryDetails14 .class, EntryStatus1Choice.class, EntryTransaction15 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, FinancialInstrumentQuantity33Choice.class, FromToAmountRange1 .class, Garnishment4 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericIdentification32 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader116 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRange1Choice.class, InterestRecord2 .class, InterestType1Choice.class, InterestType1Code.class, LocalInstrument2Choice.class, MessageIdentification2 .class, MxCamt05300113 .class, NameAndAddress18 .class, NamePrefix2Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions4 .class, OnLineCapability1Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAndCurrentQuantities1 .class, OriginalBusinessQuery1 .class, OtherContact1 .class, OtherIdentification1 .class, POIComponentType1Code.class, Pagination1 .class, Party50Choice.class, Party52Choice.class, PartyIdentification272 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard4 .class, PaymentContext3 .class, PaymentReturnReason8 .class, PaymentTypeInformation27 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, PostalAddress27 .class, PreferredContactMethod2Code.class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, Priority2Code.class, Product2 .class, ProprietaryAgent5 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate3 .class, ProprietaryParty6 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, Rate4 .class, RateType4Choice.class, References74Choice.class, ReferredDocumentInformation8 .class, RemittanceAmount4 .class, RemittanceInformation22 .class, RemittanceLocation8 .class, RemittanceLocationData2 .class, RemittanceLocationMethod2Code.class, ReportEntry15 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SequenceRange1 .class, SequenceRange1Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, StructuredRemittanceInformation18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions6 .class, TotalsPerBankTransactionCode5 .class, TrackData1 .class, TransactionAgents6 .class, TransactionAllocation1 .class, TransactionChannel1Code.class, TransactionDates3 .class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionInterest4 .class, TransactionParties12 .class, TransactionPrice4Choice.class, TransactionQuantities4Choice.class, TransactionReferences6 .class, UnitOfMeasure1Code.class, UserInterface2Code.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.13";

    public MxCamt05300113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05300113(final String xml) {
        this();
        MxCamt05300113 tmp = parse(xml);
        bkToCstmrStmt = tmp.getBkToCstmrStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05300113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV13 }
     *     
     */
    public BankToCustomerStatementV13 getBkToCstmrStmt() {
        return bkToCstmrStmt;
    }

    /**
     * Sets the value of the bkToCstmrStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV13 }
     *     
     */
    public MxCamt05300113 setBkToCstmrStmt(BankToCustomerStatementV13 value) {
        this.bkToCstmrStmt = value;
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
    public static MxCamt05300113 parse(String xml) {
        return ((MxCamt05300113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05300113 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05300113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05300113 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05300113) parserImpl.read(MxCamt05300113 .class, xml, _classes));
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
     * Creates an MxCamt05300113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05300113 message
     * @return
     *     a new instance of MxCamt05300113
     */
    public static final MxCamt05300113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05300113 .class);
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
