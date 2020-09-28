
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
 * Percentage of the net asset value held by retail investors.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liability1", propOrder = {
    "estmtdRate",
    "preciseRate"
})
public class Liability1 {

    @XmlElement(name = "EstmtdRate", required = true)
    protected BigDecimal estmtdRate;
    @XmlElement(name = "PreciseRate", required = true)
    protected BigDecimal preciseRate;

    /**
     * Gets the value of the estmtdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstmtdRate() {
        return estmtdRate;
    }

    /**
     * Sets the value of the estmtdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Liability1 setEstmtdRate(BigDecimal value) {
        this.estmtdRate = value;
        return this;
    }

    /**
     * Gets the value of the preciseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreciseRate() {
        return preciseRate;
    }

    /**
     * Sets the value of the preciseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Liability1 setPreciseRate(BigDecimal value) {
        this.preciseRate = value;
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
