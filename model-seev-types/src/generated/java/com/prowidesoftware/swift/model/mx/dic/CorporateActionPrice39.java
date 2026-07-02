
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
 * Specifies prices.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice39", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice39 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat5Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice2Choice indctvOrMktPric;
    @XmlElement(name = "CshValForTax")
    protected AmountPrice2 cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat6Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat7Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice39 setCshInLieuOfShrPric(PriceFormat5Choice value) {
        this.cshInLieuOfShrPric = value;
        return this;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public IndicativeOrMarketPrice2Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public CorporateActionPrice39 setIndctvOrMktPric(IndicativeOrMarketPrice2Choice value) {
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
    public CorporateActionPrice39 setCshValForTax(AmountPrice2 value) {
        this.cshValForTax = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat6Choice }
     *     
     */
    public PriceFormat6Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat6Choice }
     *     
     */
    public CorporateActionPrice39 setGncCshPricPdPerPdct(PriceFormat6Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat7Choice }
     *     
     */
    public PriceFormat7Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat7Choice }
     *     
     */
    public CorporateActionPrice39 setGncCshPricRcvdPerPdct(PriceFormat7Choice value) {
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
