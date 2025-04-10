
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Possible valuation factors.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationFactorBreakdown1", propOrder = {
    "valtnFctr",
    "infltnFctr",
    "hrcut",
    "poolFctr"
})
public class ValuationFactorBreakdown1 {

    @XmlElement(name = "ValtnFctr")
    protected BigDecimal valtnFctr;
    @XmlElement(name = "InfltnFctr")
    protected BigDecimal infltnFctr;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "PoolFctr")
    protected BigDecimal poolFctr;

    /**
     * Gets the value of the valtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValtnFctr() {
        return valtnFctr;
    }

    /**
     * Sets the value of the valtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationFactorBreakdown1 setValtnFctr(BigDecimal value) {
        this.valtnFctr = value;
        return this;
    }

    /**
     * Gets the value of the infltnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInfltnFctr() {
        return infltnFctr;
    }

    /**
     * Sets the value of the infltnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationFactorBreakdown1 setInfltnFctr(BigDecimal value) {
        this.infltnFctr = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationFactorBreakdown1 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the poolFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPoolFctr() {
        return poolFctr;
    }

    /**
     * Sets the value of the poolFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationFactorBreakdown1 setPoolFctr(BigDecimal value) {
        this.poolFctr = value;
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
