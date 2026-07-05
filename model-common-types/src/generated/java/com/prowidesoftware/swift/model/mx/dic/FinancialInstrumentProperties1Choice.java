
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
 * Alternative identification of a financial instrument other than an identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentProperties1Choice", propOrder = {
    "eqty",
    "debt",
    "optn",
    "warrt",
    "futr"
})
public class FinancialInstrumentProperties1Choice {

    @XmlElement(name = "Eqty")
    protected Equity1 eqty;
    @XmlElement(name = "Debt")
    protected Debt1 debt;
    @XmlElement(name = "Optn")
    protected Option1 optn;
    @XmlElement(name = "Warrt")
    protected Warrant1 warrt;
    @XmlElement(name = "Futr")
    protected Future1 futr;

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link Equity1 }
     *     
     */
    public Equity1 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equity1 }
     *     
     */
    public FinancialInstrumentProperties1Choice setEqty(Equity1 value) {
        this.eqty = value;
        return this;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Debt1 }
     *     
     */
    public Debt1 getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debt1 }
     *     
     */
    public FinancialInstrumentProperties1Choice setDebt(Debt1 value) {
        this.debt = value;
        return this;
    }

    /**
     * Gets the value of the optn property.
     * 
     * @return
     *     possible object is
     *     {@link Option1 }
     *     
     */
    public Option1 getOptn() {
        return optn;
    }

    /**
     * Sets the value of the optn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option1 }
     *     
     */
    public FinancialInstrumentProperties1Choice setOptn(Option1 value) {
        this.optn = value;
        return this;
    }

    /**
     * Gets the value of the warrt property.
     * 
     * @return
     *     possible object is
     *     {@link Warrant1 }
     *     
     */
    public Warrant1 getWarrt() {
        return warrt;
    }

    /**
     * Sets the value of the warrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Warrant1 }
     *     
     */
    public FinancialInstrumentProperties1Choice setWarrt(Warrant1 value) {
        this.warrt = value;
        return this;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link Future1 }
     *     
     */
    public Future1 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Future1 }
     *     
     */
    public FinancialInstrumentProperties1Choice setFutr(Future1 value) {
        this.futr = value;
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
