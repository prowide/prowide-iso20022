
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
 * Choice between formats for the balance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceQuantity1Choice", propOrder = {
    "qty",
    "qtyAsDSS",
    "qtyAndAvlbty"
})
public class SubBalanceQuantity1Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "QtyAsDSS")
    protected GenericIdentification6 qtyAsDSS;
    @XmlElement(name = "QtyAndAvlbty")
    protected QuantityAndAvailability qtyAndAvlbty;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public SubBalanceQuantity1Choice setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the qtyAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification6 }
     *     
     */
    public GenericIdentification6 getQtyAsDSS() {
        return qtyAsDSS;
    }

    /**
     * Sets the value of the qtyAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification6 }
     *     
     */
    public SubBalanceQuantity1Choice setQtyAsDSS(GenericIdentification6 value) {
        this.qtyAsDSS = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAvlbty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAvailability }
     *     
     */
    public QuantityAndAvailability getQtyAndAvlbty() {
        return qtyAndAvlbty;
    }

    /**
     * Sets the value of the qtyAndAvlbty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAvailability }
     *     
     */
    public SubBalanceQuantity1Choice setQtyAndAvlbty(QuantityAndAvailability value) {
        this.qtyAndAvlbty = value;
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
