
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AssetClassCommodityEnvironmental3Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd",
    "othr"
})
public class AssetClassCommodityEnvironmental3Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission3 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather2 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated2 crbnRltd;
    @XmlElement(name = "Othr")
    protected EnvironmentCommodityOther2 othr;

    /**
     * Gets the value of the emssns property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission3 }
     *     
     */
    public EnvironmentalCommodityEmission3 getEmssns() {
        return emssns;
    }

    /**
     * Sets the value of the emssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission3 }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice setEmssns(EnvironmentalCommodityEmission3 value) {
        this.emssns = value;
        return this;
    }

    /**
     * Gets the value of the wthr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityWeather2 }
     *     
     */
    public EnvironmentalCommodityWeather2 getWthr() {
        return wthr;
    }

    /**
     * Sets the value of the wthr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityWeather2 }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice setWthr(EnvironmentalCommodityWeather2 value) {
        this.wthr = value;
        return this;
    }

    /**
     * Gets the value of the crbnRltd property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityCarbonRelated2 }
     *     
     */
    public EnvironmentalCommodityCarbonRelated2 getCrbnRltd() {
        return crbnRltd;
    }

    /**
     * Sets the value of the crbnRltd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityCarbonRelated2 }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice setCrbnRltd(EnvironmentalCommodityCarbonRelated2 value) {
        this.crbnRltd = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentCommodityOther2 }
     *     
     */
    public EnvironmentCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentCommodityOther2 }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice setOthr(EnvironmentCommodityOther2 value) {
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
