
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
 * Choice to define commodity specific attributes of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity3Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frtlzr",
    "frght",
    "indstrlPdct",
    "metl",
    "othrC10",
    "ppr",
    "plprpln",
    "infltn",
    "multiCmmdtyExtc",
    "offclEcnmcSttstcs",
    "othr"
})
public class AssetClassCommodity3Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural1Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy1Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental1Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer1Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight1Choice frght;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct1Choice indstrlPdct;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal1Choice metl;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityOtherC102Choice othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper1Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene1Choice plprpln;
    @XmlElement(name = "Infltn")
    protected AssetClassCommodityInflation1 infltn;
    @XmlElement(name = "MultiCmmdtyExtc")
    protected AssetClassCommodityMultiCommodityExotic1 multiCmmdtyExtc;
    @XmlElement(name = "OffclEcnmcSttstcs")
    protected AssetClassCommodityOfficialEconomicStatistics1 offclEcnmcSttstcs;
    @XmlElement(name = "Othr")
    protected AssetClassCommodityOther1 othr;

    /**
     * Gets the value of the agrcltrl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public AssetClassCommodityAgricultural1Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public AssetClassCommodity3Choice setAgrcltrl(AssetClassCommodityAgricultural1Choice value) {
        this.agrcltrl = value;
        return this;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public AssetClassCommodityEnergy1Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public AssetClassCommodity3Choice setNrgy(AssetClassCommodityEnergy1Choice value) {
        this.nrgy = value;
        return this;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public AssetClassCommodityEnvironmental1Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public AssetClassCommodity3Choice setEnvttl(AssetClassCommodityEnvironmental1Choice value) {
        this.envttl = value;
        return this;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public AssetClassCommodityFertilizer1Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public AssetClassCommodity3Choice setFrtlzr(AssetClassCommodityFertilizer1Choice value) {
        this.frtlzr = value;
        return this;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public AssetClassCommodityFreight1Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public AssetClassCommodity3Choice setFrght(AssetClassCommodityFreight1Choice value) {
        this.frght = value;
        return this;
    }

    /**
     * Gets the value of the indstrlPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public AssetClassCommodityIndustrialProduct1Choice getIndstrlPdct() {
        return indstrlPdct;
    }

    /**
     * Sets the value of the indstrlPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public AssetClassCommodity3Choice setIndstrlPdct(AssetClassCommodityIndustrialProduct1Choice value) {
        this.indstrlPdct = value;
        return this;
    }

    /**
     * Gets the value of the metl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public AssetClassCommodityMetal1Choice getMetl() {
        return metl;
    }

    /**
     * Sets the value of the metl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public AssetClassCommodity3Choice setMetl(AssetClassCommodityMetal1Choice value) {
        this.metl = value;
        return this;
    }

    /**
     * Gets the value of the othrC10 property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public AssetClassCommodityOtherC102Choice getOthrC10() {
        return othrC10;
    }

    /**
     * Sets the value of the othrC10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public AssetClassCommodity3Choice setOthrC10(AssetClassCommodityOtherC102Choice value) {
        this.othrC10 = value;
        return this;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public AssetClassCommodityPaper1Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public AssetClassCommodity3Choice setPpr(AssetClassCommodityPaper1Choice value) {
        this.ppr = value;
        return this;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public AssetClassCommodityPolypropylene1Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public AssetClassCommodity3Choice setPlprpln(AssetClassCommodityPolypropylene1Choice value) {
        this.plprpln = value;
        return this;
    }

    /**
     * Gets the value of the infltn property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public AssetClassCommodityInflation1 getInfltn() {
        return infltn;
    }

    /**
     * Sets the value of the infltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public AssetClassCommodity3Choice setInfltn(AssetClassCommodityInflation1 value) {
        this.infltn = value;
        return this;
    }

    /**
     * Gets the value of the multiCmmdtyExtc property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public AssetClassCommodityMultiCommodityExotic1 getMultiCmmdtyExtc() {
        return multiCmmdtyExtc;
    }

    /**
     * Sets the value of the multiCmmdtyExtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public AssetClassCommodity3Choice setMultiCmmdtyExtc(AssetClassCommodityMultiCommodityExotic1 value) {
        this.multiCmmdtyExtc = value;
        return this;
    }

    /**
     * Gets the value of the offclEcnmcSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public AssetClassCommodityOfficialEconomicStatistics1 getOffclEcnmcSttstcs() {
        return offclEcnmcSttstcs;
    }

    /**
     * Sets the value of the offclEcnmcSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public AssetClassCommodity3Choice setOffclEcnmcSttstcs(AssetClassCommodityOfficialEconomicStatistics1 value) {
        this.offclEcnmcSttstcs = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public AssetClassCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public AssetClassCommodity3Choice setOthr(AssetClassCommodityOther1 value) {
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
