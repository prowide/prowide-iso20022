
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
 * Defined variation amount and balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmount4", propOrder = {
    "vartnAmt",
    "balAmt"
})
public class UndertakingAmount4 {

    @XmlElement(name = "VartnAmt", required = true)
    protected ActiveCurrencyAndAmount vartnAmt;
    @XmlElement(name = "BalAmt")
    protected ActiveCurrencyAndAmount balAmt;

    /**
     * Gets the value of the vartnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getVartnAmt() {
        return vartnAmt;
    }

    /**
     * Sets the value of the vartnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UndertakingAmount4 setVartnAmt(ActiveCurrencyAndAmount value) {
        this.vartnAmt = value;
        return this;
    }

    /**
     * Gets the value of the balAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBalAmt() {
        return balAmt;
    }

    /**
     * Sets the value of the balAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public UndertakingAmount4 setBalAmt(ActiveCurrencyAndAmount value) {
        this.balAmt = value;
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
