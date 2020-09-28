
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
@XmlType(name = "ContentInformationType1", propOrder = {
    "cnttTp",
    "envlpdData",
    "authntcdData",
    "sgndData",
    "dgstdData",
    "nmdKeyNcrptdData"
})
public class ContentInformationType1 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType1Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData1 envlpdData;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData1 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData1 sgndData;
    @XmlElement(name = "DgstdData")
    protected DigestedData1 dgstdData;
    @XmlElement(name = "NmdKeyNcrptdData")
    protected NamedKeyEncryptedData1 nmdKeyNcrptdData;

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
    public ContentInformationType1 setCnttTp(ContentType1Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the envlpdData property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData1 }
     *     
     */
    public EnvelopedData1 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Sets the value of the envlpdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData1 }
     *     
     */
    public ContentInformationType1 setEnvlpdData(EnvelopedData1 value) {
        this.envlpdData = value;
        return this;
    }

    /**
     * Gets the value of the authntcdData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData1 }
     *     
     */
    public AuthenticatedData1 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Sets the value of the authntcdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData1 }
     *     
     */
    public ContentInformationType1 setAuthntcdData(AuthenticatedData1 value) {
        this.authntcdData = value;
        return this;
    }

    /**
     * Gets the value of the sgndData property.
     * 
     * @return
     *     possible object is
     *     {@link SignedData1 }
     *     
     */
    public SignedData1 getSgndData() {
        return sgndData;
    }

    /**
     * Sets the value of the sgndData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData1 }
     *     
     */
    public ContentInformationType1 setSgndData(SignedData1 value) {
        this.sgndData = value;
        return this;
    }

    /**
     * Gets the value of the dgstdData property.
     * 
     * @return
     *     possible object is
     *     {@link DigestedData1 }
     *     
     */
    public DigestedData1 getDgstdData() {
        return dgstdData;
    }

    /**
     * Sets the value of the dgstdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestedData1 }
     *     
     */
    public ContentInformationType1 setDgstdData(DigestedData1 value) {
        this.dgstdData = value;
        return this;
    }

    /**
     * Gets the value of the nmdKeyNcrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link NamedKeyEncryptedData1 }
     *     
     */
    public NamedKeyEncryptedData1 getNmdKeyNcrptdData() {
        return nmdKeyNcrptdData;
    }

    /**
     * Sets the value of the nmdKeyNcrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedKeyEncryptedData1 }
     *     
     */
    public ContentInformationType1 setNmdKeyNcrptdData(NamedKeyEncryptedData1 value) {
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
