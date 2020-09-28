
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
 * Specifies details of the valuation calculated for the money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundValuation1", propOrder = {
    "netAsstValPerUnit",
    "wghtdAvrgMtrty",
    "wghtdAvrgLife"
})
public class FundValuation1 {

    @XmlElement(name = "NetAsstValPerUnit", required = true)
    protected CurrencyExchange14 netAsstValPerUnit;
    @XmlElement(name = "WghtdAvrgMtrty", required = true)
    protected BigDecimal wghtdAvrgMtrty;
    @XmlElement(name = "WghtdAvrgLife", required = true)
    protected BigDecimal wghtdAvrgLife;

    /**
     * Gets the value of the netAsstValPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getNetAsstValPerUnit() {
        return netAsstValPerUnit;
    }

    /**
     * Sets the value of the netAsstValPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public FundValuation1 setNetAsstValPerUnit(CurrencyExchange14 value) {
        this.netAsstValPerUnit = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgMtrty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgMtrty() {
        return wghtdAvrgMtrty;
    }

    /**
     * Sets the value of the wghtdAvrgMtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FundValuation1 setWghtdAvrgMtrty(BigDecimal value) {
        this.wghtdAvrgMtrty = value;
        return this;
    }

    /**
     * Gets the value of the wghtdAvrgLife property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgLife() {
        return wghtdAvrgLife;
    }

    /**
     * Sets the value of the wghtdAvrgLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FundValuation1 setWghtdAvrgLife(BigDecimal value) {
        this.wghtdAvrgLife = value;
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
