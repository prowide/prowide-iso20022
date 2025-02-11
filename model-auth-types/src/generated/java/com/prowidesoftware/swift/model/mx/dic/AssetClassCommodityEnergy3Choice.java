
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
 * Defines commodity attributes of a derivative where the type is energy.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnergy3Choice", propOrder = {
    "elctrcty",
    "ntrlGas",
    "oil",
    "coal",
    "intrNrgy",
    "rnwblNrgy",
    "lghtEnd",
    "dstllts",
    "othr"
})
public class AssetClassCommodityEnergy3Choice {

    @XmlElement(name = "Elctrcty")
    protected EnergyCommodityElectricity2 elctrcty;
    @XmlElement(name = "NtrlGas")
    protected EnergyCommodityNaturalGas3 ntrlGas;
    @XmlElement(name = "Oil")
    protected EnergyCommodityOil3 oil;
    @XmlElement(name = "Coal")
    protected EnergyCommodityCoal2 coal;
    @XmlElement(name = "IntrNrgy")
    protected EnergyCommodityInterEnergy2 intrNrgy;
    @XmlElement(name = "RnwblNrgy")
    protected EnergyCommodityRenewableEnergy2 rnwblNrgy;
    @XmlElement(name = "LghtEnd")
    protected EnergyCommodityLightEnd2 lghtEnd;
    @XmlElement(name = "Dstllts")
    protected EnergyCommodityDistillates2 dstllts;
    @XmlElement(name = "Othr")
    protected EnergyCommodityOther2 othr;

    /**
     * Gets the value of the elctrcty property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityElectricity2 }
     *     
     */
    public EnergyCommodityElectricity2 getElctrcty() {
        return elctrcty;
    }

    /**
     * Sets the value of the elctrcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityElectricity2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setElctrcty(EnergyCommodityElectricity2 value) {
        this.elctrcty = value;
        return this;
    }

    /**
     * Gets the value of the ntrlGas property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityNaturalGas3 }
     *     
     */
    public EnergyCommodityNaturalGas3 getNtrlGas() {
        return ntrlGas;
    }

    /**
     * Sets the value of the ntrlGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityNaturalGas3 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setNtrlGas(EnergyCommodityNaturalGas3 value) {
        this.ntrlGas = value;
        return this;
    }

    /**
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOil3 }
     *     
     */
    public EnergyCommodityOil3 getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOil3 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setOil(EnergyCommodityOil3 value) {
        this.oil = value;
        return this;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityCoal2 }
     *     
     */
    public EnergyCommodityCoal2 getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityCoal2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setCoal(EnergyCommodityCoal2 value) {
        this.coal = value;
        return this;
    }

    /**
     * Gets the value of the intrNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityInterEnergy2 }
     *     
     */
    public EnergyCommodityInterEnergy2 getIntrNrgy() {
        return intrNrgy;
    }

    /**
     * Sets the value of the intrNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityInterEnergy2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setIntrNrgy(EnergyCommodityInterEnergy2 value) {
        this.intrNrgy = value;
        return this;
    }

    /**
     * Gets the value of the rnwblNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityRenewableEnergy2 }
     *     
     */
    public EnergyCommodityRenewableEnergy2 getRnwblNrgy() {
        return rnwblNrgy;
    }

    /**
     * Sets the value of the rnwblNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityRenewableEnergy2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setRnwblNrgy(EnergyCommodityRenewableEnergy2 value) {
        this.rnwblNrgy = value;
        return this;
    }

    /**
     * Gets the value of the lghtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityLightEnd2 }
     *     
     */
    public EnergyCommodityLightEnd2 getLghtEnd() {
        return lghtEnd;
    }

    /**
     * Sets the value of the lghtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityLightEnd2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setLghtEnd(EnergyCommodityLightEnd2 value) {
        this.lghtEnd = value;
        return this;
    }

    /**
     * Gets the value of the dstllts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityDistillates2 }
     *     
     */
    public EnergyCommodityDistillates2 getDstllts() {
        return dstllts;
    }

    /**
     * Sets the value of the dstllts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityDistillates2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setDstllts(EnergyCommodityDistillates2 value) {
        this.dstllts = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOther2 }
     *     
     */
    public EnergyCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOther2 }
     *     
     */
    public AssetClassCommodityEnergy3Choice setOthr(EnergyCommodityOther2 value) {
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
