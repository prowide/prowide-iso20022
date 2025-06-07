
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
 * Total of credit or debit transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals5", propOrder = {
    "amt",
    "nb",
    "chrgBckAmt",
    "chrgBckNb",
    "rvslAmt",
    "rvslNb",
    "feeAmts"
})
public class TransactionTotals5 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Nb", required = true)
    protected BigDecimal nb;
    @XmlElement(name = "ChrgBckAmt", required = true)
    protected BigDecimal chrgBckAmt;
    @XmlElement(name = "ChrgBckNb", required = true)
    protected BigDecimal chrgBckNb;
    @XmlElement(name = "RvslAmt", required = true)
    protected BigDecimal rvslAmt;
    @XmlElement(name = "RvslNb", required = true)
    protected BigDecimal rvslNb;
    @XmlElement(name = "FeeAmts")
    protected BigDecimal feeAmts;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setNb(BigDecimal value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the chrgBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgBckAmt() {
        return chrgBckAmt;
    }

    /**
     * Sets the value of the chrgBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setChrgBckAmt(BigDecimal value) {
        this.chrgBckAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgBckNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgBckNb() {
        return chrgBckNb;
    }

    /**
     * Sets the value of the chrgBckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setChrgBckNb(BigDecimal value) {
        this.chrgBckNb = value;
        return this;
    }

    /**
     * Gets the value of the rvslAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvslAmt() {
        return rvslAmt;
    }

    /**
     * Sets the value of the rvslAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setRvslAmt(BigDecimal value) {
        this.rvslAmt = value;
        return this;
    }

    /**
     * Gets the value of the rvslNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRvslNb() {
        return rvslNb;
    }

    /**
     * Sets the value of the rvslNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setRvslNb(BigDecimal value) {
        this.rvslNb = value;
        return this;
    }

    /**
     * Gets the value of the feeAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmts() {
        return feeAmts;
    }

    /**
     * Sets the value of the feeAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionTotals5 setFeeAmts(BigDecimal value) {
        this.feeAmts = value;
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
