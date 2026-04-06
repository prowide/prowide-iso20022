
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
 * Range of quantities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromToQuantityRange1__1", propOrder = {
    "frQty",
    "toQty"
})
public class FromToQuantityRange11 {

    @XmlElement(name = "FrQty", required = true)
    protected QuantityRangeBoundary11 frQty;
    @XmlElement(name = "ToQty", required = true)
    protected QuantityRangeBoundary11 toQty;

    /**
     * Gets the value of the frQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRangeBoundary11 }
     *     
     */
    public QuantityRangeBoundary11 getFrQty() {
        return frQty;
    }

    /**
     * Sets the value of the frQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRangeBoundary11 }
     *     
     */
    public FromToQuantityRange11 setFrQty(QuantityRangeBoundary11 value) {
        this.frQty = value;
        return this;
    }

    /**
     * Gets the value of the toQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityRangeBoundary11 }
     *     
     */
    public QuantityRangeBoundary11 getToQty() {
        return toQty;
    }

    /**
     * Sets the value of the toQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityRangeBoundary11 }
     *     
     */
    public FromToQuantityRange11 setToQty(QuantityRangeBoundary11 value) {
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
