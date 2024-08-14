
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
 * Identification of the cardholder involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderIdentification1", propOrder = {
    "crdhldrIdVal",
    "crdhldrIdTp"
})
public class CardholderIdentification1 {

    @XmlElement(name = "CrdhldrIdVal", required = true)
    protected String crdhldrIdVal;
    @XmlElement(name = "CrdhldrIdTp", required = true)
    @XmlSchemaType(name = "string")
    protected PersonIdentificationType4Code crdhldrIdTp;

    /**
     * Gets the value of the crdhldrIdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrIdVal() {
        return crdhldrIdVal;
    }

    /**
     * Sets the value of the crdhldrIdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardholderIdentification1 setCrdhldrIdVal(String value) {
        this.crdhldrIdVal = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationType4Code }
     *     
     */
    public PersonIdentificationType4Code getCrdhldrIdTp() {
        return crdhldrIdTp;
    }

    /**
     * Sets the value of the crdhldrIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationType4Code }
     *     
     */
    public CardholderIdentification1 setCrdhldrIdTp(PersonIdentificationType4Code value) {
        this.crdhldrIdTp = value;
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
