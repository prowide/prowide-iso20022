
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
@XmlType(name = "AffirmationStatus11Choice", propOrder = {
    "affrmd",
    "uaffrmd",
    "prtrySts"
})
public class AffirmationStatus11Choice {

    @XmlElement(name = "Affrmd")
    protected ProprietaryReason4 affrmd;
    @XmlElement(name = "Uaffrmd")
    protected AffirmationReason2Choice uaffrmd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the affrmd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAffrmd() {
        return affrmd;
    }

    /**
     * Sets the value of the affrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public AffirmationStatus11Choice setAffrmd(ProprietaryReason4 value) {
        this.affrmd = value;
        return this;
    }

    /**
     * Gets the value of the uaffrmd property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationReason2Choice }
     *     
     */
    public AffirmationReason2Choice getUaffrmd() {
        return uaffrmd;
    }

    /**
     * Sets the value of the uaffrmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationReason2Choice }
     *     
     */
    public AffirmationStatus11Choice setUaffrmd(AffirmationReason2Choice value) {
        this.uaffrmd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public AffirmationStatus11Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
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
