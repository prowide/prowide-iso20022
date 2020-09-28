
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
@XmlType(name = "PaymentCard21", propOrder = {
    "prtctdCardData",
    "plainCardData",
    "pmtAcctRef",
    "issrBIN",
    "cardCtryCd",
    "cardCcyCd",
    "cardPdctPrfl",
    "cardBrnd",
    "intrnlCard",
    "allwdPdct",
    "svcOptn",
    "addtlCardData"
})
public class PaymentCard21 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData15 plainCardData;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
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
    @XmlElement(name = "IntrnlCard")
    protected Boolean intrnlCard;
    @XmlElement(name = "AllwdPdct")
    protected List<String> allwdPdct;
    @XmlElement(name = "SvcOptn")
    protected String svcOptn;
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
    public PaymentCard21 setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
        return this;
    }

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData15 }
     *     
     */
    public PlainCardData15 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData15 }
     *     
     */
    public PaymentCard21 setPlainCardData(PlainCardData15 value) {
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
    public PaymentCard21 setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
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
    public PaymentCard21 setIssrBIN(String value) {
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
    public PaymentCard21 setCardCtryCd(String value) {
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
    public PaymentCard21 setCardCcyCd(String value) {
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
    public PaymentCard21 setCardPdctPrfl(String value) {
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
    public PaymentCard21 setCardBrnd(String value) {
        this.cardBrnd = value;
        return this;
    }

    /**
     * Gets the value of the intrnlCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrnlCard() {
        return intrnlCard;
    }

    /**
     * Sets the value of the intrnlCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentCard21 setIntrnlCard(Boolean value) {
        this.intrnlCard = value;
        return this;
    }

    /**
     * Gets the value of the allwdPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllwdPdct() {
        if (allwdPdct == null) {
            allwdPdct = new ArrayList<String>();
        }
        return this.allwdPdct;
    }

    /**
     * Gets the value of the svcOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcOptn() {
        return svcOptn;
    }

    /**
     * Sets the value of the svcOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentCard21 setSvcOptn(String value) {
        this.svcOptn = value;
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
    public PaymentCard21 setAddtlCardData(String value) {
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

    /**
     * Adds a new item to the allwdPdct list.
     * @see #getAllwdPdct()
     * 
     */
    public PaymentCard21 addAllwdPdct(String allwdPdct) {
        getAllwdPdct().add(allwdPdct);
        return this;
    }

}
