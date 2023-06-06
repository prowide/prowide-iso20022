
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
 * Details related to interest rate attributes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateLegs9", propOrder = {
    "frstLeg",
    "scndLeg"
})
public class InterestRateLegs9 {

    @XmlElement(name = "FrstLeg")
    protected InterestRate23Choice frstLeg;
    @XmlElement(name = "ScndLeg")
    protected InterestRate23Choice scndLeg;

    /**
     * Gets the value of the frstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate23Choice }
     *     
     */
    public InterestRate23Choice getFrstLeg() {
        return frstLeg;
    }

    /**
     * Sets the value of the frstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate23Choice }
     *     
     */
    public InterestRateLegs9 setFrstLeg(InterestRate23Choice value) {
        this.frstLeg = value;
        return this;
    }

    /**
     * Gets the value of the scndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate23Choice }
     *     
     */
    public InterestRate23Choice getScndLeg() {
        return scndLeg;
    }

    /**
     * Sets the value of the scndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate23Choice }
     *     
     */
    public InterestRateLegs9 setScndLeg(InterestRate23Choice value) {
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
