
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
 * Class for fxtr.030.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradBlkStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.02")
public class MxFxtr03000102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradBlkStsNtfctn", required = true)
    protected ForeignExchangeTradeBulkStatusNotificationV02 fxTradBlkStsNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AllocationIndicator1Code.class, ClearingBrokerIdentification1 .class, ClearingSystemIdentification2Choice.class, CollateralisationIndicator1Code.class, DateAndDateTimeChoice.class, ForeignExchangeTradeBulkStatusNotificationV02 .class, MxFxtr03000102 .class, NameAndAddress8 .class, Pagination.class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PostalAddress1 .class, RegulatoryReporting1 .class, SideIndicator1Code.class, Status13Choice.class, Status5Choice.class, StatusAndSubStatus1 .class, StatusSubType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeData10 .class, TradeData8 .class, TradeStatus3Code.class, TradeStatus5Code.class, UnderlyingProductIdentifier1Code.class, UniqueTransactionIdentifier1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.030.001.02";

    public MxFxtr03000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr03000102(final String xml) {
        this();
        MxFxtr03000102 tmp = parse(xml);
        fxTradBlkStsNtfctn = tmp.getFXTradBlkStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr03000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradBlkStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV02 }
     *     
     */
    public ForeignExchangeTradeBulkStatusNotificationV02 getFXTradBlkStsNtfctn() {
        return fxTradBlkStsNtfctn;
    }

    /**
     * Sets the value of the fxTradBlkStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeBulkStatusNotificationV02 }
     *     
     */
    public MxFxtr03000102 setFXTradBlkStsNtfctn(ForeignExchangeTradeBulkStatusNotificationV02 value) {
        this.fxTradBlkStsNtfctn = value;
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
    public static MxFxtr03000102 parse(String xml) {
        return ((MxFxtr03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr03000102 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr03000102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr03000102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr03000102 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr03000102) parserImpl.read(MxFxtr03000102 .class, xml, _classes));
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
     * Creates an MxFxtr03000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr03000102 message
     * @return
     *     a new instance of MxFxtr03000102
     */
    public static final MxFxtr03000102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr03000102 .class);
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
