
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
 * Provides the collateral movement direction that is a delivery and optionaly a return.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement8", propOrder = {
    "dlvr",
    "rtr"
})
public class CollateralMovement8 {

    @XmlElement(name = "Dlvr", required = true)
    protected Collateral12 dlvr;
    @XmlElement(name = "Rtr")
    protected Collateral11 rtr;

    /**
     * Gets the value of the dlvr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral12 }
     *     
     */
    public Collateral12 getDlvr() {
        return dlvr;
    }

    /**
     * Sets the value of the dlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral12 }
     *     
     */
    public CollateralMovement8 setDlvr(Collateral12 value) {
        this.dlvr = value;
        return this;
    }

    /**
     * Gets the value of the rtr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral11 }
     *     
     */
    public Collateral11 getRtr() {
        return rtr;
    }

    /**
     * Sets the value of the rtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral11 }
     *     
     */
    public CollateralMovement8 setRtr(Collateral11 value) {
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
