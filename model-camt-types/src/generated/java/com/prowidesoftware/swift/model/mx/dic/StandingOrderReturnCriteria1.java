
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to report on standing orders.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderReturnCriteria1", propOrder = {
    "stgOrdrIdInd",
    "tpInd",
    "sysMmbInd",
    "rspnsblPtyInd",
    "ccyInd",
    "dbtrAcctInd",
    "cdtrAcctInd",
    "assoctdPoolAcct",
    "frqcyInd",
    "exctnTpInd",
    "vldtyFrInd",
    "vldToInd",
    "lkSetIdInd",
    "lkSetOrdrIdInd",
    "lkSetOrdrSeqInd",
    "ttlAmtInd",
    "zeroSweepInd"
})
public class StandingOrderReturnCriteria1 {

    @XmlElement(name = "StgOrdrIdInd")
    protected Boolean stgOrdrIdInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "SysMmbInd")
    protected Boolean sysMmbInd;
    @XmlElement(name = "RspnsblPtyInd")
    protected Boolean rspnsblPtyInd;
    @XmlElement(name = "CcyInd")
    protected Boolean ccyInd;
    @XmlElement(name = "DbtrAcctInd")
    protected Boolean dbtrAcctInd;
    @XmlElement(name = "CdtrAcctInd")
    protected Boolean cdtrAcctInd;
    @XmlElement(name = "AssoctdPoolAcct")
    protected Boolean assoctdPoolAcct;
    @XmlElement(name = "FrqcyInd")
    protected Boolean frqcyInd;
    @XmlElement(name = "ExctnTpInd")
    protected Boolean exctnTpInd;
    @XmlElement(name = "VldtyFrInd")
    protected Boolean vldtyFrInd;
    @XmlElement(name = "VldToInd")
    protected Boolean vldToInd;
    @XmlElement(name = "LkSetIdInd")
    protected Boolean lkSetIdInd;
    @XmlElement(name = "LkSetOrdrIdInd")
    protected Boolean lkSetOrdrIdInd;
    @XmlElement(name = "LkSetOrdrSeqInd")
    protected Boolean lkSetOrdrSeqInd;
    @XmlElement(name = "TtlAmtInd")
    protected Boolean ttlAmtInd;
    @XmlElement(name = "ZeroSweepInd")
    protected Boolean zeroSweepInd;

    /**
     * Gets the value of the stgOrdrIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgOrdrIdInd() {
        return stgOrdrIdInd;
    }

    /**
     * Sets the value of the stgOrdrIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setStgOrdrIdInd(Boolean value) {
        this.stgOrdrIdInd = value;
        return this;
    }

    /**
     * Gets the value of the tpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTpInd() {
        return tpInd;
    }

    /**
     * Sets the value of the tpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setTpInd(Boolean value) {
        this.tpInd = value;
        return this;
    }

    /**
     * Gets the value of the sysMmbInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSysMmbInd() {
        return sysMmbInd;
    }

    /**
     * Sets the value of the sysMmbInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setSysMmbInd(Boolean value) {
        this.sysMmbInd = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnsblPtyInd() {
        return rspnsblPtyInd;
    }

    /**
     * Sets the value of the rspnsblPtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setRspnsblPtyInd(Boolean value) {
        this.rspnsblPtyInd = value;
        return this;
    }

    /**
     * Gets the value of the ccyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcyInd() {
        return ccyInd;
    }

    /**
     * Sets the value of the ccyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setCcyInd(Boolean value) {
        this.ccyInd = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtrAcctInd() {
        return dbtrAcctInd;
    }

    /**
     * Sets the value of the dbtrAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setDbtrAcctInd(Boolean value) {
        this.dbtrAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtrAcctInd() {
        return cdtrAcctInd;
    }

    /**
     * Sets the value of the cdtrAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setCdtrAcctInd(Boolean value) {
        this.cdtrAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the assoctdPoolAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssoctdPoolAcct() {
        return assoctdPoolAcct;
    }

    /**
     * Sets the value of the assoctdPoolAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setAssoctdPoolAcct(Boolean value) {
        this.assoctdPoolAcct = value;
        return this;
    }

    /**
     * Gets the value of the frqcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrqcyInd() {
        return frqcyInd;
    }

    /**
     * Sets the value of the frqcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setFrqcyInd(Boolean value) {
        this.frqcyInd = value;
        return this;
    }

    /**
     * Gets the value of the exctnTpInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExctnTpInd() {
        return exctnTpInd;
    }

    /**
     * Sets the value of the exctnTpInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setExctnTpInd(Boolean value) {
        this.exctnTpInd = value;
        return this;
    }

    /**
     * Gets the value of the vldtyFrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVldtyFrInd() {
        return vldtyFrInd;
    }

    /**
     * Sets the value of the vldtyFrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setVldtyFrInd(Boolean value) {
        this.vldtyFrInd = value;
        return this;
    }

    /**
     * Gets the value of the vldToInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVldToInd() {
        return vldToInd;
    }

    /**
     * Sets the value of the vldToInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setVldToInd(Boolean value) {
        this.vldToInd = value;
        return this;
    }

    /**
     * Gets the value of the lkSetIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetIdInd() {
        return lkSetIdInd;
    }

    /**
     * Sets the value of the lkSetIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setLkSetIdInd(Boolean value) {
        this.lkSetIdInd = value;
        return this;
    }

    /**
     * Gets the value of the lkSetOrdrIdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetOrdrIdInd() {
        return lkSetOrdrIdInd;
    }

    /**
     * Sets the value of the lkSetOrdrIdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setLkSetOrdrIdInd(Boolean value) {
        this.lkSetOrdrIdInd = value;
        return this;
    }

    /**
     * Gets the value of the lkSetOrdrSeqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLkSetOrdrSeqInd() {
        return lkSetOrdrSeqInd;
    }

    /**
     * Sets the value of the lkSetOrdrSeqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setLkSetOrdrSeqInd(Boolean value) {
        this.lkSetOrdrSeqInd = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlAmtInd() {
        return ttlAmtInd;
    }

    /**
     * Sets the value of the ttlAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public StandingOrderReturnCriteria1 setTtlAmtInd(Boolean value) {
        this.ttlAmtInd = value;
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
    public StandingOrderReturnCriteria1 setZeroSweepInd(Boolean value) {
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
