
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
 * Choice of quantity of assets to be transferred in percentage rate or units.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity14Choice", propOrder = {
    "unit",
    "pctgRate"
})
public class Quantity14Choice {

    @XmlElement(name = "Unit")
    protected Unit4 unit;
    @XmlElement(name = "PctgRate")
    protected BigDecimal pctgRate;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Unit4 }
     *     
     */
    public Unit4 getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unit4 }
     *     
     */
    public Quantity14Choice setUnit(Unit4 value) {
        this.unit = value;
        return this;
    }

    /**
     * Gets the value of the pctgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgRate() {
        return pctgRate;
    }

    /**
     * Sets the value of the pctgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Quantity14Choice setPctgRate(BigDecimal value) {
        this.pctgRate = value;
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
