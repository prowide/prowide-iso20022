
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
 * Statistical data related to the price change of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsByUserDefinedTimePeriod1", propOrder = {
    "prd",
    "hghstPricVal",
    "lwstPricVal",
    "pricChng",
    "yld"
})
public class StatisticsByUserDefinedTimePeriod1 {

    @XmlElement(name = "Prd", required = true)
    protected DateTimePeriodDetails prd;
    @XmlElement(name = "HghstPricVal")
    protected PriceValue1 hghstPricVal;
    @XmlElement(name = "LwstPricVal")
    protected PriceValue1 lwstPricVal;
    @XmlElement(name = "PricChng")
    protected PriceValue2 pricChng;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public DateTimePeriodDetails getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails }
     *     
     */
    public StatisticsByUserDefinedTimePeriod1 setPrd(DateTimePeriodDetails value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the hghstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getHghstPricVal() {
        return hghstPricVal;
    }

    /**
     * Sets the value of the hghstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod1 setHghstPricVal(PriceValue1 value) {
        this.hghstPricVal = value;
        return this;
    }

    /**
     * Gets the value of the lwstPricVal property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getLwstPricVal() {
        return lwstPricVal;
    }

    /**
     * Sets the value of the lwstPricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod1 setLwstPricVal(PriceValue1 value) {
        this.lwstPricVal = value;
        return this;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue2 }
     *     
     */
    public PriceValue2 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue2 }
     *     
     */
    public StatisticsByUserDefinedTimePeriod1 setPricChng(PriceValue2 value) {
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
    public StatisticsByUserDefinedTimePeriod1 setYld(BigDecimal value) {
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
