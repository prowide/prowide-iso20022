
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAvailability2", propOrder = {
    "qty",
    "avlbtyInd"
})
public class QuantityAndAvailability2 {

    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity15Choice qty;
    @XmlElement(name = "AvlbtyInd")
    protected boolean avlbtyInd;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public QuantityAndAvailability2 setQty(FinancialInstrumentQuantity15Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the avlbtyInd property.
     * 
     */
    public boolean isAvlbtyInd() {
        return avlbtyInd;
    }

    /**
     * Sets the value of the avlbtyInd property.
     * 
     */
    public QuantityAndAvailability2 setAvlbtyInd(boolean value) {
        this.avlbtyInd = value;
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
