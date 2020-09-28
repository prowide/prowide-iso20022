
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
 * RestrictedFinancialIdentificationSEPA_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedFinancialIdentificationSEPA_DFU1", propOrder = {
    "id"
})
public class RestrictedFinancialIdentificationSEPADFU1 {

    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "string")
    protected RestrictedSMNDACodeDFU1 id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedSMNDACodeDFU1 }
     *     
     */
    public RestrictedSMNDACodeDFU1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedSMNDACodeDFU1 }
     *     
     */
    public RestrictedFinancialIdentificationSEPADFU1 setId(RestrictedSMNDACodeDFU1 value) {
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
