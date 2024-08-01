
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines commodity sub-product attributes of a paper derivative of type pulp.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaperCommodityPulp2", propOrder = {
    "basePdct",
    "subPdct"
})
public class PaperCommodityPulp2 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType8Code basePdct;
    @XmlElement(name = "SubPdct")
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType37Code subPdct;

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType8Code }
     *     
     */
    public AssetClassProductType8Code getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType8Code }
     *     
     */
    public PaperCommodityPulp2 setBasePdct(AssetClassProductType8Code value) {
        this.basePdct = value;
        return this;
    }

    /**
     * Gets the value of the subPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType37Code }
     *     
     */
    public AssetClassSubProductType37Code getSubPdct() {
        return subPdct;
    }

    /**
     * Sets the value of the subPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType37Code }
     *     
     */
    public PaperCommodityPulp2 setSubPdct(AssetClassSubProductType37Code value) {
        this.subPdct = value;
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
