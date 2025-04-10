
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
 * Class for fxtr.008.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxAndDerivTradStsNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.008.001.03")
public class MxFxtr00800103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXAndDerivTradStsNtfctn", required = true)
    protected ForeignExchangeAndDerivativeTradeStatusNotificationV03 fxAndDerivTradStsNtfctn;
    public static final transient String BUSINESS_PROCESS = "fxtr";
    public static final transient int FUNCTIONALITY = 8;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ForeignExchangeAndDerivativeTradeStatusNotificationV03 .class, MxFxtr00800103 .class, Status6Choice.class, TradeData6 .class, TradeStatus4Code.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:fxtr.008.001.03";

    public MxFxtr00800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr00800103(final String xml) {
        this();
        MxFxtr00800103 tmp = parse(xml);
        fxAndDerivTradStsNtfctn = tmp.getFXAndDerivTradStsNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr00800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxAndDerivTradStsNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeAndDerivativeTradeStatusNotificationV03 }
     *     
     */
    public ForeignExchangeAndDerivativeTradeStatusNotificationV03 getFXAndDerivTradStsNtfctn() {
        return fxAndDerivTradStsNtfctn;
    }

    /**
     * Sets the value of the fxAndDerivTradStsNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeAndDerivativeTradeStatusNotificationV03 }
     *     
     */
    public MxFxtr00800103 setFXAndDerivTradStsNtfctn(ForeignExchangeAndDerivativeTradeStatusNotificationV03 value) {
        this.fxAndDerivTradStsNtfctn = value;
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
    public static MxFxtr00800103 parse(String xml) {
        return ((MxFxtr00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr00800103 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr00800103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr00800103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr00800103 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr00800103) parserImpl.read(MxFxtr00800103 .class, xml, _classes));
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
     * Creates an MxFxtr00800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr00800103 message
     * @return
     *     a new instance of MxFxtr00800103
     */
    public static final MxFxtr00800103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr00800103 .class);
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
