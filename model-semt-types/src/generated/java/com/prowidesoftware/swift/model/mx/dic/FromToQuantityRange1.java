
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
 * Range of quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromToQuantityRange1", propOrder = {
    "frQty",
    "toQty"
})
public class FromToQuantityRange1 {

    @XmlElement(name = "FrQty", required = true)
    protected QuantityRangeBoundary1 frQty;
    @XmlElement(name = "ToQty", required = true)
    protected QuantityRangeBoundary1 toQty;

    /**
     * Gets the value of the frQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRangeBoundary1 }
     *     
     */
    public QuantityRangeBoundary1 getFrQty() {
        return frQty;
    }

    /**
     * Sets the value of the frQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRangeBoundary1 }
     *     
     */
    public FromToQuantityRange1 setFrQty(QuantityRangeBoundary1 value) {
        this.frQty = value;
        return this;
    }

    /**
     * Gets the value of the toQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRangeBoundary1 }
     *     
     */
    public QuantityRangeBoundary1 getToQty() {
        return toQty;
    }

    /**
     * Sets the value of the toQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRangeBoundary1 }
     *     
     */
    public FromToQuantityRange1 setToQty(QuantityRangeBoundary1 value) {
        this.toQty = value;
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
