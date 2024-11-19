
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Cleared16Choice", propOrder = {
    "clrd",
    "nonClrd"
})
public class Cleared16Choice {

    @XmlElement(name = "Clrd")
    protected ClearingPartyAndTime14 clrd;
    @XmlElement(name = "NonClrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime14 }
     *     
     */
    public ClearingPartyAndTime14 getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime14 }
     *     
     */
    public Cleared16Choice setClrd(ClearingPartyAndTime14 value) {
        this.clrd = value;
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
    public Cleared16Choice setNonClrd(NoReasonCode value) {
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
