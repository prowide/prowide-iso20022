
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
 * Class for camt.053.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.05")
public class MxCamt05300105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrStmt", required = true)
    protected BankToCustomerStatementV05 bkToCstmrStmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 53;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest3 .class, AccountSchemeName1Choice.class, AccountStatement5 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndCurrencyExchange3 .class, AmountAndCurrencyExchangeDetails3 .class, AmountAndCurrencyExchangeDetails4 .class, AmountAndDirection35 .class, AmountRangeBoundary1 .class, AttendanceContext1Code.class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, BalanceSubType1Choice.class, BalanceType12 .class, BalanceType12Code.class, BalanceType5Choice.class, BankToCustomerStatementV05 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CSCManagement1Code.class, CardAggregated1 .class, CardDataReading1Code.class, CardEntry2 .class, CardIndividualTransaction2 .class, CardPaymentServiceType2Code.class, CardSecurityInformation1 .class, CardSequenceNumberRange1 .class, CardTransaction2 .class, CardTransaction2Choice.class, CardholderAuthentication2 .class, CardholderVerificationCapability1Code.class, CashAccount24 .class, CashAccount25 .class, CashAccountType2Choice.class, CashBalance3 .class, CashBalanceAvailability2 .class, CashBalanceAvailabilityDate1 .class, CashDeposit1 .class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges4 .class, ChargesRecord2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, CorporateAction9 .class, CreditDebitCode.class, CreditLine2 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmountRange2 .class, CurrencyExchange5 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DisplayCapabilities1 .class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType6Code.class, EntryDetails6 .class, EntryStatus2Code.class, EntryTransaction7 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstrumentQuantityChoice.class, FromToAmountRange.class, Garnishment1 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification3 .class, GenericIdentification32 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader58 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRangeChoice.class, InterestRecord1 .class, InterestType1Choice.class, InterestType1Code.class, MessageIdentification2 .class, MxCamt05300105 .class, NameAndAddress10 .class, NamePrefix1Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions4 .class, OnLineCapability1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAndCurrentQuantities1 .class, OriginalBusinessQuery1 .class, OtherIdentification1 .class, POIComponentType1Code.class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard4 .class, PaymentContext3 .class, PaymentReturnReason2 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, PostalAddress6 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Product2 .class, ProprietaryAgent3 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate2 .class, ProprietaryParty3 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, Purpose2Choice.class, Rate3 .class, RateType4Choice.class, ReferredDocumentInformation6 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceInformation10 .class, RemittanceLocation4 .class, RemittanceLocationDetails1 .class, RemittanceLocationMethod2Code.class, ReportEntry7 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, SecuritiesAccount13 .class, SecurityIdentification14 .class, StructuredRemittanceInformation12 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxInformation3 .class, TaxInformation4 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions4 .class, TotalsPerBankTransactionCode3 .class, TrackData1 .class, TransactionAgents3 .class, TransactionChannel1Code.class, TransactionDates2 .class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionInterest3 .class, TransactionParties3 .class, TransactionPrice3Choice.class, TransactionQuantities2Choice.class, TransactionReferences3 .class, UnitOfMeasure1Code.class, UserInterface2Code.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.05";

    public MxCamt05300105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05300105(final String xml) {
        this();
        MxCamt05300105 tmp = parse(xml);
        bkToCstmrStmt = tmp.getBkToCstmrStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05300105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV05 }
     *     
     */
    public BankToCustomerStatementV05 getBkToCstmrStmt() {
        return bkToCstmrStmt;
    }

    /**
     * Sets the value of the bkToCstmrStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV05 }
     *     
     */
    public MxCamt05300105 setBkToCstmrStmt(BankToCustomerStatementV05 value) {
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
    public static MxCamt05300105 parse(String xml) {
        return ((MxCamt05300105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05300105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05300105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05300105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05300105) parserImpl.read(MxCamt05300105 .class, xml, _classes));
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
     * Creates an MxCamt05300105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05300105 message
     * @return
     *     a new instance of MxCamt05300105
     */
    public static final MxCamt05300105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05300105 .class);
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
