
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
 * Class for seev.036.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.036.002.02")
public class MxSeev03600202
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV02Subset corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance13 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess3Code.class, AdditionalBusinessProcessFormat5Choice.class, AlternatePartyIdentification3 .class, AmountAndQuantityRatio3 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, CashAccountIdentification6Choice.class, CashOption13 .class, CashParties12 .class, CorporateActionAmounts12 .class, CorporateActionBalanceDetails6 .class, CorporateActionDate19 .class, CorporateActionDate7 .class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventType6Choice.class, CorporateActionEventType7Code.class, CorporateActionGeneralInformation29 .class, CorporateActionMovementConfirmationV02Subset.class, CorporateActionNarrative14 .class, CorporateActionOption31 .class, CorporateActionOption3Code.class, CorporateActionOption8Choice.class, CorporateActionPeriod9 .class, CorporateActionPrice12 .class, CorporateActionPrice22 .class, CorporateActionRate22 .class, CorporateActionRate23 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode12Choice.class, DateFormat21Choice.class, DateFormat22Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FractionDispositionType13Choice.class, FractionDispositionType1Code.class, FractionDispositionType7Choice.class, FractionDispositionType7Code.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GrossDividendRateFormat3Choice.class, GrossDividendRateType1Code.class, IdentificationSource3Choice.class, IdentificationSource4Choice.class, IdentificationType5Choice.class, IndicativeOrMarketPrice4Choice.class, InterestRateUsedForPaymentFormat3Choice.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType6Choice.class, MxSeev03600202 .class, NameAndAddress12 .class, NetDividendRateFormat3Choice.class, NetDividendRateType1Code.class, OptionFeatures1Code.class, OptionFeaturesFormat3Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, OtherIdentification1 .class, OtherIdentification2 .class, PartyIdentification49 .class, PartyIdentification51Choice.class, PartyIdentification53Choice.class, PartyIdentification54Choice.class, PartyIdentification55Choice.class, PartyIdentification56Choice.class, PartyIdentificationAndAccount56 .class, PartyIdentificationAndAccount57 .class, PartyIdentificationAndAccount58 .class, Payment1Code.class, PercentagePrice1 .class, Period5 .class, PriceDetails4 .class, PriceFormat12Choice.class, PriceFormat13Choice.class, PriceFormat17Choice.class, PriceRateType3Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity10Choice.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat6Choice.class, RateDetails4 .class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType14Choice.class, RateType15Choice.class, RateType16Choice.class, RateType18Choice.class, RateType3Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus12 .class, RateTypeAndAmountAndStatus2 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus8 .class, RateTypeAndAmountAndStatus9 .class, RatioFormat7Choice.class, RatioFormat8Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption20 .class, SecurityDate7 .class, SecurityIdentification14 .class, SecurityIdentification15 .class, SettlementParties16 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat3Choice.class, TaxType4Code.class, TaxVoucher3 .class, TemporaryFinancialInstrumentIndicator2Choice.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.036.002.02";

    public MxSeev03600202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600202(final String xml) {
        this();
        MxSeev03600202 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV02Subset }
     *     
     */
    public CorporateActionMovementConfirmationV02Subset getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV02Subset }
     *     
     */
    public MxSeev03600202 setCorpActnMvmntConf(CorporateActionMovementConfirmationV02Subset value) {
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
    public static MxSeev03600202 parse(String xml) {
        return ((MxSeev03600202) MxReadImpl.parse(MxSeev03600202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600202 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600202) parserImpl.read(MxSeev03600202 .class, xml, _classes));
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
     * Creates an MxSeev03600202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600202 message
     * @return
     *     a new instance of MxSeev03600202
     */
    public final static MxSeev03600202 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600202 .class);
    }

}
