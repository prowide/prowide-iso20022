
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
 * Provides the collateral movement direction that is a delivery and optionaly a return, or a return only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement1Choice", propOrder = {
    "collMvmntDtls",
    "rtr"
})
public class CollateralMovement1Choice {

    @XmlElement(name = "CollMvmntDtls")
    protected CollateralMovement2 collMvmntDtls;
    @XmlElement(name = "Rtr")
    protected Collateral2 rtr;

    /**
     * Gets the value of the collMvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement2 }
     *     
     */
    public CollateralMovement2 getCollMvmntDtls() {
        return collMvmntDtls;
    }

    /**
     * Sets the value of the collMvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement2 }
     *     
     */
    public CollateralMovement1Choice setCollMvmntDtls(CollateralMovement2 value) {
        this.collMvmntDtls = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral2 }
     *     
     */
    public Collateral2 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral2 }
     *     
     */
    public CollateralMovement1Choice setRtr(Collateral2 value) {
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
