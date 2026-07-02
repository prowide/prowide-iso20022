
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
@XmlType(name = "CardData1", propOrder = {
    "pan",
    "prtctdPANInd",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "svcCd",
    "trck1",
    "trck2",
    "trck3",
    "pmtAcctRef",
    "cardCtryCd",
    "cardPdctTp",
    "cardPdctSubTp",
    "cardPrtflIdr",
    "addtlCardData"
})
public class CardData1 {

    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "PrtctdPANInd")
    protected Boolean prtctdPANInd;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "SvcCd")
    protected String svcCd;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected Track2Data1Choice trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
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
    public CardData1 setPAN(String value) {
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
    public CardData1 setPrtctdPANInd(Boolean value) {
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
    public CardData1 setCardSeqNb(String value) {
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
    public CardData1 setFctvDt(String value) {
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
    public CardData1 setXpryDt(String value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData1 setSvcCd(String value) {
        this.svcCd = value;
        return this;
    }

    /**
     * Gets the value of the trck1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck1() {
        return trck1;
    }

    /**
     * Sets the value of the trck1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData1 setTrck1(String value) {
        this.trck1 = value;
        return this;
    }

    /**
     * Gets the value of the trck2 property.
     * 
     * @return
     *     possible object is
     *     {@link Track2Data1Choice }
     *     
     */
    public Track2Data1Choice getTrck2() {
        return trck2;
    }

    /**
     * Sets the value of the trck2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Track2Data1Choice }
     *     
     */
    public CardData1 setTrck2(Track2Data1Choice value) {
        this.trck2 = value;
        return this;
    }

    /**
     * Gets the value of the trck3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Sets the value of the trck3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardData1 setTrck3(String value) {
        this.trck3 = value;
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
    public CardData1 setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
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
    public CardData1 setCardCtryCd(String value) {
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
    public CardData1 setCardPdctTp(String value) {
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
    public CardData1 setCardPdctSubTp(String value) {
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
    public CardData1 setCardPrtflIdr(String value) {
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
    public CardData1 setAddtlCardData(String value) {
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
