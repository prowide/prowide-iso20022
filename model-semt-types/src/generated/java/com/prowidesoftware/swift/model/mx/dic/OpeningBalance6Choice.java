
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
@XmlType(name = "OpeningBalance6Choice", propOrder = {
    "frst",
    "intrmy"
})
public class OpeningBalance6Choice {

    @XmlElement(name = "Frst")
    protected BalanceQuantity14Choice frst;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity14Choice intrmy;

    /**
     * Gets the value of the frst property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public BalanceQuantity14Choice getFrst() {
        return frst;
    }

    /**
     * Sets the value of the frst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public OpeningBalance6Choice setFrst(BalanceQuantity14Choice value) {
        this.frst = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public BalanceQuantity14Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity14Choice }
     *     
     */
    public OpeningBalance6Choice setIntrmy(BalanceQuantity14Choice value) {
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
