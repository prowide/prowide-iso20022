
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
 * Choice between securities quantities or an amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesQuantityOrAmount3Choice", propOrder = {
    "sctiesQty",
    "instdAmt"
})
public class SecuritiesQuantityOrAmount3Choice {

    @XmlElement(name = "SctiesQty")
    protected SecuritiesOption52 sctiesQty;
    @XmlElement(name = "InstdAmt")
    protected ActiveCurrencyAndAmount instdAmt;

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption52 }
     *     
     */
    public SecuritiesOption52 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption52 }
     *     
     */
    public SecuritiesQuantityOrAmount3Choice setSctiesQty(SecuritiesOption52 value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInstdAmt() {
        return instdAmt;
    }

    /**
     * Sets the value of the instdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SecuritiesQuantityOrAmount3Choice setInstdAmt(ActiveCurrencyAndAmount value) {
        this.instdAmt = value;
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
