
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
 * Class for seev.036.000.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.036.000.01")
public class MxSeev03600001
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV1 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 0;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess3Code.class, AdditionalBusinessProcessFormat3Choice.class, AddressType2Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountAndQuantityRatio2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, CashAccountIdentification5Choice.class, CashOption2 .class, CashParties2 .class, CopyDuplicate1Code.class, CorporateActionAmounts2 .class, CorporateActionBalanceDetails2 .class, CorporateActionDate6 .class, CorporateActionDate7 .class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType3Choice.class, CorporateActionEventType6Code.class, CorporateActionGeneralInformation4 .class, CorporateActionMovementConfirmationV1 .class, CorporateActionNarrative4 .class, CorporateActionOption3Choice.class, CorporateActionOption3Code.class, CorporateActionOption4 .class, CorporateActionPeriod4 .class, CorporateActionPrice5 .class, CorporateActionPrice9 .class, CorporateActionRate4 .class, CorporateActionRate6 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode2Choice.class, DateFormat12Choice.class, DateFormat6Choice.class, DateType6Code.class, DocumentIdentification11 .class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType1Choice.class, FractionDispositionType1Code.class, FractionDispositionType4Choice.class, FractionDispositionType4Code.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat2Choice.class, GrossDividendRateType1Code.class, IdentificationSource1Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InterestRateUsedForPaymentFormat2Choice.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MxSeev03600001 .class, NameAndAddress5 .class, NetDividendRateFormat2Choice.class, NetDividendRateType1Code.class, OptionFeatures1Code.class, OptionFeaturesFormat1Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification30Choice.class, PartyIdentification35 .class, PartyIdentificationAndAccount14 .class, PartyIdentificationAndAccount17 .class, PartyIdentificationAndAccount18 .class, Payment1Code.class, PercentagePrice1 .class, Period3 .class, PostalAddress1 .class, PriceFormat5Choice.class, PriceFormat6Choice.class, PriceFormat7Choice.class, PriceRateType3Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat5Choice.class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType13Choice.class, RateType3Code.class, RateType6Choice.class, RateType7Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus1 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus4 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RatioFormat3Choice.class, RatioFormat4Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesOption3 .class, SecurityDate1 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementParties4 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, TaxCreditRateFormat2Choice.class, TaxType4Code.class, TaxVoucher2 .class, TemporaryFinancialInstrumentIndicator1Choice.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:seev.036.000.01";

    public MxSeev03600001() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600001(final String xml) {
        this();
        MxSeev03600001 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600001(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV1 }
     *     
     */
    public CorporateActionMovementConfirmationV1 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV1 }
     *     
     */
    public MxSeev03600001 setCorpActnMvmntConf(CorporateActionMovementConfirmationV1 value) {
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
    public static MxSeev03600001 parse(String xml) {
        return ((MxSeev03600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600001 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600001) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600001 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600001 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600001) parserImpl.read(MxSeev03600001 .class, xml, _classes));
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
     * Creates an MxSeev03600001 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600001 message
     * @return
     *     a new instance of MxSeev03600001
     */
    public final static MxSeev03600001 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600001 .class);
    }

}
