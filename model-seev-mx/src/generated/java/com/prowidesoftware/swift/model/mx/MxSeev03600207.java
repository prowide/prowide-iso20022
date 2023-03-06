
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
 * Class for seev.036.002.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.07")
public class MxSeev03600207
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmation002V07 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance38 .class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat14Choice.class, AlternatePartyIdentification9 .class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat10Choice.class, BalanceFormat7Choice.class, CashAccountIdentification6Choice.class, CashOption46 .class, CashParties29 .class, CorporateAction36 .class, CorporateActionAmounts39 .class, CorporateActionBalanceDetails35 .class, CorporateActionDate24 .class, CorporateActionDate50 .class, CorporateActionDate52 .class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType16Code.class, CorporateActionEventType41Choice.class, CorporateActionGeneralInformation98 .class, CorporateActionMovementConfirmation002V07 .class, CorporateActionNarrative35 .class, CorporateActionOption124 .class, CorporateActionOption26Choice.class, CorporateActionOption8Code.class, CorporateActionPeriod11 .class, CorporateActionPrice63 .class, CorporateActionPrice64 .class, CorporateActionRate74 .class, CorporateActionRate75 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateFormat18Choice.class, DateFormat34Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms27 .class, FractionDispositionType11Code.class, FractionDispositionType30Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat23Choice.class, GrossDividendRateFormat24Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource4Choice.class, IdentificationType44Choice.class, IndicativeOrMarketPrice9Choice.class, InterestRateUsedForPaymentFormat9Choice.class, IntermediateSecuritiesDistributionTypeFormat17Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSeev03600207 .class, NameAndAddress12 .class, NetDividendRateFormat25Choice.class, NetDividendRateFormat26Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType6Code.class, OptionFeatures6Code.class, OptionFeaturesFormat19Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, PartyIdentification102 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification111Choice.class, PartyIdentification113Choice.class, PartyIdentificationAndAccount128 .class, PartyIdentificationAndAccount129 .class, PartyIdentificationAndAccount130 .class, Payment1Code.class, PercentagePrice1 .class, Period4 .class, PriceDetails24 .class, PriceFormat52Choice.class, PriceFormat55Choice.class, PriceFormat56Choice.class, PriceRateType3Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat43Choice.class, RateAndAmountFormat45Choice.class, RateDetails24 .class, RateStatus1Code.class, RateStatus4Choice.class, RateType3Code.class, RateType44Choice.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType48Choice.class, RateType49Choice.class, RateType50Choice.class, RateType51Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus30 .class, RateTypeAndAmountAndStatus31 .class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus34 .class, RateTypeAndAmountAndStatus35 .class, RateTypeAndAmountAndStatus36 .class, RateTypeAndPercentageRate9 .class, RatioFormat21Choice.class, RatioFormat22Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption55 .class, SecurityDate13 .class, SecurityIdentification20 .class, SettlementParties43 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SolicitationFeeRateFormat9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat9Choice.class, TaxVoucher3 .class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat9 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.07";

    public MxSeev03600207() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600207(final String xml) {
        this();
        MxSeev03600207 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600207(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmation002V07 }
     *     
     */
    public CorporateActionMovementConfirmation002V07 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmation002V07 }
     *     
     */
    public MxSeev03600207 setCorpActnMvmntConf(CorporateActionMovementConfirmation002V07 value) {
        this.corpActnMvmntConf = value;
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
    public static MxSeev03600207 parse(String xml) {
        return ((MxSeev03600207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600207 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600207) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600207 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600207 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600207) parserImpl.read(MxSeev03600207 .class, xml, _classes));
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
     * Creates an MxSeev03600207 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600207 message
     * @return
     *     a new instance of MxSeev03600207
     */
    public final static MxSeev03600207 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600207 .class);
    }

}
