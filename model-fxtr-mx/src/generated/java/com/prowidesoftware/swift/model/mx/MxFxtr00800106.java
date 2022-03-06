
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
 * Class for fxtr.008.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.06")
public class MxFxtr00800106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradStsNtfctn", required = true)
    protected ForeignExchangeTradeStatusNotificationV06 fxTradStsNtfctn;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AllocationIndicator1Code.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting1 .class, DateAndDateTimeChoice.class, ForeignExchangeTradeStatusNotificationV06 .class, IdentificationSource3Choice.class, MxFxtr00800106 .class, NameAndAddress8 .class, OtherIdentification1 .class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PostalAddress1 .class, RegulatoryReporting6 .class, SecurityIdentification19 .class, SideIndicator1Code.class, Status27Choice.class, Status28Choice.class, StatusAndSubStatus2 .class, StatusSubType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData15 .class, TradeStatus6Code.class, TradeStatus7Code.class, TradingSideTransactionReporting1 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.06";

    public MxFxtr00800106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr00800106(final String xml) {
        this();
        MxFxtr00800106 tmp = parse(xml);
        fxTradStsNtfctn = tmp.getFXTradStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr00800106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeStatusNotificationV06 }
     *     
     */
    public ForeignExchangeTradeStatusNotificationV06 getFXTradStsNtfctn() {
        return fxTradStsNtfctn;
    }

    /**
     * Sets the value of the fxTradStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeStatusNotificationV06 }
     *     
     */
    public MxFxtr00800106 setFXTradStsNtfctn(ForeignExchangeTradeStatusNotificationV06 value) {
        this.fxTradStsNtfctn = value;
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
    public static MxFxtr00800106 parse(String xml) {
        return ((MxFxtr00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr00800106 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr00800106) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800106 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr00800106 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr00800106) parserImpl.read(MxFxtr00800106 .class, xml, _classes));
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
     * Creates an MxFxtr00800106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr00800106 message
     * @return
     *     a new instance of MxFxtr00800106
     */
    public final static MxFxtr00800106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr00800106 .class);
    }

}
