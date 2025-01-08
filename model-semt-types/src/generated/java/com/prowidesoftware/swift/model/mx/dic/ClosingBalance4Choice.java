
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
@XmlType(name = "ClosingBalance4Choice", propOrder = {
    "fnl",
    "intrmy"
})
public class ClosingBalance4Choice {

    @XmlElement(name = "Fnl")
    protected BalanceQuantity8Choice fnl;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity8Choice intrmy;

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public BalanceQuantity8Choice getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public ClosingBalance4Choice setFnl(BalanceQuantity8Choice value) {
        this.fnl = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public BalanceQuantity8Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public ClosingBalance4Choice setIntrmy(BalanceQuantity8Choice value) {
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
