
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
 * Defines commodity attributes of a derivative where the type is other C10.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityC10Other1", propOrder = {
    "basePdct"
})
public class AssetClassCommodityC10Other1 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType11Code basePdct;

    /**
     * Gets the value of the basePdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType11Code }
     *     
     */
    public AssetClassProductType11Code getBasePdct() {
        return basePdct;
    }

    /**
     * Sets the value of the basePdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType11Code }
     *     
     */
    public AssetClassCommodityC10Other1 setBasePdct(AssetClassProductType11Code value) {
        this.basePdct = value;
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
