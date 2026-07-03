
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
@XmlType(name = "CardPaymentEnvironment24", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card"
})
public class CardPaymentEnvironment24 {

    @XmlElement(name = "Acqrr")
    protected Acquirer2 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation8 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction3 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard8 card;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer2 }
     *     
     */
    public Acquirer2 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer2 }
     *     
     */
    public CardPaymentEnvironment24 setAcqrr(Acquirer2 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation8 }
     *     
     */
    public Organisation8 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation8 }
     *     
     */
    public CardPaymentEnvironment24 setMrchnt(Organisation8 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction3 }
     *     
     */
    public PointOfInteraction3 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction3 }
     *     
     */
    public CardPaymentEnvironment24 setPOI(PointOfInteraction3 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard8 }
     *     
     */
    public PaymentCard8 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard8 }
     *     
     */
    public CardPaymentEnvironment24 setCard(PaymentCard8 value) {
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
