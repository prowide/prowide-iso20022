
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
 * Choice between different quantity of security formats.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity57Choice", propOrder = {
    "orgnlAndCurFaceAmt",
    "sgndQty"
})
public class Quantity57Choice {

    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities7 orgnlAndCurFaceAmt;
    @XmlElement(name = "SgndQty")
    protected SignedQuantityFormat13 sgndQty;

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public OriginalAndCurrentQuantities7 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public Quantity57Choice setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities7 value) {
        this.orgnlAndCurFaceAmt = value;
        return this;
    }

    /**
     * Gets the value of the sgndQty property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getSgndQty() {
        return sgndQty;
    }

    /**
     * Sets the value of the sgndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public Quantity57Choice setSgndQty(SignedQuantityFormat13 value) {
        this.sgndQty = value;
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
