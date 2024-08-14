
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
 * Class for seev.035.002.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.002.08")
public class MxSeev03500208
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdvice002V08 corpActnMvmntPrlimryAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 35;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance39 .class, AccountIdentification10 .class, AccountIdentification36Choice.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess6Code.class, AdditionalBusinessProcessFormat13Choice.class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat10Choice.class, BalanceFormat7Choice.class, BeneficiaryCertificationType12Choice.class, BeneficiaryCertificationType4Code.class, BorrowerLendingDeadline2 .class, CashAccountIdentification6Choice.class, CashOption54 .class, ClassificationType33Choice.class, CorporateAction38 .class, CorporateActionAmounts40 .class, CorporateActionBalanceDetails36 .class, CorporateActionDate54 .class, CorporateActionDate55 .class, CorporateActionDate56 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType3Choice.class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType23Code.class, CorporateActionEventType61Choice.class, CorporateActionGeneralInformation117 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionMovementPreliminaryAdvice002V08 .class, CorporateActionNarrative36 .class, CorporateActionNarrative37 .class, CorporateActionOption135 .class, CorporateActionOption23Choice.class, CorporateActionOption7Code.class, CorporateActionPeriod7 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPreliminaryAdviceType2 .class, CorporateActionPrice65 .class, CorporateActionPrice66 .class, CorporateActionRate77 .class, CorporateActionRate84 .class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason4 .class, CorporateActionReversalReason4Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateCode26Choice.class, DateCode27Choice.class, DateCodeAndTimeFormat4 .class, DateFormat18Choice.class, DateFormat34Choice.class, DateFormat38Choice.class, DateFormat39Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentAttributes83 .class, FinancialInstrumentAttributes85 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity21Choice.class, FinancialInstrumentQuantity22Choice.class, ForeignExchangeTerms28 .class, FractionDispositionType31Choice.class, FractionDispositionType8Code.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat25Choice.class, GrossDividendRateFormat26Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice11Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InterestRateUsedForPaymentFormat10Choice.class, IntermediateSecuritiesDistributionTypeFormat18Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification4Choice.class, MxSeev03500208 .class, NameAndAddress12 .class, NetDividendRateFormat27Choice.class, NetDividendRateFormat28Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator4Choice.class, OfferType3Code.class, OfferTypeFormat11Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus4Choice.class, OptionFeatures10Code.class, OptionFeaturesFormat23Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, Payment1Code.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PriceDetails25 .class, PriceFormat57Choice.class, PriceFormat58Choice.class, PriceFormat59Choice.class, PriceFormat60Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, Quantity4Code.class, Quantity5Code.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat46Choice.class, RateAndAmountFormat47Choice.class, RateAndAmountFormat48Choice.class, RateDetails28 .class, RateFormat12Choice.class, RateFormat21Choice.class, RateFormat3Choice.class, RateStatus1Code.class, RateStatus4Choice.class, RateType13Code.class, RateType3Code.class, RateType44Choice.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType48Choice.class, RateType49Choice.class, RateType50Choice.class, RateType51Choice.class, RateType5Code.class, RateType7Code.class, RateTypeAndAmountAndStatus30 .class, RateTypeAndAmountAndStatus31 .class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus34 .class, RateTypeAndAmountAndStatus35 .class, RateTypeAndAmountAndStatus36 .class, RateTypeAndPercentageRate9 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption56 .class, SecuritiesOption61 .class, SecurityDate14 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SolicitationFeeRateFormat10Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat10Choice.class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat9 .class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.035.002.08";

    public MxSeev03500208() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500208(final String xml) {
        this();
        MxSeev03500208 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500208(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V08 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V08 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V08 }
     *     
     */
    public MxSeev03500208 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdvice002V08 value) {
        this.corpActnMvmntPrlimryAdvc = value;
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
    public static MxSeev03500208 parse(String xml) {
        return ((MxSeev03500208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500208 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500208) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500208 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500208 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500208) parserImpl.read(MxSeev03500208 .class, xml, _classes));
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
     * Creates an MxSeev03500208 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500208 message
     * @return
     *     a new instance of MxSeev03500208
     */
    public static final MxSeev03500208 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500208 .class);
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
