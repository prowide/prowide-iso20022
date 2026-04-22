
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
 * Statistical data related to the price change of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsByUserDefinedTimePeriod3", propOrder = {
    "prd",
    "hghstPricVal",
    "lwstPricVal",
    "pricChng",
    "yld"
})
public class StatisticsByUserDefinedTimePeriod3 {

    @XmlElement(name = "Prd", required = true)
    protected DateOrDateTimePeriod4Choice prd;
    @XmlElement(name = "HghstPricVal")
    protected PriceValue5 hghstPricVal;
    @XmlElement(name = "LwstPricVal")
    protected PriceValue5 lwstPricVal;
    @XmlElement(name = "PricChng")
    protected PriceValueChange1 pricChng;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod4Choice }
     *     
     */
    public DateOrDateTimePeriod4Choice getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod4Choice }
     *     
     */
    public StatisticsByUserDefinedTimePeriod3 setPrd(DateOrDateTimePeriod4Choice value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the hghstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getHghstPricVal() {
        return hghstPricVal;
    }

    /**
     * Sets the value of the hghstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod3 setHghstPricVal(PriceValue5 value) {
        this.hghstPricVal = value;
        return this;
    }

    /**
     * Gets the value of the lwstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getLwstPricVal() {
        return lwstPricVal;
    }

    /**
     * Sets the value of the lwstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod3 setLwstPricVal(PriceValue5 value) {
        this.lwstPricVal = value;
        return this;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod3 setPricChng(PriceValueChange1 value) {
        this.pricChng = value;
        return this;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StatisticsByUserDefinedTimePeriod3 setYld(BigDecimal value) {
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
