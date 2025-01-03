
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Tangible items of value to a business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument97", propOrder = {
    "eqty",
    "warrt",
    "debt",
    "deriv"
})
public class FinancialInstrument97 {

    @XmlElement(name = "Eqty")
    protected Equity3 eqty;
    @XmlElement(name = "Warrt")
    protected Warrant4 warrt;
    @XmlElement(name = "Debt")
    protected Debt5 debt;
    @XmlElement(name = "Deriv")
    protected Derivative4 deriv;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link Equity3 }
     *     
     */
    public Equity3 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equity3 }
     *     
     */
    public FinancialInstrument97 setEqty(Equity3 value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the warrt property.
     * 
     * @return
     *     possible object is
     *     {@link Warrant4 }
     *     
     */
    public Warrant4 getWarrt() {
        return warrt;
    }

    /**
     * Sets the value of the warrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warrant4 }
     *     
     */
    public FinancialInstrument97 setWarrt(Warrant4 value) {
        this.warrt = value;
        return this;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Debt5 }
     *     
     */
    public Debt5 getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debt5 }
     *     
     */
    public FinancialInstrument97 setDebt(Debt5 value) {
        this.debt = value;
        return this;
    }

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative4 }
     *     
     */
    public Derivative4 getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative4 }
     *     
     */
    public FinancialInstrument97 setDeriv(Derivative4 value) {
        this.deriv = value;
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
