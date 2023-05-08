
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
 * Provide the details of the performance indicators for the money market fund during the reporting period.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceFactors2", propOrder = {
    "fndValtn",
    "lqdtyInf",
    "yld"
})
public class PerformanceFactors2 {

    @XmlElement(name = "FndValtn", required = true)
    protected FundValuation1 fndValtn;
    @XmlElement(name = "LqdtyInf", required = true)
    protected FundLiquidity1 lqdtyInf;
    @XmlElement(name = "Yld", required = true)
    protected Yield1 yld;

    /**
     * Gets the value of the fndValtn property.
     * 
     * @return
     *     possible object is
     *     {@link FundValuation1 }
     *     
     */
    public FundValuation1 getFndValtn() {
        return fndValtn;
    }

    /**
     * Sets the value of the fndValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundValuation1 }
     *     
     */
    public PerformanceFactors2 setFndValtn(FundValuation1 value) {
        this.fndValtn = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyInf property.
     * 
     * @return
     *     possible object is
     *     {@link FundLiquidity1 }
     *     
     */
    public FundLiquidity1 getLqdtyInf() {
        return lqdtyInf;
    }

    /**
     * Sets the value of the lqdtyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundLiquidity1 }
     *     
     */
    public PerformanceFactors2 setLqdtyInf(FundLiquidity1 value) {
        this.lqdtyInf = value;
        return this;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link Yield1 }
     *     
     */
    public Yield1 getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Yield1 }
     *     
     */
    public PerformanceFactors2 setYld(Yield1 value) {
        this.yld = value;
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
