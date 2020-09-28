
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesDetails1", propOrder = {
    "tp",
    "othrChrgsTp",
    "amt",
    "rate"
})
public class ChargesDetails1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ChargeType8Code tp;
    @XmlElement(name = "OthrChrgsTp")
    protected String othrChrgsTp;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType8Code }
     *     
     */
    public ChargeType8Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType8Code }
     *     
     */
    public ChargesDetails1 setTp(ChargeType8Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrChrgsTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrChrgsTp() {
        return othrChrgsTp;
    }

    /**
     * Sets the value of the othrChrgsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargesDetails1 setOthrChrgsTp(String value) {
        this.othrChrgsTp = value;
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
    public ChargesDetails1 setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

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
    public ChargesDetails1 setRate(BigDecimal value) {
        this.rate = value;
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
