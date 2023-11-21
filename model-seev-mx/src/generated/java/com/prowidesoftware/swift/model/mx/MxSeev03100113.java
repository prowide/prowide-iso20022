
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
 * Class for seev.031.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.13")
public class MxSeev03100113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotificationV13 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance55 .class, AccountIdentification10 .class, AccountIdentification56Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess9Code.class, AdditionalBusinessProcessFormat17Choice.class, AddressType2Code.class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPrice6 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountPriceType3Code.class, AmountToAmountRatio2 .class, BalanceFormat11Choice.class, BalanceFormat12Choice.class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType9Choice.class, BidRangeType1Choice.class, BidRangeType1Code.class, BorrowerLendingDeadline5 .class, CapitalGainFormat3Choice.class, CashAccountIdentification5Choice.class, CashOption83 .class, CertificationFormatType1Code.class, CertificationTypeFormat3Choice.class, ClassificationType32Choice.class, ConsentType1Code.class, ConsentTypeFormat4Choice.class, CorporateAction68 .class, CorporateActionAmounts54 .class, CorporateActionAmounts60 .class, CorporateActionBalanceDetails43 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat5Choice.class, CorporateActionDate77 .class, CorporateActionDate83 .class, CorporateActionDate84 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType2Choice.class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat13Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType31Code.class, CorporateActionEventType84Choice.class, CorporateActionFrequencyType5Code.class, CorporateActionGeneralInformation165 .class, CorporateActionInformationType1Code.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionNarrative45 .class, CorporateActionNarrative50 .class, CorporateActionNarrative51 .class, CorporateActionNotification7 .class, CorporateActionNotificationType1Code.class, CorporateActionNotificationV13 .class, CorporateActionOption15Code.class, CorporateActionOption210 .class, CorporateActionOption37Choice.class, CorporateActionPeriod12 .class, CorporateActionPeriod15 .class, CorporateActionPrice72 .class, CorporateActionPrice73 .class, CorporateActionPrice75 .class, CorporateActionProcessingStatus5Choice.class, CorporateActionQuantity11 .class, CorporateActionRate104 .class, CorporateActionRate105 .class, CorporateActionRate112 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode20Choice.class, DateCode21Choice.class, DateCode33Choice.class, DateCodeAndTimeFormat3 .class, DateFormat30Choice.class, DateFormat43Choice.class, DateFormat44Choice.class, DateFormat45Choice.class, DateFormat57Choice.class, DateFormat59Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DateType9Code.class, DeemedRateType1Choice.class, DeemedRateType1Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType3Code.class, DistributionTypeFormat7Choice.class, DividendRateType1Code.class, DividendTypeFormat9Choice.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat3Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, EventSequenceType1Code.class, EventSequenceTypeFormat1Choice.class, FinancialInstrumentAttributes107 .class, FinancialInstrumentAttributes108 .class, FinancialInstrumentAttributes110 .class, FinancialInstrumentQuantity33Choice.class, FinancialInstrumentQuantity34Choice.class, FinancialInstrumentQuantity35Choice.class, ForeignExchangeTerms19 .class, ForeignExchangeTerms24 .class, FractionDispositionType25Choice.class, FractionDispositionType26Choice.class, FractionDispositionType8Code.class, FractionDispositionType9Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, GrossDividendRateFormat36Choice.class, GrossDividendRateFormat38Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationFormat3Choice.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice7Choice.class, InformationTypeFormat4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateUsedForPaymentFormat8Choice.class, IntermediateSecuritiesDistributionTypeFormat15Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification3Choice.class, MxSeev03100113 .class, NameAndAddress5 .class, NetDividendRateFormat38Choice.class, NetDividendRateFormat39Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator3Choice.class, OfferType4Code.class, OfferTypeFormat12Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus3Choice.class, OptionFeatures11Code.class, OptionFeaturesFormat24Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification129Choice.class, Payment2Code.class, PercentagePrice1 .class, Period11 .class, Period6Choice.class, PostalAddress1 .class, PriceDetails31 .class, PriceFormat44Choice.class, PriceFormat45Choice.class, PriceFormat46Choice.class, PriceFormat61Choice.class, PriceFormat65Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity48Choice.class, Quantity49Choice.class, Quantity4Code.class, Quantity50Choice.class, Quantity51Choice.class, Quantity5Code.class, QuantityToQuantityRatio1 .class, Rate36 .class, RateAndAmountFormat37Choice.class, RateAndAmountFormat38Choice.class, RateAndAmountFormat39Choice.class, RateAndAmountFormat41Choice.class, RateAndAmountFormat42Choice.class, RateAndAmountFormat51Choice.class, RateFormat12Choice.class, RateFormat20Choice.class, RateFormat3Choice.class, RateFormat7Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType10Code.class, RateType13Code.class, RateType33Choice.class, RateType36Choice.class, RateType42Choice.class, RateType5Code.class, RateType76Choice.class, RateType77Choice.class, RateType78Choice.class, RateType79Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus37 .class, RateTypeAndAmountAndStatus55 .class, RateTypeAndAmountAndStatus56 .class, RateTypeAndAmountAndStatus57 .class, RateTypeAndAmountAndStatus58 .class, RateTypeAndPercentageRate10 .class, RateTypeAndPercentageRate8 .class, RateValueType7Code.class, RatioFormat17Choice.class, RatioFormat18Choice.class, RenounceableEntitlementStatusTypeFormat3Choice.class, RenounceableStatus1Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption81 .class, SecuritiesOption92 .class, SecurityDate20 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, SolicitationFeeRateFormat7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxableIncomePerShareCalculatedFormat3Choice.class, TemporaryFinancialInstrumentIndicator3Choice.class, TotalEligibleBalanceFormat10 .class, UpdatedAdditionalInformation11 .class, UpdatedAdditionalInformation12 .class, UpdatedAdditionalInformation13 .class, UpdatedAdditionalInformation3 .class, UpdatedURLlnformation4 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.13";

    public MxSeev03100113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100113(final String xml) {
        this();
        MxSeev03100113 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationV13 }
     *     
     */
    public CorporateActionNotificationV13 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationV13 }
     *     
     */
    public MxSeev03100113 setCorpActnNtfctn(CorporateActionNotificationV13 value) {
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
    public static MxSeev03100113 parse(String xml) {
        return ((MxSeev03100113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100113 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100113 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100113) parserImpl.read(MxSeev03100113 .class, xml, _classes));
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
     * Creates an MxSeev03100113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100113 message
     * @return
     *     a new instance of MxSeev03100113
     */
    public final static MxSeev03100113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100113 .class);
    }

}
