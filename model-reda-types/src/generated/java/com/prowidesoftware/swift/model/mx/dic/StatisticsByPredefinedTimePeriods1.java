
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
@XmlType(name = "StatisticsByPredefinedTimePeriods1", propOrder = {
    "hghstPricVal12Mnths",
    "lwstPricVal12Mnths",
    "oneYrPricChng",
    "threeYrPricChng",
    "fiveYrPricChng"
})
public class StatisticsByPredefinedTimePeriods1 {

    @XmlElement(name = "HghstPricVal12Mnths")
    protected PriceValue1 hghstPricVal12Mnths;
    @XmlElement(name = "LwstPricVal12Mnths")
    protected PriceValue1 lwstPricVal12Mnths;
    @XmlElement(name = "OneYrPricChng")
    protected PriceValue2 oneYrPricChng;
    @XmlElement(name = "ThreeYrPricChng")
    protected PriceValue2 threeYrPricChng;
    @XmlElement(name = "FiveYrPricChng")
    protected PriceValue2 fiveYrPricChng;

    /**
     * Gets the value of the hghstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getHghstPricVal12Mnths() {
        return hghstPricVal12Mnths;
    }

    /**
     * Sets the value of the hghstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public StatisticsByPredefinedTimePeriods1 setHghstPricVal12Mnths(PriceValue1 value) {
        this.hghstPricVal12Mnths = value;
        return this;
    }

    /**
     * Gets the value of the lwstPricVal12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue1 }
     *     
     */
    public PriceValue1 getLwstPricVal12Mnths() {
        return lwstPricVal12Mnths;
    }

    /**
     * Sets the value of the lwstPricVal12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue1 }
     *     
     */
    public StatisticsByPredefinedTimePeriods1 setLwstPricVal12Mnths(PriceValue1 value) {
        this.lwstPricVal12Mnths = value;
        return this;
    }

    /**
     * Gets the value of the oneYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue2 }
     *     
     */
    public PriceValue2 getOneYrPricChng() {
        return oneYrPricChng;
    }

    /**
     * Sets the value of the oneYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue2 }
     *     
     */
    public StatisticsByPredefinedTimePeriods1 setOneYrPricChng(PriceValue2 value) {
        this.oneYrPricChng = value;
        return this;
    }

    /**
     * Gets the value of the threeYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue2 }
     *     
     */
    public PriceValue2 getThreeYrPricChng() {
        return threeYrPricChng;
    }

    /**
     * Sets the value of the threeYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue2 }
     *     
     */
    public StatisticsByPredefinedTimePeriods1 setThreeYrPricChng(PriceValue2 value) {
        this.threeYrPricChng = value;
        return this;
    }

    /**
     * Gets the value of the fiveYrPricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue2 }
     *     
     */
    public PriceValue2 getFiveYrPricChng() {
        return fiveYrPricChng;
    }

    /**
     * Sets the value of the fiveYrPricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue2 }
     *     
     */
    public StatisticsByPredefinedTimePeriods1 setFiveYrPricChng(PriceValue2 value) {
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
