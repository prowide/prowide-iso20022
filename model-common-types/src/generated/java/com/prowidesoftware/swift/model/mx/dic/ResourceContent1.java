
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
 * Features of a media resource.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceContent1", propOrder = {
    "rsrcTp",
    "rsrcFrmt",
    "lang",
    "rsrcRef"
})
public class ResourceContent1 {

    @XmlElement(name = "RsrcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ResourceType1Code rsrcTp;
    @XmlElement(name = "RsrcFrmt")
    @XmlSchemaType(name = "string")
    protected SoundFormat1Code rsrcFrmt;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "RsrcRef")
    protected String rsrcRef;

    /**
     * Gets the value of the rsrcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType1Code }
     *     
     */
    public ResourceType1Code getRsrcTp() {
        return rsrcTp;
    }

    /**
     * Sets the value of the rsrcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType1Code }
     *     
     */
    public ResourceContent1 setRsrcTp(ResourceType1Code value) {
        this.rsrcTp = value;
        return this;
    }

    /**
     * Gets the value of the rsrcFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SoundFormat1Code }
     *     
     */
    public SoundFormat1Code getRsrcFrmt() {
        return rsrcFrmt;
    }

    /**
     * Sets the value of the rsrcFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoundFormat1Code }
     *     
     */
    public ResourceContent1 setRsrcFrmt(SoundFormat1Code value) {
        this.rsrcFrmt = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResourceContent1 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the rsrcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsrcRef() {
        return rsrcRef;
    }

    /**
     * Sets the value of the rsrcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResourceContent1 setRsrcRef(String value) {
        this.rsrcRef = value;
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
