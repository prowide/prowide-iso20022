
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
 * Identifies a product in coded form or as an identifier.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentifier3Choice", propOrder = {
    "undrlygPdctIdr",
    "unqPdctIdr"
})
public class ProductIdentifier3Choice {

    @XmlElement(name = "UndrlygPdctIdr")
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctIdr;
    @XmlElement(name = "UnqPdctIdr")
    protected String unqPdctIdr;

    /**
     * Gets the value of the undrlygPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctIdr() {
        return undrlygPdctIdr;
    }

    /**
     * Sets the value of the undrlygPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public ProductIdentifier3Choice setUndrlygPdctIdr(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ProductIdentifier3Choice setUnqPdctIdr(String value) {
        this.unqPdctIdr = value;
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
