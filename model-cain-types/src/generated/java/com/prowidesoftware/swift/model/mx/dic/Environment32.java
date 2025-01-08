
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
 * Environment of a card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment32", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "dstn",
    "termnl",
    "issr",
    "card",
    "wllt",
    "tkn",
    "crdhldr"
})
public class Environment32 {

    @XmlElement(name = "Acqrr", required = true)
    protected PartyIdentification263 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification258 accptr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "Termnl")
    protected Terminal6 termnl;
    @XmlElement(name = "Issr")
    protected PartyIdentification263 issr;
    @XmlElement(name = "Card")
    protected CardData9 card;
    @XmlElement(name = "Wllt")
    protected Wallet2 wllt;
    @XmlElement(name = "Tkn")
    protected Token3 tkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder19 crdhldr;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setAcqrr(PartyIdentification263 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setOrgtr(PartyIdentification263 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setSndr(PartyIdentification263 value) {
        this.sndr = value;
        return this;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setRcvr(PartyIdentification263 value) {
        this.rcvr = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public Environment32 setAccptr(PartyIdentification258 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setDstn(PartyIdentification263 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link Terminal6 }
     *     
     */
    public Terminal6 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal6 }
     *     
     */
    public Environment32 setTermnl(Terminal6 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public Environment32 setIssr(PartyIdentification263 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData9 }
     *     
     */
    public CardData9 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData9 }
     *     
     */
    public Environment32 setCard(CardData9 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the wllt property.
     * 
     * @return
     *     possible object is
     *     {@link Wallet2 }
     *     
     */
    public Wallet2 getWllt() {
        return wllt;
    }

    /**
     * Sets the value of the wllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet2 }
     *     
     */
    public Environment32 setWllt(Wallet2 value) {
        this.wllt = value;
        return this;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Token3 }
     *     
     */
    public Token3 getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Token3 }
     *     
     */
    public Environment32 setTkn(Token3 value) {
        this.tkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder19 }
     *     
     */
    public Cardholder19 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder19 }
     *     
     */
    public Environment32 setCrdhldr(Cardholder19 value) {
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
