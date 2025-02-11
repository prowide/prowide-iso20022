
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
 * Choice for transparency calculation specific details on commodities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityDerivate2Choice", propOrder = {
    "frght",
    "nrgy"
})
public class CommodityDerivate2Choice {

    @XmlElement(name = "Frght")
    protected CommodityDerivate5 frght;
    @XmlElement(name = "Nrgy")
    protected CommodityDerivate6 nrgy;

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivate5 }
     *     
     */
    public CommodityDerivate5 getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivate5 }
     *     
     */
    public CommodityDerivate2Choice setFrght(CommodityDerivate5 value) {
        this.frght = value;
        return this;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivate6 }
     *     
     */
    public CommodityDerivate6 getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivate6 }
     *     
     */
    public CommodityDerivate2Choice setNrgy(CommodityDerivate6 value) {
        this.nrgy = value;
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
