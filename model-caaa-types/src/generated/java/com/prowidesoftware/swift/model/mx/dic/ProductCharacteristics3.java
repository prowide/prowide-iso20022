
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
 * Product characteristic applicable to this trade product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristics3", propOrder = {
    "chrtc",
    "valMeasr"
})
public class ProductCharacteristics3 {

    @XmlElement(name = "Chrtc")
    protected ProductCharacteristics1Choice chrtc;
    @XmlElement(name = "ValMeasr")
    protected Quantity10 valMeasr;

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
    public ProductCharacteristics3 setChrtc(ProductCharacteristics1Choice value) {
        this.chrtc = value;
        return this;
    }

    /**
     * Gets the value of the valMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity10 }
     *     
     */
    public Quantity10 getValMeasr() {
        return valMeasr;
    }

    /**
     * Sets the value of the valMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity10 }
     *     
     */
    public ProductCharacteristics3 setValMeasr(Quantity10 value) {
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
