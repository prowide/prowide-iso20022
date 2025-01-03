
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
 * Provides information about the collateral valuation such as the collateral amount, the market value.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount1", propOrder = {
    "collAmt",
    "rptdCcyAndAmt",
    "mktValAmt",
    "acrdIntrstAmt",
    "feesAndComssns"
})
public class CollateralAmount1 {

    @XmlElement(name = "CollAmt", required = true)
    protected ActiveCurrencyAndAmount collAmt;
    @XmlElement(name = "RptdCcyAndAmt", required = true)
    protected ActiveCurrencyAndAmount rptdCcyAndAmt;
    @XmlElement(name = "MktValAmt", required = true)
    protected ActiveCurrencyAndAmount mktValAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "FeesAndComssns")
    protected ActiveCurrencyAndAmount feesAndComssns;

    /**
     * Gets the value of the collAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollAmt() {
        return collAmt;
    }

    /**
     * Sets the value of the collAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralAmount1 setCollAmt(ActiveCurrencyAndAmount value) {
        this.collAmt = value;
        return this;
    }

    /**
     * Gets the value of the rptdCcyAndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRptdCcyAndAmt() {
        return rptdCcyAndAmt;
    }

    /**
     * Sets the value of the rptdCcyAndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralAmount1 setRptdCcyAndAmt(ActiveCurrencyAndAmount value) {
        this.rptdCcyAndAmt = value;
        return this;
    }

    /**
     * Gets the value of the mktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktValAmt() {
        return mktValAmt;
    }

    /**
     * Sets the value of the mktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralAmount1 setMktValAmt(ActiveCurrencyAndAmount value) {
        this.mktValAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralAmount1 setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the feesAndComssns property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFeesAndComssns() {
        return feesAndComssns;
    }

    /**
     * Sets the value of the feesAndComssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralAmount1 setFeesAndComssns(ActiveCurrencyAndAmount value) {
        this.feesAndComssns = value;
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
