
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
 * Provides the collateral movement direction that is a delivery and optionally a return, or a return only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement5Choice", propOrder = {
    "collMvmntDrctn",
    "rtr"
})
public class CollateralMovement5Choice {

    @XmlElement(name = "CollMvmntDrctn")
    protected CollateralMovement11 collMvmntDrctn;
    @XmlElement(name = "Rtr")
    protected Collateral17 rtr;

    /**
     * Gets the value of the collMvmntDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement11 }
     *     
     */
    public CollateralMovement11 getCollMvmntDrctn() {
        return collMvmntDrctn;
    }

    /**
     * Sets the value of the collMvmntDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement11 }
     *     
     */
    public CollateralMovement5Choice setCollMvmntDrctn(CollateralMovement11 value) {
        this.collMvmntDrctn = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral17 }
     *     
     */
    public Collateral17 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral17 }
     *     
     */
    public CollateralMovement5Choice setRtr(Collateral17 value) {
        this.rtr = value;
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
