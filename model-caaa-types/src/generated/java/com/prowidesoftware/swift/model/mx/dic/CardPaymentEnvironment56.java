
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
@XmlType(name = "CardPaymentEnvironment56", propOrder = {
    "acqrrId",
    "mrchntId",
    "poi",
    "card",
    "crdhldrLang"
})
public class CardPaymentEnvironment56 {

    @XmlElement(name = "AcqrrId")
    protected GenericIdentification53 acqrrId;
    @XmlElement(name = "MrchntId")
    protected GenericIdentification53 mrchntId;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction5 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard21 card;
    @XmlElement(name = "CrdhldrLang")
    protected String crdhldrLang;

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification53 }
     *     
     */
    public GenericIdentification53 getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification53 }
     *     
     */
    public CardPaymentEnvironment56 setAcqrrId(GenericIdentification53 value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification53 }
     *     
     */
    public GenericIdentification53 getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification53 }
     *     
     */
    public CardPaymentEnvironment56 setMrchntId(GenericIdentification53 value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction5 }
     *     
     */
    public PointOfInteraction5 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction5 }
     *     
     */
    public CardPaymentEnvironment56 setPOI(PointOfInteraction5 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard21 }
     *     
     */
    public PaymentCard21 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard21 }
     *     
     */
    public CardPaymentEnvironment56 setCard(PaymentCard21 value) {
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
    public CardPaymentEnvironment56 setCrdhldrLang(String value) {
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
