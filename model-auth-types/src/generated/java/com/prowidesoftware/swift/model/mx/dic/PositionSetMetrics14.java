
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
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetMetrics14", propOrder = {
    "ttl",
    "clean"
})
public class PositionSetMetrics14 {

    @XmlElement(name = "Ttl")
    protected PositionSetBuyerAndSeller2 ttl;
    @XmlElement(name = "Clean")
    protected PositionSetBuyerAndSeller2 clean;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetBuyerAndSeller2 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetMetrics14 setTtl(PositionSetBuyerAndSeller2 value) {
        this.ttl = value;
        return this;
    }

    /**
     * Gets the value of the clean property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetBuyerAndSeller2 getClean() {
        return clean;
    }

    /**
     * Sets the value of the clean property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSetBuyerAndSeller2 }
     *     
     */
    public PositionSetMetrics14 setClean(PositionSetBuyerAndSeller2 value) {
        this.clean = value;
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
