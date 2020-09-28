
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
 * Defines commodity attributes of a derivative where the type is polypropylene.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPolypropylene1Choice", propOrder = {
    "plstc"
})
public class AssetClassCommodityPolypropylene1Choice {

    @XmlElement(name = "Plstc")
    protected PolypropyleneCommodityPlastic1 plstc;

    /**
     * Gets the value of the plstc property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityPlastic1 }
     *     
     */
    public PolypropyleneCommodityPlastic1 getPlstc() {
        return plstc;
    }

    /**
     * Sets the value of the plstc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityPlastic1 }
     *     
     */
    public AssetClassCommodityPolypropylene1Choice setPlstc(PolypropyleneCommodityPlastic1 value) {
        this.plstc = value;
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
