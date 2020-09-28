
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
@XmlType(name = "AssetClassCommodityEnvironmental1Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd"
})
public class AssetClassCommodityEnvironmental1Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission1 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather1 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated1 crbnRltd;

    /**
     * Gets the value of the emssns property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public EnvironmentalCommodityEmission1 getEmssns() {
        return emssns;
    }

    /**
     * Sets the value of the emssns property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public AssetClassCommodityEnvironmental1Choice setEmssns(EnvironmentalCommodityEmission1 value) {
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
    public AssetClassCommodityEnvironmental1Choice setWthr(EnvironmentalCommodityWeather1 value) {
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
    public AssetClassCommodityEnvironmental1Choice setCrbnRltd(EnvironmentalCommodityCarbonRelated1 value) {
        this.crbnRltd = value;
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
