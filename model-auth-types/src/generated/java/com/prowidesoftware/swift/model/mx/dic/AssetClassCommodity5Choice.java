
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
 * Choice to define commodity specific attributes of a derivative.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity5Choice", propOrder = {
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
public class AssetClassCommodity5Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural5Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy2Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental2Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer3Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight3Choice frght;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct1Choice indstrlPdct;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal1Choice metl;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityOtherC102Choice othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper3Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene3Choice plprpln;
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
     *     {@link AssetClassCommodityAgricultural5Choice }
     *     
     */
    public AssetClassCommodityAgricultural5Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural5Choice }
     *     
     */
    public AssetClassCommodity5Choice setAgrcltrl(AssetClassCommodityAgricultural5Choice value) {
        this.agrcltrl = value;
        return this;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy2Choice }
     *     
     */
    public AssetClassCommodityEnergy2Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy2Choice }
     *     
     */
    public AssetClassCommodity5Choice setNrgy(AssetClassCommodityEnergy2Choice value) {
        this.nrgy = value;
        return this;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental2Choice }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental2Choice }
     *     
     */
    public AssetClassCommodity5Choice setEnvttl(AssetClassCommodityEnvironmental2Choice value) {
        this.envttl = value;
        return this;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer3Choice }
     *     
     */
    public AssetClassCommodityFertilizer3Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer3Choice }
     *     
     */
    public AssetClassCommodity5Choice setFrtlzr(AssetClassCommodityFertilizer3Choice value) {
        this.frtlzr = value;
        return this;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight3Choice }
     *     
     */
    public AssetClassCommodityFreight3Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight3Choice }
     *     
     */
    public AssetClassCommodity5Choice setFrght(AssetClassCommodityFreight3Choice value) {
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
    public AssetClassCommodity5Choice setIndstrlPdct(AssetClassCommodityIndustrialProduct1Choice value) {
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
    public AssetClassCommodity5Choice setMetl(AssetClassCommodityMetal1Choice value) {
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
    public AssetClassCommodity5Choice setOthrC10(AssetClassCommodityOtherC102Choice value) {
        this.othrC10 = value;
        return this;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper3Choice }
     *     
     */
    public AssetClassCommodityPaper3Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper3Choice }
     *     
     */
    public AssetClassCommodity5Choice setPpr(AssetClassCommodityPaper3Choice value) {
        this.ppr = value;
        return this;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene3Choice }
     *     
     */
    public AssetClassCommodityPolypropylene3Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene3Choice }
     *     
     */
    public AssetClassCommodity5Choice setPlprpln(AssetClassCommodityPolypropylene3Choice value) {
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
    public AssetClassCommodity5Choice setInfltn(AssetClassCommodityInflation1 value) {
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
    public AssetClassCommodity5Choice setMultiCmmdtyExtc(AssetClassCommodityMultiCommodityExotic1 value) {
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
    public AssetClassCommodity5Choice setOffclEcnmcSttstcs(AssetClassCommodityOfficialEconomicStatistics1 value) {
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
    public AssetClassCommodity5Choice setOthr(AssetClassCommodityOther1 value) {
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
