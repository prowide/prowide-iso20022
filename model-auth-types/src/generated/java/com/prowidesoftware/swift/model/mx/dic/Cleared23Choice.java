
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
 * Indicates whether the contract was cleared, not cleared or if the contract is intended to be cleared.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cleared23Choice", propOrder = {
    "clrd",
    "intndToClear",
    "nonClrd"
})
public class Cleared23Choice {

    @XmlElement(name = "Clrd")
    protected ClearingPartyAndTime21Choice clrd;
    @XmlElement(name = "IntndToClear")
    protected ClearingPartyAndTime22Choice intndToClear;
    @XmlElement(name = "NonClrd")
    protected ClearingExceptionOrExemption3Choice nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime21Choice }
     *     
     */
    public ClearingPartyAndTime21Choice getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime21Choice }
     *     
     */
    public Cleared23Choice setClrd(ClearingPartyAndTime21Choice value) {
        this.clrd = value;
        return this;
    }

    /**
     * Gets the value of the intndToClear property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime22Choice }
     *     
     */
    public ClearingPartyAndTime22Choice getIntndToClear() {
        return intndToClear;
    }

    /**
     * Sets the value of the intndToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime22Choice }
     *     
     */
    public Cleared23Choice setIntndToClear(ClearingPartyAndTime22Choice value) {
        this.intndToClear = value;
        return this;
    }

    /**
     * Gets the value of the nonClrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionOrExemption3Choice }
     *     
     */
    public ClearingExceptionOrExemption3Choice getNonClrd() {
        return nonClrd;
    }

    /**
     * Sets the value of the nonClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionOrExemption3Choice }
     *     
     */
    public Cleared23Choice setNonClrd(ClearingExceptionOrExemption3Choice value) {
        this.nonClrd = value;
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
