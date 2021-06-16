
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
 * Class for sese.023.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.023.001.10")
public class MxSese02300110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxInstr", required = true)
    protected SecuritiesSettlementTransactionInstructionV10 sctiesSttlmTxInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 23;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Code.class, AffirmationStatus8Choice.class, AlternatePartyIdentification7 .class, AmountAndDirection44 .class, AmountAndDirection94 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashParties36 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty13Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, DeliveryReturn1Code.class, DeliveryReturn3Choice.class, DocumentNumber5Choice.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType16Choice.class, ExposureType4Code.class, FXStandingInstruction4Choice.class, FinancialInstrumentAttributes91 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, HoldIndicator6 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LetterOfGuarantee4Choice.class, Linkages54 .class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus1Code.class, MatchingStatus27Choice.class, ModificationCancellationAllowed4Choice.class, MxSese02300110 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, NumberCount1Choice.class, OpeningClosing1Code.class, OpeningClosing3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts39 .class, OtherIdentification1 .class, OtherParties33 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity3Choice.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentificationAndAccount164 .class, PartyIdentificationAndAccount165 .class, PartyIdentificationAndAccount166 .class, PartyIdentificationAndAccount167 .class, PartyIdentificationAndAccount168 .class, PartyIdentificationAndAccount171 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, Price10 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, Quantity6Choice.class, QuantityAndAccount79 .class, QuantityBreakdown46 .class, ReceiveDelivery1Code.class, References41Choice.class, Registration10Choice.class, Registration1Code.class, Registration2Code.class, Registration9Choice.class, RegistrationParameters6 .class, RegistrationReason5 .class, Reporting2Code.class, Reporting6Choice.class, RepurchaseType10Code.class, RepurchaseType23Choice.class, Restriction5Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCertificate4 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesSettlementTransactionInstructionV10 .class, SecuritiesTradeDetails119 .class, SecuritiesTransactionType23Code.class, SecuritiesTransactionType47Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails188 .class, SettlementParties76 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition14Code.class, SettlementTransactionCondition33Choice.class, SettlementTransactionCondition5Code.class, SettlementTypeAndAdditionalParameters19 .class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TotalNumber1 .class, Tracking4Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.023.001.10";

    public MxSese02300110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02300110(final String xml) {
        this();
        MxSese02300110 tmp = parse(xml);
        sctiesSttlmTxInstr = tmp.getSctiesSttlmTxInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02300110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionInstructionV10 }
     *     
     */
    public SecuritiesSettlementTransactionInstructionV10 getSctiesSttlmTxInstr() {
        return sctiesSttlmTxInstr;
    }

    /**
     * Sets the value of the sctiesSttlmTxInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionInstructionV10 }
     *     
     */
    public MxSese02300110 setSctiesSttlmTxInstr(SecuritiesSettlementTransactionInstructionV10 value) {
        this.sctiesSttlmTxInstr = value;
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
    public static MxSese02300110 parse(String xml) {
        return ((MxSese02300110) MxReadImpl.parse(MxSese02300110 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02300110 parse(String xml, MxRead parserImpl) {
        return ((MxSese02300110) parserImpl.read(MxSese02300110 .class, xml, _classes));
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
     * Creates an MxSese02300110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02300110 message
     * @return
     *     a new instance of MxSese02300110
     */
    public final static MxSese02300110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02300110 .class);
    }

}
