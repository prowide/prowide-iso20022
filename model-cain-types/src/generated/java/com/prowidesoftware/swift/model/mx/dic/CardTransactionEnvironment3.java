
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
@XmlType(name = "CardTransactionEnvironment3", propOrder = {
    "acqrr",
    "cardSchmeId",
    "accptr",
    "termnlId",
    "card",
    "cstmrDvc",
    "wllt",
    "pmtTkn"
})
public class CardTransactionEnvironment3 {

    @XmlElement(name = "Acqrr", required = true)
    protected Acquirer6 acqrr;
    @XmlElement(name = "CardSchmeId")
    protected String cardSchmeId;
    @XmlElement(name = "Accptr", required = true)
    protected Organisation19 accptr;
    @XmlElement(name = "TermnlId")
    protected GenericIdentification32 termnlId;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard14 card;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice1 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice1 wllt;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken4 pmtTkn;

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
    public CardTransactionEnvironment3 setAcqrr(Acquirer6 value) {
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
    public CardTransactionEnvironment3 setCardSchmeId(String value) {
        this.cardSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the accptr property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation19 }
     *     
     */
    public Organisation19 getAccptr() {
        return accptr;
    }

    /**
     * Sets the value of the accptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation19 }
     *     
     */
    public CardTransactionEnvironment3 setAccptr(Organisation19 value) {
        this.accptr = value;
        return this;
    }

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardTransactionEnvironment3 setTermnlId(GenericIdentification32 value) {
        this.termnlId = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard14 }
     *     
     */
    public PaymentCard14 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard14 }
     *     
     */
    public CardTransactionEnvironment3 setCard(PaymentCard14 value) {
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
    public CardTransactionEnvironment3 setCstmrDvc(CustomerDevice1 value) {
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
    public CardTransactionEnvironment3 setWllt(CustomerDevice1 value) {
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
    public CardTransactionEnvironment3 setPmtTkn(CardPaymentToken4 value) {
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
