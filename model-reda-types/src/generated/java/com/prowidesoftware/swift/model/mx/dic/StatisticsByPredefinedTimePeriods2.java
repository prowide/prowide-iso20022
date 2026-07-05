
package com.prowidesoftware.swift.model.mx.dic;

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
@XmlType(name = "StatisticsByPredefinedTimePeriods2", propOrder = {
    "hghstPricVal12Mnths",
    "lwstPricVal12Mnths",
    "oneYrPricChng",
    "threeYrPricChng",
    "fiveYrPricChng"
})
public class StatisticsByPredefinedTimePeriods2 {

    @XmlElement(name = "HghstPricVal12Mnths")
    protected PriceValue5 hghstPricVal12Mnths;
    @XmlElement(name = "LwstPricVal12Mnths")
    protected PriceValue5 lwstPricVal12Mnths;
    @XmlElement(name = "OneYrPricChng")
    protected PriceValueChange1 oneYrPricChng;
    @XmlElement(name = "ThreeYrPricChng")
    protected PriceValueChange1 threeYrPricChng;
    @XmlElement(name = "FiveYrPricChng")
    protected PriceValueChange1 fiveYrPricChng;

    /**
     * Gets the value of the hghstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getHghstPricVal12Mnths() {
        return hghstPricVal12Mnths;
    }

    /**
     * Sets the value of the hghstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 setHghstPricVal12Mnths(PriceValue5 value) {
        this.hghstPricVal12Mnths = value;
        return this;
    }

    /**
     * Gets the value of the lwstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue5 }
     *     
     */
    public PriceValue5 getLwstPricVal12Mnths() {
        return lwstPricVal12Mnths;
    }

    /**
     * Sets the value of the lwstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue5 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 setLwstPricVal12Mnths(PriceValue5 value) {
        this.lwstPricVal12Mnths = value;
        return this;
    }

    /**
     * Gets the value of the oneYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getOneYrPricChng() {
        return oneYrPricChng;
    }

    /**
     * Sets the value of the oneYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 setOneYrPricChng(PriceValueChange1 value) {
        this.oneYrPricChng = value;
        return this;
    }

    /**
     * Gets the value of the threeYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getThreeYrPricChng() {
        return threeYrPricChng;
    }

    /**
     * Sets the value of the threeYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 setThreeYrPricChng(PriceValueChange1 value) {
        this.threeYrPricChng = value;
        return this;
    }

    /**
     * Gets the value of the fiveYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getFiveYrPricChng() {
        return fiveYrPricChng;
    }

    /**
     * Sets the value of the fiveYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 setFiveYrPricChng(PriceValueChange1 value) {
        this.fiveYrPricChng = value;
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
