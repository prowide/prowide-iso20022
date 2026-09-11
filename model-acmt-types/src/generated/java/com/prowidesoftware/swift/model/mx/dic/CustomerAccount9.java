
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
 * Account owned by a customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccount9", propOrder = {
    "id",
    "nm",
    "sts",
    "tp",
    "ccy",
    "prxy",
    "minMnthlyPmtVal",
    "maxMnthlyPmtVal",
    "minMnthlyRcvdVal",
    "maxMnthlyRcvdVal",
    "minMnthlyTxNb",
    "maxMnthlyTxNb",
    "minAvrgBal",
    "maxAvrgBal",
    "acctPurp",
    "minFlrNtfctnAmt",
    "maxFlrNtfctnAmt",
    "minClngNtfctnAmt",
    "maxClngNtfctnAmt",
    "stmtFrqcyAndFrmt",
    "rstrctn",
    "clsgDt",
    "opngDt",
    "refAcctId",
    "prtry",
    "acctOwnr"
})
public class CustomerAccount9 {

    @XmlElement(name = "Id")
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected AccountStatus3Code sts;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Prxy")
    protected ProxyAccountIdentification1 prxy;
    @XmlElement(name = "MinMnthlyPmtVal")
    protected BigDecimal minMnthlyPmtVal;
    @XmlElement(name = "MaxMnthlyPmtVal")
    protected BigDecimal maxMnthlyPmtVal;
    @XmlElement(name = "MinMnthlyRcvdVal")
    protected BigDecimal minMnthlyRcvdVal;
    @XmlElement(name = "MaxMnthlyRcvdVal")
    protected BigDecimal maxMnthlyRcvdVal;
    @XmlElement(name = "MinMnthlyTxNb")
    protected String minMnthlyTxNb;
    @XmlElement(name = "MaxMnthlyTxNb")
    protected String maxMnthlyTxNb;
    @XmlElement(name = "MinAvrgBal")
    protected BigDecimal minAvrgBal;
    @XmlElement(name = "MaxAvrgBal")
    protected BigDecimal maxAvrgBal;
    @XmlElement(name = "AcctPurp")
    protected String acctPurp;
    @XmlElement(name = "MinFlrNtfctnAmt")
    protected BigDecimal minFlrNtfctnAmt;
    @XmlElement(name = "MaxFlrNtfctnAmt")
    protected BigDecimal maxFlrNtfctnAmt;
    @XmlElement(name = "MinClngNtfctnAmt")
    protected BigDecimal minClngNtfctnAmt;
    @XmlElement(name = "MaxClngNtfctnAmt")
    protected BigDecimal maxClngNtfctnAmt;
    @XmlElement(name = "StmtFrqcyAndFrmt")
    protected List<StatementFrequencyAndForm1> stmtFrqcyAndFrmt;
    @XmlElement(name = "Rstrctn")
    protected List<Restriction1> rstrctn;
    @XmlElement(name = "ClsgDt")
    protected DatePeriodSearch1Choice clsgDt;
    @XmlElement(name = "OpngDt")
    protected DatePeriodSearch1Choice opngDt;
    @XmlElement(name = "RefAcctId")
    protected AccountIdentification4Choice refAcctId;
    @XmlElement(name = "Prtry")
    protected List<GenericIdentification1> prtry;
    @XmlElement(name = "AcctOwnr")
    protected OrganisationIdentification29 acctOwnr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CustomerAccount9 setId(AccountIdentification4Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount9 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus3Code }
     *     
     */
    public AccountStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus3Code }
     *     
     */
    public CustomerAccount9 setSts(AccountStatus3Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CustomerAccount9 setTp(CashAccountType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount9 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public ProxyAccountIdentification1 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAccountIdentification1 }
     *     
     */
    public CustomerAccount9 setPrxy(ProxyAccountIdentification1 value) {
        this.prxy = value;
        return this;
    }

    /**
     * Gets the value of the minMnthlyPmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinMnthlyPmtVal() {
        return minMnthlyPmtVal;
    }

    /**
     * Sets the value of the minMnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMinMnthlyPmtVal(BigDecimal value) {
        this.minMnthlyPmtVal = value;
        return this;
    }

    /**
     * Gets the value of the maxMnthlyPmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxMnthlyPmtVal() {
        return maxMnthlyPmtVal;
    }

    /**
     * Sets the value of the maxMnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMaxMnthlyPmtVal(BigDecimal value) {
        this.maxMnthlyPmtVal = value;
        return this;
    }

    /**
     * Gets the value of the minMnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinMnthlyRcvdVal() {
        return minMnthlyRcvdVal;
    }

    /**
     * Sets the value of the minMnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMinMnthlyRcvdVal(BigDecimal value) {
        this.minMnthlyRcvdVal = value;
        return this;
    }

    /**
     * Gets the value of the maxMnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxMnthlyRcvdVal() {
        return maxMnthlyRcvdVal;
    }

    /**
     * Sets the value of the maxMnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMaxMnthlyRcvdVal(BigDecimal value) {
        this.maxMnthlyRcvdVal = value;
        return this;
    }

    /**
     * Gets the value of the minMnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinMnthlyTxNb() {
        return minMnthlyTxNb;
    }

    /**
     * Sets the value of the minMnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount9 setMinMnthlyTxNb(String value) {
        this.minMnthlyTxNb = value;
        return this;
    }

    /**
     * Gets the value of the maxMnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxMnthlyTxNb() {
        return maxMnthlyTxNb;
    }

    /**
     * Sets the value of the maxMnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount9 setMaxMnthlyTxNb(String value) {
        this.maxMnthlyTxNb = value;
        return this;
    }

    /**
     * Gets the value of the minAvrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAvrgBal() {
        return minAvrgBal;
    }

    /**
     * Sets the value of the minAvrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMinAvrgBal(BigDecimal value) {
        this.minAvrgBal = value;
        return this;
    }

    /**
     * Gets the value of the maxAvrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxAvrgBal() {
        return maxAvrgBal;
    }

    /**
     * Sets the value of the maxAvrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMaxAvrgBal(BigDecimal value) {
        this.maxAvrgBal = value;
        return this;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount9 setAcctPurp(String value) {
        this.acctPurp = value;
        return this;
    }

    /**
     * Gets the value of the minFlrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinFlrNtfctnAmt() {
        return minFlrNtfctnAmt;
    }

    /**
     * Sets the value of the minFlrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMinFlrNtfctnAmt(BigDecimal value) {
        this.minFlrNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxFlrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxFlrNtfctnAmt() {
        return maxFlrNtfctnAmt;
    }

    /**
     * Sets the value of the maxFlrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMaxFlrNtfctnAmt(BigDecimal value) {
        this.maxFlrNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the minClngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinClngNtfctnAmt() {
        return minClngNtfctnAmt;
    }

    /**
     * Sets the value of the minClngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMinClngNtfctnAmt(BigDecimal value) {
        this.minClngNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the maxClngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxClngNtfctnAmt() {
        return maxClngNtfctnAmt;
    }

    /**
     * Sets the value of the maxClngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount9 setMaxClngNtfctnAmt(BigDecimal value) {
        this.maxClngNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtFrqcyAndFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementFrequencyAndForm1 }
     * 
     * 
     * @return
     *     The value of the stmtFrqcyAndFrmt property.
     */
    public List<StatementFrequencyAndForm1> getStmtFrqcyAndFrmt() {
        if (stmtFrqcyAndFrmt == null) {
            stmtFrqcyAndFrmt = new ArrayList<>();
        }
        return this.stmtFrqcyAndFrmt;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<Restriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public CustomerAccount9 setClsgDt(DatePeriodSearch1Choice value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public CustomerAccount9 setOpngDt(DatePeriodSearch1Choice value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the refAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getRefAcctId() {
        return refAcctId;
    }

    /**
     * Sets the value of the refAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CustomerAccount9 setRefAcctId(AccountIdentification4Choice value) {
        this.refAcctId = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification1 }
     * 
     * 
     * @return
     *     The value of the prtry property.
     */
    public List<GenericIdentification1> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<>();
        }
        return this.prtry;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public OrganisationIdentification29 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification29 }
     *     
     */
    public CustomerAccount9 setAcctOwnr(OrganisationIdentification29 value) {
        this.acctOwnr = value;
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
     * Adds a new item to the stmtFrqcyAndFrmt list.
     * @see #getStmtFrqcyAndFrmt()
     * 
     */
    public CustomerAccount9 addStmtFrqcyAndFrmt(StatementFrequencyAndForm1 stmtFrqcyAndFrmt) {
        getStmtFrqcyAndFrmt().add(stmtFrqcyAndFrmt);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public CustomerAccount9 addRstrctn(Restriction1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

    /**
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public CustomerAccount9 addPrtry(GenericIdentification1 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
