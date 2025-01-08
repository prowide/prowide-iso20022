
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment card performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard20", propOrder = {
    "prtctdCardData",
    "plainCardData",
    "pmtAcctRef",
    "mskdPAN",
    "issrBIN",
    "cardCtryCd",
    "cardCcyCd",
    "cardPdctPrfl",
    "cardBrnd",
    "cardPdctTp",
    "addtlCardData"
})
public class PaymentCard20 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData16 plainCardData;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "MskdPAN")
    protected String mskdPAN;
    @XmlElement(name = "IssrBIN")
    protected String issrBIN;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardCcyCd")
    protected String cardCcyCd;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctTp")
    @XmlSchemaType(name = "string")
    protected CardProductType1Code cardPdctTp;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Gets the value of the prtctdCardData property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Sets the value of the prtctdCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public PaymentCard20 setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
        return this;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData16 }
     *     
     */
    public PlainCardData16 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData16 }
     *     
     */
    public PaymentCard20 setPlainCardData(PlainCardData16 value) {
        this.plainCardData = value;
        return this;
    }

    /**
     * Gets the value of the pmtAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAcctRef() {
        return pmtAcctRef;
    }

    /**
     * Sets the value of the pmtAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
        return this;
    }

    /**
     * Gets the value of the mskdPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMskdPAN() {
        return mskdPAN;
    }

    /**
     * Sets the value of the mskdPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setMskdPAN(String value) {
        this.mskdPAN = value;
        return this;
    }

    /**
     * Gets the value of the issrBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrBIN() {
        return issrBIN;
    }

    /**
     * Sets the value of the issrBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setIssrBIN(String value) {
        this.issrBIN = value;
        return this;
    }

    /**
     * Gets the value of the cardCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Sets the value of the cardCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setCardCtryCd(String value) {
        this.cardCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the cardCcyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCcyCd() {
        return cardCcyCd;
    }

    /**
     * Sets the value of the cardCcyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setCardCcyCd(String value) {
        this.cardCcyCd = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctPrfl() {
        return cardPdctPrfl;
    }

    /**
     * Sets the value of the cardPdctPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setCardPdctPrfl(String value) {
        this.cardPdctPrfl = value;
        return this;
    }

    /**
     * Gets the value of the cardBrnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Sets the value of the cardBrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setCardBrnd(String value) {
        this.cardBrnd = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardProductType1Code }
     *     
     */
    public CardProductType1Code getCardPdctTp() {
        return cardPdctTp;
    }

    /**
     * Sets the value of the cardPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProductType1Code }
     *     
     */
    public PaymentCard20 setCardPdctTp(CardProductType1Code value) {
        this.cardPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCardData() {
        return addtlCardData;
    }

    /**
     * Sets the value of the addtlCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard20 setAddtlCardData(String value) {
        this.addtlCardData = value;
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
