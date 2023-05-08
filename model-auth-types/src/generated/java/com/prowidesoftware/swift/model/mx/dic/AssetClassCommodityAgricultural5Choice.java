
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
 * Defines commodity attributes of a derivative where the type is agricultural.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityAgricultural5Choice", propOrder = {
    "grnOilSeed",
    "soft",
    "ptt",
    "olvOil",
    "dairy",
    "frstry",
    "sfd",
    "liveStock",
    "grn",
    "othr"
})
public class AssetClassCommodityAgricultural5Choice {

    @XmlElement(name = "GrnOilSeed")
    protected AgriculturalCommodityOilSeed1 grnOilSeed;
    @XmlElement(name = "Soft")
    protected AgriculturalCommoditySoft1 soft;
    @XmlElement(name = "Ptt")
    protected AgriculturalCommodityPotato1 ptt;
    @XmlElement(name = "OlvOil")
    protected AgriculturalCommodityOliveOil2 olvOil;
    @XmlElement(name = "Dairy")
    protected AgriculturalCommodityDairy1 dairy;
    @XmlElement(name = "Frstry")
    protected AgriculturalCommodityForestry1 frstry;
    @XmlElement(name = "Sfd")
    protected AgriculturalCommoditySeafood1 sfd;
    @XmlElement(name = "LiveStock")
    protected AgriculturalCommodityLiveStock1 liveStock;
    @XmlElement(name = "Grn")
    protected AgriculturalCommodityGrain2 grn;
    @XmlElement(name = "Othr")
    protected AgriculturalCommodityOther1 othr;

    /**
     * Gets the value of the grnOilSeed property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public AgriculturalCommodityOilSeed1 getGrnOilSeed() {
        return grnOilSeed;
    }

    /**
     * Sets the value of the grnOilSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setGrnOilSeed(AgriculturalCommodityOilSeed1 value) {
        this.grnOilSeed = value;
        return this;
    }

    /**
     * Gets the value of the soft property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public AgriculturalCommoditySoft1 getSoft() {
        return soft;
    }

    /**
     * Sets the value of the soft property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setSoft(AgriculturalCommoditySoft1 value) {
        this.soft = value;
        return this;
    }

    /**
     * Gets the value of the ptt property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public AgriculturalCommodityPotato1 getPtt() {
        return ptt;
    }

    /**
     * Sets the value of the ptt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setPtt(AgriculturalCommodityPotato1 value) {
        this.ptt = value;
        return this;
    }

    /**
     * Gets the value of the olvOil property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOliveOil2 }
     *     
     */
    public AgriculturalCommodityOliveOil2 getOlvOil() {
        return olvOil;
    }

    /**
     * Sets the value of the olvOil property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOliveOil2 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setOlvOil(AgriculturalCommodityOliveOil2 value) {
        this.olvOil = value;
        return this;
    }

    /**
     * Gets the value of the dairy property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public AgriculturalCommodityDairy1 getDairy() {
        return dairy;
    }

    /**
     * Sets the value of the dairy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setDairy(AgriculturalCommodityDairy1 value) {
        this.dairy = value;
        return this;
    }

    /**
     * Gets the value of the frstry property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public AgriculturalCommodityForestry1 getFrstry() {
        return frstry;
    }

    /**
     * Sets the value of the frstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setFrstry(AgriculturalCommodityForestry1 value) {
        this.frstry = value;
        return this;
    }

    /**
     * Gets the value of the sfd property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public AgriculturalCommoditySeafood1 getSfd() {
        return sfd;
    }

    /**
     * Sets the value of the sfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setSfd(AgriculturalCommoditySeafood1 value) {
        this.sfd = value;
        return this;
    }

    /**
     * Gets the value of the liveStock property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public AgriculturalCommodityLiveStock1 getLiveStock() {
        return liveStock;
    }

    /**
     * Sets the value of the liveStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setLiveStock(AgriculturalCommodityLiveStock1 value) {
        this.liveStock = value;
        return this;
    }

    /**
     * Gets the value of the grn property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityGrain2 }
     *     
     */
    public AgriculturalCommodityGrain2 getGrn() {
        return grn;
    }

    /**
     * Sets the value of the grn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityGrain2 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setGrn(AgriculturalCommodityGrain2 value) {
        this.grn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOther1 }
     *     
     */
    public AgriculturalCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOther1 }
     *     
     */
    public AssetClassCommodityAgricultural5Choice setOthr(AgriculturalCommodityOther1 value) {
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
