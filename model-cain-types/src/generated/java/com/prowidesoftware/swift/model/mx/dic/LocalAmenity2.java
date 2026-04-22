
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains additional information about the fuel location, such as hours of operation and Interstate Access/Exit Number, etc.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalAmenity2", propOrder = {
    "tp",
    "avlblInd"
})
public class LocalAmenity2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected LocationAmenity2Code tp;
    @XmlElement(name = "AvlblInd")
    protected Boolean avlblInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LocationAmenity2Code }
     *     
     */
    public LocationAmenity2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationAmenity2Code }
     *     
     */
    public LocalAmenity2 setTp(LocationAmenity2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the avlblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvlblInd() {
        return avlblInd;
    }

    /**
     * Sets the value of the avlblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LocalAmenity2 setAvlblInd(Boolean value) {
        this.avlblInd = value;
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
