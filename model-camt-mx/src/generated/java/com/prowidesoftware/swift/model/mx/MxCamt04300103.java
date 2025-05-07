
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
 * Class for camt.043.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndDtldConfdCshFcstRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.043.001.03")
public class MxCamt04300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndDtldConfdCshFcstRptV03", required = true)
    protected FundDetailedConfirmedCashForecastReportV03 fndDtldConfdCshFcstRptV03;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BreakdownByCountry1 .class, BreakdownByCurrency1 .class, BreakdownByParty1 .class, BreakdownByUserDefinedParameter1 .class, CashInForecast3 .class, CashOutForecast3 .class, Charge16 .class, ChargeType10Code.class, Commission9 .class, CommissionType6Code.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashForecast4 .class, FundCashInBreakdown2 .class, FundCashOutBreakdown2 .class, FundDetailedConfirmedCashForecastReportV03 .class, GenericIdentification1 .class, InvestmentFundTransactionInType1Code.class, InvestmentFundTransactionOutType1Code.class, MessageIdentification1 .class, MxCamt04300103 .class, NameAndAddress5 .class, NetCashForecast2 .class, NetCashForecast3 .class, OrderQuantityType2Code.class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.043.001.03";

    public MxCamt04300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04300103(final String xml) {
        this();
        MxCamt04300103 tmp = parse(xml);
        fndDtldConfdCshFcstRptV03 = tmp.getFndDtldConfdCshFcstRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndDtldConfdCshFcstRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link FundDetailedConfirmedCashForecastReportV03 }
     *     
     */
    public FundDetailedConfirmedCashForecastReportV03 getFndDtldConfdCshFcstRptV03() {
        return fndDtldConfdCshFcstRptV03;
    }

    /**
     * Sets the value of the fndDtldConfdCshFcstRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundDetailedConfirmedCashForecastReportV03 }
     *     
     */
    public MxCamt04300103 setFndDtldConfdCshFcstRptV03(FundDetailedConfirmedCashForecastReportV03 value) {
        this.fndDtldConfdCshFcstRptV03 = value;
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
    public static MxCamt04300103 parse(String xml) {
        return ((MxCamt04300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04300103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04300103) parserImpl.read(MxCamt04300103 .class, xml, _classes));
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
     * Creates an MxCamt04300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04300103 message
     * @return
     *     a new instance of MxCamt04300103
     */
    public final static MxCamt04300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04300103 .class);
    }

}
