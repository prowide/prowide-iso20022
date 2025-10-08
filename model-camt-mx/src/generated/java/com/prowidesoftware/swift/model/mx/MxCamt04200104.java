
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
 * Class for camt.042.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndDtldEstmtdCshFcstRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.042.001.04")
public class MxCamt04200104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndDtldEstmtdCshFcstRpt", required = true)
    protected FundDetailedEstimatedCashForecastReportV04 fndDtldEstmtdCshFcstRpt;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, AmountOrRate3Choice.class, BreakdownByCountry2 .class, BreakdownByCurrency2 .class, BreakdownByParty3 .class, BreakdownByUserDefinedParameter3 .class, CashInForecast5 .class, CashOutForecast5 .class, Charge26 .class, ChargeType12Code.class, ChargeType4Choice.class, Commission21 .class, CommissionType5Choice.class, CommissionType6Code.class, CurrencyDesignation1 .class, CurrencyDesignation1Code.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EstimatedFundCashForecast5 .class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForeignExchangeTerms19 .class, FormOfSecurity1Code.class, Fund3 .class, FundBalance1 .class, FundCashInBreakdown3 .class, FundCashOutBreakdown3 .class, FundDetailedEstimatedCashForecastReportV04 .class, GenericIdentification1 .class, GenericIdentification47 .class, IdentificationSource5Choice.class, InvestmentAccount42 .class, InvestmentFundTransactionInType1Choice.class, InvestmentFundTransactionInType1Code.class, InvestmentFundTransactionOutType1Choice.class, InvestmentFundTransactionOutType1Code.class, MessageIdentification1 .class, MxCamt04200104 .class, NameAndAddress5 .class, NetCashForecast3 .class, NetCashForecast4 .class, OrderQuantityType2Code.class, OtherIdentification4 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceValue1 .class, QuantityType1Choice.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, TypeOfPrice10Code.class, UnitPrice19 .class, UnitPriceType2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.042.001.04";

    public MxCamt04200104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04200104(final String xml) {
        this();
        MxCamt04200104 tmp = parse(xml);
        fndDtldEstmtdCshFcstRpt = tmp.getFndDtldEstmtdCshFcstRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04200104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndDtldEstmtdCshFcstRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundDetailedEstimatedCashForecastReportV04 }
     *     
     */
    public FundDetailedEstimatedCashForecastReportV04 getFndDtldEstmtdCshFcstRpt() {
        return fndDtldEstmtdCshFcstRpt;
    }

    /**
     * Sets the value of the fndDtldEstmtdCshFcstRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundDetailedEstimatedCashForecastReportV04 }
     *     
     */
    public MxCamt04200104 setFndDtldEstmtdCshFcstRpt(FundDetailedEstimatedCashForecastReportV04 value) {
        this.fndDtldEstmtdCshFcstRpt = value;
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
    public static MxCamt04200104 parse(String xml) {
        return ((MxCamt04200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04200104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04200104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04200104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04200104) parserImpl.read(MxCamt04200104 .class, xml, _classes));
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
     * Creates an MxCamt04200104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04200104 message
     * @return
     *     a new instance of MxCamt04200104
     */
    public final static MxCamt04200104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04200104 .class);
    }

}
