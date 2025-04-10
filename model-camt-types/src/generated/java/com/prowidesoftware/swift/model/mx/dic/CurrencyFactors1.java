
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
 * Currency specific Factors.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyFactors1", propOrder = {
    "ccy",
    "shrtPosLmt",
    "minPayInAmt",
    "voltlyMrgn",
    "rate"
})
public class CurrencyFactors1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "ShrtPosLmt", required = true)
    protected BigDecimal shrtPosLmt;
    @XmlElement(name = "MinPayInAmt", required = true)
    protected BigDecimal minPayInAmt;
    @XmlElement(name = "VoltlyMrgn", required = true)
    protected BigDecimal voltlyMrgn;
    @XmlElement(name = "Rate")
    protected AgreedRate2 rate;

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
    public CurrencyFactors1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the shrtPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShrtPosLmt() {
        return shrtPosLmt;
    }

    /**
     * Sets the value of the shrtPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyFactors1 setShrtPosLmt(BigDecimal value) {
        this.shrtPosLmt = value;
        return this;
    }

    /**
     * Gets the value of the minPayInAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPayInAmt() {
        return minPayInAmt;
    }

    /**
     * Sets the value of the minPayInAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyFactors1 setMinPayInAmt(BigDecimal value) {
        this.minPayInAmt = value;
        return this;
    }

    /**
     * Gets the value of the voltlyMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltlyMrgn() {
        return voltlyMrgn;
    }

    /**
     * Sets the value of the voltlyMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CurrencyFactors1 setVoltlyMrgn(BigDecimal value) {
        this.voltlyMrgn = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate2 }
     *     
     */
    public AgreedRate2 getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate2 }
     *     
     */
    public CurrencyFactors1 setRate(AgreedRate2 value) {
        this.rate = value;
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
