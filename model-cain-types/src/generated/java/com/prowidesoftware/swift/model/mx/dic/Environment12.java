
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
 * Environment of the transaction for Inquiry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment12", propOrder = {
    "acqrr",
    "sndr",
    "rcvr",
    "accptr",
    "termnl",
    "card",
    "cstmrDvc",
    "wllt",
    "tkn",
    "crdhldr"
})
public class Environment12 {

    @XmlElement(name = "Acqrr", required = true)
    protected PartyIdentification197 acqrr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification197 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification197 rcvr;
    @XmlElement(name = "Accptr", required = true)
    protected PartyIdentification203 accptr;
    @XmlElement(name = "Termnl")
    protected Terminal1 termnl;
    @XmlElement(name = "Card", required = true)
    protected CardData1 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice2 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected Wallet1 wllt;
    @XmlElement(name = "Tkn")
    protected Token1 tkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder15 crdhldr;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment12 setAcqrr(PartyIdentification197 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment12 setSndr(PartyIdentification197 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment12 setRcvr(PartyIdentification197 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification203 }
     *     
     */
    public PartyIdentification203 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification203 }
     *     
     */
    public Environment12 setAccptr(PartyIdentification203 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal1 }
     *     
     */
    public Terminal1 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal1 }
     *     
     */
    public Environment12 setTermnl(Terminal1 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData1 }
     *     
     */
    public CardData1 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData1 }
     *     
     */
    public Environment12 setCard(CardData1 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the cstmrDvc property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice2 }
     *     
     */
    public CustomerDevice2 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Sets the value of the cstmrDvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice2 }
     *     
     */
    public Environment12 setCstmrDvc(CustomerDevice2 value) {
        this.cstmrDvc = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet1 }
     *     
     */
    public Wallet1 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet1 }
     *     
     */
    public Environment12 setWllt(Wallet1 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token1 }
     *     
     */
    public Token1 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token1 }
     *     
     */
    public Environment12 setTkn(Token1 value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder15 }
     *     
     */
    public Cardholder15 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder15 }
     *     
     */
    public Environment12 setCrdhldr(Cardholder15 value) {
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
