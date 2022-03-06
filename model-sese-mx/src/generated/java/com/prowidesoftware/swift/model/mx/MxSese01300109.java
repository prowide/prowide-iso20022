
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
 * Class for sese.013.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.013.001.09")
public class MxSese01300109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfConf", required = true)
    protected PortfolioTransferConfirmationV09 prtflTrfConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account27 .class, Account28 .class, AccountIdentificationAndName6 .class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternatePartyIdentification7 .class, AlternateSecurityIdentification7 .class, BonusWithdrawal1 .class, BranchData2 .class, BusinessFlowType1Code.class, CashAll1Code.class, CashAsset1 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, ClearingSystemMemberIdentification2Choice.class, ClearingSystemMemberIdentification4Choice.class, ContactIdentification2 .class, Conversion1 .class, CreditTransfer9 .class, Crystallisation1 .class, DateAndAmount2 .class, DateAndDateTime2Choice.class, DateQuarter1Choice.class, DrawdownStatus1Choice.class, DrawdownStatus1Code.class, Extension1 .class, Fee5 .class, FinancialInstitutionIdentification16 .class, FinancialInstrument1Choice.class, FinancialInstrument70 .class, FinancialInstrumentIdentification1 .class, FundPortfolio2Choice.class, FundSettlementParameters14 .class, GenderCode.class, GeneralInvestment1 .class, GeneralInvestmentAccountType1Choice.class, GeneralInvestmentAccountType1Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, HolderType1Code.class, IdentificationSource1Choice.class, IdentificationType42Choice.class, IndividualPerson8 .class, InnovativeFinance1 .class, Intermediary43 .class, InvestmentAccount69 .class, InvestmentFundFee1Code.class, InvestmentFundRole2Code.class, LumpSumType1Choice.class, LumpSumType1Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MoneyPurchaseAnnualAllowance1 .class, MxSese01300109 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation36 .class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, OtherAsset1 .class, OtherAsset1Choice.class, OtherAsset1Code.class, PartyIdentification122Choice.class, PartyIdentification123Choice.class, PartyIdentification125Choice.class, PartyIdentification126Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PartyIdentification140 .class, PartyIdentification141 .class, PartyIdentificationAndAccount161 .class, PartyTextInformation1 .class, PaymentInstrument14 .class, Pension2 .class, PensionOrder1 .class, PensionOrderType1Choice.class, PensionOrderType1Code.class, PensionPolicy1 .class, PensionSchemeType1Choice.class, PensionSchemeType1Code.class, PensionTransferScope1Choice.class, PensionTransferScope1Code.class, PersonIdentificationType7Code.class, PortfolioTransfer4 .class, PortfolioTransferConfirmationV09 .class, PortfolioWithdrawalReason1Code.class, PostalAddress1 .class, PostalAddress6 .class, PreviousYear1Choice.class, PreviousYear4 .class, PriceMethod1Code.class, PriceValue1 .class, Quantity44Choice.class, ResidualCash1Code.class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesAccount19 .class, SecurityIdentification25Choice.class, SettlementParties74 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SubAccount5 .class, SubscriptionInformation2 .class, Tax35 .class, Tax36 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxEfficientProduct2 .class, TaxEfficientProductType1Choice.class, TaxEfficientProductType1Code.class, TaxReference1 .class, TaxReference2 .class, TaxReferenceParty1Choice.class, TaxReferenceType1Choice.class, TaxType17Code.class, TaxType3Choice.class, TaxWrapperAmountType1Code.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes41 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TransferType1Choice.class, TransferType3Code.class, TypeOfAmount1Choice.class, TypeOfIdentification1Code.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit11 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class, WithdrawalReason1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.013.001.09";

    public MxSese01300109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01300109(final String xml) {
        this();
        MxSese01300109 tmp = parse(xml);
        prtflTrfConf = tmp.getPrtflTrfConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01300109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfConf property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferConfirmationV09 }
     *     
     */
    public PortfolioTransferConfirmationV09 getPrtflTrfConf() {
        return prtflTrfConf;
    }

    /**
     * Sets the value of the prtflTrfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferConfirmationV09 }
     *     
     */
    public MxSese01300109 setPrtflTrfConf(PortfolioTransferConfirmationV09 value) {
        this.prtflTrfConf = value;
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
    public static MxSese01300109 parse(String xml) {
        return ((MxSese01300109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01300109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01300109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01300109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01300109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01300109 parse(String xml, MxRead parserImpl) {
        return ((MxSese01300109) parserImpl.read(MxSese01300109 .class, xml, _classes));
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
     * Creates an MxSese01300109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01300109 message
     * @return
     *     a new instance of MxSese01300109
     */
    public final static MxSese01300109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01300109 .class);
    }

}
