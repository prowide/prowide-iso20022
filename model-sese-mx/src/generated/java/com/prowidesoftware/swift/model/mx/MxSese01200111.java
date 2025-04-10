
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
 * Class for sese.012.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.012.001.11")
public class MxSese01200111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PrtflTrfInstr", required = true)
    protected PortfolioTransferInstructionV11 prtflTrfInstr;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 12;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account27 .class, Account28 .class, AccountIdentificationAndName6 .class, AccountOwnershipType6Code.class, AccountSchemeName1Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AllOtherCash1 .class, AlternatePartyIdentification7 .class, AlternateSecurityIdentification7 .class, BranchData2 .class, BusinessFlowType1Code.class, CashAll1 .class, CashAsset3 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ChargeBasis2Choice.class, ChargeOrCommissionDiscount1 .class, ChargeType5Choice.class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, ClearingSystemMemberIdentification4Choice.class, ContactIdentification2 .class, Conversion1 .class, CreditTransfer9 .class, Crystallisation2 .class, DateAndAmount2 .class, DateAndDateTime2Choice.class, DateQuarter1Choice.class, Extension1 .class, Fee5 .class, FinancialInstitutionIdentification16 .class, FinancialInstrument102 .class, FinancialInstrument63Choice.class, FinancialInstrumentIdentification1 .class, FinancialInstrumentIdentification2 .class, FundPortfolio8Choice.class, FundSettlementParameters17 .class, GenderCode.class, GeneralInvestment2 .class, GeneralInvestmentAccountType2Choice.class, GeneralInvestmentAccountType2Code.class, GenericAccountIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, HolderType1Code.class, IdentificationSource1Choice.class, IdentificationType42Choice.class, IndividualPerson8 .class, Intermediary43 .class, InvestmentAccount69 .class, InvestmentFundFee1Code.class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01200111 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation36 .class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, PartyIdentification122Choice.class, PartyIdentification123Choice.class, PartyIdentification125Choice.class, PartyIdentification126Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PartyIdentification140 .class, PartyIdentification141 .class, PartyIdentificationAndAccount194 .class, PartyTextInformation1 .class, PartyTextInformation6 .class, PaymentInstrument14 .class, Pension6 .class, PensionPolicy1 .class, PensionSchemeType3Choice.class, PensionSchemeType3Code.class, PensionTransferScope1Choice.class, PensionTransferScope1Code.class, PersonIdentificationType7Code.class, PortfolioTransfer11 .class, PortfolioTransferInstructionV11 .class, PostalAddress1 .class, PostalAddress6 .class, PreviousYear1Choice.class, PreviousYear4 .class, PriceMethod1Code.class, PriceValue1 .class, Quantity47 .class, ResidualCash2 .class, Role4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesAccount19 .class, SecurityIdentification25Choice.class, SettlementParties94 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SubAccount5 .class, SubscriptionInformation2 .class, Tax35 .class, Tax36 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxEfficientProduct6 .class, TaxEfficientProductType2Choice.class, TaxEfficientProductType2Code.class, TaxReference1 .class, TaxReferenceParty1Choice.class, TaxReferenceType1Choice.class, TaxType17Code.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes41 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TransferType2Choice.class, TransferType4Code.class, TypeOfIdentification1Code.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit11 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.012.001.11";

    public MxSese01200111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01200111(final String xml) {
        this();
        MxSese01200111 tmp = parse(xml);
        prtflTrfInstr = tmp.getPrtflTrfInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01200111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfInstr property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferInstructionV11 }
     *     
     */
    public PortfolioTransferInstructionV11 getPrtflTrfInstr() {
        return prtflTrfInstr;
    }

    /**
     * Sets the value of the prtflTrfInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferInstructionV11 }
     *     
     */
    public MxSese01200111 setPrtflTrfInstr(PortfolioTransferInstructionV11 value) {
        this.prtflTrfInstr = value;
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
    public static MxSese01200111 parse(String xml) {
        return ((MxSese01200111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01200111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01200111 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01200111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01200111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01200111 parse(String xml, MxRead parserImpl) {
        return ((MxSese01200111) parserImpl.read(MxSese01200111 .class, xml, _classes));
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
     * Creates an MxSese01200111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01200111 message
     * @return
     *     a new instance of MxSese01200111
     */
    public static final MxSese01200111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01200111 .class);
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
