
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
 * Class for seev.031.002.14 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.002.14")
public class MxSeev03100214
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotification002V14 corpActnNtfctn;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 14;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance56 .class, AccountIdentification10 .class, AccountIdentification57Choice.class, ActiveCurrencyAnd13DecimalAmount.class, AdditionalBusinessProcess9Code.class, AdditionalBusinessProcessFormat22Choice.class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPrice7 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity11 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountPriceType3Code.class, AmountToAmountRatio3 .class, BalanceFormat14Choice.class, BalanceFormat16Choice.class, BeneficiaryCertificationType12Choice.class, BeneficiaryCertificationType4Code.class, BidRangeType1Choice.class, BidRangeType1Code.class, BorrowerLendingDeadline6 .class, CapitalGainFormat4Choice.class, CashAccountIdentification6Choice.class, CashOption100 .class, CertificationFormatType1Code.class, CertificationTypeFormat4Choice.class, ClassificationType33Choice.class, ConsentType1Code.class, ConsentTypeFormat5Choice.class, CorporateAction81 .class, CorporateActionAmounts61 .class, CorporateActionAmounts69 .class, CorporateActionBalanceDetails46 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat8Choice.class, CorporateActionDate82 .class, CorporateActionDate96 .class, CorporateActionDate97 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType3Choice.class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat20Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType31Code.class, CorporateActionEventType89Choice.class, CorporateActionFrequencyType5Code.class, CorporateActionGeneralInformation170 .class, CorporateActionInformationType1Code.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionNarrative63 .class, CorporateActionNarrative64 .class, CorporateActionNarrative65 .class, CorporateActionNotification002V14 .class, CorporateActionNotification11 .class, CorporateActionNotificationType1Code.class, CorporateActionOption15Code.class, CorporateActionOption228 .class, CorporateActionOption46Choice.class, CorporateActionPeriod12 .class, CorporateActionPeriod15 .class, CorporateActionPrice79 .class, CorporateActionPrice80 .class, CorporateActionPrice81 .class, CorporateActionProcessingStatus6Choice.class, CorporateActionQuantity14 .class, CorporateActionRate110 .class, CorporateActionRate111 .class, CorporateActionRate116 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode22Choice.class, DateCode26Choice.class, DateCode27Choice.class, DateCode33Choice.class, DateCodeAndTimeFormat4 .class, DateFormat41Choice.class, DateFormat43Choice.class, DateFormat45Choice.class, DateFormat49Choice.class, DateFormat54Choice.class, DateFormat59Choice.class, DateFormat64Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DateType9Code.class, DeemedRateType1Code.class, DeemedRateType2Choice.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType3Code.class, DistributionTypeFormat8Choice.class, DividendRateType1Code.class, DividendTypeFormat10Choice.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat4Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, EventSequenceType1Code.class, EventSequenceTypeFormat2Choice.class, FinancialInstrumentAttributes114 .class, FinancialInstrumentAttributes115 .class, FinancialInstrumentAttributes117 .class, FinancialInstrumentQuantity36Choice.class, FinancialInstrumentQuantity43Choice.class, FinancialInstrumentQuantity44Choice.class, ForeignExchangeTerms19 .class, ForeignExchangeTerms28 .class, FractionDispositionType31Choice.class, FractionDispositionType32Choice.class, FractionDispositionType8Code.class, FractionDispositionType9Code.class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat41Choice.class, GrossDividendRateFormat42Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationFormat4Choice.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice11Choice.class, InformationTypeFormat5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InterestRateUsedForPaymentFormat10Choice.class, IntermediateSecuritiesDistributionTypeFormat18Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification4Choice.class, MxSeev03100214 .class, NameAndAddress12 .class, NetDividendRateFormat43Choice.class, NetDividendRateFormat44Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator2Code.class, NonEligibleProceedsIndicator6Choice.class, OfferType4Code.class, OfferTypeFormat13Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus4Choice.class, OptionFeatures13Code.class, OptionFeaturesFormat31Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification151Choice.class, Payment2Code.class, PercentagePrice1 .class, Period11 .class, Period6Choice.class, PriceDetails35 .class, PriceFormat57Choice.class, PriceFormat58Choice.class, PriceFormat59Choice.class, PriceFormat62Choice.class, PriceFormat70Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity4Code.class, Quantity53Choice.class, Quantity54Choice.class, Quantity57Choice.class, Quantity5Code.class, Quantity80Choice.class, QuantityToQuantityRatio2 .class, Rate38 .class, RateAndAmountFormat37Choice.class, RateAndAmountFormat38Choice.class, RateAndAmountFormat43Choice.class, RateAndAmountFormat46Choice.class, RateAndAmountFormat47Choice.class, RateAndAmountFormat48Choice.class, RateAndAmountFormat50Choice.class, RateAndAmountFormat53Choice.class, RateFormat12Choice.class, RateFormat21Choice.class, RateFormat3Choice.class, RateFormat7Choice.class, RateStatus1Code.class, RateStatus4Choice.class, RateType10Code.class, RateType13Code.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType5Code.class, RateType7Code.class, RateType80Choice.class, RateType81Choice.class, RateType82Choice.class, RateType83Choice.class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus54 .class, RateTypeAndAmountAndStatus59 .class, RateTypeAndAmountAndStatus60 .class, RateTypeAndAmountAndStatus61 .class, RateTypeAndAmountAndStatus62 .class, RateTypeAndPercentageRate11 .class, RateTypeAndPercentageRate9 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, RenounceableEntitlementStatusTypeFormat4Choice.class, RenounceableStatus1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat32Choice.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption107 .class, SecuritiesOption84 .class, SecurityDate24 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat12 .class, SignedQuantityFormat13 .class, SolicitationFeeRateFormat10Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxableIncomePerShareCalculatedFormat4Choice.class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat11 .class, UpdatedAdditionalInformation24 .class, UpdatedAdditionalInformation25 .class, UpdatedAdditionalInformation26 .class, UpdatedURLlnformation7 .class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.031.002.14";

    public MxSeev03100214() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100214(final String xml) {
        this();
        MxSeev03100214 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100214(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification002V14 }
     *     
     */
    public CorporateActionNotification002V14 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification002V14 }
     *     
     */
    public MxSeev03100214 setCorpActnNtfctn(CorporateActionNotification002V14 value) {
        this.corpActnNtfctn = value;
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
    public static MxSeev03100214 parse(String xml) {
        return ((MxSeev03100214) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100214 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100214 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100214) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100214 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100214 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100214) parserImpl.read(MxSeev03100214 .class, xml, _classes));
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
     * Creates an MxSeev03100214 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100214 message
     * @return
     *     a new instance of MxSeev03100214
     */
    public static final MxSeev03100214 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100214 .class);
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
