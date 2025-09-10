
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
 * Class for seev.036.002.16 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.16")
public class MxSeev03600216
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmation002V16 corpActnMvmntConf;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 16;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account11Choice.class, AccountAndBalance63 .class, AdditionalBusinessProcess12Code.class, AdditionalBusinessProcessFormat24Choice.class, AlternatePartyIdentification9 .class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity11 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat14Choice.class, BalanceFormat16Choice.class, BlockChainAddressWallet11 .class, CashAccountIdentification12Choice.class, CashAccountIdentification6Choice.class, CashOption110 .class, CashParties44 .class, CorporateAction86 .class, CorporateActionAmounts61 .class, CorporateActionAmounts74 .class, CorporateActionBalanceDetails45 .class, CorporateActionDate109 .class, CorporateActionDate89 .class, CorporateActionDate99 .class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType120Choice.class, CorporateActionEventType37Code.class, CorporateActionGeneralInformation190 .class, CorporateActionMovementConfirmation002V16 .class, CorporateActionNarrative35 .class, CorporateActionOption12Code.class, CorporateActionOption244 .class, CorporateActionOption39Choice.class, CorporateActionPeriod13 .class, CorporateActionPrice92 .class, CorporateActionPrice93 .class, CorporateActionRate131 .class, CorporateActionRate132 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode22Choice.class, DateCode35Choice.class, DateFormat41Choice.class, DateFormat45Choice.class, DateFormat49Choice.class, DateFormat67Choice.class, DateType8Code.class, DeemedRateType1Code.class, DeemedRateType2Choice.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity36Choice.class, ForeignExchangeTerms41 .class, FractionDispositionType11Code.class, FractionDispositionType30Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat39Choice.class, GrossDividendRateFormat40Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationSource4Choice.class, IdentificationType44Choice.class, IndicativeOrMarketPrice16Choice.class, InterestRateUsedForPaymentFormat19Choice.class, IntermediateSecuritiesDistributionTypeFormat18Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSeev03600216 .class, NameAndAddress12 .class, NetDividendRateFormat41Choice.class, NetDividendRateFormat42Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType6Code.class, OptionFeatures14Code.class, OptionFeaturesFormat30Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification147Choice.class, PartyIdentification258Choice.class, PartyIdentification318 .class, PartyIdentificationAndAccount205 .class, PartyIdentificationAndAccount231 .class, PartyIdentificationAndAccount232 .class, Payment1Code.class, PercentagePrice2 .class, Period11 .class, PriceDetails41 .class, PriceFormat85Choice.class, PriceFormat86Choice.class, PriceFormat87Choice.class, PriceRateType3Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity53Choice.class, Quantity54Choice.class, Quantity57Choice.class, Quantity80Choice.class, QuantityToQuantityRatio2 .class, Rate45 .class, RateAndAmountFormat66Choice.class, RateAndAmountFormat67Choice.class, RateAndAmountFormat68Choice.class, RateFormat28Choice.class, RateStatus1Code.class, RateStatus4Choice.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType7Code.class, RateType80Choice.class, RateType81Choice.class, RateType82Choice.class, RateType83Choice.class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus54 .class, RateTypeAndAmountAndStatus59 .class, RateTypeAndAmountAndStatus60 .class, RateTypeAndAmountAndStatus61 .class, RateTypeAndAmountAndStatus62 .class, RateTypeAndPercentageRate16 .class, RateTypeAndPercentageRate17 .class, RatioFormat21Choice.class, RatioFormat22Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat49Choice.class, SafekeepingPlaceFormat50Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption115 .class, SecurityDate26 .class, SecurityIdentification20 .class, SettlementParties130 .class, ShortLong1Code.class, SignedQuantityFormat12 .class, SignedQuantityFormat13 .class, SolicitationFeeRateFormat13Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxVoucher5 .class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat11 .class, TransactionIdentification1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.16";

    public MxSeev03600216() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600216(final String xml) {
        this();
        MxSeev03600216 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600216(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmation002V16 }
     *     
     */
    public CorporateActionMovementConfirmation002V16 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmation002V16 }
     *     
     */
    public MxSeev03600216 setCorpActnMvmntConf(CorporateActionMovementConfirmation002V16 value) {
        this.corpActnMvmntConf = value;
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
    public static MxSeev03600216 parse(String xml) {
        return ((MxSeev03600216) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600216 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600216 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600216) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600216 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600216 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600216) parserImpl.read(MxSeev03600216 .class, xml, _classes));
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
     * Creates an MxSeev03600216 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600216 message
     * @return
     *     a new instance of MxSeev03600216
     */
    public static final MxSeev03600216 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600216 .class);
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
