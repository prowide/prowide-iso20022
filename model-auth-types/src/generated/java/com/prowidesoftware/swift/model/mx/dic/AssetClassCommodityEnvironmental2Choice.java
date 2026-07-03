
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
 * Defines commodity attributes of a derivative where the type is environmental.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnvironmental2Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd",
    "othr"
})
public class AssetClassCommodityEnvironmental2Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission2 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather1 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated1 crbnRltd;
    @XmlElement(name = "Othr")
    protected EnvironmentCommodityOther1 othr;

    /**
     * Gets the value of the emssns property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission2 }
     *     
     */
    public EnvironmentalCommodityEmission2 getEmssns() {
        return emssns;
    }

    /**
     * Sets the value of the emssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission2 }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice setEmssns(EnvironmentalCommodityEmission2 value) {
        this.emssns = value;
        return this;
    }

    /**
     * Gets the value of the wthr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public EnvironmentalCommodityWeather1 getWthr() {
        return wthr;
    }

    /**
     * Sets the value of the wthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice setWthr(EnvironmentalCommodityWeather1 value) {
        this.wthr = value;
        return this;
    }

    /**
     * Gets the value of the crbnRltd property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public EnvironmentalCommodityCarbonRelated1 getCrbnRltd() {
        return crbnRltd;
    }

    /**
     * Sets the value of the crbnRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice setCrbnRltd(EnvironmentalCommodityCarbonRelated1 value) {
        this.crbnRltd = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentCommodityOther1 }
     *     
     */
    public EnvironmentCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentCommodityOther1 }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice setOthr(EnvironmentCommodityOther1 value) {
        this.othr = value;
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
