
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
 * Identifies the implementation specification to which the ISO 20022 message conforms.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplementationSpecification1", propOrder = {
    "regy",
    "id"
})
public class ImplementationSpecification1 {

    @XmlElement(name = "Regy", required = true)
    protected String regy;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the regy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegy() {
        return regy;
    }

    /**
     * Sets the value of the regy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ImplementationSpecification1 setRegy(String value) {
        this.regy = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ImplementationSpecification1 setId(String value) {
        this.id = value;
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
