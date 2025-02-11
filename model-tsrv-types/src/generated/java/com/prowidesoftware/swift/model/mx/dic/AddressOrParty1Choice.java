
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
 * Choice of either address, or name and address.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressOrParty1Choice", propOrder = {
    "newAdr",
    "newBnfcry"
})
public class AddressOrParty1Choice {

    @XmlElement(name = "NewAdr")
    protected PostalAddress6 newAdr;
    @XmlElement(name = "NewBnfcry")
    protected NameAndAddress10 newBnfcry;

    /**
     * Gets the value of the newAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getNewAdr() {
        return newAdr;
    }

    /**
     * Sets the value of the newAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public AddressOrParty1Choice setNewAdr(PostalAddress6 value) {
        this.newAdr = value;
        return this;
    }

    /**
     * Gets the value of the newBnfcry property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *     
     */
    public NameAndAddress10 getNewBnfcry() {
        return newBnfcry;
    }

    /**
     * Sets the value of the newBnfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *     
     */
    public AddressOrParty1Choice setNewBnfcry(NameAndAddress10 value) {
        this.newBnfcry = value;
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
