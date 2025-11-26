
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
 * Class for seev.036.001.16 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.16")
public class MxSeev03600116
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV16 corpActnMvmntConf;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 16;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account10Choice.class, AccountAndBalance58 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess12Code.class, AdditionalBusinessProcessFormat23Choice.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat11Choice.class, BalanceFormat12Choice.class, BlockChainAddressWallet3 .class, CashAccountIdentification5Choice.class, CashAccountIdentification9Choice.class, CashOption105 .class, CashParties43 .class, CorporateAction85 .class, CorporateActionAmounts60 .class, CorporateActionAmounts73 .class, CorporateActionBalanceDetails41 .class, CorporateActionDate86 .class, CorporateActionDate88 .class, CorporateActionDate99 .class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat14Choice.class, CorporateActionEventType109Choice.class, CorporateActionEventType37Code.class, CorporateActionGeneralInformation179 .class, CorporateActionMovementConfirmationV16 .class, CorporateActionNarrative31 .class, CorporateActionOption12Code.class, CorporateActionOption233 .class, CorporateActionOption33Choice.class, CorporateActionPeriod13 .class, CorporateActionPrice83 .class, CorporateActionPrice84 .class, CorporateActionRate120 .class, CorporateActionRate125 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat30Choice.class, DateFormat43Choice.class, DateFormat45Choice.class, DateType8Code.class, DeemedRateType1Choice.class, DeemedRateType1Code.class, DividendRateType1Code.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms40 .class, FractionDispositionType11Code.class, FractionDispositionType27Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, GrossDividendRateFormat35Choice.class, GrossDividendRateFormat37Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationSource3Choice.class, IdentificationType42Choice.class, IndicativeOrMarketPrice13Choice.class, InterestRateUsedForPaymentFormat12Choice.class, IntermediateSecuritiesDistributionTypeFormat15Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator2Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSeev03600116 .class, NameAndAddress5 .class, NetDividendRateFormat37Choice.class, NetDividendRateFormat40Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType6Code.class, OptionFeatures14Code.class, OptionFeaturesFormat29Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification257Choice.class, PartyIdentification316 .class, PartyIdentificationAndAccount204 .class, PartyIdentificationAndAccount225 .class, PartyIdentificationAndAccount226 .class, Payment1Code.class, PercentagePrice2 .class, Period11 .class, PostalAddress1 .class, PriceDetails37 .class, PriceFormat75Choice.class, PriceFormat76Choice.class, PriceFormat77Choice.class, PriceRateType3Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity48Choice.class, Quantity49Choice.class, Quantity50Choice.class, Quantity51Choice.class, QuantityToQuantityRatio1 .class, Rate41 .class, RateAndAmountFormat55Choice.class, RateAndAmountFormat59Choice.class, RateAndAmountFormat62Choice.class, RateFormat27Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType33Choice.class, RateType36Choice.class, RateType42Choice.class, RateType76Choice.class, RateType77Choice.class, RateType78Choice.class, RateType79Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus37 .class, RateTypeAndAmountAndStatus55 .class, RateTypeAndAmountAndStatus56 .class, RateTypeAndAmountAndStatus57 .class, RateTypeAndAmountAndStatus58 .class, RateTypeAndPercentageRate12 .class, RateTypeAndPercentageRate14 .class, RatioFormat19Choice.class, RatioFormat20Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat41Choice.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption112 .class, SecurityDate25 .class, SecurityIdentification19 .class, SettlementParties129 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, SolicitationFeeRateFormat12Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxVoucher4 .class, TemporaryFinancialInstrumentIndicator3Choice.class, TotalEligibleBalanceFormat10 .class, TransactionIdentification15 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.16";

    public MxSeev03600116() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600116(final String xml) {
        this();
        MxSeev03600116 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600116(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV16 }
     *     
     */
    public CorporateActionMovementConfirmationV16 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV16 }
     *     
     */
    public MxSeev03600116 setCorpActnMvmntConf(CorporateActionMovementConfirmationV16 value) {
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
    public static MxSeev03600116 parse(String xml) {
        return ((MxSeev03600116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600116 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600116) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600116 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600116 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600116) parserImpl.read(MxSeev03600116 .class, xml, _classes));
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
     * Creates an MxSeev03600116 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600116 message
     * @return
     *     a new instance of MxSeev03600116
     */
    public static final MxSeev03600116 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600116 .class);
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
