
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
 * General cryptographic message syntax (CMS) containing authenticated data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType15", propOrder = {
    "cnttTp",
    "authntcdData"
})
public class ContentInformationType15 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "AuthntcdData", required = true)
    protected AuthenticatedData4 authntcdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentInformationType15 setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData4 }
     *     
     */
    public AuthenticatedData4 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData4 }
     *     
     */
    public ContentInformationType15 setAuthntcdData(AuthenticatedData4 value) {
        this.authntcdData = value;
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
