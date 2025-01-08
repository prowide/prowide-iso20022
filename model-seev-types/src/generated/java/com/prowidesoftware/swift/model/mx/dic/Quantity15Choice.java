
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
 * Choice between different quantity of security formats.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity15Choice", propOrder = {
    "qtyChc",
    "prtryQty"
})
public class Quantity15Choice {

    @XmlElement(name = "QtyChc")
    protected Quantity16Choice qtyChc;
    @XmlElement(name = "PrtryQty")
    protected ProprietaryQuantity6 prtryQty;

    /**
     * Gets the value of the qtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16Choice }
     *     
     */
    public Quantity16Choice getQtyChc() {
        return qtyChc;
    }

    /**
     * Sets the value of the qtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16Choice }
     *     
     */
    public Quantity15Choice setQtyChc(Quantity16Choice value) {
        this.qtyChc = value;
        return this;
    }

    /**
     * Gets the value of the prtryQty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity6 }
     *     
     */
    public ProprietaryQuantity6 getPrtryQty() {
        return prtryQty;
    }

    /**
     * Sets the value of the prtryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity6 }
     *     
     */
    public Quantity15Choice setPrtryQty(ProprietaryQuantity6 value) {
        this.prtryQty = value;
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
