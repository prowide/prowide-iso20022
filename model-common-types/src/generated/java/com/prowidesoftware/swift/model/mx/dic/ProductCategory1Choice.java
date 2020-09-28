
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
 * Specifies that the category of a product may be indicated by a code or by free text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCategory1Choice", propOrder = {
    "strdPdctCtgy",
    "othrPdctCtgy"
})
public class ProductCategory1Choice {

    @XmlElement(name = "StrdPdctCtgy")
    protected ProductCategory1 strdPdctCtgy;
    @XmlElement(name = "OthrPdctCtgy")
    protected GenericIdentification4 othrPdctCtgy;

    /**
     * Gets the value of the strdPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory1 }
     *     
     */
    public ProductCategory1 getStrdPdctCtgy() {
        return strdPdctCtgy;
    }

    /**
     * Sets the value of the strdPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory1 }
     *     
     */
    public ProductCategory1Choice setStrdPdctCtgy(ProductCategory1 value) {
        this.strdPdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the othrPdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getOthrPdctCtgy() {
        return othrPdctCtgy;
    }

    /**
     * Sets the value of the othrPdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public ProductCategory1Choice setOthrPdctCtgy(GenericIdentification4 value) {
        this.othrPdctCtgy = value;
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
