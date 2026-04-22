
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
@XmlType(name = "QuantityRange1Choice", propOrder = {
    "frQty",
    "toQty",
    "frToQty",
    "eqQty",
    "neqQty"
})
public class QuantityRange1Choice {

    @XmlElement(name = "FrQty")
    protected QuantityRangeBoundary1 frQty;
    @XmlElement(name = "ToQty")
    protected QuantityRangeBoundary1 toQty;
    @XmlElement(name = "FrToQty")
    protected FromToQuantityRange1 frToQty;
    @XmlElement(name = "EQQty")
    protected BigDecimal eqQty;
    @XmlElement(name = "NEQQty")
    protected BigDecimal neqQty;

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
    public QuantityRange1Choice setFrQty(QuantityRangeBoundary1 value) {
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
    public QuantityRange1Choice setToQty(QuantityRangeBoundary1 value) {
        this.toQty = value;
        return this;
    }

    /**
     * Gets the value of the frToQty property.
     * 
     * @return
     *     possible object is
     *     {@link FromToQuantityRange1 }
     *     
     */
    public FromToQuantityRange1 getFrToQty() {
        return frToQty;
    }

    /**
     * Sets the value of the frToQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToQuantityRange1 }
     *     
     */
    public QuantityRange1Choice setFrToQty(FromToQuantityRange1 value) {
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
    public QuantityRange1Choice setEQQty(BigDecimal value) {
        this.eqQty = value;
        return this;
    }

    /**
     * Gets the value of the neqQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQQty() {
        return neqQty;
    }

    /**
     * Sets the value of the neqQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public QuantityRange1Choice setNEQQty(BigDecimal value) {
        this.neqQty = value;
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
