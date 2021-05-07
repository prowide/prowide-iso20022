
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
 * Class for seev.036.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.036.002.01")
public class MxSeev03600201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmation002V01 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account9Choice.class, AccountAndBalance6 .class, AdditionalBusinessProcess3Code.class, AdditionalBusinessProcessFormat5Choice.class, AlternateIdentification2 .class, AlternatePartyIdentification3 .class, AmountAndQuantityRatio3 .class, AmountPrice5 .class, AmountPricePerAmount3 .class, AmountPricePerFinancialInstrumentQuantity4 .class, AmountPriceType1Code.class, AmountToAmountRatio3 .class, BalanceFormat2Choice.class, CashAccountIdentification6Choice.class, CashOption9 .class, CashParties5 .class, CopyDuplicate1Code.class, CorporateActionAmounts5 .class, CorporateActionBalanceDetails6 .class, CorporateActionDate10 .class, CorporateActionDate7 .class, CorporateActionEventReference2 .class, CorporateActionEventReference2Choice.class, CorporateActionEventType4Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation16 .class, CorporateActionMovementConfirmation002V01 .class, CorporateActionNarrative14 .class, CorporateActionOption14 .class, CorporateActionOption3Code.class, CorporateActionOption8Choice.class, CorporateActionPeriod4 .class, CorporateActionPrice12 .class, CorporateActionPrice7 .class, CorporateActionRate10 .class, CorporateActionRate11 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode6Choice.class, DateFormat12Choice.class, DateFormat9Choice.class, DateType6Code.class, DocumentIdentification16 .class, DocumentIdentification17 .class, DocumentIdentification19 .class, DocumentIdentification20 .class, DocumentIdentification2Choice.class, DocumentNumber2Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FractionDispositionType1Code.class, FractionDispositionType4Code.class, FractionDispositionType6Choice.class, FractionDispositionType7Choice.class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GrossDividendRateFormat3Choice.class, GrossDividendRateType1Code.class, IdentificationSource2Choice.class, IdentificationType5Choice.class, IndicativeOrMarketPrice4Choice.class, InterestRateUsedForPaymentFormat3Choice.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType6Choice.class, MxSeev03600201 .class, NameAndAddress12 .class, NetDividendRateFormat3Choice.class, NetDividendRateType1Code.class, OptionFeatures1Code.class, OptionFeaturesFormat3Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities3 .class, OriginalAndCurrentQuantities4 .class, PartyIdentification16Choice.class, PartyIdentification17Choice.class, PartyIdentification18Choice.class, PartyIdentification31Choice.class, PartyIdentification37 .class, PartyIdentificationAndAccount22 .class, PartyIdentificationAndAccount23 .class, PartyIdentificationAndAccount24 .class, Payment1Code.class, PercentagePrice1 .class, Period3 .class, PriceFormat12Choice.class, PriceFormat13Choice.class, PriceFormat17Choice.class, PriceRateType3Code.class, ProcessingPosition3Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity10Choice.class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, QuantityToQuantityRatio2 .class, RateAndAmountFormat6Choice.class, RateStatus1Code.class, RateStatus2Choice.class, RateType12Choice.class, RateType14Choice.class, RateType15Choice.class, RateType16Choice.class, RateType3Code.class, RateType7Code.class, RateType9Choice.class, RateTypeAndAmountAndStatus10 .class, RateTypeAndAmountAndStatus2 .class, RateTypeAndAmountAndStatus7 .class, RateTypeAndAmountAndStatus8 .class, RateTypeAndAmountAndStatus9 .class, RatioFormat7Choice.class, RatioFormat8Choice.class, RestrictedFINActiveCurrencyAnd13DecimalAmount.class, RestrictedFINActiveCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SafekeepingPlaceTypeAndText5 .class, SecuritiesOption8 .class, SecurityDate3 .class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementParties8 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, TaxCreditRateFormat3Choice.class, TaxType4Code.class, TaxVoucher3 .class, TemporaryFinancialInstrumentIndicator2Choice.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.036.002.01";

    public MxSeev03600201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600201(final String xml) {
        this();
        MxSeev03600201 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmation002V01 }
     *     
     */
    public CorporateActionMovementConfirmation002V01 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmation002V01 }
     *     
     */
    public MxSeev03600201 setCorpActnMvmntConf(CorporateActionMovementConfirmation002V01 value) {
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
    public static MxSeev03600201 parse(String xml) {
        return ((MxSeev03600201) MxReadImpl.parse(MxSeev03600201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600201 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600201) parserImpl.read(MxSeev03600201 .class, xml, _classes));
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
     * Creates an MxSeev03600201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600201 message
     * @return
     *     a new instance of MxSeev03600201
     */
    public final static MxSeev03600201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600201 .class);
    }

}
