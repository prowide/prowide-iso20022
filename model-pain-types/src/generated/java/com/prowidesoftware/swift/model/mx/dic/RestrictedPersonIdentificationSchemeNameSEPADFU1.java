
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
 * RestrictedPersonIdentificationSchemeNameSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedPersonIdentificationSchemeNameSEPA_DFU1", propOrder = {
    "prtry"
})
public class RestrictedPersonIdentificationSchemeNameSEPADFU1 {

    @XmlElement(name = "Prtry", required = true)
    @XmlSchemaType(name = "string")
    protected IdentificationSchemeNameSEPADFU1 prtry;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationSchemeNameSEPADFU1 }
     *     
     */
    public IdentificationSchemeNameSEPADFU1 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationSchemeNameSEPADFU1 }
     *     
     */
    public RestrictedPersonIdentificationSchemeNameSEPADFU1 setPrtry(IdentificationSchemeNameSEPADFU1 value) {
        this.prtry = value;
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
