
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines commodity specific attributes of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity2Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frght",
    "indx",
    "metl",
    "extc",
    "othr"
})
public class AssetClassCommodity2Choice {

    @XmlElement(name = "Agrcltrl")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductAgriculturalType1Code agrcltrl;
    @XmlElement(name = "Nrgy")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductEnergyType1Code nrgy;
    @XmlElement(name = "Envttl")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductEnvironmentalType1Code envttl;
    @XmlElement(name = "Frght")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductFreight1Code frght;
    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected NoReasonCode indx;
    @XmlElement(name = "Metl")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductMetal1Code metl;
    @XmlElement(name = "Extc")
    @XmlSchemaType(name = "string")
    protected NoReasonCode extc;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode othr;

    /**
     * Gets the value of the agrcltrl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductAgriculturalType1Code }
     *     
     */
    public AssetClassSubProductAgriculturalType1Code getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductAgriculturalType1Code }
     *     
     */
    public AssetClassCommodity2Choice setAgrcltrl(AssetClassSubProductAgriculturalType1Code value) {
        this.agrcltrl = value;
        return this;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductEnergyType1Code }
     *     
     */
    public AssetClassSubProductEnergyType1Code getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductEnergyType1Code }
     *     
     */
    public AssetClassCommodity2Choice setNrgy(AssetClassSubProductEnergyType1Code value) {
        this.nrgy = value;
        return this;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductEnvironmentalType1Code }
     *     
     */
    public AssetClassSubProductEnvironmentalType1Code getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductEnvironmentalType1Code }
     *     
     */
    public AssetClassCommodity2Choice setEnvttl(AssetClassSubProductEnvironmentalType1Code value) {
        this.envttl = value;
        return this;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductFreight1Code }
     *     
     */
    public AssetClassSubProductFreight1Code getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductFreight1Code }
     *     
     */
    public AssetClassCommodity2Choice setFrght(AssetClassSubProductFreight1Code value) {
        this.frght = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public AssetClassCommodity2Choice setIndx(NoReasonCode value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the metl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductMetal1Code }
     *     
     */
    public AssetClassSubProductMetal1Code getMetl() {
        return metl;
    }

    /**
     * Sets the value of the metl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductMetal1Code }
     *     
     */
    public AssetClassCommodity2Choice setMetl(AssetClassSubProductMetal1Code value) {
        this.metl = value;
        return this;
    }

    /**
     * Gets the value of the extc property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getExtc() {
        return extc;
    }

    /**
     * Sets the value of the extc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public AssetClassCommodity2Choice setExtc(NoReasonCode value) {
        this.extc = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public AssetClassCommodity2Choice setOthr(NoReasonCode value) {
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
