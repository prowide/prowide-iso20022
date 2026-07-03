
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
 * Choice of opening balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningBalance4Choice", propOrder = {
    "frst",
    "intrmy"
})
public class OpeningBalance4Choice {

    @XmlElement(name = "Frst")
    protected BalanceQuantity8Choice frst;
    @XmlElement(name = "Intrmy")
    protected BalanceQuantity8Choice intrmy;

    /**
     * Gets the value of the frst property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public BalanceQuantity8Choice getFrst() {
        return frst;
    }

    /**
     * Sets the value of the frst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity8Choice }
     *     
     */
    public OpeningBalance4Choice setFrst(BalanceQuantity8Choice value) {
        this.frst = value;
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
    public OpeningBalance4Choice setIntrmy(BalanceQuantity8Choice value) {
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
