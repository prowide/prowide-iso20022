
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
 * Defines commodity attributes of a derivative where the type is other C10.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityOtherC102Choice", propOrder = {
    "dlvrbl",
    "nonDlvrbl"
})
public class AssetClassCommodityOtherC102Choice {

    @XmlElement(name = "Dlvrbl")
    protected OtherC10CommodityDeliverable2 dlvrbl;
    @XmlElement(name = "NonDlvrbl")
    protected OtherC10CommodityNonDeliverable2 nonDlvrbl;

    /**
     * Gets the value of the dlvrbl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public OtherC10CommodityDeliverable2 getDlvrbl() {
        return dlvrbl;
    }

    /**
     * Sets the value of the dlvrbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public AssetClassCommodityOtherC102Choice setDlvrbl(OtherC10CommodityDeliverable2 value) {
        this.dlvrbl = value;
        return this;
    }

    /**
     * Gets the value of the nonDlvrbl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public OtherC10CommodityNonDeliverable2 getNonDlvrbl() {
        return nonDlvrbl;
    }

    /**
     * Sets the value of the nonDlvrbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public AssetClassCommodityOtherC102Choice setNonDlvrbl(OtherC10CommodityNonDeliverable2 value) {
        this.nonDlvrbl = value;
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
