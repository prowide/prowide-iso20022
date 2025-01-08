
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines commodity sub-product attributes of a freight derivative of type dry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreightCommodityDry3", propOrder = {
    "basePdct",
    "subPdct",
    "addtlSubPdct"
})
public class FreightCommodityDry3 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType4Code basePdct;
    @XmlElement(name = "SubPdct")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType31Code subPdct;
    @XmlElement(name = "AddtlSubPdct")
    @XmlSchemaType(name = "string")
    protected AssetClassDetailedSubProductType33Code addtlSubPdct;

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType4Code }
     *     
     */
    public AssetClassProductType4Code getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType4Code }
     *     
     */
    public FreightCommodityDry3 setBasePdct(AssetClassProductType4Code value) {
        this.basePdct = value;
        return this;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType31Code }
     *     
     */
    public AssetClassSubProductType31Code getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType31Code }
     *     
     */
    public FreightCommodityDry3 setSubPdct(AssetClassSubProductType31Code value) {
        this.subPdct = value;
        return this;
    }

    /**
     * Gets the value of the addtlSubPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassDetailedSubProductType33Code }
     *     
     */
    public AssetClassDetailedSubProductType33Code getAddtlSubPdct() {
        return addtlSubPdct;
    }

    /**
     * Sets the value of the addtlSubPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassDetailedSubProductType33Code }
     *     
     */
    public FreightCommodityDry3 setAddtlSubPdct(AssetClassDetailedSubProductType33Code value) {
        this.addtlSubPdct = value;
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
