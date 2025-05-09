
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "DeviceTransmitMessageRequest1", propOrder = {
    "dstnAdr",
    "maxTrnsmssnTm",
    "maxWtgTm",
    "msgToSnd"
})
public class DeviceTransmitMessageRequest1 {

    @XmlElement(name = "DstnAdr", required = true)
    protected NetworkParameters5 dstnAdr;
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
     *     {@link NetworkParameters5 }
     *     
     */
    public NetworkParameters5 getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters5 }
     *     
     */
    public DeviceTransmitMessageRequest1 setDstnAdr(NetworkParameters5 value) {
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
    public DeviceTransmitMessageRequest1 setMaxTrnsmssnTm(BigDecimal value) {
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
    public DeviceTransmitMessageRequest1 setMaxWtgTm(BigDecimal value) {
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
    public DeviceTransmitMessageRequest1 setMsgToSnd(byte[] value) {
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
