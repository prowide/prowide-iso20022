
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
 * Choice of closing balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingBalance1Choice", propOrder = {
    "fnl",
    "intrmy"
})
public class ClosingBalance1Choice {

    @XmlElement(name = "Fnl")
    protected BalanceQuantity5Choice fnl;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity5Choice intrmy;

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public ClosingBalance1Choice setFnl(BalanceQuantity5Choice value) {
        this.fnl = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public ClosingBalance1Choice setIntrmy(BalanceQuantity5Choice value) {
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
