
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
 * Limit for a percentage rate range.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRangeBoundary1", propOrder = {
    "bdryRate",
    "incl"
})
public class PercentageRangeBoundary1 {

    @XmlElement(name = "BdryRate", required = true)
    protected BigDecimal bdryRate;
    @XmlElement(name = "Incl")
    protected boolean incl;

    /**
     * Gets the value of the bdryRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBdryRate() {
        return bdryRate;
    }

    /**
     * Sets the value of the bdryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PercentageRangeBoundary1 setBdryRate(BigDecimal value) {
        this.bdryRate = value;
        return this;
    }

    /**
     * Gets the value of the incl property.
     * 
     */
    public boolean isIncl() {
        return incl;
    }

    /**
     * Sets the value of the incl property.
     * 
     */
    public PercentageRangeBoundary1 setIncl(boolean value) {
        this.incl = value;
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
