
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
 * Class for camt.042.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt04200102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.042.001.02")
public class MxCamt04200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "camt.042.001.02", required = true)
    protected Camt04200102 camt04200102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, Camt04200102 .class, CashInForecast1 .class, CashOutForecast1 .class, CashSortingCriterion1 .class, Commission4 .class, CommissionType1 .class, CommissionType5Code.class, DataFormat1Choice.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DistributionPolicy1Code.class, EstimatedFundCashForecast2 .class, Extension1 .class, FinancialInstrument5 .class, FinancialInstrumentQuantity1 .class, FlowDirectionType1Code.class, ForecastParameter1 .class, FormOfSecurity1Code.class, FundCashInBreakdown1 .class, FundCashOutBreakdown1 .class, GenericIdentification1 .class, GenericIdentification2 .class, InvestmentFundTransactionInType1 .class, InvestmentFundTransactionInType3Code.class, InvestmentFundTransactionOutType1 .class, InvestmentFundTransactionOutType4Code.class, MxCamt04200102 .class, NameAndAddress5 .class, NetCashForecast1 .class, OrderQuantityType1Code.class, OriginalOrderQuantityType1 .class, PartyIdentification2Choice.class, PostalAddress1 .class, ReportParameter2Choice.class, ReportSortedType1Code.class, SecurityIdentification1Choice.class, SortCriteria1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.042.001.02";

    public MxCamt04200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04200102(final String xml) {
        this();
        MxCamt04200102 tmp = parse(xml);
        camt04200102 = tmp.getCamt04200102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt04200102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt04200102 }
     *     
     */
    public Camt04200102 getCamt04200102() {
        return camt04200102;
    }

    /**
     * Sets the value of the camt04200102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt04200102 }
     *     
     */
    public MxCamt04200102 setCamt04200102(Camt04200102 value) {
        this.camt04200102 = value;
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
    public static MxCamt04200102 parse(String xml) {
        return ((MxCamt04200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04200102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04200102) parserImpl.read(MxCamt04200102 .class, xml, _classes));
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
     * Creates an MxCamt04200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04200102 message
     * @return
     *     a new instance of MxCamt04200102
     */
    public final static MxCamt04200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04200102 .class);
    }

}
