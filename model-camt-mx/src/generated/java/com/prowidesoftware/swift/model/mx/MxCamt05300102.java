
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
 * Class for camt.053.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02")
public class MxCamt05300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrStmt", required = true)
    protected BankToCustomerStatementV02 bkToCstmrStmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 53;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest2 .class, AccountSchemeName1Choice.class, AccountStatement2 .class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternateSecurityIdentification2 .class, AmountAndCurrencyExchange3 .class, AmountAndCurrencyExchangeDetails3 .class, AmountAndCurrencyExchangeDetails4 .class, AmountRangeBoundary1 .class, BalanceSubType1Choice.class, BalanceType12 .class, BalanceType12Code.class, BalanceType5Choice.class, BankToCustomerStatementV02 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount16 .class, CashAccount20 .class, CashAccountType2 .class, CashAccountType4Code.class, CashBalance3 .class, CashBalanceAvailability2 .class, CashBalanceAvailabilityDate1 .class, ChargeBearerType1Code.class, ChargeType1Code.class, ChargeType2Choice.class, ChargesInformation6 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, CorporateAction1 .class, CreditDebitCode.class, CreditLine2 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmountRange2 .class, CurrencyExchange5 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EntryDetails1 .class, EntryStatus2Code.class, EntryTransaction2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FinancialInstrumentQuantityChoice.class, FromToAmountRange.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader42 .class, ImpliedCurrencyAmountRangeChoice.class, InterestType1Choice.class, InterestType1Code.class, MessageIdentification2 .class, MxCamt05300102 .class, NameAndAddress10 .class, NamePrefix1Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions2 .class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Pagination.class, Party6Choice.class, PartyIdentification32 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryAgent2 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate2 .class, ProprietaryParty2 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, Purpose2Choice.class, Rate3 .class, RateType4Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount1 .class, RemittanceInformation5 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, ReportEntry2 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, ReturnReasonInformation10 .class, SecurityIdentification4Choice.class, StructuredRemittanceInformation7 .class, TaxAmount1 .class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxInformation3 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions2 .class, TotalsPerBankTransactionCode2 .class, TransactionAgents2 .class, TransactionDates2 .class, TransactionInterest2 .class, TransactionParty2 .class, TransactionPrice2Choice.class, TransactionQuantities1Choice.class, TransactionReferences2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.02";

    public MxCamt05300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05300102(final String xml) {
        this();
        MxCamt05300102 tmp = parse(xml);
        bkToCstmrStmt = tmp.getBkToCstmrStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV02 }
     *     
     */
    public BankToCustomerStatementV02 getBkToCstmrStmt() {
        return bkToCstmrStmt;
    }

    /**
     * Sets the value of the bkToCstmrStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV02 }
     *     
     */
    public MxCamt05300102 setBkToCstmrStmt(BankToCustomerStatementV02 value) {
        this.bkToCstmrStmt = value;
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
    public static MxCamt05300102 parse(String xml) {
        return ((MxCamt05300102) MxReadImpl.parse(MxCamt05300102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05300102) parserImpl.read(MxCamt05300102 .class, xml, _classes));
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
     * Creates an MxCamt05300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05300102 message
     * @return
     *     a new instance of MxCamt05300102
     */
    public final static MxCamt05300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05300102 .class);
    }

}
