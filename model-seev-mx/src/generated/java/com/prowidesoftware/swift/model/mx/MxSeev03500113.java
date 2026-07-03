
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
 * Class for seev.035.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.13")
public class MxSeev03500113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceV13 corpActnMvmntPrlimryAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndBalance47 .class, AccountIdentification10 .class, AccountIdentification47Choice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess10Code.class, AdditionalBusinessProcessFormat18Choice.class, AddressType2Code.class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPrice6 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity10 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountPriceType3Code.class, AmountToAmountRatio2 .class, BalanceFormat11Choice.class, BalanceFormat12Choice.class, BeneficiaryCertificationType4Code.class, BeneficiaryCertificationType9Choice.class, BorrowerLendingDeadline5 .class, CashAccountIdentification5Choice.class, CashOption78 .class, ClassificationType32Choice.class, CorporateAction61 .class, CorporateActionAmounts55 .class, CorporateActionBalanceDetails43 .class, CorporateActionDate62 .class, CorporateActionDate63 .class, CorporateActionDate78 .class, CorporateActionEventProcessingType1Code.class, CorporateActionEventProcessingType2Choice.class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat14Choice.class, CorporateActionEventType32Code.class, CorporateActionEventType86Choice.class, CorporateActionGeneralInformation163 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionMovementPreliminaryAdviceV13 .class, CorporateActionNarrative29 .class, CorporateActionNarrative52 .class, CorporateActionOption15Code.class, CorporateActionOption194 .class, CorporateActionOption37Choice.class, CorporateActionPeriod12 .class, CorporateActionPreliminaryAdviceType1Code.class, CorporateActionPreliminaryAdviceType2 .class, CorporateActionPrice68 .class, CorporateActionPrice75 .class, CorporateActionQuantity12 .class, CorporateActionRate106 .class, CorporateActionRate89 .class, CorporateActionReversalReason1Code.class, CorporateActionReversalReason3 .class, CorporateActionReversalReason3Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode20Choice.class, DateCode21Choice.class, DateCodeAndTimeFormat3 .class, DateFormat43Choice.class, DateFormat44Choice.class, DateFormat45Choice.class, DateFormat46Choice.class, DateType1Code.class, DateType7Code.class, DateType8Code.class, DeemedRateType1Choice.class, DeemedRateType1Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DividendRateType1Code.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, FinancialInstrumentAttributes107 .class, FinancialInstrumentAttributes108 .class, FinancialInstrumentQuantity33Choice.class, FinancialInstrumentQuantity34Choice.class, FinancialInstrumentQuantity35Choice.class, ForeignExchangeTerms24 .class, FractionDispositionType26Choice.class, FractionDispositionType8Code.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, GrossDividendRateFormat36Choice.class, GrossDividendRateFormat38Choice.class, GrossDividendRateType6Code.class, GrossDividendRateType7Code.class, IdentificationSource3Choice.class, IndicativeOrMarketPrice7Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InterestRateUsedForPaymentFormat8Choice.class, IntermediateSecuritiesDistributionTypeFormat15Choice.class, IntermediateSecurityDistributionType5Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification3Choice.class, MxSeev03500113 .class, NameAndAddress5 .class, NetDividendRateFormat38Choice.class, NetDividendRateFormat39Choice.class, NetDividendRateType6Code.class, NetDividendRateType7Code.class, NewSecuritiesIssuanceType5Code.class, NonEligibleProceedsIndicator1Code.class, NonEligibleProceedsIndicator3Choice.class, OfferType4Code.class, OfferTypeFormat12Choice.class, OptionAvailabilityStatus1Code.class, OptionAvailabilityStatus3Choice.class, OptionFeatures11Code.class, OptionFeaturesFormat24Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification129Choice.class, Payment1Code.class, PercentagePrice1 .class, Period11 .class, Period6Choice.class, PostalAddress1 .class, PriceDetails27 .class, PriceFormat44Choice.class, PriceFormat45Choice.class, PriceFormat46Choice.class, PriceFormat61Choice.class, PriceFormat65Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, PriceValueType8Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity48Choice.class, Quantity49Choice.class, Quantity4Code.class, Quantity50Choice.class, Quantity51Choice.class, Quantity5Code.class, QuantityToQuantityRatio1 .class, Rate36 .class, RateAndAmountFormat37Choice.class, RateAndAmountFormat41Choice.class, RateAndAmountFormat42Choice.class, RateAndAmountFormat51Choice.class, RateFormat12Choice.class, RateFormat20Choice.class, RateFormat3Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType13Code.class, RateType33Choice.class, RateType36Choice.class, RateType42Choice.class, RateType5Code.class, RateType76Choice.class, RateType77Choice.class, RateType78Choice.class, RateType79Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus37 .class, RateTypeAndAmountAndStatus55 .class, RateTypeAndAmountAndStatus56 .class, RateTypeAndAmountAndStatus57 .class, RateTypeAndAmountAndStatus58 .class, RateTypeAndPercentageRate10 .class, RateTypeAndPercentageRate8 .class, RateValueType7Code.class, RatioFormat17Choice.class, RatioFormat18Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption77 .class, SecuritiesOption81 .class, SecurityDate16 .class, SecurityIdentification19 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, SolicitationFeeRateFormat7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TemporaryFinancialInstrumentIndicator3Choice.class, TotalEligibleBalanceFormat10 .class, UpdatedAdditionalInformation1 .class, UpdatedAdditionalInformation3 .class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.035.001.13";

    public MxSeev03500113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03500113(final String xml) {
        this();
        MxSeev03500113 tmp = parse(xml);
        corpActnMvmntPrlimryAdvc = tmp.getCorpActnMvmntPrlimryAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03500113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceV13 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceV13 getCorpActnMvmntPrlimryAdvc() {
        return corpActnMvmntPrlimryAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceV13 }
     *     
     */
    public MxSeev03500113 setCorpActnMvmntPrlimryAdvc(CorporateActionMovementPreliminaryAdviceV13 value) {
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
    public static MxSeev03500113 parse(String xml) {
        return ((MxSeev03500113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03500113 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03500113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03500113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03500113 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03500113) parserImpl.read(MxSeev03500113 .class, xml, _classes));
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
     * Creates an MxSeev03500113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03500113 message
     * @return
     *     a new instance of MxSeev03500113
     */
    public final static MxSeev03500113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03500113 .class);
    }

}
