
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
 * Provides information about the prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDetails38", propOrder = {
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct",
    "cshInLieuOfShrPric"
})
public class PriceDetails38 {

    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat73Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat72Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat74Choice cshInLieuOfShrPric;

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat73Choice }
     *     
     */
    public PriceFormat73Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat73Choice }
     *     
     */
    public PriceDetails38 setGncCshPricPdPerPdct(PriceFormat73Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat72Choice }
     *     
     */
    public PriceFormat72Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat72Choice }
     *     
     */
    public PriceDetails38 setGncCshPricRcvdPerPdct(PriceFormat72Choice value) {
        this.gncCshPricRcvdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat74Choice }
     *     
     */
    public PriceFormat74Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat74Choice }
     *     
     */
    public PriceDetails38 setCshInLieuOfShrPric(PriceFormat74Choice value) {
        this.cshInLieuOfShrPric = value;
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
