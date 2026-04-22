
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
 * Class for reda.001.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pricRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.001.001.05")
public class MxReda00100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PricRpt", required = true)
    protected PriceReportV05 pricRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference10 .class, AddressType2Code.class, AlternateSecurityIdentification7 .class, CalculationBasis2Choice.class, CalculationBasis2Code.class, Charge33 .class, ChargeType11Choice.class, ChargeType9Code.class, DateAndDateTime2Choice.class, DateFormat42Choice.class, DateOrDateTimePeriod4Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUCapitalGainType4Choice.class, EUDividendStatus1Code.class, EUDividendStatusType3Choice.class, EventFrequency1Code.class, Extension1 .class, FinancialInstrument106 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, IdentificationSource1Choice.class, MessageIdentification1 .class, MxReda00100105 .class, NameAndAddress5 .class, Pagination1 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PerformanceFactors5 .class, PostalAddress1 .class, PriceMethod1Code.class, PriceRateOrAmount3Choice.class, PriceReportFunction1Code.class, PriceReportV05 .class, PriceType2 .class, PriceType6Choice.class, PriceValuation5 .class, PriceValue1 .class, PriceValue5 .class, PriceValueChange1 .class, SecurityIdentification46Choice.class, Series1 .class, StatisticsByPredefinedTimePeriods2 .class, StatisticsByUserDefinedTimePeriod3 .class, Tax43 .class, TaxCalculationInformation12 .class, TaxType12Code.class, TaxType4Choice.class, TaxableIncomePerShareCalculated2Code.class, TaxableIncomePerShareCalculated3Choice.class, TypeOfPrice6Code.class, TypeOfPrice9Code.class, UnitPrice24 .class, ValuationStatistics4 .class, ValuationTiming1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.001.001.05";

    public MxReda00100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00100105(final String xml) {
        this();
        MxReda00100105 tmp = parse(xml);
        pricRpt = tmp.getPricRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pricRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PriceReportV05 }
     *     
     */
    public PriceReportV05 getPricRpt() {
        return pricRpt;
    }

    /**
     * Sets the value of the pricRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceReportV05 }
     *     
     */
    public MxReda00100105 setPricRpt(PriceReportV05 value) {
        this.pricRpt = value;
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
    public static MxReda00100105 parse(String xml) {
        return ((MxReda00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00100105 parse(String xml, MxRead parserImpl) {
        return ((MxReda00100105) parserImpl.read(MxReda00100105 .class, xml, _classes));
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
     * Creates an MxReda00100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00100105 message
     * @return
     *     a new instance of MxReda00100105
     */
    public static final MxReda00100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00100105 .class);
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
