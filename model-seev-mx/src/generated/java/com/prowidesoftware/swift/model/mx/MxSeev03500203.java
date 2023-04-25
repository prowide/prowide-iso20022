
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
 * Class for seev.035.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.035.002.03")
public class MxSeev03500203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdvice002V03 corpActnMvmntPrlimryAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 35;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance18 .class, AccountIdentification10 .class, AccountIdentification19Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess2Code.class, AdditionalBusinessProcessFormat6Choice.class, AmountAndQuantityRatio3 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType7Choice.class, CashAccountIdentification6Choice.class, CashOption20 .class, ClassificationType3Choice.class, CorporateActionAmounts19 .class, CorporateActionBalanceDetails13 .class, CorporateActionDate16 .class, CorporateActionDate26 .class, CorporateActionEventProcessingType1Choice.class, CorporateActionEventProcessingType1Code.class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType8Code.class, CorporateActionEventType9Choice.class, CorporateActionGeneralInformation46 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionMovementPreliminaryAdvice002V03 .class, CorporateActionNarrative16 .class, CorporateActionNarrative22 .class, CorporateActionOption17Choice.class, CorporateActionOption44 .class, CorporateActionOption7Code.class, CorporateActionPeriod7 .class, CorporateActionPreliminaryAdviceType1 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPrice32 .class, CorporateActionPrice34 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionRate30 .class, CorporateActionRate33 .class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason2 .class, CorporateActionReversalReason2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode12Choice.class, DateCode7Choice.class, DateCode8Choice.class, DateCodeAndTimeFormat2 .class, DateFormat13Choice.class, DateFormat18Choice.class, DateFormat22Choice.class, DateFormat23Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes39 .class, FinancialInstrumentAttributes40 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity21Choice.class, FinancialInstrumentQuantity22Choice.class, ForeignExchangeTerms15 .class, FractionDispositionType4Code.class, FractionDispositionType6Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GrossDividendRateFormat6Choice.class, GrossDividendRateType1Code.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice6Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InterestRateUsedForPaymentFormat6Choice.class, IntermediateSecuritiesDistributionTypeFormat10Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerTaxability1Code.class, MarketIdentification4Choice.class, MxSeev03500203 .class, NameAndAddress12 .class, NetDividendRateFormat6Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator2Choice.class, OfferType1Code.class, OfferTypeFormat2Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus2Choice.class, OptionFeatures4Code.class, OptionFeaturesFormat11Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification56Choice.class, Payment1Code.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PriceDetails8 .class, PriceFormat25Choice.class, PriceFormat26Choice.class, PriceFormat27Choice.class, PriceFormat31Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity10Choice.class, Quantity4Code.class, Quantity5Code.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat16Choice.class, RateAndAmountFormat17Choice.class, RateDetails5 .class, RateFormat3Choice.class, RateFormat6Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType13Code.class, RateType14Choice.class, RateType15Choice.class, RateType16Choice.class, RateType18Choice.class, RateType3Code.class, RateType5Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus12 .class, RateTypeAndAmountAndStatus2 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus8 .class, RateTypeAndAmountAndStatus9 .class, RateValueType7Code.class, RatioFormat13Choice.class, RatioFormat14Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption28 .class, SecuritiesOption29 .class, SecurityDate8 .class, SecurityIdentification15 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SolicitationFeeRateFormat4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat6Choice.class, TaxType4Code.class, TemporaryFinancialInstrumentIndicator2Choice.class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:seev.035.002.03";

    public MxSeev03500203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500203(final String xml) {
        this();
        MxSeev03500203 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V03 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V03 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V03 }
     *     
     */
    public MxSeev03500203 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdvice002V03 value) {
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
    public static MxSeev03500203 parse(String xml) {
        return ((MxSeev03500203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500203 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500203 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500203) parserImpl.read(MxSeev03500203 .class, xml, _classes));
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
     * Creates an MxSeev03500203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500203 message
     * @return
     *     a new instance of MxSeev03500203
     */
    public static final MxSeev03500203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500203 .class);
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
