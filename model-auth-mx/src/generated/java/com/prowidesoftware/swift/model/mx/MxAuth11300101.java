
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
 * Class for auth.113.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ordrBookRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.113.001.01")
public class MxAuth11300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "OrdrBookRpt", required = true)
    protected OrderBookReportV01 ordrBookRpt;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 113;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AmountAndDirection53 .class, AmountAndDirection61 .class, AuctionData2 .class, CancelOrderReport1 .class, DateTimePeriod1 .class, ExecutingParty2Choice.class, FinancialInstrument99Choice.class, FinancialInstrumentQuantity25Choice.class, GenericIdentification30 .class, GenericPersonIdentification1 .class, MinimumExecutable1 .class, MxAuth11300101 .class, NewOrderReport2 .class, NoReasonCode.class, OrderBookReportV01 .class, OrderClassification2 .class, OrderData3 .class, OrderData4 .class, OrderEventType1Choice.class, OrderEventType1Code.class, OrderIdentification2 .class, OrderInstructionData2 .class, OrderPriceData2 .class, OrderPriority1 .class, OrderReport2Choice.class, OrderRestriction1Choice.class, OrderRestrictionType1Code.class, OrderStatus10Code.class, OrderStatus11Code.class, OrderType3Code.class, Pagination1 .class, PartyExceptionType1Code.class, PassiveOrAgressiveType1Code.class, Period11Choice.class, Period2 .class, PersonIdentificationSchemeName1Choice.class, PersonOrOrganisation4Choice.class, PriceStatus1Code.class, RegulatoryTradingCapacity1Code.class, SecuritiesMarketReportHeader3 .class, SecuritiesTransactionPrice1 .class, SecuritiesTransactionPrice21Choice.class, SecuritiesTransactionPrice2Choice.class, SecuritiesTransactionPrice4Choice.class, Side6Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class, TransactionData3 .class, ValidityPeriod1Choice.class, ValidityPeriodType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.113.001.01";

    public MxAuth11300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth11300101(final String xml) {
        this();
        MxAuth11300101 tmp = parse(xml);
        ordrBookRpt = tmp.getOrdrBookRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth11300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ordrBookRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBookReportV01 }
     *     
     */
    public OrderBookReportV01 getOrdrBookRpt() {
        return ordrBookRpt;
    }

    /**
     * Sets the value of the ordrBookRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBookReportV01 }
     *     
     */
    public MxAuth11300101 setOrdrBookRpt(OrderBookReportV01 value) {
        this.ordrBookRpt = value;
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
    public static MxAuth11300101 parse(String xml) {
        return ((MxAuth11300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth11300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth11300101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth11300101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth11300101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth11300101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth11300101) parserImpl.read(MxAuth11300101 .class, xml, _classes));
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
     * Creates an MxAuth11300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth11300101 message
     * @return
     *     a new instance of MxAuth11300101
     */
    public static final MxAuth11300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth11300101 .class);
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
