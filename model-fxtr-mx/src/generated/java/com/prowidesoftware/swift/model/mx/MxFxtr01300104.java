
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
 * Class for fxtr.013.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradWdrwlNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.013.001.04")
public class MxFxtr01300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradWdrwlNtfctn", required = true)
    protected ForeignExchangeTradeWithdrawalNotificationV04 fxTradWdrwlNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 13;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ForeignExchangeTradeWithdrawalNotificationV04 .class, MxFxtr01300104 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, WithdrawalReason1 .class, WithdrawalReason1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:fxtr.013.001.04";

    public MxFxtr01300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01300104(final String xml) {
        this();
        MxFxtr01300104 tmp = parse(xml);
        fxTradWdrwlNtfctn = tmp.getFXTradWdrwlNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradWdrwlNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeWithdrawalNotificationV04 }
     *     
     */
    public ForeignExchangeTradeWithdrawalNotificationV04 getFXTradWdrwlNtfctn() {
        return fxTradWdrwlNtfctn;
    }

    /**
     * Sets the value of the fxTradWdrwlNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeWithdrawalNotificationV04 }
     *     
     */
    public MxFxtr01300104 setFXTradWdrwlNtfctn(ForeignExchangeTradeWithdrawalNotificationV04 value) {
        this.fxTradWdrwlNtfctn = value;
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
    public static MxFxtr01300104 parse(String xml) {
        return ((MxFxtr01300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01300104 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01300104) parserImpl.read(MxFxtr01300104 .class, xml, _classes));
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
     * Creates an MxFxtr01300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01300104 message
     * @return
     *     a new instance of MxFxtr01300104
     */
    public static final MxFxtr01300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01300104 .class);
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
