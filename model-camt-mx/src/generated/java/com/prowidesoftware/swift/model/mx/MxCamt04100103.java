
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
 * Class for camt.041.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndConfdCshFcstRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.041.001.03")
public class MxCamt04100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndConfdCshFcstRptV03", required = true)
    protected FundConfirmedCashForecastReportV03 fndConfdCshFcstRptV03;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 41;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashInForecast4 .class, CashOutForecast4 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundCashForecast3 .class, FundConfirmedCashForecastReportV03 .class, GenericIdentification1 .class, MessageIdentification1 .class, MxCamt04100103 .class, NameAndAddress5 .class, NetCashForecast2 .class, NetCashForecast3 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.041.001.03";

    public MxCamt04100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04100103(final String xml) {
        this();
        MxCamt04100103 tmp = parse(xml);
        fndConfdCshFcstRptV03 = tmp.getFndConfdCshFcstRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndConfdCshFcstRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link FundConfirmedCashForecastReportV03 }
     *     
     */
    public FundConfirmedCashForecastReportV03 getFndConfdCshFcstRptV03() {
        return fndConfdCshFcstRptV03;
    }

    /**
     * Sets the value of the fndConfdCshFcstRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundConfirmedCashForecastReportV03 }
     *     
     */
    public MxCamt04100103 setFndConfdCshFcstRptV03(FundConfirmedCashForecastReportV03 value) {
        this.fndConfdCshFcstRptV03 = value;
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
    public static MxCamt04100103 parse(String xml) {
        return ((MxCamt04100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04100103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04100103) parserImpl.read(MxCamt04100103 .class, xml, _classes));
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
     * Creates an MxCamt04100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04100103 message
     * @return
     *     a new instance of MxCamt04100103
     */
    public final static MxCamt04100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04100103 .class);
    }

}
