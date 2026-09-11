
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Container for tenders used by the customer to perform the payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet4", propOrder = {
    "prvdrNm",
    "prvdrBizNm",
    "prvdrId",
    "prvdrLglCorpNm",
    "prvdrAdr",
    "prvdrLclData",
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
    "acctEmailAge",
    "prvdrRskAssmnt",
    "prvdrRskAssmntMdlVrsn",
    "prvdrPhneScore",
    "prvdrDvcScore",
    "prvdrAcctScore",
    "prvdrRsnCd",
    "prvtData",
    "ntlData"
})
public class Wallet4 {

    @XmlElement(name = "PrvdrNm")
    protected String prvdrNm;
    @XmlElement(name = "PrvdrBizNm")
    protected String prvdrBizNm;
    @XmlElement(name = "PrvdrId")
    protected String prvdrId;
    @XmlElement(name = "PrvdrLglCorpNm")
    protected String prvdrLglCorpNm;
    @XmlElement(name = "PrvdrAdr")
    protected Address4 prvdrAdr;
    @XmlElement(name = "PrvdrLclData")
    protected List<LocalData20> prvdrLclData;
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
    protected CardDataReading12Code cardDataNtryMd;
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
    @XmlElement(name = "PrvdrRsnCd")
    protected String prvdrRsnCd;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the prvdrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrNm() {
        return prvdrNm;
    }

    /**
     * Sets the value of the prvdrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet4 setPrvdrNm(String value) {
        this.prvdrNm = value;
        return this;
    }

    /**
     * Gets the value of the prvdrBizNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrBizNm() {
        return prvdrBizNm;
    }

    /**
     * Sets the value of the prvdrBizNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet4 setPrvdrBizNm(String value) {
        this.prvdrBizNm = value;
        return this;
    }

    /**
     * Gets the value of the prvdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Sets the value of the prvdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet4 setPrvdrId(String value) {
        this.prvdrId = value;
        return this;
    }

    /**
     * Gets the value of the prvdrLglCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrLglCorpNm() {
        return prvdrLglCorpNm;
    }

    /**
     * Sets the value of the prvdrLglCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet4 setPrvdrLglCorpNm(String value) {
        this.prvdrLglCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the prvdrAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address4 }
     *     
     */
    public Address4 getPrvdrAdr() {
        return prvdrAdr;
    }

    /**
     * Sets the value of the prvdrAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address4 }
     *     
     */
    public Wallet4 setPrvdrAdr(Address4 value) {
        this.prvdrAdr = value;
        return this;
    }

    /**
     * Gets the value of the prvdrLclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvdrLclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvdrLclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalData20 }
     * 
     * 
     * @return
     *     The value of the prvdrLclData property.
     */
    public List<LocalData20> getPrvdrLclData() {
        if (prvdrLclData == null) {
            prvdrLclData = new ArrayList<>();
        }
        return this.prvdrLclData;
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
    public Wallet4 setPANAge(BigDecimal value) {
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
    public Wallet4 setUsrAcctAge(BigDecimal value) {
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
    public Wallet4 setAcctAge(BigDecimal value) {
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
    public Wallet4 setDaysSncLastActvty(BigDecimal value) {
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
    public Wallet4 setActvty(BigDecimal value) {
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
    public Wallet4 setActvtyIntrvl(Frequency12Code value) {
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
    public Wallet4 setLastWlltChng(BigDecimal value) {
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
    public Wallet4 setSspdCrds(BigDecimal value) {
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
    public Wallet4 setAcctCtry(String value) {
        this.acctCtry = value;
        return this;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading12Code }
     *     
     */
    public CardDataReading12Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading12Code }
     *     
     */
    public Wallet4 setCardDataNtryMd(CardDataReading12Code value) {
        this.cardDataNtryMd = value;
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
    public Wallet4 setAcctEmailAge(BigDecimal value) {
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
    public Wallet4 setPrvdrRskAssmnt(RiskAssessment1Code value) {
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
    public Wallet4 setPrvdrRskAssmntMdlVrsn(String value) {
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
    public Wallet4 setPrvdrPhneScore(BigDecimal value) {
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
    public Wallet4 setPrvdrDvcScore(BigDecimal value) {
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
    public Wallet4 setPrvdrAcctScore(BigDecimal value) {
        this.prvdrAcctScore = value;
        return this;
    }

    /**
     * Gets the value of the prvdrRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrRsnCd() {
        return prvdrRsnCd;
    }

    /**
     * Sets the value of the prvdrRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Wallet4 setPrvdrRsnCd(String value) {
        this.prvdrRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the prvdrLclData list.
     * @see #getPrvdrLclData()
     * 
     */
    public Wallet4 addPrvdrLclData(LocalData20 prvdrLclData) {
        getPrvdrLclData().add(prvdrLclData);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Wallet4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Wallet4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
