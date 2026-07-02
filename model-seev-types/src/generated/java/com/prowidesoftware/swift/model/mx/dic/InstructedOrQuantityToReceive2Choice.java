
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
 * Choice between an instructed quantity or a quantity to receive.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedOrQuantityToReceive2Choice", propOrder = {
    "instdQty",
    "qtyToRcv"
})
public class InstructedOrQuantityToReceive2Choice {

    @XmlElement(name = "InstdQty")
    protected Quantity11Choice instdQty;
    @XmlElement(name = "QtyToRcv")
    protected Quantity11Choice qtyToRcv;

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity11Choice }
     *     
     */
    public Quantity11Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity11Choice }
     *     
     */
    public InstructedOrQuantityToReceive2Choice setInstdQty(Quantity11Choice value) {
        this.instdQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity11Choice }
     *     
     */
    public Quantity11Choice getQtyToRcv() {
        return qtyToRcv;
    }

    /**
     * Sets the value of the qtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity11Choice }
     *     
     */
    public InstructedOrQuantityToReceive2Choice setQtyToRcv(Quantity11Choice value) {
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
