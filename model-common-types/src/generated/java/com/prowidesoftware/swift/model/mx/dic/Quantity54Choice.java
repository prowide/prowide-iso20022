
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
 * Choice of format for the quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity54Choice", propOrder = {
    "qty",
    "orgnlAndCurFace"
})
public class Quantity54Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity36Choice qty;
    @XmlElement(name = "OrgnlAndCurFace")
    protected OriginalAndCurrentQuantities4 orgnlAndCurFace;

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
    public Quantity54Choice setQty(FinancialInstrumentQuantity36Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAndCurFace property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities4 }
     *     
     */
    public OriginalAndCurrentQuantities4 getOrgnlAndCurFace() {
        return orgnlAndCurFace;
    }

    /**
     * Sets the value of the orgnlAndCurFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities4 }
     *     
     */
    public Quantity54Choice setOrgnlAndCurFace(OriginalAndCurrentQuantities4 value) {
        this.orgnlAndCurFace = value;
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
