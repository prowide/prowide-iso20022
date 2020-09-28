
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.028.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.028.002.04")
public class MxSese02800204
    extends AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctn", required = true)
    protected SecuritiesSettlementTransactionAllegementNotification002V04 sctiesSttlmTxAllgmtNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AlternatePartyIdentification3 .class, AmountAndDirection13 .class, AmountAndDirection25 .class, AmountAndDirection26 .class, BeneficialOwnership2Choice.class, CashAccountIdentification6Choice.class, CashParties15 .class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, ClassificationType3Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes41 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification39 .class, Identification4 .class, IdentificationSource4Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, LegalFramework1Code.class, LegalFramework2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketIdentification82 .class, MarketType2Code.class, MarketType6Choice.class, MxSese02800204 .class, NameAndAddress12 .class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherAmounts11 .class, OtherIdentification2 .class, OtherParties16 .class, PartyIdentification51Choice.class, PartyIdentification52 .class, PartyIdentification54Choice.class, PartyIdentification55Choice.class, PartyIdentification58Choice.class, PartyIdentification60Choice.class, PartyIdentification62Choice.class, PartyIdentificationAndAccount63 .class, PartyIdentificationAndAccount69 .class, PartyIdentificationAndAccount70 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, QuantityAndAccount36 .class, QuantityBreakdown18 .class, Rate2 .class, RateName2 .class, RateType1Code.class, RateType8Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, RepurchaseType10Choice.class, RepurchaseType6Code.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesFinancingTransactionDetails9 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionAllegementNotification002V04 .class, SecuritiesTradeDetails41 .class, SecuritiesTransactionType10Code.class, SecuritiesTransactionType15Choice.class, SecurityIdentification15 .class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails58 .class, SettlementParties18 .class, SettlementTransactionCondition10Choice.class, SettlementTransactionCondition4Code.class, SettlementTransactionCondition5Code.class, SettlementTypeAndAdditionalParameters3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TerminationDate3Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.028.002.04";

    public MxSese02800204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02800204(final String xml) {
        this();
        MxSese02800204 tmp = parse(xml);
        sctiesSttlmTxAllgmtNtfctn = tmp.getSctiesSttlmTxAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02800204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementNotification002V04 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V04 getSctiesSttlmTxAllgmtNtfctn() {
        return sctiesSttlmTxAllgmtNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementNotification002V04 }
     *     
     */
    public MxSese02800204 setSctiesSttlmTxAllgmtNtfctn(SecuritiesSettlementTransactionAllegementNotification002V04 value) {
        this.sctiesSttlmTxAllgmtNtfctn = value;
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
    public static MxSese02800204 parse(String xml) {
        return ((MxSese02800204) MxReadImpl.parse(MxSese02800204 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02800204 parse(String xml, MxRead parserImpl) {
        return ((MxSese02800204) parserImpl.read(MxSese02800204 .class, xml, _classes));
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
     * Creates an MxSese02800204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02800204 message
     * @return
     *     a new instance of MxSese02800204
     */
    public final static MxSese02800204 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02800204 .class);
    }

}
