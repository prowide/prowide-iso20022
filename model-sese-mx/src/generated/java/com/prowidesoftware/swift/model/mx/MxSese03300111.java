
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
 * Class for sese.033.001.11 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.11")
public class MxSese03300111
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstructionV11 sctiesFincgInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 11;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Code.class, AffirmationStatus8Choice.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection44 .class, AmountAndDirection94 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockChainAddressWallet3 .class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashParties36 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty15Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateCode18Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber5Choice.class, Eligibility1Code.class, EventFrequency3Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentAttributes111 .class, FinancialInstrumentQuantity33Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LegalFramework1Code.class, LegalFramework3Choice.class, Linkages64 .class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, MxSese03300111 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, NumberCount2Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts39 .class, OtherIdentification1 .class, OtherParties43 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity5Choice.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentificationAndAccount164 .class, PartyIdentificationAndAccount165 .class, PartyIdentificationAndAccount171 .class, PartyIdentificationAndAccount196 .class, PartyIdentificationAndAccount197 .class, PartyIdentificationAndAccount198 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, Price10 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, Quantity51Choice.class, QuantityAndAccount95 .class, QuantityBreakdown62 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, References41Choice.class, Reporting2Code.class, Reporting6Choice.class, Restriction5Choice.class, RevaluationIndicator3Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesFinancingInstructionV11 .class, SecuritiesFinancingTransactionDetails43 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails116 .class, SecurityIdentification19 .class, SettlementDetails148 .class, SettlementParties100 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction18 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate6Choice.class, TotalNumber2 .class, Tracking4Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TransactionTypeAndAdditionalParameters15 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.11";

    public MxSese03300111() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300111(final String xml) {
        this();
        MxSese03300111 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300111(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstructionV11 }
     *     
     */
    public SecuritiesFinancingInstructionV11 getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstructionV11 }
     *     
     */
    public MxSese03300111 setSctiesFincgInstr(SecuritiesFinancingInstructionV11 value) {
        this.sctiesFincgInstr = value;
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
    public static MxSese03300111 parse(String xml) {
        return ((MxSese03300111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03300111 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03300111) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03300111 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300111 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300111) parserImpl.read(MxSese03300111 .class, xml, _classes));
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
     * Creates an MxSese03300111 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300111 message
     * @return
     *     a new instance of MxSese03300111
     */
    public final static MxSese03300111 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03300111 .class);
    }

}
