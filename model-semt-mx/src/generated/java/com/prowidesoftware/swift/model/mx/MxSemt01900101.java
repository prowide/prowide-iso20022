
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
 * Class for semt.019.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.019.001.01")
public class MxSemt01900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtRpt", required = true)
    protected SecuritiesSettlementTransactionAllegementReportV01 sctiesSttlmTxAllgmtRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AllegementStatus1Choice.class, AllegementStatus1Code.class, AlternateIdentification1 .class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection4 .class, AmountAndDirection9 .class, BeneficialOwnership1Choice.class, CashAccountIdentification5Choice.class, CashParties3 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DocumentIdentification11 .class, EventFrequency3Code.class, EventFrequency4Code.class, Extension2 .class, ExtensionEnvelope1 .class, FinancialInstrumentAttributes8 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, Frequency4Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource1Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, LetterOfGuarantee1Choice.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketIdentification5 .class, MarketType2Choice.class, MarketType2Code.class, MarketType3Choice.class, MarketType5Code.class, MxSemt01900101 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, Number3Choice.class, OpeningClosing1Choice.class, OpeningClosing1Code.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherAmounts3 .class, OtherParties3 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification10Choice.class, PartyIdentification12Choice.class, PartyIdentification13Choice.class, PartyIdentification14Choice.class, PartyIdentification2 .class, PartyIdentification30Choice.class, PartyIdentificationAndAccount1 .class, PartyIdentificationAndAccount15 .class, PartyIdentificationAndAccount20 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PaymentDirection2Choice.class, PostalAddress1 .class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, QuantityAndAccount8 .class, QuantityBreakdown3 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, Reporting1Choice.class, Reporting1Code.class, RepurchaseType1Choice.class, RepurchaseType2Code.class, Restriction1Choice.class, RevaluationIndicator1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesFinancingTransactionDetails1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionAllegementReportV01 .class, SecuritiesTradeDetails4 .class, SecuritiesTransactionType2Choice.class, SecuritiesTransactionType3Code.class, SecurityIdentification11 .class, SecurityIdentification11Choice.class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails5 .class, SettlementParties5 .class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition2Choice.class, SettlementTransactionCondition3Code.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, Statement17 .class, StatementUpdateType1Code.class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.019.001.01";

    public MxSemt01900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01900101(final String xml) {
        this();
        MxSemt01900101 tmp = parse(xml);
        sctiesSttlmTxAllgmtRpt = tmp.getSctiesSttlmTxAllgmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementReportV01 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementReportV01 getSctiesSttlmTxAllgmtRpt() {
        return sctiesSttlmTxAllgmtRpt;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementReportV01 }
     *     
     */
    public MxSemt01900101 setSctiesSttlmTxAllgmtRpt(SecuritiesSettlementTransactionAllegementReportV01 value) {
        this.sctiesSttlmTxAllgmtRpt = value;
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
    public static MxSemt01900101 parse(String xml) {
        return ((MxSemt01900101) MxReadImpl.parse(MxSemt01900101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01900101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01900101) parserImpl.read(MxSemt01900101 .class, xml, _classes));
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
     * Creates an MxSemt01900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01900101 message
     * @return
     *     a new instance of MxSemt01900101
     */
    public final static MxSemt01900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01900101 .class);
    }

}
