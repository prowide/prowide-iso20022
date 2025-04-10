
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
 * Cash premium made available if the securities holder consents or participates to an event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentivePremium2", propOrder = {
    "desc",
    "amt",
    "perScty",
    "perVote",
    "perAttndee",
    "pmtDt"
})
public class IncentivePremium2 {

    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected PriceRateOrAmountChoice amt;
    @XmlElement(name = "PerScty")
    protected BigDecimal perScty;
    @XmlElement(name = "PerVote")
    protected BigDecimal perVote;
    @XmlElement(name = "PerAttndee")
    protected Boolean perAttndee;
    @XmlElement(name = "PmtDt")
    protected DateFormat3Choice pmtDt;

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IncentivePremium2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public PriceRateOrAmountChoice getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmountChoice }
     *     
     */
    public IncentivePremium2 setAmt(PriceRateOrAmountChoice value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the perScty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerScty() {
        return perScty;
    }

    /**
     * Sets the value of the perScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremium2 setPerScty(BigDecimal value) {
        this.perScty = value;
        return this;
    }

    /**
     * Gets the value of the perVote property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerVote() {
        return perVote;
    }

    /**
     * Sets the value of the perVote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public IncentivePremium2 setPerVote(BigDecimal value) {
        this.perVote = value;
        return this;
    }

    /**
     * Gets the value of the perAttndee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerAttndee() {
        return perAttndee;
    }

    /**
     * Sets the value of the perAttndee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public IncentivePremium2 setPerAttndee(Boolean value) {
        this.perAttndee = value;
        return this;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat3Choice }
     *     
     */
    public DateFormat3Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat3Choice }
     *     
     */
    public IncentivePremium2 setPmtDt(DateFormat3Choice value) {
        this.pmtDt = value;
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
