
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
 * Place identification of the place of safekeeping expressed as a code and a BIC.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceTypeAndAnyBICIdentifier4", propOrder = {
    "sfkpgPlcTp",
    "id"
})
public class SafekeepingPlaceTypeAndAnyBICIdentifier4 {

    @XmlElement(name = "SfkpgPlcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace1Code sfkpgPlcTp;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the sfkpgPlcTp property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlace1Code getSfkpgPlcTp() {
        return sfkpgPlcTp;
    }

    /**
     * Sets the value of the sfkpgPlcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier4 setSfkpgPlcTp(SafekeepingPlace1Code value) {
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
    public SafekeepingPlaceTypeAndAnyBICIdentifier4 setId(String value) {
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
