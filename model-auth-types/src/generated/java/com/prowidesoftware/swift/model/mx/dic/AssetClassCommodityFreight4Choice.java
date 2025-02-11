
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
 * Defines commodity attributes of a derivative where the type is freight.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight4Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip",
    "othr"
})
public class AssetClassCommodityFreight4Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry3 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet3 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip2 cntnrShip;
    @XmlElement(name = "Othr")
    protected FreightCommodityOther2 othr;

    /**
     * Gets the value of the dry property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry3 }
     *     
     */
    public FreightCommodityDry3 getDry() {
        return dry;
    }

    /**
     * Sets the value of the dry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry3 }
     *     
     */
    public AssetClassCommodityFreight4Choice setDry(FreightCommodityDry3 value) {
        this.dry = value;
        return this;
    }

    /**
     * Gets the value of the wet property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet3 }
     *     
     */
    public FreightCommodityWet3 getWet() {
        return wet;
    }

    /**
     * Sets the value of the wet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet3 }
     *     
     */
    public AssetClassCommodityFreight4Choice setWet(FreightCommodityWet3 value) {
        this.wet = value;
        return this;
    }

    /**
     * Gets the value of the cntnrShip property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityContainerShip2 }
     *     
     */
    public FreightCommodityContainerShip2 getCntnrShip() {
        return cntnrShip;
    }

    /**
     * Sets the value of the cntnrShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityContainerShip2 }
     *     
     */
    public AssetClassCommodityFreight4Choice setCntnrShip(FreightCommodityContainerShip2 value) {
        this.cntnrShip = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityOther2 }
     *     
     */
    public FreightCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityOther2 }
     *     
     */
    public AssetClassCommodityFreight4Choice setOthr(FreightCommodityOther2 value) {
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
