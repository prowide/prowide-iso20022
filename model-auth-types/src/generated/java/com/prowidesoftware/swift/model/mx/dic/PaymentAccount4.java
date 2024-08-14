
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
 * Bank account used by a central counterparty to allow for the convenient settlement of obligations between a central counterparty and a clearing member, typically in commercial bank money. Gross credits and gross debits included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAccount4", propOrder = {
    "ccy",
    "netPmt",
    "grssCdts",
    "grssDbts",
    "latePmtConf"
})
public class PaymentAccount4 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "NetPmt", required = true)
    protected AmountAndDirection86 netPmt;
    @XmlElement(name = "GrssCdts", required = true)
    protected BigDecimal grssCdts;
    @XmlElement(name = "GrssDbts", required = true)
    protected BigDecimal grssDbts;
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
    public PaymentAccount4 setCcy(String value) {
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
    public PaymentAccount4 setNetPmt(AmountAndDirection86 value) {
        this.netPmt = value;
        return this;
    }

    /**
     * Gets the value of the grssCdts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrssCdts() {
        return grssCdts;
    }

    /**
     * Sets the value of the grssCdts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentAccount4 setGrssCdts(BigDecimal value) {
        this.grssCdts = value;
        return this;
    }

    /**
     * Gets the value of the grssDbts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrssDbts() {
        return grssDbts;
    }

    /**
     * Sets the value of the grssDbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentAccount4 setGrssDbts(BigDecimal value) {
        this.grssDbts = value;
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
    public PaymentAccount4 setLatePmtConf(String value) {
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
