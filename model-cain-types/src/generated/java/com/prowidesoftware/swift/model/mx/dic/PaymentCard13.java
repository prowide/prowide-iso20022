
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
@XmlType(name = "PaymentCard13", propOrder = {
    "prtctdCardData",
    "plainCardData",
    "mskdPAN",
    "cardPdctTp",
    "cardPdctNm"
})
public class PaymentCard13 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData9 plainCardData;
    @XmlElement(name = "MskdPAN")
    protected String mskdPAN;
    @XmlElement(name = "CardPdctTp")
    @XmlSchemaType(name = "string")
    protected CardProductType1Code cardPdctTp;
    @XmlElement(name = "CardPdctNm")
    protected String cardPdctNm;

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
    public PaymentCard13 setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
        return this;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData9 }
     *     
     */
    public PlainCardData9 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData9 }
     *     
     */
    public PaymentCard13 setPlainCardData(PlainCardData9 value) {
        this.plainCardData = value;
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
    public PaymentCard13 setMskdPAN(String value) {
        this.mskdPAN = value;
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
    public PaymentCard13 setCardPdctTp(CardProductType1Code value) {
        this.cardPdctTp = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctNm() {
        return cardPdctNm;
    }

    /**
     * Sets the value of the cardPdctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard13 setCardPdctNm(String value) {
        this.cardPdctNm = value;
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
