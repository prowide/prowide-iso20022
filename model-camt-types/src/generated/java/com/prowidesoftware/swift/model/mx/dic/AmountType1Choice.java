
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
 * Amount of money to be transferred between the debtor and creditor, expressed in debtor's account currency or converted in another currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType1Choice", propOrder = {
    "instdAmt",
    "eqvtAmt"
})
public class AmountType1Choice {

    @XmlElement(name = "InstdAmt")
    protected CurrencyAndAmount instdAmt;
    @XmlElement(name = "EqvtAmt")
    protected EquivalentAmount eqvtAmt;

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public AmountType1Choice setInstdAmt(CurrencyAndAmount value) {
        this.instdAmt = value;
        return this;
    }

    /**
     * Gets the value of the eqvtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EquivalentAmount }
     *     
     */
    public EquivalentAmount getEqvtAmt() {
        return eqvtAmt;
    }

    /**
     * Sets the value of the eqvtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalentAmount }
     *     
     */
    public AmountType1Choice setEqvtAmt(EquivalentAmount value) {
        this.eqvtAmt = value;
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
