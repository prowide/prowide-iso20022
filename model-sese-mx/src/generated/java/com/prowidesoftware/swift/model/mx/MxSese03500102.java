
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
 * Class for sese.035.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.02")
public class MxSese03500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgConf", required = true)
    protected SecuritiesFinancingConfirmationV02 sctiesFincgConf;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 35;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters2 .class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndDirection2 .class, AmountAndDirection4 .class, AmountAndDirection5 .class, AmountAndDirection9 .class, AutoBorrowing1Code.class, AutomaticBorrowing1Choice.class, BeneficialOwnership1Choice.class, BlockTrade1Choice.class, BlockTrade1Code.class, CashAccountIdentification5Choice.class, CashParties7 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility1Choice.class, ClassificationType2Choice.class, Counterparty3Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, Eligibility1Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes20 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, InvestorCapacity1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification4 .class, MarketIdentification5 .class, MarketType2Choice.class, MarketType2Code.class, MarketType3Choice.class, MarketType5Code.class, MxSese03500102 .class, NameAndAddress5 .class, NettingEligibility1Choice.class, Number2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OriginalAndCurrentQuantities1 .class, OriginatorRole2Code.class, OtherAmounts4 .class, OtherIdentification1 .class, OtherParties9 .class, OwnershipLegalRestrictions1Code.class, PartialSettlement1Code.class, PartyIdentification36Choice.class, PartyIdentification38Choice.class, PartyIdentification44Choice.class, PartyIdentification48 .class, PartyIdentification49Choice.class, PartyIdentificationAndAccount35 .class, PartyIdentificationAndAccount36 .class, PartyIdentificationAndAccount37 .class, PartyIdentificationAndAccount38 .class, PartyIdentificationAndAccount50 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PaymentDirection2Choice.class, PostalAddress1 .class, PreConfirmation1Code.class, PreferenceToIncome1Code.class, PreferenceToIncome2Choice.class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, PriorityNumeric1Choice.class, Quantity6Choice.class, QuantityAndAccount18 .class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType5Choice.class, ReceiveDelivery1Code.class, Reporting2Choice.class, Reporting2Code.class, Restriction1Choice.class, RevaluationIndicator1Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesFinancingConfirmationV02 .class, SecuritiesFinancingTransactionDetails3 .class, SecuritiesFinancingTransactionType1Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesTradeDetails6 .class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate3Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails30 .class, SettlementParties10 .class, SettlementStandingInstructionDatabase1Choice.class, SettlementStandingInstructionDatabase1Code.class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition7Choice.class, SettlingCapacity1Choice.class, SettlingCapacity1Code.class, StandingSettlementInstruction3 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TerminationDate2Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeOriginator1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TransactionTypeAndAdditionalParameters3 .class, TypeOfIdentification1Code.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.035.001.02";

    public MxSese03500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03500102(final String xml) {
        this();
        MxSese03500102 tmp = parse(xml);
        sctiesFincgConf = tmp.getSctiesFincgConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgConf property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingConfirmationV02 }
     *     
     */
    public SecuritiesFinancingConfirmationV02 getSctiesFincgConf() {
        return sctiesFincgConf;
    }

    /**
     * Sets the value of the sctiesFincgConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingConfirmationV02 }
     *     
     */
    public MxSese03500102 setSctiesFincgConf(SecuritiesFinancingConfirmationV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese03500102 parse(String xml) {
        return ((MxSese03500102) MxReadImpl.parse(MxSese03500102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03500102 parse(String xml, MxRead parserImpl) {
        return ((MxSese03500102) parserImpl.read(MxSese03500102 .class, xml, _classes));
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
     * Creates an MxSese03500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03500102 message
     * @return
     *     a new instance of MxSese03500102
     */
    public final static MxSese03500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03500102 .class);
    }

}
