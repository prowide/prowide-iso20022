
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
 * Class for camt.045.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04500101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.045.001.01")
public class MxCamt04500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.045.001.01", required = true)
    protected Camt04500101 camt04500101;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 45;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04500101 .class, CashInForecast1 .class, CashOutForecast1 .class, CashSortingCriterion2 .class, Commission4 .class, CommissionType1 .class, CommissionType5Code.class, DataFormat1Choice.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForecastParameter2 .class, FormOfSecurity1Code.class, FundCashForecast2 .class, FundCashInBreakdown1 .class, FundCashOutBreakdown1 .class, FundDetailedConfirmedCashForecastReport1 .class, GenericIdentification1 .class, GenericIdentification2 .class, InvestmentFundTransactionInType1 .class, InvestmentFundTransactionInType3Code.class, InvestmentFundTransactionOutType1 .class, InvestmentFundTransactionOutType4Code.class, MxCamt04500101 .class, NameAndAddress5 .class, NetCashForecast1 .class, OrderQuantityType1Code.class, OriginalOrderQuantityType1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ReportParameter2Choice.class, ReportSortedType1Code.class, SecurityIdentification1Choice.class, SortCriteria1Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.045.001.01";

    public MxCamt04500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04500101(final String xml) {
        this();
        MxCamt04500101 tmp = parse(xml);
        camt04500101 = tmp.getCamt04500101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04500101 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04500101 }
     *     
     */
    public Camt04500101 getCamt04500101() {
        return camt04500101;
    }

    /**
     * Sets the value of the camt04500101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04500101 }
     *     
     */
    public MxCamt04500101 setCamt04500101(Camt04500101 value) {
        this.camt04500101 = value;
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
    public static MxCamt04500101 parse(String xml) {
        return ((MxCamt04500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04500101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04500101) parserImpl.read(MxCamt04500101 .class, xml, _classes));
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
     * Creates an MxCamt04500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04500101 message
     * @return
     *     a new instance of MxCamt04500101
     */
    public static final MxCamt04500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04500101 .class);
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
