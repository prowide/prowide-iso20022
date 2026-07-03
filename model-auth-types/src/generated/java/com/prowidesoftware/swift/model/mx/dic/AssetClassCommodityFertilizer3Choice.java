
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
 * Defines commodity attributes of a derivative where the type is fertilizer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFertilizer3Choice", propOrder = {
    "ammn",
    "dmmnmPhspht",
    "ptsh",
    "slphr",
    "urea",
    "ureaAndAmmnmNtrt",
    "othr"
})
public class AssetClassCommodityFertilizer3Choice {

    @XmlElement(name = "Ammn")
    protected FertilizerCommodityAmmonia1 ammn;
    @XmlElement(name = "DmmnmPhspht")
    protected FertilizerCommodityDiammoniumPhosphate1 dmmnmPhspht;
    @XmlElement(name = "Ptsh")
    protected FertilizerCommodityPotash1 ptsh;
    @XmlElement(name = "Slphr")
    protected FertilizerCommoditySulphur1 slphr;
    @XmlElement(name = "Urea")
    protected FertilizerCommodityUrea1 urea;
    @XmlElement(name = "UreaAndAmmnmNtrt")
    protected FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmnmNtrt;
    @XmlElement(name = "Othr")
    protected FertilizerCommodityOther1 othr;

    /**
     * Gets the value of the ammn property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public FertilizerCommodityAmmonia1 getAmmn() {
        return ammn;
    }

    /**
     * Sets the value of the ammn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setAmmn(FertilizerCommodityAmmonia1 value) {
        this.ammn = value;
        return this;
    }

    /**
     * Gets the value of the dmmnmPhspht property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public FertilizerCommodityDiammoniumPhosphate1 getDmmnmPhspht() {
        return dmmnmPhspht;
    }

    /**
     * Sets the value of the dmmnmPhspht property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setDmmnmPhspht(FertilizerCommodityDiammoniumPhosphate1 value) {
        this.dmmnmPhspht = value;
        return this;
    }

    /**
     * Gets the value of the ptsh property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public FertilizerCommodityPotash1 getPtsh() {
        return ptsh;
    }

    /**
     * Sets the value of the ptsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setPtsh(FertilizerCommodityPotash1 value) {
        this.ptsh = value;
        return this;
    }

    /**
     * Gets the value of the slphr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public FertilizerCommoditySulphur1 getSlphr() {
        return slphr;
    }

    /**
     * Sets the value of the slphr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setSlphr(FertilizerCommoditySulphur1 value) {
        this.slphr = value;
        return this;
    }

    /**
     * Gets the value of the urea property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public FertilizerCommodityUrea1 getUrea() {
        return urea;
    }

    /**
     * Sets the value of the urea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setUrea(FertilizerCommodityUrea1 value) {
        this.urea = value;
        return this;
    }

    /**
     * Gets the value of the ureaAndAmmnmNtrt property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public FertilizerCommodityUreaAndAmmoniumNitrate1 getUreaAndAmmnmNtrt() {
        return ureaAndAmmnmNtrt;
    }

    /**
     * Sets the value of the ureaAndAmmnmNtrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setUreaAndAmmnmNtrt(FertilizerCommodityUreaAndAmmoniumNitrate1 value) {
        this.ureaAndAmmnmNtrt = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityOther1 }
     *     
     */
    public FertilizerCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityOther1 }
     *     
     */
    public AssetClassCommodityFertilizer3Choice setOthr(FertilizerCommodityOther1 value) {
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
