
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
@XmlType(name = "CollateralMatchingCriteria6", propOrder = {
    "uncollsdFlg",
    "netXpsrCollstnInd",
    "collValDt",
    "asstTp",
    "bsktIdr"
})
public class CollateralMatchingCriteria6 {

    @XmlElement(name = "UncollsdFlg")
    protected CompareTrueFalseIndicator3 uncollsdFlg;
    @XmlElement(name = "NetXpsrCollstnInd")
    protected CompareTrueFalseIndicator3 netXpsrCollstnInd;
    @XmlElement(name = "CollValDt")
    protected CompareDate3 collValDt;
    @XmlElement(name = "AsstTp")
    protected SecurityCommodityCash4 asstTp;
    @XmlElement(name = "BsktIdr")
    protected CompareSecurityIdentification4 bsktIdr;

    /**
     * Gets the value of the uncollsdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getUncollsdFlg() {
        return uncollsdFlg;
    }

    /**
     * Sets the value of the uncollsdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CollateralMatchingCriteria6 setUncollsdFlg(CompareTrueFalseIndicator3 value) {
        this.uncollsdFlg = value;
        return this;
    }

    /**
     * Gets the value of the netXpsrCollstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getNetXpsrCollstnInd() {
        return netXpsrCollstnInd;
    }

    /**
     * Sets the value of the netXpsrCollstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CollateralMatchingCriteria6 setNetXpsrCollstnInd(CompareTrueFalseIndicator3 value) {
        this.netXpsrCollstnInd = value;
        return this;
    }

    /**
     * Gets the value of the collValDt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getCollValDt() {
        return collValDt;
    }

    /**
     * Sets the value of the collValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public CollateralMatchingCriteria6 setCollValDt(CompareDate3 value) {
        this.collValDt = value;
        return this;
    }

    /**
     * Gets the value of the asstTp property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCommodityCash4 }
     *     
     */
    public SecurityCommodityCash4 getAsstTp() {
        return asstTp;
    }

    /**
     * Sets the value of the asstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCommodityCash4 }
     *     
     */
    public CollateralMatchingCriteria6 setAsstTp(SecurityCommodityCash4 value) {
        this.asstTp = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link CompareSecurityIdentification4 }
     *     
     */
    public CompareSecurityIdentification4 getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareSecurityIdentification4 }
     *     
     */
    public CollateralMatchingCriteria6 setBsktIdr(CompareSecurityIdentification4 value) {
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
