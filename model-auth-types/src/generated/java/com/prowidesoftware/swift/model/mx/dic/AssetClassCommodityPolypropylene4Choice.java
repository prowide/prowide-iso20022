
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AssetClassCommodityPolypropylene4Choice", propOrder = {
    "plstc",
    "othr"
})
public class AssetClassCommodityPolypropylene4Choice {

    @XmlElement(name = "Plstc")
    protected PolypropyleneCommodityPlastic2 plstc;
    @XmlElement(name = "Othr")
    protected PolypropyleneCommodityOther2 othr;

    /**
     * Gets the value of the plstc property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityPlastic2 }
     *     
     */
    public PolypropyleneCommodityPlastic2 getPlstc() {
        return plstc;
    }

    /**
     * Sets the value of the plstc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityPlastic2 }
     *     
     */
    public AssetClassCommodityPolypropylene4Choice setPlstc(PolypropyleneCommodityPlastic2 value) {
        this.plstc = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityOther2 }
     *     
     */
    public PolypropyleneCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityOther2 }
     *     
     */
    public AssetClassCommodityPolypropylene4Choice setOthr(PolypropyleneCommodityOther2 value) {
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
