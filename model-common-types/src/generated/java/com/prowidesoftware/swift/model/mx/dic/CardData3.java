
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
 * Non-protected sensitive data associated with the card or payment token performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardData3", propOrder = {
    "pan",
    "prtctdPANInd",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "pmtAcctRef",
    "panRefIdr",
    "panAcctRg",
    "cardCtryCd",
    "cardPdctTp",
    "cardPdctSubTp",
    "cardPrtflIdr",
    "addtlCardData"
})
public class CardData3 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "PrtctdPANInd")
    protected Boolean prtctdPANInd;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "PANRefIdr")
    protected String panRefIdr;
    @XmlElement(name = "PANAcctRg")
    protected String panAcctRg;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardPdctTp")
    protected String cardPdctTp;
    @XmlElement(name = "CardPdctSubTp")
    protected String cardPdctSubTp;
    @XmlElement(name = "CardPrtflIdr")
    protected String cardPrtflIdr;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setPAN(String value) {
        this.pan = value;
        return this;
    }

    /**
     * Gets the value of the prtctdPANInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctdPANInd() {
        return prtctdPANInd;
    }

    /**
     * Sets the value of the prtctdPANInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardData3 setPrtctdPANInd(Boolean value) {
        this.prtctdPANInd = value;
        return this;
    }

    /**
     * Gets the value of the cardSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Sets the value of the cardSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setCardSeqNb(String value) {
        this.cardSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setFctvDt(String value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setXpryDt(String value) {
        this.xpryDt = value;
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
    public CardData3 setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
        return this;
    }

    /**
     * Gets the value of the panRefIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANRefIdr() {
        return panRefIdr;
    }

    /**
     * Sets the value of the panRefIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setPANRefIdr(String value) {
        this.panRefIdr = value;
        return this;
    }

    /**
     * Gets the value of the panAcctRg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANAcctRg() {
        return panAcctRg;
    }

    /**
     * Sets the value of the panAcctRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setPANAcctRg(String value) {
        this.panAcctRg = value;
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
    public CardData3 setCardCtryCd(String value) {
        this.cardCtryCd = value;
        return this;
    }

    /**
     * Gets the value of the cardPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctTp() {
        return cardPdctTp;
    }

    /**
     * Sets the value of the cardPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setCardPdctTp(String value) {
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
    public CardData3 setCardPdctSubTp(String value) {
        this.cardPdctSubTp = value;
        return this;
    }

    /**
     * Gets the value of the cardPrtflIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrtflIdr() {
        return cardPrtflIdr;
    }

    /**
     * Sets the value of the cardPrtflIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData3 setCardPrtflIdr(String value) {
        this.cardPrtflIdr = value;
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
    public CardData3 setAddtlCardData(String value) {
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
