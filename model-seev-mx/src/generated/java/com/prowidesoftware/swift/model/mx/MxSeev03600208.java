
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
 * Class for seev.036.002.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.08")
public class MxSeev03600208
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmation002V08 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance38 .class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat14Choice.class, AlternatePartyIdentification9 .class, AmountAndQuantityRatio5 .class, AmountAndRateStatus2 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity7 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat10Choice.class, BalanceFormat7Choice.class, CashAccountIdentification6Choice.class, CashOption55 .class, CashParties29 .class, CorporateAction36 .class, CorporateActionAmounts39 .class, CorporateActionBalanceDetails35 .class, CorporateActionDate24 .class, CorporateActionDate50 .class, CorporateActionDate52 .class, CorporateActionEventReference4 .class, CorporateActionEventReference4Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat15Choice.class, CorporateActionEventType21Code.class, CorporateActionEventType62Choice.class, CorporateActionGeneralInformation118 .class, CorporateActionMovementConfirmation002V08 .class, CorporateActionNarrative35 .class, CorporateActionOption136 .class, CorporateActionOption26Choice.class, CorporateActionOption8Code.class, CorporateActionPeriod11 .class, CorporateActionPrice63 .class, CorporateActionPrice64 .class, CorporateActionRate75 .class, CorporateActionRate85 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode22Choice.class, DateFormat18Choice.class, DateFormat34Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification37 .class, DocumentIdentification38 .class, DocumentIdentification4Choice.class, DocumentNumber6Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms27 .class, FractionDispositionType11Code.class, FractionDispositionType30Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, GenericIdentification86 .class, GrossDividendRateFormat23Choice.class, GrossDividendRateFormat24Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource4Choice.class, IdentificationType44Choice.class, IndicativeOrMarketPrice9Choice.class, InterestRateUsedForPaymentFormat9Choice.class, IntermediateSecuritiesDistributionTypeFormat17Choice.class, IntermediateSecurityDistributionType4Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat5Choice.class, MarketIdentification2Choice.class, MarketIdentification90 .class, MarketType16Choice.class, MarketType2Code.class, MxSeev03600208 .class, NameAndAddress12 .class, NetDividendRateFormat25Choice.class, NetDividendRateFormat26Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType6Code.class, OptionFeatures6Code.class, OptionFeaturesFormat19Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, PartyIdentification103Choice.class, PartyIdentification104Choice.class, PartyIdentification113Choice.class, PartyIdentification120 .class, PartyIdentification58Choice.class, PartyIdentificationAndAccount128 .class, PartyIdentificationAndAccount129 .class, PartyIdentificationAndAccount130 .class, Payment1Code.class, PercentagePrice1 .class, Period4 .class, PriceDetails24 .class, PriceFormat52Choice.class, PriceFormat55Choice.class, PriceFormat56Choice.class, PriceRateType3Code.class, ProcessingPosition10Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity10Choice.class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat43Choice.class, RateAndAmountFormat45Choice.class, RateDetails30 .class, RateStatus1Code.class, RateStatus4Choice.class, RateType3Code.class, RateType44Choice.class, RateType45Choice.class, RateType46Choice.class, RateType47Choice.class, RateType48Choice.class, RateType49Choice.class, RateType50Choice.class, RateType51Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus30 .class, RateTypeAndAmountAndStatus31 .class, RateTypeAndAmountAndStatus32 .class, RateTypeAndAmountAndStatus33 .class, RateTypeAndAmountAndStatus34 .class, RateTypeAndAmountAndStatus35 .class, RateTypeAndAmountAndStatus36 .class, RateTypeAndPercentageRate9 .class, RatioFormat21Choice.class, RatioFormat22Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceFormat17Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText15 .class, SafekeepingPlaceTypeAndText9 .class, SecuritiesOption63 .class, SecurityDate13 .class, SecurityIdentification20 .class, SettlementParties61 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, SolicitationFeeRateFormat9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat9Choice.class, TaxVoucher3 .class, TemporaryFinancialInstrumentIndicator4Choice.class, TotalEligibleBalanceFormat9 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.002.08";

    public MxSeev03600208() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600208(final String xml) {
        this();
        MxSeev03600208 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600208(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmation002V08 }
     *     
     */
    public CorporateActionMovementConfirmation002V08 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmation002V08 }
     *     
     */
    public MxSeev03600208 setCorpActnMvmntConf(CorporateActionMovementConfirmation002V08 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev03600208 parse(String xml) {
        return ((MxSeev03600208) MxReadImpl.parse(MxSeev03600208 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600208 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600208) parserImpl.read(MxSeev03600208 .class, xml, _classes));
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
     * Creates an MxSeev03600208 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600208 message
     * @return
     *     a new instance of MxSeev03600208
     */
    public final static MxSeev03600208 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600208 .class);
    }

}
