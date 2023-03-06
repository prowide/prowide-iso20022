
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
 * Class for sese.026.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.026.001.09")
public class MxSese02600109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxRvslAdvc", required = true)
    protected SecuritiesSettlementTransactionReversalAdviceV09 sctiesSttlmTxRvslAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 26;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters30 .class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection44 .class, AmountAndDirection52 .class, AmountAndDirection94 .class, AutoBorrowing1Code.class, AutomaticBorrowing6Choice.class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CashAccountIdentification5Choice.class, CashParties35 .class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, ClassificationType32Choice.class, Counterparty13Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateType3Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType16Choice.class, ExposureType4Code.class, FinancialInstrumentAttributes91 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, FormOfSecurity1Code.class, FormOfSecurity6Choice.class, Frequency23Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, GenericIdentification78 .class, Identification14 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat4Choice.class, InvestorCapacity4Choice.class, LetterOfGuarantee4Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSese02600109 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, Number22Choice.class, OpeningClosing1Code.class, OpeningClosing3Choice.class, OptionStyle2Code.class, OptionStyle8Choice.class, OptionType1Code.class, OptionType6Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts40 .class, OtherIdentification1 .class, OtherParties33 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement2Code.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification136 .class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentificationAndAccount164 .class, PartyIdentificationAndAccount165 .class, PartyIdentificationAndAccount166 .class, PartyIdentificationAndAccount167 .class, PartyIdentificationAndAccount168 .class, PartyIdentificationAndAccount171 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PreConfirmation1Code.class, Price10 .class, Price7 .class, PriceRateOrAmount3Choice.class, PriceType4Choice.class, PriceValueType12Code.class, PriceValueType1Code.class, PriorityNumeric4Choice.class, Quantity6Choice.class, QuantityAndAccount77 .class, QuantityBreakdown47 .class, ReceiveDelivery1Code.class, Registration1Code.class, Registration9Choice.class, RegistrationParameters6 .class, Reporting2Code.class, Reporting6Choice.class, RepurchaseType22Choice.class, RepurchaseType9Code.class, Restriction5Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesCertificate4 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus5Choice.class, SecuritiesRTGS4Choice.class, SecuritiesSettlementTransactionReversalAdviceV09 .class, SecuritiesTradeDetails118 .class, SecuritiesTransactionType22Code.class, SecuritiesTransactionType46Choice.class, SecurityIdentification19 .class, SettlementDate17Choice.class, SettlementDate18Choice.class, SettlementDate4Code.class, SettlementDateCode7Choice.class, SettlementDetails163 .class, SettlementParties76 .class, SettlementStandingInstructionDatabase1Code.class, SettlementStandingInstructionDatabase4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlementTypeAndIdentification19 .class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, StandingSettlementInstruction16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TradeOriginator3Choice.class, TradeTransactionCondition4Code.class, TradeTransactionCondition5Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice29Choice.class, YieldedOrValueType1Choice.class, YieldedOrValueType2Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.026.001.09";

    public MxSese02600109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02600109(final String xml) {
        this();
        MxSese02600109 tmp = parse(xml);
        sctiesSttlmTxRvslAdvc = tmp.getSctiesSttlmTxRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02600109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionReversalAdviceV09 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV09 getSctiesSttlmTxRvslAdvc() {
        return sctiesSttlmTxRvslAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionReversalAdviceV09 }
     *     
     */
    public MxSese02600109 setSctiesSttlmTxRvslAdvc(SecuritiesSettlementTransactionReversalAdviceV09 value) {
        this.sctiesSttlmTxRvslAdvc = value;
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
    public static MxSese02600109 parse(String xml) {
        return ((MxSese02600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02600109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02600109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02600109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02600109 parse(String xml, MxRead parserImpl) {
        return ((MxSese02600109) parserImpl.read(MxSese02600109 .class, xml, _classes));
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
     * Creates an MxSese02600109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02600109 message
     * @return
     *     a new instance of MxSese02600109
     */
    public final static MxSese02600109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02600109 .class);
    }

}
