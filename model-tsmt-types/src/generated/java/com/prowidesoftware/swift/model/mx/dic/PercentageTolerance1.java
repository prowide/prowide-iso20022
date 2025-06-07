
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Variance allowed on a quantity or on a price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageTolerance1", propOrder = {
    "plusPct",
    "mnsPct"
})
public class PercentageTolerance1 {

    @XmlElement(name = "PlusPct", required = true)
    protected BigDecimal plusPct;
    @XmlElement(name = "MnsPct", required = true)
    protected BigDecimal mnsPct;

    /**
     * Gets the value of the plusPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlusPct() {
        return plusPct;
    }

    /**
     * Sets the value of the plusPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentageTolerance1 setPlusPct(BigDecimal value) {
        this.plusPct = value;
        return this;
    }

    /**
     * Gets the value of the mnsPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnsPct() {
        return mnsPct;
    }

    /**
     * Sets the value of the mnsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentageTolerance1 setMnsPct(BigDecimal value) {
        this.mnsPct = value;
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
