
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.014.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mnyMktFXSwpsSttstclRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.014.001.02")
public class MxAuth01400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MnyMktFXSwpsSttstclRpt", required = true)
    protected MoneyMarketForeignExchangeSwapsStatisticalReportV02 mnyMktFXSwpsSttstclRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 14;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, CounterpartyIdentification3Choice.class, DateAndDateTimeChoice.class, DateTimePeriod1 .class, ForeignExchange1 .class, ForeignExchangeSwap3Choice.class, ForeignExchangeSwapTransaction3 .class, MoneyMarketForeignExchangeSwapsStatisticalReportV02 .class, MoneyMarketReportHeader1 .class, MxAuth01400102 .class, NameAndLocation1 .class, NovationStatus1Code.class, ReportPeriodActivity3Code.class, SectorAndLocation1 .class, SecuritiesTransactionType15Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionOperationType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.014.001.02";

    public MxAuth01400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01400102(final String xml) {
        this();
        MxAuth01400102 tmp = parse(xml);
        mnyMktFXSwpsSttstclRpt = tmp.getMnyMktFXSwpsSttstclRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mnyMktFXSwpsSttstclRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyMarketForeignExchangeSwapsStatisticalReportV02 }
     *     
     */
    public MoneyMarketForeignExchangeSwapsStatisticalReportV02 getMnyMktFXSwpsSttstclRpt() {
        return mnyMktFXSwpsSttstclRpt;
    }

    /**
     * Sets the value of the mnyMktFXSwpsSttstclRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyMarketForeignExchangeSwapsStatisticalReportV02 }
     *     
     */
    public MxAuth01400102 setMnyMktFXSwpsSttstclRpt(MoneyMarketForeignExchangeSwapsStatisticalReportV02 value) {
        this.mnyMktFXSwpsSttstclRpt = value;
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
    public static MxAuth01400102 parse(String xml) {
        return ((MxAuth01400102) MxReadImpl.parse(MxAuth01400102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01400102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01400102) parserImpl.read(MxAuth01400102 .class, xml, _classes));
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
     * Creates an MxAuth01400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01400102 message
     * @return
     *     a new instance of MxAuth01400102
     */
    public final static MxAuth01400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth01400102 .class);
    }

}
