
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
 * Provides information about the prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDetails24", propOrder = {
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class PriceDetails24 {

    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat55Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat56Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat55Choice }
     *     
     */
    public PriceFormat55Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat55Choice }
     *     
     */
    public PriceDetails24 setGncCshPricPdPerPdct(PriceFormat55Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat56Choice }
     *     
     */
    public PriceFormat56Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat56Choice }
     *     
     */
    public PriceDetails24 setGncCshPricRcvdPerPdct(PriceFormat56Choice value) {
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
