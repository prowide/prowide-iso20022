
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
 * Defines commodity attributes of a derivative where the type is industrial product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityIndustrialProduct1Choice", propOrder = {
    "cnstrctn",
    "manfctg"
})
public class AssetClassCommodityIndustrialProduct1Choice {

    @XmlElement(name = "Cnstrctn")
    protected IndustrialProductCommodityConstruction1 cnstrctn;
    @XmlElement(name = "Manfctg")
    protected IndustrialProductCommodityManufacturing1 manfctg;

    /**
     * Gets the value of the cnstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityConstruction1 }
     *     
     */
    public IndustrialProductCommodityConstruction1 getCnstrctn() {
        return cnstrctn;
    }

    /**
     * Sets the value of the cnstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityConstruction1 }
     *     
     */
    public AssetClassCommodityIndustrialProduct1Choice setCnstrctn(IndustrialProductCommodityConstruction1 value) {
        this.cnstrctn = value;
        return this;
    }

    /**
     * Gets the value of the manfctg property.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityManufacturing1 }
     *     
     */
    public IndustrialProductCommodityManufacturing1 getManfctg() {
        return manfctg;
    }

    /**
     * Sets the value of the manfctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityManufacturing1 }
     *     
     */
    public AssetClassCommodityIndustrialProduct1Choice setManfctg(IndustrialProductCommodityManufacturing1 value) {
        this.manfctg = value;
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
