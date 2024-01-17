
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
 * Specifies that the category of a product may be indicated by a code or by free text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristics1Choice", propOrder = {
    "strdPdctChrtcs",
    "othrPdctChrtcs"
})
public class ProductCharacteristics1Choice {

    @XmlElement(name = "StrdPdctChrtcs")
    protected ProductCharacteristics1 strdPdctChrtcs;
    @XmlElement(name = "OthrPdctChrtcs")
    protected GenericIdentification4 othrPdctChrtcs;

    /**
     * Gets the value of the strdPdctChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristics1 }
     *     
     */
    public ProductCharacteristics1 getStrdPdctChrtcs() {
        return strdPdctChrtcs;
    }

    /**
     * Sets the value of the strdPdctChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristics1 }
     *     
     */
    public ProductCharacteristics1Choice setStrdPdctChrtcs(ProductCharacteristics1 value) {
        this.strdPdctChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the othrPdctChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getOthrPdctChrtcs() {
        return othrPdctChrtcs;
    }

    /**
     * Sets the value of the othrPdctChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public ProductCharacteristics1Choice setOthrPdctChrtcs(GenericIdentification4 value) {
        this.othrPdctChrtcs = value;
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
