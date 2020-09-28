
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
 * Defines commodity attributes of a derivative where the type is energy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnergy1Choice", propOrder = {
    "elctrcty",
    "ntrlGas",
    "oil",
    "coal",
    "intrNrgy",
    "rnwblNrgy",
    "lghtEnd",
    "dstllts"
})
public class AssetClassCommodityEnergy1Choice {

    @XmlElement(name = "Elctrcty")
    protected EnergyCommodityElectricity1 elctrcty;
    @XmlElement(name = "NtrlGas")
    protected EnergyCommodityNaturalGas1 ntrlGas;
    @XmlElement(name = "Oil")
    protected EnergyCommodityOil1 oil;
    @XmlElement(name = "Coal")
    protected EnergyCommodityCoal1 coal;
    @XmlElement(name = "IntrNrgy")
    protected EnergyCommodityInterEnergy1 intrNrgy;
    @XmlElement(name = "RnwblNrgy")
    protected EnergyCommodityRenewableEnergy1 rnwblNrgy;
    @XmlElement(name = "LghtEnd")
    protected EnergyCommodityLightEnd1 lghtEnd;
    @XmlElement(name = "Dstllts")
    protected EnergyCommodityDistillates1 dstllts;

    /**
     * Gets the value of the elctrcty property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public EnergyCommodityElectricity1 getElctrcty() {
        return elctrcty;
    }

    /**
     * Sets the value of the elctrcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setElctrcty(EnergyCommodityElectricity1 value) {
        this.elctrcty = value;
        return this;
    }

    /**
     * Gets the value of the ntrlGas property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public EnergyCommodityNaturalGas1 getNtrlGas() {
        return ntrlGas;
    }

    /**
     * Sets the value of the ntrlGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setNtrlGas(EnergyCommodityNaturalGas1 value) {
        this.ntrlGas = value;
        return this;
    }

    /**
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public EnergyCommodityOil1 getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setOil(EnergyCommodityOil1 value) {
        this.oil = value;
        return this;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public EnergyCommodityCoal1 getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setCoal(EnergyCommodityCoal1 value) {
        this.coal = value;
        return this;
    }

    /**
     * Gets the value of the intrNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public EnergyCommodityInterEnergy1 getIntrNrgy() {
        return intrNrgy;
    }

    /**
     * Sets the value of the intrNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setIntrNrgy(EnergyCommodityInterEnergy1 value) {
        this.intrNrgy = value;
        return this;
    }

    /**
     * Gets the value of the rnwblNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public EnergyCommodityRenewableEnergy1 getRnwblNrgy() {
        return rnwblNrgy;
    }

    /**
     * Sets the value of the rnwblNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setRnwblNrgy(EnergyCommodityRenewableEnergy1 value) {
        this.rnwblNrgy = value;
        return this;
    }

    /**
     * Gets the value of the lghtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public EnergyCommodityLightEnd1 getLghtEnd() {
        return lghtEnd;
    }

    /**
     * Sets the value of the lghtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setLghtEnd(EnergyCommodityLightEnd1 value) {
        this.lghtEnd = value;
        return this;
    }

    /**
     * Gets the value of the dstllts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public EnergyCommodityDistillates1 getDstllts() {
        return dstllts;
    }

    /**
     * Sets the value of the dstllts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public AssetClassCommodityEnergy1Choice setDstllts(EnergyCommodityDistillates1 value) {
        this.dstllts = value;
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
