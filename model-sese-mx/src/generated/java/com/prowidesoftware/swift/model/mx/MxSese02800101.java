
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
 * Class for sese.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.028.001.01")
public class MxSese02800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctn", required = true)
    protected SecuritiesSettlementTransactionAllegementNotificationV01 sctiesSttlmTxAllgmtNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection4 .class, AmountAndDirection9 .class, BeneficialOwnership1Choice.class, CashAccountIdentification5Choice.class, CashParties3 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes8 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, Identification1 .class, IdentificationSource1Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, LetterOfGuarantee1Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketIdentification5 .class, MarketType2Choice.class, MarketType2Code.class, MarketType3Choice.class, MarketType5Code.class, MxSese02800101 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, OpeningClosing1Choice.class, OpeningClosing1Code.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherAmounts3 .class, OtherParties3 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification14Choice.class, PartyIdentification2 .class, PartyIdentification30Choice.class, PartyIdentificationAndAccount1 .class, PartyIdentificationAndAccount15 .class, PartyIdentificationAndAccount20 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PaymentDirection2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, QuantityAndAccount3 .class, QuantityBreakdown3 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, Reporting1Choice.class, Reporting1Code.class, RepurchaseType1Choice.class, RepurchaseType2Code.class, Restriction1Choice.class, RevaluationIndicator1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesFinancingTransactionDetails1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionAllegementNotificationV01 .class, SecuritiesTradeDetails8 .class, SecuritiesTransactionType2Choice.class, SecuritiesTransactionType3Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails5 .class, SettlementParties5 .class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition2Choice.class, SettlementTransactionCondition3Code.class, SettlementTypeAndAdditionalParameters2 .class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TransactionAndDocumentIdentification1 .class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.028.001.01";

    public MxSese02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02800101(final String xml) {
        this();
        MxSese02800101 tmp = parse(xml);
        sctiesSttlmTxAllgmtNtfctn = tmp.getSctiesSttlmTxAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementNotificationV01 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotificationV01 getSctiesSttlmTxAllgmtNtfctn() {
        return sctiesSttlmTxAllgmtNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementNotificationV01 }
     *     
     */
    public MxSese02800101 setSctiesSttlmTxAllgmtNtfctn(SecuritiesSettlementTransactionAllegementNotificationV01 value) {
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
    public static MxSese02800101 parse(String xml) {
        return ((MxSese02800101) MxReadImpl.parse(MxSese02800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02800101 parse(String xml, MxRead parserImpl) {
        return ((MxSese02800101) parserImpl.read(MxSese02800101 .class, xml, _classes));
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
     * Creates an MxSese02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02800101 message
     * @return
     *     a new instance of MxSese02800101
     */
    public final static MxSese02800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02800101 .class);
    }

}
