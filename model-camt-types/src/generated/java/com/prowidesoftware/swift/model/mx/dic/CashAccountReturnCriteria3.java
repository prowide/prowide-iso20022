
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
 * Defines the criteria used to report on an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccountReturnCriteria3", propOrder = {
    "nmInd",
    "ccyInd",
    "tpInd",
    "mulLmtInd",
    "mulBalRtrCrit",
    "bilLmtInd",
    "bilBalRtrCrit",
    "stgOrdrInd",
    "acctOwnrInd",
    "acctSvcrInd"
})
public class CashAccountReturnCriteria3 {

    @XmlElement(name = "NmInd")
    protected Boolean nmInd;
    @XmlElement(name = "CcyInd")
    protected Boolean ccyInd;
    @XmlElement(name = "TpInd")
    protected Boolean tpInd;
    @XmlElement(name = "MulLmtInd")
    protected Boolean mulLmtInd;
    @XmlElement(name = "MulBalRtrCrit")
    protected CashBalanceReturnCriteria mulBalRtrCrit;
    @XmlElement(name = "BilLmtInd")
    protected Boolean bilLmtInd;
    @XmlElement(name = "BilBalRtrCrit")
    protected CashBalanceReturnCriteria bilBalRtrCrit;
    @XmlElement(name = "StgOrdrInd")
    protected Boolean stgOrdrInd;
    @XmlElement(name = "AcctOwnrInd")
    protected Boolean acctOwnrInd;
    @XmlElement(name = "AcctSvcrInd")
    protected Boolean acctSvcrInd;

    /**
     * Gets the value of the nmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNmInd() {
        return nmInd;
    }

    /**
     * Sets the value of the nmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setNmInd(Boolean value) {
        this.nmInd = value;
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
    public CashAccountReturnCriteria3 setCcyInd(Boolean value) {
        this.ccyInd = value;
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
    public CashAccountReturnCriteria3 setTpInd(Boolean value) {
        this.tpInd = value;
        return this;
    }

    /**
     * Gets the value of the mulLmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMulLmtInd() {
        return mulLmtInd;
    }

    /**
     * Sets the value of the mulLmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setMulLmtInd(Boolean value) {
        this.mulLmtInd = value;
        return this;
    }

    /**
     * Gets the value of the mulBalRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalanceReturnCriteria }
     *     
     */
    public CashBalanceReturnCriteria getMulBalRtrCrit() {
        return mulBalRtrCrit;
    }

    /**
     * Sets the value of the mulBalRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalanceReturnCriteria }
     *     
     */
    public CashAccountReturnCriteria3 setMulBalRtrCrit(CashBalanceReturnCriteria value) {
        this.mulBalRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the bilLmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBilLmtInd() {
        return bilLmtInd;
    }

    /**
     * Sets the value of the bilLmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setBilLmtInd(Boolean value) {
        this.bilLmtInd = value;
        return this;
    }

    /**
     * Gets the value of the bilBalRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalanceReturnCriteria }
     *     
     */
    public CashBalanceReturnCriteria getBilBalRtrCrit() {
        return bilBalRtrCrit;
    }

    /**
     * Sets the value of the bilBalRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalanceReturnCriteria }
     *     
     */
    public CashAccountReturnCriteria3 setBilBalRtrCrit(CashBalanceReturnCriteria value) {
        this.bilBalRtrCrit = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgOrdrInd() {
        return stgOrdrInd;
    }

    /**
     * Sets the value of the stgOrdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setStgOrdrInd(Boolean value) {
        this.stgOrdrInd = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctOwnrInd() {
        return acctOwnrInd;
    }

    /**
     * Sets the value of the acctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setAcctOwnrInd(Boolean value) {
        this.acctOwnrInd = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcctSvcrInd() {
        return acctSvcrInd;
    }

    /**
     * Sets the value of the acctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CashAccountReturnCriteria3 setAcctSvcrInd(Boolean value) {
        this.acctSvcrInd = value;
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
