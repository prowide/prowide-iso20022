
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
 * Choice between an instructed quantity or a quantity to receive.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedOrQuantityToReceive1Choice", propOrder = {
    "instdQty",
    "qtyToRcv"
})
public class InstructedOrQuantityToReceive1Choice {

    @XmlElement(name = "InstdQty")
    protected Quantity5Choice instdQty;
    @XmlElement(name = "QtyToRcv")
    protected Quantity5Choice qtyToRcv;

    /**
     * Gets the value of the instdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity5Choice }
     *     
     */
    public Quantity5Choice getInstdQty() {
        return instdQty;
    }

    /**
     * Sets the value of the instdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity5Choice }
     *     
     */
    public InstructedOrQuantityToReceive1Choice setInstdQty(Quantity5Choice value) {
        this.instdQty = value;
        return this;
    }

    /**
     * Gets the value of the qtyToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity5Choice }
     *     
     */
    public Quantity5Choice getQtyToRcv() {
        return qtyToRcv;
    }

    /**
     * Sets the value of the qtyToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity5Choice }
     *     
     */
    public InstructedOrQuantityToReceive1Choice setQtyToRcv(Quantity5Choice value) {
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
