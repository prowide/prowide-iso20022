
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
 * Defines commodity attributes of a derivative where the type is fertilizer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFertilizer4Choice", propOrder = {
    "ammn",
    "dmmnmPhspht",
    "ptsh",
    "slphr",
    "urea",
    "ureaAndAmmnmNtrt",
    "othr"
})
public class AssetClassCommodityFertilizer4Choice {

    @XmlElement(name = "Ammn")
    protected FertilizerCommodityAmmonia2 ammn;
    @XmlElement(name = "DmmnmPhspht")
    protected FertilizerCommodityDiammoniumPhosphate2 dmmnmPhspht;
    @XmlElement(name = "Ptsh")
    protected FertilizerCommodityPotash2 ptsh;
    @XmlElement(name = "Slphr")
    protected FertilizerCommoditySulphur2 slphr;
    @XmlElement(name = "Urea")
    protected FertilizerCommodityUrea2 urea;
    @XmlElement(name = "UreaAndAmmnmNtrt")
    protected FertilizerCommodityUreaAndAmmoniumNitrate2 ureaAndAmmnmNtrt;
    @XmlElement(name = "Othr")
    protected FertilizerCommodityOther2 othr;

    /**
     * Gets the value of the ammn property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityAmmonia2 }
     *     
     */
    public FertilizerCommodityAmmonia2 getAmmn() {
        return ammn;
    }

    /**
     * Sets the value of the ammn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityAmmonia2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setAmmn(FertilizerCommodityAmmonia2 value) {
        this.ammn = value;
        return this;
    }

    /**
     * Gets the value of the dmmnmPhspht property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityDiammoniumPhosphate2 }
     *     
     */
    public FertilizerCommodityDiammoniumPhosphate2 getDmmnmPhspht() {
        return dmmnmPhspht;
    }

    /**
     * Sets the value of the dmmnmPhspht property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityDiammoniumPhosphate2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setDmmnmPhspht(FertilizerCommodityDiammoniumPhosphate2 value) {
        this.dmmnmPhspht = value;
        return this;
    }

    /**
     * Gets the value of the ptsh property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityPotash2 }
     *     
     */
    public FertilizerCommodityPotash2 getPtsh() {
        return ptsh;
    }

    /**
     * Sets the value of the ptsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityPotash2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setPtsh(FertilizerCommodityPotash2 value) {
        this.ptsh = value;
        return this;
    }

    /**
     * Gets the value of the slphr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommoditySulphur2 }
     *     
     */
    public FertilizerCommoditySulphur2 getSlphr() {
        return slphr;
    }

    /**
     * Sets the value of the slphr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommoditySulphur2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setSlphr(FertilizerCommoditySulphur2 value) {
        this.slphr = value;
        return this;
    }

    /**
     * Gets the value of the urea property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUrea2 }
     *     
     */
    public FertilizerCommodityUrea2 getUrea() {
        return urea;
    }

    /**
     * Sets the value of the urea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUrea2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setUrea(FertilizerCommodityUrea2 value) {
        this.urea = value;
        return this;
    }

    /**
     * Gets the value of the ureaAndAmmnmNtrt property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate2 }
     *     
     */
    public FertilizerCommodityUreaAndAmmoniumNitrate2 getUreaAndAmmnmNtrt() {
        return ureaAndAmmnmNtrt;
    }

    /**
     * Sets the value of the ureaAndAmmnmNtrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setUreaAndAmmnmNtrt(FertilizerCommodityUreaAndAmmoniumNitrate2 value) {
        this.ureaAndAmmnmNtrt = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityOther2 }
     *     
     */
    public FertilizerCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityOther2 }
     *     
     */
    public AssetClassCommodityFertilizer4Choice setOthr(FertilizerCommodityOther2 value) {
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
