
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
 * Choice between a status quantity or a quantity to receive for the quantity of financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrQuantityToReceive2Choice", propOrder = {
    "stsQty",
    "qtyToRcv"
})
public class StatusOrQuantityToReceive2Choice {

    @XmlElement(name = "StsQty")
    protected Quantity10Choice stsQty;
    @XmlElement(name = "QtyToRcv")
    protected Quantity10Choice qtyToRcv;

    /**
     * Gets the value of the stsQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getStsQty() {
        return stsQty;
    }

    /**
     * Sets the value of the stsQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public StatusOrQuantityToReceive2Choice setStsQty(Quantity10Choice value) {
        this.stsQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10Choice }
     *     
     */
    public Quantity10Choice getQtyToRcv() {
        return qtyToRcv;
    }

    /**
     * Sets the value of the qtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10Choice }
     *     
     */
    public StatusOrQuantityToReceive2Choice setQtyToRcv(Quantity10Choice value) {
        this.qtyToRcv = value;
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
