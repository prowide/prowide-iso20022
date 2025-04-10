
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates whether the contract was cleared or not.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cleared12Choice", propOrder = {
    "clrd",
    "intndToClear",
    "nonClrd"
})
public class Cleared12Choice {

    @XmlElement(name = "Clrd")
    protected ClearingPartyAndTime10 clrd;
    @XmlElement(name = "IntndToClear")
    protected ClearingPartyAndTime10 intndToClear;
    @XmlElement(name = "NonClrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime10 }
     *     
     */
    public ClearingPartyAndTime10 getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime10 }
     *     
     */
    public Cleared12Choice setClrd(ClearingPartyAndTime10 value) {
        this.clrd = value;
        return this;
    }

    /**
     * Gets the value of the intndToClear property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime10 }
     *     
     */
    public ClearingPartyAndTime10 getIntndToClear() {
        return intndToClear;
    }

    /**
     * Sets the value of the intndToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime10 }
     *     
     */
    public Cleared12Choice setIntndToClear(ClearingPartyAndTime10 value) {
        this.intndToClear = value;
        return this;
    }

    /**
     * Gets the value of the nonClrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNonClrd() {
        return nonClrd;
    }

    /**
     * Sets the value of the nonClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public Cleared12Choice setNonClrd(NoReasonCode value) {
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
