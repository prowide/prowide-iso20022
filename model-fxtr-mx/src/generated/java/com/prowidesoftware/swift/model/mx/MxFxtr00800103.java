
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
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
    extends AbstractMX
{

    @XmlElement(name = "FXAndDerivTradStsNtfctn", required = true)
    protected ForeignExchangeAndDerivativeTradeStatusNotificationV03 fxAndDerivTradStsNtfctn;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ForeignExchangeAndDerivativeTradeStatusNotificationV03 .class, MxFxtr00800103 .class, Status6Choice.class, TradeData6 .class, TradeStatus4Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:fxtr.008.001.03";

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
    public static MxFxtr00800103 parse(String xml) {
        return ((MxFxtr00800103) MxReadImpl.parse(MxFxtr00800103 .class, xml, _classes));
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
    public final static MxFxtr00800103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxFxtr00800103 .class);
    }

}
