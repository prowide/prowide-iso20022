
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
 * Class for fxtr.008.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.08")
public class MxFxtr00800108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradStsNtfctn", required = true)
    protected ForeignExchangeTradeStatusNotificationV08 fxTradStsNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AllocationIndicator1Code.class, AmountOrRate4Choice.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting3 .class, DateAndDateTime2Choice.class, FXAmountType1Choice.class, FXAmountType1Code.class, FXCommissionOrFee1 .class, ForeignExchangeTradeStatusNotificationV08 .class, IdentificationSource3Choice.class, MxFxtr00800108 .class, NameAndAddress8 .class, OtherIdentification1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PostalAddress1 .class, ProductIdentifier3Choice.class, RegulatoryReporting8 .class, SecurityIdentification19 .class, SideIndicator1Code.class, Status27Choice.class, Status28Choice.class, StatusAndSubStatus2 .class, StatusSubType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData15 .class, TradeStatus6Code.class, TradeStatus7Code.class, TradingSideTransactionReporting3 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier3 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.08";

    public MxFxtr00800108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr00800108(final String xml) {
        this();
        MxFxtr00800108 tmp = parse(xml);
        fxTradStsNtfctn = tmp.getFXTradStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr00800108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeStatusNotificationV08 }
     *     
     */
    public ForeignExchangeTradeStatusNotificationV08 getFXTradStsNtfctn() {
        return fxTradStsNtfctn;
    }

    /**
     * Sets the value of the fxTradStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeStatusNotificationV08 }
     *     
     */
    public MxFxtr00800108 setFXTradStsNtfctn(ForeignExchangeTradeStatusNotificationV08 value) {
        this.fxTradStsNtfctn = value;
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
    public static MxFxtr00800108 parse(String xml) {
        return ((MxFxtr00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr00800108 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr00800108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr00800108 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr00800108) parserImpl.read(MxFxtr00800108 .class, xml, _classes));
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
     * Creates an MxFxtr00800108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr00800108 message
     * @return
     *     a new instance of MxFxtr00800108
     */
    public static final MxFxtr00800108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr00800108 .class);
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
