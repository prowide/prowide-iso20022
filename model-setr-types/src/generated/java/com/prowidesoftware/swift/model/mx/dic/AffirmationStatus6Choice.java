
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
 * Choice of status for the affirmation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffirmationStatus6Choice", propOrder = {
    "affrmd",
    "uaffrmd",
    "prtrySts"
})
public class AffirmationStatus6Choice {

    @XmlElement(name = "Affrmd")
    protected ProprietaryReason1 affrmd;
    @XmlElement(name = "Uaffrmd")
    protected AffirmationReason1Choice uaffrmd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason1 prtrySts;

    /**
     * Gets the value of the affrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getAffrmd() {
        return affrmd;
    }

    /**
     * Sets the value of the affrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public AffirmationStatus6Choice setAffrmd(ProprietaryReason1 value) {
        this.affrmd = value;
        return this;
    }

    /**
     * Gets the value of the uaffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationReason1Choice }
     *     
     */
    public AffirmationReason1Choice getUaffrmd() {
        return uaffrmd;
    }

    /**
     * Sets the value of the uaffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationReason1Choice }
     *     
     */
    public AffirmationStatus6Choice setUaffrmd(AffirmationReason1Choice value) {
        this.uaffrmd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public AffirmationStatus6Choice setPrtrySts(ProprietaryStatusAndReason1 value) {
        this.prtrySts = value;
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
