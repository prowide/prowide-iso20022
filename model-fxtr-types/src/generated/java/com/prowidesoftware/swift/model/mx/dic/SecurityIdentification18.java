
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
 * Identification of a security by its symbol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification18", propOrder = {
    "sctyIdSrc",
    "sctyId"
})
public class SecurityIdentification18 {

    @XmlElement(name = "SctyIdSrc", required = true)
    @XmlSchemaType(name = "string")
    protected IdentificationType2Code sctyIdSrc;
    @XmlElement(name = "SctyId", required = true)
    protected String sctyId;

    /**
     * Gets the value of the sctyIdSrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType2Code }
     *     
     */
    public IdentificationType2Code getSctyIdSrc() {
        return sctyIdSrc;
    }

    /**
     * Sets the value of the sctyIdSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType2Code }
     *     
     */
    public SecurityIdentification18 setSctyIdSrc(IdentificationType2Code value) {
        this.sctyIdSrc = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification18 setSctyId(String value) {
        this.sctyId = value;
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
