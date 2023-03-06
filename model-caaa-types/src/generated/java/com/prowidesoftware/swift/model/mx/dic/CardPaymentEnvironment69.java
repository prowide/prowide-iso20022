
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
 * Environment of the transaction given in a response to a request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment69", propOrder = {
    "acqrrId",
    "mrchntId",
    "poiId",
    "card",
    "pmtTkn"
})
public class CardPaymentEnvironment69 {

    @XmlElement(name = "AcqrrId")
    protected GenericIdentification53 acqrrId;
    @XmlElement(name = "MrchntId")
    protected GenericIdentification32 mrchntId;
    @XmlElement(name = "POIId")
    protected GenericIdentification32 poiId;
    @XmlElement(name = "Card")
    protected PaymentCard28 card;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken4 pmtTkn;

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
    public CardPaymentEnvironment69 setAcqrrId(GenericIdentification53 value) {
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
    public CardPaymentEnvironment69 setMrchntId(GenericIdentification32 value) {
        this.mrchntId = value;
        return this;
    }

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentEnvironment69 setPOIId(GenericIdentification32 value) {
        this.poiId = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard28 }
     *     
     */
    public PaymentCard28 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard28 }
     *     
     */
    public CardPaymentEnvironment69 setCard(PaymentCard28 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentToken4 }
     *     
     */
    public CardPaymentToken4 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentToken4 }
     *     
     */
    public CardPaymentEnvironment69 setPmtTkn(CardPaymentToken4 value) {
        this.pmtTkn = value;
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
