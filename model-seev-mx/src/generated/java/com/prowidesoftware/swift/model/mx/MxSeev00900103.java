
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
 * Class for seev.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCANtfctnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.009.001.03")
public class MxSeev00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCANtfctnAdvc", required = true)
    protected AgentCANotificationAdviceV03 agtCANtfctnAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess13Code.class, AdditionalBusinessProcessFormat25Choice.class, AddressType2Code.class, AgentCANotificationAdviceV03 .class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPrice6 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountPriceType3Code.class, AmountToAmountRatio2 .class, BeneficiaryCertificationType13Choice.class, BeneficiaryCertificationType6Code.class, BorrowerLendingDeadline5 .class, CapitalGainFormat3Choice.class, CashOption115 .class, CertificationFormatType1Code.class, CertificationTypeFormat3Choice.class, ClassificationType32Choice.class, ConsentType1Code.class, ConsentTypeFormat4Choice.class, ContactIdentification1 .class, CorporateAction88 .class, CorporateActionAgent2 .class, CorporateActionAmounts77 .class, CorporateActionAmounts80 .class, CorporateActionBalanceDetails48 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat5Choice.class, CorporateActionDate110 .class, CorporateActionDate83 .class, CorporateActionDate84 .class, CorporateActionEventProcessingType2Code.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat13Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType126Choice.class, CorporateActionEventType127Choice.class, CorporateActionEventType35Code.class, CorporateActionFrequencyType5Code.class, CorporateActionGeneralInformation196 .class, CorporateActionInformationType1Code.class, CorporateActionLotteryEvent1 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionNarrative2 .class, CorporateActionNarrative58 .class, CorporateActionNarrative66 .class, CorporateActionNotification12 .class, CorporateActionNotificationType1Code.class, CorporateActionOption15Code.class, CorporateActionOption250 .class, CorporateActionOption37Choice.class, CorporateActionPeriod17 .class, CorporateActionPeriod18 .class, CorporateActionPrice82 .class, CorporateActionPrice85 .class, CorporateActionPrice87 .class, CorporateActionProcessingStatus5Choice.class, CorporateActionProcessingStatus7Choice.class, CorporateActionQuantity15 .class, CorporateActionRate122 .class, CorporateActionRate129 .class, CorporateActionRate138 .class, CorporateActionSD26 .class, CorporateActionSupplementaryIndicators2 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DTCBaseDisbursed1Code.class, DTCCSubEventType9Code.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode20Choice.class, DateCode21Choice.class, DateCode33Choice.class, DateCodeAndTimeFormat3 .class, DateFormat30Choice.class, DateFormat43Choice.class, DateFormat44Choice.class, DateFormat45Choice.class, DateFormat46Choice.class, DateFormat57Choice.class, DateFormat59Choice.class, DateFormat73Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DateType9Code.class, DeemedRateType1Choice.class, DeemedRateType1Code.class, DistributionType3Code.class, DistributionTypeFormat7Choice.class, DividendRateType1Code.class, DividendTypeFormat9Choice.class, DocumentIdentification31 .class, DutchAuctionType1Code.class, DutchAuctionTypeFormat1Choice.class, EUCapitalGain2Code.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, ExtendedEventType8Code.class, ExtendedOptionFeature2Code.class, FinancialInstrumentAttributes126 .class, FinancialInstrumentAttributes130 .class, FinancialInstrumentQuantity33Choice.class, FinancialInstrumentQuantity34Choice.class, FinancialInstrumentQuantity35Choice.class, ForeignExchangeTerms38 .class, ForeignExchangeTerms39 .class, FractionDispositionType12Code.class, FractionDispositionType26Choice.class, FractionDispositionType8Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, GrossDividendRateFormat38Choice.class, GrossDividendRateFormat43Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice12Choice.class, InformationTypeFormat4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateUsedForPaymentFormat11Choice.class, IntermediateSecuritiesDistributionTypeFormat19Choice.class, IntermediateSecurityDistributionType6Code.class, LotteryFeatureType1Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification3Choice.class, MxSeev00900103 .class, NameAndAddress5 .class, NamePrefix1Code.class, NetDividendRateFormat38Choice.class, NetDividendRateFormat39Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator2Code.class, NonEligibleProceedsIndicator5Choice.class, OfferType7Code.class, OfferTypeFormat18Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus3Choice.class, OptionFeatures15Code.class, OptionFeaturesFormat32Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification127Choice.class, PartyIdentification129Choice.class, PartyIdentification289 .class, PercentagePrice2 .class, Period11 .class, Period12Choice.class, Period18 .class, Period6Choice.class, PostalAddress1 .class, PriceCalculationMethod1Code.class, PriceCalculationMethod2Choice.class, PriceDetails39 .class, PriceFormat46Choice.class, PriceFormat61Choice.class, PriceFormat72Choice.class, PriceFormat73Choice.class, PriceFormat74Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProrationBelowMinimumQuantity2Code.class, ProrationBelowMinimumQuantity3Choice.class, ProrationReturnQuantityTreatment1Code.class, Quantity4Code.class, Quantity51Choice.class, Quantity5Code.class, QuantityToQuantityRatio1 .class, Rate49 .class, RateAndAmountFormat42Choice.class, RateAndAmountFormat56Choice.class, RateAndAmountFormat57Choice.class, RateAndAmountFormat58Choice.class, RateAndAmountFormat59Choice.class, RateAndAmountFormat61Choice.class, RateFormat12Choice.class, RateFormat24Choice.class, RateFormat25Choice.class, RateFormat26Choice.class, RateFormat31Choice.class, RateFormat32Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType10Code.class, RateType13Code.class, RateType14Code.class, RateType33Choice.class, RateType36Choice.class, RateType42Choice.class, RateType5Code.class, RateType76Choice.class, RateType77Choice.class, RateType78Choice.class, RateType79Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus37 .class, RateTypeAndAmountAndStatus55 .class, RateTypeAndAmountAndStatus56 .class, RateTypeAndAmountAndStatus57 .class, RateTypeAndAmountAndStatus58 .class, RateTypeAndPercentageRate12 .class, RateTypeAndPercentageRate14 .class, RateValueType7Code.class, RatioFormat17Choice.class, RatioFormat18Choice.class, RedemptionAnnouncementNoticeType1Code.class, ReinvestmentIncomeClassification2Code.class, RenounceableEntitlementStatusTypeFormat3Choice.class, RenounceableStatus1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat41Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption120 .class, SecuritiesOption81 .class, SecurityDate20 .class, SecurityIdentification19 .class, SolicitationFeeRateFormat11Choice.class, TaxCategory1 .class, TaxableIncomePerShareCalculatedFormat3Choice.class, TemporaryFinancialInstrumentIndicator3Choice.class, UpdatedAdditionalInformation19 .class, UpdatedAdditionalInformation21 .class, UpdatedURLlnformation6 .class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.009.001.03";

    public MxSeev00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev00900103(final String xml) {
        this();
        MxSeev00900103 tmp = parse(xml);
        agtCANtfctnAdvc = tmp.getAgtCANtfctnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCANtfctnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCANotificationAdviceV03 }
     *     
     */
    public AgentCANotificationAdviceV03 getAgtCANtfctnAdvc() {
        return agtCANtfctnAdvc;
    }

    /**
     * Sets the value of the agtCANtfctnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCANotificationAdviceV03 }
     *     
     */
    public MxSeev00900103 setAgtCANtfctnAdvc(AgentCANotificationAdviceV03 value) {
        this.agtCANtfctnAdvc = value;
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
    public static MxSeev00900103 parse(String xml) {
        return ((MxSeev00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev00900103 parse(String xml, MxRead parserImpl) {
        return ((MxSeev00900103) parserImpl.read(MxSeev00900103 .class, xml, _classes));
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
     * Creates an MxSeev00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev00900103 message
     * @return
     *     a new instance of MxSeev00900103
     */
    public static final MxSeev00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev00900103 .class);
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
