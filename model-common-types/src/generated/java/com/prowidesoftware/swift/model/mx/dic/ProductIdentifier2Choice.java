
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
 * Identifies a product in coded form or free text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifier2Choice", propOrder = {
    "strdPdctIdr",
    "othrPdctIdr"
})
public class ProductIdentifier2Choice {

    @XmlElement(name = "StrdPdctIdr")
    protected ProductIdentifier2 strdPdctIdr;
    @XmlElement(name = "OthrPdctIdr")
    protected GenericIdentification4 othrPdctIdr;

    /**
     * Gets the value of the strdPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier2 }
     *     
     */
    public ProductIdentifier2 getStrdPdctIdr() {
        return strdPdctIdr;
    }

    /**
     * Sets the value of the strdPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier2 }
     *     
     */
    public ProductIdentifier2Choice setStrdPdctIdr(ProductIdentifier2 value) {
        this.strdPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the othrPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification4 }
     *     
     */
    public GenericIdentification4 getOthrPdctIdr() {
        return othrPdctIdr;
    }

    /**
     * Sets the value of the othrPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification4 }
     *     
     */
    public ProductIdentifier2Choice setOthrPdctIdr(GenericIdentification4 value) {
        this.othrPdctIdr = value;
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
