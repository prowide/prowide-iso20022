
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
@XmlType(name = "AssetClassCommodity7Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frtlzr",
    "frght",
    "indx",
    "indstrlPdct",
    "infltn",
    "metl",
    "multiCmmdtyExtc",
    "offclEcnmcSttstcs",
    "othr",
    "othrC10",
    "ppr",
    "plprpln"
})
public class AssetClassCommodity7Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural6Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy3Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental3Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer4Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight4Choice frght;
    @XmlElement(name = "Indx")
    protected AssetClassCommodityIndex1 indx;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct2Choice indstrlPdct;
    @XmlElement(name = "Infltn")
    protected AssetClassCommodityInflation1 infltn;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal2Choice metl;
    @XmlElement(name = "MultiCmmdtyExtc")
    protected AssetClassCommodityMultiCommodityExotic1 multiCmmdtyExtc;
    @XmlElement(name = "OffclEcnmcSttstcs")
    protected AssetClassCommodityOfficialEconomicStatistics1 offclEcnmcSttstcs;
    @XmlElement(name = "Othr")
    protected AssetClassCommodityOther1 othr;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityC10Other1 othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper5Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene4Choice plprpln;

    /**
     * Gets the value of the agrcltrl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityAgricultural6Choice }
     *     
     */
    public AssetClassCommodityAgricultural6Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural6Choice }
     *     
     */
    public AssetClassCommodity7Choice setAgrcltrl(AssetClassCommodityAgricultural6Choice value) {
        this.agrcltrl = value;
        return this;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy3Choice }
     *     
     */
    public AssetClassCommodityEnergy3Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy3Choice }
     *     
     */
    public AssetClassCommodity7Choice setNrgy(AssetClassCommodityEnergy3Choice value) {
        this.nrgy = value;
        return this;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental3Choice }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental3Choice }
     *     
     */
    public AssetClassCommodity7Choice setEnvttl(AssetClassCommodityEnvironmental3Choice value) {
        this.envttl = value;
        return this;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer4Choice }
     *     
     */
    public AssetClassCommodityFertilizer4Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer4Choice }
     *     
     */
    public AssetClassCommodity7Choice setFrtlzr(AssetClassCommodityFertilizer4Choice value) {
        this.frtlzr = value;
        return this;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight4Choice }
     *     
     */
    public AssetClassCommodityFreight4Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight4Choice }
     *     
     */
    public AssetClassCommodity7Choice setFrght(AssetClassCommodityFreight4Choice value) {
        this.frght = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndex1 }
     *     
     */
    public AssetClassCommodityIndex1 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndex1 }
     *     
     */
    public AssetClassCommodity7Choice setIndx(AssetClassCommodityIndex1 value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the indstrlPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndustrialProduct2Choice }
     *     
     */
    public AssetClassCommodityIndustrialProduct2Choice getIndstrlPdct() {
        return indstrlPdct;
    }

    /**
     * Sets the value of the indstrlPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndustrialProduct2Choice }
     *     
     */
    public AssetClassCommodity7Choice setIndstrlPdct(AssetClassCommodityIndustrialProduct2Choice value) {
        this.indstrlPdct = value;
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
    public AssetClassCommodity7Choice setInfltn(AssetClassCommodityInflation1 value) {
        this.infltn = value;
        return this;
    }

    /**
     * Gets the value of the metl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMetal2Choice }
     *     
     */
    public AssetClassCommodityMetal2Choice getMetl() {
        return metl;
    }

    /**
     * Sets the value of the metl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMetal2Choice }
     *     
     */
    public AssetClassCommodity7Choice setMetl(AssetClassCommodityMetal2Choice value) {
        this.metl = value;
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
    public AssetClassCommodity7Choice setMultiCmmdtyExtc(AssetClassCommodityMultiCommodityExotic1 value) {
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
    public AssetClassCommodity7Choice setOffclEcnmcSttstcs(AssetClassCommodityOfficialEconomicStatistics1 value) {
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
    public AssetClassCommodity7Choice setOthr(AssetClassCommodityOther1 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the othrC10 property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityC10Other1 }
     *     
     */
    public AssetClassCommodityC10Other1 getOthrC10() {
        return othrC10;
    }

    /**
     * Sets the value of the othrC10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityC10Other1 }
     *     
     */
    public AssetClassCommodity7Choice setOthrC10(AssetClassCommodityC10Other1 value) {
        this.othrC10 = value;
        return this;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper5Choice }
     *     
     */
    public AssetClassCommodityPaper5Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper5Choice }
     *     
     */
    public AssetClassCommodity7Choice setPpr(AssetClassCommodityPaper5Choice value) {
        this.ppr = value;
        return this;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene4Choice }
     *     
     */
    public AssetClassCommodityPolypropylene4Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene4Choice }
     *     
     */
    public AssetClassCommodity7Choice setPlprpln(AssetClassCommodityPolypropylene4Choice value) {
        this.plprpln = value;
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
