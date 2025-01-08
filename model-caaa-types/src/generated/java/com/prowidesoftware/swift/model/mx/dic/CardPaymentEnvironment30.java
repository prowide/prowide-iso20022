
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
 * Environment of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment30", propOrder = {
    "acqrrId",
    "mrchntId",
    "poi",
    "card",
    "crdhldrLang"
})
public class CardPaymentEnvironment30 {

    @XmlElement(name = "AcqrrId")
    protected GenericIdentification32 acqrrId;
    @XmlElement(name = "MrchntId")
    protected GenericIdentification32 mrchntId;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction3 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard7 card;
    @XmlElement(name = "CrdhldrLang")
    protected String crdhldrLang;

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment30 setAcqrrId(GenericIdentification32 value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment30 setMrchntId(GenericIdentification32 value) {
        this.mrchntId = value;
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
    public CardPaymentEnvironment30 setPOI(PointOfInteraction3 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard7 }
     *     
     */
    public PaymentCard7 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard7 }
     *     
     */
    public CardPaymentEnvironment30 setCard(PaymentCard7 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrLang() {
        return crdhldrLang;
    }

    /**
     * Sets the value of the crdhldrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentEnvironment30 setCrdhldrLang(String value) {
        this.crdhldrLang = value;
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
