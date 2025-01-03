
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
 * Identification of the place of safekeeping expressed as a code and a narrative description.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceTypeAndText5", propOrder = {
    "sfkpgPlcTp",
    "id"
})
public class SafekeepingPlaceTypeAndText5 {

    @XmlElement(name = "SfkpgPlcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace2Code sfkpgPlcTp;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the sfkpgPlcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace2Code }
     *     
     */
    public SafekeepingPlace2Code getSfkpgPlcTp() {
        return sfkpgPlcTp;
    }

    /**
     * Sets the value of the sfkpgPlcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace2Code }
     *     
     */
    public SafekeepingPlaceTypeAndText5 setSfkpgPlcTp(SafekeepingPlace2Code value) {
        this.sfkpgPlcTp = value;
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
    public SafekeepingPlaceTypeAndText5 setId(String value) {
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
