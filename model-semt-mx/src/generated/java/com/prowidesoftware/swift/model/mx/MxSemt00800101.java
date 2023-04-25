
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
 * Class for semt.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRptV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.008.001.01")
public class MxSemt00800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRptV01", required = true)
    protected RegulatoryTransactionReportV01 rgltryTxRptV01;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CurrencyAndAmount.class, DocumentIdentification8 .class, Extension1 .class, FinancialInstrument14 .class, GenericIdentification1 .class, MxSemt00800101 .class, NameAndAddress5 .class, OffMarket1Choice.class, OffMarket1Code.class, OptionType1Code.class, OrderDriverCode.class, PartyIdentification11Choice.class, PartyIdentification23 .class, PartyIdentification23Choice.class, PartyIdentification24Choice.class, PartyIdentification2Choice.class, PlaceOfTradeIdentification2Choice.class, PostalAddress1 .class, PriceRateOrAmountChoice.class, RegulatoryTransactionReportV01 .class, SecurityIdentification5Choice.class, SecurityInstrumentDescription1 .class, TradingCapacity3Code.class, TransactionDetails1 .class, UnitOrFaceAmountChoice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.008.001.01";

    public MxSemt00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00800101(final String xml) {
        this();
        MxSemt00800101 tmp = parse(xml);
        rgltryTxRptV01 = tmp.getRgltryTxRptV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRptV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportV01 }
     *     
     */
    public RegulatoryTransactionReportV01 getRgltryTxRptV01() {
        return rgltryTxRptV01;
    }

    /**
     * Sets the value of the rgltryTxRptV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportV01 }
     *     
     */
    public MxSemt00800101 setRgltryTxRptV01(RegulatoryTransactionReportV01 value) {
        this.rgltryTxRptV01 = value;
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
    public static MxSemt00800101 parse(String xml) {
        return ((MxSemt00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00800101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00800101) parserImpl.read(MxSemt00800101 .class, xml, _classes));
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
     * Creates an MxSemt00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00800101 message
     * @return
     *     a new instance of MxSemt00800101
     */
    public static final MxSemt00800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00800101 .class);
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
