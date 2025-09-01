
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seti.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "qtStsReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seti.008.001.01")
public class MxSeti00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "QtStsReq", required = true)
    protected QuoteStatusRequest qtStsReq;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, Agreement1 .class, AlternatePartyIdentification1 .class, AlternateSecurityIdentification3 .class, AmountAndDirection5 .class, AmountOrPercentageRange.class, AmountOrRate1Choice.class, Appearance1Code.class, AssignmentMethod1Code.class, BICOrCountryCodeChoice.class, BenchmarkCurve1 .class, BenchmarkCurveName1Code.class, CalculationType1Code.class, CashAccountIdentification2Choice.class, CashParties1 .class, CopyDuplicate1Code.class, CreditDebitCode.class, CurrencyAndAmount.class, Date1Choice.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, DateType1Choice.class, DateType2Code.class, Debt1 .class, DeliveryType1Code.class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Equity1 .class, EventGroup1 .class, EventType1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification3 .class, IdentificationType2Choice.class, InstrumentLeg2 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, Intermediary14 .class, LegDetails1 .class, LegSwapType1Code.class, LegalFramework1Code.class, LegalRestrictions1Code.class, MxSeti00800101 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, OtherParties1 .class, PartyIdentification12Choice.class, PartyIdentification23 .class, PartyIdentification29 .class, PartyIdentification2Choice.class, PartyIdentification3Choice.class, PartyIdentificationAndAccount10 .class, PartyIdentificationAndAccount11 .class, PartyIdentificationAndAccount12 .class, PartyIdentificationAndAccount8 .class, PartyIdentificationAndAccount9 .class, PartyRole1Choice.class, PartyTextInformation1 .class, PartyType1Code.class, PostalAddress1 .class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, ProductType1Code.class, PurposeCode1Choice.class, Quantity1Choice.class, QuoteStatusRequest.class, Rate2 .class, RateName1 .class, RateOrAbsoluteValue1Choice.class, RateOrName1Choice.class, RateType1Code.class, RateType3Choice.class, Rating1 .class, Reference6 .class, RelativeSize1Code.class, Revaluation1Choice.class, SecuritiesAccount2 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesFinancing1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesSettlement1 .class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementDate2Code.class, SettlementParties3 .class, SettlementType1Code.class, Side1Code.class, SimpleIdentificationInformation2 .class, SpreadRate1 .class, StandardisationCode.class, SubscriptionRequest.class, SubscriptionRequest1Code.class, Term1 .class, TerminationDate1Choice.class, TerminationType1Code.class, TimeUnit1Code.class, TradeTransactionCondition2Code.class, TradingSession1 .class, TypeOfIdentification1Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seti.008.001.01";

    public MxSeti00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti00800101(final String xml) {
        this();
        MxSeti00800101 tmp = parse(xml);
        qtStsReq = tmp.getQtStsReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the qtStsReq property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatusRequest }
     *     
     */
    public QuoteStatusRequest getQtStsReq() {
        return qtStsReq;
    }

    /**
     * Sets the value of the qtStsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatusRequest }
     *     
     */
    public MxSeti00800101 setQtStsReq(QuoteStatusRequest value) {
        this.qtStsReq = value;
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
    public static MxSeti00800101 parse(String xml) {
        return ((MxSeti00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeti00800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeti00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti00800101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti00800101) parserImpl.read(MxSeti00800101 .class, xml, _classes));
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
     * Creates an MxSeti00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti00800101 message
     * @return
     *     a new instance of MxSeti00800101
     */
    public final static MxSeti00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeti00800101 .class);
    }

}
