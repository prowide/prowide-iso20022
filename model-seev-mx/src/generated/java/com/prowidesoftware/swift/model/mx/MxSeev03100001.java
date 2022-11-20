
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
 * Class for seev.031.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.031.000.01")
public class MxSeev03100001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnNtfctn", required = true)
    protected CorporateActionNotificationV1 corpActnNtfctn;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 31;
    public final static transient int VARIANT = 0;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance1 .class, AccountIdentification10 .class, AccountIdentification7Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess1Code.class, AdditionalBusinessProcessFormat1Choice.class, AddressType2Code.class, AlternateIdentification1 .class, AmountAndQuantityRatio2 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BeneficiaryCertificationType1Choice.class, BeneficiaryCertificationType2Code.class, CapitalGainFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption4 .class, CertificationFormatType1Code.class, CertificationTypeFormat1Choice.class, ClassificationType2Choice.class, ConversionType1Code.class, ConversionTypeFormat1Choice.class, CopyDuplicate1Code.class, CorporateAction3 .class, CorporateActionAmounts4 .class, CorporateActionBalanceDetails1 .class, CorporateActionChangeType1Code.class, CorporateActionChangeTypeFormat1Choice.class, CorporateActionDate1 .class, CorporateActionDate8 .class, CorporateActionDate9 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingTypeChoice.class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventStage1Code.class, CorporateActionEventStageFormat1Choice.class, CorporateActionEventStatus1 .class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionFrequencyType1Code.class, CorporateActionGeneralInformation11 .class, CorporateActionMandatoryVoluntary1Choice.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionNarrative11 .class, CorporateActionNarrative3 .class, CorporateActionNarrative5 .class, CorporateActionNotification2 .class, CorporateActionNotificationType1Code.class, CorporateActionNotificationV1 .class, CorporateActionOption2Choice.class, CorporateActionOption2Code.class, CorporateActionOption3 .class, CorporateActionPeriod3 .class, CorporateActionPeriod5 .class, CorporateActionPrice10 .class, CorporateActionPrice3 .class, CorporateActionPrice6 .class, CorporateActionProcessingStatus1Choice.class, CorporateActionQuantity1 .class, CorporateActionRate3 .class, CorporateActionRate5 .class, CorporateActionRate7 .class, CorporateActionTaxableIncomePerShareCalculated1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode2Choice.class, DateCode3Choice.class, DateCode4Choice.class, DateCodeAndTimeFormat1 .class, DateFormat11Choice.class, DateFormat12Choice.class, DateFormat5Choice.class, DateFormat6Choice.class, DateFormat7Choice.class, DateType1Code.class, DateType6Code.class, DateType7Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DistributionType1Code.class, DistributionTypeFormat1Choice.class, DividendTypeFormat1Choice.class, DocumentIdentification11 .class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, EUCapitalGain2Code.class, ElectionMovementType2Code.class, ElectionTypeFormat1Choice.class, EventCompletenessStatus1Code.class, EventConfirmationStatus1Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes3 .class, FinancialInstrumentAttributes5 .class, FinancialInstrumentAttributes7 .class, FinancialInstrumentQuantity1Choice.class, FinancialInstrumentQuantity2Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType1Choice.class, FractionDispositionType2Code.class, FractionDispositionType3Choice.class, FractionDispositionType4Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat1Choice.class, GrossDividendRateType1Code.class, IdentificationFormat1Choice.class, IdentificationSource1Choice.class, IndicativeOrMarketPrice1Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InterestRateUsedForPaymentFormat1Choice.class, IntermediateSecuritiesDistributionTypeFormat1Choice.class, IntermediateSecuritiesDistributionTypeFormat2Choice.class, IntermediateSecurityDistributionType2Code.class, IntermediateSecurityDistributionType3Code.class, LotteryType1Code.class, LotteryTypeFormat1Choice.class, MarketIdentification1Choice.class, MarketIdentification2 .class, MarketType3Code.class, MarketTypeFormat1Choice.class, MxSeev03100001 .class, NameAndAddress5 .class, NetDividendRateFormat1Choice.class, NetDividendRateType1Code.class, NonEligibleProceedsIndicator1Choice.class, NonEligibleProceedsIndicator1Code.class, OfferType1Code.class, OfferTypeFormat1Choice.class, OptionAvailabilityStatus1Choice.class, OptionAvailabilityStatus1Code.class, OptionFeatures2Code.class, OptionFeaturesFormat2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, PartyIdentification10Choice.class, PartyIdentification13Choice.class, PercentagePrice1 .class, Period1Choice.class, Period3 .class, PostalAddress1 .class, PriceFormat10Choice.class, PriceFormat11Choice.class, PriceFormat8Choice.class, PriceFormat9Choice.class, PriceRateType3Code.class, PriceValueType4Code.class, PriceValueType5Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity2Code.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat3Choice.class, RateAndAmountFormat4Choice.class, RateFormat2Choice.class, RateFormat3Choice.class, RateFormat5Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType12Code.class, RateType13Choice.class, RateType3Code.class, RateType5Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateType9Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RateValueType6Code.class, RatioFormat5Choice.class, RatioFormat6Choice.class, RenounceableEntitlementStatusTypeFormat1Choice.class, RenounceableStatus1Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecuritiesOption1 .class, SecuritiesOption6 .class, SecurityDate2 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SolicitationFeeRateFormat1Choice.class, TaxCreditRateFormat1Choice.class, TaxType4Code.class, TaxableIncomePerShareCalculatedFormat1Choice.class, TemporaryFinancialInstrumentIndicator1Choice.class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation2 .class, UpdatedAdditionalInformation3 .class, UpdatedURLlnformation.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.031.000.01";

    public MxSeev03100001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03100001(final String xml) {
        this();
        MxSeev03100001 tmp = parse(xml);
        corpActnNtfctn = tmp.getCorpActnNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03100001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationV1 }
     *     
     */
    public CorporateActionNotificationV1 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationV1 }
     *     
     */
    public MxSeev03100001 setCorpActnNtfctn(CorporateActionNotificationV1 value) {
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
    public static MxSeev03100001 parse(String xml) {
        return ((MxSeev03100001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03100001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03100001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03100001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03100001 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03100001) parserImpl.read(MxSeev03100001 .class, xml, _classes));
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
     * Creates an MxSeev03100001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03100001 message
     * @return
     *     a new instance of MxSeev03100001
     */
    public final static MxSeev03100001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03100001 .class);
    }

}
