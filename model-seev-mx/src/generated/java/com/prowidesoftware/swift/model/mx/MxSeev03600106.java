
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
 * Class for seev.036.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.06")
public class MxSeev03600106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV06 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance26 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess4Code.class, AdditionalBusinessProcessFormat7Choice.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndQuantityRatio2 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BalanceFormat3Choice.class, CashAccountIdentification5Choice.class, CashOption39 .class, CashParties21 .class, CorporateAction13 .class, CorporateActionAmounts29 .class, CorporateActionBalanceDetails22 .class, CorporateActionDate18 .class, CorporateActionDate24 .class, CorporateActionDate30 .class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat6Choice.class, CorporateActionEventType11Code.class, CorporateActionEventType12Choice.class, CorporateActionGeneralInformation79 .class, CorporateActionMovementConfirmationV06 .class, CorporateActionNarrative4 .class, CorporateActionOption111 .class, CorporateActionOption11Choice.class, CorporateActionOption8Code.class, CorporateActionPeriod11 .class, CorporateActionPrice30 .class, CorporateActionPrice45 .class, CorporateActionRate46 .class, CorporateActionRate49 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode11Choice.class, DateFormat18Choice.class, DateFormat19Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType11Code.class, FractionDispositionType23Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat10Choice.class, GrossDividendRateFormat8Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource3Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InterestRateUsedForPaymentFormat2Choice.class, IntermediateSecuritiesDistributionTypeFormat5Choice.class, IntermediateSecurityDistributionType4Code.class, LotteryType1Code.class, LotteryTypeFormat1Choice.class, MarketIdentification1Choice.class, MarketIdentification78 .class, MarketType2Code.class, MarketType3Choice.class, MxSeev03600106 .class, NameAndAddress5 .class, NetDividendRateFormat10Choice.class, NetDividendRateFormat12Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, NewSecuritiesIssuanceType3Code.class, OptionFeatures1Code.class, OptionFeaturesFormat1Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification38Choice.class, PartyIdentification39Choice.class, PartyIdentification40Choice.class, PartyIdentification47 .class, PartyIdentificationAndAccount101 .class, PartyIdentificationAndAccount51 .class, PartyIdentificationAndAccount52 .class, Payment1Code.class, PercentagePrice1 .class, Period4 .class, PostalAddress1 .class, PriceDetails14 .class, PriceFormat34Choice.class, PriceFormat5Choice.class, PriceFormat6Choice.class, PriceRateType3Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat21Choice.class, RateAndAmountFormat5Choice.class, RateDetails15 .class, RateFormat11Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType17Choice.class, RateType20Choice.class, RateType21Choice.class, RateType22Choice.class, RateType23Choice.class, RateType28Choice.class, RateType3Code.class, RateType6Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus11 .class, RateTypeAndAmountAndStatus13 .class, RateTypeAndAmountAndStatus14 .class, RateTypeAndAmountAndStatus15 .class, RateTypeAndAmountAndStatus16 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RateTypeAndPercentageRate1 .class, RatioFormat15Choice.class, RatioFormat3Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesOption42 .class, SecurityDate6 .class, SecurityIdentification14 .class, SettlementParties24 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat2Choice.class, TaxType4Code.class, TaxVoucher2 .class, TemporaryFinancialInstrumentIndicator1Choice.class, TotalEligibleBalanceFormat1 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.06";

    public MxSeev03600106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600106(final String xml) {
        this();
        MxSeev03600106 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV06 }
     *     
     */
    public CorporateActionMovementConfirmationV06 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV06 }
     *     
     */
    public MxSeev03600106 setCorpActnMvmntConf(CorporateActionMovementConfirmationV06 value) {
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
    public static MxSeev03600106 parse(String xml) {
        return ((MxSeev03600106) MxReadImpl.parse(MxSeev03600106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600106 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600106) parserImpl.read(MxSeev03600106 .class, xml, _classes));
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
     * Creates an MxSeev03600106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600106 message
     * @return
     *     a new instance of MxSeev03600106
     */
    public final static MxSeev03600106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600106 .class);
    }

}
