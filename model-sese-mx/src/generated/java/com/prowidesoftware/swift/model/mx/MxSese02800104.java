
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
 * Class for sese.028.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmTxAllgmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.028.001.04")
public class MxSese02800104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctn", required = true)
    protected SecuritiesSettlementTransactionAllegementNotificationV04 sctiesSttlmTxAllgmtNtfctn;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 28;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndDirection22 .class, AmountAndDirection23 .class, AmountAndDirection4 .class, BeneficialOwnership1Choice.class, CashAccountIdentification5Choice.class, CashParties11 .class, CashSettlementSystem1Choice.class, CashSettlementSystem2Code.class, ClassificationType2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateCode1Choice.class, DateType3Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, GenericIdentification37 .class, Identification1 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, LegalFramework1Choice.class, LegalFramework1Code.class, MarketClientSide1Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification3Choice.class, MarketIdentification78 .class, MarketType2Code.class, MarketType3Choice.class, MxSese02800104 .class, NameAndAddress5 .class, Number2Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherAmounts8 .class, OtherIdentification1 .class, OtherParties11 .class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification40Choice.class, PartyIdentification42Choice.class, PartyIdentification43Choice.class, PartyIdentification44Choice.class, PartyIdentification48 .class, PartyIdentificationAndAccount42 .class, PartyIdentificationAndAccount53 .class, PartyIdentificationAndAccount55 .class, PartyTextInformation1 .class, PartyTextInformation2 .class, PostalAddress1 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, QuantityAndAccount27 .class, QuantityBreakdown13 .class, Rate2 .class, RateName1 .class, RateType1Code.class, RateType5Choice.class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, RepurchaseType6Code.class, RepurchaseType8Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat3Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText3 .class, SecuritiesAccount13 .class, SecuritiesFinancingTransactionDetails7 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesSettlementTransactionAllegementNotificationV04 .class, SecuritiesTradeDetails36 .class, SecuritiesTransactionType10Code.class, SecuritiesTransactionType12Choice.class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails49 .class, SettlementParties11 .class, SettlementTransactionCondition4Code.class, SettlementTransactionCondition5Choice.class, SettlementTransactionCondition5Code.class, SettlementTypeAndAdditionalParameters2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TerminationDate2Choice.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TradeTransactionCondition1Choice.class, TradeTransactionCondition4Code.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, YieldedOrValueType1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.028.001.04";

    public MxSese02800104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02800104(final String xml) {
        this();
        MxSese02800104 tmp = parse(xml);
        sctiesSttlmTxAllgmtNtfctn = tmp.getSctiesSttlmTxAllgmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02800104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementTransactionAllegementNotificationV04 }
     *     
     */
    public SecuritiesSettlementTransactionAllegementNotificationV04 getSctiesSttlmTxAllgmtNtfctn() {
        return sctiesSttlmTxAllgmtNtfctn;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementTransactionAllegementNotificationV04 }
     *     
     */
    public MxSese02800104 setSctiesSttlmTxAllgmtNtfctn(SecuritiesSettlementTransactionAllegementNotificationV04 value) {
        this.sctiesSttlmTxAllgmtNtfctn = value;
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
    public static MxSese02800104 parse(String xml) {
        return ((MxSese02800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02800104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02800104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02800104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02800104 parse(String xml, MxRead parserImpl) {
        return ((MxSese02800104) parserImpl.read(MxSese02800104 .class, xml, _classes));
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
     * Creates an MxSese02800104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02800104 message
     * @return
     *     a new instance of MxSese02800104
     */
    public static final MxSese02800104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02800104 .class);
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
