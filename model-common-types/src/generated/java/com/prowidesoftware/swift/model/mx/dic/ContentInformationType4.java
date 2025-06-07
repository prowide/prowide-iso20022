
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
@XmlType(name = "ContentInformationType4", propOrder = {
    "cnttTp",
    "envlpdData",
    "authntcdData",
    "sgndData",
    "dgstdData",
    "nmdKeyNcrptdData"
})
public class ContentInformationType4 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType1Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData2 envlpdData;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData2 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData2 sgndData;
    @XmlElement(name = "DgstdData")
    protected DigestedData2 dgstdData;
    @XmlElement(name = "NmdKeyNcrptdData")
    protected NamedKeyEncryptedData2 nmdKeyNcrptdData;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType1Code }
     *     
     */
    public ContentType1Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType1Code }
     *     
     */
    public ContentInformationType4 setCnttTp(ContentType1Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData2 }
     *     
     */
    public EnvelopedData2 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData2 }
     *     
     */
    public ContentInformationType4 setEnvlpdData(EnvelopedData2 value) {
        this.envlpdData = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData2 }
     *     
     */
    public AuthenticatedData2 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData2 }
     *     
     */
    public ContentInformationType4 setAuthntcdData(AuthenticatedData2 value) {
        this.authntcdData = value;
        return this;
    }

    /**
     * Gets the value of the sgndData property.
     * 
     * @return
     *     possible object is
     *     {@link SignedData2 }
     *     
     */
    public SignedData2 getSgndData() {
        return sgndData;
    }

    /**
     * Sets the value of the sgndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData2 }
     *     
     */
    public ContentInformationType4 setSgndData(SignedData2 value) {
        this.sgndData = value;
        return this;
    }

    /**
     * Gets the value of the dgstdData property.
     * 
     * @return
     *     possible object is
     *     {@link DigestedData2 }
     *     
     */
    public DigestedData2 getDgstdData() {
        return dgstdData;
    }

    /**
     * Sets the value of the dgstdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestedData2 }
     *     
     */
    public ContentInformationType4 setDgstdData(DigestedData2 value) {
        this.dgstdData = value;
        return this;
    }

    /**
     * Gets the value of the nmdKeyNcrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link NamedKeyEncryptedData2 }
     *     
     */
    public NamedKeyEncryptedData2 getNmdKeyNcrptdData() {
        return nmdKeyNcrptdData;
    }

    /**
     * Sets the value of the nmdKeyNcrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedKeyEncryptedData2 }
     *     
     */
    public ContentInformationType4 setNmdKeyNcrptdData(NamedKeyEncryptedData2 value) {
        this.nmdKeyNcrptdData = value;
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
