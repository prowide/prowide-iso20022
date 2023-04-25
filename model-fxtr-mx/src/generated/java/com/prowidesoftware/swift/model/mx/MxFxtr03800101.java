
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
 * Class for fxtr.038.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfStsAdvcAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01")
public class MxFxtr03800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfStsAdvcAck", required = true)
    protected ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 fxTradConfStsAdvcAck;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 38;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalInformation5 .class, AffirmStatus1Code.class, ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 .class, GenericIdentification1 .class, MarketIdentification1Choice.class, MarketIdentification88 .class, MarketType13Choice.class, MarketType8Code.class, MessageIdentification1 .class, MxFxtr03800101 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeConfirmationStatus1Code.class, TradingModeType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01";

    public MxFxtr03800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03800101(final String xml) {
        this();
        MxFxtr03800101 tmp = parse(xml);
        fxTradConfStsAdvcAck = tmp.getFXTradConfStsAdvcAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfStsAdvcAck property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 getFXTradConfStsAdvcAck() {
        return fxTradConfStsAdvcAck;
    }

    /**
     * Sets the value of the fxTradConfStsAdvcAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 }
     *     
     */
    public MxFxtr03800101 setFXTradConfStsAdvcAck(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 value) {
        this.fxTradConfStsAdvcAck = value;
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
    public static MxFxtr03800101 parse(String xml) {
        return ((MxFxtr03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03800101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03800101) parserImpl.read(MxFxtr03800101 .class, xml, _classes));
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
     * Creates an MxFxtr03800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03800101 message
     * @return
     *     a new instance of MxFxtr03800101
     */
    public static final MxFxtr03800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03800101 .class);
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
