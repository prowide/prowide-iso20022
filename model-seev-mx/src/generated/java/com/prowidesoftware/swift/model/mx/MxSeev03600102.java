
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.036.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.02")
public class MxSeev03600102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV02 corpActnMvmntConf;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 36;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance11 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess3Code.class, AdditionalBusinessProcessFormat3Choice.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndQuantityRatio2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption12 .class, CashParties10 .class, CorporateActionAmounts11 .class, CorporateActionBalanceDetails2 .class, CorporateActionDate18 .class, CorporateActionDate7 .class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType5Choice.class, CorporateActionEventType7Code.class, CorporateActionGeneralInformation24 .class, CorporateActionMovementConfirmationV02 .class, CorporateActionNarrative4 .class, CorporateActionOption23 .class, CorporateActionOption3Choice.class, CorporateActionOption3Code.class, CorporateActionPeriod9 .class, CorporateActionPrice21 .class, CorporateActionPrice9 .class, CorporateActionRate20 .class, CorporateActionRate21 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode11Choice.class, DateFormat19Choice.class, DateFormat21Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType12Choice.class, FractionDispositionType1Code.class, FractionDispositionType4Choice.class, FractionDispositionType7Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat2Choice.class, GrossDividendRateType1Code.class, IdentificationSource3Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InterestRateUsedForPaymentFormat2Choice.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MxSeev03600102 .class, NameAndAddress5 .class, NetDividendRateFormat2Choice.class, NetDividendRateType1Code.class, OptionFeatures1Code.class, OptionFeaturesFormat1Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification39Choice.class, PartyIdentification40Choice.class, PartyIdentification42Choice.class, PartyIdentification46Choice.class, PartyIdentification47 .class, PartyIdentificationAndAccount51 .class, PartyIdentificationAndAccount52 .class, PartyIdentificationAndAccount54 .class, Payment1Code.class, PercentagePrice1 .class, Period5 .class, PostalAddress1 .class, PriceDetails2 .class, PriceFormat5Choice.class, PriceFormat6Choice.class, PriceFormat7Choice.class, PriceRateType3Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat5Choice.class, RateDetails2 .class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType13Choice.class, RateType17Choice.class, RateType3Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus11 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RatioFormat3Choice.class, RatioFormat4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesOption18 .class, SecurityDate6 .class, SecurityIdentification14 .class, SettlementParties15 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat2Choice.class, TaxType4Code.class, TaxVoucher2 .class, TemporaryFinancialInstrumentIndicator1Choice.class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.02";

    public MxSeev03600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600102(final String xml) {
        this();
        MxSeev03600102 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV02 }
     *     
     */
    public CorporateActionMovementConfirmationV02 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV02 }
     *     
     */
    public MxSeev03600102 setCorpActnMvmntConf(CorporateActionMovementConfirmationV02 value) {
        this.corpActnMvmntConf = value;
        return this;
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
    public static MxSeev03600102 parse(String xml) {
        return ((MxSeev03600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600102 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600102) parserImpl.read(MxSeev03600102 .class, xml, _classes));
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
     * Creates an MxSeev03600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600102 message
     * @return
     *     a new instance of MxSeev03600102
     */
    public static final MxSeev03600102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600102 .class);
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

}
