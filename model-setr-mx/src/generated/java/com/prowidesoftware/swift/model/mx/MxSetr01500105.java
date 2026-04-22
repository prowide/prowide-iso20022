
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
 * Class for setr.015.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "swtchOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.015.001.05")
public class MxSetr01500105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SwtchOrdrConf", required = true)
    protected SwitchOrderConfirmationV05 swtchOrdrConf;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 15;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account35 .class, AccountIdentification82Choice.class, AccountIdentificationAndName8 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalAmount1Choice.class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BestExecution1Code.class, BlockChainAddressWallet14 .class, BlockChainAddressWallet3 .class, BranchData4 .class, CancellationRight1Choice.class, CancellationRight1Code.class, CardType1Code.class, CashInOrOut8Choice.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType10Choice.class, Cheque10 .class, ClearingSystemMemberIdentification2Choice.class, ConductClassification1Code.class, CopyInformation5 .class, CreditTransfer12 .class, CustomerConductClassification1Choice.class, DateAndDateTime2Choice.class, DateFormat42Choice.class, DeliveringPartiesAndAccount24 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DigitalPaymentSettlement3 .class, DirectDebitMandate9 .class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUCapitalGain3Choice.class, EUDividendStatus1Code.class, EUDividendStatusType2Choice.class, Equalisation1 .class, ExemptionReason1Choice.class, Extension1 .class, Fee11 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification17 .class, FinancialInstrument107 .class, FinancialInstrumentIdentificationType1Code.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms37 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundSettlementParameters22 .class, FundSettlementParameters28 .class, GateHoldBack1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldBackInformation5 .class, IdentificationSource1Choice.class, IdentificationSource6Choice.class, IncomePreference1Code.class, InformativeTax2 .class, Intermediary49 .class, InvestmentAccount60 .class, InvestmentAccount81 .class, InvestmentAccountType1Choice.class, InvestmentFundFee3Code.class, InvestmentFundRole2Choice.class, InvestmentFundRole2Code.class, LateReport1Code.class, MessageIdentification1 .class, MxSetr01500105 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, OrderWaiver1 .class, OrderWaiverReason1Code.class, OrderWaiverReason3Choice.class, OtherIdentification8 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PartyIdentification262Choice.class, PartyIdentification339 .class, PartyIdentificationAndAccount235 .class, PaymentCard34 .class, PaymentInstrument28Choice.class, PaymentInstrument30Choice.class, PaymentTransaction181 .class, PlaceOfTradeIdentification4Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss2Choice.class, ProprietaryQuantity8 .class, Quantity48Choice.class, ReceivingPartiesAndAccount24 .class, RedemptionCompletion1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification46Choice.class, SecurityIdentification50 .class, Series1 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SignatureType1Choice.class, SignatureType2Code.class, SubAccount6 .class, SwitchExecution8 .class, SwitchOrderConfirmationV05 .class, SwitchRedemptionLegExecution5 .class, SwitchSubscriptionLegExecution5 .class, Tax35 .class, Tax40 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes44 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TradingCapacity8Code.class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit1Choice.class, UnitPrice22 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.015.001.05";

    public MxSetr01500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr01500105(final String xml) {
        this();
        MxSetr01500105 tmp = parse(xml);
        swtchOrdrConf = tmp.getSwtchOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr01500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the swtchOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchOrderConfirmationV05 }
     *     
     */
    public SwitchOrderConfirmationV05 getSwtchOrdrConf() {
        return swtchOrdrConf;
    }

    /**
     * Sets the value of the swtchOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchOrderConfirmationV05 }
     *     
     */
    public MxSetr01500105 setSwtchOrdrConf(SwitchOrderConfirmationV05 value) {
        this.swtchOrdrConf = value;
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
    public static MxSetr01500105 parse(String xml) {
        return ((MxSetr01500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr01500105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr01500105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr01500105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr01500105 parse(String xml, MxRead parserImpl) {
        return ((MxSetr01500105) parserImpl.read(MxSetr01500105 .class, xml, _classes));
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
     * Creates an MxSetr01500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr01500105 message
     * @return
     *     a new instance of MxSetr01500105
     */
    public static final MxSetr01500105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr01500105 .class);
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
