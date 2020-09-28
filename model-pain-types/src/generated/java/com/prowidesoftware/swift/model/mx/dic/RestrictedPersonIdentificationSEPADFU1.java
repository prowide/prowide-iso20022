
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
 * RestrictedPersonIdentificationSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedPersonIdentificationSEPA_DFU1", propOrder = {
    "id",
    "schmeNm"
})
public class RestrictedPersonIdentificationSEPADFU1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SchmeNm", required = true)
    protected RestrictedPersonIdentificationSchemeNameSEPADFU1 schmeNm;

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
    public RestrictedPersonIdentificationSEPADFU1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedPersonIdentificationSchemeNameSEPADFU1 }
     *     
     */
    public RestrictedPersonIdentificationSchemeNameSEPADFU1 getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedPersonIdentificationSchemeNameSEPADFU1 }
     *     
     */
    public RestrictedPersonIdentificationSEPADFU1 setSchmeNm(RestrictedPersonIdentificationSchemeNameSEPADFU1 value) {
        this.schmeNm = value;
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
