
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
 * Class for fxtr.034.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradConfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.02")
public class MxFxtr03400102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradConfReq", required = true)
    protected ForeignExchangeTradeConfirmationRequestV02 fxTradConfReq;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AgreedRate3 .class, AlternateIdentification1 .class, ClearingMethod1Code.class, ConfirmationRequest1Code.class, DateAndDateTime2Choice.class, DateFormat45Choice.class, DateType8Code.class, ForeignExchangeTradeConfirmationRequestV02 .class, GenericIdentification32 .class, Header23 .class, IdentificationSource1Choice.class, IdentificationType2Code.class, InstrumentLeg7 .class, MessageIdentification1 .class, MxFxtr03400102 .class, PartyType3Code.class, PartyType4Code.class, Period12 .class, QueryTradeStatus1Code.class, SecurityIdentification18 .class, SecurityIdentification38Choice.class, SettlementDate8Code.class, Side1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Trade10 .class, Trade9 .class, TradingMethodType1Code.class, TradingModeType1Code.class, UnderlyingProductIdentifier1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.02";

    public MxFxtr03400102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03400102(final String xml) {
        this();
        MxFxtr03400102 tmp = parse(xml);
        fxTradConfReq = tmp.getFXTradConfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03400102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradConfReq property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeConfirmationRequestV02 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestV02 getFXTradConfReq() {
        return fxTradConfReq;
    }

    /**
     * Sets the value of the fxTradConfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeConfirmationRequestV02 }
     *     
     */
    public MxFxtr03400102 setFXTradConfReq(ForeignExchangeTradeConfirmationRequestV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxFxtr03400102 parse(String xml) {
        return ((MxFxtr03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03400102 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03400102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03400102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03400102 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03400102) parserImpl.read(MxFxtr03400102 .class, xml, _classes));
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
     * Creates an MxFxtr03400102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03400102 message
     * @return
     *     a new instance of MxFxtr03400102
     */
    public final static MxFxtr03400102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03400102 .class);
    }

}
