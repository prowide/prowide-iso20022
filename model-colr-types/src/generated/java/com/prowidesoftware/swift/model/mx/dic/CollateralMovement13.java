
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
 * Provides the collateral movement direction that is a delivery and optionally a return.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement13", propOrder = {
    "dlvr",
    "rtr"
})
public class CollateralMovement13 {

    @XmlElement(name = "Dlvr", required = true)
    protected Collateral55 dlvr;
    @XmlElement(name = "Rtr")
    protected Collateral54 rtr;

    /**
     * Gets the value of the dlvr property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral55 }
     *     
     */
    public Collateral55 getDlvr() {
        return dlvr;
    }

    /**
     * Sets the value of the dlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral55 }
     *     
     */
    public CollateralMovement13 setDlvr(Collateral55 value) {
        this.dlvr = value;
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
    public CollateralMovement13 setRtr(Collateral54 value) {
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
