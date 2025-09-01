
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Container for tenders used by the customer to perform the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet2", propOrder = {
    "prvdr",
    "panAge",
    "usrAcctAge",
    "wlltAcctAge",
    "daysSncLastActvty",
    "actvty",
    "actvtyIntrvl",
    "lastWlltChng",
    "sspdCrds",
    "wlltAcctCtry",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "wlltAcctEmailAge",
    "wlltPrvdrRskAssmnt",
    "wlltPrvdrRskAssmntMdlVrsn",
    "wlltPrvdrPhneScore",
    "wlltPrvdrDvcScore",
    "wlltPrvdrAcctScore",
    "addtlData"
})
public class Wallet2 {

    @XmlElement(name = "Prvdr")
    protected PartyIdentification258 prvdr;
    @XmlElement(name = "PANAge")
    protected BigDecimal panAge;
    @XmlElement(name = "UsrAcctAge")
    protected BigDecimal usrAcctAge;
    @XmlElement(name = "WlltAcctAge")
    protected BigDecimal wlltAcctAge;
    @XmlElement(name = "DaysSncLastActvty")
    protected BigDecimal daysSncLastActvty;
    @XmlElement(name = "Actvty")
    protected BigDecimal actvty;
    @XmlElement(name = "ActvtyIntrvl")
    @XmlSchemaType(name = "string")
    protected Frequency12Code actvtyIntrvl;
    @XmlElement(name = "LastWlltChng")
    protected BigDecimal lastWlltChng;
    @XmlElement(name = "SspdCrds")
    protected BigDecimal sspdCrds;
    @XmlElement(name = "WlltAcctCtry")
    protected String wlltAcctCtry;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading9Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "WlltAcctEmailAge")
    protected BigDecimal wlltAcctEmailAge;
    @XmlElement(name = "WlltPrvdrRskAssmnt")
    @XmlSchemaType(name = "string")
    protected RiskAssessment1Code wlltPrvdrRskAssmnt;
    @XmlElement(name = "WlltPrvdrRskAssmntMdlVrsn")
    protected String wlltPrvdrRskAssmntMdlVrsn;
    @XmlElement(name = "WlltPrvdrPhneScore")
    protected BigDecimal wlltPrvdrPhneScore;
    @XmlElement(name = "WlltPrvdrDvcScore")
    protected BigDecimal wlltPrvdrDvcScore;
    @XmlElement(name = "WlltPrvdrAcctScore")
    protected BigDecimal wlltPrvdrAcctScore;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public Wallet2 setPrvdr(PartyIdentification258 value) {
        this.prvdr = value;
        return this;
    }

    /**
     * Gets the value of the panAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPANAge() {
        return panAge;
    }

    /**
     * Sets the value of the panAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setPANAge(BigDecimal value) {
        this.panAge = value;
        return this;
    }

    /**
     * Gets the value of the usrAcctAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsrAcctAge() {
        return usrAcctAge;
    }

    /**
     * Sets the value of the usrAcctAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setUsrAcctAge(BigDecimal value) {
        this.usrAcctAge = value;
        return this;
    }

    /**
     * Gets the value of the wlltAcctAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctAge() {
        return wlltAcctAge;
    }

    /**
     * Sets the value of the wlltAcctAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setWlltAcctAge(BigDecimal value) {
        this.wlltAcctAge = value;
        return this;
    }

    /**
     * Gets the value of the daysSncLastActvty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysSncLastActvty() {
        return daysSncLastActvty;
    }

    /**
     * Sets the value of the daysSncLastActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setDaysSncLastActvty(BigDecimal value) {
        this.daysSncLastActvty = value;
        return this;
    }

    /**
     * Gets the value of the actvty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActvty() {
        return actvty;
    }

    /**
     * Sets the value of the actvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setActvty(BigDecimal value) {
        this.actvty = value;
        return this;
    }

    /**
     * Gets the value of the actvtyIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency12Code }
     *     
     */
    public Frequency12Code getActvtyIntrvl() {
        return actvtyIntrvl;
    }

    /**
     * Sets the value of the actvtyIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency12Code }
     *     
     */
    public Wallet2 setActvtyIntrvl(Frequency12Code value) {
        this.actvtyIntrvl = value;
        return this;
    }

    /**
     * Gets the value of the lastWlltChng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastWlltChng() {
        return lastWlltChng;
    }

    /**
     * Sets the value of the lastWlltChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setLastWlltChng(BigDecimal value) {
        this.lastWlltChng = value;
        return this;
    }

    /**
     * Gets the value of the sspdCrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSspdCrds() {
        return sspdCrds;
    }

    /**
     * Sets the value of the sspdCrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setSspdCrds(BigDecimal value) {
        this.sspdCrds = value;
        return this;
    }

    /**
     * Gets the value of the wlltAcctCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltAcctCtry() {
        return wlltAcctCtry;
    }

    /**
     * Sets the value of the wlltAcctCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet2 setWlltAcctCtry(String value) {
        this.wlltAcctCtry = value;
        return this;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading9Code }
     *     
     */
    public CardDataReading9Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading9Code }
     *     
     */
    public Wallet2 setCardDataNtryMd(CardDataReading9Code value) {
        this.cardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the othrCardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Sets the value of the othrCardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet2 setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the wlltAcctEmailAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctEmailAge() {
        return wlltAcctEmailAge;
    }

    /**
     * Sets the value of the wlltAcctEmailAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setWlltAcctEmailAge(BigDecimal value) {
        this.wlltAcctEmailAge = value;
        return this;
    }

    /**
     * Gets the value of the wlltPrvdrRskAssmnt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public RiskAssessment1Code getWlltPrvdrRskAssmnt() {
        return wlltPrvdrRskAssmnt;
    }

    /**
     * Sets the value of the wlltPrvdrRskAssmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public Wallet2 setWlltPrvdrRskAssmnt(RiskAssessment1Code value) {
        this.wlltPrvdrRskAssmnt = value;
        return this;
    }

    /**
     * Gets the value of the wlltPrvdrRskAssmntMdlVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltPrvdrRskAssmntMdlVrsn() {
        return wlltPrvdrRskAssmntMdlVrsn;
    }

    /**
     * Sets the value of the wlltPrvdrRskAssmntMdlVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet2 setWlltPrvdrRskAssmntMdlVrsn(String value) {
        this.wlltPrvdrRskAssmntMdlVrsn = value;
        return this;
    }

    /**
     * Gets the value of the wlltPrvdrPhneScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrPhneScore() {
        return wlltPrvdrPhneScore;
    }

    /**
     * Sets the value of the wlltPrvdrPhneScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setWlltPrvdrPhneScore(BigDecimal value) {
        this.wlltPrvdrPhneScore = value;
        return this;
    }

    /**
     * Gets the value of the wlltPrvdrDvcScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrDvcScore() {
        return wlltPrvdrDvcScore;
    }

    /**
     * Sets the value of the wlltPrvdrDvcScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setWlltPrvdrDvcScore(BigDecimal value) {
        this.wlltPrvdrDvcScore = value;
        return this;
    }

    /**
     * Gets the value of the wlltPrvdrAcctScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrAcctScore() {
        return wlltPrvdrAcctScore;
    }

    /**
     * Sets the value of the wlltPrvdrAcctScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet2 setWlltPrvdrAcctScore(BigDecimal value) {
        this.wlltPrvdrAcctScore = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public Wallet2 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
