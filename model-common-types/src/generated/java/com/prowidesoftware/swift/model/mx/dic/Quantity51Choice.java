
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
 * Choice of format for the quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity51Choice", propOrder = {
    "qty",
    "orgnlAndCurFace"
})
public class Quantity51Choice {

    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "OrgnlAndCurFace")
    protected OriginalAndCurrentQuantities1 orgnlAndCurFace;

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
    public Quantity51Choice setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAndCurFace property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities1 }
     *     
     */
    public OriginalAndCurrentQuantities1 getOrgnlAndCurFace() {
        return orgnlAndCurFace;
    }

    /**
     * Sets the value of the orgnlAndCurFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities1 }
     *     
     */
    public Quantity51Choice setOrgnlAndCurFace(OriginalAndCurrentQuantities1 value) {
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
