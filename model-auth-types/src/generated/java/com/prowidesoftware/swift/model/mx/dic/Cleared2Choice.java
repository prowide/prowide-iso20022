
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
@XmlType(name = "Cleared2Choice", propOrder = {
    "clrd",
    "nonClrd"
})
public class Cleared2Choice {

    @XmlElement(name = "Clrd")
    protected ClearingPartyAndTime7 clrd;
    @XmlElement(name = "NonClrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode nonClrd;

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingPartyAndTime7 }
     *     
     */
    public ClearingPartyAndTime7 getClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingPartyAndTime7 }
     *     
     */
    public Cleared2Choice setClrd(ClearingPartyAndTime7 value) {
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
    public Cleared2Choice setNonClrd(NoReasonCode value) {
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
