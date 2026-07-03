
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
 * Defines the criteria used to report on collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReturnCriteria1", propOrder = {
    "cshAcctOwnrInd",
    "cshAcctSvcrInd",
    "sctiesAcctOwnrInd",
    "sctiesAcctSvcrInd",
    "ttlCollValtnInd",
    "sctiesAcctInd",
    "scties"
})
public class CollateralValueReturnCriteria1 {

    @XmlElement(name = "CshAcctOwnrInd")
    protected Boolean cshAcctOwnrInd;
    @XmlElement(name = "CshAcctSvcrInd")
    protected Boolean cshAcctSvcrInd;
    @XmlElement(name = "SctiesAcctOwnrInd")
    protected Boolean sctiesAcctOwnrInd;
    @XmlElement(name = "SctiesAcctSvcrInd")
    protected Boolean sctiesAcctSvcrInd;
    @XmlElement(name = "TtlCollValtnInd")
    protected Boolean ttlCollValtnInd;
    @XmlElement(name = "SctiesAcctInd")
    protected Boolean sctiesAcctInd;
    @XmlElement(name = "Scties")
    protected Boolean scties;

    /**
     * Gets the value of the cshAcctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshAcctOwnrInd() {
        return cshAcctOwnrInd;
    }

    /**
     * Sets the value of the cshAcctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setCshAcctOwnrInd(Boolean value) {
        this.cshAcctOwnrInd = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshAcctSvcrInd() {
        return cshAcctSvcrInd;
    }

    /**
     * Sets the value of the cshAcctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setCshAcctSvcrInd(Boolean value) {
        this.cshAcctSvcrInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctOwnrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctOwnrInd() {
        return sctiesAcctOwnrInd;
    }

    /**
     * Sets the value of the sctiesAcctOwnrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setSctiesAcctOwnrInd(Boolean value) {
        this.sctiesAcctOwnrInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctSvcrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctSvcrInd() {
        return sctiesAcctSvcrInd;
    }

    /**
     * Sets the value of the sctiesAcctSvcrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setSctiesAcctSvcrInd(Boolean value) {
        this.sctiesAcctSvcrInd = value;
        return this;
    }

    /**
     * Gets the value of the ttlCollValtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlCollValtnInd() {
        return ttlCollValtnInd;
    }

    /**
     * Sets the value of the ttlCollValtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setTtlCollValtnInd(Boolean value) {
        this.ttlCollValtnInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcctInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesAcctInd() {
        return sctiesAcctInd;
    }

    /**
     * Sets the value of the sctiesAcctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setSctiesAcctInd(Boolean value) {
        this.sctiesAcctInd = value;
        return this;
    }

    /**
     * Gets the value of the scties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScties() {
        return scties;
    }

    /**
     * Sets the value of the scties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CollateralValueReturnCriteria1 setScties(Boolean value) {
        this.scties = value;
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
