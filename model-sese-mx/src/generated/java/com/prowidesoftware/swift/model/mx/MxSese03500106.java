
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
 * Class for sese.035.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.06")
public class MxSese03500106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgConf", required = true)
    protected SecuritiesFinancingConfirmationV06 sctiesFincgConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters24 .class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection44 .class, AmountAndDirection46 .class, AmountAndDirection5 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashParties26 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty9Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode18Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes64 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LegalFramework1Code.class, LegalFramework3Choice.class, MarketClientSide4Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSese03500106 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts31 .class, OtherIdentification1 .class, OtherParties27 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement2Code.class, PartyIdentification100 .class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification75 .class, PartyIdentification92Choice.class, PartyIdentification94Choice.class, PartyIdentification98 .class, PartyIdentificationAndAccount106 .class, PartyIdentificationAndAccount107 .class, PartyIdentificationAndAccount108 .class, PartyIdentificationAndAccount109 .class, PartyIdentificationAndAccount111 .class, PartyIdentificationAndAccount112 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PreConfirmation1Code.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, Quantity6Choice.class, QuantityAndAccount40 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, ReceiveDelivery1Code.class, Reporting2Code.class, Reporting6Choice.class, Restriction5Choice.class, RevaluationIndicator3Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount24 .class, SecuritiesFinancingConfirmationV06 .class, SecuritiesFinancingTransactionDetails28 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails55 .class, SecurityIdentification19 .class, SettlementDate11Choice.class, SettlementDate4Code.class, SettlementDate9Choice.class, SettlementDateCode7Choice.class, SettlementDetails96 .class, SettlementParties36 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction11 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate4Choice.class, TradeDate5Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TransactionTypeAndAdditionalParameters10 .class, TypeOfIdentification1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.06";

    public MxSese03500106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03500106(final String xml) {
        this();
        MxSese03500106 tmp = parse(xml);
        sctiesFincgConf = tmp.getSctiesFincgConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03500106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingConfirmationV06 }
     *     
     */
    public SecuritiesFinancingConfirmationV06 getSctiesFincgConf() {
        return sctiesFincgConf;
    }

    /**
     * Sets the value of the sctiesFincgConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingConfirmationV06 }
     *     
     */
    public MxSese03500106 setSctiesFincgConf(SecuritiesFinancingConfirmationV06 value) {
        this.sctiesFincgConf = value;
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
    public static MxSese03500106 parse(String xml) {
        return ((MxSese03500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03500106 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03500106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03500106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03500106 parse(String xml, MxRead parserImpl) {
        return ((MxSese03500106) parserImpl.read(MxSese03500106 .class, xml, _classes));
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
     * Creates an MxSese03500106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03500106 message
     * @return
     *     a new instance of MxSese03500106
     */
    public final static MxSese03500106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03500106 .class);
    }

}
