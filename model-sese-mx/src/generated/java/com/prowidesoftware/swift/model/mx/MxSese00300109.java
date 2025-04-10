
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
 * Class for sese.003.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.003.001.09")
public class MxSese00300109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TrfOutConf", required = true)
    protected TransferOutConfirmationV09 trfOutConf;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 3;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account27 .class, Account31 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AlternatePartyIdentification7 .class, AlternateSecurityIdentification7 .class, BeneficiaryCertificationCompletion1Code.class, BusinessFlowType1Code.class, ChargeBasis2Choice.class, ChargeBearer1Code.class, ChargeOrCommissionDiscount1 .class, ChargeOrCommissionDiscount2 .class, ChargePaymentMethod1Choice.class, ChargePaymentMethod1Code.class, ChargeType5Choice.class, ChargeType6Choice.class, ContactIdentification2 .class, CopyInformation5 .class, DateAndDateTime2Choice.class, DeliveryParameters4 .class, DistributionPolicy1Code.class, ExemptionReason1Choice.class, Extension1 .class, Fee5 .class, Fee7 .class, Fees2 .class, FinancialInstrument88 .class, ForeignExchangeTerms37 .class, FormOfSecurity1Code.class, FundSettlementParameters15 .class, FundSettlementParameters16 .class, GenericIdentification1 .class, GenericIdentification27 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, HoldingsPlanType1Code.class, IdentificationSource1Choice.class, IdentificationType42Choice.class, IncomePreference2Code.class, Intermediary43 .class, InvestmentAccount70 .class, InvestmentFundFee1Code.class, InvestmentFundFee2Code.class, InvestmentFundRole2Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese00300109 .class, NameAndAddress4 .class, NameAndAddress5 .class, NamePrefix1Code.class, OtherAmount1 .class, OtherAmountType1Choice.class, OtherAmountType1Code.class, PartyIdentification122Choice.class, PartyIdentification123Choice.class, PartyIdentification125Choice.class, PartyIdentification139 .class, PartyIdentification141 .class, PartyIdentificationAndAccount194 .class, PartyTextInformation1 .class, PartyTextInformation6 .class, PhysicalTransferType1Code.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ReceiveInformation20 .class, Role4Choice.class, RoundingDirection2Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesAccount19 .class, SecurityIdentification25Choice.class, SettlementParties94 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, StampDutyType2Code.class, SubAccount5 .class, Tax35 .class, Tax38 .class, TaxBasis1Choice.class, TaxCalculationInformation10 .class, TaxCalculationInformation11 .class, TaxType16Code.class, TaxType17Code.class, TaxType1Choice.class, TaxType3Choice.class, TaxableIncomePerShareCalculated2Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis5Code.class, TotalFeesAndTaxes42 .class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, Transfer37 .class, TransferOutConfirmationV09 .class, TransferReason1Choice.class, TransferReason1Code.class, TypeOfIdentification1Code.class, TypeOfPrice10Code.class, TypeOfPrice46Choice.class, UKTaxGroupUnit1Code.class, Unit12 .class, UnitPrice23 .class, WaivingInstruction1Code.class, WaivingInstruction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.003.001.09";

    public MxSese00300109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese00300109(final String xml) {
        this();
        MxSese00300109 tmp = parse(xml);
        trfOutConf = tmp.getTrfOutConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese00300109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfOutConf property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutConfirmationV09 }
     *     
     */
    public TransferOutConfirmationV09 getTrfOutConf() {
        return trfOutConf;
    }

    /**
     * Sets the value of the trfOutConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutConfirmationV09 }
     *     
     */
    public MxSese00300109 setTrfOutConf(TransferOutConfirmationV09 value) {
        this.trfOutConf = value;
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
    public static MxSese00300109 parse(String xml) {
        return ((MxSese00300109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00300109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese00300109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese00300109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese00300109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese00300109 parse(String xml, MxRead parserImpl) {
        return ((MxSese00300109) parserImpl.read(MxSese00300109 .class, xml, _classes));
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
     * Creates an MxSese00300109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese00300109 message
     * @return
     *     a new instance of MxSese00300109
     */
    public static final MxSese00300109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese00300109 .class);
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
