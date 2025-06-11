
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
@XmlType(name = "Wallet3", propOrder = {
    "prvdr",
    "panAge",
    "usrAcctAge",
    "acctAge",
    "daysSncLastActvty",
    "actvty",
    "actvtyIntrvl",
    "lastWlltChng",
    "sspdCrds",
    "acctCtry",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "acctEmailAge",
    "prvdrRskAssmnt",
    "prvdrRskAssmntMdlVrsn",
    "prvdrPhneScore",
    "prvdrDvcScore",
    "prvdrAcctScore",
    "addtlData"
})
public class Wallet3 {

    @XmlElement(name = "Prvdr")
    protected PartyIdentification285 prvdr;
    @XmlElement(name = "PANAge")
    protected BigDecimal panAge;
    @XmlElement(name = "UsrAcctAge")
    protected BigDecimal usrAcctAge;
    @XmlElement(name = "AcctAge")
    protected BigDecimal acctAge;
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
    @XmlElement(name = "AcctCtry")
    protected String acctCtry;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading9Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "AcctEmailAge")
    protected BigDecimal acctEmailAge;
    @XmlElement(name = "PrvdrRskAssmnt")
    @XmlSchemaType(name = "string")
    protected RiskAssessment1Code prvdrRskAssmnt;
    @XmlElement(name = "PrvdrRskAssmntMdlVrsn")
    protected String prvdrRskAssmntMdlVrsn;
    @XmlElement(name = "PrvdrPhneScore")
    protected BigDecimal prvdrPhneScore;
    @XmlElement(name = "PrvdrDvcScore")
    protected BigDecimal prvdrDvcScore;
    @XmlElement(name = "PrvdrAcctScore")
    protected BigDecimal prvdrAcctScore;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public Wallet3 setPrvdr(PartyIdentification285 value) {
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
    public Wallet3 setPANAge(BigDecimal value) {
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
    public Wallet3 setUsrAcctAge(BigDecimal value) {
        this.usrAcctAge = value;
        return this;
    }

    /**
     * Gets the value of the acctAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctAge() {
        return acctAge;
    }

    /**
     * Sets the value of the acctAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet3 setAcctAge(BigDecimal value) {
        this.acctAge = value;
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
    public Wallet3 setDaysSncLastActvty(BigDecimal value) {
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
    public Wallet3 setActvty(BigDecimal value) {
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
    public Wallet3 setActvtyIntrvl(Frequency12Code value) {
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
    public Wallet3 setLastWlltChng(BigDecimal value) {
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
    public Wallet3 setSspdCrds(BigDecimal value) {
        this.sspdCrds = value;
        return this;
    }

    /**
     * Gets the value of the acctCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCtry() {
        return acctCtry;
    }

    /**
     * Sets the value of the acctCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet3 setAcctCtry(String value) {
        this.acctCtry = value;
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
    public Wallet3 setCardDataNtryMd(CardDataReading9Code value) {
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
    public Wallet3 setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the acctEmailAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcctEmailAge() {
        return acctEmailAge;
    }

    /**
     * Sets the value of the acctEmailAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet3 setAcctEmailAge(BigDecimal value) {
        this.acctEmailAge = value;
        return this;
    }

    /**
     * Gets the value of the prvdrRskAssmnt property.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public RiskAssessment1Code getPrvdrRskAssmnt() {
        return prvdrRskAssmnt;
    }

    /**
     * Sets the value of the prvdrRskAssmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public Wallet3 setPrvdrRskAssmnt(RiskAssessment1Code value) {
        this.prvdrRskAssmnt = value;
        return this;
    }

    /**
     * Gets the value of the prvdrRskAssmntMdlVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrRskAssmntMdlVrsn() {
        return prvdrRskAssmntMdlVrsn;
    }

    /**
     * Sets the value of the prvdrRskAssmntMdlVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet3 setPrvdrRskAssmntMdlVrsn(String value) {
        this.prvdrRskAssmntMdlVrsn = value;
        return this;
    }

    /**
     * Gets the value of the prvdrPhneScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvdrPhneScore() {
        return prvdrPhneScore;
    }

    /**
     * Sets the value of the prvdrPhneScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet3 setPrvdrPhneScore(BigDecimal value) {
        this.prvdrPhneScore = value;
        return this;
    }

    /**
     * Gets the value of the prvdrDvcScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvdrDvcScore() {
        return prvdrDvcScore;
    }

    /**
     * Sets the value of the prvdrDvcScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet3 setPrvdrDvcScore(BigDecimal value) {
        this.prvdrDvcScore = value;
        return this;
    }

    /**
     * Gets the value of the prvdrAcctScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvdrAcctScore() {
        return prvdrAcctScore;
    }

    /**
     * Sets the value of the prvdrAcctScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Wallet3 setPrvdrAcctScore(BigDecimal value) {
        this.prvdrAcctScore = value;
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
    public Wallet3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
