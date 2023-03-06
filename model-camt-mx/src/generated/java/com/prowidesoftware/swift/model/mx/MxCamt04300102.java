
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.043.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04300102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.043.001.02")
public class MxCamt04300102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.043.001.02", required = true)
    protected Camt04300102 camt04300102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 43;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04300102 .class, CashInForecast1 .class, CashOutForecast1 .class, CashSortingCriterion2 .class, Commission4 .class, CommissionType1 .class, CommissionType5Code.class, DataFormat1Choice.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForecastParameter2 .class, FormOfSecurity1Code.class, FundCashForecast2 .class, FundCashInBreakdown1 .class, FundCashOutBreakdown1 .class, GenericIdentification1 .class, GenericIdentification2 .class, InvestmentFundTransactionInType1 .class, InvestmentFundTransactionInType3Code.class, InvestmentFundTransactionOutType1 .class, InvestmentFundTransactionOutType4Code.class, MxCamt04300102 .class, NameAndAddress5 .class, NetCashForecast1 .class, OrderQuantityType1Code.class, OriginalOrderQuantityType1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ReportParameter2Choice.class, ReportSortedType1Code.class, SecurityIdentification1Choice.class, SortCriteria1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.043.001.02";

    public MxCamt04300102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04300102(final String xml) {
        this();
        MxCamt04300102 tmp = parse(xml);
        camt04300102 = tmp.getCamt04300102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04300102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04300102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04300102 }
     *     
     */
    public Camt04300102 getCamt04300102() {
        return camt04300102;
    }

    /**
     * Sets the value of the camt04300102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04300102 }
     *     
     */
    public MxCamt04300102 setCamt04300102(Camt04300102 value) {
        this.camt04300102 = value;
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
    public static MxCamt04300102 parse(String xml) {
        return ((MxCamt04300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04300102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04300102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04300102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04300102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04300102) parserImpl.read(MxCamt04300102 .class, xml, _classes));
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
     * Creates an MxCamt04300102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04300102 message
     * @return
     *     a new instance of MxCamt04300102
     */
    public final static MxCamt04300102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04300102 .class);
    }

}
