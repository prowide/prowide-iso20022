
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Request message to transmit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceTransmitMessageRequest2", propOrder = {
    "dstnAdr",
    "maxTrnsmssnTm",
    "maxWtgTm",
    "msgToSnd"
})
public class DeviceTransmitMessageRequest2 {

    @XmlElement(name = "DstnAdr", required = true)
    protected NetworkParameters7 dstnAdr;
    @XmlElement(name = "MaxTrnsmssnTm", required = true)
    protected BigDecimal maxTrnsmssnTm;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "MsgToSnd", required = true)
    protected byte[] msgToSnd;

    /**
     * Gets the value of the dstnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public DeviceTransmitMessageRequest2 setDstnAdr(NetworkParameters7 value) {
        this.dstnAdr = value;
        return this;
    }

    /**
     * Gets the value of the maxTrnsmssnTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTrnsmssnTm() {
        return maxTrnsmssnTm;
    }

    /**
     * Sets the value of the maxTrnsmssnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DeviceTransmitMessageRequest2 setMaxTrnsmssnTm(BigDecimal value) {
        this.maxTrnsmssnTm = value;
        return this;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DeviceTransmitMessageRequest2 setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
        return this;
    }

    /**
     * Gets the value of the msgToSnd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgToSnd() {
        return msgToSnd;
    }

    /**
     * Sets the value of the msgToSnd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DeviceTransmitMessageRequest2 setMsgToSnd(byte[] value) {
        this.msgToSnd = value;
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

}
