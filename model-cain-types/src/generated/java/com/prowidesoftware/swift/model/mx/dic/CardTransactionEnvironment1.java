
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
@XmlType(name = "CardTransactionEnvironment1", propOrder = {
    "acqrr",
    "cardSchmeId",
    "accptr",
    "termnl",
    "card",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "crdhldr",
    "prtctdCrdhldrData"
})
public class CardTransactionEnvironment1 {

    @XmlElement(name = "Acqrr", required = true)
    protected Acquirer6 acqrr;
    @XmlElement(name = "CardSchmeId")
    protected String cardSchmeId;
    @XmlElement(name = "Accptr")
    protected Organisation18 accptr;
    @XmlElement(name = "Termnl")
    protected CardAcceptorTerminal1 termnl;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard12 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice1 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice1 wllt;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken4 pmtTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder9 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType10 prtctdCrdhldrData;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer6 }
     *     
     */
    public Acquirer6 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer6 }
     *     
     */
    public CardTransactionEnvironment1 setAcqrr(Acquirer6 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the cardSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSchmeId() {
        return cardSchmeId;
    }

    /**
     * Sets the value of the cardSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionEnvironment1 setCardSchmeId(String value) {
        this.cardSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation18 }
     *     
     */
    public Organisation18 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation18 }
     *     
     */
    public CardTransactionEnvironment1 setAccptr(Organisation18 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the termnl property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcceptorTerminal1 }
     *     
     */
    public CardAcceptorTerminal1 getTermnl() {
        return termnl;
    }

    /**
     * Sets the value of the termnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcceptorTerminal1 }
     *     
     */
    public CardTransactionEnvironment1 setTermnl(CardAcceptorTerminal1 value) {
        this.termnl = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard12 }
     *     
     */
    public PaymentCard12 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard12 }
     *     
     */
    public CardTransactionEnvironment1 setCard(PaymentCard12 value) {
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
    public CardTransactionEnvironment1 setCstmrDvc(CustomerDevice1 value) {
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
    public CardTransactionEnvironment1 setWllt(CustomerDevice1 value) {
        this.wllt = value;
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
    public CardTransactionEnvironment1 setPmtTkn(CardPaymentToken4 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the crdhldr property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder9 }
     *     
     */
    public Cardholder9 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Sets the value of the crdhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder9 }
     *     
     */
    public CardTransactionEnvironment1 setCrdhldr(Cardholder9 value) {
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
    public CardTransactionEnvironment1 setPrtctdCrdhldrData(ContentInformationType10 value) {
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
