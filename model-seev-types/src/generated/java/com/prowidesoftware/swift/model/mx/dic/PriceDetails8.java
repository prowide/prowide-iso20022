
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
@XmlType(name = "PriceDetails8", propOrder = {
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class PriceDetails8 {

    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat27Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat26Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat27Choice }
     *     
     */
    public PriceFormat27Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat27Choice }
     *     
     */
    public PriceDetails8 setGncCshPricPdPerPdct(PriceFormat27Choice value) {
        this.gncCshPricPdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat26Choice }
     *     
     */
    public PriceFormat26Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat26Choice }
     *     
     */
    public PriceDetails8 setGncCshPricRcvdPerPdct(PriceFormat26Choice value) {
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
