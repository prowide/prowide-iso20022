
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
@XmlType(name = "CardTransactionEnvironment2", propOrder = {
    "acqrrId",
    "cardSchmeId",
    "accptrId",
    "termnlId",
    "card",
    "pmtTkn",
    "shppgAdr"
})
public class CardTransactionEnvironment2 {

    @XmlElement(name = "AcqrrId", required = true)
    protected String acqrrId;
    @XmlElement(name = "CardSchmeId")
    protected String cardSchmeId;
    @XmlElement(name = "AccptrId")
    protected String accptrId;
    @XmlElement(name = "TermnlId")
    protected String termnlId;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard13 card;
    @XmlElement(name = "PmtTkn")
    protected CardPaymentToken2 pmtTkn;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress18 shppgAdr;

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionEnvironment2 setAcqrrId(String value) {
        this.acqrrId = value;
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
    public CardTransactionEnvironment2 setCardSchmeId(String value) {
        this.cardSchmeId = value;
        return this;
    }

    /**
     * Gets the value of the accptrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptrId() {
        return accptrId;
    }

    /**
     * Sets the value of the accptrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionEnvironment2 setAccptrId(String value) {
        this.accptrId = value;
        return this;
    }

    /**
     * Gets the value of the termnlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermnlId() {
        return termnlId;
    }

    /**
     * Sets the value of the termnlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransactionEnvironment2 setTermnlId(String value) {
        this.termnlId = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard13 }
     *     
     */
    public PaymentCard13 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard13 }
     *     
     */
    public CardTransactionEnvironment2 setCard(PaymentCard13 value) {
        this.card = value;
        return this;
    }

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentToken2 }
     *     
     */
    public CardPaymentToken2 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentToken2 }
     *     
     */
    public CardTransactionEnvironment2 setPmtTkn(CardPaymentToken2 value) {
        this.pmtTkn = value;
        return this;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress18 }
     *     
     */
    public PostalAddress18 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Sets the value of the shppgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress18 }
     *     
     */
    public CardTransactionEnvironment2 setShppgAdr(PostalAddress18 value) {
        this.shppgAdr = value;
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
