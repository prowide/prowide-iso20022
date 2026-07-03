
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides an amount choice between currency or digital token.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyOrDigitalTokenAmount1Choice", propOrder = {
    "amt",
    "dgtlTknAmt"
})
public class CurrencyOrDigitalTokenAmount1Choice {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "DgtlTknAmt")
    protected DigitalTokenAmount1 dgtlTknAmt;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dgtlTknAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalTokenAmount1 }
     *     
     */
    public DigitalTokenAmount1 getDgtlTknAmt() {
        return dgtlTknAmt;
    }

    /**
     * Sets the value of the dgtlTknAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalTokenAmount1 }
     *     
     */
    public CurrencyOrDigitalTokenAmount1Choice setDgtlTknAmt(DigitalTokenAmount1 value) {
        this.dgtlTknAmt = value;
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
