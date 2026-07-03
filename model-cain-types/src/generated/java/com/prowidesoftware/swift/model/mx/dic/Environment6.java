
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
@XmlType(name = "Environment6", propOrder = {
    "acqrr",
    "sndr",
    "rcvr",
    "accptr",
    "pyer",
    "pyee",
    "termnl",
    "card",
    "cstmrDvc",
    "wllt",
    "tkn",
    "crdhldr"
})
public class Environment6 {

    @XmlElement(name = "Acqrr")
    protected PartyIdentification198 acqrr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification198 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification198 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification199 accptr;
    @XmlElement(name = "Pyer")
    protected PartyIdentification211 pyer;
    @XmlElement(name = "Pyee")
    protected PartyIdentification211 pyee;
    @XmlElement(name = "Termnl")
    protected Terminal3 termnl;
    @XmlElement(name = "Card", required = true)
    protected CardData3 card;
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
     *     {@link PartyIdentification198 }
     *     
     */
    public PartyIdentification198 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification198 }
     *     
     */
    public Environment6 setAcqrr(PartyIdentification198 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification198 }
     *     
     */
    public PartyIdentification198 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification198 }
     *     
     */
    public Environment6 setSndr(PartyIdentification198 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification198 }
     *     
     */
    public PartyIdentification198 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification198 }
     *     
     */
    public Environment6 setRcvr(PartyIdentification198 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification199 }
     *     
     */
    public PartyIdentification199 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification199 }
     *     
     */
    public Environment6 setAccptr(PartyIdentification199 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification211 }
     *     
     */
    public PartyIdentification211 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification211 }
     *     
     */
    public Environment6 setPyer(PartyIdentification211 value) {
        this.pyer = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification211 }
     *     
     */
    public PartyIdentification211 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification211 }
     *     
     */
    public Environment6 setPyee(PartyIdentification211 value) {
        this.pyee = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal3 }
     *     
     */
    public Terminal3 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal3 }
     *     
     */
    public Environment6 setTermnl(Terminal3 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData3 }
     *     
     */
    public CardData3 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData3 }
     *     
     */
    public Environment6 setCard(CardData3 value) {
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
    public Environment6 setCstmrDvc(CustomerDevice2 value) {
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
    public Environment6 setWllt(Wallet1 value) {
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
    public Environment6 setTkn(Token1 value) {
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
    public Environment6 setCrdhldr(Cardholder15 value) {
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
