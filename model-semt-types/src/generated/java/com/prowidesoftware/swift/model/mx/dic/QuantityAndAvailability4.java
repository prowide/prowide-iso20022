
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, for example, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndAvailability4", propOrder = {
    "qty",
    "avlbtyInd"
})
public class QuantityAndAvailability4 {

    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity36Choice qty;
    @XmlElement(name = "AvlbtyInd")
    protected boolean avlbtyInd;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public QuantityAndAvailability4 setQty(FinancialInstrumentQuantity36Choice value) {
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
    public QuantityAndAvailability4 setAvlbtyInd(boolean value) {
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
