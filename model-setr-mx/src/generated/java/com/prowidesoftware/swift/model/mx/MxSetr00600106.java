
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for setr.006.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.006.001.06")
public class MxSetr00600106
    extends AbstractMX
{

    @XmlElement(name = "RedOrdrConf", required = true)
    protected RedemptionOrderConfirmationV06 redOrdrConf;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 6;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account35 .class, AccountIdentification82Choice.class, AccountIdentificationAndName8 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BestExecution1Code.class, BlockChainAddressWallet14 .class, BlockChainAddressWallet3 .class, CancellationRight1Choice.class, CancellationRight1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType10Choice.class, Cheque10 .class, ClearingSystemMemberIdentification2Choice.class, ConductClassification1Code.class, CopyInformation5 .class, CountryAndResidentialStatusType2 .class, CreditTransfer12 .class, CustomerConductClassification1Choice.class, DateAndDateTime2Choice.class, DateFormat42Choice.class, DeliveringPartiesAndAccount24 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DigitalPaymentSettlement3 .class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUCapitalGain3Choice.class, EUDividendStatus1Code.class, EUDividendStatusType2Choice.class, Equalisation3 .class, EqualisationMethodologyType1Code.class, EqualisationMethodologyType2 .class, ExemptionReason1Choice.class, Extension1 .class, Fee11 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification10Choice.class, FinancialInstitutionIdentification17 .class, FinancialInstrument107 .class, FinancialInstrumentIdentificationType1Code.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms37 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType4Choice.class, FundOrderType5Code.class, FundOrderType8Code.class, FundSettlementParameters22 .class, GateHoldBack1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification164 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldBackInformation5 .class, IdentificationSource1Choice.class, IdentificationSource6Choice.class, IncomePreference1Code.class, IndividualPerson32 .class, InformativeTax2 .class, Intermediary49 .class, InvestmentAccount60 .class, InvestmentAccount81 .class, InvestmentAccountType1Choice.class, InvestmentFundFee3Code.class, InvestmentFundRole2Choice.class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown2 .class, LateReport1Code.class, MessageIdentification1 .class, MxSetr00600106 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderBreakdownType1Choice.class, OrderOriginatorEligibility1Code.class, OrderWaiver1 .class, OrderWaiverReason1Code.class, OrderWaiverReason3Choice.class, OtherIdentification3Choice.class, OtherIdentification8 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PartyIdentification262Choice.class, PartyIdentification339 .class, PartyIdentificationAndAccount235 .class, PartyIdentificationType7Code.class, PaymentInstrument28Choice.class, PaymentTransaction167 .class, PlaceOfTradeIdentification4Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss2Choice.class, ProprietaryQuantity8 .class, Quantity48Choice.class, ReceivingPartiesAndAccount24 .class, RedemptionCompletion1Code.class, RedemptionExecution19 .class, RedemptionMultipleExecution07 .class, RedemptionOrderConfirmationV06 .class, RelatedSubscription1 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification46Choice.class, SecurityIdentification50 .class, Series1 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SignatureType1Choice.class, SignatureType2Code.class, SubAccount6 .class, Tax35 .class, Tax40 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes45 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TradingCapacity8Code.class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit1Choice.class, UnitPrice22 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.006.001.06";

    public MxSetr00600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00600106(final String xml) {
        this();
        MxSetr00600106 tmp = parse(xml);
        redOrdrConf = tmp.getRedOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderConfirmationV06 }
     *     
     */
    public RedemptionOrderConfirmationV06 getRedOrdrConf() {
        return redOrdrConf;
    }

    /**
     * Sets the value of the redOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderConfirmationV06 }
     *     
     */
    public MxSetr00600106 setRedOrdrConf(RedemptionOrderConfirmationV06 value) {
        this.redOrdrConf = value;
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
    public static MxSetr00600106 parse(String xml) {
        return ((MxSetr00600106) MxReadImpl.parse(MxSetr00600106 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr00600106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr00600106) MxReadImpl.parse(MxSetr00600106 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00600106 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00600106) parserImpl.read(MxSetr00600106 .class, xml, _classes));
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
     * Creates an MxSetr00600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00600106 message
     * @return
     *     a new instance of MxSetr00600106
     */
    public static final MxSetr00600106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr00600106 .class);
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
