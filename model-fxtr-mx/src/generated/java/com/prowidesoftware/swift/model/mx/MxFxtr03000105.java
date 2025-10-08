
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
 * Class for fxtr.030.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradBlkStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05")
public class MxFxtr03000105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradBlkStsNtfctn", required = true)
    protected ForeignExchangeTradeBulkStatusNotificationV05 fxTradBlkStsNtfctn;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 30;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AllocationIndicator1Code.class, AmountOrRate4Choice.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, CorporateSectorIdentifier1Code.class, CounterpartySideTransactionReporting2 .class, DateAndDateTime2Choice.class, FXAmountType1Choice.class, FXAmountType1Code.class, FXCommissionOrFee1 .class, ForeignExchangeTradeBulkStatusNotificationV05 .class, IdentificationSource3Choice.class, MxFxtr03000105 .class, NameAndAddress8 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PostalAddress1 .class, RegulatoryReporting7 .class, SecurityIdentification19 .class, SideIndicator1Code.class, Status27Choice.class, Status28Choice.class, StatusAndSubStatus2 .class, StatusSubType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData12 .class, TradeData40 .class, TradeStatus6Code.class, TradeStatus7Code.class, TradingSideTransactionReporting2 .class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.05";

    public MxFxtr03000105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03000105(final String xml) {
        this();
        MxFxtr03000105 tmp = parse(xml);
        fxTradBlkStsNtfctn = tmp.getFXTradBlkStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03000105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradBlkStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV05 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV05 getFXTradBlkStsNtfctn() {
        return fxTradBlkStsNtfctn;
    }

    /**
     * Sets the value of the fxTradBlkStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV05 }
     *     
     */
    public MxFxtr03000105 setFXTradBlkStsNtfctn(ForeignExchangeTradeBulkStatusNotificationV05 value) {
        this.fxTradBlkStsNtfctn = value;
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
    public static MxFxtr03000105 parse(String xml) {
        return ((MxFxtr03000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03000105 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03000105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03000105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03000105 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03000105) parserImpl.read(MxFxtr03000105 .class, xml, _classes));
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
     * Creates an MxFxtr03000105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03000105 message
     * @return
     *     a new instance of MxFxtr03000105
     */
    public final static MxFxtr03000105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03000105 .class);
    }

}
