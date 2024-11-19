
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
 * Class for semt.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRptCxlReqV01"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.009.001.01")
public class MxSemt00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRptCxlReqV01", required = true)
    protected RegulatoryTransactionReportCancellationRequestV01 rgltryTxRptCxlReqV01;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CurrencyAndAmount.class, DocumentIdentification8 .class, DocumentIdentification9 .class, FinancialInstrument14 .class, GenericIdentification1 .class, MxSemt00900101 .class, NameAndAddress5 .class, OffMarket1Choice.class, OffMarket1Code.class, OptionType1Code.class, OrderDriverCode.class, PartyIdentification11Choice.class, PartyIdentification23 .class, PartyIdentification23Choice.class, PartyIdentification24Choice.class, PartyIdentification2Choice.class, PlaceOfTradeIdentification2Choice.class, PostalAddress1 .class, PriceRateOrAmountChoice.class, RegulatoryTransactionReportCancellationRequestV01 .class, SecurityIdentification5Choice.class, SecurityInstrumentDescription1 .class, TradingCapacity3Code.class, TransactionDetails1 .class, TransactionDetails2 .class, UnitOrFaceAmountChoice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.009.001.01";

    public MxSemt00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00900101(final String xml) {
        this();
        MxSemt00900101 tmp = parse(xml);
        rgltryTxRptCxlReqV01 = tmp.getRgltryTxRptCxlReqV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRptCxlReqV01 property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportCancellationRequestV01 }
     *     
     */
    public RegulatoryTransactionReportCancellationRequestV01 getRgltryTxRptCxlReqV01() {
        return rgltryTxRptCxlReqV01;
    }

    /**
     * Sets the value of the rgltryTxRptCxlReqV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportCancellationRequestV01 }
     *     
     */
    public MxSemt00900101 setRgltryTxRptCxlReqV01(RegulatoryTransactionReportCancellationRequestV01 value) {
        this.rgltryTxRptCxlReqV01 = value;
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
    public static MxSemt00900101 parse(String xml) {
        return ((MxSemt00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00900101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00900101) parserImpl.read(MxSemt00900101 .class, xml, _classes));
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
     * Creates an MxSemt00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00900101 message
     * @return
     *     a new instance of MxSemt00900101
     */
    public static final MxSemt00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00900101 .class);
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
