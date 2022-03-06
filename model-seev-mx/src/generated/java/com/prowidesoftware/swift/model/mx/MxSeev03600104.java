
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
 * Class for seev.036.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.04")
public class MxSeev03600104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV04 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance22 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess4Code.class, AdditionalBusinessProcessFormat7Choice.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndQuantityRatio2 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity3 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat1Choice.class, BalanceFormat3Choice.class, CashAccountIdentification5Choice.class, CashOption26 .class, CashParties10 .class, CorporateActionAmounts23 .class, CorporateActionBalanceDetails18 .class, CorporateActionDate18 .class, CorporateActionDate24 .class, CorporateActionEventReference1 .class, CorporateActionEventReference1Choice.class, CorporateActionEventType11Code.class, CorporateActionEventType12Choice.class, CorporateActionGeneralInformation50 .class, CorporateActionMovementConfirmationV04 .class, CorporateActionNarrative4 .class, CorporateActionOption11Choice.class, CorporateActionOption53 .class, CorporateActionOption8Code.class, CorporateActionPeriod9 .class, CorporateActionPrice30 .class, CorporateActionPrice39 .class, CorporateActionRate29 .class, CorporateActionRate38 .class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode11Choice.class, DateFormat19Choice.class, DateFormat21Choice.class, DateType8Code.class, DividendRateType1Code.class, DocumentIdentification13 .class, DocumentIdentification15 .class, DocumentIdentification1Choice.class, DocumentIdentification9 .class, DocumentNumber1Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FractionDispositionType11Code.class, FractionDispositionType23Choice.class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GrossDividendRateFormat10Choice.class, GrossDividendRateFormat8Choice.class, GrossDividendRateType2Code.class, GrossDividendRateType3Code.class, IdentificationSource3Choice.class, IdentificationType4Choice.class, IndicativeOrMarketPrice2Choice.class, InterestRateUsedForPaymentFormat2Choice.class, IntermediateSecuritiesDistributionTypeFormat6Choice.class, IntermediateSecurityDistributionType4Code.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MxSeev03600104 .class, NameAndAddress5 .class, NetDividendRateFormat10Choice.class, NetDividendRateFormat12Choice.class, NetDividendRateType2Code.class, NetDividendRateType3Code.class, OptionFeatures1Code.class, OptionFeaturesFormat1Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities2 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification39Choice.class, PartyIdentification40Choice.class, PartyIdentification42Choice.class, PartyIdentification46Choice.class, PartyIdentification47 .class, PartyIdentificationAndAccount51 .class, PartyIdentificationAndAccount52 .class, PartyIdentificationAndAccount54 .class, Payment1Code.class, PercentagePrice1 .class, Period5 .class, PostalAddress1 .class, PriceDetails11 .class, PriceFormat5Choice.class, PriceFormat6Choice.class, PriceFormat7Choice.class, PriceRateType3Code.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, ProprietaryQuantity2 .class, ProprietaryQuantity3 .class, Quantity2Choice.class, Quantity3Choice.class, Quantity4Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat5Choice.class, RateDetails11 .class, RateStatus1Choice.class, RateStatus1Code.class, RateType10Choice.class, RateType11Choice.class, RateType17Choice.class, RateType20Choice.class, RateType21Choice.class, RateType22Choice.class, RateType23Choice.class, RateType3Code.class, RateType6Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus11 .class, RateTypeAndAmountAndStatus13 .class, RateTypeAndAmountAndStatus14 .class, RateTypeAndAmountAndStatus15 .class, RateTypeAndAmountAndStatus16 .class, RateTypeAndAmountAndStatus3 .class, RateTypeAndAmountAndStatus5 .class, RateTypeAndAmountAndStatus6 .class, RatioFormat15Choice.class, RatioFormat3Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesOption35 .class, SecurityDate6 .class, SecurityIdentification14 .class, SettlementParties24 .class, ShortLong1Code.class, SignedQuantityFormat1 .class, SignedQuantityFormat2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCreditRateFormat2Choice.class, TaxType4Code.class, TaxVoucher2 .class, TemporaryFinancialInstrumentIndicator1Choice.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.04";

    public MxSeev03600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600104(final String xml) {
        this();
        MxSeev03600104 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV04 }
     *     
     */
    public CorporateActionMovementConfirmationV04 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV04 }
     *     
     */
    public MxSeev03600104 setCorpActnMvmntConf(CorporateActionMovementConfirmationV04 value) {
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
    public static MxSeev03600104 parse(String xml) {
        return ((MxSeev03600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev03600104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev03600104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev03600104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600104) parserImpl.read(MxSeev03600104 .class, xml, _classes));
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
     * Creates an MxSeev03600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600104 message
     * @return
     *     a new instance of MxSeev03600104
     */
    public final static MxSeev03600104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev03600104 .class);
    }

}
