
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
 * Class for seev.031.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.002.06")
public class MxSeev03100206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotification002V06 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance39 .class, AccountIdentification10 .class, AccountIdentification36Choice.class, AdditionalBusinessProcess5Code.class, AdditionalBusinessProcessFormat12Choice.class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat10Choice.class, BalanceFormat7Choice.class, BeneficiaryCertificationType12Choice.class, BeneficiaryCertificationType4Code.class, BorrowerLendingDeadline2 .class, CapitalGainFormat4Choice.class, CashAccountIdentification6Choice.class, CashOption49 .class, CertificationFormatType1Code.class, CertificationTypeFormat4Choice.class, ClassificationType33Choice.class, ConsentType1Code.class, ConsentTypeFormat5Choice.class, ConversionType1Code.class, ConversionTypeFormat4Choice.class, CorporateAction40 .class, CorporateActionAmounts41 .class, CorporateActionBalanceDetails36 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat8Choice.class, CorporateActionDate55 .class, CorporateActionDate56 .class, CorporateActionDate58 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType3Choice.class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage3Code.class, CorporateActionEventStageFormat20Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType17Code.class, CorporateActionEventType35Choice.class, CorporateActionFrequencyType5Code.class, CorporateActionGeneralInformation103 .class, CorporateActionInformationType1Code.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionNarrative36 .class, CorporateActionNarrative39 .class, CorporateActionNarrative41 .class, CorporateActionNotification002V06 .class, CorporateActionNotification6 .class, CorporateActionNotificationType1Code.class, CorporateActionOption127 .class, CorporateActionOption23Choice.class, CorporateActionOption7Code.class, CorporateActionPeriod10 .class, CorporateActionPeriod7 .class, CorporateActionPrice65 .class, CorporateActionPrice66 .class, CorporateActionPrice67 .class, CorporateActionProcessingStatus6Choice.class, CorporateActionQuantity8 .class, CorporateActionRate77 .class, CorporateActionRate78 .class, CorporateActionRate79 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateCode26Choice.class, DateCode27Choice.class, DateCodeAndTimeFormat4 .class, DateFormat18Choice.class, DateFormat34Choice.class, DateFormat38Choice.class, DateFormat39Choice.class, DateFormat41Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType3Code.class, DistributionTypeFormat8Choice.class, DividendRateType1Code.class, DividendTypeFormat10Choice.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat4Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes70 .class, FinancialInstrumentAttributes71 .class, FinancialInstrumentAttributes73 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity21Choice.class, FinancialInstrumentQuantity22Choice.class, ForeignExchangeTerms19 .class, ForeignExchangeTerms28 .class, FractionDispositionType31Choice.class, FractionDispositionType32Choice.class, FractionDispositionType8Code.class, FractionDispositionType9Code.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat25Choice.class, GrossDividendRateFormat26Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationFormat4Choice.class, IdentificationSource4Choice.class, IndicativeOrMarketPrice11Choice.class, InformationTypeFormat5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat5Choice.class, InterestRateUsedForPaymentFormat10Choice.class, IntermediateSecuritiesDistributionTypeFormat18Choice.class, IntermediateSecurityDistributionType5Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification4Choice.class, MxSeev03100206 .class, NameAndAddress12 .class, NetDividendRateFormat27Choice.class, NetDividendRateFormat28Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator4Choice.class, OfferType3Code.class, OfferTypeFormat11Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus4Choice.class, OptionFeatures8Code.class, OptionFeaturesFormat21Choice.class, OptionStyle2Code.class, OptionStyle9Choice.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PriceDetails25 .class, PriceFormat57Choice.class, PriceFormat58Choice.class, PriceFormat59Choice.class, PriceFormat60Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, Quantity4Code.class, Quantity5Code.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat43Choice.class, RateAndAmountFormat46Choice.class, RateAndAmountFormat47Choice.class, RateAndAmountFormat48Choice.class, RateAndAmountFormat50Choice.class, RateDetails25 .class, RateFormat12Choice.class, RateFormat21Choice.class, RateFormat3Choice.class, RateFormat7Choice.class, RateStatus1Code.class, RateStatus4Choice.class, RateType10Code.class, RateType13Code.class, RateType3Code.class, RateType44Choice.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType48Choice.class, RateType49Choice.class, RateType50Choice.class, RateType51Choice.class, RateType5Code.class, RateType7Code.class, RateTypeAndAmountAndStatus30 .class, RateTypeAndAmountAndStatus31 .class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus34 .class, RateTypeAndAmountAndStatus35 .class, RateTypeAndAmountAndStatus36 .class, RateTypeAndPercentageRate9 .class, RateValueType7Code.class, RatioFormat23Choice.class, RatioFormat24Choice.class, RenounceableEntitlementStatusTypeFormat4Choice.class, RenounceableStatus1Code.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption56 .class, SecuritiesOption57 .class, SecurityDate14 .class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SolicitationFeeRateFormat10Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat10Choice.class, TaxableIncomePerShareCalculatedFormat4Choice.class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat9 .class, UpdatedAdditionalInformation10 .class, UpdatedAdditionalInformation5 .class, UpdatedAdditionalInformation6 .class, UpdatedURLlnformation3 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.031.002.06";

    public MxSeev03100206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100206(final String xml) {
        this();
        MxSeev03100206 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotification002V06 }
     *     
     */
    public CorporateActionNotification002V06 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotification002V06 }
     *     
     */
    public MxSeev03100206 setCorpActnNtfctn(CorporateActionNotification002V06 value) {
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
    public static MxSeev03100206 parse(String xml) {
        return ((MxSeev03100206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100206 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100206) parserImpl.read(MxSeev03100206 .class, xml, _classes));
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
     * Creates an MxSeev03100206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100206 message
     * @return
     *     a new instance of MxSeev03100206
     */
    public final static MxSeev03100206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100206 .class);
    }

}
