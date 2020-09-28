
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
 * Class for setr.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "redOrdrConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.006.001.04")
public class MxSetr00600104
    extends AbstractMX
{

    @XmlElement(name = "RedOrdrConf", required = true)
    protected RedemptionOrderConfirmationV04 redOrdrConf;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account22 .class, AccountIdentification4Choice.class, AccountIdentificationAndName5 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference8 .class, AdditionalReference9 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, BestExecution1Code.class, CancellationRight1Choice.class, CancellationRight1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, Cheque9 .class, ClearingSystemMemberIdentificationChoice.class, ConductClassification1Code.class, CopyInformation4 .class, CountryAndResidentialStatusType2 .class, CreditTransfer8 .class, CustomerConductClassification1Choice.class, DateAndDateTimeChoice.class, DateFormat42Choice.class, DeliveringPartiesAndAccount16 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUCapitalGain3Choice.class, EUDividendStatus1Code.class, EUDividendStatusType2Choice.class, Equalisation1 .class, ExemptionReason1Choice.class, Extension1 .class, Fee2 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification10 .class, FinancialInstitutionIdentification8Choice.class, FinancialInstrument57 .class, ForeignExchangeTerms33 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType4Choice.class, FundOrderType5Code.class, FundOrderType8Code.class, FundSettlementParameters11 .class, GateHoldBack1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification164 .class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldBackInformation2 .class, IdentificationSource1Choice.class, IncomePreference1Code.class, IndividualPerson32 .class, InformativeTax1 .class, Intermediary39 .class, InvestmentAccount58 .class, InvestmentAccount60 .class, InvestmentAccountType1Choice.class, InvestmentFundFee1Code.class, InvestmentFundRole2Choice.class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown2 .class, LateReport1Code.class, MessageIdentification1 .class, MxSetr00600104 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderBreakdownType1Choice.class, OrderOriginatorEligibility1Code.class, OrderWaiver1 .class, OrderWaiverReason1Code.class, OrderWaiverReason3Choice.class, OtherIdentification3Choice.class, PartyIdentification113 .class, PartyIdentification90Choice.class, PartyIdentificationAndAccount147 .class, PartyIdentificationType7Code.class, PaymentInstrument21Choice.class, PaymentTransaction72 .class, PlaceOfTradeIdentification1Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss2Choice.class, ReceivingPartiesAndAccount16 .class, RedemptionCompletion1Code.class, RedemptionExecution15 .class, RedemptionMultipleExecution5 .class, RedemptionOrderConfirmationV04 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification25Choice.class, Series1 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SignatureType1Choice.class, SignatureType2Code.class, SubAccount6 .class, Tax31 .class, Tax32 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes40 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TradingCapacity8Code.class, TransactionChannel2Code.class, TransactionChannelType1Choice.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, UnitPrice22 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.006.001.04";

    public MxSetr00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr00600104(final String xml) {
        this();
        MxSetr00600104 tmp = parse(xml);
        redOrdrConf = tmp.getRedOrdrConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the redOrdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrderConfirmationV04 }
     *     
     */
    public RedemptionOrderConfirmationV04 getRedOrdrConf() {
        return redOrdrConf;
    }

    /**
     * Sets the value of the redOrdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrderConfirmationV04 }
     *     
     */
    public MxSetr00600104 setRedOrdrConf(RedemptionOrderConfirmationV04 value) {
        this.redOrdrConf = value;
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
    public static MxSetr00600104 parse(String xml) {
        return ((MxSetr00600104) MxReadImpl.parse(MxSetr00600104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr00600104 parse(String xml, MxRead parserImpl) {
        return ((MxSetr00600104) parserImpl.read(MxSetr00600104 .class, xml, _classes));
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
     * Creates an MxSetr00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr00600104 message
     * @return
     *     a new instance of MxSetr00600104
     */
    public final static MxSetr00600104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr00600104 .class);
    }

}
