
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
 * Class for auth.013.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktUscrdMktSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.013.001.01")
public class MxAuth01300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktUscrdMktSttstclRpt", required = true)
    protected MoneyMarketUnsecuredMarketStatisticalReportV01 mnyMktUscrdMktSttstclRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, BrokeredDeal1Code.class, CounterpartyIdentification2Choice.class, DateAndDateTimeChoice.class, DateTimePeriod1 .class, FinancialInstrumentProductType1Code.class, FloatingRateNote2 .class, InterestRateType1Code.class, MoneyMarketReportHeader1 .class, MoneyMarketTransactionType1Code.class, MoneyMarketUnsecuredMarketStatisticalReportV01 .class, MxAuth01300101 .class, NameOrSector1Choice.class, Option12 .class, OptionDateOrPeriod1Choice.class, OptionType1Code.class, Rate2 .class, ReportPeriodActivity1Code.class, ReportedPartyIdentification1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType1Code.class, UnsecuredMarketReport3Choice.class, UnsecuredMarketTransaction3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.013.001.01";

    public MxAuth01300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01300101(final String xml) {
        this();
        MxAuth01300101 tmp = parse(xml);
        mnyMktUscrdMktSttstclRpt = tmp.getMnyMktUscrdMktSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktUscrdMktSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketUnsecuredMarketStatisticalReportV01 }
     *     
     */
    public MoneyMarketUnsecuredMarketStatisticalReportV01 getMnyMktUscrdMktSttstclRpt() {
        return mnyMktUscrdMktSttstclRpt;
    }

    /**
     * Sets the value of the mnyMktUscrdMktSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketUnsecuredMarketStatisticalReportV01 }
     *     
     */
    public MxAuth01300101 setMnyMktUscrdMktSttstclRpt(MoneyMarketUnsecuredMarketStatisticalReportV01 value) {
        this.mnyMktUscrdMktSttstclRpt = value;
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
    public static MxAuth01300101 parse(String xml) {
        return ((MxAuth01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth01300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth01300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth01300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01300101) parserImpl.read(MxAuth01300101 .class, xml, _classes));
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
     * Creates an MxAuth01300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01300101 message
     * @return
     *     a new instance of MxAuth01300101
     */
    public static final MxAuth01300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01300101 .class);
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
