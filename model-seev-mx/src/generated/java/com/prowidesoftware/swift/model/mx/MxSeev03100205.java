
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.031.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.031.002.05")
public class MxSeev03100205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotification002V05 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance29 .class, AccountIdentification10 .class, AccountIdentification26Choice.class, AdditionalBusinessProcess1Code.class, AdditionalBusinessProcessFormat4Choice.class, AmountAndQuantityRatio3 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, BalanceFormat4Choice.class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType7Choice.class, CapitalGainFormat2Choice.class, CashAccountIdentification6Choice.class, CashOption35 .class, CertificationFormatType1Code.class, CertificationTypeFormat2Choice.class, ClassificationType3Choice.class, ConsentType1Code.class, ConsentTypeFormat3Choice.class, ConversionType1Code.class, ConversionTypeFormat2Choice.class, CorporateAction17 .class, CorporateActionAmounts32 .class, CorporateActionBalanceDetails25 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat3Choice.class, CorporateActionDate26 .class, CorporateActionDate28 .class, CorporateActionDate33 .class, CorporateActionEventProcessingType1Choice.class, CorporateActionEventProcessingType1Code.class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat9Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType12Code.class, CorporateActionEventType21Choice.class, CorporateActionFrequencyType3Code.class, CorporateActionGeneralInformation76 .class, CorporateActionInformationType1Code.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionNarrative17 .class, CorporateActionNarrative22 .class, CorporateActionNarrative25 .class, CorporateActionNotification002V05 .class, CorporateActionNotification4 .class, CorporateActionNotificationType1Code.class, CorporateActionOption106 .class, CorporateActionOption17Choice.class, CorporateActionOption7Code.class, CorporateActionPeriod10 .class, CorporateActionPeriod7 .class, CorporateActionPrice34 .class, CorporateActionPrice50 .class, CorporateActionPrice51 .class, CorporateActionProcessingStatus4Choice.class, CorporateActionQuantity6 .class, CorporateActionRate56 .class, CorporateActionRate57 .class, CorporateActionRate58 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode12Choice.class, DateCode13Choice.class, DateCode14Choice.class, DateCode7Choice.class, DateCode8Choice.class, DateCodeAndTimeFormat2 .class, DateFormat13Choice.class, DateFormat17Choice.class, DateFormat18Choice.class, DateFormat22Choice.class, DateFormat23Choice.class, DateFormat24Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType3Code.class, DistributionTypeFormat6Choice.class, DividendRateType1Code.class, DividendTypeFormat8Choice.class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat2Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes47 .class, FinancialInstrumentAttributes55 .class, FinancialInstrumentAttributes56 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity21Choice.class, FinancialInstrumentQuantity22Choice.class, ForeignExchangeTerms15 .class, ForeignExchangeTerms19 .class, FractionDispositionType16Choice.class, FractionDispositionType20Choice.class, FractionDispositionType8Code.class, FractionDispositionType9Code.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification51 .class, GrossDividendRateFormat13Choice.class, GrossDividendRateFormat14Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationFormat2Choice.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice6Choice.class, InformationTypeFormat3Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, InterestRateUsedForPaymentFormat6Choice.class, IntermediateSecuritiesDistributionTypeFormat10Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerTaxability1Code.class, LotteryType1Code.class, LotteryTypeFormat2Choice.class, MarketIdentification4Choice.class, MxSeev03100205 .class, NameAndAddress12 .class, NetDividendRateFormat15Choice.class, NetDividendRateFormat16Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType2Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator2Choice.class, OfferType3Code.class, OfferTypeFormat8Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus2Choice.class, OptionFeatures5Code.class, OptionFeaturesFormat15Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities5 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification57Choice.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PriceDetails18 .class, PriceFormat25Choice.class, PriceFormat27Choice.class, PriceFormat31Choice.class, PriceFormat39Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity6 .class, Quantity10Choice.class, Quantity15Choice.class, Quantity16Choice.class, Quantity4Code.class, Quantity5Code.class, Quantity7Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat16Choice.class, RateAndAmountFormat17Choice.class, RateAndAmountFormat28Choice.class, RateAndAmountFormat30Choice.class, RateAndAmountFormat6Choice.class, RateDetails18 .class, RateFormat12Choice.class, RateFormat14Choice.class, RateFormat3Choice.class, RateFormat7Choice.class, RateFormat9Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType10Code.class, RateType12Choice.class, RateType13Code.class, RateType14Choice.class, RateType18Choice.class, RateType24Choice.class, RateType25Choice.class, RateType26Choice.class, RateType27Choice.class, RateType30Choice.class, RateType3Code.class, RateType5Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus17 .class, RateTypeAndAmountAndStatus18 .class, RateTypeAndAmountAndStatus19 .class, RateTypeAndAmountAndStatus20 .class, RateTypeAndAmountAndStatus21 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus9 .class, RateTypeAndPercentageRate3 .class, RateValueType7Code.class, RatioFormat13Choice.class, RatioFormat14Choice.class, RenounceableEntitlementStatusTypeFormat2Choice.class, RenounceableStatus1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption28 .class, SecuritiesOption45 .class, SecurityDate10 .class, SecurityIdentification15 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SignedQuantityFormat5 .class, SolicitationFeeRateFormat6Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat6Choice.class, TaxType4Code.class, TaxableIncomePerShareCalculatedFormat2Choice.class, TemporaryFinancialInstrumentIndicator2Choice.class, TotalEligibleBalanceFormat4 .class, UpdatedAdditionalInformation4 .class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class, UpdatedURLlnformation1 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.031.002.05";

    public MxSeev03100205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100205(final String xml) {
        this();
        MxSeev03100205 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification002V05 }
     *     
     */
    public CorporateActionNotification002V05 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification002V05 }
     *     
     */
    public MxSeev03100205 setCorpActnNtfctn(CorporateActionNotification002V05 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev03100205 parse(String xml) {
        return ((MxSeev03100205) MxReadImpl.parse(MxSeev03100205 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100205 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100205) parserImpl.read(MxSeev03100205 .class, xml, _classes));
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
     * Creates an MxSeev03100205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100205 message
     * @return
     *     a new instance of MxSeev03100205
     */
    public final static MxSeev03100205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100205 .class);
    }

}
