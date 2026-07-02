
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
 * Provides information on the baskets identification and the Eligibility Set Profile.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketIdentificationAndEligibilitySetProfile1", propOrder = {
    "prfrntlBsktIdNb",
    "fllbckStartgBsktId",
    "exclsnBsktId",
    "elgbltySetPrfl"
})
public class BasketIdentificationAndEligibilitySetProfile1 {

    @XmlElement(name = "PrfrntlBsktIdNb")
    protected GenericIdentification1 prfrntlBsktIdNb;
    @XmlElement(name = "FllbckStartgBsktId")
    protected GenericIdentification1 fllbckStartgBsktId;
    @XmlElement(name = "ExclsnBsktId")
    protected GenericIdentification1 exclsnBsktId;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;

    /**
     * Gets the value of the prfrntlBsktIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getPrfrntlBsktIdNb() {
        return prfrntlBsktIdNb;
    }

    /**
     * Sets the value of the prfrntlBsktIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 setPrfrntlBsktIdNb(GenericIdentification1 value) {
        this.prfrntlBsktIdNb = value;
        return this;
    }

    /**
     * Gets the value of the fllbckStartgBsktId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getFllbckStartgBsktId() {
        return fllbckStartgBsktId;
    }

    /**
     * Sets the value of the fllbckStartgBsktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 setFllbckStartgBsktId(GenericIdentification1 value) {
        this.fllbckStartgBsktId = value;
        return this;
    }

    /**
     * Gets the value of the exclsnBsktId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getExclsnBsktId() {
        return exclsnBsktId;
    }

    /**
     * Sets the value of the exclsnBsktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 setExclsnBsktId(GenericIdentification1 value) {
        this.exclsnBsktId = value;
        return this;
    }

    /**
     * Gets the value of the elgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Sets the value of the elgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
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
