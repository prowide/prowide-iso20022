
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
 * Choice of amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount1Choice", propOrder = {
    "incrAmt",
    "dcrAmt"
})
public class Amount1Choice {

    @XmlElement(name = "IncrAmt")
    protected ActiveCurrencyAndAmount incrAmt;
    @XmlElement(name = "DcrAmt")
    protected ActiveCurrencyAndAmount dcrAmt;

    /**
     * Gets the value of the incrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncrAmt() {
        return incrAmt;
    }

    /**
     * Sets the value of the incrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Amount1Choice setIncrAmt(ActiveCurrencyAndAmount value) {
        this.incrAmt = value;
        return this;
    }

    /**
     * Gets the value of the dcrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDcrAmt() {
        return dcrAmt;
    }

    /**
     * Sets the value of the dcrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Amount1Choice setDcrAmt(ActiveCurrencyAndAmount value) {
        this.dcrAmt = value;
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
