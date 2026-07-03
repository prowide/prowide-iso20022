
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
 * Class for seev.031.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.02")
public class MxSeev03100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotificationV02 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance9 .class, AccountIdentification10 .class, AccountIdentification12Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess1Code.class, AdditionalBusinessProcessFormat1Choice.class, AddressType2Code.class, AmountAndQuantityRatio2 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BeneficiaryCertificationType1Choice.class, BeneficiaryCertificationType2Code.class, CapitalGainFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption10 .class, CertificationFormatType1Code.class, CertificationTypeFormat1Choice.class, ClassificationType2Choice.class, ConversionType1Code.class, ConversionTypeFormat1Choice.class, CorporateAction5 .class, CorporateActionAmounts10 .class, CorporateActionBalanceDetails1 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat1Choice.class, CorporateActionDate14 .class, CorporateActionDate15 .class, CorporateActionDate17 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingTypeChoice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventStage1Code.class, CorporateActionEventStageFormat3Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionFrequencyType2Code.class, CorporateActionGeneralInformation22 .class, CorporateActionMandatoryVoluntary1Choice.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionNarrative11 .class, CorporateActionNarrative3 .class, CorporateActionNarrative5 .class, CorporateActionNotification2 .class, CorporateActionNotificationType1Code.class, CorporateActionNotificationV02 .class, CorporateActionOption19 .class, CorporateActionOption2Choice.class, CorporateActionOption2Code.class, CorporateActionPeriod6 .class, CorporateActionPeriod7 .class, CorporateActionPrice16 .class, CorporateActionPrice17 .class, CorporateActionPrice18 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionQuantity3 .class, CorporateActionRate15 .class, CorporateActionRate16 .class, CorporateActionRate17 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode10Choice.class, DateCode11Choice.class, DateCode3Choice.class, DateCode4Choice.class, DateCodeAndTimeFormat1 .class, DateFormat11Choice.class, DateFormat16Choice.class, DateFormat18Choice.class, DateFormat19Choice.class, DateFormat20Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType1Code.class, DistributionTypeFormat1Choice.class, DividendRateType1Code.class, DividendTypeFormat3Choice.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat1Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, FinancialInstrumentAttributes16 .class, FinancialInstrumentAttributes17 .class, FinancialInstrumentAttributes19 .class, FinancialInstrumentQuantity16Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms13 .class, FractionDispositionType1Choice.class, FractionDispositionType4Code.class, FractionDispositionType5Code.class, FractionDispositionType9Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat5Choice.class, GrossDividendRateType1Code.class, IdentificationFormat1Choice.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InterestRateUsedForPaymentFormat5Choice.class, IntermediateSecuritiesDistributionTypeFormat5Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat1Choice.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03100102 .class, NameAndAddress5 .class, NetDividendRateFormat5Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Choice.class, NonEligibleProceedsIndicator1Code.class, OfferType1Code.class, OfferTypeFormat1Choice.class, OptionAvailabilityStatus1Choice.class, OptionAvailabilityStatus1Code.class, OptionFeatures3Code.class, OptionFeaturesFormat5Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification47Choice.class, PercentagePrice1 .class, Period3Choice.class, Period4 .class, PostalAddress1 .class, PriceDetails3 .class, PriceFormat19Choice.class, PriceFormat20Choice.class, PriceFormat22Choice.class, PriceFormat23Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity3Code.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat14Choice.class, RateAndAmountFormat15Choice.class, RateDetails3 .class, RateFormat3Choice.class, RateFormat5Choice.class, RateFormat6Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType13Choice.class, RateType13Code.class, RateType17Choice.class, RateType3Code.class, RateType5Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateType9Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus11 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RateValueType7Code.class, RatioFormat11Choice.class, RatioFormat12Choice.class, RenounceableEntitlementStatusTypeFormat1Choice.class, RenounceableStatus1Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption14 .class, SecuritiesOption15 .class, SecurityDate5 .class, SecurityIdentification14 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SolicitationFeeRateFormat3Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat5Choice.class, TaxType4Code.class, TaxableIncomePerShareCalculatedFormat1Choice.class, TemporaryFinancialInstrumentIndicator1Choice.class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation2 .class, UpdatedAdditionalInformation3 .class, UpdatedURLlnformation.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.031.001.02";

    public MxSeev03100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100102(final String xml) {
        this();
        MxSeev03100102 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationV02 }
     *     
     */
    public CorporateActionNotificationV02 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationV02 }
     *     
     */
    public MxSeev03100102 setCorpActnNtfctn(CorporateActionNotificationV02 value) {
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
    public static MxSeev03100102 parse(String xml) {
        return ((MxSeev03100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100102) parserImpl.read(MxSeev03100102 .class, xml, _classes));
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
     * Creates an MxSeev03100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100102 message
     * @return
     *     a new instance of MxSeev03100102
     */
    public final static MxSeev03100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100102 .class);
    }

}
