
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
 * Compares information related to both sides of a collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMatchingCriteria3", propOrder = {
    "uncollsdFlg",
    "netXpsrCollstnInd",
    "collValDt",
    "cmpntTp",
    "bsktIdr"
})
public class CollateralMatchingCriteria3 {

    @XmlElement(name = "UncollsdFlg")
    protected CompareTrueFalseIndicator2 uncollsdFlg;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected CompareTrueFalseIndicator2 netXpsrCollstnInd;
    @XmlElement(name = "CollValDt")
    protected CompareDate2 collValDt;
    @XmlElement(name = "CmpntTp")
    protected SecurityCommodityCash1 cmpntTp;
    @XmlElement(name = "BsktIdr")
    protected CompareSecurityIdentification2 bsktIdr;

    /**
     * Gets the value of the uncollsdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getUncollsdFlg() {
        return uncollsdFlg;
    }

    /**
     * Sets the value of the uncollsdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CollateralMatchingCriteria3 setUncollsdFlg(CompareTrueFalseIndicator2 value) {
        this.uncollsdFlg = value;
        return this;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CompareTrueFalseIndicator2 getNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator2 }
     *     
     */
    public CollateralMatchingCriteria3 setNetXpsrCollstnInd(CompareTrueFalseIndicator2 value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate2 }
     *     
     */
    public CompareDate2 getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate2 }
     *     
     */
    public CollateralMatchingCriteria3 setCollValDt(CompareDate2 value) {
        this.collValDt = value;
        return this;
    }

    /**
     * Gets the value of the cmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodityCash1 }
     *     
     */
    public SecurityCommodityCash1 getCmpntTp() {
        return cmpntTp;
    }

    /**
     * Sets the value of the cmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodityCash1 }
     *     
     */
    public CollateralMatchingCriteria3 setCmpntTp(SecurityCommodityCash1 value) {
        this.cmpntTp = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecurityIdentification2 }
     *     
     */
    public CompareSecurityIdentification2 getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecurityIdentification2 }
     *     
     */
    public CollateralMatchingCriteria3 setBsktIdr(CompareSecurityIdentification2 value) {
        this.bsktIdr = value;
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
