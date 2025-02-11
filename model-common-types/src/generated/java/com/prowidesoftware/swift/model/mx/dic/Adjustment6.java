
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Modification on the value of goods and / or services. For example: rebate, discount, surcharge.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment6", propOrder = {
    "tp",
    "drctn",
    "amt"
})
public class Adjustment6 {

    @XmlElement(name = "Tp", required = true)
    protected AdjustmentType1Choice tp;
    @XmlElement(name = "Drctn", required = true)
    @XmlSchemaType(name = "string")
    protected AdjustmentDirection1Code drctn;
    @XmlElement(name = "Amt", required = true)
    protected CurrencyAndAmount amt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType1Choice }
     *     
     */
    public AdjustmentType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType1Choice }
     *     
     */
    public Adjustment6 setTp(AdjustmentType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the drctn property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentDirection1Code }
     *     
     */
    public AdjustmentDirection1Code getDrctn() {
        return drctn;
    }

    /**
     * Sets the value of the drctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentDirection1Code }
     *     
     */
    public Adjustment6 setDrctn(AdjustmentDirection1Code value) {
        this.drctn = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public Adjustment6 setAmt(CurrencyAndAmount value) {
        this.amt = value;
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
