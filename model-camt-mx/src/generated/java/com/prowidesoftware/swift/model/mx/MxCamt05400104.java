
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
 * Class for camt.054.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "bkToCstmrDbtCdtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04")
public class MxCamt05400104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "BkToCstmrDbtCdtNtfctn", required = true)
    protected BankToCustomerDebitCreditNotificationV04 bkToCstmrDbtCdtNtfctn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 54;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountInterest2 .class, AccountNotification7 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndCurrencyExchange3 .class, AmountAndCurrencyExchangeDetails3 .class, AmountAndCurrencyExchangeDetails4 .class, AmountAndDirection35 .class, AmountRangeBoundary1 .class, BankToCustomerDebitCreditNotificationV04 .class, BankTransactionCodeStructure4 .class, BankTransactionCodeStructure5 .class, BankTransactionCodeStructure6 .class, BatchInformation2 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CSCManagement1Code.class, CardAggregated1 .class, CardDataReading1Code.class, CardEntry1 .class, CardIndividualTransaction1 .class, CardPaymentServiceType2Code.class, CardSecurityInformation1 .class, CardSequenceNumberRange1 .class, CardTransaction1 .class, CardTransaction1Choice.class, CardholderVerificationCapability1Code.class, CashAccount24 .class, CashAccount25 .class, CashAccountType2Choice.class, CashBalanceAvailability2 .class, CashBalanceAvailabilityDate1 .class, CashDeposit1 .class, ChargeBearerType1Code.class, ChargeType3Choice.class, Charges4 .class, ChargesRecord2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CopyDuplicate1Code.class, CorporateAction9 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, CurrencyAndAmountRange2 .class, CurrencyExchange5 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DisplayCapabilities1 .class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EntryDetails3 .class, EntryStatus2Code.class, EntryTransaction4 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, FinancialInstrumentQuantityChoice.class, FromToAmountRange.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification20 .class, GenericIdentification3 .class, GenericIdentification32 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader58 .class, IdentificationSource3Choice.class, ImpliedCurrencyAmountRangeChoice.class, InterestRecord1 .class, InterestType1Choice.class, InterestType1Code.class, MessageIdentification2 .class, MxCamt05400104 .class, NameAndAddress10 .class, NamePrefix1Code.class, NumberAndSumOfTransactions1 .class, NumberAndSumOfTransactions4 .class, OnLineCapability1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAndCurrentQuantities1 .class, OriginalBusinessQuery1 .class, OtherIdentification1 .class, POIComponentType1Code.class, Pagination.class, Party11Choice.class, PartyIdentification43 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard4 .class, PaymentReturnReason2 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData1 .class, PointOfInteraction1 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent1 .class, PostalAddress6 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceValueType1Code.class, Product2 .class, ProprietaryAgent3 .class, ProprietaryBankTransactionCodeStructure1 .class, ProprietaryDate2 .class, ProprietaryParty3 .class, ProprietaryPrice2 .class, ProprietaryQuantity1 .class, ProprietaryReference1 .class, Purpose2Choice.class, Rate3 .class, RateType4Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount2 .class, RemittanceInformation7 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, ReportEntry4 .class, ReportingSource1Choice.class, ReturnReason5Choice.class, SecuritiesAccount13 .class, SecurityIdentification14 .class, StructuredRemittanceInformation9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount1 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxCharges2 .class, TaxInformation3 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod1 .class, TaxRecord1 .class, TaxRecordDetails1 .class, TaxRecordPeriod1Code.class, TechnicalInputChannel1Choice.class, TotalTransactions4 .class, TotalsPerBankTransactionCode3 .class, TrackData1 .class, TransactionAgents3 .class, TransactionDates2 .class, TransactionIdentifier1 .class, TransactionInterest3 .class, TransactionParties3 .class, TransactionPrice3Choice.class, TransactionQuantities2Choice.class, TransactionReferences3 .class, UnitOfMeasure1Code.class, UserInterface2Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.054.001.04";

    public MxCamt05400104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05400104(final String xml) {
        this();
        MxCamt05400104 tmp = parse(xml);
        bkToCstmrDbtCdtNtfctn = tmp.getBkToCstmrDbtCdtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05400104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the bkToCstmrDbtCdtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link BankToCustomerDebitCreditNotificationV04 }
     *     
     */
    public BankToCustomerDebitCreditNotificationV04 getBkToCstmrDbtCdtNtfctn() {
        return bkToCstmrDbtCdtNtfctn;
    }

    /**
     * Sets the value of the bkToCstmrDbtCdtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankToCustomerDebitCreditNotificationV04 }
     *     
     */
    public MxCamt05400104 setBkToCstmrDbtCdtNtfctn(BankToCustomerDebitCreditNotificationV04 value) {
        this.bkToCstmrDbtCdtNtfctn = value;
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
    public static MxCamt05400104 parse(String xml) {
        return ((MxCamt05400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05400104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05400104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05400104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05400104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05400104) parserImpl.read(MxCamt05400104 .class, xml, _classes));
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
     * Creates an MxCamt05400104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05400104 message
     * @return
     *     a new instance of MxCamt05400104
     */
    public final static MxCamt05400104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05400104 .class);
    }

}
