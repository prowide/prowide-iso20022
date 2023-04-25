
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
 * Class for camt.052.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrAcctRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.04")
public class MxCamt05200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrAcctRpt", required = true)
    protected BankToCustomerAccountReportV04 bkToCstmrAcctRpt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 52;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest3 .class, AccountReport16 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndCurrencyExchange3 .class, AmountAndCurrencyExchangeDetails3 .class, AmountAndCurrencyExchangeDetails4 .class, AmountAndDirection35 .class, AmountRangeBoundary1 .class, BalanceSubType1Choice.class, BalanceType12 .class, BalanceType12Code.class, BalanceType5Choice.class, BankToCustomerAccountReportV04 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CSCManagement1Code.class, CardAggregated1 .class, CardDataReading1Code.class, CardEntry1 .class, CardIndividualTransaction1 .class, CardPaymentServiceType2Code.class, CardSecurityInformation1 .class, CardSequenceNumberRange1 .class, CardTransaction1 .class, CardTransaction1Choice.class, CardholderVerificationCapability1Code.class, CashAccount24 .class, CashAccount25 .class, CashAccountType2Choice.class, CashBalance3 .class, CashBalanceAvailability2 .class, CashBalanceAvailabilityDate1 .class, CashDeposit1 .class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges4 .class, ChargesRecord2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, CorporateAction9 .class, CreditDebitCode.class, CreditLine2 .class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmountRange2 .class, CurrencyExchange5 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DisplayCapabilities1 .class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EntryDetails3 .class, EntryStatus2Code.class, EntryTransaction4 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstrumentQuantityChoice.class, FromToAmountRange.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification3 .class, GenericIdentification32 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader58 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRangeChoice.class, InterestRecord1 .class, InterestType1Choice.class, InterestType1Code.class, MessageIdentification2 .class, MxCamt05200104 .class, NameAndAddress10 .class, NamePrefix1Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions4 .class, OnLineCapability1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAndCurrentQuantities1 .class, OriginalBusinessQuery1 .class, OtherIdentification1 .class, POIComponentType1Code.class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard4 .class, PaymentReturnReason2 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, PostalAddress6 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Product2 .class, ProprietaryAgent3 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate2 .class, ProprietaryParty3 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, Purpose2Choice.class, Rate3 .class, RateType4Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount2 .class, RemittanceInformation7 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, ReportEntry4 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, SecuritiesAccount13 .class, SecurityIdentification14 .class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxInformation3 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions4 .class, TotalsPerBankTransactionCode3 .class, TrackData1 .class, TransactionAgents3 .class, TransactionDates2 .class, TransactionIdentifier1 .class, TransactionInterest3 .class, TransactionParties3 .class, TransactionPrice3Choice.class, TransactionQuantities2Choice.class, TransactionReferences3 .class, UnitOfMeasure1Code.class, UserInterface2Code.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.052.001.04";

    public MxCamt05200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05200104(final String xml) {
        this();
        MxCamt05200104 tmp = parse(xml);
        bkToCstmrAcctRpt = tmp.getBkToCstmrAcctRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrAcctRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerAccountReportV04 }
     *     
     */
    public BankToCustomerAccountReportV04 getBkToCstmrAcctRpt() {
        return bkToCstmrAcctRpt;
    }

    /**
     * Sets the value of the bkToCstmrAcctRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerAccountReportV04 }
     *     
     */
    public MxCamt05200104 setBkToCstmrAcctRpt(BankToCustomerAccountReportV04 value) {
        this.bkToCstmrAcctRpt = value;
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
    public static MxCamt05200104 parse(String xml) {
        return ((MxCamt05200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05200104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05200104) parserImpl.read(MxCamt05200104 .class, xml, _classes));
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
     * Creates an MxCamt05200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05200104 message
     * @return
     *     a new instance of MxCamt05200104
     */
    public static final MxCamt05200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05200104 .class);
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
