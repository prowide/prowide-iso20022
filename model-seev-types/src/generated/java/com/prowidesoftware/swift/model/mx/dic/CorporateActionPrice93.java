
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
@XmlType(name = "CorporateActionPrice93", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice93 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat85Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice16Choice indctvOrMktPric;
    @XmlElement(name = "CshValForTax")
    protected AmountPrice4 cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat86Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat87Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat85Choice }
     *     
     */
    public PriceFormat85Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat85Choice }
     *     
     */
    public CorporateActionPrice93 setCshInLieuOfShrPric(PriceFormat85Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice16Choice }
     *     
     */
    public IndicativeOrMarketPrice16Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice16Choice }
     *     
     */
    public CorporateActionPrice93 setIndctvOrMktPric(IndicativeOrMarketPrice16Choice value) {
        this.indctvOrMktPric = value;
        return this;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice4 }
     *     
     */
    public AmountPrice4 getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice4 }
     *     
     */
    public CorporateActionPrice93 setCshValForTax(AmountPrice4 value) {
        this.cshValForTax = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat86Choice }
     *     
     */
    public PriceFormat86Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat86Choice }
     *     
     */
    public CorporateActionPrice93 setGncCshPricPdPerPdct(PriceFormat86Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat87Choice }
     *     
     */
    public PriceFormat87Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat87Choice }
     *     
     */
    public CorporateActionPrice93 setGncCshPricRcvdPerPdct(PriceFormat87Choice value) {
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
