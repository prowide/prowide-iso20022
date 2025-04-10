
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
 * Class for fxtr.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradStsAndDtlsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.017.001.01")
public class MxFxtr01700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradStsAndDtlsNtfctn", required = true)
    protected ForeignExchangeTradeStatusAndDetailsNotificationV01 fxTradStsAndDtlsNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, ContactInformation1 .class, ForeignExchangeTradeStatusAndDetailsNotificationV01 .class, FundIdentification3 .class, GeneralInformation2 .class, MxFxtr01700101 .class, NameAndAddress8 .class, PartyIdentification19Choice.class, PartyIdentification44 .class, PostalAddress1 .class, SettlementParties9 .class, Status5Choice.class, TradeAgreement5 .class, TradeData3 .class, TradePartyIdentification5 .class, TradeStatus3Code.class, Trading1MethodCode.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:fxtr.017.001.01";

    public MxFxtr01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01700101(final String xml) {
        this();
        MxFxtr01700101 tmp = parse(xml);
        fxTradStsAndDtlsNtfctn = tmp.getFXTradStsAndDtlsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV01 }
     *     
     */
    public ForeignExchangeTradeStatusAndDetailsNotificationV01 getFXTradStsAndDtlsNtfctn() {
        return fxTradStsAndDtlsNtfctn;
    }

    /**
     * Sets the value of the fxTradStsAndDtlsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeStatusAndDetailsNotificationV01 }
     *     
     */
    public MxFxtr01700101 setFXTradStsAndDtlsNtfctn(ForeignExchangeTradeStatusAndDetailsNotificationV01 value) {
        this.fxTradStsAndDtlsNtfctn = value;
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
    public static MxFxtr01700101 parse(String xml) {
        return ((MxFxtr01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01700101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01700101) parserImpl.read(MxFxtr01700101 .class, xml, _classes));
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
     * Creates an MxFxtr01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01700101 message
     * @return
     *     a new instance of MxFxtr01700101
     */
    public static final MxFxtr01700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01700101 .class);
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
