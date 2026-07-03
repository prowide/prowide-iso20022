
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
 * Class for camt.040.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fndEstmtdCshFcstRptV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.040.001.03")
public class MxCamt04000103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FndEstmtdCshFcstRptV03", required = true)
    protected FundEstimatedCashForecastReportV03 fndEstmtdCshFcstRptV03;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 40;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CashInForecast4 .class, CashOutForecast4 .class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EstimatedFundCashForecast3 .class, Extension1 .class, FinancialInstrument9 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, FormOfSecurity1Code.class, FundEstimatedCashForecastReportV03 .class, GenericIdentification1 .class, MessageIdentification1 .class, MxCamt04000103 .class, NameAndAddress5 .class, NetCashForecast2 .class, NetCashForecast3 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, SecurityIdentification3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.040.001.03";

    public MxCamt04000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04000103(final String xml) {
        this();
        MxCamt04000103 tmp = parse(xml);
        fndEstmtdCshFcstRptV03 = tmp.getFndEstmtdCshFcstRptV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fndEstmtdCshFcstRptV03 property.
     * 
     * @return
     *     possible object is
     *     {@link FundEstimatedCashForecastReportV03 }
     *     
     */
    public FundEstimatedCashForecastReportV03 getFndEstmtdCshFcstRptV03() {
        return fndEstmtdCshFcstRptV03;
    }

    /**
     * Sets the value of the fndEstmtdCshFcstRptV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundEstimatedCashForecastReportV03 }
     *     
     */
    public MxCamt04000103 setFndEstmtdCshFcstRptV03(FundEstimatedCashForecastReportV03 value) {
        this.fndEstmtdCshFcstRptV03 = value;
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
    public static MxCamt04000103 parse(String xml) {
        return ((MxCamt04000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04000103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04000103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04000103) parserImpl.read(MxCamt04000103 .class, xml, _classes));
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
     * Creates an MxCamt04000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04000103 message
     * @return
     *     a new instance of MxCamt04000103
     */
    public final static MxCamt04000103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04000103 .class);
    }

}
