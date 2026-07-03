
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
@XmlType(name = "AssetClassCommodityPolypropylene3Choice", propOrder = {
    "plstc",
    "othr"
})
public class AssetClassCommodityPolypropylene3Choice {

    @XmlElement(name = "Plstc")
    protected PolypropyleneCommodityPlastic1 plstc;
    @XmlElement(name = "Othr")
    protected PolypropyleneCommodityOther1 othr;

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
    public AssetClassCommodityPolypropylene3Choice setPlstc(PolypropyleneCommodityPlastic1 value) {
        this.plstc = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityOther1 }
     *     
     */
    public PolypropyleneCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityOther1 }
     *     
     */
    public AssetClassCommodityPolypropylene3Choice setOthr(PolypropyleneCommodityOther1 value) {
        this.othr = value;
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
