
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
 * Provides the collateral movement direction that is a delivery and optionally a return, or a return only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement6Choice", propOrder = {
    "collMvmntDrctn",
    "rtr"
})
public class CollateralMovement6Choice {

    @XmlElement(name = "CollMvmntDrctn")
    protected CollateralMovement13 collMvmntDrctn;
    @XmlElement(name = "Rtr")
    protected Collateral54 rtr;

    /**
     * Gets the value of the collMvmntDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement13 }
     *     
     */
    public CollateralMovement13 getCollMvmntDrctn() {
        return collMvmntDrctn;
    }

    /**
     * Sets the value of the collMvmntDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement13 }
     *     
     */
    public CollateralMovement6Choice setCollMvmntDrctn(CollateralMovement13 value) {
        this.collMvmntDrctn = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral54 }
     *     
     */
    public Collateral54 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral54 }
     *     
     */
    public CollateralMovement6Choice setRtr(Collateral54 value) {
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
