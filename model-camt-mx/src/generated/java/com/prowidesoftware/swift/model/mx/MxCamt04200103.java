
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
 * Class for camt.042.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndDtldEstmtdCshFcstRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.042.001.03")
public class MxCamt04200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndDtldEstmtdCshFcstRptV03", required = true)
    protected FundDetailedEstimatedCashForecastReportV03 fndDtldEstmtdCshFcstRptV03;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalParameters1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BreakdownByCountry1 .class, BreakdownByCurrency1 .class, BreakdownByParty1 .class, BreakdownByUserDefinedParameter1 .class, CashInForecast3 .class, CashOutForecast3 .class, Charge16 .class, ChargeType10Code.class, Commission9 .class, CommissionType6Code.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EstimatedFundCashForecast4 .class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashInBreakdown2 .class, FundCashOutBreakdown2 .class, FundDetailedEstimatedCashForecastReportV03 .class, GenericIdentification1 .class, InvestmentFundTransactionInType1Code.class, InvestmentFundTransactionOutType1Code.class, MessageIdentification1 .class, MxCamt04200103 .class, NameAndAddress5 .class, NetCashForecast2 .class, NetCashForecast3 .class, OrderQuantityType2Code.class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.042.001.03";

    public MxCamt04200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04200103(final String xml) {
        this();
        MxCamt04200103 tmp = parse(xml);
        fndDtldEstmtdCshFcstRptV03 = tmp.getFndDtldEstmtdCshFcstRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndDtldEstmtdCshFcstRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link FundDetailedEstimatedCashForecastReportV03 }
     *     
     */
    public FundDetailedEstimatedCashForecastReportV03 getFndDtldEstmtdCshFcstRptV03() {
        return fndDtldEstmtdCshFcstRptV03;
    }

    /**
     * Sets the value of the fndDtldEstmtdCshFcstRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundDetailedEstimatedCashForecastReportV03 }
     *     
     */
    public MxCamt04200103 setFndDtldEstmtdCshFcstRptV03(FundDetailedEstimatedCashForecastReportV03 value) {
        this.fndDtldEstmtdCshFcstRptV03 = value;
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
    public static MxCamt04200103 parse(String xml) {
        return ((MxCamt04200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04200103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04200103) parserImpl.read(MxCamt04200103 .class, xml, _classes));
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
     * Creates an MxCamt04200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04200103 message
     * @return
     *     a new instance of MxCamt04200103
     */
    public static final MxCamt04200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04200103 .class);
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
