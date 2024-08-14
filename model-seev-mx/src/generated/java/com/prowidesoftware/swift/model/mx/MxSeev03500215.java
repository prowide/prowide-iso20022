
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
 * Class for seev.035.002.15 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.002.15")
public class MxSeev03500215
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdvice002V15 corpActnMvmntPrlimryAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 15;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance53 .class, AccountIdentification10 .class, AccountIdentification52Choice.class, AdditionalBusinessProcess10Code.class, AdditionalBusinessProcessFormat21Choice.class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPrice7 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity11 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountPriceType3Code.class, AmountToAmountRatio3 .class, BalanceFormat14Choice.class, BalanceFormat16Choice.class, BeneficiaryCertificationType12Choice.class, BeneficiaryCertificationType4Code.class, BorrowerLendingDeadline6 .class, CashAccountIdentification6Choice.class, CashOption98 .class, ClassificationType33Choice.class, CorporateAction77 .class, CorporateActionAmounts61 .class, CorporateActionAmounts68 .class, CorporateActionBalanceDetails46 .class, CorporateActionDate81 .class, CorporateActionDate93 .class, CorporateActionDate94 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType3Choice.class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType32Code.class, CorporateActionEventType97Choice.class, CorporateActionGeneralInformation168 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionMovementPreliminaryAdvice002V15 .class, CorporateActionMovementPreliminaryAdviceFunction1Code.class, CorporateActionNarrative61 .class, CorporateActionNarrative62 .class, CorporateActionOption15Code.class, CorporateActionOption226 .class, CorporateActionOption46Choice.class, CorporateActionPeriod12 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPreliminaryAdviceType5 .class, CorporateActionPrice69 .class, CorporateActionPrice79 .class, CorporateActionQuantity13 .class, CorporateActionRate109 .class, CorporateActionRate115 .class, CorporateActionReversalReason2Code.class, CorporateActionReversalReason6 .class, CorporateActionReversalReason6Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode22Choice.class, DateCode26Choice.class, DateCode27Choice.class, DateCodeAndTimeFormat4 .class, DateFormat41Choice.class, DateFormat43Choice.class, DateFormat45Choice.class, DateFormat49Choice.class, DateFormat54Choice.class, DateFormat64Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DeemedRateType1Code.class, DeemedRateType2Choice.class, DefaultProcessingOrStandingInstruction1Choice.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentAttributes114 .class, FinancialInstrumentAttributes115 .class, FinancialInstrumentQuantity36Choice.class, FinancialInstrumentQuantity43Choice.class, FinancialInstrumentQuantity44Choice.class, ForeignExchangeTerms28 .class, FractionDispositionType31Choice.class, FractionDispositionType8Code.class, GenericIdentification30 .class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat41Choice.class, GrossDividendRateFormat42Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice11Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InterestRateUsedForPaymentFormat10Choice.class, IntermediateSecuritiesDistributionTypeFormat18Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification4Choice.class, MxSeev03500215 .class, NameAndAddress12 .class, NetDividendRateFormat43Choice.class, NetDividendRateFormat44Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator2Code.class, NonEligibleProceedsIndicator4Choice.class, NonEligibleProceedsIndicator6Choice.class, OfferType4Code.class, OfferTypeFormat13Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus4Choice.class, OptionFeatures13Code.class, OptionFeaturesFormat31Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination1 .class, PartyIdentification136Choice.class, PartyIdentification137Choice.class, PartyIdentification151Choice.class, Payment1Code.class, PercentagePrice1 .class, Period11 .class, Period6Choice.class, PriceDetails34 .class, PriceFormat57Choice.class, PriceFormat58Choice.class, PriceFormat59Choice.class, PriceFormat62Choice.class, PriceFormat70Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity4Code.class, Quantity53Choice.class, Quantity54Choice.class, Quantity57Choice.class, Quantity5Code.class, Quantity80Choice.class, QuantityToQuantityRatio2 .class, Rate38 .class, RateAndAmountFormat46Choice.class, RateAndAmountFormat47Choice.class, RateAndAmountFormat48Choice.class, RateAndAmountFormat53Choice.class, RateFormat12Choice.class, RateFormat21Choice.class, RateFormat3Choice.class, RateStatus1Code.class, RateStatus4Choice.class, RateType13Code.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType5Code.class, RateType7Code.class, RateType80Choice.class, RateType81Choice.class, RateType82Choice.class, RateType83Choice.class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus54 .class, RateTypeAndAmountAndStatus59 .class, RateTypeAndAmountAndStatus60 .class, RateTypeAndAmountAndStatus61 .class, RateTypeAndAmountAndStatus62 .class, RateTypeAndPercentageRate11 .class, RateTypeAndPercentageRate9 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat32Choice.class, SafekeepingPlaceFormat39Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption105 .class, SecuritiesOption84 .class, SecurityDate23 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat12 .class, SignedQuantityFormat13 .class, SolicitationFeeRateFormat10Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat11 .class, UpdatedAdditionalInformation22 .class, UpdatedAdditionalInformation23 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.035.002.15";

    public MxSeev03500215() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500215(final String xml) {
        this();
        MxSeev03500215 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500215(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V15 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V15 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V15 }
     *     
     */
    public MxSeev03500215 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdvice002V15 value) {
        this.corpActnMvmntPrlimryAdvc = value;
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
    public static MxSeev03500215 parse(String xml) {
        return ((MxSeev03500215) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500215 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500215 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500215) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500215 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500215 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500215) parserImpl.read(MxSeev03500215 .class, xml, _classes));
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
     * Creates an MxSeev03500215 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500215 message
     * @return
     *     a new instance of MxSeev03500215
     */
    public final static MxSeev03500215 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500215 .class);
    }

}
