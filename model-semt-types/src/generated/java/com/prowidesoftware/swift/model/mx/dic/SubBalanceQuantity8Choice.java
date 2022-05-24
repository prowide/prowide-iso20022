
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
@XmlType(name = "SubBalanceQuantity8Choice", propOrder = {
    "qty",
    "prtry",
    "qtyAndAvlbty"
})
public class SubBalanceQuantity8Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "Prtry")
    protected GenericIdentification56 prtry;
    @XmlElement(name = "QtyAndAvlbty")
    protected QuantityAndAvailability3 qtyAndAvlbty;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public SubBalanceQuantity8Choice setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification56 }
     *     
     */
    public GenericIdentification56 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification56 }
     *     
     */
    public SubBalanceQuantity8Choice setPrtry(GenericIdentification56 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAvlbty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAvailability3 }
     *     
     */
    public QuantityAndAvailability3 getQtyAndAvlbty() {
        return qtyAndAvlbty;
    }

    /**
     * Sets the value of the qtyAndAvlbty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAvailability3 }
     *     
     */
    public SubBalanceQuantity8Choice setQtyAndAvlbty(QuantityAndAvailability3 value) {
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
