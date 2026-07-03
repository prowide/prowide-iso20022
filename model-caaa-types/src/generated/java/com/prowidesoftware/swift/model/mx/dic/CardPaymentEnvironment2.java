
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment2", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card",
    "crdhldr"
})
public class CardPaymentEnvironment2 {

    @XmlElement(name = "Acqrr")
    protected Acquirer1 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation5 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction1 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard3 card;
    @XmlElement(name = "Crdhldr")
    protected Cardholder2 crdhldr;

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
    public CardPaymentEnvironment2 setAcqrr(Acquirer1 value) {
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
    public CardPaymentEnvironment2 setMrchnt(Organisation5 value) {
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
    public CardPaymentEnvironment2 setPOI(PointOfInteraction1 value) {
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
    public CardPaymentEnvironment2 setCard(PaymentCard3 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder2 }
     *     
     */
    public Cardholder2 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder2 }
     *     
     */
    public CardPaymentEnvironment2 setCrdhldr(Cardholder2 value) {
        this.crdhldr = value;
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
