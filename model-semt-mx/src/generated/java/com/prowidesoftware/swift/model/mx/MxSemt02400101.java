
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
 * Class for semt.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ttlPrtflValtnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.024.001.01")
public class MxSemt02400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TtlPrtflValtnRpt", required = true)
    protected TotalPortfolioValuationReportV01 ttlPrtflValtnRpt;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 24;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification5 .class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection30 .class, AmountAndDirection31 .class, AmountAndRate2 .class, BalanceDetails5 .class, BalanceDetails6 .class, BalanceType13Code.class, BalanceType6Choice.class, BalanceType7Choice.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, EventFrequency1Code.class, FinancialAssetBalanceType1Code.class, FinancialAssetTypeCategory1Code.class, Frequency8Choice.class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, InvestmentFund1 .class, MxSemt02400101 .class, OtherIdentification1 .class, Pagination.class, PortfolioBalance1 .class, PriceAndDirection1 .class, PriceInformation10 .class, PriceValueAndRate4 .class, Report4 .class, SecuritiesAccount21 .class, SecurityIdentification14 .class, ShortLong1Code.class, StatementBasis1Code.class, StatementBasis6Choice.class, StatementSource1Choice.class, StatementSource1Code.class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalPortfolioValuation1 .class, TotalPortfolioValuationReportV01 .class, TypeOfPrice27Choice.class, TypeOfPrice30Code.class, Unrealised1Code.class, UpdateType4Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.024.001.01";

    public MxSemt02400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02400101(final String xml) {
        this();
        MxSemt02400101 tmp = parse(xml);
        ttlPrtflValtnRpt = tmp.getTtlPrtflValtnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ttlPrtflValtnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPortfolioValuationReportV01 }
     *     
     */
    public TotalPortfolioValuationReportV01 getTtlPrtflValtnRpt() {
        return ttlPrtflValtnRpt;
    }

    /**
     * Sets the value of the ttlPrtflValtnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPortfolioValuationReportV01 }
     *     
     */
    public MxSemt02400101 setTtlPrtflValtnRpt(TotalPortfolioValuationReportV01 value) {
        this.ttlPrtflValtnRpt = value;
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
    public static MxSemt02400101 parse(String xml) {
        return ((MxSemt02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02400101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02400101) parserImpl.read(MxSemt02400101 .class, xml, _classes));
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
     * Creates an MxSemt02400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02400101 message
     * @return
     *     a new instance of MxSemt02400101
     */
    public static final MxSemt02400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02400101 .class);
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
