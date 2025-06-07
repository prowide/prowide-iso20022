
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
 * General cryptographic message syntax (CMS) containing protected data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType30", propOrder = {
    "cnttTp",
    "envlpdData",
    "authntcdData",
    "sgndData",
    "dgstdData"
})
public class ContentInformationType30 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData9 envlpdData;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData8 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData7 sgndData;
    @XmlElement(name = "DgstdData")
    protected DigestedData5 dgstdData;

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
    public ContentInformationType30 setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData9 }
     *     
     */
    public EnvelopedData9 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData9 }
     *     
     */
    public ContentInformationType30 setEnvlpdData(EnvelopedData9 value) {
        this.envlpdData = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData8 }
     *     
     */
    public AuthenticatedData8 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData8 }
     *     
     */
    public ContentInformationType30 setAuthntcdData(AuthenticatedData8 value) {
        this.authntcdData = value;
        return this;
    }

    /**
     * Gets the value of the sgndData property.
     * 
     * @return
     *     possible object is
     *     {@link SignedData7 }
     *     
     */
    public SignedData7 getSgndData() {
        return sgndData;
    }

    /**
     * Sets the value of the sgndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData7 }
     *     
     */
    public ContentInformationType30 setSgndData(SignedData7 value) {
        this.sgndData = value;
        return this;
    }

    /**
     * Gets the value of the dgstdData property.
     * 
     * @return
     *     possible object is
     *     {@link DigestedData5 }
     *     
     */
    public DigestedData5 getDgstdData() {
        return dgstdData;
    }

    /**
     * Sets the value of the dgstdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestedData5 }
     *     
     */
    public ContentInformationType30 setDgstdData(DigestedData5 value) {
        this.dgstdData = value;
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
