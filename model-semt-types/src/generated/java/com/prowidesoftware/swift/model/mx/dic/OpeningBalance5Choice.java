
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
 * Choice of opening balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance5Choice", propOrder = {
    "frst",
    "intrmy"
})
public class OpeningBalance5Choice {

    @XmlElement(name = "Frst")
    protected BalanceQuantity12Choice frst;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity12Choice intrmy;

    /**
     * Gets the value of the frst property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity12Choice }
     *     
     */
    public BalanceQuantity12Choice getFrst() {
        return frst;
    }

    /**
     * Sets the value of the frst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity12Choice }
     *     
     */
    public OpeningBalance5Choice setFrst(BalanceQuantity12Choice value) {
        this.frst = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity12Choice }
     *     
     */
    public BalanceQuantity12Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity12Choice }
     *     
     */
    public OpeningBalance5Choice setIntrmy(BalanceQuantity12Choice value) {
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
