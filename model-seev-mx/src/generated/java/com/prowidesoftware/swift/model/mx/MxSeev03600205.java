
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
 * Class for seev.036.002.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.036.002.05")
public class MxSeev03600205
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmation002V05 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance32 .class, AdditionalBusinessProcess4Code.class, AdditionalBusinessProcessFormat8Choice.class, AlternatePartyIdentification3 .class, AmountAndQuantityRatio3 .class, AmountPrice4 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, BalanceFormat4Choice.class, CashAccountIdentification6Choice.class, CashOption38 .class, CashParties12 .class, CorporateAction20 .class, CorporateActionAmounts35 .class, CorporateActionBalanceDetails28 .class, CorporateActionDate19 .class, CorporateActionDate24 .class, CorporateActionDate34 .class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventType11Code.class, CorporateActionEventType27Choice.class, CorporateActionGeneralInformation62 .class, CorporateActionMovementConfirmation002V05 .class, CorporateActionNarrative14 .class, CorporateActionOption110 .class, CorporateActionOption14Choice.class, CorporateActionOption8Code.class, CorporateActionPeriod9 .class, CorporateActionPrice36 .class, CorporateActionPrice55 .class, CorporateActionRate64 .class, CorporateActionRate65 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode12Choice.class, DateCode14Choice.class, DateFormat21Choice.class, DateFormat22Choice.class, DateFormat24Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FractionDispositionType11Code.class, FractionDispositionType24Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification51 .class, GrossDividendRateFormat11Choice.class, GrossDividendRateFormat12Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource4Choice.class, IdentificationType5Choice.class, IndicativeOrMarketPrice4Choice.class, InterestRateUsedForPaymentFormat3Choice.class, IntermediateSecuritiesDistributionTypeFormat7Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat3Choice.class, MarketIdentification2Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MxSeev03600205 .class, NameAndAddress12 .class, NetDividendRateFormat13Choice.class, NetDividendRateFormat14Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType3Code.class, OptionFeatures1Code.class, OptionFeaturesFormat3Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities4 .class, OriginalAndCurrentQuantities5 .class, OtherIdentification2 .class, PartyIdentification49 .class, PartyIdentification51Choice.class, PartyIdentification53Choice.class, PartyIdentification54Choice.class, PartyIdentification55Choice.class, PartyIdentification56Choice.class, PartyIdentificationAndAccount56 .class, PartyIdentificationAndAccount57 .class, PartyIdentificationAndAccount58 .class, Payment1Code.class, PercentagePrice1 .class, Period5 .class, PriceDetails21 .class, PriceFormat12Choice.class, PriceFormat17Choice.class, PriceFormat43Choice.class, PriceRateType3Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity6 .class, Quantity10Choice.class, Quantity15Choice.class, Quantity16Choice.class, Quantity7Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat18Choice.class, RateAndAmountFormat35Choice.class, RateAndAmountFormat6Choice.class, RateDetails21 .class, RateFormat17Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType14Choice.class, RateType18Choice.class, RateType24Choice.class, RateType25Choice.class, RateType26Choice.class, RateType27Choice.class, RateType30Choice.class, RateType3Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus17 .class, RateTypeAndAmountAndStatus18 .class, RateTypeAndAmountAndStatus19 .class, RateTypeAndAmountAndStatus20 .class, RateTypeAndAmountAndStatus21 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus9 .class, RateTypeAndPercentageRate3 .class, RatioFormat16Choice.class, RatioFormat7Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption48 .class, SecurityDate7 .class, SecurityIdentification15 .class, SettlementParties28 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SignedQuantityFormat5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat3Choice.class, TaxType4Code.class, TaxVoucher3 .class, TemporaryFinancialInstrumentIndicator2Choice.class, TotalEligibleBalanceFormat4 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.036.002.05";

    public MxSeev03600205() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600205(final String xml) {
        this();
        MxSeev03600205 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600205(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmation002V05 }
     *     
     */
    public CorporateActionMovementConfirmation002V05 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmation002V05 }
     *     
     */
    public MxSeev03600205 setCorpActnMvmntConf(CorporateActionMovementConfirmation002V05 value) {
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
    public static MxSeev03600205 parse(String xml) {
        return ((MxSeev03600205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600205 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600205) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600205 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600205 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600205) parserImpl.read(MxSeev03600205 .class, xml, _classes));
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
     * Creates an MxSeev03600205 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600205 message
     * @return
     *     a new instance of MxSeev03600205
     */
    public final static MxSeev03600205 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600205 .class);
    }

}
