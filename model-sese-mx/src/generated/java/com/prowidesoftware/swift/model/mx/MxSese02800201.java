
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
 * Class for sese.028.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.028.002.01")
public class MxSese02800201
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctn", required = true)
    protected SecuritiesSettlementTransactionAllegementNotification002V01 sctiesSttlmTxAllgmtNtfctn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 28;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AlternateIdentification2 .class, AlternatePartyIdentification3 .class, AmountAndDirection13 .class, AmountAndDirection16 .class, AmountAndDirection17 .class, BeneficialOwnership2Choice.class, CashAccountIdentification6Choice.class, CashParties4 .class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, ClassificationType3Choice.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode5Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes14 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms12 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, Identification4 .class, IdentificationSource2Choice.class, IdentificationType5Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, LegalFramework1Code.class, LegalFramework2Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketIdentification9 .class, MarketType2Code.class, MarketType5Choice.class, MarketType5Code.class, MarketType6Choice.class, MxSese02800201 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, Number4Choice.class, OpeningClosing1Code.class, OpeningClosing2Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OtherAmounts7 .class, OtherParties5 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification15Choice.class, PartyIdentification16Choice.class, PartyIdentification17Choice.class, PartyIdentification18Choice.class, PartyIdentification31Choice.class, PartyIdentification4 .class, PartyIdentificationAndAccount26 .class, PartyIdentificationAndAccount27 .class, PartyIdentificationAndAccount29 .class, PartyTextInformation3 .class, PartyTextInformation4 .class, PaymentDirection3Choice.class, PreferenceToIncome1Code.class, PreferenceToIncome3Choice.class, Price3 .class, PriceRateOrAmount1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PriorityNumeric2Choice.class, QuantityAndAccount4 .class, QuantityBreakdown7 .class, Rate2 .class, RateName2 .class, RateOrName2Choice.class, RateType1Code.class, RateType8Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Reporting1Code.class, Reporting4Choice.class, RepurchaseType2Code.class, RepurchaseType4Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, RevaluationIndicator2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesCertificate2 .class, SecuritiesFinancingTransactionDetails4 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecuritiesRTGS2Choice.class, SecuritiesSettlementTransactionAllegementNotification002V01 .class, SecuritiesTradeDetails9 .class, SecuritiesTransactionType3Code.class, SecuritiesTransactionType5Choice.class, SecurityIdentification12 .class, SecurityIdentification12Choice.class, SettlementDate4Choice.class, SettlementDate4Code.class, SettlementDateCode3Choice.class, SettlementDetails15 .class, SettlementParties7 .class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition3Code.class, SettlementTransactionCondition4Choice.class, SettlementTypeAndAdditionalParameters3 .class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TerminationDate3Choice.class, TradeDate2Choice.class, TradeDateCode2Choice.class, TradeTransactionCondition2Choice.class, TradeTransactionCondition4Code.class, TransactionAndDocumentIdentification2 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.028.002.01";

    public MxSese02800201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02800201(final String xml) {
        this();
        MxSese02800201 tmp = parse(xml);
        sctiesSttlmTxAllgmtNtfctn = tmp.getSctiesSttlmTxAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02800201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementNotification002V01 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotification002V01 getSctiesSttlmTxAllgmtNtfctn() {
        return sctiesSttlmTxAllgmtNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementNotification002V01 }
     *     
     */
    public MxSese02800201 setSctiesSttlmTxAllgmtNtfctn(SecuritiesSettlementTransactionAllegementNotification002V01 value) {
        this.sctiesSttlmTxAllgmtNtfctn = value;
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
    public static MxSese02800201 parse(String xml) {
        return ((MxSese02800201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02800201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02800201 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02800201) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02800201 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02800201 parse(String xml, MxRead parserImpl) {
        return ((MxSese02800201) parserImpl.read(MxSese02800201 .class, xml, _classes));
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
     * Creates an MxSese02800201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02800201 message
     * @return
     *     a new instance of MxSese02800201
     */
    public static final MxSese02800201 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02800201 .class);
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
