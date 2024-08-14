
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Bank account used by a central counterparty to allow for the convenient settlement of obligations between a central counterparty and a clearing member, typically in commercial bank money.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAccount1", propOrder = {
    "ccy",
    "netPmt",
    "latePmtConf"
})
public class PaymentAccount1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "NetPmt", required = true)
    protected AmountAndDirection86 netPmt;
    @XmlElement(name = "LatePmtConf", required = true)
    protected String latePmtConf;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentAccount1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the netPmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection86 }
     *     
     */
    public AmountAndDirection86 getNetPmt() {
        return netPmt;
    }

    /**
     * Sets the value of the netPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection86 }
     *     
     */
    public PaymentAccount1 setNetPmt(AmountAndDirection86 value) {
        this.netPmt = value;
        return this;
    }

    /**
     * Gets the value of the latePmtConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatePmtConf() {
        return latePmtConf;
    }

    /**
     * Sets the value of the latePmtConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentAccount1 setLatePmtConf(String value) {
        this.latePmtConf = value;
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
