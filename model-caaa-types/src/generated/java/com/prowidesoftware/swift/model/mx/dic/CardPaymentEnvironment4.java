
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
 * Environment of the cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment4", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card"
})
public class CardPaymentEnvironment4 {

    @XmlElement(name = "Acqrr")
    protected Acquirer1 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation5 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction1 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard3 card;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer1 }
     *     
     */
    public Acquirer1 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer1 }
     *     
     */
    public CardPaymentEnvironment4 setAcqrr(Acquirer1 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation5 }
     *     
     */
    public Organisation5 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation5 }
     *     
     */
    public CardPaymentEnvironment4 setMrchnt(Organisation5 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public PointOfInteraction1 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction1 }
     *     
     */
    public CardPaymentEnvironment4 setPOI(PointOfInteraction1 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard3 }
     *     
     */
    public PaymentCard3 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard3 }
     *     
     */
    public CardPaymentEnvironment4 setCard(PaymentCard3 value) {
        this.card = value;
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
