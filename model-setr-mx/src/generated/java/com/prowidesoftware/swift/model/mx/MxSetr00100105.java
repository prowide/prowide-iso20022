
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
 * Class for setr.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redBlkOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.001.001.05")
public class MxSetr00100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RedBlkOrdr", required = true)
    protected RedemptionBulkOrderV05 redBlkOrdr;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account35 .class, AccountIdentification82Choice.class, AccountIdentificationAndName8 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BlockChainAddressWallet14 .class, BlockChainAddressWallet3 .class, CancellationRight1Choice.class, CancellationRight1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType10Choice.class, Cheque10 .class, ClearingSystemMemberIdentification2Choice.class, ConductClassification1Code.class, CopyInformation5 .class, CountryAndResidentialStatusType2 .class, CreditTransfer12 .class, CustomerConductClassification1Choice.class, DateAndDateTime2Choice.class, DateFormat42Choice.class, DeliveringPartiesAndAccount24 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DigitalPaymentSettlement3 .class, DistributionPolicy1Code.class, Equalisation1 .class, ExemptionReason1Choice.class, Extension1 .class, Fee9 .class, FeeAndTax2 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification17 .class, FinancialInstrument107 .class, FinancialInstrumentIdentificationType1Code.class, FinancialInstrumentQuantity33Choice.class, FinancialInstrumentQuantity48Choice.class, ForeignExchangeTerms44 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType4Choice.class, FundOrderType5Code.class, FundOrderType8Code.class, FundSettlementParameters22 .class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification164 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, IdentificationSource1Choice.class, IdentificationSource6Choice.class, IncomePreference1Code.class, IndividualPerson32 .class, Intermediary49 .class, InvestmentAccount60 .class, InvestmentAccount81 .class, InvestmentAccountType1Choice.class, InvestmentFundFee3Code.class, InvestmentFundRole2Choice.class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown2 .class, MessageIdentification1 .class, MxSetr00100105 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderBreakdownType1Choice.class, OrderOriginatorEligibility1Code.class, OrderWaiver1 .class, OrderWaiverReason1Code.class, OrderWaiverReason3Choice.class, OtherIdentification3Choice.class, OtherIdentification8 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PartyIdentification262Choice.class, PartyIdentification339 .class, PartyIdentificationAndAccount235 .class, PartyIdentificationType7Code.class, PaymentInstrument28Choice.class, PaymentTransaction167 .class, PlaceOfTradeIdentification4Choice.class, PostalAddress1 .class, ProprietaryQuantity8 .class, Quantity48Choice.class, ReceivingPartiesAndAccount24 .class, RedemptionBulkOrder08 .class, RedemptionBulkOrderV05 .class, RedemptionOrder17 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification46Choice.class, SecurityIdentification50 .class, Series1 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SignatureType1Choice.class, SignatureType2Code.class, SubAccount6 .class, Tax42 .class, TaxAmountOrRate4Choice.class, TaxBasis1Choice.class, TaxCalculationInformation9 .class, TaxType17Code.class, TaxType3Choice.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TradingCapacity8Code.class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, UKTaxGroupUnit1Code.class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.001.001.05";

    public MxSetr00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00100105(final String xml) {
        this();
        MxSetr00100105 tmp = parse(xml);
        redBlkOrdr = tmp.getRedBlkOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redBlkOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionBulkOrderV05 }
     *     
     */
    public RedemptionBulkOrderV05 getRedBlkOrdr() {
        return redBlkOrdr;
    }

    /**
     * Sets the value of the redBlkOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionBulkOrderV05 }
     *     
     */
    public MxSetr00100105 setRedBlkOrdr(RedemptionBulkOrderV05 value) {
        this.redBlkOrdr = value;
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
    public static MxSetr00100105 parse(String xml) {
        return ((MxSetr00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00100105 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00100105) parserImpl.read(MxSetr00100105 .class, xml, _classes));
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
     * Creates an MxSetr00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00100105 message
     * @return
     *     a new instance of MxSetr00100105
     */
    public static final MxSetr00100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr00100105 .class);
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
