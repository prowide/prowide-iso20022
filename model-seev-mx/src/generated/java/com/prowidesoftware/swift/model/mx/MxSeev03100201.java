
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
 * Class for seev.031.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.031.002.01")
public class MxSeev03100201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotification002V01 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance7 .class, AccountIdentification10 .class, AccountIdentification8Choice.class, AdditionalBusinessProcess1Code.class, AdditionalBusinessProcessFormat4Choice.class, AlternateIdentification2 .class, AmountAndQuantityRatio3 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, BeneficiaryCertificationType2Code.class, BeneficiaryCertificationType3Choice.class, CapitalGainFormat2Choice.class, CashAccountIdentification6Choice.class, CashOption8 .class, CertificationFormatType1Code.class, CertificationTypeFormat2Choice.class, ClassificationType3Choice.class, ConversionType1Code.class, ConversionTypeFormat2Choice.class, CopyDuplicate1Code.class, CorporateAction4 .class, CorporateActionAmounts7 .class, CorporateActionBalanceDetails7 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat3Choice.class, CorporateActionDate11 .class, CorporateActionDate12 .class, CorporateActionDate13 .class, CorporateActionEventProcessingType1Choice.class, CorporateActionEventProcessingType1Code.class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventStage1Code.class, CorporateActionEventStageFormat2Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionFrequencyType1Code.class, CorporateActionGeneralInformation19 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionNarrative15 .class, CorporateActionNarrative17 .class, CorporateActionNarrative18 .class, CorporateActionNotification002V01 .class, CorporateActionNotification2 .class, CorporateActionNotificationType1Code.class, CorporateActionOption17 .class, CorporateActionOption2Code.class, CorporateActionOption9Choice.class, CorporateActionPeriod3 .class, CorporateActionPeriod5 .class, CorporateActionPrice13 .class, CorporateActionPrice14 .class, CorporateActionPrice15 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionQuantity2 .class, CorporateActionRate12 .class, CorporateActionRate13 .class, CorporateActionRate14 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode6Choice.class, DateCode7Choice.class, DateCode8Choice.class, DateCodeAndTimeFormat2 .class, DateFormat10Choice.class, DateFormat12Choice.class, DateFormat13Choice.class, DateFormat8Choice.class, DateFormat9Choice.class, DateType1Code.class, DateType6Code.class, DateType7Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType1Code.class, DistributionTypeFormat2Choice.class, DividendTypeFormat2Choice.class, DocumentIdentification16 .class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat2Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes10 .class, FinancialInstrumentAttributes11 .class, FinancialInstrumentAttributes12 .class, FinancialInstrumentQuantity14Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FractionDispositionType2Code.class, FractionDispositionType4Code.class, FractionDispositionType5Choice.class, FractionDispositionType6Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GrossDividendRateFormat4Choice.class, GrossDividendRateType1Code.class, IdentificationFormat2Choice.class, IdentificationSource2Choice.class, IndicativeOrMarketPrice3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InterestRateUsedForPaymentFormat4Choice.class, IntermediateSecuritiesDistributionTypeFormat3Choice.class, IntermediateSecuritiesDistributionTypeFormat4Choice.class, IntermediateSecurityDistributionType2Code.class, IntermediateSecurityDistributionType3Code.class, LotteryType1Code.class, LotteryTypeFormat2Choice.class, MarketIdentification2Choice.class, MarketIdentification7 .class, MarketType3Code.class, MarketTypeFormat2Choice.class, MxSeev03100201 .class, NameAndAddress12 .class, NetDividendRateFormat4Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator2Choice.class, OfferType1Code.class, OfferTypeFormat2Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus2Choice.class, OptionFeatures2Code.class, OptionFeaturesFormat4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, PercentagePrice1 .class, Period1Choice.class, Period3 .class, PriceFormat14Choice.class, PriceFormat15Choice.class, PriceFormat16Choice.class, PriceFormat18Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, PriceValueType5Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity10Choice.class, Quantity2Code.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat7Choice.class, RateAndAmountFormat8Choice.class, RateFormat2Choice.class, RateFormat3Choice.class, RateFormat5Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType12Code.class, RateType14Choice.class, RateType15Choice.class, RateType16Choice.class, RateType3Code.class, RateType5Code.class, RateType7Code.class, RateType9Choice.class, RateType9Code.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus2 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus8 .class, RateTypeAndAmountAndStatus9 .class, RateValueType6Code.class, RatioFormat10Choice.class, RatioFormat9Choice.class, RenounceableEntitlementStatusTypeFormat2Choice.class, RenounceableStatus1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption12 .class, SecuritiesOption9 .class, SecurityDate4 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SolicitationFeeRateFormat2Choice.class, TaxCreditRateFormat4Choice.class, TaxType4Code.class, TaxableIncomePerShareCalculatedFormat2Choice.class, TemporaryFinancialInstrumentIndicator2Choice.class, UpdatedAdditionalInformation4 .class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class, UpdatedURLlnformation1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.031.002.01";

    public MxSeev03100201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100201(final String xml) {
        this();
        MxSeev03100201 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification002V01 }
     *     
     */
    public CorporateActionNotification002V01 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification002V01 }
     *     
     */
    public MxSeev03100201 setCorpActnNtfctn(CorporateActionNotification002V01 value) {
        this.corpActnNtfctn = value;
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
    public static MxSeev03100201 parse(String xml) {
        return ((MxSeev03100201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100201) parserImpl.read(MxSeev03100201 .class, xml, _classes));
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
     * Creates an MxSeev03100201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100201 message
     * @return
     *     a new instance of MxSeev03100201
     */
    public final static MxSeev03100201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100201 .class);
    }

}
