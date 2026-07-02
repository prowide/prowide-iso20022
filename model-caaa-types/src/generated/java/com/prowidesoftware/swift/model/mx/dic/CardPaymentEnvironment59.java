
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
@XmlType(name = "CardPaymentEnvironment59", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card",
    "cstmrDvc",
    "wllt",
    "pmtTkn"
})
public class CardPaymentEnvironment59 {

    @XmlElement(name = "Acqrr")
    protected Acquirer4 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation25 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction7 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard26 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice1 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice1 wllt;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken3 pmtTkn;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer4 }
     *     
     */
    public Acquirer4 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer4 }
     *     
     */
    public CardPaymentEnvironment59 setAcqrr(Acquirer4 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation25 }
     *     
     */
    public Organisation25 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation25 }
     *     
     */
    public CardPaymentEnvironment59 setMrchnt(Organisation25 value) {
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
    public CardPaymentEnvironment59 setPOI(PointOfInteraction7 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard26 }
     *     
     */
    public PaymentCard26 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard26 }
     *     
     */
    public CardPaymentEnvironment59 setCard(PaymentCard26 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CustomerDevice1 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CardPaymentEnvironment59 setCstmrDvc(CustomerDevice1 value) {
        this.cstmrDvc = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CustomerDevice1 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice1 }
     *     
     */
    public CardPaymentEnvironment59 setWllt(CustomerDevice1 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentToken3 }
     *     
     */
    public CardPaymentToken3 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentToken3 }
     *     
     */
    public CardPaymentEnvironment59 setPmtTkn(CardPaymentToken3 value) {
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
