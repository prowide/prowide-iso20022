
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
 * Class for seev.031.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.06")
public class MxSeev03100106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotificationV06 corpActnNtfctn;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 31;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndBalance33 .class, AccountIdentification10 .class, AccountIdentification32Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess5Code.class, AdditionalBusinessProcessFormat9Choice.class, AddressType2Code.class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity6 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat5Choice.class, BalanceFormat6Choice.class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType9Choice.class, BorrowerLendingDeadline1 .class, CapitalGainFormat3Choice.class, CashAccountIdentification5Choice.class, CashOption43 .class, CertificationFormatType1Code.class, CertificationTypeFormat3Choice.class, ClassificationType32Choice.class, ConsentType1Code.class, ConsentTypeFormat4Choice.class, ConversionType1Code.class, ConversionTypeFormat3Choice.class, CorporateAction31 .class, CorporateActionAmounts36 .class, CorporateActionBalanceDetails29 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat5Choice.class, CorporateActionDate44 .class, CorporateActionDate47 .class, CorporateActionDate48 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType2Choice.class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat13Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType17Code.class, CorporateActionEventType33Choice.class, CorporateActionFrequencyType5Code.class, CorporateActionGeneralInformation85 .class, CorporateActionInformationType1Code.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionNarrative26 .class, CorporateActionNarrative27 .class, CorporateActionNarrative29 .class, CorporateActionNotification5 .class, CorporateActionNotificationType1Code.class, CorporateActionNotificationV06 .class, CorporateActionOption114 .class, CorporateActionOption18Choice.class, CorporateActionOption7Code.class, CorporateActionPeriod10 .class, CorporateActionPeriod7 .class, CorporateActionPrice56 .class, CorporateActionPrice57 .class, CorporateActionPrice58 .class, CorporateActionProcessingStatus5Choice.class, CorporateActionQuantity7 .class, CorporateActionRate66 .class, CorporateActionRate68 .class, CorporateActionRate69 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode19Choice.class, DateCode20Choice.class, DateCode21Choice.class, DateCodeAndTimeFormat3 .class, DateFormat18Choice.class, DateFormat30Choice.class, DateFormat31Choice.class, DateFormat32Choice.class, DateFormat33Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType3Code.class, DistributionTypeFormat7Choice.class, DividendRateType1Code.class, DividendTypeFormat9Choice.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat3Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes66 .class, FinancialInstrumentAttributes67 .class, FinancialInstrumentAttributes68 .class, FinancialInstrumentQuantity19Choice.class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantity20Choice.class, ForeignExchangeTerms19 .class, ForeignExchangeTerms24 .class, FractionDispositionType25Choice.class, FractionDispositionType26Choice.class, FractionDispositionType8Code.class, FractionDispositionType9Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, GrossDividendRateFormat19Choice.class, GrossDividendRateFormat20Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationFormat3Choice.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice7Choice.class, InformationTypeFormat4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateUsedForPaymentFormat8Choice.class, IntermediateSecuritiesDistributionTypeFormat15Choice.class, IntermediateSecurityDistributionType5Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification3Choice.class, MxSeev03100106 .class, NameAndAddress5 .class, NetDividendRateFormat21Choice.class, NetDividendRateFormat22Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator3Choice.class, OfferType3Code.class, OfferTypeFormat10Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus3Choice.class, OptionFeatures8Code.class, OptionFeaturesFormat16Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification71Choice.class, PartyIdentification92Choice.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PostalAddress1 .class, PriceDetails22 .class, PriceFormat44Choice.class, PriceFormat45Choice.class, PriceFormat46Choice.class, PriceFormat47Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity17Choice.class, Quantity18Choice.class, Quantity19Choice.class, Quantity4Code.class, Quantity5Code.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat37Choice.class, RateAndAmountFormat38Choice.class, RateAndAmountFormat39Choice.class, RateAndAmountFormat41Choice.class, RateAndAmountFormat42Choice.class, RateDetails22 .class, RateFormat12Choice.class, RateFormat20Choice.class, RateFormat3Choice.class, RateFormat7Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType10Code.class, RateType13Code.class, RateType33Choice.class, RateType36Choice.class, RateType37Choice.class, RateType38Choice.class, RateType39Choice.class, RateType3Code.class, RateType40Choice.class, RateType41Choice.class, RateType42Choice.class, RateType5Code.class, RateType7Code.class, RateTypeAndAmountAndStatus22 .class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus25 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus27 .class, RateTypeAndAmountAndStatus28 .class, RateTypeAndAmountAndStatus29 .class, RateTypeAndPercentageRate8 .class, RateValueType7Code.class, RatioFormat17Choice.class, RatioFormat18Choice.class, RenounceableEntitlementStatusTypeFormat3Choice.class, RenounceableStatus1Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption49 .class, SecuritiesOption51 .class, SecurityDate12 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat6 .class, SignedQuantityFormat7 .class, SolicitationFeeRateFormat7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat8Choice.class, TaxableIncomePerShareCalculatedFormat3Choice.class, TemporaryFinancialInstrumentIndicator3Choice.class, TotalEligibleBalanceFormat8 .class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation3 .class, UpdatedAdditionalInformation8 .class, UpdatedURLlnformation2 .class, WithholdingTaxRateType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.06";

    public MxSeev03100106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100106(final String xml) {
        this();
        MxSeev03100106 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationV06 }
     *     
     */
    public CorporateActionNotificationV06 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationV06 }
     *     
     */
    public MxSeev03100106 setCorpActnNtfctn(CorporateActionNotificationV06 value) {
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
    public static MxSeev03100106 parse(String xml) {
        return ((MxSeev03100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100106) parserImpl.read(MxSeev03100106 .class, xml, _classes));
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
     * Creates an MxSeev03100106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100106 message
     * @return
     *     a new instance of MxSeev03100106
     */
    public static final MxSeev03100106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100106 .class);
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
