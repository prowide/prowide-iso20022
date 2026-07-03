
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
 * Provides the collateral movement direction that is a delivery and optionaly a return, or a return only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement2Choice", propOrder = {
    "collMvmntDtls",
    "rtr"
})
public class CollateralMovement2Choice {

    @XmlElement(name = "CollMvmntDtls")
    protected CollateralMovement3 collMvmntDtls;
    @XmlElement(name = "Rtr")
    protected Collateral4 rtr;

    /**
     * Gets the value of the collMvmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement3 }
     *     
     */
    public CollateralMovement3 getCollMvmntDtls() {
        return collMvmntDtls;
    }

    /**
     * Sets the value of the collMvmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement3 }
     *     
     */
    public CollateralMovement2Choice setCollMvmntDtls(CollateralMovement3 value) {
        this.collMvmntDtls = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral4 }
     *     
     */
    public Collateral4 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral4 }
     *     
     */
    public CollateralMovement2Choice setRtr(Collateral4 value) {
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
