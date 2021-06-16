
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
 * Class for sese.033.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.01")
public class MxSese03300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgInstr", required = true)
    protected SecuritiesFinancingInstructionV01 sctiesFincgInstr;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 33;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AffirmationStatus1Choice.class, AffirmationStatus1Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection4 .class, AmountAndDirection9 .class, AutoBorrowing1Code.class, AutomaticBorrowing1Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashAccountIdentification5Choice.class, CashParties3 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, CopyDuplicate1Code.class, Counterparty1Choice.class, CreditDebitCode.class, CurrencyToBuyOrSell1Choice.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentNumber1Choice.class, Eligibility1Code.class, EventFrequency3Code.class, Extension2 .class, ExtensionEnvelope1 .class, FXStandingInstruction1Choice.class, FinancialInstrumentAttributes8 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InvestorCapacity1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, Linkages1 .class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketIdentification5 .class, MarketType2Choice.class, MarketType2Code.class, MarketType3Choice.class, MarketType5Code.class, MatchingStatus1Choice.class, MatchingStatus1Code.class, MxSese03300101 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, NumberCount1Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts3 .class, OtherParties2 .class, OwnershipLegalRestrictions1Code.class, PairedOrTurnedQuantity1Choice.class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification2 .class, PartyIdentification30Choice.class, PartyIdentificationAndAccount1 .class, PartyIdentificationAndAccount15 .class, PartyIdentificationAndAccount19 .class, PartyIdentificationAndAccount20 .class, PartyIdentificationAndAccount21 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PaymentDirection2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, Quantity6Choice.class, QuantityAndAccount1 .class, QuantityBreakdown3 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, References1Choice.class, Reporting2Choice.class, Reporting2Code.class, Restriction1Choice.class, RevaluationIndicator1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesFinancingInstructionV01 .class, SecuritiesFinancingTransactionDetails1 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesTradeDetails3 .class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDetails3 .class, SettlementParties5 .class, SettlementStandingInstructionDatabase1Choice.class, SettlementStandingInstructionDatabase1Code.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition1Choice.class, SettlementTransactionCondition2Code.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, StandingSettlementInstruction1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, TotalNumber1 .class, Tracking1Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeOriginator1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TransactionAndDocumentIdentification1 .class, TransactionTypeAndAdditionalParameters1 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.033.001.01";

    public MxSese03300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03300101(final String xml) {
        this();
        MxSese03300101 tmp = parse(xml);
        sctiesFincgInstr = tmp.getSctiesFincgInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingInstructionV01 }
     *     
     */
    public SecuritiesFinancingInstructionV01 getSctiesFincgInstr() {
        return sctiesFincgInstr;
    }

    /**
     * Sets the value of the sctiesFincgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingInstructionV01 }
     *     
     */
    public MxSese03300101 setSctiesFincgInstr(SecuritiesFinancingInstructionV01 value) {
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
    public static MxSese03300101 parse(String xml) {
        return ((MxSese03300101) MxReadImpl.parse(MxSese03300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03300101 parse(String xml, MxRead parserImpl) {
        return ((MxSese03300101) parserImpl.read(MxSese03300101 .class, xml, _classes));
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
     * Creates an MxSese03300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03300101 message
     * @return
     *     a new instance of MxSese03300101
     */
    public final static MxSese03300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03300101 .class);
    }

}
