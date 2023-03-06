
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
 * Class for auth.009.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rgltryTxRptCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.009.001.02")
public class MxAuth00900102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RgltryTxRptCxlReq", required = true)
    protected RegulatoryTransactionReportCancellationRequestV02 rgltryTxRptCxlReq;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CurrencyAndAmount.class, DocumentIdentification8 .class, DocumentIdentification9 .class, FinancialInstrument15 .class, GenericIdentification1 .class, GenericIdentification3 .class, MxAuth00900102 .class, NameAndAddress5 .class, OffMarket1Choice.class, OffMarket1Code.class, OptionTypeCode.class, OrderDriverCode.class, PartyIdentification11Choice.class, PartyIdentification23 .class, PartyIdentification23Choice.class, PartyIdentification24Choice.class, PartyIdentification2Choice.class, PlaceOfTradeIdentification2Choice.class, PostalAddress1 .class, PriceRateOrAmountChoice.class, RegulatoryTransactionReportCancellationRequestV02 .class, SecurityClassificationType1Choice.class, SecurityIdentification6Choice.class, SecurityInstrumentDescription2 .class, TradingCapacity3Code.class, TransactionDetails2 .class, TransactionDetails3 .class, UnitOrFaceAmountChoice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.009.001.02";

    public MxAuth00900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth00900102(final String xml) {
        this();
        MxAuth00900102 tmp = parse(xml);
        rgltryTxRptCxlReq = tmp.getRgltryTxRptCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth00900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rgltryTxRptCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTransactionReportCancellationRequestV02 }
     *     
     */
    public RegulatoryTransactionReportCancellationRequestV02 getRgltryTxRptCxlReq() {
        return rgltryTxRptCxlReq;
    }

    /**
     * Sets the value of the rgltryTxRptCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTransactionReportCancellationRequestV02 }
     *     
     */
    public MxAuth00900102 setRgltryTxRptCxlReq(RegulatoryTransactionReportCancellationRequestV02 value) {
        this.rgltryTxRptCxlReq = value;
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
    public static MxAuth00900102 parse(String xml) {
        return ((MxAuth00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth00900102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth00900102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth00900102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth00900102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth00900102) parserImpl.read(MxAuth00900102 .class, xml, _classes));
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
     * Creates an MxAuth00900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth00900102 message
     * @return
     *     a new instance of MxAuth00900102
     */
    public final static MxAuth00900102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth00900102 .class);
    }

}
