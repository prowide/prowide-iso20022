
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
@XmlType(name = "SubBalanceQuantity2Choice", propOrder = {
    "qty",
    "prtry",
    "qtyAndAvlbty"
})
public class SubBalanceQuantity2Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "Prtry")
    protected GenericIdentification15 prtry;
    @XmlElement(name = "QtyAndAvlbty")
    protected QuantityAndAvailability1 qtyAndAvlbty;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SubBalanceQuantity2Choice setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification15 }
     *     
     */
    public GenericIdentification15 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification15 }
     *     
     */
    public SubBalanceQuantity2Choice setPrtry(GenericIdentification15 value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the qtyAndAvlbty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndAvailability1 }
     *     
     */
    public QuantityAndAvailability1 getQtyAndAvlbty() {
        return qtyAndAvlbty;
    }

    /**
     * Sets the value of the qtyAndAvlbty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndAvailability1 }
     *     
     */
    public SubBalanceQuantity2Choice setQtyAndAvlbty(QuantityAndAvailability1 value) {
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
