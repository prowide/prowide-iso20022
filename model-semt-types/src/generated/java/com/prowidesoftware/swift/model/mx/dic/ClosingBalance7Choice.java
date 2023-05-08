
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
 * Choice of closing balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance7Choice", propOrder = {
    "fnl",
    "intrmy"
})
public class ClosingBalance7Choice {

    @XmlElement(name = "Fnl")
    protected BalanceQuantity17Choice fnl;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity17Choice intrmy;

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public BalanceQuantity17Choice getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public ClosingBalance7Choice setFnl(BalanceQuantity17Choice value) {
        this.fnl = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public BalanceQuantity17Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity17Choice }
     *     
     */
    public ClosingBalance7Choice setIntrmy(BalanceQuantity17Choice value) {
        this.intrmy = value;
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
