
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
 * Indicates the monetary or converted amount for the derivatives transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalAmountLegs6", propOrder = {
    "frstLeg",
    "scndLeg"
})
public class NotionalAmountLegs6 {

    @XmlElement(name = "FrstLeg")
    protected NotionalAmount7 frstLeg;
    @XmlElement(name = "ScndLeg")
    protected NotionalAmount7 scndLeg;

    /**
     * Gets the value of the frstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount7 }
     *     
     */
    public NotionalAmount7 getFrstLeg() {
        return frstLeg;
    }

    /**
     * Sets the value of the frstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount7 }
     *     
     */
    public NotionalAmountLegs6 setFrstLeg(NotionalAmount7 value) {
        this.frstLeg = value;
        return this;
    }

    /**
     * Gets the value of the scndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount7 }
     *     
     */
    public NotionalAmount7 getScndLeg() {
        return scndLeg;
    }

    /**
     * Sets the value of the scndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount7 }
     *     
     */
    public NotionalAmountLegs6 setScndLeg(NotionalAmount7 value) {
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
