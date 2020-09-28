
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQuantity1", propOrder = {
    "qty",
    "qtyTp",
    "pric"
})
public class OrderQuantity1 {

    @XmlElement(name = "Qty", required = true)
    protected QuantityOrAmount1Choice qty;
    @XmlElement(name = "QtyTp")
    @XmlSchemaType(name = "string")
    protected OrderQuantityType3Code qtyTp;
    @XmlElement(name = "Pric")
    protected Price1 pric;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public QuantityOrAmount1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityOrAmount1Choice }
     *     
     */
    public OrderQuantity1 setQty(QuantityOrAmount1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the qtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType3Code }
     *     
     */
    public OrderQuantityType3Code getQtyTp() {
        return qtyTp;
    }

    /**
     * Sets the value of the qtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType3Code }
     *     
     */
    public OrderQuantity1 setQtyTp(OrderQuantityType3Code value) {
        this.qtyTp = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public OrderQuantity1 setPric(Price1 value) {
        this.pric = value;
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
