
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
 * Class for sese.026.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxRvslAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.026.001.03")
public class MxSese02600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxRvslAdvc", required = true)
    protected SecuritiesSettlementTransactionReversalAdviceV03 sctiesSttlmTxRvslAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 26;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters14 .class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection7 .class, AmountAndDirection9 .class, AutoBorrowing1Code.class, AutomaticBorrowing1Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashAccountIdentification5Choice.class, CashParties9 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, Counterparty5Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, ExposureType2Code.class, ExposureType4Choice.class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification37 .class, Identification1 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InvestorCapacity1Choice.class, LetterOfGuarantee1Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification4 .class, MarketType2Code.class, MarketType3Choice.class, MxSese02600103 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, OpeningClosing1Choice.class, OpeningClosing1Code.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts18 .class, OtherIdentification1 .class, OtherParties19 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement2Code.class, PartyIdentification36Choice.class, PartyIdentification38Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification45Choice.class, PartyIdentification48 .class, PartyIdentificationAndAccount41 .class, PartyIdentificationAndAccount45 .class, PartyIdentificationAndAccount48 .class, PartyIdentificationAndAccount50 .class, PartyIdentificationAndAccount81 .class, PartyIdentificationAndAccount86 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PostalAddress1 .class, PreConfirmation1Code.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, Quantity6Choice.class, QuantityAndAccount28 .class, QuantityBreakdown16 .class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, RegistrationParameters1 .class, Reporting2Choice.class, Reporting2Code.class, RepurchaseType3Choice.class, RepurchaseType3Code.class, Restriction1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionReversalAdviceV03 .class, SecuritiesTradeDetails2 .class, SecuritiesTransactionType10Choice.class, SecuritiesTransactionType8Code.class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate3Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails45 .class, SettlementParties14 .class, SettlementStandingInstructionDatabase1Choice.class, SettlementStandingInstructionDatabase1Code.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition12Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition8Code.class, SettlementTypeAndIdentification15 .class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, StandingSettlementInstruction5 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeOriginator1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.026.001.03";

    public MxSese02600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02600103(final String xml) {
        this();
        MxSese02600103 tmp = parse(xml);
        sctiesSttlmTxRvslAdvc = tmp.getSctiesSttlmTxRvslAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxRvslAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionReversalAdviceV03 }
     *     
     */
    public SecuritiesSettlementTransactionReversalAdviceV03 getSctiesSttlmTxRvslAdvc() {
        return sctiesSttlmTxRvslAdvc;
    }

    /**
     * Sets the value of the sctiesSttlmTxRvslAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionReversalAdviceV03 }
     *     
     */
    public MxSese02600103 setSctiesSttlmTxRvslAdvc(SecuritiesSettlementTransactionReversalAdviceV03 value) {
        this.sctiesSttlmTxRvslAdvc = value;
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
    public static MxSese02600103 parse(String xml) {
        return ((MxSese02600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02600103 parse(String xml, MxRead parserImpl) {
        return ((MxSese02600103) parserImpl.read(MxSese02600103 .class, xml, _classes));
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
     * Creates an MxSese02600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02600103 message
     * @return
     *     a new instance of MxSese02600103
     */
    public static final MxSese02600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02600103 .class);
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
