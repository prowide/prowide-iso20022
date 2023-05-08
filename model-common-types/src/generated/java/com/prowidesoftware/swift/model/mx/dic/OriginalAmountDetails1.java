
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
 * The OriginalAmountDetails contains all amount information in the acceptor currency code necessary to manage currency conversion in the cardholder currency code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalAmountDetails1", propOrder = {
    "actlAmt",
    "minAmt",
    "maxAmt"
})
public class OriginalAmountDetails1 {

    @XmlElement(name = "ActlAmt")
    protected BigDecimal actlAmt;
    @XmlElement(name = "MinAmt")
    protected BigDecimal minAmt;
    @XmlElement(name = "MaxAmt")
    protected BigDecimal maxAmt;

    /**
     * Gets the value of the actlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActlAmt() {
        return actlAmt;
    }

    /**
     * Sets the value of the actlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalAmountDetails1 setActlAmt(BigDecimal value) {
        this.actlAmt = value;
        return this;
    }

    /**
     * Gets the value of the minAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmt() {
        return minAmt;
    }

    /**
     * Sets the value of the minAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalAmountDetails1 setMinAmt(BigDecimal value) {
        this.minAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAmt() {
        return maxAmt;
    }

    /**
     * Sets the value of the maxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalAmountDetails1 setMaxAmt(BigDecimal value) {
        this.maxAmt = value;
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
