
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
 * Defines commodity attributes of a derivative where the type is metal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityMetal1Choice", propOrder = {
    "nonPrcs",
    "prcs"
})
public class AssetClassCommodityMetal1Choice {

    @XmlElement(name = "NonPrcs")
    protected MetalCommodityNonPrecious1 nonPrcs;
    @XmlElement(name = "Prcs")
    protected MetalCommodityPrecious1 prcs;

    /**
     * Gets the value of the nonPrcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityNonPrecious1 }
     *     
     */
    public MetalCommodityNonPrecious1 getNonPrcs() {
        return nonPrcs;
    }

    /**
     * Sets the value of the nonPrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityNonPrecious1 }
     *     
     */
    public AssetClassCommodityMetal1Choice setNonPrcs(MetalCommodityNonPrecious1 value) {
        this.nonPrcs = value;
        return this;
    }

    /**
     * Gets the value of the prcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityPrecious1 }
     *     
     */
    public MetalCommodityPrecious1 getPrcs() {
        return prcs;
    }

    /**
     * Sets the value of the prcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityPrecious1 }
     *     
     */
    public AssetClassCommodityMetal1Choice setPrcs(MetalCommodityPrecious1 value) {
        this.prcs = value;
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
