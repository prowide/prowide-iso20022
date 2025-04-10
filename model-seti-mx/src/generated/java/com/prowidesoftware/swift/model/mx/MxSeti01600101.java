
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
 * Class for seti.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "listStrkPric"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seti.016.001.01")
public class MxSeti01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ListStrkPric", required = true)
    protected ListStrikePrice listStrkPric;
    public final static transient String BUSINESS_PROCESS = "seti";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateSecurityIdentification3 .class, AmountOrPercentageRange.class, Appearance1Code.class, AssignmentMethod1Code.class, BICOrCountryCodeChoice.class, CalculationType1Code.class, CopyDuplicate1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, DateTimePeriodDetails1 .class, Debt1 .class, DistributionPolicy1Code.class, DocumentIdentification11 .class, Equity1 .class, EventGroup1 .class, EventType1Code.class, FinancialInstrumentAttributes1 .class, FinancialInstrumentProperties1Choice.class, FinancialInstrumentQuantityChoice.class, FinancialInstrumentStipulations.class, FormOfSecurity1Code.class, Frequency1Code.class, Future1 .class, GenericIdentification13 .class, GenericIdentification3 .class, InterestChange1 .class, InterestComputationMethod1Choice.class, InterestComputationMethod1Code.class, LegDetails1 .class, LegalRestrictions1Code.class, List3 .class, ListStrikePrice.class, ListStrikePriceDetails1 .class, MxSeti01600101 .class, NameAndAddress5 .class, Operation1Code.class, Operator1Code.class, Option1 .class, OptionParty1Code.class, OptionStyle1Choice.class, OptionStyle1Code.class, OptionType1Code.class, PartyIdentification12Choice.class, PostalAddress1 .class, PrePaymentSpeed1 .class, PrePaymentSpeed1Code.class, PreferenceToIncome1Code.class, Price1 .class, PriceRateOrAmountChoice.class, PriceValueType3Code.class, ProductType1Code.class, RateOrAbsoluteValue1Choice.class, Rating1 .class, SecuritiesPaymentStatus1Code.class, SecurityClassificationType1Choice.class, SecurityIdentification7 .class, SecurityStatus1Code.class, SettleStyle1Code.class, SettlementType1Code.class, Side1Code.class, StandardisationCode.class, Term1 .class, TimeUnit1Code.class, TradeTransactionCondition2Code.class, TypeOfPrice1Code.class, UnderlyingAttributes.class, UnitOrFaceAmountChoice.class, Warrant1 .class, YieldCalculation1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seti.016.001.01";

    public MxSeti01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeti01600101(final String xml) {
        this();
        MxSeti01600101 tmp = parse(xml);
        listStrkPric = tmp.getListStrkPric();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeti01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the listStrkPric property.
     * 
     * @return
     *     possible object is
     *     {@link ListStrikePrice }
     *     
     */
    public ListStrikePrice getListStrkPric() {
        return listStrkPric;
    }

    /**
     * Sets the value of the listStrkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListStrikePrice }
     *     
     */
    public MxSeti01600101 setListStrkPric(ListStrikePrice value) {
        this.listStrkPric = value;
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
    public static MxSeti01600101 parse(String xml) {
        return ((MxSeti01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeti01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeti01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeti01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeti01600101 parse(String xml, MxRead parserImpl) {
        return ((MxSeti01600101) parserImpl.read(MxSeti01600101 .class, xml, _classes));
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
     * Creates an MxSeti01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeti01600101 message
     * @return
     *     a new instance of MxSeti01600101
     */
    public final static MxSeti01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeti01600101 .class);
    }

}
