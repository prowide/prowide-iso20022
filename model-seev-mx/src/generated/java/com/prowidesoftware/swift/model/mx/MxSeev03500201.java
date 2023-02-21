
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.035.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.035.002.01")
public class MxSeev03500201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdvice002V01 corpActnMvmntPrlimryAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance7 .class, AccountIdentification10 .class, AccountIdentification8Choice.class, AdditionalBusinessProcess2Code.class, AdditionalBusinessProcessFormat6Choice.class, AlternateIdentification2 .class, AmountAndQuantityRatio3 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, BeneficiaryCertificationType2Code.class, BeneficiaryCertificationType3Choice.class, CashAccountIdentification6Choice.class, CashOption6 .class, ClassificationType3Choice.class, CopyDuplicate1Code.class, CorporateActionAmounts6 .class, CorporateActionBalanceDetails7 .class, CorporateActionDate11 .class, CorporateActionDate12 .class, CorporateActionEventProcessingType1Choice.class, CorporateActionEventProcessingType1Code.class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation17 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionMovementPreliminaryAdvice002V01 .class, CorporateActionNarrative15 .class, CorporateActionNarrative16 .class, CorporateActionOption15 .class, CorporateActionOption2Code.class, CorporateActionOption9Choice.class, CorporateActionPeriod5 .class, CorporateActionPreliminaryAdviceType1 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPrice13 .class, CorporateActionPrice14 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionRate12 .class, CorporateActionRate13 .class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason2 .class, CorporateActionReversalReason2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode6Choice.class, DateCode7Choice.class, DateCode8Choice.class, DateCodeAndTimeFormat2 .class, DateFormat10Choice.class, DateFormat12Choice.class, DateFormat13Choice.class, DateFormat9Choice.class, DateType1Code.class, DateType6Code.class, DateType7Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DocumentIdentification16 .class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes10 .class, FinancialInstrumentAttributes11 .class, FinancialInstrumentQuantity14Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FractionDispositionType4Code.class, FractionDispositionType6Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GrossDividendRateFormat4Choice.class, GrossDividendRateType1Code.class, IdentificationSource2Choice.class, IndicativeOrMarketPrice3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InterestRateUsedForPaymentFormat4Choice.class, IntermediateSecuritiesDistributionTypeFormat4Choice.class, IntermediateSecurityDistributionType2Code.class, MarketIdentification2Choice.class, MarketIdentification7 .class, MarketType3Code.class, MarketTypeFormat2Choice.class, MxSeev03500201 .class, NameAndAddress12 .class, NetDividendRateFormat4Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator2Choice.class, OfferType1Code.class, OfferTypeFormat2Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus2Choice.class, OptionFeatures2Code.class, OptionFeaturesFormat4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, Payment1Code.class, PercentagePrice1 .class, Period1Choice.class, Period3 .class, PriceFormat14Choice.class, PriceFormat15Choice.class, PriceFormat16Choice.class, PriceFormat18Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, PriceValueType5Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity10Choice.class, Quantity2Code.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat7Choice.class, RateAndAmountFormat8Choice.class, RateFormat2Choice.class, RateFormat3Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType12Code.class, RateType14Choice.class, RateType15Choice.class, RateType16Choice.class, RateType3Code.class, RateType5Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus2 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus8 .class, RateTypeAndAmountAndStatus9 .class, RateValueType6Code.class, RatioFormat10Choice.class, RatioFormat9Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption10 .class, SecuritiesOption9 .class, SecurityDate4 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SolicitationFeeRateFormat2Choice.class, TaxCreditRateFormat4Choice.class, TaxType4Code.class, TemporaryFinancialInstrumentIndicator2Choice.class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.035.002.01";

    public MxSeev03500201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500201(final String xml) {
        this();
        MxSeev03500201 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V01 }
     *     
     */
    public CorporateActionMovementPreliminaryAdvice002V01 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdvice002V01 }
     *     
     */
    public MxSeev03500201 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdvice002V01 value) {
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
    public static MxSeev03500201 parse(String xml) {
        return ((MxSeev03500201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500201) parserImpl.read(MxSeev03500201 .class, xml, _classes));
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
     * Creates an MxSeev03500201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500201 message
     * @return
     *     a new instance of MxSeev03500201
     */
    public final static MxSeev03500201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500201 .class);
    }

}
