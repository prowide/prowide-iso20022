
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
@XmlType(name = "Quantity7Choice", propOrder = {
    "qty",
    "prtryQty"
})
public class Quantity7Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity15Choice qty;
    @XmlElement(name = "PrtryQty")
    protected ProprietaryQuantity4 prtryQty;

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
    public Quantity7Choice setQty(FinancialInstrumentQuantity15Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the prtryQty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryQuantity4 }
     *     
     */
    public ProprietaryQuantity4 getPrtryQty() {
        return prtryQty;
    }

    /**
     * Sets the value of the prtryQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryQuantity4 }
     *     
     */
    public Quantity7Choice setPrtryQty(ProprietaryQuantity4 value) {
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
