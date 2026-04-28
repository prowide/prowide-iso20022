
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
 * Class for fxtr.038.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfStsAdvcAck"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.02")
public class MxFxtr03800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfStsAdvcAck", required = true)
    protected ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 fxTradConfStsAdvcAck;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 38;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalInformation5 .class, AffirmStatus1Code.class, ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 .class, GenericIdentification1 .class, MarketIdentification1Choice.class, MarketIdentification88 .class, MarketType13Choice.class, MarketType8Code.class, MessageIdentification1 .class, MxFxtr03800102 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeConfirmationStatus1Code.class, TradingModeType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.02";

    public MxFxtr03800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03800102(final String xml) {
        this();
        MxFxtr03800102 tmp = parse(xml);
        fxTradConfStsAdvcAck = tmp.getFXTradConfStsAdvcAck();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfStsAdvcAck property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 }
     *     
     */
    public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 getFXTradConfStsAdvcAck() {
        return fxTradConfStsAdvcAck;
    }

    /**
     * Sets the value of the fxTradConfStsAdvcAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 }
     *     
     */
    public MxFxtr03800102 setFXTradConfStsAdvcAck(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV02 value) {
        this.fxTradConfStsAdvcAck = value;
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
    public static MxFxtr03800102 parse(String xml) {
        return ((MxFxtr03800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03800102 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03800102) parserImpl.read(MxFxtr03800102 .class, xml, _classes));
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
     * Creates an MxFxtr03800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03800102 message
     * @return
     *     a new instance of MxFxtr03800102
     */
    public final static MxFxtr03800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03800102 .class);
    }

}
