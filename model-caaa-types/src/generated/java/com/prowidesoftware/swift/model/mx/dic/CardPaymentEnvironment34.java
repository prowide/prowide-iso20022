
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
@XmlType(name = "CardPaymentEnvironment34", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "crdhldr",
    "prtctdCrdhldrData"
})
public class CardPaymentEnvironment34 {

    @XmlElement(name = "Acqrr")
    protected Acquirer4 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation8 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction4 poi;
    @XmlElement(name = "Card")
    protected PaymentCard11 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice1 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice1 wllt;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken3 pmtTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder8 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType10 prtctdCrdhldrData;

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
    public CardPaymentEnvironment34 setAcqrr(Acquirer4 value) {
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
    public CardPaymentEnvironment34 setMrchnt(Organisation8 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction4 }
     *     
     */
    public PointOfInteraction4 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction4 }
     *     
     */
    public CardPaymentEnvironment34 setPOI(PointOfInteraction4 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard11 }
     *     
     */
    public PaymentCard11 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard11 }
     *     
     */
    public CardPaymentEnvironment34 setCard(PaymentCard11 value) {
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
    public CardPaymentEnvironment34 setCstmrDvc(CustomerDevice1 value) {
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
    public CardPaymentEnvironment34 setWllt(CustomerDevice1 value) {
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
    public CardPaymentEnvironment34 setPmtTkn(CardPaymentToken3 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder8 }
     *     
     */
    public Cardholder8 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder8 }
     *     
     */
    public CardPaymentEnvironment34 setCrdhldr(Cardholder8 value) {
        this.crdhldr = value;
        return this;
    }

    /**
     * Gets the value of the prtctdCrdhldrData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Sets the value of the prtctdCrdhldrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public CardPaymentEnvironment34 setPrtctdCrdhldrData(ContentInformationType10 value) {
        this.prtctdCrdhldrData = value;
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
