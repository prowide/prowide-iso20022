
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria which are used to search for standing orders defined within the system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderSearchCriteria5", propOrder = {
    "keyAttrbtsInd",
    "stgOrdrId",
    "tp",
    "acct",
    "ccy",
    "vldtyPrd",
    "sysMmb",
    "rspnsblPty",
    "assoctdPoolAcct",
    "lkSetId",
    "lkSetOrdrId",
    "lkSetOrdrSeq",
    "zeroSweepInd"
})
public class StandingOrderSearchCriteria5 {

    @XmlElement(name = "KeyAttrbtsInd")
    protected Boolean keyAttrbtsInd;
    @XmlElement(name = "StgOrdrId")
    protected String stgOrdrId;
    @XmlElement(name = "Tp")
    protected StandingOrderType1Choice tp;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "VldtyPrd")
    protected DatePeriod2Choice vldtyPrd;
    @XmlElement(name = "SysMmb")
    protected BranchAndFinancialInstitutionIdentification8 sysMmb;
    @XmlElement(name = "RspnsblPty")
    protected BranchAndFinancialInstitutionIdentification8 rspnsblPty;
    @XmlElement(name = "AssoctdPoolAcct")
    protected AccountIdentification4Choice assoctdPoolAcct;
    @XmlElement(name = "LkSetId")
    protected String lkSetId;
    @XmlElement(name = "LkSetOrdrId")
    protected String lkSetOrdrId;
    @XmlElement(name = "LkSetOrdrSeq")
    protected BigDecimal lkSetOrdrSeq;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the keyAttrbtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyAttrbtsInd() {
        return keyAttrbtsInd;
    }

    /**
     * Sets the value of the keyAttrbtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderSearchCriteria5 setKeyAttrbtsInd(Boolean value) {
        this.keyAttrbtsInd = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderSearchCriteria5 setStgOrdrId(String value) {
        this.stgOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderType1Choice }
     *     
     */
    public StandingOrderType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderType1Choice }
     *     
     */
    public StandingOrderSearchCriteria5 setTp(StandingOrderType1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public StandingOrderSearchCriteria5 setAcct(CashAccount40 value) {
        this.acct = value;
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
    public StandingOrderSearchCriteria5 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public DatePeriod2Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2Choice }
     *     
     */
    public StandingOrderSearchCriteria5 setVldtyPrd(DatePeriod2Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the sysMmb property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getSysMmb() {
        return sysMmb;
    }

    /**
     * Sets the value of the sysMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public StandingOrderSearchCriteria5 setSysMmb(BranchAndFinancialInstitutionIdentification8 value) {
        this.sysMmb = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getRspnsblPty() {
        return rspnsblPty;
    }

    /**
     * Sets the value of the rspnsblPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public StandingOrderSearchCriteria5 setRspnsblPty(BranchAndFinancialInstitutionIdentification8 value) {
        this.rspnsblPty = value;
        return this;
    }

    /**
     * Gets the value of the assoctdPoolAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAssoctdPoolAcct() {
        return assoctdPoolAcct;
    }

    /**
     * Sets the value of the assoctdPoolAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public StandingOrderSearchCriteria5 setAssoctdPoolAcct(AccountIdentification4Choice value) {
        this.assoctdPoolAcct = value;
        return this;
    }

    /**
     * Gets the value of the lkSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSetId() {
        return lkSetId;
    }

    /**
     * Sets the value of the lkSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderSearchCriteria5 setLkSetId(String value) {
        this.lkSetId = value;
        return this;
    }

    /**
     * Gets the value of the lkSetOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSetOrdrId() {
        return lkSetOrdrId;
    }

    /**
     * Sets the value of the lkSetOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StandingOrderSearchCriteria5 setLkSetOrdrId(String value) {
        this.lkSetOrdrId = value;
        return this;
    }

    /**
     * Gets the value of the lkSetOrdrSeq property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLkSetOrdrSeq() {
        return lkSetOrdrSeq;
    }

    /**
     * Sets the value of the lkSetOrdrSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StandingOrderSearchCriteria5 setLkSetOrdrSeq(BigDecimal value) {
        this.lkSetOrdrSeq = value;
        return this;
    }

    /**
     * Gets the value of the zeroSweepInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroSweepInd() {
        return zeroSweepInd;
    }

    /**
     * Sets the value of the zeroSweepInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderSearchCriteria5 setZeroSweepInd(Boolean value) {
        this.zeroSweepInd = value;
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
