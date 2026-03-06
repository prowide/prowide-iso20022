
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between ranges of values in which a quantity is considered valid or a specified quantity value which has to be matched or unmatched to be valid.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityRange1Choice__1", propOrder = {
    "frQty",
    "toQty",
    "frToQty",
    "eqQty"
})
public class QuantityRange1Choice1 {

    @XmlElement(name = "FrQty")
    protected QuantityRangeBoundary11 frQty;
    @XmlElement(name = "ToQty")
    protected QuantityRangeBoundary11 toQty;
    @XmlElement(name = "FrToQty")
    protected FromToQuantityRange11 frToQty;
    @XmlElement(name = "EQQty")
    protected BigDecimal eqQty;

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
    public QuantityRange1Choice1 setFrQty(QuantityRangeBoundary11 value) {
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
    public QuantityRange1Choice1 setToQty(QuantityRangeBoundary11 value) {
        this.toQty = value;
        return this;
    }

    /**
     * Gets the value of the frToQty property.
     * 
     * @return
     *     possible object is
     *     {@link FromToQuantityRange11 }
     *     
     */
    public FromToQuantityRange11 getFrToQty() {
        return frToQty;
    }

    /**
     * Sets the value of the frToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToQuantityRange11 }
     *     
     */
    public QuantityRange1Choice1 setFrToQty(FromToQuantityRange11 value) {
        this.frToQty = value;
        return this;
    }

    /**
     * Gets the value of the eqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQQty() {
        return eqQty;
    }

    /**
     * Sets the value of the eqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QuantityRange1Choice1 setEQQty(BigDecimal value) {
        this.eqQty = value;
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
