
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
 * Class for camt.043.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndDtldConfdCshFcstRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.043.001.04")
public class MxCamt04300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndDtldConfdCshFcstRpt", required = true)
    protected FundDetailedConfirmedCashForecastReportV04 fndDtldConfdCshFcstRpt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, AmountOrRate3Choice.class, BreakdownByCountry2 .class, BreakdownByCurrency2 .class, BreakdownByParty3 .class, BreakdownByUserDefinedParameter3 .class, CashInForecast5 .class, CashOutForecast5 .class, Charge26 .class, ChargeType12Code.class, ChargeType4Choice.class, Commission21 .class, CommissionType5Choice.class, CommissionType6Code.class, CurrencyDesignation1 .class, CurrencyDesignation1Code.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForeignExchangeTerms19 .class, FormOfSecurity1Code.class, Fund4 .class, FundBalance1 .class, FundCashForecast6 .class, FundCashInBreakdown3 .class, FundCashOutBreakdown3 .class, FundDetailedConfirmedCashForecastReportV04 .class, GenericIdentification1 .class, GenericIdentification47 .class, IdentificationSource5Choice.class, InvestmentAccount42 .class, InvestmentFundTransactionInType1Choice.class, InvestmentFundTransactionInType1Code.class, InvestmentFundTransactionOutType1Choice.class, InvestmentFundTransactionOutType1Code.class, MessageIdentification1 .class, MxCamt04300104 .class, NameAndAddress5 .class, NetCashForecast3 .class, NetCashForecast4 .class, OrderQuantityType2Code.class, OtherIdentification4 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceValue1 .class, QuantityType1Choice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, TypeOfPrice10Code.class, UnitPrice19 .class, UnitPriceType2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.043.001.04";

    public MxCamt04300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04300104(final String xml) {
        this();
        MxCamt04300104 tmp = parse(xml);
        fndDtldConfdCshFcstRpt = tmp.getFndDtldConfdCshFcstRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndDtldConfdCshFcstRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundDetailedConfirmedCashForecastReportV04 }
     *     
     */
    public FundDetailedConfirmedCashForecastReportV04 getFndDtldConfdCshFcstRpt() {
        return fndDtldConfdCshFcstRpt;
    }

    /**
     * Sets the value of the fndDtldConfdCshFcstRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundDetailedConfirmedCashForecastReportV04 }
     *     
     */
    public MxCamt04300104 setFndDtldConfdCshFcstRpt(FundDetailedConfirmedCashForecastReportV04 value) {
        this.fndDtldConfdCshFcstRpt = value;
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
    public static MxCamt04300104 parse(String xml) {
        return ((MxCamt04300104) MxReadImpl.parse(MxCamt04300104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04300104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04300104) parserImpl.read(MxCamt04300104 .class, xml, _classes));
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
     * Creates an MxCamt04300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04300104 message
     * @return
     *     a new instance of MxCamt04300104
     */
    public final static MxCamt04300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04300104 .class);
    }

}
