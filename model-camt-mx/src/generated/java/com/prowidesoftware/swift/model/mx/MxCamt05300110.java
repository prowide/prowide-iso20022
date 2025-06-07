
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
 * Class for camt.053.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrStmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.10")
public class MxCamt05300110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrStmt", required = true)
    protected BankToCustomerStatementV10 bkToCstmrStmt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 53;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest4 .class, AccountSchemeName1Choice.class, AccountStatement11 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmountRange2 .class, AddressType2Code.class, AddressType3Choice.class, AmountAndCurrencyExchange3 .class, AmountAndCurrencyExchangeDetails3 .class, AmountAndCurrencyExchangeDetails4 .class, AmountAndDirection35 .class, AmountRangeBoundary1 .class, AttendanceContext1Code.class, AuthenticationEntity1Code.class, AuthenticationMethod1Code.class, BalanceSubType1Choice.class, BalanceType10Choice.class, BalanceType13 .class, BankToCustomerStatementV10 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CSCManagement1Code.class, CardAggregated2 .class, CardDataReading1Code.class, CardEntry5 .class, CardIndividualTransaction2 .class, CardPaymentServiceType2Code.class, CardSecurityInformation1 .class, CardSequenceNumberRange1 .class, CardTransaction18 .class, CardTransaction3Choice.class, CardholderAuthentication2 .class, CardholderVerificationCapability1Code.class, CashAccount40 .class, CashAccount41 .class, CashAccountType2Choice.class, CashAvailability1 .class, CashAvailabilityDate1Choice.class, CashBalance8 .class, CashDeposit1 .class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges6 .class, ChargesRecord3 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CopyDuplicate1Code.class, CorporateAction9 .class, CreditDebitCode.class, CreditLine3 .class, CreditLineType1Choice.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyExchange5 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DisplayCapabilities1 .class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EntryDetails11 .class, EntryStatus1Choice.class, EntryTransaction12 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, FromToAmountRange1 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GenericIdentification32 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader81 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRange1Choice.class, InterestRecord2 .class, InterestType1Choice.class, InterestType1Code.class, LocalInstrument2Choice.class, MessageIdentification2 .class, MxCamt05300110 .class, NameAndAddress16 .class, NamePrefix2Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions4 .class, OnLineCapability1Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAndCurrentQuantities1 .class, OriginalBusinessQuery1 .class, OtherContact1 .class, OtherIdentification1 .class, POIComponentType1Code.class, Pagination1 .class, Party38Choice.class, Party40Choice.class, PartyIdentification135 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard4 .class, PaymentContext3 .class, PaymentReturnReason5 .class, PaymentTypeInformation27 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, Price7 .class, PriceRateOrAmount3Choice.class, PriceValueType1Code.class, Priority2Code.class, Product2 .class, ProprietaryAgent4 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate3 .class, ProprietaryParty5 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, Purpose2Choice.class, Rate4 .class, RateType4Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation21 .class, RemittanceLocation7 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, ReportEntry12 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SequenceRange1 .class, SequenceRange1Choice.class, SequenceType3Code.class, ServiceLevel8Choice.class, StructuredRemittanceInformation17 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount3 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxData1 .class, TaxInformation10 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod3 .class, TaxRecord3 .class, TaxRecordDetails3 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions6 .class, TotalsPerBankTransactionCode5 .class, TrackData1 .class, TransactionAgents5 .class, TransactionChannel1Code.class, TransactionDates3 .class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionInterest4 .class, TransactionParties9 .class, TransactionPrice4Choice.class, TransactionQuantities3Choice.class, TransactionReferences6 .class, UnitOfMeasure1Code.class, UserInterface2Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.053.001.10";

    public MxCamt05300110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05300110(final String xml) {
        this();
        MxCamt05300110 tmp = parse(xml);
        bkToCstmrStmt = tmp.getBkToCstmrStmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05300110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrStmt property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerStatementV10 }
     *     
     */
    public BankToCustomerStatementV10 getBkToCstmrStmt() {
        return bkToCstmrStmt;
    }

    /**
     * Sets the value of the bkToCstmrStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerStatementV10 }
     *     
     */
    public MxCamt05300110 setBkToCstmrStmt(BankToCustomerStatementV10 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt05300110 parse(String xml) {
        return ((MxCamt05300110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05300110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05300110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05300110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05300110 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05300110) parserImpl.read(MxCamt05300110 .class, xml, _classes));
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
     * Creates an MxCamt05300110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05300110 message
     * @return
     *     a new instance of MxCamt05300110
     */
    public final static MxCamt05300110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05300110 .class);
    }

}
