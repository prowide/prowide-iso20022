
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
 * Class for camt.044.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndConfdCshFcstRptCxlV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.044.001.02")
public class MxCamt04400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndConfdCshFcstRptCxlV02", required = true)
    protected FundConfirmedCashForecastReportCancellationV02 fndConfdCshFcstRptCxlV02;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashInForecast4 .class, CashOutForecast4 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashForecast3 .class, FundConfirmedCashForecastReport2 .class, FundConfirmedCashForecastReportCancellationV02 .class, GenericIdentification1 .class, MessageIdentification1 .class, MxCamt04400102 .class, NameAndAddress5 .class, NetCashForecast2 .class, NetCashForecast3 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.044.001.02";

    public MxCamt04400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04400102(final String xml) {
        this();
        MxCamt04400102 tmp = parse(xml);
        fndConfdCshFcstRptCxlV02 = tmp.getFndConfdCshFcstRptCxlV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndConfdCshFcstRptCxlV02 property.
     * 
     * @return
     *     possible object is
     *     {@link FundConfirmedCashForecastReportCancellationV02 }
     *     
     */
    public FundConfirmedCashForecastReportCancellationV02 getFndConfdCshFcstRptCxlV02() {
        return fndConfdCshFcstRptCxlV02;
    }

    /**
     * Sets the value of the fndConfdCshFcstRptCxlV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundConfirmedCashForecastReportCancellationV02 }
     *     
     */
    public MxCamt04400102 setFndConfdCshFcstRptCxlV02(FundConfirmedCashForecastReportCancellationV02 value) {
        this.fndConfdCshFcstRptCxlV02 = value;
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
    public static MxCamt04400102 parse(String xml) {
        return ((MxCamt04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04400102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04400102) parserImpl.read(MxCamt04400102 .class, xml, _classes));
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
     * Creates an MxCamt04400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04400102 message
     * @return
     *     a new instance of MxCamt04400102
     */
    public static final MxCamt04400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04400102 .class);
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
