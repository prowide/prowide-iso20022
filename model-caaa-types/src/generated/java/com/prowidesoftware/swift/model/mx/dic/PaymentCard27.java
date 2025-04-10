
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "PaymentCard27", propOrder = {
    "prtctdCardData",
    "plainCardData",
    "pmtAcctRef",
    "mskdPAN",
    "cardBrnd",
    "cardPdctTp",
    "cardPdctSubTp"
})
public class PaymentCard27 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData8 plainCardData;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "MskdPAN")
    protected String mskdPAN;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctTp")
    @XmlSchemaType(name = "string")
    protected CardProductType1Code cardPdctTp;
    @XmlElement(name = "CardPdctSubTp")
    protected String cardPdctSubTp;

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
    public PaymentCard27 setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
        return this;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData8 }
     *     
     */
    public PlainCardData8 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData8 }
     *     
     */
    public PaymentCard27 setPlainCardData(PlainCardData8 value) {
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
    public PaymentCard27 setPmtAcctRef(String value) {
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
    public PaymentCard27 setMskdPAN(String value) {
        this.mskdPAN = value;
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
    public PaymentCard27 setCardBrnd(String value) {
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
    public PaymentCard27 setCardPdctTp(CardProductType1Code value) {
        this.cardPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctSubTp() {
        return cardPdctSubTp;
    }

    /**
     * Sets the value of the cardPdctSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard27 setCardPdctSubTp(String value) {
        this.cardPdctSubTp = value;
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
