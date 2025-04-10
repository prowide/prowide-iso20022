
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
 * Settlement totals
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementCategoryTotal1", propOrder = {
    "cnt",
    "amt",
    "intrchngFee",
    "prcgFee"
})
public class SettlementCategoryTotal1 {

    @XmlElement(name = "Cnt")
    protected BigDecimal cnt;
    @XmlElement(name = "Amt", required = true)
    protected Amount14 amt;
    @XmlElement(name = "IntrchngFee")
    protected Amount14 intrchngFee;
    @XmlElement(name = "PrcgFee")
    protected Amount14 prcgFee;

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCnt() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SettlementCategoryTotal1 setCnt(BigDecimal value) {
        this.cnt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public SettlementCategoryTotal1 setAmt(Amount14 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the intrchngFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getIntrchngFee() {
        return intrchngFee;
    }

    /**
     * Sets the value of the intrchngFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public SettlementCategoryTotal1 setIntrchngFee(Amount14 value) {
        this.intrchngFee = value;
        return this;
    }

    /**
     * Gets the value of the prcgFee property.
     * 
     * @return
     *     possible object is
     *     {@link Amount14 }
     *     
     */
    public Amount14 getPrcgFee() {
        return prcgFee;
    }

    /**
     * Sets the value of the prcgFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount14 }
     *     
     */
    public SettlementCategoryTotal1 setPrcgFee(Amount14 value) {
        this.prcgFee = value;
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
