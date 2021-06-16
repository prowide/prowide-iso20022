
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
 * Class for fxtr.034.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01")
public class MxFxtr03400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfReq", required = true)
    protected ForeignExchangeTradeConfirmationRequestV01 fxTradConfReq;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AgreedRate3 .class, AlternateIdentification1 .class, ClearingMethod1Code.class, ConfirmationRequest1Code.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DateFormat18Choice.class, DateType8Code.class, ForeignExchangeTradeConfirmationRequestV01 .class, GenericIdentification32 .class, Header23 .class, IdentificationSource1Choice.class, IdentificationType2Code.class, InstrumentLeg6 .class, MessageIdentification1 .class, MxFxtr03400101 .class, PartyType3Code.class, PartyType4Code.class, Period4 .class, QueryTradeStatus1Code.class, SecurityIdentification18 .class, SecurityIdentification22Choice.class, SettlementDateCode.class, Side1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Trade2 .class, Trade3 .class, TradingMethodType1Code.class, TradingModeType1Code.class, UnderlyingProductIdentifier1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01";

    public MxFxtr03400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03400101(final String xml) {
        this();
        MxFxtr03400101 tmp = parse(xml);
        fxTradConfReq = tmp.getFXTradConfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfReq property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationRequestV01 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV01 getFXTradConfReq() {
        return fxTradConfReq;
    }

    /**
     * Sets the value of the fxTradConfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationRequestV01 }
     *     
     */
    public MxFxtr03400101 setFXTradConfReq(ForeignExchangeTradeConfirmationRequestV01 value) {
        this.fxTradConfReq = value;
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
    public static MxFxtr03400101 parse(String xml) {
        return ((MxFxtr03400101) MxReadImpl.parse(MxFxtr03400101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03400101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03400101) parserImpl.read(MxFxtr03400101 .class, xml, _classes));
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
     * Creates an MxFxtr03400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03400101 message
     * @return
     *     a new instance of MxFxtr03400101
     */
    public final static MxFxtr03400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03400101 .class);
    }

}
