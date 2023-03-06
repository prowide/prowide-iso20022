
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
 * Specifies the percentage of net asset value by investor group.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorGroupBreakdownType1", propOrder = {
    "bkRate",
    "gnlGovntRate",
    "hsHldRate",
    "insrncCorptnRate",
    "nonFinCorptnRate",
    "othrCllctvInvstmtUdrtkgRate",
    "othrFIRate",
    "pnsnPlanOrFndRate",
    "uknwnRate"
})
public class InvestorGroupBreakdownType1 {

    @XmlElement(name = "BkRate", required = true)
    protected BigDecimal bkRate;
    @XmlElement(name = "GnlGovntRate", required = true)
    protected BigDecimal gnlGovntRate;
    @XmlElement(name = "HsHldRate", required = true)
    protected BigDecimal hsHldRate;
    @XmlElement(name = "InsrncCorptnRate", required = true)
    protected BigDecimal insrncCorptnRate;
    @XmlElement(name = "NonFinCorptnRate", required = true)
    protected BigDecimal nonFinCorptnRate;
    @XmlElement(name = "OthrCllctvInvstmtUdrtkgRate", required = true)
    protected BigDecimal othrCllctvInvstmtUdrtkgRate;
    @XmlElement(name = "OthrFIRate", required = true)
    protected BigDecimal othrFIRate;
    @XmlElement(name = "PnsnPlanOrFndRate", required = true)
    protected BigDecimal pnsnPlanOrFndRate;
    @XmlElement(name = "UknwnRate", required = true)
    protected BigDecimal uknwnRate;

    /**
     * Gets the value of the bkRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBkRate() {
        return bkRate;
    }

    /**
     * Sets the value of the bkRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setBkRate(BigDecimal value) {
        this.bkRate = value;
        return this;
    }

    /**
     * Gets the value of the gnlGovntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGnlGovntRate() {
        return gnlGovntRate;
    }

    /**
     * Sets the value of the gnlGovntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setGnlGovntRate(BigDecimal value) {
        this.gnlGovntRate = value;
        return this;
    }

    /**
     * Gets the value of the hsHldRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHsHldRate() {
        return hsHldRate;
    }

    /**
     * Sets the value of the hsHldRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setHsHldRate(BigDecimal value) {
        this.hsHldRate = value;
        return this;
    }

    /**
     * Gets the value of the insrncCorptnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncCorptnRate() {
        return insrncCorptnRate;
    }

    /**
     * Sets the value of the insrncCorptnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setInsrncCorptnRate(BigDecimal value) {
        this.insrncCorptnRate = value;
        return this;
    }

    /**
     * Gets the value of the nonFinCorptnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonFinCorptnRate() {
        return nonFinCorptnRate;
    }

    /**
     * Sets the value of the nonFinCorptnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setNonFinCorptnRate(BigDecimal value) {
        this.nonFinCorptnRate = value;
        return this;
    }

    /**
     * Gets the value of the othrCllctvInvstmtUdrtkgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthrCllctvInvstmtUdrtkgRate() {
        return othrCllctvInvstmtUdrtkgRate;
    }

    /**
     * Sets the value of the othrCllctvInvstmtUdrtkgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setOthrCllctvInvstmtUdrtkgRate(BigDecimal value) {
        this.othrCllctvInvstmtUdrtkgRate = value;
        return this;
    }

    /**
     * Gets the value of the othrFIRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthrFIRate() {
        return othrFIRate;
    }

    /**
     * Sets the value of the othrFIRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setOthrFIRate(BigDecimal value) {
        this.othrFIRate = value;
        return this;
    }

    /**
     * Gets the value of the pnsnPlanOrFndRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPnsnPlanOrFndRate() {
        return pnsnPlanOrFndRate;
    }

    /**
     * Sets the value of the pnsnPlanOrFndRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setPnsnPlanOrFndRate(BigDecimal value) {
        this.pnsnPlanOrFndRate = value;
        return this;
    }

    /**
     * Gets the value of the uknwnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUknwnRate() {
        return uknwnRate;
    }

    /**
     * Sets the value of the uknwnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestorGroupBreakdownType1 setUknwnRate(BigDecimal value) {
        this.uknwnRate = value;
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
