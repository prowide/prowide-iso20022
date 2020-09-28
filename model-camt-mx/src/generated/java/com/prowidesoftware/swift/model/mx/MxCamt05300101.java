
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
 * Class for camt.053.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrStmtV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.01")
public class MxCamt05300101
    extends AbstractMX
{

    @XmlElement(name = "BkToCstmrStmtV01", required = true)
    protected BankToCustomerStatementV01 bkToCstmrStmtV01;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 53;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AccountInterest1 .class, AccountStatement1 .class, AddressType2Code.class, AlternateSecurityIdentification2 .class, AmountAndCurrencyExchange2 .class, AmountAndCurrencyExchangeDetails1 .class, AmountAndCurrencyExchangeDetails2 .class, AmountRangeBoundary1 .class, BalanceType2Choice.class, BalanceType9Code.class, BankToCustomerStatementV01 .class, BankTransactionCodeStructure1 .class, BankTransactionCodeStructure2 .class, BankTransactionCodeStructure3 .class, BatchInformation1 .class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount13 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CashBalance2 .class, CashBalanceAvailability1 .class, CashBalanceAvailabilityDate1 .class, ChargeBearerType1Code.class, ChargeType1Code.class, ChargeTypeChoice.class, ChargesInformation3 .class, ClearingSystemMemberIdentification3Choice.class, CopyDuplicate1Code.class, CorporateAction1 .class, CreditDebitCode.class, CreditLine1 .class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, CurrencyAndAmountRange.class, CurrencyExchange3 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateTimePeriodDetails.class, DocumentType2Code.class, DocumentType3Code.class, EntryStatus3Code.class, EntryTransaction1 .class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, FinancialInstrumentQuantityChoice.class, FromToAmountRange.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader23 .class, ImpliedCurrencyAmountRangeChoice.class, InterestType1Choice.class, InterestType1Code.class, MessageIdentification2 .class, MxCamt05300101 .class, NameAndAddress3 .class, NameAndAddress7 .class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions2 .class, NumberAndSumOfTransactionsPerBankTransactionCode1 .class, OrganisationIdentification2 .class, Pagination.class, Party2Choice.class, PartyIdentification8 .class, PersonIdentification3 .class, PostalAddress1 .class, ProprietaryAgent1 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate1 .class, ProprietaryParty1 .class, ProprietaryPrice1 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, Purpose1Choice.class, Rate1 .class, RateTypeChoice.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation1 .class, RemittanceLocation1 .class, RemittanceLocationMethod1Code.class, ReturnReason1Choice.class, ReturnReasonInformation5 .class, SecurityIdentification4Choice.class, SimpleIdentificationInformation2 .class, StatementEntry1 .class, StructuredRemittanceInformation6 .class, TaxCharges1 .class, TaxDetails.class, TaxInformation2 .class, TaxType.class, TotalTransactions1 .class, TransactionAgents1 .class, TransactionDates1 .class, TransactionInterest1 .class, TransactionParty1 .class, TransactionPrice1Choice.class, TransactionQuantities1Choice.class, TransactionReferences1 .class, TransactionRejectReason2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.01";

    public MxCamt05300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05300101(final String xml) {
        this();
        MxCamt05300101 tmp = parse(xml);
        bkToCstmrStmtV01 = tmp.getBkToCstmrStmtV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrStmtV01 property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV01 }
     *     
     */
    public BankToCustomerStatementV01 getBkToCstmrStmtV01() {
        return bkToCstmrStmtV01;
    }

    /**
     * Sets the value of the bkToCstmrStmtV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV01 }
     *     
     */
    public MxCamt05300101 setBkToCstmrStmtV01(BankToCustomerStatementV01 value) {
        this.bkToCstmrStmtV01 = value;
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
    public static MxCamt05300101 parse(String xml) {
        return ((MxCamt05300101) MxReadImpl.parse(MxCamt05300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05300101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05300101) parserImpl.read(MxCamt05300101 .class, xml, _classes));
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
     * Creates an MxCamt05300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05300101 message
     * @return
     *     a new instance of MxCamt05300101
     */
    public final static MxCamt05300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt05300101 .class);
    }

}
