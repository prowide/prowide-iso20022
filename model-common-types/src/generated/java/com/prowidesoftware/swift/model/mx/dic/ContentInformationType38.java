
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
 * General cryptographic message syntax (CMS) containing data. protected by a MAC or a digital signature.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType38", propOrder = {
    "cnttTp",
    "authntcdData",
    "sgndData"
})
public class ContentInformationType38 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData10 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData9 sgndData;

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
    public ContentInformationType38 setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData10 }
     *     
     */
    public AuthenticatedData10 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData10 }
     *     
     */
    public ContentInformationType38 setAuthntcdData(AuthenticatedData10 value) {
        this.authntcdData = value;
        return this;
    }

    /**
     * Gets the value of the sgndData property.
     * 
     * @return
     *     possible object is
     *     {@link SignedData9 }
     *     
     */
    public SignedData9 getSgndData() {
        return sgndData;
    }

    /**
     * Sets the value of the sgndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData9 }
     *     
     */
    public ContentInformationType38 setSgndData(SignedData9 value) {
        this.sgndData = value;
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
