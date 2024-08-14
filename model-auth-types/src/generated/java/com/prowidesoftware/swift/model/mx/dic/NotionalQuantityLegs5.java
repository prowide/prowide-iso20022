
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
 * Indicates the notional quantity of the underlying assets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalQuantityLegs5", propOrder = {
    "frstLeg",
    "scndLeg"
})
public class NotionalQuantityLegs5 {

    @XmlElement(name = "FrstLeg")
    protected NotionalQuantity9 frstLeg;
    @XmlElement(name = "ScndLeg")
    protected NotionalQuantity9 scndLeg;

    /**
     * Gets the value of the frstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantity9 }
     *     
     */
    public NotionalQuantity9 getFrstLeg() {
        return frstLeg;
    }

    /**
     * Sets the value of the frstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantity9 }
     *     
     */
    public NotionalQuantityLegs5 setFrstLeg(NotionalQuantity9 value) {
        this.frstLeg = value;
        return this;
    }

    /**
     * Gets the value of the scndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalQuantity9 }
     *     
     */
    public NotionalQuantity9 getScndLeg() {
        return scndLeg;
    }

    /**
     * Sets the value of the scndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalQuantity9 }
     *     
     */
    public NotionalQuantityLegs5 setScndLeg(NotionalQuantity9 value) {
        this.scndLeg = value;
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
