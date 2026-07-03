
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
 * Defines commodity attributes of a derivative where the type is freight.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight1Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip"
})
public class AssetClassCommodityFreight1Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry1 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet1 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip1 cntnrShip;

    /**
     * Gets the value of the dry property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public FreightCommodityDry1 getDry() {
        return dry;
    }

    /**
     * Sets the value of the dry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public AssetClassCommodityFreight1Choice setDry(FreightCommodityDry1 value) {
        this.dry = value;
        return this;
    }

    /**
     * Gets the value of the wet property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public FreightCommodityWet1 getWet() {
        return wet;
    }

    /**
     * Sets the value of the wet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public AssetClassCommodityFreight1Choice setWet(FreightCommodityWet1 value) {
        this.wet = value;
        return this;
    }

    /**
     * Gets the value of the cntnrShip property.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public FreightCommodityContainerShip1 getCntnrShip() {
        return cntnrShip;
    }

    /**
     * Sets the value of the cntnrShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public AssetClassCommodityFreight1Choice setCntnrShip(FreightCommodityContainerShip1 value) {
        this.cntnrShip = value;
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
