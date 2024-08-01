
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
@XmlType(name = "AssetClassCommodityMetal2Choice", propOrder = {
    "nonPrcs",
    "prcs"
})
public class AssetClassCommodityMetal2Choice {

    @XmlElement(name = "NonPrcs")
    protected MetalCommodityNonPrecious2 nonPrcs;
    @XmlElement(name = "Prcs")
    protected MetalCommodityPrecious2 prcs;

    /**
     * Gets the value of the nonPrcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityNonPrecious2 }
     *     
     */
    public MetalCommodityNonPrecious2 getNonPrcs() {
        return nonPrcs;
    }

    /**
     * Sets the value of the nonPrcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityNonPrecious2 }
     *     
     */
    public AssetClassCommodityMetal2Choice setNonPrcs(MetalCommodityNonPrecious2 value) {
        this.nonPrcs = value;
        return this;
    }

    /**
     * Gets the value of the prcs property.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityPrecious2 }
     *     
     */
    public MetalCommodityPrecious2 getPrcs() {
        return prcs;
    }

    /**
     * Sets the value of the prcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityPrecious2 }
     *     
     */
    public AssetClassCommodityMetal2Choice setPrcs(MetalCommodityPrecious2 value) {
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
