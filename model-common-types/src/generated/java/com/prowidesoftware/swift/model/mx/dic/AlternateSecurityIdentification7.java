
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
 * Proprietary or domestic identification scheme that uniquely identifies a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateSecurityIdentification7", propOrder = {
    "id",
    "idSrc"
})
public class AlternateSecurityIdentification7 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IdSrc", required = true)
    protected IdentificationSource1Choice idSrc;

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
    public AlternateSecurityIdentification7 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the idSrc property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public IdentificationSource1Choice getIdSrc() {
        return idSrc;
    }

    /**
     * Sets the value of the idSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public AlternateSecurityIdentification7 setIdSrc(IdentificationSource1Choice value) {
        this.idSrc = value;
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
