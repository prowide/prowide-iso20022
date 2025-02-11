
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
 * Specifies the choice between the major categories of financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product1Choice", propOrder = {
    "deriv",
    "sctiesFincgTx",
    "scty"
})
public class Product1Choice {

    @XmlElement(name = "Deriv")
    protected Derivative3 deriv;
    @XmlElement(name = "SctiesFincgTx")
    protected RepurchaseAgreement3 sctiesFincgTx;
    @XmlElement(name = "Scty")
    protected FinancialInstrument59 scty;

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative3 }
     *     
     */
    public Derivative3 getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative3 }
     *     
     */
    public Product1Choice setDeriv(Derivative3 value) {
        this.deriv = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTx property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreement3 }
     *     
     */
    public RepurchaseAgreement3 getSctiesFincgTx() {
        return sctiesFincgTx;
    }

    /**
     * Sets the value of the sctiesFincgTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreement3 }
     *     
     */
    public Product1Choice setSctiesFincgTx(RepurchaseAgreement3 value) {
        this.sctiesFincgTx = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument59 }
     *     
     */
    public FinancialInstrument59 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument59 }
     *     
     */
    public Product1Choice setScty(FinancialInstrument59 value) {
        this.scty = value;
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
