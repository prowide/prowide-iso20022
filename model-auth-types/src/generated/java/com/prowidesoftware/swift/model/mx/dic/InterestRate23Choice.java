
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
 * Specifies the type of a rate, a fixed or a floating rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate23Choice", propOrder = {
    "fxd",
    "fltg"
})
public class InterestRate23Choice {

    @XmlElement(name = "Fxd")
    protected FixedRate10 fxd;
    @XmlElement(name = "Fltg")
    protected FloatingRate7 fltg;

    /**
     * Gets the value of the fxd property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRate10 }
     *     
     */
    public FixedRate10 getFxd() {
        return fxd;
    }

    /**
     * Sets the value of the fxd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRate10 }
     *     
     */
    public InterestRate23Choice setFxd(FixedRate10 value) {
        this.fxd = value;
        return this;
    }

    /**
     * Gets the value of the fltg property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRate7 }
     *     
     */
    public FloatingRate7 getFltg() {
        return fltg;
    }

    /**
     * Sets the value of the fltg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRate7 }
     *     
     */
    public InterestRate23Choice setFltg(FloatingRate7 value) {
        this.fltg = value;
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
