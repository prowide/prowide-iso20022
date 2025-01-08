
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
@XmlType(name = "AssetClassCommodityAgricultural6Choice", propOrder = {
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
public class AssetClassCommodityAgricultural6Choice {

    @XmlElement(name = "GrnOilSeed")
    protected AgriculturalCommodityOilSeed2 grnOilSeed;
    @XmlElement(name = "Soft")
    protected AgriculturalCommoditySoft2 soft;
    @XmlElement(name = "Ptt")
    protected AgriculturalCommodityPotato2 ptt;
    @XmlElement(name = "OlvOil")
    protected AgriculturalCommodityOliveOil3 olvOil;
    @XmlElement(name = "Dairy")
    protected AgriculturalCommodityDairy2 dairy;
    @XmlElement(name = "Frstry")
    protected AgriculturalCommodityForestry2 frstry;
    @XmlElement(name = "Sfd")
    protected AgriculturalCommoditySeafood2 sfd;
    @XmlElement(name = "LiveStock")
    protected AgriculturalCommodityLiveStock2 liveStock;
    @XmlElement(name = "Grn")
    protected AgriculturalCommodityGrain3 grn;
    @XmlElement(name = "Othr")
    protected AgriculturalCommodityOther2 othr;

    /**
     * Gets the value of the grnOilSeed property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOilSeed2 }
     *     
     */
    public AgriculturalCommodityOilSeed2 getGrnOilSeed() {
        return grnOilSeed;
    }

    /**
     * Sets the value of the grnOilSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOilSeed2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setGrnOilSeed(AgriculturalCommodityOilSeed2 value) {
        this.grnOilSeed = value;
        return this;
    }

    /**
     * Gets the value of the soft property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySoft2 }
     *     
     */
    public AgriculturalCommoditySoft2 getSoft() {
        return soft;
    }

    /**
     * Sets the value of the soft property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySoft2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setSoft(AgriculturalCommoditySoft2 value) {
        this.soft = value;
        return this;
    }

    /**
     * Gets the value of the ptt property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityPotato2 }
     *     
     */
    public AgriculturalCommodityPotato2 getPtt() {
        return ptt;
    }

    /**
     * Sets the value of the ptt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityPotato2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setPtt(AgriculturalCommodityPotato2 value) {
        this.ptt = value;
        return this;
    }

    /**
     * Gets the value of the olvOil property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOliveOil3 }
     *     
     */
    public AgriculturalCommodityOliveOil3 getOlvOil() {
        return olvOil;
    }

    /**
     * Sets the value of the olvOil property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOliveOil3 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setOlvOil(AgriculturalCommodityOliveOil3 value) {
        this.olvOil = value;
        return this;
    }

    /**
     * Gets the value of the dairy property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityDairy2 }
     *     
     */
    public AgriculturalCommodityDairy2 getDairy() {
        return dairy;
    }

    /**
     * Sets the value of the dairy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityDairy2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setDairy(AgriculturalCommodityDairy2 value) {
        this.dairy = value;
        return this;
    }

    /**
     * Gets the value of the frstry property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityForestry2 }
     *     
     */
    public AgriculturalCommodityForestry2 getFrstry() {
        return frstry;
    }

    /**
     * Sets the value of the frstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityForestry2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setFrstry(AgriculturalCommodityForestry2 value) {
        this.frstry = value;
        return this;
    }

    /**
     * Gets the value of the sfd property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySeafood2 }
     *     
     */
    public AgriculturalCommoditySeafood2 getSfd() {
        return sfd;
    }

    /**
     * Sets the value of the sfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySeafood2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setSfd(AgriculturalCommoditySeafood2 value) {
        this.sfd = value;
        return this;
    }

    /**
     * Gets the value of the liveStock property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityLiveStock2 }
     *     
     */
    public AgriculturalCommodityLiveStock2 getLiveStock() {
        return liveStock;
    }

    /**
     * Sets the value of the liveStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityLiveStock2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setLiveStock(AgriculturalCommodityLiveStock2 value) {
        this.liveStock = value;
        return this;
    }

    /**
     * Gets the value of the grn property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityGrain3 }
     *     
     */
    public AgriculturalCommodityGrain3 getGrn() {
        return grn;
    }

    /**
     * Sets the value of the grn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityGrain3 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setGrn(AgriculturalCommodityGrain3 value) {
        this.grn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOther2 }
     *     
     */
    public AgriculturalCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOther2 }
     *     
     */
    public AssetClassCommodityAgricultural6Choice setOthr(AgriculturalCommodityOther2 value) {
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
