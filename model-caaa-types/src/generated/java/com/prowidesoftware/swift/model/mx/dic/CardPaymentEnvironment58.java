
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
 * Environment common to a collection of transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment58", propOrder = {
    "acqrr",
    "mrchnt",
    "poi"
})
public class CardPaymentEnvironment58 {

    @XmlElement(name = "Acqrr")
    protected Acquirer5 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation9 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction7 poi;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer5 }
     *     
     */
    public Acquirer5 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer5 }
     *     
     */
    public CardPaymentEnvironment58 setAcqrr(Acquirer5 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation9 }
     *     
     */
    public Organisation9 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation9 }
     *     
     */
    public CardPaymentEnvironment58 setMrchnt(Organisation9 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction7 }
     *     
     */
    public PointOfInteraction7 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction7 }
     *     
     */
    public CardPaymentEnvironment58 setPOI(PointOfInteraction7 value) {
        this.poi = value;
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
