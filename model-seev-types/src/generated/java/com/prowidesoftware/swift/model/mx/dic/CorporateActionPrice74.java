
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
 * Specifies various prices of a corporate action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice74", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice74 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat50Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice8Choice indctvOrMktPric;
    @XmlElement(name = "CshValForTax")
    protected AmountPrice2 cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat51Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat64Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public CorporateActionPrice74 setCshInLieuOfShrPric(PriceFormat50Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice8Choice }
     *     
     */
    public IndicativeOrMarketPrice8Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice8Choice }
     *     
     */
    public CorporateActionPrice74 setIndctvOrMktPric(IndicativeOrMarketPrice8Choice value) {
        this.indctvOrMktPric = value;
        return this;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice2 }
     *     
     */
    public AmountPrice2 getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice2 }
     *     
     */
    public CorporateActionPrice74 setCshValForTax(AmountPrice2 value) {
        this.cshValForTax = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat51Choice }
     *     
     */
    public PriceFormat51Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat51Choice }
     *     
     */
    public CorporateActionPrice74 setGncCshPricPdPerPdct(PriceFormat51Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat64Choice }
     *     
     */
    public PriceFormat64Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat64Choice }
     *     
     */
    public CorporateActionPrice74 setGncCshPricRcvdPerPdct(PriceFormat64Choice value) {
        this.gncCshPricRcvdPerPdct = value;
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
