
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
 * Content of the Print Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePrintResponse1", propOrder = {
    "docQlfr"
})
public class DevicePrintResponse1 {

    @XmlElement(name = "DocQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType7Code docQlfr;

    /**
     * Gets the value of the docQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType7Code }
     *     
     */
    public DocumentType7Code getDocQlfr() {
        return docQlfr;
    }

    /**
     * Sets the value of the docQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType7Code }
     *     
     */
    public DevicePrintResponse1 setDocQlfr(DocumentType7Code value) {
        this.docQlfr = value;
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
