
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.044.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndConfdCshFcstRptCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.044.001.03")
public class MxCamt04400103
    extends AbstractMX
{

    @XmlElement(name = "FndConfdCshFcstRptCxl", required = true)
    protected FundConfirmedCashForecastReportCancellationV03 fndConfdCshFcstRptCxl;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashInForecast6 .class, CashInOutForecast7 .class, CashOutForecast6 .class, CurrencyDesignation1 .class, CurrencyDesignation1Code.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForeignExchangeTerms19 .class, FormOfSecurity1Code.class, Fund2 .class, FundBalance1 .class, FundCashForecast7 .class, FundConfirmedCashForecastReport3 .class, FundConfirmedCashForecastReportCancellationV03 .class, GenericIdentification1 .class, GenericIdentification47 .class, IdentificationSource5Choice.class, MessageIdentification1 .class, MxCamt04400103 .class, NameAndAddress5 .class, NetCashForecast3 .class, NetCashForecast4 .class, NetCashForecast5 .class, OtherIdentification4 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceValue1 .class, SecurityIdentification3Choice.class, TypeOfPrice10Code.class, UnitPrice19 .class, UnitPriceType2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.044.001.03";

    public MxCamt04400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04400103(final String xml) {
        this();
        MxCamt04400103 tmp = parse(xml);
        fndConfdCshFcstRptCxl = tmp.getFndConfdCshFcstRptCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndConfdCshFcstRptCxl property.
     * 
     * @return
     *     possible object is
     *     {@link FundConfirmedCashForecastReportCancellationV03 }
     *     
     */
    public FundConfirmedCashForecastReportCancellationV03 getFndConfdCshFcstRptCxl() {
        return fndConfdCshFcstRptCxl;
    }

    /**
     * Sets the value of the fndConfdCshFcstRptCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundConfirmedCashForecastReportCancellationV03 }
     *     
     */
    public MxCamt04400103 setFndConfdCshFcstRptCxl(FundConfirmedCashForecastReportCancellationV03 value) {
        this.fndConfdCshFcstRptCxl = value;
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
    public static MxCamt04400103 parse(String xml) {
        return ((MxCamt04400103) MxReadImpl.parse(MxCamt04400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04400103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04400103) parserImpl.read(MxCamt04400103 .class, xml, _classes));
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
     * Creates an MxCamt04400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04400103 message
     * @return
     *     a new instance of MxCamt04400103
     */
    public final static MxCamt04400103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt04400103 .class);
    }

}
