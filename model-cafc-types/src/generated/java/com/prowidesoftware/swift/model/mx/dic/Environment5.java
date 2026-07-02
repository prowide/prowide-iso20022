
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
@XmlType(name = "Environment5", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "dstn",
    "card",
    "tkn"
})
public class Environment5 {

    @XmlElement(name = "Acqrr")
    protected PartyIdentification197 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification197 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification197 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification197 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification203 accptr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification197 dstn;
    @XmlElement(name = "Card")
    protected CardData2 card;
    @XmlElement(name = "Tkn")
    protected Token1 tkn;

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
    public Environment5 setAcqrr(PartyIdentification197 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment5 setOrgtr(PartyIdentification197 value) {
        this.orgtr = value;
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
    public Environment5 setSndr(PartyIdentification197 value) {
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
    public Environment5 setRcvr(PartyIdentification197 value) {
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
    public Environment5 setAccptr(PartyIdentification203 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public Environment5 setDstn(PartyIdentification197 value) {
        this.dstn = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link CardData2 }
     *     
     */
    public CardData2 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData2 }
     *     
     */
    public Environment5 setCard(CardData2 value) {
        this.card = value;
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
    public Environment5 setTkn(Token1 value) {
        this.tkn = value;
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
