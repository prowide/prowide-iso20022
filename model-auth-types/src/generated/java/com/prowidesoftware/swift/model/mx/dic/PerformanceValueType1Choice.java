
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The value assessing the performance for a specific time range is a choice between a rate or a value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceValueType1Choice", propOrder = {
    "rate",
    "val",
    "notAvlblVal"
})
public class PerformanceValueType1Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Val")
    protected BigDecimal val;
    @XmlElement(name = "NotAvlblVal")
    @XmlSchemaType(name = "string")
    protected NotAvailable1Code notAvlblVal;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformanceValueType1Choice setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PerformanceValueType1Choice setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblVal property.
     * 
     * @return
     *     possible object is
     *     {@link NotAvailable1Code }
     *     
     */
    public NotAvailable1Code getNotAvlblVal() {
        return notAvlblVal;
    }

    /**
     * Sets the value of the notAvlblVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotAvailable1Code }
     *     
     */
    public PerformanceValueType1Choice setNotAvlblVal(NotAvailable1Code value) {
        this.notAvlblVal = value;
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
