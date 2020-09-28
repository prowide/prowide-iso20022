
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
 * Product characteristic applicable to this trade product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristics4", propOrder = {
    "chrtc",
    "valMeasr"
})
public class ProductCharacteristics4 {

    @XmlElement(name = "Chrtc")
    protected ProductCharacteristics1Choice chrtc;
    @XmlElement(name = "ValMeasr")
    protected Quantity16 valMeasr;

    /**
     * Gets the value of the chrtc property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristics1Choice }
     *     
     */
    public ProductCharacteristics1Choice getChrtc() {
        return chrtc;
    }

    /**
     * Sets the value of the chrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristics1Choice }
     *     
     */
    public ProductCharacteristics4 setChrtc(ProductCharacteristics1Choice value) {
        this.chrtc = value;
        return this;
    }

    /**
     * Gets the value of the valMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getValMeasr() {
        return valMeasr;
    }

    /**
     * Sets the value of the valMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public ProductCharacteristics4 setValMeasr(Quantity16 value) {
        this.valMeasr = value;
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
