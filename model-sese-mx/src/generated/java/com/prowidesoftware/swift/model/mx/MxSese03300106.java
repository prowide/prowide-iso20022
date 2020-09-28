
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
 * Class for sese.033.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.06")
public class MxSese03300106
    extends AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstructionV06 sctiesFincgInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Code.class, AffirmationStatus8Choice.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection44 .class, AmountAndDirection46 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashParties26 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty9Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateCode18Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber5Choice.class, Eligibility1Code.class, EventFrequency3Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentAttributes64 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LegalFramework1Code.class, LegalFramework3Choice.class, Linkages37 .class, MarketClientSide4Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, MxSese03300106 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts28 .class, OtherIdentification1 .class, OtherParties27 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity3Choice.class, PartyIdentification100 .class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification75 .class, PartyIdentification92Choice.class, PartyIdentification94Choice.class, PartyIdentification98 .class, PartyIdentificationAndAccount106 .class, PartyIdentificationAndAccount107 .class, PartyIdentificationAndAccount108 .class, PartyIdentificationAndAccount109 .class, PartyIdentificationAndAccount111 .class, PartyIdentificationAndAccount112 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, Quantity6Choice.class, QuantityAndAccount39 .class, QuantityBreakdown30 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, References41Choice.class, Reporting2Code.class, Reporting6Choice.class, Restriction5Choice.class, RevaluationIndicator3Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount24 .class, SecuritiesFinancingInstructionV06 .class, SecuritiesFinancingTransactionDetails28 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesTradeDetails56 .class, SecurityIdentification19 .class, SettlementDetails97 .class, SettlementParties36 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction11 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate4Choice.class, TotalNumber1 .class, Tracking4Choice.class, TradeDate5Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TransactionTypeAndAdditionalParameters9 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.06";

    public MxSese03300106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300106(final String xml) {
        this();
        MxSese03300106 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstructionV06 }
     *     
     */
    public SecuritiesFinancingInstructionV06 getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstructionV06 }
     *     
     */
    public MxSese03300106 setSctiesFincgInstr(SecuritiesFinancingInstructionV06 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese03300106 parse(String xml) {
        return ((MxSese03300106) MxReadImpl.parse(MxSese03300106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300106 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300106) parserImpl.read(MxSese03300106 .class, xml, _classes));
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
     * Creates an MxSese03300106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300106 message
     * @return
     *     a new instance of MxSese03300106
     */
    public final static MxSese03300106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese03300106 .class);
    }

}
